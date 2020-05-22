/*
 * (C) Copyright IBM Corp. 2020
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.ibm.fhir.term.service.provider;

import java.util.Collections;
import java.util.Set;

import com.ibm.fhir.model.resource.CodeSystem;
import com.ibm.fhir.model.resource.CodeSystem.Concept;
import com.ibm.fhir.model.resource.ValueSet;
import com.ibm.fhir.model.resource.ValueSet.Expansion.Contains;
import com.ibm.fhir.model.type.Code;
import com.ibm.fhir.model.type.Coding;
import com.ibm.fhir.model.type.code.CodeSystemHierarchyMeaning;
import com.ibm.fhir.model.type.code.ConceptSubsumptionOutcome;
import com.ibm.fhir.term.spi.FHIRTermServiceProvider;
import com.ibm.fhir.term.util.CodeSystemSupport;
import com.ibm.fhir.term.util.ValueSetSupport;

public class DefaultTermServiceProvider implements FHIRTermServiceProvider {
    @Override
    public ValueSet expand(ValueSet valueSet) {
        return ValueSetSupport.expand(valueSet);
    }

    @Override
    public Concept lookup(Coding coding) {
        String system = (coding.getSystem() != null) ? coding.getSystem().getValue() : null;
        String version = (coding.getVersion() != null) ? coding.getVersion().getValue() : null;
        String code = (coding.getCode() != null) ? coding.getCode().getValue() : null;

        if (system != null && code != null) {
            String url = (version != null) ? system + "|" + version : system;
            CodeSystem codeSystem = CodeSystemSupport.getCodeSystem(url);
            if (codeSystem != null) {
                return CodeSystemSupport.findConcept(codeSystem, Code.of(code));
            }
        }

        return null;
    }

    @Override
    public ConceptSubsumptionOutcome subsumes(Coding codingA, Coding codingB) {
        String systemA = (codingA.getSystem() != null) ? codingA.getSystem().getValue() : null;
        String versionA = (codingA.getVersion() != null) ? codingA.getVersion().getValue() : null;
        String codeA = (codingA.getCode() != null) ? codingA.getCode().getValue() : null;

        String systemB = (codingB.getSystem() != null) ? codingB.getSystem().getValue() : null;
        String versionB = (codingB.getVersion() != null) ? codingB.getVersion().getValue() : null;
        String codeB = (codingB.getCode() != null) ? codingB.getCode().getValue() : null;

        if (systemA != null && systemB != null && codeA != null && codeB != null && systemA.equals(systemB)) {
            String url = systemA;

            if (versionA != null || versionB != null) {
                if (versionA != null && versionB != null && !versionA.equals(versionB)) {
                    return null;
                }
                url = (versionA != null) ? (url + "|" + versionA) : (url + "|" + versionB);
            }

            CodeSystem codeSystem = CodeSystemSupport.getCodeSystem(url);
            if (codeSystem != null && CodeSystemHierarchyMeaning.IS_A.equals(codeSystem.getHierarchyMeaning())) {
                Concept conceptA = CodeSystemSupport.findConcept(codeSystem, Code.of(codeA));
                if (conceptA != null) {
                    Concept conceptB = CodeSystemSupport.findConcept(conceptA, Code.of(codeB));
                    if (conceptB != null) {
                        return conceptA.equals(conceptB) ? ConceptSubsumptionOutcome.EQUIVALENT : ConceptSubsumptionOutcome.SUBSUMES;
                    }
                    conceptB = CodeSystemSupport.findConcept(codeSystem, Code.of(codeB));
                    if (conceptB != null) {
                        conceptA = CodeSystemSupport.findConcept(conceptB, Code.of(codeA));
                        return (conceptA != null) ? ConceptSubsumptionOutcome.SUBSUMED_BY : ConceptSubsumptionOutcome.NOT_SUBSUMED;
                    }
                }
            }
        }

        return null;
    }

    @Override
    public Set<Concept> closure(Coding coding) {
        String system = (coding.getSystem() != null) ? coding.getSystem().getValue() : null;
        String version = (coding.getVersion() != null) ? coding.getVersion().getValue() : null;
        String code = (coding.getCode() != null) ? coding.getCode().getValue() : null;

        if (system != null && code != null) {
            String url = (version != null) ? system + "|" + version : system;
            CodeSystem codeSystem = CodeSystemSupport.getCodeSystem(url);
            if (codeSystem != null && CodeSystemHierarchyMeaning.IS_A.equals(codeSystem.getHierarchyMeaning())) {
                Concept concept = CodeSystemSupport.findConcept(codeSystem, Code.of(code));
                if (concept != null) {
                    return CodeSystemSupport.getConcepts(concept);
                }
            }
        }

        return Collections.emptySet();
    }

    @Override
    public boolean validateCode(Coding coding) {
        return lookup(coding) != null;
    }

    @Override
    public boolean validateCode(ValueSet valueSet, Coding coding) {
        String code = (coding.getCode() != null) ? coding.getCode().getValue() : null;

        if (code != null) {
            ValueSet expanded = expand(valueSet);
            if (ValueSetSupport.isExpanded(expanded)) {
                for (Contains contains : ValueSetSupport.getContains(expanded.getExpansion())) {
                    if (matches(contains, coding)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    private boolean matches(Contains contains, Coding coding) {
        String containsSystem = (contains.getSystem() != null) ? contains.getSystem().getValue() : null;
        String containsVersion = (contains.getVersion() != null) ? contains.getVersion().getValue() : null;
        String containsCode = (contains.getCode() != null) ? contains.getCode().getValue() : null;

        String system = (coding.getSystem() != null) ? coding.getSystem().getValue() : null;
        String version = (coding.getVersion() != null) ? coding.getVersion().getValue() : null;
        String code = (coding.getCode() != null) ? coding.getCode().getValue() : null;

        if (containsCode != null && containsSystem != null && system != null && version != null) {
            return containsCode.equals(code) && containsSystem.equals(system) && (containsVersion == null || containsVersion.equals(version));
        }

        if (containsCode != null && containsSystem != null && system != null) {
            return containsCode.equals(code) && containsSystem.equals(system);
        }

        return (containsCode != null) && containsCode.equals(code);
    }
}
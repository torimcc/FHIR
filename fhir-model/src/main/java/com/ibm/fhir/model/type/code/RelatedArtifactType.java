/*
 * (C) Copyright IBM Corp. 2019, 2020
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.ibm.fhir.model.type.code;

import com.ibm.fhir.model.annotation.System;
import com.ibm.fhir.model.type.Code;
import com.ibm.fhir.model.type.Extension;
import com.ibm.fhir.model.type.String;

import java.util.Collection;
import java.util.Objects;

import javax.annotation.Generated;

@System("http://hl7.org/fhir/related-artifact-type")
@Generated("com.ibm.fhir.tools.CodeGenerator")
public class RelatedArtifactType extends Code {
    /**
     * Documentation
     * 
     * <p>Additional documentation for the knowledge resource. This would include additional instructions on usage as well as 
     * additional information on clinical context or appropriateness.
     */
    public static final RelatedArtifactType DOCUMENTATION = RelatedArtifactType.builder().value(ValueSet.DOCUMENTATION).build();

    /**
     * Justification
     * 
     * <p>A summary of the justification for the knowledge resource including supporting evidence, relevant guidelines, or 
     * other clinically important information. This information is intended to provide a way to make the justification for 
     * the knowledge resource available to the consumer of interventions or results produced by the knowledge resource.
     */
    public static final RelatedArtifactType JUSTIFICATION = RelatedArtifactType.builder().value(ValueSet.JUSTIFICATION).build();

    /**
     * Citation
     * 
     * <p>Bibliographic citation for papers, references, or other relevant material for the knowledge resource. This is 
     * intended to allow for citation of related material, but that was not necessarily specifically prepared in connection 
     * with this knowledge resource.
     */
    public static final RelatedArtifactType CITATION = RelatedArtifactType.builder().value(ValueSet.CITATION).build();

    /**
     * Predecessor
     * 
     * <p>The previous version of the knowledge resource.
     */
    public static final RelatedArtifactType PREDECESSOR = RelatedArtifactType.builder().value(ValueSet.PREDECESSOR).build();

    /**
     * Successor
     * 
     * <p>The next version of the knowledge resource.
     */
    public static final RelatedArtifactType SUCCESSOR = RelatedArtifactType.builder().value(ValueSet.SUCCESSOR).build();

    /**
     * Derived From
     * 
     * <p>The knowledge resource is derived from the related artifact. This is intended to capture the relationship in which 
     * a particular knowledge resource is based on the content of another artifact, but is modified to capture either a 
     * different set of overall requirements, or a more specific set of requirements such as those involved in a particular 
     * institution or clinical setting.
     */
    public static final RelatedArtifactType DERIVED_FROM = RelatedArtifactType.builder().value(ValueSet.DERIVED_FROM).build();

    /**
     * Depends On
     * 
     * <p>The knowledge resource depends on the given related artifact.
     */
    public static final RelatedArtifactType DEPENDS_ON = RelatedArtifactType.builder().value(ValueSet.DEPENDS_ON).build();

    /**
     * Composed Of
     * 
     * <p>The knowledge resource is composed of the given related artifact.
     */
    public static final RelatedArtifactType COMPOSED_OF = RelatedArtifactType.builder().value(ValueSet.COMPOSED_OF).build();

    private volatile int hashCode;

    private RelatedArtifactType(Builder builder) {
        super(builder);
    }

    public ValueSet getValueAsEnumConstant() {
        return (value != null) ? ValueSet.from(value) : null;
    }

    /**
     * Factory method for creating RelatedArtifactType objects from a passed enum value.
     */
    public static RelatedArtifactType of(ValueSet value) {
        switch (value) {
        case DOCUMENTATION:
            return DOCUMENTATION;
        case JUSTIFICATION:
            return JUSTIFICATION;
        case CITATION:
            return CITATION;
        case PREDECESSOR:
            return PREDECESSOR;
        case SUCCESSOR:
            return SUCCESSOR;
        case DERIVED_FROM:
            return DERIVED_FROM;
        case DEPENDS_ON:
            return DEPENDS_ON;
        case COMPOSED_OF:
            return COMPOSED_OF;
        default:
            throw new IllegalStateException(value.name());
        }
    }

    /**
     * Factory method for creating RelatedArtifactType objects from a passed string value.
     * 
     * @param value
     *     A string that matches one of the allowed code values
     * @throws IllegalArgumentException
     *     If the passed string cannot be parsed into an allowed code value
     */
    public static RelatedArtifactType of(java.lang.String value) {
        return of(ValueSet.from(value));
    }

    /**
     * Inhereted factory method for creating RelatedArtifactType objects from a passed string value.
     * 
     * @param value
     *     A string that matches one of the allowed code values
     * @throws IllegalArgumentException
     *     If the passed string cannot be parsed into an allowed code value
     */
    public static String string(java.lang.String value) {
        return of(ValueSet.from(value));
    }

    /**
     * Inhereted factory method for creating RelatedArtifactType objects from a passed string value.
     * 
     * @param value
     *     A string that matches one of the allowed code values
     * @throws IllegalArgumentException
     *     If the passed string cannot be parsed into an allowed code value
     */
    public static Code code(java.lang.String value) {
        return of(ValueSet.from(value));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        RelatedArtifactType other = (RelatedArtifactType) obj;
        return Objects.equals(id, other.id) && Objects.equals(extension, other.extension) && Objects.equals(value, other.value);
    }

    @Override
    public int hashCode() {
        int result = hashCode;
        if (result == 0) {
            result = Objects.hash(id, extension, value);
            hashCode = result;
        }
        return result;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.id(id);
        builder.extension(extension);
        builder.value(value);
        return builder;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder extends Code.Builder {
        private Builder() {
            super();
        }

        @Override
        public Builder id(java.lang.String id) {
            return (Builder) super.id(id);
        }

        @Override
        public Builder extension(Extension... extension) {
            return (Builder) super.extension(extension);
        }

        @Override
        public Builder extension(Collection<Extension> extension) {
            return (Builder) super.extension(extension);
        }

        @Override
        public Builder value(java.lang.String value) {
            return (value != null) ? (Builder) super.value(ValueSet.from(value).value()) : this;
        }

        public Builder value(ValueSet value) {
            return (value != null) ? (Builder) super.value(value.value()) : this;
        }

        @Override
        public RelatedArtifactType build() {
            return new RelatedArtifactType(this);
        }
    }

    public enum ValueSet {
        /**
         * Documentation
         * 
         * <p>Additional documentation for the knowledge resource. This would include additional instructions on usage as well as 
         * additional information on clinical context or appropriateness.
         */
        DOCUMENTATION("documentation"),

        /**
         * Justification
         * 
         * <p>A summary of the justification for the knowledge resource including supporting evidence, relevant guidelines, or 
         * other clinically important information. This information is intended to provide a way to make the justification for 
         * the knowledge resource available to the consumer of interventions or results produced by the knowledge resource.
         */
        JUSTIFICATION("justification"),

        /**
         * Citation
         * 
         * <p>Bibliographic citation for papers, references, or other relevant material for the knowledge resource. This is 
         * intended to allow for citation of related material, but that was not necessarily specifically prepared in connection 
         * with this knowledge resource.
         */
        CITATION("citation"),

        /**
         * Predecessor
         * 
         * <p>The previous version of the knowledge resource.
         */
        PREDECESSOR("predecessor"),

        /**
         * Successor
         * 
         * <p>The next version of the knowledge resource.
         */
        SUCCESSOR("successor"),

        /**
         * Derived From
         * 
         * <p>The knowledge resource is derived from the related artifact. This is intended to capture the relationship in which 
         * a particular knowledge resource is based on the content of another artifact, but is modified to capture either a 
         * different set of overall requirements, or a more specific set of requirements such as those involved in a particular 
         * institution or clinical setting.
         */
        DERIVED_FROM("derived-from"),

        /**
         * Depends On
         * 
         * <p>The knowledge resource depends on the given related artifact.
         */
        DEPENDS_ON("depends-on"),

        /**
         * Composed Of
         * 
         * <p>The knowledge resource is composed of the given related artifact.
         */
        COMPOSED_OF("composed-of");

        private final java.lang.String value;

        ValueSet(java.lang.String value) {
            this.value = value;
        }

        /**
         * @return
         *     The java.lang.String value of the code represented by this enum
         */
        public java.lang.String value() {
            return value;
        }

        /**
         * Factory method for creating RelatedArtifactType.ValueSet values from a passed string value.
         * 
         * @param value
         *     A string that matches one of the allowed code values
         * @throws IllegalArgumentException
         *     If the passed string cannot be parsed into an allowed code value
         */
        public static ValueSet from(java.lang.String value) {
            for (ValueSet c : ValueSet.values()) {
                if (c.value.equals(value)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(value);
        }
    }
}

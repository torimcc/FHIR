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

@System("http://hl7.org/fhir/research-subject-status")
@Generated("com.ibm.fhir.tools.CodeGenerator")
public class ResearchSubjectStatus extends Code {
    /**
     * Candidate
     * 
     * <p>An identified person that can be considered for inclusion in a study.
     */
    public static final ResearchSubjectStatus CANDIDATE = ResearchSubjectStatus.builder().value(ValueSet.CANDIDATE).build();

    /**
     * Eligible
     * 
     * <p>A person that has met the eligibility criteria for inclusion in a study.
     */
    public static final ResearchSubjectStatus ELIGIBLE = ResearchSubjectStatus.builder().value(ValueSet.ELIGIBLE).build();

    /**
     * Follow-up
     * 
     * <p>A person is no longer receiving study intervention and/or being evaluated with tests and procedures according to 
     * the protocol, but they are being monitored on a protocol-prescribed schedule.
     */
    public static final ResearchSubjectStatus FOLLOW_UP = ResearchSubjectStatus.builder().value(ValueSet.FOLLOW_UP).build();

    /**
     * Ineligible
     * 
     * <p>A person who did not meet one or more criteria required for participation in a study is considered to have failed 
     * screening or
     * <p>is ineligible for the study.
     */
    public static final ResearchSubjectStatus INELIGIBLE = ResearchSubjectStatus.builder().value(ValueSet.INELIGIBLE).build();

    /**
     * Not Registered
     * 
     * <p>A person for whom registration was not completed.
     */
    public static final ResearchSubjectStatus NOT_REGISTERED = ResearchSubjectStatus.builder().value(ValueSet.NOT_REGISTERED).build();

    /**
     * Off-study
     * 
     * <p>A person that has ended their participation on a study either because their treatment/observation is complete or 
     * through not
     * <p>responding, withdrawal, non-compliance and/or adverse event.
     */
    public static final ResearchSubjectStatus OFF_STUDY = ResearchSubjectStatus.builder().value(ValueSet.OFF_STUDY).build();

    /**
     * On-study
     * 
     * <p>A person that is enrolled or registered on a study.
     */
    public static final ResearchSubjectStatus ON_STUDY = ResearchSubjectStatus.builder().value(ValueSet.ON_STUDY).build();

    /**
     * On-study-intervention
     * 
     * <p>The person is receiving the treatment or participating in an activity (e.g. yoga, diet, etc.) that the study is 
     * evaluating.
     */
    public static final ResearchSubjectStatus ON_STUDY_INTERVENTION = ResearchSubjectStatus.builder().value(ValueSet.ON_STUDY_INTERVENTION).build();

    /**
     * On-study-observation
     * 
     * <p>The subject is being evaluated via tests and assessments according to the study calendar, but is not receiving any 
     * intervention. Note that this state is study-dependent and might not exist in all studies. A synonym for this is "short-
     * term follow-up".
     */
    public static final ResearchSubjectStatus ON_STUDY_OBSERVATION = ResearchSubjectStatus.builder().value(ValueSet.ON_STUDY_OBSERVATION).build();

    /**
     * Pending on-study
     * 
     * <p>A person is pre-registered for a study.
     */
    public static final ResearchSubjectStatus PENDING_ON_STUDY = ResearchSubjectStatus.builder().value(ValueSet.PENDING_ON_STUDY).build();

    /**
     * Potential Candidate
     * 
     * <p>A person that is potentially eligible for participation in the study.
     */
    public static final ResearchSubjectStatus POTENTIAL_CANDIDATE = ResearchSubjectStatus.builder().value(ValueSet.POTENTIAL_CANDIDATE).build();

    /**
     * Screening
     * 
     * <p>A person who is being evaluated for eligibility for a study.
     */
    public static final ResearchSubjectStatus SCREENING = ResearchSubjectStatus.builder().value(ValueSet.SCREENING).build();

    /**
     * Withdrawn
     * 
     * <p>The person has withdrawn their participation in the study before registration.
     */
    public static final ResearchSubjectStatus WITHDRAWN = ResearchSubjectStatus.builder().value(ValueSet.WITHDRAWN).build();

    private volatile int hashCode;

    private ResearchSubjectStatus(Builder builder) {
        super(builder);
    }

    public ValueSet getValueAsEnumConstant() {
        return (value != null) ? ValueSet.from(value) : null;
    }

    /**
     * Factory method for creating ResearchSubjectStatus objects from a passed enum value.
     */
    public static ResearchSubjectStatus of(ValueSet value) {
        switch (value) {
        case CANDIDATE:
            return CANDIDATE;
        case ELIGIBLE:
            return ELIGIBLE;
        case FOLLOW_UP:
            return FOLLOW_UP;
        case INELIGIBLE:
            return INELIGIBLE;
        case NOT_REGISTERED:
            return NOT_REGISTERED;
        case OFF_STUDY:
            return OFF_STUDY;
        case ON_STUDY:
            return ON_STUDY;
        case ON_STUDY_INTERVENTION:
            return ON_STUDY_INTERVENTION;
        case ON_STUDY_OBSERVATION:
            return ON_STUDY_OBSERVATION;
        case PENDING_ON_STUDY:
            return PENDING_ON_STUDY;
        case POTENTIAL_CANDIDATE:
            return POTENTIAL_CANDIDATE;
        case SCREENING:
            return SCREENING;
        case WITHDRAWN:
            return WITHDRAWN;
        default:
            throw new IllegalStateException(value.name());
        }
    }

    /**
     * Factory method for creating ResearchSubjectStatus objects from a passed string value.
     * 
     * @param value
     *     A string that matches one of the allowed code values
     * @throws IllegalArgumentException
     *     If the passed string cannot be parsed into an allowed code value
     */
    public static ResearchSubjectStatus of(java.lang.String value) {
        return of(ValueSet.from(value));
    }

    /**
     * Inhereted factory method for creating ResearchSubjectStatus objects from a passed string value.
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
     * Inhereted factory method for creating ResearchSubjectStatus objects from a passed string value.
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
        ResearchSubjectStatus other = (ResearchSubjectStatus) obj;
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
        public ResearchSubjectStatus build() {
            return new ResearchSubjectStatus(this);
        }
    }

    public enum ValueSet {
        /**
         * Candidate
         * 
         * <p>An identified person that can be considered for inclusion in a study.
         */
        CANDIDATE("candidate"),

        /**
         * Eligible
         * 
         * <p>A person that has met the eligibility criteria for inclusion in a study.
         */
        ELIGIBLE("eligible"),

        /**
         * Follow-up
         * 
         * <p>A person is no longer receiving study intervention and/or being evaluated with tests and procedures according to 
         * the protocol, but they are being monitored on a protocol-prescribed schedule.
         */
        FOLLOW_UP("follow-up"),

        /**
         * Ineligible
         * 
         * <p>A person who did not meet one or more criteria required for participation in a study is considered to have failed 
         * screening or
         * <p>is ineligible for the study.
         */
        INELIGIBLE("ineligible"),

        /**
         * Not Registered
         * 
         * <p>A person for whom registration was not completed.
         */
        NOT_REGISTERED("not-registered"),

        /**
         * Off-study
         * 
         * <p>A person that has ended their participation on a study either because their treatment/observation is complete or 
         * through not
         * <p>responding, withdrawal, non-compliance and/or adverse event.
         */
        OFF_STUDY("off-study"),

        /**
         * On-study
         * 
         * <p>A person that is enrolled or registered on a study.
         */
        ON_STUDY("on-study"),

        /**
         * On-study-intervention
         * 
         * <p>The person is receiving the treatment or participating in an activity (e.g. yoga, diet, etc.) that the study is 
         * evaluating.
         */
        ON_STUDY_INTERVENTION("on-study-intervention"),

        /**
         * On-study-observation
         * 
         * <p>The subject is being evaluated via tests and assessments according to the study calendar, but is not receiving any 
         * intervention. Note that this state is study-dependent and might not exist in all studies. A synonym for this is "short-
         * term follow-up".
         */
        ON_STUDY_OBSERVATION("on-study-observation"),

        /**
         * Pending on-study
         * 
         * <p>A person is pre-registered for a study.
         */
        PENDING_ON_STUDY("pending-on-study"),

        /**
         * Potential Candidate
         * 
         * <p>A person that is potentially eligible for participation in the study.
         */
        POTENTIAL_CANDIDATE("potential-candidate"),

        /**
         * Screening
         * 
         * <p>A person who is being evaluated for eligibility for a study.
         */
        SCREENING("screening"),

        /**
         * Withdrawn
         * 
         * <p>The person has withdrawn their participation in the study before registration.
         */
        WITHDRAWN("withdrawn");

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
         * Factory method for creating ResearchSubjectStatus.ValueSet values from a passed string value.
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

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

@System("http://terminology.hl7.org/CodeSystem/medication-admin-status")
@Generated("com.ibm.fhir.tools.CodeGenerator")
public class MedicationAdministrationStatus extends Code {
    /**
     * In Progress
     * 
     * <p>The administration has started but has not yet completed.
     */
    public static final MedicationAdministrationStatus IN_PROGRESS = MedicationAdministrationStatus.builder().value(ValueSet.IN_PROGRESS).build();

    /**
     * Not Done
     * 
     * <p>The administration was terminated prior to any impact on the subject (though preparatory actions may have been 
     * taken)
     */
    public static final MedicationAdministrationStatus NOT_DONE = MedicationAdministrationStatus.builder().value(ValueSet.NOT_DONE).build();

    /**
     * On Hold
     * 
     * <p>Actions implied by the administration have been temporarily halted, but are expected to continue later. May also be 
     * called 'suspended'.
     */
    public static final MedicationAdministrationStatus ON_HOLD = MedicationAdministrationStatus.builder().value(ValueSet.ON_HOLD).build();

    /**
     * Completed
     * 
     * <p>All actions that are implied by the administration have occurred.
     */
    public static final MedicationAdministrationStatus COMPLETED = MedicationAdministrationStatus.builder().value(ValueSet.COMPLETED).build();

    /**
     * Entered in Error
     * 
     * <p>The administration was entered in error and therefore nullified.
     */
    public static final MedicationAdministrationStatus ENTERED_IN_ERROR = MedicationAdministrationStatus.builder().value(ValueSet.ENTERED_IN_ERROR).build();

    /**
     * Stopped
     * 
     * <p>Actions implied by the administration have been permanently halted, before all of them occurred.
     */
    public static final MedicationAdministrationStatus STOPPED = MedicationAdministrationStatus.builder().value(ValueSet.STOPPED).build();

    /**
     * Unknown
     * 
     * <p>The authoring system does not know which of the status values currently applies for this request. Note: This 
     * concept is not to be used for 'other' - one of the listed statuses is presumed to apply, it's just not known which one.
     */
    public static final MedicationAdministrationStatus UNKNOWN = MedicationAdministrationStatus.builder().value(ValueSet.UNKNOWN).build();

    private volatile int hashCode;

    private MedicationAdministrationStatus(Builder builder) {
        super(builder);
    }

    public ValueSet getValueAsEnumConstant() {
        return (value != null) ? ValueSet.from(value) : null;
    }

    /**
     * Factory method for creating MedicationAdministrationStatus objects from a passed enum value.
     */
    public static MedicationAdministrationStatus of(ValueSet value) {
        switch (value) {
        case IN_PROGRESS:
            return IN_PROGRESS;
        case NOT_DONE:
            return NOT_DONE;
        case ON_HOLD:
            return ON_HOLD;
        case COMPLETED:
            return COMPLETED;
        case ENTERED_IN_ERROR:
            return ENTERED_IN_ERROR;
        case STOPPED:
            return STOPPED;
        case UNKNOWN:
            return UNKNOWN;
        default:
            throw new IllegalStateException(value.name());
        }
    }

    /**
     * Factory method for creating MedicationAdministrationStatus objects from a passed string value.
     * 
     * @param value
     *     A string that matches one of the allowed code values
     * @throws IllegalArgumentException
     *     If the passed string cannot be parsed into an allowed code value
     */
    public static MedicationAdministrationStatus of(java.lang.String value) {
        return of(ValueSet.from(value));
    }

    /**
     * Inhereted factory method for creating MedicationAdministrationStatus objects from a passed string value.
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
     * Inhereted factory method for creating MedicationAdministrationStatus objects from a passed string value.
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
        MedicationAdministrationStatus other = (MedicationAdministrationStatus) obj;
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
        public MedicationAdministrationStatus build() {
            return new MedicationAdministrationStatus(this);
        }
    }

    public enum ValueSet {
        /**
         * In Progress
         * 
         * <p>The administration has started but has not yet completed.
         */
        IN_PROGRESS("in-progress"),

        /**
         * Not Done
         * 
         * <p>The administration was terminated prior to any impact on the subject (though preparatory actions may have been 
         * taken)
         */
        NOT_DONE("not-done"),

        /**
         * On Hold
         * 
         * <p>Actions implied by the administration have been temporarily halted, but are expected to continue later. May also be 
         * called 'suspended'.
         */
        ON_HOLD("on-hold"),

        /**
         * Completed
         * 
         * <p>All actions that are implied by the administration have occurred.
         */
        COMPLETED("completed"),

        /**
         * Entered in Error
         * 
         * <p>The administration was entered in error and therefore nullified.
         */
        ENTERED_IN_ERROR("entered-in-error"),

        /**
         * Stopped
         * 
         * <p>Actions implied by the administration have been permanently halted, before all of them occurred.
         */
        STOPPED("stopped"),

        /**
         * Unknown
         * 
         * <p>The authoring system does not know which of the status values currently applies for this request. Note: This 
         * concept is not to be used for 'other' - one of the listed statuses is presumed to apply, it's just not known which one.
         */
        UNKNOWN("unknown");

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
         * Factory method for creating MedicationAdministrationStatus.ValueSet values from a passed string value.
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

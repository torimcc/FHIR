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

@System("http://hl7.org/fhir/request-status")
@Generated("com.ibm.fhir.tools.CodeGenerator")
public class ServiceRequestStatus extends Code {
    /**
     * Draft
     * 
     * <p>The request has been created but is not yet complete or ready for action.
     */
    public static final ServiceRequestStatus DRAFT = ServiceRequestStatus.builder().value(ValueSet.DRAFT).build();

    /**
     * Active
     * 
     * <p>The request is in force and ready to be acted upon.
     */
    public static final ServiceRequestStatus ACTIVE = ServiceRequestStatus.builder().value(ValueSet.ACTIVE).build();

    /**
     * On Hold
     * 
     * <p>The request (and any implicit authorization to act) has been temporarily withdrawn but is expected to resume in the 
     * future.
     */
    public static final ServiceRequestStatus ON_HOLD = ServiceRequestStatus.builder().value(ValueSet.ON_HOLD).build();

    /**
     * Revoked
     * 
     * <p>The request (and any implicit authorization to act) has been terminated prior to the known full completion of the 
     * intended actions. No further activity should occur.
     */
    public static final ServiceRequestStatus REVOKED = ServiceRequestStatus.builder().value(ValueSet.REVOKED).build();

    /**
     * Completed
     * 
     * <p>The activity described by the request has been fully performed. No further activity will occur.
     */
    public static final ServiceRequestStatus COMPLETED = ServiceRequestStatus.builder().value(ValueSet.COMPLETED).build();

    /**
     * Entered in Error
     * 
     * <p>This request should never have existed and should be considered 'void'. (It is possible that real-world decisions 
     * were based on it. If real-world activity has occurred, the status should be "revoked" rather than "entered-in-error".).
     */
    public static final ServiceRequestStatus ENTERED_IN_ERROR = ServiceRequestStatus.builder().value(ValueSet.ENTERED_IN_ERROR).build();

    /**
     * Unknown
     * 
     * <p>The authoring/source system does not know which of the status values currently applies for this request. Note: This 
     * concept is not to be used for "other" - one of the listed statuses is presumed to apply, but the authoring/source 
     * system does not know which.
     */
    public static final ServiceRequestStatus UNKNOWN = ServiceRequestStatus.builder().value(ValueSet.UNKNOWN).build();

    private volatile int hashCode;

    private ServiceRequestStatus(Builder builder) {
        super(builder);
    }

    public ValueSet getValueAsEnumConstant() {
        return (value != null) ? ValueSet.from(value) : null;
    }

    /**
     * Factory method for creating ServiceRequestStatus objects from a passed enum value.
     */
    public static ServiceRequestStatus of(ValueSet value) {
        switch (value) {
        case DRAFT:
            return DRAFT;
        case ACTIVE:
            return ACTIVE;
        case ON_HOLD:
            return ON_HOLD;
        case REVOKED:
            return REVOKED;
        case COMPLETED:
            return COMPLETED;
        case ENTERED_IN_ERROR:
            return ENTERED_IN_ERROR;
        case UNKNOWN:
            return UNKNOWN;
        default:
            throw new IllegalStateException(value.name());
        }
    }

    /**
     * Factory method for creating ServiceRequestStatus objects from a passed string value.
     * 
     * @param value
     *     A string that matches one of the allowed code values
     * @throws IllegalArgumentException
     *     If the passed string cannot be parsed into an allowed code value
     */
    public static ServiceRequestStatus of(java.lang.String value) {
        return of(ValueSet.from(value));
    }

    /**
     * Inhereted factory method for creating ServiceRequestStatus objects from a passed string value.
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
     * Inhereted factory method for creating ServiceRequestStatus objects from a passed string value.
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
        ServiceRequestStatus other = (ServiceRequestStatus) obj;
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
        public ServiceRequestStatus build() {
            return new ServiceRequestStatus(this);
        }
    }

    public enum ValueSet {
        /**
         * Draft
         * 
         * <p>The request has been created but is not yet complete or ready for action.
         */
        DRAFT("draft"),

        /**
         * Active
         * 
         * <p>The request is in force and ready to be acted upon.
         */
        ACTIVE("active"),

        /**
         * On Hold
         * 
         * <p>The request (and any implicit authorization to act) has been temporarily withdrawn but is expected to resume in the 
         * future.
         */
        ON_HOLD("on-hold"),

        /**
         * Revoked
         * 
         * <p>The request (and any implicit authorization to act) has been terminated prior to the known full completion of the 
         * intended actions. No further activity should occur.
         */
        REVOKED("revoked"),

        /**
         * Completed
         * 
         * <p>The activity described by the request has been fully performed. No further activity will occur.
         */
        COMPLETED("completed"),

        /**
         * Entered in Error
         * 
         * <p>This request should never have existed and should be considered 'void'. (It is possible that real-world decisions 
         * were based on it. If real-world activity has occurred, the status should be "revoked" rather than "entered-in-error".).
         */
        ENTERED_IN_ERROR("entered-in-error"),

        /**
         * Unknown
         * 
         * <p>The authoring/source system does not know which of the status values currently applies for this request. Note: This 
         * concept is not to be used for "other" - one of the listed statuses is presumed to apply, but the authoring/source 
         * system does not know which.
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
         * Factory method for creating ServiceRequestStatus.ValueSet values from a passed string value.
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

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

@System("http://hl7.org/fhir/eligibilityresponse-purpose")
@Generated("com.ibm.fhir.tools.CodeGenerator")
public class EligibilityResponsePurpose extends Code {
    /**
     * Coverage auth-requirements
     * 
     * <p>The prior authorization requirements for the listed, or discovered if specified, converages for the categories of 
     * service and/or specifed biling codes are requested.
     */
    public static final EligibilityResponsePurpose AUTH_REQUIREMENTS = EligibilityResponsePurpose.builder().value(ValueSet.AUTH_REQUIREMENTS).build();

    /**
     * Coverage benefits
     * 
     * <p>The plan benefits and optionally benefits consumed for the listed, or discovered if specified, converages are 
     * requested.
     */
    public static final EligibilityResponsePurpose BENEFITS = EligibilityResponsePurpose.builder().value(ValueSet.BENEFITS).build();

    /**
     * Coverage Discovery
     * 
     * <p>The insurer is requested to report on any coverages which they are aware of in addition to any specifed.
     */
    public static final EligibilityResponsePurpose DISCOVERY = EligibilityResponsePurpose.builder().value(ValueSet.DISCOVERY).build();

    /**
     * Coverage Validation
     * 
     * <p>A check that the specified coverages are in-force is requested.
     */
    public static final EligibilityResponsePurpose VALIDATION = EligibilityResponsePurpose.builder().value(ValueSet.VALIDATION).build();

    private volatile int hashCode;

    private EligibilityResponsePurpose(Builder builder) {
        super(builder);
    }

    public ValueSet getValueAsEnumConstant() {
        return (value != null) ? ValueSet.from(value) : null;
    }

    /**
     * Factory method for creating EligibilityResponsePurpose objects from a passed enum value.
     */
    public static EligibilityResponsePurpose of(ValueSet value) {
        switch (value) {
        case AUTH_REQUIREMENTS:
            return AUTH_REQUIREMENTS;
        case BENEFITS:
            return BENEFITS;
        case DISCOVERY:
            return DISCOVERY;
        case VALIDATION:
            return VALIDATION;
        default:
            throw new IllegalStateException(value.name());
        }
    }

    /**
     * Factory method for creating EligibilityResponsePurpose objects from a passed string value.
     * 
     * @param value
     *     A string that matches one of the allowed code values
     * @throws IllegalArgumentException
     *     If the passed string cannot be parsed into an allowed code value
     */
    public static EligibilityResponsePurpose of(java.lang.String value) {
        return of(ValueSet.from(value));
    }

    /**
     * Inhereted factory method for creating EligibilityResponsePurpose objects from a passed string value.
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
     * Inhereted factory method for creating EligibilityResponsePurpose objects from a passed string value.
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
        EligibilityResponsePurpose other = (EligibilityResponsePurpose) obj;
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
        public EligibilityResponsePurpose build() {
            return new EligibilityResponsePurpose(this);
        }
    }

    public enum ValueSet {
        /**
         * Coverage auth-requirements
         * 
         * <p>The prior authorization requirements for the listed, or discovered if specified, converages for the categories of 
         * service and/or specifed biling codes are requested.
         */
        AUTH_REQUIREMENTS("auth-requirements"),

        /**
         * Coverage benefits
         * 
         * <p>The plan benefits and optionally benefits consumed for the listed, or discovered if specified, converages are 
         * requested.
         */
        BENEFITS("benefits"),

        /**
         * Coverage Discovery
         * 
         * <p>The insurer is requested to report on any coverages which they are aware of in addition to any specifed.
         */
        DISCOVERY("discovery"),

        /**
         * Coverage Validation
         * 
         * <p>A check that the specified coverages are in-force is requested.
         */
        VALIDATION("validation");

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
         * Factory method for creating EligibilityResponsePurpose.ValueSet values from a passed string value.
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

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

@System("http://hl7.org/fhir/variable-type")
@Generated("com.ibm.fhir.tools.CodeGenerator")
public class EvidenceVariableType extends Code {
    /**
     * Dichotomous
     * 
     * <p>The variable is dichotomous, such as present or absent.
     */
    public static final EvidenceVariableType DICHOTOMOUS = EvidenceVariableType.builder().value(ValueSet.DICHOTOMOUS).build();

    /**
     * Continuous
     * 
     * <p>The variable is a continuous result such as a quantity.
     */
    public static final EvidenceVariableType CONTINUOUS = EvidenceVariableType.builder().value(ValueSet.CONTINUOUS).build();

    /**
     * Descriptive
     * 
     * <p>The variable is described narratively rather than quantitatively.
     */
    public static final EvidenceVariableType DESCRIPTIVE = EvidenceVariableType.builder().value(ValueSet.DESCRIPTIVE).build();

    private volatile int hashCode;

    private EvidenceVariableType(Builder builder) {
        super(builder);
    }

    public ValueSet getValueAsEnumConstant() {
        return (value != null) ? ValueSet.from(value) : null;
    }

    /**
     * Factory method for creating EvidenceVariableType objects from a passed enum value.
     */
    public static EvidenceVariableType of(ValueSet value) {
        switch (value) {
        case DICHOTOMOUS:
            return DICHOTOMOUS;
        case CONTINUOUS:
            return CONTINUOUS;
        case DESCRIPTIVE:
            return DESCRIPTIVE;
        default:
            throw new IllegalStateException(value.name());
        }
    }

    /**
     * Factory method for creating EvidenceVariableType objects from a passed string value.
     * 
     * @param value
     *     A string that matches one of the allowed code values
     * @throws IllegalArgumentException
     *     If the passed string cannot be parsed into an allowed code value
     */
    public static EvidenceVariableType of(java.lang.String value) {
        return of(ValueSet.from(value));
    }

    /**
     * Inhereted factory method for creating EvidenceVariableType objects from a passed string value.
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
     * Inhereted factory method for creating EvidenceVariableType objects from a passed string value.
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
        EvidenceVariableType other = (EvidenceVariableType) obj;
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
        public EvidenceVariableType build() {
            return new EvidenceVariableType(this);
        }
    }

    public enum ValueSet {
        /**
         * Dichotomous
         * 
         * <p>The variable is dichotomous, such as present or absent.
         */
        DICHOTOMOUS("dichotomous"),

        /**
         * Continuous
         * 
         * <p>The variable is a continuous result such as a quantity.
         */
        CONTINUOUS("continuous"),

        /**
         * Descriptive
         * 
         * <p>The variable is described narratively rather than quantitatively.
         */
        DESCRIPTIVE("descriptive");

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
         * Factory method for creating EvidenceVariableType.ValueSet values from a passed string value.
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

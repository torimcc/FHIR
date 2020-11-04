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

@System("http://hl7.org/fhir/assert-operator-codes")
@Generated("com.ibm.fhir.tools.CodeGenerator")
public class AssertionOperatorType extends Code {
    /**
     * equals
     * 
     * <p>Default value. Equals comparison.
     */
    public static final AssertionOperatorType EQUALS = AssertionOperatorType.builder().value(ValueSet.EQUALS).build();

    /**
     * notEquals
     * 
     * <p>Not equals comparison.
     */
    public static final AssertionOperatorType NOT_EQUALS = AssertionOperatorType.builder().value(ValueSet.NOT_EQUALS).build();

    /**
     * in
     * 
     * <p>Compare value within a known set of values.
     */
    public static final AssertionOperatorType IN = AssertionOperatorType.builder().value(ValueSet.IN).build();

    /**
     * notIn
     * 
     * <p>Compare value not within a known set of values.
     */
    public static final AssertionOperatorType NOT_IN = AssertionOperatorType.builder().value(ValueSet.NOT_IN).build();

    /**
     * greaterThan
     * 
     * <p>Compare value to be greater than a known value.
     */
    public static final AssertionOperatorType GREATER_THAN = AssertionOperatorType.builder().value(ValueSet.GREATER_THAN).build();

    /**
     * lessThan
     * 
     * <p>Compare value to be less than a known value.
     */
    public static final AssertionOperatorType LESS_THAN = AssertionOperatorType.builder().value(ValueSet.LESS_THAN).build();

    /**
     * empty
     * 
     * <p>Compare value is empty.
     */
    public static final AssertionOperatorType EMPTY = AssertionOperatorType.builder().value(ValueSet.EMPTY).build();

    /**
     * notEmpty
     * 
     * <p>Compare value is not empty.
     */
    public static final AssertionOperatorType NOT_EMPTY = AssertionOperatorType.builder().value(ValueSet.NOT_EMPTY).build();

    /**
     * contains
     * 
     * <p>Compare value string contains a known value.
     */
    public static final AssertionOperatorType CONTAINS = AssertionOperatorType.builder().value(ValueSet.CONTAINS).build();

    /**
     * notContains
     * 
     * <p>Compare value string does not contain a known value.
     */
    public static final AssertionOperatorType NOT_CONTAINS = AssertionOperatorType.builder().value(ValueSet.NOT_CONTAINS).build();

    /**
     * evaluate
     * 
     * <p>Evaluate the FHIRPath expression as a boolean condition.
     */
    public static final AssertionOperatorType EVAL = AssertionOperatorType.builder().value(ValueSet.EVAL).build();

    private volatile int hashCode;

    private AssertionOperatorType(Builder builder) {
        super(builder);
    }

    public ValueSet getValueAsEnumConstant() {
        return (value != null) ? ValueSet.from(value) : null;
    }

    /**
     * Factory method for creating AssertionOperatorType objects from a passed enum value.
     */
    public static AssertionOperatorType of(ValueSet value) {
        switch (value) {
        case EQUALS:
            return EQUALS;
        case NOT_EQUALS:
            return NOT_EQUALS;
        case IN:
            return IN;
        case NOT_IN:
            return NOT_IN;
        case GREATER_THAN:
            return GREATER_THAN;
        case LESS_THAN:
            return LESS_THAN;
        case EMPTY:
            return EMPTY;
        case NOT_EMPTY:
            return NOT_EMPTY;
        case CONTAINS:
            return CONTAINS;
        case NOT_CONTAINS:
            return NOT_CONTAINS;
        case EVAL:
            return EVAL;
        default:
            throw new IllegalStateException(value.name());
        }
    }

    /**
     * Factory method for creating AssertionOperatorType objects from a passed string value.
     * 
     * @param value
     *     A string that matches one of the allowed code values
     * @throws IllegalArgumentException
     *     If the passed string cannot be parsed into an allowed code value
     */
    public static AssertionOperatorType of(java.lang.String value) {
        return of(ValueSet.from(value));
    }

    /**
     * Inhereted factory method for creating AssertionOperatorType objects from a passed string value.
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
     * Inhereted factory method for creating AssertionOperatorType objects from a passed string value.
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
        AssertionOperatorType other = (AssertionOperatorType) obj;
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
        public AssertionOperatorType build() {
            return new AssertionOperatorType(this);
        }
    }

    public enum ValueSet {
        /**
         * equals
         * 
         * <p>Default value. Equals comparison.
         */
        EQUALS("equals"),

        /**
         * notEquals
         * 
         * <p>Not equals comparison.
         */
        NOT_EQUALS("notEquals"),

        /**
         * in
         * 
         * <p>Compare value within a known set of values.
         */
        IN("in"),

        /**
         * notIn
         * 
         * <p>Compare value not within a known set of values.
         */
        NOT_IN("notIn"),

        /**
         * greaterThan
         * 
         * <p>Compare value to be greater than a known value.
         */
        GREATER_THAN("greaterThan"),

        /**
         * lessThan
         * 
         * <p>Compare value to be less than a known value.
         */
        LESS_THAN("lessThan"),

        /**
         * empty
         * 
         * <p>Compare value is empty.
         */
        EMPTY("empty"),

        /**
         * notEmpty
         * 
         * <p>Compare value is not empty.
         */
        NOT_EMPTY("notEmpty"),

        /**
         * contains
         * 
         * <p>Compare value string contains a known value.
         */
        CONTAINS("contains"),

        /**
         * notContains
         * 
         * <p>Compare value string does not contain a known value.
         */
        NOT_CONTAINS("notContains"),

        /**
         * evaluate
         * 
         * <p>Evaluate the FHIRPath expression as a boolean condition.
         */
        EVAL("eval");

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
         * Factory method for creating AssertionOperatorType.ValueSet values from a passed string value.
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

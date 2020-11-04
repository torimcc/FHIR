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

@System("http://hl7.org/fhir/invoice-priceComponentType")
@Generated("com.ibm.fhir.tools.CodeGenerator")
public class InvoicePriceComponentType extends Code {
    /**
     * base price
     * 
     * <p>the amount is the base price used for calculating the total price before applying surcharges, discount or taxes.
     */
    public static final InvoicePriceComponentType BASE = InvoicePriceComponentType.builder().value(ValueSet.BASE).build();

    /**
     * surcharge
     * 
     * <p>the amount is a surcharge applied on the base price.
     */
    public static final InvoicePriceComponentType SURCHARGE = InvoicePriceComponentType.builder().value(ValueSet.SURCHARGE).build();

    /**
     * deduction
     * 
     * <p>the amount is a deduction applied on the base price.
     */
    public static final InvoicePriceComponentType DEDUCTION = InvoicePriceComponentType.builder().value(ValueSet.DEDUCTION).build();

    /**
     * discount
     * 
     * <p>the amount is a discount applied on the base price.
     */
    public static final InvoicePriceComponentType DISCOUNT = InvoicePriceComponentType.builder().value(ValueSet.DISCOUNT).build();

    /**
     * tax
     * 
     * <p>the amount is the tax component of the total price.
     */
    public static final InvoicePriceComponentType TAX = InvoicePriceComponentType.builder().value(ValueSet.TAX).build();

    /**
     * informational
     * 
     * <p>the amount is of informational character, it has not been applied in the calculation of the total price.
     */
    public static final InvoicePriceComponentType INFORMATIONAL = InvoicePriceComponentType.builder().value(ValueSet.INFORMATIONAL).build();

    private volatile int hashCode;

    private InvoicePriceComponentType(Builder builder) {
        super(builder);
    }

    public ValueSet getValueAsEnumConstant() {
        return (value != null) ? ValueSet.from(value) : null;
    }

    /**
     * Factory method for creating InvoicePriceComponentType objects from a passed enum value.
     */
    public static InvoicePriceComponentType of(ValueSet value) {
        switch (value) {
        case BASE:
            return BASE;
        case SURCHARGE:
            return SURCHARGE;
        case DEDUCTION:
            return DEDUCTION;
        case DISCOUNT:
            return DISCOUNT;
        case TAX:
            return TAX;
        case INFORMATIONAL:
            return INFORMATIONAL;
        default:
            throw new IllegalStateException(value.name());
        }
    }

    /**
     * Factory method for creating InvoicePriceComponentType objects from a passed string value.
     * 
     * @param value
     *     A string that matches one of the allowed code values
     * @throws IllegalArgumentException
     *     If the passed string cannot be parsed into an allowed code value
     */
    public static InvoicePriceComponentType of(java.lang.String value) {
        return of(ValueSet.from(value));
    }

    /**
     * Inhereted factory method for creating InvoicePriceComponentType objects from a passed string value.
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
     * Inhereted factory method for creating InvoicePriceComponentType objects from a passed string value.
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
        InvoicePriceComponentType other = (InvoicePriceComponentType) obj;
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
        public InvoicePriceComponentType build() {
            return new InvoicePriceComponentType(this);
        }
    }

    public enum ValueSet {
        /**
         * base price
         * 
         * <p>the amount is the base price used for calculating the total price before applying surcharges, discount or taxes.
         */
        BASE("base"),

        /**
         * surcharge
         * 
         * <p>the amount is a surcharge applied on the base price.
         */
        SURCHARGE("surcharge"),

        /**
         * deduction
         * 
         * <p>the amount is a deduction applied on the base price.
         */
        DEDUCTION("deduction"),

        /**
         * discount
         * 
         * <p>the amount is a discount applied on the base price.
         */
        DISCOUNT("discount"),

        /**
         * tax
         * 
         * <p>the amount is the tax component of the total price.
         */
        TAX("tax"),

        /**
         * informational
         * 
         * <p>the amount is of informational character, it has not been applied in the calculation of the total price.
         */
        INFORMATIONAL("informational");

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
         * Factory method for creating InvoicePriceComponentType.ValueSet values from a passed string value.
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

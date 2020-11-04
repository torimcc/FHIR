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

@System("http://hl7.org/fhir/chargeitem-status")
@Generated("com.ibm.fhir.tools.CodeGenerator")
public class ChargeItemStatus extends Code {
    /**
     * Planned
     * 
     * <p>The charge item has been entered, but the charged service is not yet complete, so it shall not be billed yet but 
     * might be used in the context of pre-authorization.
     */
    public static final ChargeItemStatus PLANNED = ChargeItemStatus.builder().value(ValueSet.PLANNED).build();

    /**
     * Billable
     * 
     * <p>The charge item is ready for billing.
     */
    public static final ChargeItemStatus BILLABLE = ChargeItemStatus.builder().value(ValueSet.BILLABLE).build();

    /**
     * Not billable
     * 
     * <p>The charge item has been determined to be not billable (e.g. due to rules associated with the billing code).
     */
    public static final ChargeItemStatus NOT_BILLABLE = ChargeItemStatus.builder().value(ValueSet.NOT_BILLABLE).build();

    /**
     * Aborted
     * 
     * <p>The processing of the charge was aborted.
     */
    public static final ChargeItemStatus ABORTED = ChargeItemStatus.builder().value(ValueSet.ABORTED).build();

    /**
     * Billed
     * 
     * <p>The charge item has been billed (e.g. a billing engine has generated financial transactions by applying the 
     * associated ruled for the charge item to the context of the Encounter, and placed them into Claims/Invoices.
     */
    public static final ChargeItemStatus BILLED = ChargeItemStatus.builder().value(ValueSet.BILLED).build();

    /**
     * Entered in Error
     * 
     * <p>The charge item has been entered in error and should not be processed for billing.
     */
    public static final ChargeItemStatus ENTERED_IN_ERROR = ChargeItemStatus.builder().value(ValueSet.ENTERED_IN_ERROR).build();

    /**
     * Unknown
     * 
     * <p>The authoring system does not know which of the status values currently applies for this charge item Note: This 
     * concept is not to be used for "other" - one of the listed statuses is presumed to apply, it's just not known which one.
     */
    public static final ChargeItemStatus UNKNOWN = ChargeItemStatus.builder().value(ValueSet.UNKNOWN).build();

    private volatile int hashCode;

    private ChargeItemStatus(Builder builder) {
        super(builder);
    }

    public ValueSet getValueAsEnumConstant() {
        return (value != null) ? ValueSet.from(value) : null;
    }

    /**
     * Factory method for creating ChargeItemStatus objects from a passed enum value.
     */
    public static ChargeItemStatus of(ValueSet value) {
        switch (value) {
        case PLANNED:
            return PLANNED;
        case BILLABLE:
            return BILLABLE;
        case NOT_BILLABLE:
            return NOT_BILLABLE;
        case ABORTED:
            return ABORTED;
        case BILLED:
            return BILLED;
        case ENTERED_IN_ERROR:
            return ENTERED_IN_ERROR;
        case UNKNOWN:
            return UNKNOWN;
        default:
            throw new IllegalStateException(value.name());
        }
    }

    /**
     * Factory method for creating ChargeItemStatus objects from a passed string value.
     * 
     * @param value
     *     A string that matches one of the allowed code values
     * @throws IllegalArgumentException
     *     If the passed string cannot be parsed into an allowed code value
     */
    public static ChargeItemStatus of(java.lang.String value) {
        return of(ValueSet.from(value));
    }

    /**
     * Inhereted factory method for creating ChargeItemStatus objects from a passed string value.
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
     * Inhereted factory method for creating ChargeItemStatus objects from a passed string value.
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
        ChargeItemStatus other = (ChargeItemStatus) obj;
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
        public ChargeItemStatus build() {
            return new ChargeItemStatus(this);
        }
    }

    public enum ValueSet {
        /**
         * Planned
         * 
         * <p>The charge item has been entered, but the charged service is not yet complete, so it shall not be billed yet but 
         * might be used in the context of pre-authorization.
         */
        PLANNED("planned"),

        /**
         * Billable
         * 
         * <p>The charge item is ready for billing.
         */
        BILLABLE("billable"),

        /**
         * Not billable
         * 
         * <p>The charge item has been determined to be not billable (e.g. due to rules associated with the billing code).
         */
        NOT_BILLABLE("not-billable"),

        /**
         * Aborted
         * 
         * <p>The processing of the charge was aborted.
         */
        ABORTED("aborted"),

        /**
         * Billed
         * 
         * <p>The charge item has been billed (e.g. a billing engine has generated financial transactions by applying the 
         * associated ruled for the charge item to the context of the Encounter, and placed them into Claims/Invoices.
         */
        BILLED("billed"),

        /**
         * Entered in Error
         * 
         * <p>The charge item has been entered in error and should not be processed for billing.
         */
        ENTERED_IN_ERROR("entered-in-error"),

        /**
         * Unknown
         * 
         * <p>The authoring system does not know which of the status values currently applies for this charge item Note: This 
         * concept is not to be used for "other" - one of the listed statuses is presumed to apply, it's just not known which one.
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
         * Factory method for creating ChargeItemStatus.ValueSet values from a passed string value.
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

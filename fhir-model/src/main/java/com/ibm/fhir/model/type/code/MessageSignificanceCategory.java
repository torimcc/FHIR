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

@System("http://hl7.org/fhir/message-significance-category")
@Generated("com.ibm.fhir.tools.CodeGenerator")
public class MessageSignificanceCategory extends Code {
    /**
     * Consequence
     * 
     * <p>The message represents/requests a change that should not be processed more than once; e.g., making a booking for an 
     * appointment.
     */
    public static final MessageSignificanceCategory CONSEQUENCE = MessageSignificanceCategory.builder().value(ValueSet.CONSEQUENCE).build();

    /**
     * Currency
     * 
     * <p>The message represents a response to query for current information. Retrospective processing is wrong and/or 
     * wasteful.
     */
    public static final MessageSignificanceCategory CURRENCY = MessageSignificanceCategory.builder().value(ValueSet.CURRENCY).build();

    /**
     * Notification
     * 
     * <p>The content is not necessarily intended to be current, and it can be reprocessed, though there may be version 
     * issues created by processing old notifications.
     */
    public static final MessageSignificanceCategory NOTIFICATION = MessageSignificanceCategory.builder().value(ValueSet.NOTIFICATION).build();

    private volatile int hashCode;

    private MessageSignificanceCategory(Builder builder) {
        super(builder);
    }

    public ValueSet getValueAsEnumConstant() {
        return (value != null) ? ValueSet.from(value) : null;
    }

    /**
     * Factory method for creating MessageSignificanceCategory objects from a passed enum value.
     */
    public static MessageSignificanceCategory of(ValueSet value) {
        switch (value) {
        case CONSEQUENCE:
            return CONSEQUENCE;
        case CURRENCY:
            return CURRENCY;
        case NOTIFICATION:
            return NOTIFICATION;
        default:
            throw new IllegalStateException(value.name());
        }
    }

    /**
     * Factory method for creating MessageSignificanceCategory objects from a passed string value.
     * 
     * @param value
     *     A string that matches one of the allowed code values
     * @throws IllegalArgumentException
     *     If the passed string cannot be parsed into an allowed code value
     */
    public static MessageSignificanceCategory of(java.lang.String value) {
        return of(ValueSet.from(value));
    }

    /**
     * Inhereted factory method for creating MessageSignificanceCategory objects from a passed string value.
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
     * Inhereted factory method for creating MessageSignificanceCategory objects from a passed string value.
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
        MessageSignificanceCategory other = (MessageSignificanceCategory) obj;
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
        public MessageSignificanceCategory build() {
            return new MessageSignificanceCategory(this);
        }
    }

    public enum ValueSet {
        /**
         * Consequence
         * 
         * <p>The message represents/requests a change that should not be processed more than once; e.g., making a booking for an 
         * appointment.
         */
        CONSEQUENCE("consequence"),

        /**
         * Currency
         * 
         * <p>The message represents a response to query for current information. Retrospective processing is wrong and/or 
         * wasteful.
         */
        CURRENCY("currency"),

        /**
         * Notification
         * 
         * <p>The content is not necessarily intended to be current, and it can be reprocessed, though there may be version 
         * issues created by processing old notifications.
         */
        NOTIFICATION("notification");

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
         * Factory method for creating MessageSignificanceCategory.ValueSet values from a passed string value.
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

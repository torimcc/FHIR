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

@System("http://hl7.org/fhir/subscription-channel-type")
@Generated("com.ibm.fhir.tools.CodeGenerator")
public class SubscriptionChannelType extends Code {
    /**
     * Rest Hook
     * 
     * <p>The channel is executed by making a post to the URI. If a payload is included, the URL is interpreted as the 
     * service base, and an update (PUT) is made.
     */
    public static final SubscriptionChannelType REST_HOOK = SubscriptionChannelType.builder().value(ValueSet.REST_HOOK).build();

    /**
     * Websocket
     * 
     * <p>The channel is executed by sending a packet across a web socket connection maintained by the client. The URL 
     * identifies the websocket, and the client binds to this URL.
     */
    public static final SubscriptionChannelType WEBSOCKET = SubscriptionChannelType.builder().value(ValueSet.WEBSOCKET).build();

    /**
     * Email
     * 
     * <p>The channel is executed by sending an email to the email addressed in the URI (which must be a mailto:).
     */
    public static final SubscriptionChannelType EMAIL = SubscriptionChannelType.builder().value(ValueSet.EMAIL).build();

    /**
     * SMS
     * 
     * <p>The channel is executed by sending an SMS message to the phone number identified in the URL (tel:).
     */
    public static final SubscriptionChannelType SMS = SubscriptionChannelType.builder().value(ValueSet.SMS).build();

    /**
     * Message
     * 
     * <p>The channel is executed by sending a message (e.g. a Bundle with a MessageHeader resource etc.) to the application 
     * identified in the URI.
     */
    public static final SubscriptionChannelType MESSAGE = SubscriptionChannelType.builder().value(ValueSet.MESSAGE).build();

    private volatile int hashCode;

    private SubscriptionChannelType(Builder builder) {
        super(builder);
    }

    public ValueSet getValueAsEnumConstant() {
        return (value != null) ? ValueSet.from(value) : null;
    }

    /**
     * Factory method for creating SubscriptionChannelType objects from a passed enum value.
     */
    public static SubscriptionChannelType of(ValueSet value) {
        switch (value) {
        case REST_HOOK:
            return REST_HOOK;
        case WEBSOCKET:
            return WEBSOCKET;
        case EMAIL:
            return EMAIL;
        case SMS:
            return SMS;
        case MESSAGE:
            return MESSAGE;
        default:
            throw new IllegalStateException(value.name());
        }
    }

    /**
     * Factory method for creating SubscriptionChannelType objects from a passed string value.
     * 
     * @param value
     *     A string that matches one of the allowed code values
     * @throws IllegalArgumentException
     *     If the passed string cannot be parsed into an allowed code value
     */
    public static SubscriptionChannelType of(java.lang.String value) {
        return of(ValueSet.from(value));
    }

    /**
     * Inhereted factory method for creating SubscriptionChannelType objects from a passed string value.
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
     * Inhereted factory method for creating SubscriptionChannelType objects from a passed string value.
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
        SubscriptionChannelType other = (SubscriptionChannelType) obj;
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
        public SubscriptionChannelType build() {
            return new SubscriptionChannelType(this);
        }
    }

    public enum ValueSet {
        /**
         * Rest Hook
         * 
         * <p>The channel is executed by making a post to the URI. If a payload is included, the URL is interpreted as the 
         * service base, and an update (PUT) is made.
         */
        REST_HOOK("rest-hook"),

        /**
         * Websocket
         * 
         * <p>The channel is executed by sending a packet across a web socket connection maintained by the client. The URL 
         * identifies the websocket, and the client binds to this URL.
         */
        WEBSOCKET("websocket"),

        /**
         * Email
         * 
         * <p>The channel is executed by sending an email to the email addressed in the URI (which must be a mailto:).
         */
        EMAIL("email"),

        /**
         * SMS
         * 
         * <p>The channel is executed by sending an SMS message to the phone number identified in the URL (tel:).
         */
        SMS("sms"),

        /**
         * Message
         * 
         * <p>The channel is executed by sending a message (e.g. a Bundle with a MessageHeader resource etc.) to the application 
         * identified in the URI.
         */
        MESSAGE("message");

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
         * Factory method for creating SubscriptionChannelType.ValueSet values from a passed string value.
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

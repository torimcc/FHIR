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

@System("http://hl7.org/fhir/http-verb")
@Generated("com.ibm.fhir.tools.CodeGenerator")
public class HTTPVerb extends Code {
    /**
     * GET
     * 
     * <p>HTTP GET Command.
     */
    public static final HTTPVerb GET = HTTPVerb.builder().value(ValueSet.GET).build();

    /**
     * HEAD
     * 
     * <p>HTTP HEAD Command.
     */
    public static final HTTPVerb HEAD = HTTPVerb.builder().value(ValueSet.HEAD).build();

    /**
     * POST
     * 
     * <p>HTTP POST Command.
     */
    public static final HTTPVerb POST = HTTPVerb.builder().value(ValueSet.POST).build();

    /**
     * PUT
     * 
     * <p>HTTP PUT Command.
     */
    public static final HTTPVerb PUT = HTTPVerb.builder().value(ValueSet.PUT).build();

    /**
     * DELETE
     * 
     * <p>HTTP DELETE Command.
     */
    public static final HTTPVerb DELETE = HTTPVerb.builder().value(ValueSet.DELETE).build();

    /**
     * PATCH
     * 
     * <p>HTTP PATCH Command.
     */
    public static final HTTPVerb PATCH = HTTPVerb.builder().value(ValueSet.PATCH).build();

    private volatile int hashCode;

    private HTTPVerb(Builder builder) {
        super(builder);
    }

    public ValueSet getValueAsEnumConstant() {
        return (value != null) ? ValueSet.from(value) : null;
    }

    /**
     * Factory method for creating HTTPVerb objects from a passed enum value.
     */
    public static HTTPVerb of(ValueSet value) {
        switch (value) {
        case GET:
            return GET;
        case HEAD:
            return HEAD;
        case POST:
            return POST;
        case PUT:
            return PUT;
        case DELETE:
            return DELETE;
        case PATCH:
            return PATCH;
        default:
            throw new IllegalStateException(value.name());
        }
    }

    /**
     * Factory method for creating HTTPVerb objects from a passed string value.
     * 
     * @param value
     *     A string that matches one of the allowed code values
     * @throws IllegalArgumentException
     *     If the passed string cannot be parsed into an allowed code value
     */
    public static HTTPVerb of(java.lang.String value) {
        return of(ValueSet.from(value));
    }

    /**
     * Inhereted factory method for creating HTTPVerb objects from a passed string value.
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
     * Inhereted factory method for creating HTTPVerb objects from a passed string value.
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
        HTTPVerb other = (HTTPVerb) obj;
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
        public HTTPVerb build() {
            return new HTTPVerb(this);
        }
    }

    public enum ValueSet {
        /**
         * GET
         * 
         * <p>HTTP GET Command.
         */
        GET("GET"),

        /**
         * HEAD
         * 
         * <p>HTTP HEAD Command.
         */
        HEAD("HEAD"),

        /**
         * POST
         * 
         * <p>HTTP POST Command.
         */
        POST("POST"),

        /**
         * PUT
         * 
         * <p>HTTP PUT Command.
         */
        PUT("PUT"),

        /**
         * DELETE
         * 
         * <p>HTTP DELETE Command.
         */
        DELETE("DELETE"),

        /**
         * PATCH
         * 
         * <p>HTTP PATCH Command.
         */
        PATCH("PATCH");

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
         * Factory method for creating HTTPVerb.ValueSet values from a passed string value.
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

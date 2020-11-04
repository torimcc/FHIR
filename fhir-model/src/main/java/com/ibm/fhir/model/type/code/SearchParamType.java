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

@System("http://hl7.org/fhir/search-param-type")
@Generated("com.ibm.fhir.tools.CodeGenerator")
public class SearchParamType extends Code {
    /**
     * Number
     * 
     * <p>Search parameter SHALL be a number (a whole number, or a decimal).
     */
    public static final SearchParamType NUMBER = SearchParamType.builder().value(ValueSet.NUMBER).build();

    /**
     * Date/DateTime
     * 
     * <p>Search parameter is on a date/time. The date format is the standard XML format, though other formats may be 
     * supported.
     */
    public static final SearchParamType DATE = SearchParamType.builder().value(ValueSet.DATE).build();

    /**
     * String
     * 
     * <p>Search parameter is a simple string, like a name part. Search is case-insensitive and accent-insensitive. May match 
     * just the start of a string. String parameters may contain spaces.
     */
    public static final SearchParamType STRING = SearchParamType.builder().value(ValueSet.STRING).build();

    /**
     * Token
     * 
     * <p>Search parameter on a coded element or identifier. May be used to search through the text, display, code and 
     * code/codesystem (for codes) and label, system and key (for identifier). Its value is either a string or a pair of 
     * namespace and value, separated by a "|", depending on the modifier used.
     */
    public static final SearchParamType TOKEN = SearchParamType.builder().value(ValueSet.TOKEN).build();

    /**
     * Reference
     * 
     * <p>A reference to another resource (Reference or canonical).
     */
    public static final SearchParamType REFERENCE = SearchParamType.builder().value(ValueSet.REFERENCE).build();

    /**
     * Composite
     * 
     * <p>A composite search parameter that combines a search on two values together.
     */
    public static final SearchParamType COMPOSITE = SearchParamType.builder().value(ValueSet.COMPOSITE).build();

    /**
     * Quantity
     * 
     * <p>A search parameter that searches on a quantity.
     */
    public static final SearchParamType QUANTITY = SearchParamType.builder().value(ValueSet.QUANTITY).build();

    /**
     * URI
     * 
     * <p>A search parameter that searches on a URI (RFC 3986).
     */
    public static final SearchParamType URI = SearchParamType.builder().value(ValueSet.URI).build();

    /**
     * Special
     * 
     * <p>Special logic applies to this parameter per the description of the search parameter.
     */
    public static final SearchParamType SPECIAL = SearchParamType.builder().value(ValueSet.SPECIAL).build();

    private volatile int hashCode;

    private SearchParamType(Builder builder) {
        super(builder);
    }

    public ValueSet getValueAsEnumConstant() {
        return (value != null) ? ValueSet.from(value) : null;
    }

    /**
     * Factory method for creating SearchParamType objects from a passed enum value.
     */
    public static SearchParamType of(ValueSet value) {
        switch (value) {
        case NUMBER:
            return NUMBER;
        case DATE:
            return DATE;
        case STRING:
            return STRING;
        case TOKEN:
            return TOKEN;
        case REFERENCE:
            return REFERENCE;
        case COMPOSITE:
            return COMPOSITE;
        case QUANTITY:
            return QUANTITY;
        case URI:
            return URI;
        case SPECIAL:
            return SPECIAL;
        default:
            throw new IllegalStateException(value.name());
        }
    }

    /**
     * Factory method for creating SearchParamType objects from a passed string value.
     * 
     * @param value
     *     A string that matches one of the allowed code values
     * @throws IllegalArgumentException
     *     If the passed string cannot be parsed into an allowed code value
     */
    public static SearchParamType of(java.lang.String value) {
        return of(ValueSet.from(value));
    }

    /**
     * Inhereted factory method for creating SearchParamType objects from a passed string value.
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
     * Inhereted factory method for creating SearchParamType objects from a passed string value.
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
        SearchParamType other = (SearchParamType) obj;
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
        public SearchParamType build() {
            return new SearchParamType(this);
        }
    }

    public enum ValueSet {
        /**
         * Number
         * 
         * <p>Search parameter SHALL be a number (a whole number, or a decimal).
         */
        NUMBER("number"),

        /**
         * Date/DateTime
         * 
         * <p>Search parameter is on a date/time. The date format is the standard XML format, though other formats may be 
         * supported.
         */
        DATE("date"),

        /**
         * String
         * 
         * <p>Search parameter is a simple string, like a name part. Search is case-insensitive and accent-insensitive. May match 
         * just the start of a string. String parameters may contain spaces.
         */
        STRING("string"),

        /**
         * Token
         * 
         * <p>Search parameter on a coded element or identifier. May be used to search through the text, display, code and 
         * code/codesystem (for codes) and label, system and key (for identifier). Its value is either a string or a pair of 
         * namespace and value, separated by a "|", depending on the modifier used.
         */
        TOKEN("token"),

        /**
         * Reference
         * 
         * <p>A reference to another resource (Reference or canonical).
         */
        REFERENCE("reference"),

        /**
         * Composite
         * 
         * <p>A composite search parameter that combines a search on two values together.
         */
        COMPOSITE("composite"),

        /**
         * Quantity
         * 
         * <p>A search parameter that searches on a quantity.
         */
        QUANTITY("quantity"),

        /**
         * URI
         * 
         * <p>A search parameter that searches on a URI (RFC 3986).
         */
        URI("uri"),

        /**
         * Special
         * 
         * <p>Special logic applies to this parameter per the description of the search parameter.
         */
        SPECIAL("special");

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
         * Factory method for creating SearchParamType.ValueSet values from a passed string value.
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

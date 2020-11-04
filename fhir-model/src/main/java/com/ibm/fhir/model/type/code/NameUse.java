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

@System("http://hl7.org/fhir/name-use")
@Generated("com.ibm.fhir.tools.CodeGenerator")
public class NameUse extends Code {
    /**
     * Usual
     * 
     * <p>Known as/conventional/the one you normally use.
     */
    public static final NameUse USUAL = NameUse.builder().value(ValueSet.USUAL).build();

    /**
     * Official
     * 
     * <p>The formal name as registered in an official (government) registry, but which name might not be commonly used. May 
     * be called "legal name".
     */
    public static final NameUse OFFICIAL = NameUse.builder().value(ValueSet.OFFICIAL).build();

    /**
     * Temp
     * 
     * <p>A temporary name. Name.period can provide more detailed information. This may also be used for temporary names 
     * assigned at birth or in emergency situations.
     */
    public static final NameUse TEMP = NameUse.builder().value(ValueSet.TEMP).build();

    /**
     * Nickname
     * 
     * <p>A name that is used to address the person in an informal manner, but is not part of their formal or usual name.
     */
    public static final NameUse NICKNAME = NameUse.builder().value(ValueSet.NICKNAME).build();

    /**
     * Anonymous
     * 
     * <p>Anonymous assigned name, alias, or pseudonym (used to protect a person's identity for privacy reasons).
     */
    public static final NameUse ANONYMOUS = NameUse.builder().value(ValueSet.ANONYMOUS).build();

    /**
     * Old
     * 
     * <p>This name is no longer in use (or was never correct, but retained for records).
     */
    public static final NameUse OLD = NameUse.builder().value(ValueSet.OLD).build();

    /**
     * Name changed for Marriage
     * 
     * <p>A name used prior to changing name because of marriage. This name use is for use by applications that collect and 
     * store names that were used prior to a marriage. Marriage naming customs vary greatly around the world, and are 
     * constantly changing. This term is not gender specific. The use of this term does not imply any particular history for 
     * a person's name.
     */
    public static final NameUse MAIDEN = NameUse.builder().value(ValueSet.MAIDEN).build();

    private volatile int hashCode;

    private NameUse(Builder builder) {
        super(builder);
    }

    public ValueSet getValueAsEnumConstant() {
        return (value != null) ? ValueSet.from(value) : null;
    }

    /**
     * Factory method for creating NameUse objects from a passed enum value.
     */
    public static NameUse of(ValueSet value) {
        switch (value) {
        case USUAL:
            return USUAL;
        case OFFICIAL:
            return OFFICIAL;
        case TEMP:
            return TEMP;
        case NICKNAME:
            return NICKNAME;
        case ANONYMOUS:
            return ANONYMOUS;
        case OLD:
            return OLD;
        case MAIDEN:
            return MAIDEN;
        default:
            throw new IllegalStateException(value.name());
        }
    }

    /**
     * Factory method for creating NameUse objects from a passed string value.
     * 
     * @param value
     *     A string that matches one of the allowed code values
     * @throws IllegalArgumentException
     *     If the passed string cannot be parsed into an allowed code value
     */
    public static NameUse of(java.lang.String value) {
        return of(ValueSet.from(value));
    }

    /**
     * Inhereted factory method for creating NameUse objects from a passed string value.
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
     * Inhereted factory method for creating NameUse objects from a passed string value.
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
        NameUse other = (NameUse) obj;
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
        public NameUse build() {
            return new NameUse(this);
        }
    }

    public enum ValueSet {
        /**
         * Usual
         * 
         * <p>Known as/conventional/the one you normally use.
         */
        USUAL("usual"),

        /**
         * Official
         * 
         * <p>The formal name as registered in an official (government) registry, but which name might not be commonly used. May 
         * be called "legal name".
         */
        OFFICIAL("official"),

        /**
         * Temp
         * 
         * <p>A temporary name. Name.period can provide more detailed information. This may also be used for temporary names 
         * assigned at birth or in emergency situations.
         */
        TEMP("temp"),

        /**
         * Nickname
         * 
         * <p>A name that is used to address the person in an informal manner, but is not part of their formal or usual name.
         */
        NICKNAME("nickname"),

        /**
         * Anonymous
         * 
         * <p>Anonymous assigned name, alias, or pseudonym (used to protect a person's identity for privacy reasons).
         */
        ANONYMOUS("anonymous"),

        /**
         * Old
         * 
         * <p>This name is no longer in use (or was never correct, but retained for records).
         */
        OLD("old"),

        /**
         * Name changed for Marriage
         * 
         * <p>A name used prior to changing name because of marriage. This name use is for use by applications that collect and 
         * store names that were used prior to a marriage. Marriage naming customs vary greatly around the world, and are 
         * constantly changing. This term is not gender specific. The use of this term does not imply any particular history for 
         * a person's name.
         */
        MAIDEN("maiden");

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
         * Factory method for creating NameUse.ValueSet values from a passed string value.
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

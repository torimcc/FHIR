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

@System("http://hl7.org/fhir/days-of-week")
@Generated("com.ibm.fhir.tools.CodeGenerator")
public class DaysOfWeek extends Code {
    /**
     * Monday
     * 
     * <p>Monday.
     */
    public static final DaysOfWeek MON = DaysOfWeek.builder().value(ValueSet.MON).build();

    /**
     * Tuesday
     * 
     * <p>Tuesday.
     */
    public static final DaysOfWeek TUE = DaysOfWeek.builder().value(ValueSet.TUE).build();

    /**
     * Wednesday
     * 
     * <p>Wednesday.
     */
    public static final DaysOfWeek WED = DaysOfWeek.builder().value(ValueSet.WED).build();

    /**
     * Thursday
     * 
     * <p>Thursday.
     */
    public static final DaysOfWeek THU = DaysOfWeek.builder().value(ValueSet.THU).build();

    /**
     * Friday
     * 
     * <p>Friday.
     */
    public static final DaysOfWeek FRI = DaysOfWeek.builder().value(ValueSet.FRI).build();

    /**
     * Saturday
     * 
     * <p>Saturday.
     */
    public static final DaysOfWeek SAT = DaysOfWeek.builder().value(ValueSet.SAT).build();

    /**
     * Sunday
     * 
     * <p>Sunday.
     */
    public static final DaysOfWeek SUN = DaysOfWeek.builder().value(ValueSet.SUN).build();

    private volatile int hashCode;

    private DaysOfWeek(Builder builder) {
        super(builder);
    }

    public ValueSet getValueAsEnumConstant() {
        return (value != null) ? ValueSet.from(value) : null;
    }

    /**
     * Factory method for creating DaysOfWeek objects from a passed enum value.
     */
    public static DaysOfWeek of(ValueSet value) {
        switch (value) {
        case MON:
            return MON;
        case TUE:
            return TUE;
        case WED:
            return WED;
        case THU:
            return THU;
        case FRI:
            return FRI;
        case SAT:
            return SAT;
        case SUN:
            return SUN;
        default:
            throw new IllegalStateException(value.name());
        }
    }

    /**
     * Factory method for creating DaysOfWeek objects from a passed string value.
     * 
     * @param value
     *     A string that matches one of the allowed code values
     * @throws IllegalArgumentException
     *     If the passed string cannot be parsed into an allowed code value
     */
    public static DaysOfWeek of(java.lang.String value) {
        return of(ValueSet.from(value));
    }

    /**
     * Inhereted factory method for creating DaysOfWeek objects from a passed string value.
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
     * Inhereted factory method for creating DaysOfWeek objects from a passed string value.
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
        DaysOfWeek other = (DaysOfWeek) obj;
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
        public DaysOfWeek build() {
            return new DaysOfWeek(this);
        }
    }

    public enum ValueSet {
        /**
         * Monday
         * 
         * <p>Monday.
         */
        MON("mon"),

        /**
         * Tuesday
         * 
         * <p>Tuesday.
         */
        TUE("tue"),

        /**
         * Wednesday
         * 
         * <p>Wednesday.
         */
        WED("wed"),

        /**
         * Thursday
         * 
         * <p>Thursday.
         */
        THU("thu"),

        /**
         * Friday
         * 
         * <p>Friday.
         */
        FRI("fri"),

        /**
         * Saturday
         * 
         * <p>Saturday.
         */
        SAT("sat"),

        /**
         * Sunday
         * 
         * <p>Sunday.
         */
        SUN("sun");

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
         * Factory method for creating DaysOfWeek.ValueSet values from a passed string value.
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

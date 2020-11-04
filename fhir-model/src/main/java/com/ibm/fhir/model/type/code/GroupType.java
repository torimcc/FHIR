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

@System("http://hl7.org/fhir/group-type")
@Generated("com.ibm.fhir.tools.CodeGenerator")
public class GroupType extends Code {
    /**
     * Person
     * 
     * <p>Group contains "person" Patient resources.
     */
    public static final GroupType PERSON = GroupType.builder().value(ValueSet.PERSON).build();

    /**
     * Animal
     * 
     * <p>Group contains "animal" Patient resources.
     */
    public static final GroupType ANIMAL = GroupType.builder().value(ValueSet.ANIMAL).build();

    /**
     * Practitioner
     * 
     * <p>Group contains healthcare practitioner resources (Practitioner or PractitionerRole).
     */
    public static final GroupType PRACTITIONER = GroupType.builder().value(ValueSet.PRACTITIONER).build();

    /**
     * Device
     * 
     * <p>Group contains Device resources.
     */
    public static final GroupType DEVICE = GroupType.builder().value(ValueSet.DEVICE).build();

    /**
     * Medication
     * 
     * <p>Group contains Medication resources.
     */
    public static final GroupType MEDICATION = GroupType.builder().value(ValueSet.MEDICATION).build();

    /**
     * Substance
     * 
     * <p>Group contains Substance resources.
     */
    public static final GroupType SUBSTANCE = GroupType.builder().value(ValueSet.SUBSTANCE).build();

    private volatile int hashCode;

    private GroupType(Builder builder) {
        super(builder);
    }

    public ValueSet getValueAsEnumConstant() {
        return (value != null) ? ValueSet.from(value) : null;
    }

    /**
     * Factory method for creating GroupType objects from a passed enum value.
     */
    public static GroupType of(ValueSet value) {
        switch (value) {
        case PERSON:
            return PERSON;
        case ANIMAL:
            return ANIMAL;
        case PRACTITIONER:
            return PRACTITIONER;
        case DEVICE:
            return DEVICE;
        case MEDICATION:
            return MEDICATION;
        case SUBSTANCE:
            return SUBSTANCE;
        default:
            throw new IllegalStateException(value.name());
        }
    }

    /**
     * Factory method for creating GroupType objects from a passed string value.
     * 
     * @param value
     *     A string that matches one of the allowed code values
     * @throws IllegalArgumentException
     *     If the passed string cannot be parsed into an allowed code value
     */
    public static GroupType of(java.lang.String value) {
        return of(ValueSet.from(value));
    }

    /**
     * Inhereted factory method for creating GroupType objects from a passed string value.
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
     * Inhereted factory method for creating GroupType objects from a passed string value.
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
        GroupType other = (GroupType) obj;
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
        public GroupType build() {
            return new GroupType(this);
        }
    }

    public enum ValueSet {
        /**
         * Person
         * 
         * <p>Group contains "person" Patient resources.
         */
        PERSON("person"),

        /**
         * Animal
         * 
         * <p>Group contains "animal" Patient resources.
         */
        ANIMAL("animal"),

        /**
         * Practitioner
         * 
         * <p>Group contains healthcare practitioner resources (Practitioner or PractitionerRole).
         */
        PRACTITIONER("practitioner"),

        /**
         * Device
         * 
         * <p>Group contains Device resources.
         */
        DEVICE("device"),

        /**
         * Medication
         * 
         * <p>Group contains Medication resources.
         */
        MEDICATION("medication"),

        /**
         * Substance
         * 
         * <p>Group contains Substance resources.
         */
        SUBSTANCE("substance");

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
         * Factory method for creating GroupType.ValueSet values from a passed string value.
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

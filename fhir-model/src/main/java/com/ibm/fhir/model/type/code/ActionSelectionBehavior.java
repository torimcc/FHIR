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

@System("http://hl7.org/fhir/action-selection-behavior")
@Generated("com.ibm.fhir.tools.CodeGenerator")
public class ActionSelectionBehavior extends Code {
    /**
     * Any
     * 
     * <p>Any number of the actions in the group may be chosen, from zero to all.
     */
    public static final ActionSelectionBehavior ANY = ActionSelectionBehavior.builder().value(ValueSet.ANY).build();

    /**
     * All
     * 
     * <p>All the actions in the group must be selected as a single unit.
     */
    public static final ActionSelectionBehavior ALL = ActionSelectionBehavior.builder().value(ValueSet.ALL).build();

    /**
     * All Or None
     * 
     * <p>All the actions in the group are meant to be chosen as a single unit: either all must be selected by the end user, 
     * or none may be selected.
     */
    public static final ActionSelectionBehavior ALL_OR_NONE = ActionSelectionBehavior.builder().value(ValueSet.ALL_OR_NONE).build();

    /**
     * Exactly One
     * 
     * <p>The end user must choose one and only one of the selectable actions in the group. The user SHALL NOT choose none of 
     * the actions in the group.
     */
    public static final ActionSelectionBehavior EXACTLY_ONE = ActionSelectionBehavior.builder().value(ValueSet.EXACTLY_ONE).build();

    /**
     * At Most One
     * 
     * <p>The end user may choose zero or at most one of the actions in the group.
     */
    public static final ActionSelectionBehavior AT_MOST_ONE = ActionSelectionBehavior.builder().value(ValueSet.AT_MOST_ONE).build();

    /**
     * One Or More
     * 
     * <p>The end user must choose a minimum of one, and as many additional as desired.
     */
    public static final ActionSelectionBehavior ONE_OR_MORE = ActionSelectionBehavior.builder().value(ValueSet.ONE_OR_MORE).build();

    private volatile int hashCode;

    private ActionSelectionBehavior(Builder builder) {
        super(builder);
    }

    public ValueSet getValueAsEnumConstant() {
        return (value != null) ? ValueSet.from(value) : null;
    }

    /**
     * Factory method for creating ActionSelectionBehavior objects from a passed enum value.
     */
    public static ActionSelectionBehavior of(ValueSet value) {
        switch (value) {
        case ANY:
            return ANY;
        case ALL:
            return ALL;
        case ALL_OR_NONE:
            return ALL_OR_NONE;
        case EXACTLY_ONE:
            return EXACTLY_ONE;
        case AT_MOST_ONE:
            return AT_MOST_ONE;
        case ONE_OR_MORE:
            return ONE_OR_MORE;
        default:
            throw new IllegalStateException(value.name());
        }
    }

    /**
     * Factory method for creating ActionSelectionBehavior objects from a passed string value.
     * 
     * @param value
     *     A string that matches one of the allowed code values
     * @throws IllegalArgumentException
     *     If the passed string cannot be parsed into an allowed code value
     */
    public static ActionSelectionBehavior of(java.lang.String value) {
        return of(ValueSet.from(value));
    }

    /**
     * Inhereted factory method for creating ActionSelectionBehavior objects from a passed string value.
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
     * Inhereted factory method for creating ActionSelectionBehavior objects from a passed string value.
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
        ActionSelectionBehavior other = (ActionSelectionBehavior) obj;
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
        public ActionSelectionBehavior build() {
            return new ActionSelectionBehavior(this);
        }
    }

    public enum ValueSet {
        /**
         * Any
         * 
         * <p>Any number of the actions in the group may be chosen, from zero to all.
         */
        ANY("any"),

        /**
         * All
         * 
         * <p>All the actions in the group must be selected as a single unit.
         */
        ALL("all"),

        /**
         * All Or None
         * 
         * <p>All the actions in the group are meant to be chosen as a single unit: either all must be selected by the end user, 
         * or none may be selected.
         */
        ALL_OR_NONE("all-or-none"),

        /**
         * Exactly One
         * 
         * <p>The end user must choose one and only one of the selectable actions in the group. The user SHALL NOT choose none of 
         * the actions in the group.
         */
        EXACTLY_ONE("exactly-one"),

        /**
         * At Most One
         * 
         * <p>The end user may choose zero or at most one of the actions in the group.
         */
        AT_MOST_ONE("at-most-one"),

        /**
         * One Or More
         * 
         * <p>The end user must choose a minimum of one, and as many additional as desired.
         */
        ONE_OR_MORE("one-or-more");

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
         * Factory method for creating ActionSelectionBehavior.ValueSet values from a passed string value.
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

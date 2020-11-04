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

@System("http://hl7.org/fhir/goal-status")
@Generated("com.ibm.fhir.tools.CodeGenerator")
public class GoalLifecycleStatus extends Code {
    /**
     * Proposed
     * 
     * <p>A goal is proposed for this patient.
     */
    public static final GoalLifecycleStatus PROPOSED = GoalLifecycleStatus.builder().value(ValueSet.PROPOSED).build();

    /**
     * Planned
     * 
     * <p>A goal is planned for this patient.
     */
    public static final GoalLifecycleStatus PLANNED = GoalLifecycleStatus.builder().value(ValueSet.PLANNED).build();

    /**
     * Accepted
     * 
     * <p>A proposed goal was accepted or acknowledged.
     */
    public static final GoalLifecycleStatus ACCEPTED = GoalLifecycleStatus.builder().value(ValueSet.ACCEPTED).build();

    /**
     * Active
     * 
     * <p>The goal is being sought actively.
     */
    public static final GoalLifecycleStatus ACTIVE = GoalLifecycleStatus.builder().value(ValueSet.ACTIVE).build();

    /**
     * On Hold
     * 
     * <p>The goal remains a long term objective but is no longer being actively pursued for a temporary period of time.
     */
    public static final GoalLifecycleStatus ON_HOLD = GoalLifecycleStatus.builder().value(ValueSet.ON_HOLD).build();

    /**
     * Completed
     * 
     * <p>The goal is no longer being sought.
     */
    public static final GoalLifecycleStatus COMPLETED = GoalLifecycleStatus.builder().value(ValueSet.COMPLETED).build();

    /**
     * Cancelled
     * 
     * <p>The goal has been abandoned.
     */
    public static final GoalLifecycleStatus CANCELLED = GoalLifecycleStatus.builder().value(ValueSet.CANCELLED).build();

    /**
     * Entered in Error
     * 
     * <p>The goal was entered in error and voided.
     */
    public static final GoalLifecycleStatus ENTERED_IN_ERROR = GoalLifecycleStatus.builder().value(ValueSet.ENTERED_IN_ERROR).build();

    /**
     * Rejected
     * 
     * <p>A proposed goal was rejected.
     */
    public static final GoalLifecycleStatus REJECTED = GoalLifecycleStatus.builder().value(ValueSet.REJECTED).build();

    private volatile int hashCode;

    private GoalLifecycleStatus(Builder builder) {
        super(builder);
    }

    public ValueSet getValueAsEnumConstant() {
        return (value != null) ? ValueSet.from(value) : null;
    }

    /**
     * Factory method for creating GoalLifecycleStatus objects from a passed enum value.
     */
    public static GoalLifecycleStatus of(ValueSet value) {
        switch (value) {
        case PROPOSED:
            return PROPOSED;
        case PLANNED:
            return PLANNED;
        case ACCEPTED:
            return ACCEPTED;
        case ACTIVE:
            return ACTIVE;
        case ON_HOLD:
            return ON_HOLD;
        case COMPLETED:
            return COMPLETED;
        case CANCELLED:
            return CANCELLED;
        case ENTERED_IN_ERROR:
            return ENTERED_IN_ERROR;
        case REJECTED:
            return REJECTED;
        default:
            throw new IllegalStateException(value.name());
        }
    }

    /**
     * Factory method for creating GoalLifecycleStatus objects from a passed string value.
     * 
     * @param value
     *     A string that matches one of the allowed code values
     * @throws IllegalArgumentException
     *     If the passed string cannot be parsed into an allowed code value
     */
    public static GoalLifecycleStatus of(java.lang.String value) {
        return of(ValueSet.from(value));
    }

    /**
     * Inhereted factory method for creating GoalLifecycleStatus objects from a passed string value.
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
     * Inhereted factory method for creating GoalLifecycleStatus objects from a passed string value.
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
        GoalLifecycleStatus other = (GoalLifecycleStatus) obj;
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
        public GoalLifecycleStatus build() {
            return new GoalLifecycleStatus(this);
        }
    }

    public enum ValueSet {
        /**
         * Proposed
         * 
         * <p>A goal is proposed for this patient.
         */
        PROPOSED("proposed"),

        /**
         * Planned
         * 
         * <p>A goal is planned for this patient.
         */
        PLANNED("planned"),

        /**
         * Accepted
         * 
         * <p>A proposed goal was accepted or acknowledged.
         */
        ACCEPTED("accepted"),

        /**
         * Active
         * 
         * <p>The goal is being sought actively.
         */
        ACTIVE("active"),

        /**
         * On Hold
         * 
         * <p>The goal remains a long term objective but is no longer being actively pursued for a temporary period of time.
         */
        ON_HOLD("on-hold"),

        /**
         * Completed
         * 
         * <p>The goal is no longer being sought.
         */
        COMPLETED("completed"),

        /**
         * Cancelled
         * 
         * <p>The goal has been abandoned.
         */
        CANCELLED("cancelled"),

        /**
         * Entered in Error
         * 
         * <p>The goal was entered in error and voided.
         */
        ENTERED_IN_ERROR("entered-in-error"),

        /**
         * Rejected
         * 
         * <p>A proposed goal was rejected.
         */
        REJECTED("rejected");

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
         * Factory method for creating GoalLifecycleStatus.ValueSet values from a passed string value.
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

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

@System("http://hl7.org/fhir/task-status")
@Generated("com.ibm.fhir.tools.CodeGenerator")
public class TaskStatus extends Code {
    /**
     * Draft
     * 
     * <p>The task is not yet ready to be acted upon.
     */
    public static final TaskStatus DRAFT = TaskStatus.builder().value(ValueSet.DRAFT).build();

    /**
     * Requested
     * 
     * <p>The task is ready to be acted upon and action is sought.
     */
    public static final TaskStatus REQUESTED = TaskStatus.builder().value(ValueSet.REQUESTED).build();

    /**
     * Received
     * 
     * <p>A potential performer has claimed ownership of the task and is evaluating whether to perform it.
     */
    public static final TaskStatus RECEIVED = TaskStatus.builder().value(ValueSet.RECEIVED).build();

    /**
     * Accepted
     * 
     * <p>The potential performer has agreed to execute the task but has not yet started work.
     */
    public static final TaskStatus ACCEPTED = TaskStatus.builder().value(ValueSet.ACCEPTED).build();

    /**
     * Rejected
     * 
     * <p>The potential performer who claimed ownership of the task has decided not to execute it prior to performing any 
     * action.
     */
    public static final TaskStatus REJECTED = TaskStatus.builder().value(ValueSet.REJECTED).build();

    /**
     * Ready
     * 
     * <p>The task is ready to be performed, but no action has yet been taken. Used in place of 
     * requested/received/accepted/rejected when request assignment and acceptance is a given.
     */
    public static final TaskStatus READY = TaskStatus.builder().value(ValueSet.READY).build();

    /**
     * Cancelled
     * 
     * <p>The task was not completed.
     */
    public static final TaskStatus CANCELLED = TaskStatus.builder().value(ValueSet.CANCELLED).build();

    /**
     * In Progress
     * 
     * <p>The task has been started but is not yet complete.
     */
    public static final TaskStatus IN_PROGRESS = TaskStatus.builder().value(ValueSet.IN_PROGRESS).build();

    /**
     * On Hold
     * 
     * <p>The task has been started but work has been paused.
     */
    public static final TaskStatus ON_HOLD = TaskStatus.builder().value(ValueSet.ON_HOLD).build();

    /**
     * Failed
     * 
     * <p>The task was attempted but could not be completed due to some error.
     */
    public static final TaskStatus FAILED = TaskStatus.builder().value(ValueSet.FAILED).build();

    /**
     * Completed
     * 
     * <p>The task has been completed.
     */
    public static final TaskStatus COMPLETED = TaskStatus.builder().value(ValueSet.COMPLETED).build();

    /**
     * Entered in Error
     * 
     * <p>The task should never have existed and is retained only because of the possibility it may have used.
     */
    public static final TaskStatus ENTERED_IN_ERROR = TaskStatus.builder().value(ValueSet.ENTERED_IN_ERROR).build();

    private volatile int hashCode;

    private TaskStatus(Builder builder) {
        super(builder);
    }

    public ValueSet getValueAsEnumConstant() {
        return (value != null) ? ValueSet.from(value) : null;
    }

    /**
     * Factory method for creating TaskStatus objects from a passed enum value.
     */
    public static TaskStatus of(ValueSet value) {
        switch (value) {
        case DRAFT:
            return DRAFT;
        case REQUESTED:
            return REQUESTED;
        case RECEIVED:
            return RECEIVED;
        case ACCEPTED:
            return ACCEPTED;
        case REJECTED:
            return REJECTED;
        case READY:
            return READY;
        case CANCELLED:
            return CANCELLED;
        case IN_PROGRESS:
            return IN_PROGRESS;
        case ON_HOLD:
            return ON_HOLD;
        case FAILED:
            return FAILED;
        case COMPLETED:
            return COMPLETED;
        case ENTERED_IN_ERROR:
            return ENTERED_IN_ERROR;
        default:
            throw new IllegalStateException(value.name());
        }
    }

    /**
     * Factory method for creating TaskStatus objects from a passed string value.
     * 
     * @param value
     *     A string that matches one of the allowed code values
     * @throws IllegalArgumentException
     *     If the passed string cannot be parsed into an allowed code value
     */
    public static TaskStatus of(java.lang.String value) {
        return of(ValueSet.from(value));
    }

    /**
     * Inhereted factory method for creating TaskStatus objects from a passed string value.
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
     * Inhereted factory method for creating TaskStatus objects from a passed string value.
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
        TaskStatus other = (TaskStatus) obj;
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
        public TaskStatus build() {
            return new TaskStatus(this);
        }
    }

    public enum ValueSet {
        /**
         * Draft
         * 
         * <p>The task is not yet ready to be acted upon.
         */
        DRAFT("draft"),

        /**
         * Requested
         * 
         * <p>The task is ready to be acted upon and action is sought.
         */
        REQUESTED("requested"),

        /**
         * Received
         * 
         * <p>A potential performer has claimed ownership of the task and is evaluating whether to perform it.
         */
        RECEIVED("received"),

        /**
         * Accepted
         * 
         * <p>The potential performer has agreed to execute the task but has not yet started work.
         */
        ACCEPTED("accepted"),

        /**
         * Rejected
         * 
         * <p>The potential performer who claimed ownership of the task has decided not to execute it prior to performing any 
         * action.
         */
        REJECTED("rejected"),

        /**
         * Ready
         * 
         * <p>The task is ready to be performed, but no action has yet been taken. Used in place of 
         * requested/received/accepted/rejected when request assignment and acceptance is a given.
         */
        READY("ready"),

        /**
         * Cancelled
         * 
         * <p>The task was not completed.
         */
        CANCELLED("cancelled"),

        /**
         * In Progress
         * 
         * <p>The task has been started but is not yet complete.
         */
        IN_PROGRESS("in-progress"),

        /**
         * On Hold
         * 
         * <p>The task has been started but work has been paused.
         */
        ON_HOLD("on-hold"),

        /**
         * Failed
         * 
         * <p>The task was attempted but could not be completed due to some error.
         */
        FAILED("failed"),

        /**
         * Completed
         * 
         * <p>The task has been completed.
         */
        COMPLETED("completed"),

        /**
         * Entered in Error
         * 
         * <p>The task should never have existed and is retained only because of the possibility it may have used.
         */
        ENTERED_IN_ERROR("entered-in-error");

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
         * Factory method for creating TaskStatus.ValueSet values from a passed string value.
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

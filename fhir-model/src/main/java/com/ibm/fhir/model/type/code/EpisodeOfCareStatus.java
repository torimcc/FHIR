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

@System("http://hl7.org/fhir/episode-of-care-status")
@Generated("com.ibm.fhir.tools.CodeGenerator")
public class EpisodeOfCareStatus extends Code {
    /**
     * Planned
     * 
     * <p>This episode of care is planned to start at the date specified in the period.start. During this status, an 
     * organization may perform assessments to determine if the patient is eligible to receive services, or be organizing to 
     * make resources available to provide care services.
     */
    public static final EpisodeOfCareStatus PLANNED = EpisodeOfCareStatus.builder().value(ValueSet.PLANNED).build();

    /**
     * Waitlist
     * 
     * <p>This episode has been placed on a waitlist, pending the episode being made active (or cancelled).
     */
    public static final EpisodeOfCareStatus WAITLIST = EpisodeOfCareStatus.builder().value(ValueSet.WAITLIST).build();

    /**
     * Active
     * 
     * <p>This episode of care is current.
     */
    public static final EpisodeOfCareStatus ACTIVE = EpisodeOfCareStatus.builder().value(ValueSet.ACTIVE).build();

    /**
     * On Hold
     * 
     * <p>This episode of care is on hold; the organization has limited responsibility for the patient (such as while on 
     * respite).
     */
    public static final EpisodeOfCareStatus ONHOLD = EpisodeOfCareStatus.builder().value(ValueSet.ONHOLD).build();

    /**
     * Finished
     * 
     * <p>This episode of care is finished and the organization is not expecting to be providing further care to the patient. 
     * Can also be known as "closed", "completed" or other similar terms.
     */
    public static final EpisodeOfCareStatus FINISHED = EpisodeOfCareStatus.builder().value(ValueSet.FINISHED).build();

    /**
     * Cancelled
     * 
     * <p>The episode of care was cancelled, or withdrawn from service, often selected during the planned stage as the 
     * patient may have gone elsewhere, or the circumstances have changed and the organization is unable to provide the care. 
     * It indicates that services terminated outside the planned/expected workflow.
     */
    public static final EpisodeOfCareStatus CANCELLED = EpisodeOfCareStatus.builder().value(ValueSet.CANCELLED).build();

    /**
     * Entered in Error
     * 
     * <p>This instance should not have been part of this patient's medical record.
     */
    public static final EpisodeOfCareStatus ENTERED_IN_ERROR = EpisodeOfCareStatus.builder().value(ValueSet.ENTERED_IN_ERROR).build();

    private volatile int hashCode;

    private EpisodeOfCareStatus(Builder builder) {
        super(builder);
    }

    public ValueSet getValueAsEnumConstant() {
        return (value != null) ? ValueSet.from(value) : null;
    }

    /**
     * Factory method for creating EpisodeOfCareStatus objects from a passed enum value.
     */
    public static EpisodeOfCareStatus of(ValueSet value) {
        switch (value) {
        case PLANNED:
            return PLANNED;
        case WAITLIST:
            return WAITLIST;
        case ACTIVE:
            return ACTIVE;
        case ONHOLD:
            return ONHOLD;
        case FINISHED:
            return FINISHED;
        case CANCELLED:
            return CANCELLED;
        case ENTERED_IN_ERROR:
            return ENTERED_IN_ERROR;
        default:
            throw new IllegalStateException(value.name());
        }
    }

    /**
     * Factory method for creating EpisodeOfCareStatus objects from a passed string value.
     * 
     * @param value
     *     A string that matches one of the allowed code values
     * @throws IllegalArgumentException
     *     If the passed string cannot be parsed into an allowed code value
     */
    public static EpisodeOfCareStatus of(java.lang.String value) {
        return of(ValueSet.from(value));
    }

    /**
     * Inhereted factory method for creating EpisodeOfCareStatus objects from a passed string value.
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
     * Inhereted factory method for creating EpisodeOfCareStatus objects from a passed string value.
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
        EpisodeOfCareStatus other = (EpisodeOfCareStatus) obj;
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
        public EpisodeOfCareStatus build() {
            return new EpisodeOfCareStatus(this);
        }
    }

    public enum ValueSet {
        /**
         * Planned
         * 
         * <p>This episode of care is planned to start at the date specified in the period.start. During this status, an 
         * organization may perform assessments to determine if the patient is eligible to receive services, or be organizing to 
         * make resources available to provide care services.
         */
        PLANNED("planned"),

        /**
         * Waitlist
         * 
         * <p>This episode has been placed on a waitlist, pending the episode being made active (or cancelled).
         */
        WAITLIST("waitlist"),

        /**
         * Active
         * 
         * <p>This episode of care is current.
         */
        ACTIVE("active"),

        /**
         * On Hold
         * 
         * <p>This episode of care is on hold; the organization has limited responsibility for the patient (such as while on 
         * respite).
         */
        ONHOLD("onhold"),

        /**
         * Finished
         * 
         * <p>This episode of care is finished and the organization is not expecting to be providing further care to the patient. 
         * Can also be known as "closed", "completed" or other similar terms.
         */
        FINISHED("finished"),

        /**
         * Cancelled
         * 
         * <p>The episode of care was cancelled, or withdrawn from service, often selected during the planned stage as the 
         * patient may have gone elsewhere, or the circumstances have changed and the organization is unable to provide the care. 
         * It indicates that services terminated outside the planned/expected workflow.
         */
        CANCELLED("cancelled"),

        /**
         * Entered in Error
         * 
         * <p>This instance should not have been part of this patient's medical record.
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
         * Factory method for creating EpisodeOfCareStatus.ValueSet values from a passed string value.
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

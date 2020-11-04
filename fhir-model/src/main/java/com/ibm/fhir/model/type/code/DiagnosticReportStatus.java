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

@System("http://hl7.org/fhir/diagnostic-report-status")
@Generated("com.ibm.fhir.tools.CodeGenerator")
public class DiagnosticReportStatus extends Code {
    /**
     * Registered
     * 
     * <p>The existence of the report is registered, but there is nothing yet available.
     */
    public static final DiagnosticReportStatus REGISTERED = DiagnosticReportStatus.builder().value(ValueSet.REGISTERED).build();

    /**
     * Partial
     * 
     * <p>This is a partial (e.g. initial, interim or preliminary) report: data in the report may be incomplete or unverified.
     */
    public static final DiagnosticReportStatus PARTIAL = DiagnosticReportStatus.builder().value(ValueSet.PARTIAL).build();

    /**
     * Preliminary
     * 
     * <p>Verified early results are available, but not all results are final.
     */
    public static final DiagnosticReportStatus PRELIMINARY = DiagnosticReportStatus.builder().value(ValueSet.PRELIMINARY).build();

    /**
     * Final
     * 
     * <p>The report is complete and verified by an authorized person.
     */
    public static final DiagnosticReportStatus FINAL = DiagnosticReportStatus.builder().value(ValueSet.FINAL).build();

    /**
     * Amended
     * 
     * <p>Subsequent to being final, the report has been modified. This includes any change in the results, diagnosis, 
     * narrative text, or other content of a report that has been issued.
     */
    public static final DiagnosticReportStatus AMENDED = DiagnosticReportStatus.builder().value(ValueSet.AMENDED).build();

    /**
     * Corrected
     * 
     * <p>Subsequent to being final, the report has been modified to correct an error in the report or referenced results.
     */
    public static final DiagnosticReportStatus CORRECTED = DiagnosticReportStatus.builder().value(ValueSet.CORRECTED).build();

    /**
     * Appended
     * 
     * <p>Subsequent to being final, the report has been modified by adding new content. The existing content is unchanged.
     */
    public static final DiagnosticReportStatus APPENDED = DiagnosticReportStatus.builder().value(ValueSet.APPENDED).build();

    /**
     * Cancelled
     * 
     * <p>The report is unavailable because the measurement was not started or not completed (also sometimes called 
     * "aborted").
     */
    public static final DiagnosticReportStatus CANCELLED = DiagnosticReportStatus.builder().value(ValueSet.CANCELLED).build();

    /**
     * Entered in Error
     * 
     * <p>The report has been withdrawn following a previous final release. This electronic record should never have existed, 
     * though it is possible that real-world decisions were based on it. (If real-world activity has occurred, the status 
     * should be "cancelled" rather than "entered-in-error".).
     */
    public static final DiagnosticReportStatus ENTERED_IN_ERROR = DiagnosticReportStatus.builder().value(ValueSet.ENTERED_IN_ERROR).build();

    /**
     * Unknown
     * 
     * <p>The authoring/source system does not know which of the status values currently applies for this observation. Note: 
     * This concept is not to be used for "other" - one of the listed statuses is presumed to apply, but the authoring/source 
     * system does not know which.
     */
    public static final DiagnosticReportStatus UNKNOWN = DiagnosticReportStatus.builder().value(ValueSet.UNKNOWN).build();

    private volatile int hashCode;

    private DiagnosticReportStatus(Builder builder) {
        super(builder);
    }

    public ValueSet getValueAsEnumConstant() {
        return (value != null) ? ValueSet.from(value) : null;
    }

    /**
     * Factory method for creating DiagnosticReportStatus objects from a passed enum value.
     */
    public static DiagnosticReportStatus of(ValueSet value) {
        switch (value) {
        case REGISTERED:
            return REGISTERED;
        case PARTIAL:
            return PARTIAL;
        case PRELIMINARY:
            return PRELIMINARY;
        case FINAL:
            return FINAL;
        case AMENDED:
            return AMENDED;
        case CORRECTED:
            return CORRECTED;
        case APPENDED:
            return APPENDED;
        case CANCELLED:
            return CANCELLED;
        case ENTERED_IN_ERROR:
            return ENTERED_IN_ERROR;
        case UNKNOWN:
            return UNKNOWN;
        default:
            throw new IllegalStateException(value.name());
        }
    }

    /**
     * Factory method for creating DiagnosticReportStatus objects from a passed string value.
     * 
     * @param value
     *     A string that matches one of the allowed code values
     * @throws IllegalArgumentException
     *     If the passed string cannot be parsed into an allowed code value
     */
    public static DiagnosticReportStatus of(java.lang.String value) {
        return of(ValueSet.from(value));
    }

    /**
     * Inhereted factory method for creating DiagnosticReportStatus objects from a passed string value.
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
     * Inhereted factory method for creating DiagnosticReportStatus objects from a passed string value.
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
        DiagnosticReportStatus other = (DiagnosticReportStatus) obj;
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
        public DiagnosticReportStatus build() {
            return new DiagnosticReportStatus(this);
        }
    }

    public enum ValueSet {
        /**
         * Registered
         * 
         * <p>The existence of the report is registered, but there is nothing yet available.
         */
        REGISTERED("registered"),

        /**
         * Partial
         * 
         * <p>This is a partial (e.g. initial, interim or preliminary) report: data in the report may be incomplete or unverified.
         */
        PARTIAL("partial"),

        /**
         * Preliminary
         * 
         * <p>Verified early results are available, but not all results are final.
         */
        PRELIMINARY("preliminary"),

        /**
         * Final
         * 
         * <p>The report is complete and verified by an authorized person.
         */
        FINAL("final"),

        /**
         * Amended
         * 
         * <p>Subsequent to being final, the report has been modified. This includes any change in the results, diagnosis, 
         * narrative text, or other content of a report that has been issued.
         */
        AMENDED("amended"),

        /**
         * Corrected
         * 
         * <p>Subsequent to being final, the report has been modified to correct an error in the report or referenced results.
         */
        CORRECTED("corrected"),

        /**
         * Appended
         * 
         * <p>Subsequent to being final, the report has been modified by adding new content. The existing content is unchanged.
         */
        APPENDED("appended"),

        /**
         * Cancelled
         * 
         * <p>The report is unavailable because the measurement was not started or not completed (also sometimes called 
         * "aborted").
         */
        CANCELLED("cancelled"),

        /**
         * Entered in Error
         * 
         * <p>The report has been withdrawn following a previous final release. This electronic record should never have existed, 
         * though it is possible that real-world decisions were based on it. (If real-world activity has occurred, the status 
         * should be "cancelled" rather than "entered-in-error".).
         */
        ENTERED_IN_ERROR("entered-in-error"),

        /**
         * Unknown
         * 
         * <p>The authoring/source system does not know which of the status values currently applies for this observation. Note: 
         * This concept is not to be used for "other" - one of the listed statuses is presumed to apply, but the authoring/source 
         * system does not know which.
         */
        UNKNOWN("unknown");

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
         * Factory method for creating DiagnosticReportStatus.ValueSet values from a passed string value.
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

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

@System("http://hl7.org/fhir/audit-event-action")
@Generated("com.ibm.fhir.tools.CodeGenerator")
public class AuditEventAction extends Code {
    /**
     * Create
     * 
     * <p>Create a new database object, such as placing an order.
     */
    public static final AuditEventAction C = AuditEventAction.builder().value(ValueSet.C).build();

    /**
     * Read/View/Print
     * 
     * <p>Display or print data, such as a doctor census.
     */
    public static final AuditEventAction R = AuditEventAction.builder().value(ValueSet.R).build();

    /**
     * Update
     * 
     * <p>Update data, such as revise patient information.
     */
    public static final AuditEventAction U = AuditEventAction.builder().value(ValueSet.U).build();

    /**
     * Delete
     * 
     * <p>Delete items, such as a doctor master file record.
     */
    public static final AuditEventAction D = AuditEventAction.builder().value(ValueSet.D).build();

    /**
     * Execute
     * 
     * <p>Perform a system or application function such as log-on, program execution or use of an object's method, or perform 
     * a query/search operation.
     */
    public static final AuditEventAction E = AuditEventAction.builder().value(ValueSet.E).build();

    private volatile int hashCode;

    private AuditEventAction(Builder builder) {
        super(builder);
    }

    public ValueSet getValueAsEnumConstant() {
        return (value != null) ? ValueSet.from(value) : null;
    }

    /**
     * Factory method for creating AuditEventAction objects from a passed enum value.
     */
    public static AuditEventAction of(ValueSet value) {
        switch (value) {
        case C:
            return C;
        case R:
            return R;
        case U:
            return U;
        case D:
            return D;
        case E:
            return E;
        default:
            throw new IllegalStateException(value.name());
        }
    }

    /**
     * Factory method for creating AuditEventAction objects from a passed string value.
     * 
     * @param value
     *     A string that matches one of the allowed code values
     * @throws IllegalArgumentException
     *     If the passed string cannot be parsed into an allowed code value
     */
    public static AuditEventAction of(java.lang.String value) {
        return of(ValueSet.from(value));
    }

    /**
     * Inhereted factory method for creating AuditEventAction objects from a passed string value.
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
     * Inhereted factory method for creating AuditEventAction objects from a passed string value.
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
        AuditEventAction other = (AuditEventAction) obj;
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
        public AuditEventAction build() {
            return new AuditEventAction(this);
        }
    }

    public enum ValueSet {
        /**
         * Create
         * 
         * <p>Create a new database object, such as placing an order.
         */
        C("C"),

        /**
         * Read/View/Print
         * 
         * <p>Display or print data, such as a doctor census.
         */
        R("R"),

        /**
         * Update
         * 
         * <p>Update data, such as revise patient information.
         */
        U("U"),

        /**
         * Delete
         * 
         * <p>Delete items, such as a doctor master file record.
         */
        D("D"),

        /**
         * Execute
         * 
         * <p>Perform a system or application function such as log-on, program execution or use of an object's method, or perform 
         * a query/search operation.
         */
        E("E");

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
         * Factory method for creating AuditEventAction.ValueSet values from a passed string value.
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

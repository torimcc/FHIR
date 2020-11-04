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

@System("http://hl7.org/fhir/extension-context-type")
@Generated("com.ibm.fhir.tools.CodeGenerator")
public class ExtensionContextType extends Code {
    /**
     * FHIRPath
     * 
     * <p>The context is all elements that match the FHIRPath query found in the expression.
     */
    public static final ExtensionContextType FHIRPATH = ExtensionContextType.builder().value(ValueSet.FHIRPATH).build();

    /**
     * Element ID
     * 
     * <p>The context is any element that has an ElementDefinition.id that matches that found in the expression. This 
     * includes ElementDefinition Ids that have slicing identifiers. The full path for the element is [url]#[elementid]. If 
     * there is no #, the Element id is one defined in the base specification.
     */
    public static final ExtensionContextType ELEMENT = ExtensionContextType.builder().value(ValueSet.ELEMENT).build();

    /**
     * Extension URL
     * 
     * <p>The context is a particular extension from a particular StructureDefinition, and the expression is just a uri that 
     * identifies the extension.
     */
    public static final ExtensionContextType EXTENSION = ExtensionContextType.builder().value(ValueSet.EXTENSION).build();

    private volatile int hashCode;

    private ExtensionContextType(Builder builder) {
        super(builder);
    }

    public ValueSet getValueAsEnumConstant() {
        return (value != null) ? ValueSet.from(value) : null;
    }

    /**
     * Factory method for creating ExtensionContextType objects from a passed enum value.
     */
    public static ExtensionContextType of(ValueSet value) {
        switch (value) {
        case FHIRPATH:
            return FHIRPATH;
        case ELEMENT:
            return ELEMENT;
        case EXTENSION:
            return EXTENSION;
        default:
            throw new IllegalStateException(value.name());
        }
    }

    /**
     * Factory method for creating ExtensionContextType objects from a passed string value.
     * 
     * @param value
     *     A string that matches one of the allowed code values
     * @throws IllegalArgumentException
     *     If the passed string cannot be parsed into an allowed code value
     */
    public static ExtensionContextType of(java.lang.String value) {
        return of(ValueSet.from(value));
    }

    /**
     * Inhereted factory method for creating ExtensionContextType objects from a passed string value.
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
     * Inhereted factory method for creating ExtensionContextType objects from a passed string value.
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
        ExtensionContextType other = (ExtensionContextType) obj;
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
        public ExtensionContextType build() {
            return new ExtensionContextType(this);
        }
    }

    public enum ValueSet {
        /**
         * FHIRPath
         * 
         * <p>The context is all elements that match the FHIRPath query found in the expression.
         */
        FHIRPATH("fhirpath"),

        /**
         * Element ID
         * 
         * <p>The context is any element that has an ElementDefinition.id that matches that found in the expression. This 
         * includes ElementDefinition Ids that have slicing identifiers. The full path for the element is [url]#[elementid]. If 
         * there is no #, the Element id is one defined in the base specification.
         */
        ELEMENT("element"),

        /**
         * Extension URL
         * 
         * <p>The context is a particular extension from a particular StructureDefinition, and the expression is just a uri that 
         * identifies the extension.
         */
        EXTENSION("extension");

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
         * Factory method for creating ExtensionContextType.ValueSet values from a passed string value.
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

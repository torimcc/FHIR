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

@System("http://hl7.org/fhir/contract-publicationstatus")
@Generated("com.ibm.fhir.tools.CodeGenerator")
public class ContractPublicationStatus extends Code {
    /**
     * Amended
     * 
     * <p>Contract is augmented with additional information to correct errors in a predecessor or to updated values in a 
     * predecessor. Usage: Contract altered within effective time. Precedence Order = 9. Comparable FHIR and v.3 status 
     * codes: revised; replaced.
     */
    public static final ContractPublicationStatus AMENDED = ContractPublicationStatus.builder().value(ValueSet.AMENDED).build();

    /**
     * Appended
     * 
     * <p>Contract is augmented with additional information that was missing from a predecessor Contract. Usage: Contract 
     * altered within effective time. Precedence Order = 9. Comparable FHIR and v.3 status codes: updated, replaced.
     */
    public static final ContractPublicationStatus APPENDED = ContractPublicationStatus.builder().value(ValueSet.APPENDED).build();

    /**
     * Cancelled
     * 
     * <p>Contract is terminated due to failure of the Grantor and/or the Grantee to fulfil one or more contract provisions. 
     * Usage: Abnormal contract termination. Precedence Order = 10. Comparable FHIR and v.3 status codes: stopped; failed; 
     * aborted.
     */
    public static final ContractPublicationStatus CANCELLED = ContractPublicationStatus.builder().value(ValueSet.CANCELLED).build();

    /**
     * Disputed
     * 
     * <p>Contract is pended to rectify failure of the Grantor or the Grantee to fulfil contract provision(s). E.g., Grantee 
     * complaint about Grantor's failure to comply with contract provisions. Usage: Contract pended. Precedence Order = 7. 
     * Comparable FHIR and v.3 status codes: on hold; pended; suspended.
     */
    public static final ContractPublicationStatus DISPUTED = ContractPublicationStatus.builder().value(ValueSet.DISPUTED).build();

    /**
     * Entered in Error
     * 
     * <p>Contract was created in error. No Precedence Order. Status may be applied to a Contract with any status.
     */
    public static final ContractPublicationStatus ENTERED_IN_ERROR = ContractPublicationStatus.builder().value(ValueSet.ENTERED_IN_ERROR).build();

    /**
     * Executable
     * 
     * <p>Contract execution pending; may be executed when either the Grantor or the Grantee accepts the contract provisions 
     * by signing. I.e., where either the Grantor or the Grantee has signed, but not both. E.g., when an insurance applicant 
     * signs the insurers application, which references the policy. Usage: Optional first step of contract execution 
     * activity. May be skipped and contracting activity moves directly to executed state. Precedence Order = 3. Comparable 
     * FHIR and v.3 status codes: draft; preliminary; planned; intended; active.
     */
    public static final ContractPublicationStatus EXECUTABLE = ContractPublicationStatus.builder().value(ValueSet.EXECUTABLE).build();

    /**
     * Executed
     * 
     * <p>Contract is activated for period stipulated when both the Grantor and Grantee have signed it. Usage: Required state 
     * for normal completion of contracting activity. Precedence Order = 6. Comparable FHIR and v.3 status codes: accepted; 
     * completed.
     */
    public static final ContractPublicationStatus EXECUTED = ContractPublicationStatus.builder().value(ValueSet.EXECUTED).build();

    /**
     * Negotiable
     * 
     * <p>Contract execution is suspended while either or both the Grantor and Grantee propose and consider new or revised 
     * contract provisions. I.e., where the party which has not signed proposes changes to the terms. E .g., a life insurer 
     * declines to agree to the signed application because the life insurer has evidence that the applicant, who asserted to 
     * being younger or a non-smoker to get a lower premium rate - but offers instead to agree to a higher premium based on 
     * the applicants actual age or smoking status. Usage: Optional contract activity between executable and executed state. 
     * Precedence Order = 4. Comparable FHIR and v.3 status codes: in progress; review; held.
     */
    public static final ContractPublicationStatus NEGOTIABLE = ContractPublicationStatus.builder().value(ValueSet.NEGOTIABLE).build();

    /**
     * Offered
     * 
     * <p>Contract is a proposal by either the Grantor or the Grantee. Aka - A Contract hard copy or electronic 'template', 
     * 'form' or 'application'. E.g., health insurance application; consent directive form. Usage: Beginning of contract 
     * negotiation, which may have been completed as a precondition because used for 0..* contracts. Precedence Order = 2. 
     * Comparable FHIR and v.3 status codes: requested; new.
     */
    public static final ContractPublicationStatus OFFERED = ContractPublicationStatus.builder().value(ValueSet.OFFERED).build();

    /**
     * Policy
     * 
     * <p>Contract template is available as the basis for an application or offer by the Grantor or Grantee. E.g., health 
     * insurance policy; consent directive policy. Usage: Required initial contract activity, which may have been completed 
     * as a precondition because used for 0..* contracts. Precedence Order = 1. Comparable FHIR and v.3 status codes: 
     * proposed; intended.
     */
    public static final ContractPublicationStatus POLICY = ContractPublicationStatus.builder().value(ValueSet.POLICY).build();

    /**
     * Rejected
     * 
     * <p> Execution of the Contract is not completed because either or both the Grantor and Grantee decline to accept some 
     * or all of the contract provisions. Usage: Optional contract activity between executable and abnormal termination. 
     * Precedence Order = 5. Comparable FHIR and v.3 status codes: stopped; cancelled.
     */
    public static final ContractPublicationStatus REJECTED = ContractPublicationStatus.builder().value(ValueSet.REJECTED).build();

    /**
     * Renewed
     * 
     * <p>Beginning of a successor Contract at the termination of predecessor Contract lifecycle. Usage: Follows termination 
     * of a preceding Contract that has reached its expiry date. Precedence Order = 13. Comparable FHIR and v.3 status codes: 
     * superseded.
     */
    public static final ContractPublicationStatus RENEWED = ContractPublicationStatus.builder().value(ValueSet.RENEWED).build();

    /**
     * Revoked
     * 
     * <p>A Contract that is rescinded. May be required prior to replacing with an updated Contract. Comparable FHIR and v.3 
     * status codes: nullified.
     */
    public static final ContractPublicationStatus REVOKED = ContractPublicationStatus.builder().value(ValueSet.REVOKED).build();

    /**
     * Resolved
     * 
     * <p>Contract is reactivated after being pended because of faulty execution. *E.g., competency of the signer(s), or 
     * where the policy is substantially different from and did not accompany the application/form so that the applicant 
     * could not compare them. Aka - ''reactivated''. Usage: Optional stage where a pended contract is reactivated. 
     * Precedence Order = 8. Comparable FHIR and v.3 status codes: reactivated.
     */
    public static final ContractPublicationStatus RESOLVED = ContractPublicationStatus.builder().value(ValueSet.RESOLVED).build();

    /**
     * Terminated
     * 
     * <p>Contract reaches its expiry date. It might or might not be renewed or renegotiated. Usage: Normal end of contract 
     * period. Precedence Order = 12. Comparable FHIR and v.3 status codes: Obsoleted.
     */
    public static final ContractPublicationStatus TERMINATED = ContractPublicationStatus.builder().value(ValueSet.TERMINATED).build();

    private volatile int hashCode;

    private ContractPublicationStatus(Builder builder) {
        super(builder);
    }

    public ValueSet getValueAsEnumConstant() {
        return (value != null) ? ValueSet.from(value) : null;
    }

    /**
     * Factory method for creating ContractPublicationStatus objects from a passed enum value.
     */
    public static ContractPublicationStatus of(ValueSet value) {
        switch (value) {
        case AMENDED:
            return AMENDED;
        case APPENDED:
            return APPENDED;
        case CANCELLED:
            return CANCELLED;
        case DISPUTED:
            return DISPUTED;
        case ENTERED_IN_ERROR:
            return ENTERED_IN_ERROR;
        case EXECUTABLE:
            return EXECUTABLE;
        case EXECUTED:
            return EXECUTED;
        case NEGOTIABLE:
            return NEGOTIABLE;
        case OFFERED:
            return OFFERED;
        case POLICY:
            return POLICY;
        case REJECTED:
            return REJECTED;
        case RENEWED:
            return RENEWED;
        case REVOKED:
            return REVOKED;
        case RESOLVED:
            return RESOLVED;
        case TERMINATED:
            return TERMINATED;
        default:
            throw new IllegalStateException(value.name());
        }
    }

    /**
     * Factory method for creating ContractPublicationStatus objects from a passed string value.
     * 
     * @param value
     *     A string that matches one of the allowed code values
     * @throws IllegalArgumentException
     *     If the passed string cannot be parsed into an allowed code value
     */
    public static ContractPublicationStatus of(java.lang.String value) {
        return of(ValueSet.from(value));
    }

    /**
     * Inhereted factory method for creating ContractPublicationStatus objects from a passed string value.
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
     * Inhereted factory method for creating ContractPublicationStatus objects from a passed string value.
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
        ContractPublicationStatus other = (ContractPublicationStatus) obj;
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
        public ContractPublicationStatus build() {
            return new ContractPublicationStatus(this);
        }
    }

    public enum ValueSet {
        /**
         * Amended
         * 
         * <p>Contract is augmented with additional information to correct errors in a predecessor or to updated values in a 
         * predecessor. Usage: Contract altered within effective time. Precedence Order = 9. Comparable FHIR and v.3 status 
         * codes: revised; replaced.
         */
        AMENDED("amended"),

        /**
         * Appended
         * 
         * <p>Contract is augmented with additional information that was missing from a predecessor Contract. Usage: Contract 
         * altered within effective time. Precedence Order = 9. Comparable FHIR and v.3 status codes: updated, replaced.
         */
        APPENDED("appended"),

        /**
         * Cancelled
         * 
         * <p>Contract is terminated due to failure of the Grantor and/or the Grantee to fulfil one or more contract provisions. 
         * Usage: Abnormal contract termination. Precedence Order = 10. Comparable FHIR and v.3 status codes: stopped; failed; 
         * aborted.
         */
        CANCELLED("cancelled"),

        /**
         * Disputed
         * 
         * <p>Contract is pended to rectify failure of the Grantor or the Grantee to fulfil contract provision(s). E.g., Grantee 
         * complaint about Grantor's failure to comply with contract provisions. Usage: Contract pended. Precedence Order = 7. 
         * Comparable FHIR and v.3 status codes: on hold; pended; suspended.
         */
        DISPUTED("disputed"),

        /**
         * Entered in Error
         * 
         * <p>Contract was created in error. No Precedence Order. Status may be applied to a Contract with any status.
         */
        ENTERED_IN_ERROR("entered-in-error"),

        /**
         * Executable
         * 
         * <p>Contract execution pending; may be executed when either the Grantor or the Grantee accepts the contract provisions 
         * by signing. I.e., where either the Grantor or the Grantee has signed, but not both. E.g., when an insurance applicant 
         * signs the insurers application, which references the policy. Usage: Optional first step of contract execution 
         * activity. May be skipped and contracting activity moves directly to executed state. Precedence Order = 3. Comparable 
         * FHIR and v.3 status codes: draft; preliminary; planned; intended; active.
         */
        EXECUTABLE("executable"),

        /**
         * Executed
         * 
         * <p>Contract is activated for period stipulated when both the Grantor and Grantee have signed it. Usage: Required state 
         * for normal completion of contracting activity. Precedence Order = 6. Comparable FHIR and v.3 status codes: accepted; 
         * completed.
         */
        EXECUTED("executed"),

        /**
         * Negotiable
         * 
         * <p>Contract execution is suspended while either or both the Grantor and Grantee propose and consider new or revised 
         * contract provisions. I.e., where the party which has not signed proposes changes to the terms. E .g., a life insurer 
         * declines to agree to the signed application because the life insurer has evidence that the applicant, who asserted to 
         * being younger or a non-smoker to get a lower premium rate - but offers instead to agree to a higher premium based on 
         * the applicants actual age or smoking status. Usage: Optional contract activity between executable and executed state. 
         * Precedence Order = 4. Comparable FHIR and v.3 status codes: in progress; review; held.
         */
        NEGOTIABLE("negotiable"),

        /**
         * Offered
         * 
         * <p>Contract is a proposal by either the Grantor or the Grantee. Aka - A Contract hard copy or electronic 'template', 
         * 'form' or 'application'. E.g., health insurance application; consent directive form. Usage: Beginning of contract 
         * negotiation, which may have been completed as a precondition because used for 0..* contracts. Precedence Order = 2. 
         * Comparable FHIR and v.3 status codes: requested; new.
         */
        OFFERED("offered"),

        /**
         * Policy
         * 
         * <p>Contract template is available as the basis for an application or offer by the Grantor or Grantee. E.g., health 
         * insurance policy; consent directive policy. Usage: Required initial contract activity, which may have been completed 
         * as a precondition because used for 0..* contracts. Precedence Order = 1. Comparable FHIR and v.3 status codes: 
         * proposed; intended.
         */
        POLICY("policy"),

        /**
         * Rejected
         * 
         * <p> Execution of the Contract is not completed because either or both the Grantor and Grantee decline to accept some 
         * or all of the contract provisions. Usage: Optional contract activity between executable and abnormal termination. 
         * Precedence Order = 5. Comparable FHIR and v.3 status codes: stopped; cancelled.
         */
        REJECTED("rejected"),

        /**
         * Renewed
         * 
         * <p>Beginning of a successor Contract at the termination of predecessor Contract lifecycle. Usage: Follows termination 
         * of a preceding Contract that has reached its expiry date. Precedence Order = 13. Comparable FHIR and v.3 status codes: 
         * superseded.
         */
        RENEWED("renewed"),

        /**
         * Revoked
         * 
         * <p>A Contract that is rescinded. May be required prior to replacing with an updated Contract. Comparable FHIR and v.3 
         * status codes: nullified.
         */
        REVOKED("revoked"),

        /**
         * Resolved
         * 
         * <p>Contract is reactivated after being pended because of faulty execution. *E.g., competency of the signer(s), or 
         * where the policy is substantially different from and did not accompany the application/form so that the applicant 
         * could not compare them. Aka - ''reactivated''. Usage: Optional stage where a pended contract is reactivated. 
         * Precedence Order = 8. Comparable FHIR and v.3 status codes: reactivated.
         */
        RESOLVED("resolved"),

        /**
         * Terminated
         * 
         * <p>Contract reaches its expiry date. It might or might not be renewed or renegotiated. Usage: Normal end of contract 
         * period. Precedence Order = 12. Comparable FHIR and v.3 status codes: Obsoleted.
         */
        TERMINATED("terminated");

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
         * Factory method for creating ContractPublicationStatus.ValueSet values from a passed string value.
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

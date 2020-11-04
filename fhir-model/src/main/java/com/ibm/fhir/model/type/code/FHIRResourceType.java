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

@System("http://hl7.org/fhir/resource-types")
@Generated("com.ibm.fhir.tools.CodeGenerator")
public class FHIRResourceType extends Code {
    /**
     * Account
     * 
     * <p>A financial tool for tracking value accrued for a particular purpose. In the healthcare field, used to track 
     * charges for a patient, cost centers, etc.
     */
    public static final FHIRResourceType ACCOUNT = FHIRResourceType.builder().value(ValueSet.ACCOUNT).build();

    /**
     * ActivityDefinition
     * 
     * <p>This resource allows for the definition of some activity to be performed, independent of a particular patient, 
     * practitioner, or other performance context.
     */
    public static final FHIRResourceType ACTIVITY_DEFINITION = FHIRResourceType.builder().value(ValueSet.ACTIVITY_DEFINITION).build();

    /**
     * AdverseEvent
     * 
     * <p>Actual or potential/avoided event causing unintended physical injury resulting from or contributed to by medical 
     * care, a research study or other healthcare setting factors that requires additional monitoring, treatment, or 
     * hospitalization, or that results in death.
     */
    public static final FHIRResourceType ADVERSE_EVENT = FHIRResourceType.builder().value(ValueSet.ADVERSE_EVENT).build();

    /**
     * AllergyIntolerance
     * 
     * <p>Risk of harmful or undesirable, physiological response which is unique to an individual and associated with 
     * exposure to a substance.
     */
    public static final FHIRResourceType ALLERGY_INTOLERANCE = FHIRResourceType.builder().value(ValueSet.ALLERGY_INTOLERANCE).build();

    /**
     * Appointment
     * 
     * <p>A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or device(s) for a 
     * specific date/time. This may result in one or more Encounter(s).
     */
    public static final FHIRResourceType APPOINTMENT = FHIRResourceType.builder().value(ValueSet.APPOINTMENT).build();

    /**
     * AppointmentResponse
     * 
     * <p>A reply to an appointment request for a patient and/or practitioner(s), such as a confirmation or rejection.
     */
    public static final FHIRResourceType APPOINTMENT_RESPONSE = FHIRResourceType.builder().value(ValueSet.APPOINTMENT_RESPONSE).build();

    /**
     * AuditEvent
     * 
     * <p>A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion 
     * attempts and monitoring for inappropriate usage.
     */
    public static final FHIRResourceType AUDIT_EVENT = FHIRResourceType.builder().value(ValueSet.AUDIT_EVENT).build();

    /**
     * Basic
     * 
     * <p>Basic is used for handling concepts not yet defined in FHIR, narrative-only resources that don't map to an existing 
     * resource, and custom resources not appropriate for inclusion in the FHIR specification.
     */
    public static final FHIRResourceType BASIC = FHIRResourceType.builder().value(ValueSet.BASIC).build();

    /**
     * Binary
     * 
     * <p>A resource that represents the data of a single raw artifact as digital content accessible in its native format. A 
     * Binary resource can contain any content, whether text, image, pdf, zip archive, etc.
     */
    public static final FHIRResourceType BINARY = FHIRResourceType.builder().value(ValueSet.BINARY).build();

    /**
     * BiologicallyDerivedProduct
     * 
     * <p>A material substance originating from a biological entity intended to be transplanted or infused
     * <p>into another (possibly the same) biological entity.
     */
    public static final FHIRResourceType BIOLOGICALLY_DERIVED_PRODUCT = FHIRResourceType.builder().value(ValueSet.BIOLOGICALLY_DERIVED_PRODUCT).build();

    /**
     * BodyStructure
     * 
     * <p>Record details about an anatomical structure. This resource may be used when a coded concept does not provide the 
     * necessary detail needed for the use case.
     */
    public static final FHIRResourceType BODY_STRUCTURE = FHIRResourceType.builder().value(ValueSet.BODY_STRUCTURE).build();

    /**
     * Bundle
     * 
     * <p>A container for a collection of resources.
     */
    public static final FHIRResourceType BUNDLE = FHIRResourceType.builder().value(ValueSet.BUNDLE).build();

    /**
     * CapabilityStatement
     * 
     * <p>A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server for a particular version of 
     * FHIR that may be used as a statement of actual server functionality or a statement of required or desired server 
     * implementation.
     */
    public static final FHIRResourceType CAPABILITY_STATEMENT = FHIRResourceType.builder().value(ValueSet.CAPABILITY_STATEMENT).build();

    /**
     * CarePlan
     * 
     * <p>Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or 
     * community for a period of time, possibly limited to care for a specific condition or set of conditions.
     */
    public static final FHIRResourceType CARE_PLAN = FHIRResourceType.builder().value(ValueSet.CARE_PLAN).build();

    /**
     * CareTeam
     * 
     * <p>The Care Team includes all the people and organizations who plan to participate in the coordination and delivery of 
     * care for a patient.
     */
    public static final FHIRResourceType CARE_TEAM = FHIRResourceType.builder().value(ValueSet.CARE_TEAM).build();

    /**
     * CatalogEntry
     * 
     * <p>Catalog entries are wrappers that contextualize items included in a catalog.
     */
    public static final FHIRResourceType CATALOG_ENTRY = FHIRResourceType.builder().value(ValueSet.CATALOG_ENTRY).build();

    /**
     * ChargeItem
     * 
     * <p>The resource ChargeItem describes the provision of healthcare provider products for a certain patient, therefore 
     * referring not only to the product, but containing in addition details of the provision, like date, time, amounts and 
     * participating organizations and persons. Main Usage of the ChargeItem is to enable the billing process and internal 
     * cost allocation.
     */
    public static final FHIRResourceType CHARGE_ITEM = FHIRResourceType.builder().value(ValueSet.CHARGE_ITEM).build();

    /**
     * ChargeItemDefinition
     * 
     * <p>The ChargeItemDefinition resource provides the properties that apply to the (billing) codes necessary to calculate 
     * costs and prices. The properties may differ largely depending on type and realm, therefore this resource gives only a 
     * rough structure and requires profiling for each type of billing code system.
     */
    public static final FHIRResourceType CHARGE_ITEM_DEFINITION = FHIRResourceType.builder().value(ValueSet.CHARGE_ITEM_DEFINITION).build();

    /**
     * Claim
     * 
     * <p>A provider issued list of professional services and products which have been provided, or are to be provided, to a 
     * patient which is sent to an insurer for reimbursement.
     */
    public static final FHIRResourceType CLAIM = FHIRResourceType.builder().value(ValueSet.CLAIM).build();

    /**
     * ClaimResponse
     * 
     * <p>This resource provides the adjudication details from the processing of a Claim resource.
     */
    public static final FHIRResourceType CLAIM_RESPONSE = FHIRResourceType.builder().value(ValueSet.CLAIM_RESPONSE).build();

    /**
     * ClinicalImpression
     * 
     * <p>A record of a clinical assessment performed to determine what problem(s) may affect the patient and before planning 
     * the treatments or management strategies that are best to manage a patient's condition. Assessments are often 1:1 with 
     * a clinical consultation / encounter, but this varies greatly depending on the clinical workflow. This resource is 
     * called "ClinicalImpression" rather than "ClinicalAssessment" to avoid confusion with the recording of assessment tools 
     * such as Apgar score.
     */
    public static final FHIRResourceType CLINICAL_IMPRESSION = FHIRResourceType.builder().value(ValueSet.CLINICAL_IMPRESSION).build();

    /**
     * CodeSystem
     * 
     * <p>The CodeSystem resource is used to declare the existence of and describe a code system or code system supplement 
     * and its key properties, and optionally define a part or all of its content.
     */
    public static final FHIRResourceType CODE_SYSTEM = FHIRResourceType.builder().value(ValueSet.CODE_SYSTEM).build();

    /**
     * Communication
     * 
     * <p>An occurrence of information being transmitted; e.g. an alert that was sent to a responsible provider, a public 
     * health agency that was notified about a reportable condition.
     */
    public static final FHIRResourceType COMMUNICATION = FHIRResourceType.builder().value(ValueSet.COMMUNICATION).build();

    /**
     * CommunicationRequest
     * 
     * <p>A request to convey information; e.g. the CDS system proposes that an alert be sent to a responsible provider, the 
     * CDS system proposes that the public health agency be notified about a reportable condition.
     */
    public static final FHIRResourceType COMMUNICATION_REQUEST = FHIRResourceType.builder().value(ValueSet.COMMUNICATION_REQUEST).build();

    /**
     * CompartmentDefinition
     * 
     * <p>A compartment definition that defines how resources are accessed on a server.
     */
    public static final FHIRResourceType COMPARTMENT_DEFINITION = FHIRResourceType.builder().value(ValueSet.COMPARTMENT_DEFINITION).build();

    /**
     * Composition
     * 
     * <p>A set of healthcare-related information that is assembled together into a single logical package that provides a 
     * single coherent statement of meaning, establishes its own context and that has clinical attestation with regard to who 
     * is making the statement. A Composition defines the structure and narrative content necessary for a document. However, 
     * a Composition alone does not constitute a document. Rather, the Composition must be the first entry in a Bundle where 
     * Bundle.type=document, and any other resources referenced from Composition must be included as subsequent entries in 
     * the Bundle (for example Patient, Practitioner, Encounter, etc.).
     */
    public static final FHIRResourceType COMPOSITION = FHIRResourceType.builder().value(ValueSet.COMPOSITION).build();

    /**
     * ConceptMap
     * 
     * <p>A statement of relationships from one set of concepts to one or more other concepts - either concepts in code 
     * systems, or data element/data element concepts, or classes in class models.
     */
    public static final FHIRResourceType CONCEPT_MAP = FHIRResourceType.builder().value(ValueSet.CONCEPT_MAP).build();

    /**
     * Condition
     * 
     * <p>A clinical condition, problem, diagnosis, or other event, situation, issue, or clinical concept that has risen to a 
     * level of concern.
     */
    public static final FHIRResourceType CONDITION = FHIRResourceType.builder().value(ValueSet.CONDITION).build();

    /**
     * Consent
     * 
     * <p>A record of a healthcare consumer’s choices, which permits or denies identified recipient(s) or recipient role(s) 
     * to perform one or more actions within a given policy context, for specific purposes and periods of time.
     */
    public static final FHIRResourceType CONSENT = FHIRResourceType.builder().value(ValueSet.CONSENT).build();

    /**
     * Contract
     * 
     * <p>Legally enforceable, formally recorded unilateral or bilateral directive i.e., a policy or agreement.
     */
    public static final FHIRResourceType CONTRACT = FHIRResourceType.builder().value(ValueSet.CONTRACT).build();

    /**
     * Coverage
     * 
     * <p>Financial instrument which may be used to reimburse or pay for health care products and services. Includes both 
     * insurance and self-payment.
     */
    public static final FHIRResourceType COVERAGE = FHIRResourceType.builder().value(ValueSet.COVERAGE).build();

    /**
     * CoverageEligibilityRequest
     * 
     * <p>The CoverageEligibilityRequest provides patient and insurance coverage information to an insurer for them to 
     * respond, in the form of an CoverageEligibilityResponse, with information regarding whether the stated coverage is 
     * valid and in-force and optionally to provide the insurance details of the policy.
     */
    public static final FHIRResourceType COVERAGE_ELIGIBILITY_REQUEST = FHIRResourceType.builder().value(ValueSet.COVERAGE_ELIGIBILITY_REQUEST).build();

    /**
     * CoverageEligibilityResponse
     * 
     * <p>This resource provides eligibility and plan details from the processing of an CoverageEligibilityRequest resource.
     */
    public static final FHIRResourceType COVERAGE_ELIGIBILITY_RESPONSE = FHIRResourceType.builder().value(ValueSet.COVERAGE_ELIGIBILITY_RESPONSE).build();

    /**
     * DetectedIssue
     * 
     * <p>Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for 
     * a patient; e.g. Drug-drug interaction, Ineffective treatment frequency, Procedure-condition conflict, etc.
     */
    public static final FHIRResourceType DETECTED_ISSUE = FHIRResourceType.builder().value(ValueSet.DETECTED_ISSUE).build();

    /**
     * Device
     * 
     * <p>A type of a manufactured item that is used in the provision of healthcare without being substantially changed 
     * through that activity. The device may be a medical or non-medical device.
     */
    public static final FHIRResourceType DEVICE = FHIRResourceType.builder().value(ValueSet.DEVICE).build();

    /**
     * DeviceDefinition
     * 
     * <p>The characteristics, operational status and capabilities of a medical-related component of a medical device.
     */
    public static final FHIRResourceType DEVICE_DEFINITION = FHIRResourceType.builder().value(ValueSet.DEVICE_DEFINITION).build();

    /**
     * DeviceMetric
     * 
     * <p>Describes a measurement, calculation or setting capability of a medical device.
     */
    public static final FHIRResourceType DEVICE_METRIC = FHIRResourceType.builder().value(ValueSet.DEVICE_METRIC).build();

    /**
     * DeviceRequest
     * 
     * <p>Represents a request for a patient to employ a medical device. The device may be an implantable device, or an 
     * external assistive device, such as a walker.
     */
    public static final FHIRResourceType DEVICE_REQUEST = FHIRResourceType.builder().value(ValueSet.DEVICE_REQUEST).build();

    /**
     * DeviceUseStatement
     * 
     * <p>A record of a device being used by a patient where the record is the result of a report from the patient or another 
     * clinician.
     */
    public static final FHIRResourceType DEVICE_USE_STATEMENT = FHIRResourceType.builder().value(ValueSet.DEVICE_USE_STATEMENT).build();

    /**
     * DiagnosticReport
     * 
     * <p>The findings and interpretation of diagnostic tests performed on patients, groups of patients, devices, and 
     * locations, and/or specimens derived from these. The report includes clinical context such as requesting and provider 
     * information, and some mix of atomic results, images, textual and coded interpretations, and formatted representation 
     * of diagnostic reports.
     */
    public static final FHIRResourceType DIAGNOSTIC_REPORT = FHIRResourceType.builder().value(ValueSet.DIAGNOSTIC_REPORT).build();

    /**
     * DocumentManifest
     * 
     * <p>A collection of documents compiled for a purpose together with metadata that applies to the collection.
     */
    public static final FHIRResourceType DOCUMENT_MANIFEST = FHIRResourceType.builder().value(ValueSet.DOCUMENT_MANIFEST).build();

    /**
     * DocumentReference
     * 
     * <p>A reference to a document of any kind for any purpose. Provides metadata about the document so that the document 
     * can be discovered and managed. The scope of a document is any seralized object with a mime-type, so includes formal 
     * patient centric documents (CDA), cliical notes, scanned paper, and non-patient specific documents like policy text.
     */
    public static final FHIRResourceType DOCUMENT_REFERENCE = FHIRResourceType.builder().value(ValueSet.DOCUMENT_REFERENCE).build();

    /**
     * DomainResource
     * 
     * <p>A resource that includes narrative, extensions, and contained resources.
     */
    public static final FHIRResourceType DOMAIN_RESOURCE = FHIRResourceType.builder().value(ValueSet.DOMAIN_RESOURCE).build();

    /**
     * EffectEvidenceSynthesis
     * 
     * <p>The EffectEvidenceSynthesis resource describes the difference in an outcome between exposures states in a 
     * population where the effect estimate is derived from a combination of research studies.
     */
    public static final FHIRResourceType EFFECT_EVIDENCE_SYNTHESIS = FHIRResourceType.builder().value(ValueSet.EFFECT_EVIDENCE_SYNTHESIS).build();

    /**
     * Encounter
     * 
     * <p>An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or 
     * assessing the health status of a patient.
     */
    public static final FHIRResourceType ENCOUNTER = FHIRResourceType.builder().value(ValueSet.ENCOUNTER).build();

    /**
     * Endpoint
     * 
     * <p>The technical details of an endpoint that can be used for electronic services, such as for web services providing 
     * XDS.b or a REST endpoint for another FHIR server. This may include any security context information.
     */
    public static final FHIRResourceType ENDPOINT = FHIRResourceType.builder().value(ValueSet.ENDPOINT).build();

    /**
     * EnrollmentRequest
     * 
     * <p>This resource provides the insurance enrollment details to the insurer regarding a specified coverage.
     */
    public static final FHIRResourceType ENROLLMENT_REQUEST = FHIRResourceType.builder().value(ValueSet.ENROLLMENT_REQUEST).build();

    /**
     * EnrollmentResponse
     * 
     * <p>This resource provides enrollment and plan details from the processing of an EnrollmentRequest resource.
     */
    public static final FHIRResourceType ENROLLMENT_RESPONSE = FHIRResourceType.builder().value(ValueSet.ENROLLMENT_RESPONSE).build();

    /**
     * EpisodeOfCare
     * 
     * <p>An association between a patient and an organization / healthcare provider(s) during which time encounters may 
     * occur. The managing organization assumes a level of responsibility for the patient during this time.
     */
    public static final FHIRResourceType EPISODE_OF_CARE = FHIRResourceType.builder().value(ValueSet.EPISODE_OF_CARE).build();

    /**
     * EventDefinition
     * 
     * <p>The EventDefinition resource provides a reusable description of when a particular event can occur.
     */
    public static final FHIRResourceType EVENT_DEFINITION = FHIRResourceType.builder().value(ValueSet.EVENT_DEFINITION).build();

    /**
     * Evidence
     * 
     * <p>The Evidence resource describes the conditional state (population and any exposures being compared within the 
     * population) and outcome (if specified) that the knowledge (evidence, assertion, recommendation) is about.
     */
    public static final FHIRResourceType EVIDENCE = FHIRResourceType.builder().value(ValueSet.EVIDENCE).build();

    /**
     * EvidenceVariable
     * 
     * <p>The EvidenceVariable resource describes a "PICO" element that knowledge (evidence, assertion, recommendation) is 
     * about.
     */
    public static final FHIRResourceType EVIDENCE_VARIABLE = FHIRResourceType.builder().value(ValueSet.EVIDENCE_VARIABLE).build();

    /**
     * ExampleScenario
     * 
     * <p>Example of workflow instance.
     */
    public static final FHIRResourceType EXAMPLE_SCENARIO = FHIRResourceType.builder().value(ValueSet.EXAMPLE_SCENARIO).build();

    /**
     * ExplanationOfBenefit
     * 
     * <p>This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally 
     * account balance information, for informing the subscriber of the benefits provided.
     */
    public static final FHIRResourceType EXPLANATION_OF_BENEFIT = FHIRResourceType.builder().value(ValueSet.EXPLANATION_OF_BENEFIT).build();

    /**
     * FamilyMemberHistory
     * 
     * <p>Significant health conditions for a person related to the patient relevant in the context of care for the patient.
     */
    public static final FHIRResourceType FAMILY_MEMBER_HISTORY = FHIRResourceType.builder().value(ValueSet.FAMILY_MEMBER_HISTORY).build();

    /**
     * Flag
     * 
     * <p>Prospective warnings of potential issues when providing care to the patient.
     */
    public static final FHIRResourceType FLAG = FHIRResourceType.builder().value(ValueSet.FLAG).build();

    /**
     * Goal
     * 
     * <p>Describes the intended objective(s) for a patient, group or organization care, for example, weight loss, restoring 
     * an activity of daily living, obtaining herd immunity via immunization, meeting a process improvement objective, etc.
     */
    public static final FHIRResourceType GOAL = FHIRResourceType.builder().value(ValueSet.GOAL).build();

    /**
     * GraphDefinition
     * 
     * <p>A formal computable definition of a graph of resources - that is, a coherent set of resources that form a graph by 
     * following references. The Graph Definition resource defines a set and makes rules about the set.
     */
    public static final FHIRResourceType GRAPH_DEFINITION = FHIRResourceType.builder().value(ValueSet.GRAPH_DEFINITION).build();

    /**
     * Group
     * 
     * <p>Represents a defined collection of entities that may be discussed or acted upon collectively but which are not 
     * expected to act collectively, and are not formally or legally recognized; i.e. a collection of entities that isn't an 
     * Organization.
     */
    public static final FHIRResourceType GROUP = FHIRResourceType.builder().value(ValueSet.GROUP).build();

    /**
     * GuidanceResponse
     * 
     * <p>A guidance response is the formal response to a guidance request, including any output parameters returned by the 
     * evaluation, as well as the description of any proposed actions to be taken.
     */
    public static final FHIRResourceType GUIDANCE_RESPONSE = FHIRResourceType.builder().value(ValueSet.GUIDANCE_RESPONSE).build();

    /**
     * HealthcareService
     * 
     * <p>The details of a healthcare service available at a location.
     */
    public static final FHIRResourceType HEALTHCARE_SERVICE = FHIRResourceType.builder().value(ValueSet.HEALTHCARE_SERVICE).build();

    /**
     * ImagingStudy
     * 
     * <p>Representation of the content produced in a DICOM imaging study. A study comprises a set of series, each of which 
     * includes a set of Service-Object Pair Instances (SOP Instances - images or other data) acquired or produced in a 
     * common context. A series is of only one modality (e.g. X-ray, CT, MR, ultrasound), but a study may have multiple 
     * series of different modalities.
     */
    public static final FHIRResourceType IMAGING_STUDY = FHIRResourceType.builder().value(ValueSet.IMAGING_STUDY).build();

    /**
     * Immunization
     * 
     * <p>Describes the event of a patient being administered a vaccine or a record of an immunization as reported by a 
     * patient, a clinician or another party.
     */
    public static final FHIRResourceType IMMUNIZATION = FHIRResourceType.builder().value(ValueSet.IMMUNIZATION).build();

    /**
     * ImmunizationEvaluation
     * 
     * <p>Describes a comparison of an immunization event against published recommendations to determine if the 
     * administration is "valid" in relation to those recommendations.
     */
    public static final FHIRResourceType IMMUNIZATION_EVALUATION = FHIRResourceType.builder().value(ValueSet.IMMUNIZATION_EVALUATION).build();

    /**
     * ImmunizationRecommendation
     * 
     * <p>A patient's point-in-time set of recommendations (i.e. forecasting) according to a published schedule with optional 
     * supporting justification.
     */
    public static final FHIRResourceType IMMUNIZATION_RECOMMENDATION = FHIRResourceType.builder().value(ValueSet.IMMUNIZATION_RECOMMENDATION).build();

    /**
     * ImplementationGuide
     * 
     * <p>A set of rules of how a particular interoperability or standards problem is solved - typically through the use of 
     * FHIR resources. This resource is used to gather all the parts of an implementation guide into a logical whole and to 
     * publish a computable definition of all the parts.
     */
    public static final FHIRResourceType IMPLEMENTATION_GUIDE = FHIRResourceType.builder().value(ValueSet.IMPLEMENTATION_GUIDE).build();

    /**
     * InsurancePlan
     * 
     * <p>Details of a Health Insurance product/plan provided by an organization.
     */
    public static final FHIRResourceType INSURANCE_PLAN = FHIRResourceType.builder().value(ValueSet.INSURANCE_PLAN).build();

    /**
     * Invoice
     * 
     * <p>Invoice containing collected ChargeItems from an Account with calculated individual and total price for Billing 
     * purpose.
     */
    public static final FHIRResourceType INVOICE = FHIRResourceType.builder().value(ValueSet.INVOICE).build();

    /**
     * Library
     * 
     * <p>The Library resource is a general-purpose container for knowledge asset definitions. It can be used to describe and 
     * expose existing knowledge assets such as logic libraries and information model descriptions, as well as to describe a 
     * collection of knowledge assets.
     */
    public static final FHIRResourceType LIBRARY = FHIRResourceType.builder().value(ValueSet.LIBRARY).build();

    /**
     * Linkage
     * 
     * <p>Identifies two or more records (resource instances) that refer to the same real-world "occurrence".
     */
    public static final FHIRResourceType LINKAGE = FHIRResourceType.builder().value(ValueSet.LINKAGE).build();

    /**
     * List
     * 
     * <p>A list is a curated collection of resources.
     */
    public static final FHIRResourceType LIST = FHIRResourceType.builder().value(ValueSet.LIST).build();

    /**
     * Location
     * 
     * <p>Details and position information for a physical place where services are provided and resources and participants 
     * may be stored, found, contained, or accommodated.
     */
    public static final FHIRResourceType LOCATION = FHIRResourceType.builder().value(ValueSet.LOCATION).build();

    /**
     * Measure
     * 
     * <p>The Measure resource provides the definition of a quality measure.
     */
    public static final FHIRResourceType MEASURE = FHIRResourceType.builder().value(ValueSet.MEASURE).build();

    /**
     * MeasureReport
     * 
     * <p>The MeasureReport resource contains the results of the calculation of a measure; and optionally a reference to the 
     * resources involved in that calculation.
     */
    public static final FHIRResourceType MEASURE_REPORT = FHIRResourceType.builder().value(ValueSet.MEASURE_REPORT).build();

    /**
     * Media
     * 
     * <p>A photo, video, or audio recording acquired or used in healthcare. The actual content may be inline or provided by 
     * direct reference.
     */
    public static final FHIRResourceType MEDIA = FHIRResourceType.builder().value(ValueSet.MEDIA).build();

    /**
     * Medication
     * 
     * <p>This resource is primarily used for the identification and definition of a medication for the purposes of 
     * prescribing, dispensing, and administering a medication as well as for making statements about medication use.
     */
    public static final FHIRResourceType MEDICATION = FHIRResourceType.builder().value(ValueSet.MEDICATION).build();

    /**
     * MedicationAdministration
     * 
     * <p>Describes the event of a patient consuming or otherwise being administered a medication. This may be as simple as 
     * swallowing a tablet or it may be a long running infusion. Related resources tie this event to the authorizing 
     * prescription, and the specific encounter between patient and health care practitioner.
     */
    public static final FHIRResourceType MEDICATION_ADMINISTRATION = FHIRResourceType.builder().value(ValueSet.MEDICATION_ADMINISTRATION).build();

    /**
     * MedicationDispense
     * 
     * <p>Indicates that a medication product is to be or has been dispensed for a named person/patient. This includes a 
     * description of the medication product (supply) provided and the instructions for administering the medication. The 
     * medication dispense is the result of a pharmacy system responding to a medication order.
     */
    public static final FHIRResourceType MEDICATION_DISPENSE = FHIRResourceType.builder().value(ValueSet.MEDICATION_DISPENSE).build();

    /**
     * MedicationKnowledge
     * 
     * <p>Information about a medication that is used to support knowledge.
     */
    public static final FHIRResourceType MEDICATION_KNOWLEDGE = FHIRResourceType.builder().value(ValueSet.MEDICATION_KNOWLEDGE).build();

    /**
     * MedicationRequest
     * 
     * <p>An order or request for both supply of the medication and the instructions for administration of the medication to 
     * a patient. The resource is called "MedicationRequest" rather than "MedicationPrescription" or "MedicationOrder" to 
     * generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with 
     * workflow patterns.
     */
    public static final FHIRResourceType MEDICATION_REQUEST = FHIRResourceType.builder().value(ValueSet.MEDICATION_REQUEST).build();

    /**
     * MedicationStatement
     * 
     * <p>A record of a medication that is being consumed by a patient. A MedicationStatement may indicate that the patient 
     * may be taking the medication now or has taken the medication in the past or will be taking the medication in the 
     * future. The source of this information can be the patient, significant other (such as a family member or spouse), or a 
     * clinician. A common scenario where this information is captured is during the history taking process during a patient 
     * visit or stay. The medication information may come from sources such as the patient's memory, from a prescription 
     * bottle, or from a list of medications the patient, clinician or other party maintains. 
     * 
     * <p>The primary difference between a medication statement and a medication administration is that the medication 
     * administration has complete administration information and is based on actual administration information from the 
     * person who administered the medication. A medication statement is often, if not always, less specific. There is no 
     * required date/time when the medication was administered, in fact we only know that a source has reported the patient 
     * is taking this medication, where details such as time, quantity, or rate or even medication product may be incomplete 
     * or missing or less precise. As stated earlier, the medication statement information may come from the patient's 
     * memory, from a prescription bottle or from a list of medications the patient, clinician or other party maintains. 
     * Medication administration is more formal and is not missing detailed information.
     */
    public static final FHIRResourceType MEDICATION_STATEMENT = FHIRResourceType.builder().value(ValueSet.MEDICATION_STATEMENT).build();

    /**
     * MedicinalProduct
     * 
     * <p>Detailed definition of a medicinal product, typically for uses other than direct patient care (e.g. regulatory use).
     */
    public static final FHIRResourceType MEDICINAL_PRODUCT = FHIRResourceType.builder().value(ValueSet.MEDICINAL_PRODUCT).build();

    /**
     * MedicinalProductAuthorization
     * 
     * <p>The regulatory authorization of a medicinal product.
     */
    public static final FHIRResourceType MEDICINAL_PRODUCT_AUTHORIZATION = FHIRResourceType.builder().value(ValueSet.MEDICINAL_PRODUCT_AUTHORIZATION).build();

    /**
     * MedicinalProductContraindication
     * 
     * <p>The clinical particulars - indications, contraindications etc. of a medicinal product, including for regulatory 
     * purposes.
     */
    public static final FHIRResourceType MEDICINAL_PRODUCT_CONTRAINDICATION = FHIRResourceType.builder().value(ValueSet.MEDICINAL_PRODUCT_CONTRAINDICATION).build();

    /**
     * MedicinalProductIndication
     * 
     * <p>Indication for the Medicinal Product.
     */
    public static final FHIRResourceType MEDICINAL_PRODUCT_INDICATION = FHIRResourceType.builder().value(ValueSet.MEDICINAL_PRODUCT_INDICATION).build();

    /**
     * MedicinalProductIngredient
     * 
     * <p>An ingredient of a manufactured item or pharmaceutical product.
     */
    public static final FHIRResourceType MEDICINAL_PRODUCT_INGREDIENT = FHIRResourceType.builder().value(ValueSet.MEDICINAL_PRODUCT_INGREDIENT).build();

    /**
     * MedicinalProductInteraction
     * 
     * <p>The interactions of the medicinal product with other medicinal products, or other forms of interactions.
     */
    public static final FHIRResourceType MEDICINAL_PRODUCT_INTERACTION = FHIRResourceType.builder().value(ValueSet.MEDICINAL_PRODUCT_INTERACTION).build();

    /**
     * MedicinalProductManufactured
     * 
     * <p>The manufactured item as contained in the packaged medicinal product.
     */
    public static final FHIRResourceType MEDICINAL_PRODUCT_MANUFACTURED = FHIRResourceType.builder().value(ValueSet.MEDICINAL_PRODUCT_MANUFACTURED).build();

    /**
     * MedicinalProductPackaged
     * 
     * <p>A medicinal product in a container or package.
     */
    public static final FHIRResourceType MEDICINAL_PRODUCT_PACKAGED = FHIRResourceType.builder().value(ValueSet.MEDICINAL_PRODUCT_PACKAGED).build();

    /**
     * MedicinalProductPharmaceutical
     * 
     * <p>A pharmaceutical product described in terms of its composition and dose form.
     */
    public static final FHIRResourceType MEDICINAL_PRODUCT_PHARMACEUTICAL = FHIRResourceType.builder().value(ValueSet.MEDICINAL_PRODUCT_PHARMACEUTICAL).build();

    /**
     * MedicinalProductUndesirableEffect
     * 
     * <p>Describe the undesirable effects of the medicinal product.
     */
    public static final FHIRResourceType MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT = FHIRResourceType.builder().value(ValueSet.MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT).build();

    /**
     * MessageDefinition
     * 
     * <p>Defines the characteristics of a message that can be shared between systems, including the type of event that 
     * initiates the message, the content to be transmitted and what response(s), if any, are permitted.
     */
    public static final FHIRResourceType MESSAGE_DEFINITION = FHIRResourceType.builder().value(ValueSet.MESSAGE_DEFINITION).build();

    /**
     * MessageHeader
     * 
     * <p>The header for a message exchange that is either requesting or responding to an action. The reference(s) that are 
     * the subject of the action as well as other information related to the action are typically transmitted in a bundle in 
     * which the MessageHeader resource instance is the first resource in the bundle.
     */
    public static final FHIRResourceType MESSAGE_HEADER = FHIRResourceType.builder().value(ValueSet.MESSAGE_HEADER).build();

    /**
     * MolecularSequence
     * 
     * <p>Raw data describing a biological sequence.
     */
    public static final FHIRResourceType MOLECULAR_SEQUENCE = FHIRResourceType.builder().value(ValueSet.MOLECULAR_SEQUENCE).build();

    /**
     * NamingSystem
     * 
     * <p>A curated namespace that issues unique symbols within that namespace for the identification of concepts, people, 
     * devices, etc. Represents a "System" used within the Identifier and Coding data types.
     */
    public static final FHIRResourceType NAMING_SYSTEM = FHIRResourceType.builder().value(ValueSet.NAMING_SYSTEM).build();

    /**
     * NutritionOrder
     * 
     * <p>A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.
     */
    public static final FHIRResourceType NUTRITION_ORDER = FHIRResourceType.builder().value(ValueSet.NUTRITION_ORDER).build();

    /**
     * Observation
     * 
     * <p>Measurements and simple assertions made about a patient, device or other subject.
     */
    public static final FHIRResourceType OBSERVATION = FHIRResourceType.builder().value(ValueSet.OBSERVATION).build();

    /**
     * ObservationDefinition
     * 
     * <p>Set of definitional characteristics for a kind of observation or measurement produced or consumed by an orderable 
     * health care service.
     */
    public static final FHIRResourceType OBSERVATION_DEFINITION = FHIRResourceType.builder().value(ValueSet.OBSERVATION_DEFINITION).build();

    /**
     * OperationDefinition
     * 
     * <p>A formal computable definition of an operation (on the RESTful interface) or a named query (using the search 
     * interaction).
     */
    public static final FHIRResourceType OPERATION_DEFINITION = FHIRResourceType.builder().value(ValueSet.OPERATION_DEFINITION).build();

    /**
     * OperationOutcome
     * 
     * <p>A collection of error, warning, or information messages that result from a system action.
     */
    public static final FHIRResourceType OPERATION_OUTCOME = FHIRResourceType.builder().value(ValueSet.OPERATION_OUTCOME).build();

    /**
     * Organization
     * 
     * <p>A formally or informally recognized grouping of people or organizations formed for the purpose of achieving some 
     * form of collective action. Includes companies, institutions, corporations, departments, community groups, healthcare 
     * practice groups, payer/insurer, etc.
     */
    public static final FHIRResourceType ORGANIZATION = FHIRResourceType.builder().value(ValueSet.ORGANIZATION).build();

    /**
     * OrganizationAffiliation
     * 
     * <p>Defines an affiliation/assotiation/relationship between 2 distinct oganizations, that is not a part-of 
     * relationship/sub-division relationship.
     */
    public static final FHIRResourceType ORGANIZATION_AFFILIATION = FHIRResourceType.builder().value(ValueSet.ORGANIZATION_AFFILIATION).build();

    /**
     * Parameters
     * 
     * <p>This resource is a non-persisted resource used to pass information into and back from an [operation](operations.
     * html). It has no other use, and there is no RESTful endpoint associated with it.
     */
    public static final FHIRResourceType PARAMETERS = FHIRResourceType.builder().value(ValueSet.PARAMETERS).build();

    /**
     * Patient
     * 
     * <p>Demographics and other administrative information about an individual or animal receiving care or other health-
     * related services.
     */
    public static final FHIRResourceType PATIENT = FHIRResourceType.builder().value(ValueSet.PATIENT).build();

    /**
     * PaymentNotice
     * 
     * <p>This resource provides the status of the payment for goods and services rendered, and the request and response 
     * resource references.
     */
    public static final FHIRResourceType PAYMENT_NOTICE = FHIRResourceType.builder().value(ValueSet.PAYMENT_NOTICE).build();

    /**
     * PaymentReconciliation
     * 
     * <p>This resource provides the details including amount of a payment and allocates the payment items being paid.
     */
    public static final FHIRResourceType PAYMENT_RECONCILIATION = FHIRResourceType.builder().value(ValueSet.PAYMENT_RECONCILIATION).build();

    /**
     * Person
     * 
     * <p>Demographics and administrative information about a person independent of a specific health-related context.
     */
    public static final FHIRResourceType PERSON = FHIRResourceType.builder().value(ValueSet.PERSON).build();

    /**
     * PlanDefinition
     * 
     * <p>This resource allows for the definition of various types of plans as a sharable, consumable, and executable 
     * artifact. The resource is general enough to support the description of a broad range of clinical artifacts such as 
     * clinical decision support rules, order sets and protocols.
     */
    public static final FHIRResourceType PLAN_DEFINITION = FHIRResourceType.builder().value(ValueSet.PLAN_DEFINITION).build();

    /**
     * Practitioner
     * 
     * <p>A person who is directly or indirectly involved in the provisioning of healthcare.
     */
    public static final FHIRResourceType PRACTITIONER = FHIRResourceType.builder().value(ValueSet.PRACTITIONER).build();

    /**
     * PractitionerRole
     * 
     * <p>A specific set of Roles/Locations/specialties/services that a practitioner may perform at an organization for a 
     * period of time.
     */
    public static final FHIRResourceType PRACTITIONER_ROLE = FHIRResourceType.builder().value(ValueSet.PRACTITIONER_ROLE).build();

    /**
     * Procedure
     * 
     * <p>An action that is or was performed on or for a patient. This can be a physical intervention like an operation, or 
     * less invasive like long term services, counseling, or hypnotherapy.
     */
    public static final FHIRResourceType PROCEDURE = FHIRResourceType.builder().value(ValueSet.PROCEDURE).build();

    /**
     * Provenance
     * 
     * <p>Provenance of a resource is a record that describes entities and processes involved in producing and delivering or 
     * otherwise influencing that resource. Provenance provides a critical foundation for assessing authenticity, enabling 
     * trust, and allowing reproducibility. Provenance assertions are a form of contextual metadata and can themselves become 
     * important records with their own provenance. Provenance statement indicates clinical significance in terms of 
     * confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle (e.g. Document 
     * Completion - has the artifact been legally authenticated), all of which may impact security, privacy, and trust 
     * policies.
     */
    public static final FHIRResourceType PROVENANCE = FHIRResourceType.builder().value(ValueSet.PROVENANCE).build();

    /**
     * Questionnaire
     * 
     * <p>A structured set of questions intended to guide the collection of answers from end-users. Questionnaires provide 
     * detailed control over order, presentation, phraseology and grouping to allow coherent, consistent data collection.
     */
    public static final FHIRResourceType QUESTIONNAIRE = FHIRResourceType.builder().value(ValueSet.QUESTIONNAIRE).build();

    /**
     * QuestionnaireResponse
     * 
     * <p>A structured set of questions and their answers. The questions are ordered and grouped into coherent subsets, 
     * corresponding to the structure of the grouping of the questionnaire being responded to.
     */
    public static final FHIRResourceType QUESTIONNAIRE_RESPONSE = FHIRResourceType.builder().value(ValueSet.QUESTIONNAIRE_RESPONSE).build();

    /**
     * RelatedPerson
     * 
     * <p>Information about a person that is involved in the care for a patient, but who is not the target of healthcare, nor 
     * has a formal responsibility in the care process.
     */
    public static final FHIRResourceType RELATED_PERSON = FHIRResourceType.builder().value(ValueSet.RELATED_PERSON).build();

    /**
     * RequestGroup
     * 
     * <p>A group of related requests that can be used to capture intended activities that have inter-dependencies such as 
     * "give this medication after that one".
     */
    public static final FHIRResourceType REQUEST_GROUP = FHIRResourceType.builder().value(ValueSet.REQUEST_GROUP).build();

    /**
     * ResearchDefinition
     * 
     * <p>The ResearchDefinition resource describes the conditional state (population and any exposures being compared within 
     * the population) and outcome (if specified) that the knowledge (evidence, assertion, recommendation) is about.
     */
    public static final FHIRResourceType RESEARCH_DEFINITION = FHIRResourceType.builder().value(ValueSet.RESEARCH_DEFINITION).build();

    /**
     * ResearchElementDefinition
     * 
     * <p>The ResearchElementDefinition resource describes a "PICO" element that knowledge (evidence, assertion, 
     * recommendation) is about.
     */
    public static final FHIRResourceType RESEARCH_ELEMENT_DEFINITION = FHIRResourceType.builder().value(ValueSet.RESEARCH_ELEMENT_DEFINITION).build();

    /**
     * ResearchStudy
     * 
     * <p>A process where a researcher or organization plans and then executes a series of steps intended to increase the 
     * field of healthcare-related knowledge. This includes studies of safety, efficacy, comparative effectiveness and other 
     * information about medications, devices, therapies and other interventional and investigative techniques. A 
     * ResearchStudy involves the gathering of information about human or animal subjects.
     */
    public static final FHIRResourceType RESEARCH_STUDY = FHIRResourceType.builder().value(ValueSet.RESEARCH_STUDY).build();

    /**
     * ResearchSubject
     * 
     * <p>A physical entity which is the primary unit of operational and/or administrative interest in a study.
     */
    public static final FHIRResourceType RESEARCH_SUBJECT = FHIRResourceType.builder().value(ValueSet.RESEARCH_SUBJECT).build();

    /**
     * Resource
     * 
     * <p>This is the base resource type for everything.
     */
    public static final FHIRResourceType RESOURCE = FHIRResourceType.builder().value(ValueSet.RESOURCE).build();

    /**
     * RiskAssessment
     * 
     * <p>An assessment of the likely outcome(s) for a patient or other subject as well as the likelihood of each outcome.
     */
    public static final FHIRResourceType RISK_ASSESSMENT = FHIRResourceType.builder().value(ValueSet.RISK_ASSESSMENT).build();

    /**
     * RiskEvidenceSynthesis
     * 
     * <p>The RiskEvidenceSynthesis resource describes the likelihood of an outcome in a population plus exposure state where 
     * the risk estimate is derived from a combination of research studies.
     */
    public static final FHIRResourceType RISK_EVIDENCE_SYNTHESIS = FHIRResourceType.builder().value(ValueSet.RISK_EVIDENCE_SYNTHESIS).build();

    /**
     * Schedule
     * 
     * <p>A container for slots of time that may be available for booking appointments.
     */
    public static final FHIRResourceType SCHEDULE = FHIRResourceType.builder().value(ValueSet.SCHEDULE).build();

    /**
     * SearchParameter
     * 
     * <p>A search parameter that defines a named search item that can be used to search/filter on a resource.
     */
    public static final FHIRResourceType SEARCH_PARAMETER = FHIRResourceType.builder().value(ValueSet.SEARCH_PARAMETER).build();

    /**
     * ServiceRequest
     * 
     * <p>A record of a request for service such as diagnostic investigations, treatments, or operations to be performed.
     */
    public static final FHIRResourceType SERVICE_REQUEST = FHIRResourceType.builder().value(ValueSet.SERVICE_REQUEST).build();

    /**
     * Slot
     * 
     * <p>A slot of time on a schedule that may be available for booking appointments.
     */
    public static final FHIRResourceType SLOT = FHIRResourceType.builder().value(ValueSet.SLOT).build();

    /**
     * Specimen
     * 
     * <p>A sample to be used for analysis.
     */
    public static final FHIRResourceType SPECIMEN = FHIRResourceType.builder().value(ValueSet.SPECIMEN).build();

    /**
     * SpecimenDefinition
     * 
     * <p>A kind of specimen with associated set of requirements.
     */
    public static final FHIRResourceType SPECIMEN_DEFINITION = FHIRResourceType.builder().value(ValueSet.SPECIMEN_DEFINITION).build();

    /**
     * StructureDefinition
     * 
     * <p>A definition of a FHIR structure. This resource is used to describe the underlying resources, data types defined in 
     * FHIR, and also for describing extensions and constraints on resources and data types.
     */
    public static final FHIRResourceType STRUCTURE_DEFINITION = FHIRResourceType.builder().value(ValueSet.STRUCTURE_DEFINITION).build();

    /**
     * StructureMap
     * 
     * <p>A Map of relationships between 2 structures that can be used to transform data.
     */
    public static final FHIRResourceType STRUCTURE_MAP = FHIRResourceType.builder().value(ValueSet.STRUCTURE_MAP).build();

    /**
     * Subscription
     * 
     * <p>The subscription resource is used to define a push-based subscription from a server to another system. Once a 
     * subscription is registered with the server, the server checks every resource that is created or updated, and if the 
     * resource matches the given criteria, it sends a message on the defined "channel" so that another system can take an 
     * appropriate action.
     */
    public static final FHIRResourceType SUBSCRIPTION = FHIRResourceType.builder().value(ValueSet.SUBSCRIPTION).build();

    /**
     * Substance
     * 
     * <p>A homogeneous material with a definite composition.
     */
    public static final FHIRResourceType SUBSTANCE = FHIRResourceType.builder().value(ValueSet.SUBSTANCE).build();

    /**
     * SubstanceNucleicAcid
     * 
     * <p>Nucleic acids are defined by three distinct elements: the base, sugar and linkage. Individual substance/moiety IDs 
     * will be created for each of these elements. The nucleotide sequence will be always entered in the 5’-3’ direction.
     */
    public static final FHIRResourceType SUBSTANCE_NUCLEIC_ACID = FHIRResourceType.builder().value(ValueSet.SUBSTANCE_NUCLEIC_ACID).build();

    /**
     * SubstancePolymer
     * 
     * <p>Todo.
     */
    public static final FHIRResourceType SUBSTANCE_POLYMER = FHIRResourceType.builder().value(ValueSet.SUBSTANCE_POLYMER).build();

    /**
     * SubstanceProtein
     * 
     * <p>A SubstanceProtein is defined as a single unit of a linear amino acid sequence, or a combination of subunits that 
     * are either covalently linked or have a defined invariant stoichiometric relationship. This includes all synthetic, 
     * recombinant and purified SubstanceProteins of defined sequence, whether the use is therapeutic or prophylactic. This 
     * set of elements will be used to describe albumins, coagulation factors, cytokines, growth factors, 
     * peptide/SubstanceProtein hormones, enzymes, toxins, toxoids, recombinant vaccines, and immunomodulators.
     */
    public static final FHIRResourceType SUBSTANCE_PROTEIN = FHIRResourceType.builder().value(ValueSet.SUBSTANCE_PROTEIN).build();

    /**
     * SubstanceReferenceInformation
     * 
     * <p>Todo.
     */
    public static final FHIRResourceType SUBSTANCE_REFERENCE_INFORMATION = FHIRResourceType.builder().value(ValueSet.SUBSTANCE_REFERENCE_INFORMATION).build();

    /**
     * SubstanceSourceMaterial
     * 
     * <p>Source material shall capture information on the taxonomic and anatomical origins as well as the fraction of a 
     * material that can result in or can be modified to form a substance. This set of data elements shall be used to define 
     * polymer substances isolated from biological matrices. Taxonomic and anatomical origins shall be described using a 
     * controlled vocabulary as required. This information is captured for naturally derived polymers ( . starch) and 
     * structurally diverse substances. For Organisms belonging to the Kingdom Plantae the Substance level defines the fresh 
     * material of a single species or infraspecies, the Herbal Drug and the Herbal preparation. For Herbal preparations, the 
     * fraction information will be captured at the Substance information level and additional information for herbal 
     * extracts will be captured at the Specified Substance Group 1 information level. See for further explanation the 
     * Substance Class: Structurally Diverse and the herbal annex.
     */
    public static final FHIRResourceType SUBSTANCE_SOURCE_MATERIAL = FHIRResourceType.builder().value(ValueSet.SUBSTANCE_SOURCE_MATERIAL).build();

    /**
     * SubstanceSpecification
     * 
     * <p>The detailed description of a substance, typically at a level beyond what is used for prescribing.
     */
    public static final FHIRResourceType SUBSTANCE_SPECIFICATION = FHIRResourceType.builder().value(ValueSet.SUBSTANCE_SPECIFICATION).build();

    /**
     * SupplyDelivery
     * 
     * <p>Record of delivery of what is supplied.
     */
    public static final FHIRResourceType SUPPLY_DELIVERY = FHIRResourceType.builder().value(ValueSet.SUPPLY_DELIVERY).build();

    /**
     * SupplyRequest
     * 
     * <p>A record of a request for a medication, substance or device used in the healthcare setting.
     */
    public static final FHIRResourceType SUPPLY_REQUEST = FHIRResourceType.builder().value(ValueSet.SUPPLY_REQUEST).build();

    /**
     * Task
     * 
     * <p>A task to be performed.
     */
    public static final FHIRResourceType TASK = FHIRResourceType.builder().value(ValueSet.TASK).build();

    /**
     * TerminologyCapabilities
     * 
     * <p>A TerminologyCapabilities resource documents a set of capabilities (behaviors) of a FHIR Terminology Server that 
     * may be used as a statement of actual server functionality or a statement of required or desired server implementation.
     */
    public static final FHIRResourceType TERMINOLOGY_CAPABILITIES = FHIRResourceType.builder().value(ValueSet.TERMINOLOGY_CAPABILITIES).build();

    /**
     * TestReport
     * 
     * <p>A summary of information based on the results of executing a TestScript.
     */
    public static final FHIRResourceType TEST_REPORT = FHIRResourceType.builder().value(ValueSet.TEST_REPORT).build();

    /**
     * TestScript
     * 
     * <p>A structured set of tests against a FHIR server or client implementation to determine compliance against the FHIR 
     * specification.
     */
    public static final FHIRResourceType TEST_SCRIPT = FHIRResourceType.builder().value(ValueSet.TEST_SCRIPT).build();

    /**
     * ValueSet
     * 
     * <p>A ValueSet resource instance specifies a set of codes drawn from one or more code systems, intended for use in a 
     * particular context. Value sets link between [[[CodeSystem]]] definitions and their use in [coded elements]
     * (terminologies.html).
     */
    public static final FHIRResourceType VALUE_SET = FHIRResourceType.builder().value(ValueSet.VALUE_SET).build();

    /**
     * VerificationResult
     * 
     * <p>Describes validation requirements, source(s), status and dates for one or more elements.
     */
    public static final FHIRResourceType VERIFICATION_RESULT = FHIRResourceType.builder().value(ValueSet.VERIFICATION_RESULT).build();

    /**
     * VisionPrescription
     * 
     * <p>An authorization for the provision of glasses and/or contact lenses to a patient.
     */
    public static final FHIRResourceType VISION_PRESCRIPTION = FHIRResourceType.builder().value(ValueSet.VISION_PRESCRIPTION).build();

    private volatile int hashCode;

    private FHIRResourceType(Builder builder) {
        super(builder);
    }

    public ValueSet getValueAsEnumConstant() {
        return (value != null) ? ValueSet.from(value) : null;
    }

    /**
     * Factory method for creating FHIRResourceType objects from a passed enum value.
     */
    public static FHIRResourceType of(ValueSet value) {
        switch (value) {
        case ACCOUNT:
            return ACCOUNT;
        case ACTIVITY_DEFINITION:
            return ACTIVITY_DEFINITION;
        case ADVERSE_EVENT:
            return ADVERSE_EVENT;
        case ALLERGY_INTOLERANCE:
            return ALLERGY_INTOLERANCE;
        case APPOINTMENT:
            return APPOINTMENT;
        case APPOINTMENT_RESPONSE:
            return APPOINTMENT_RESPONSE;
        case AUDIT_EVENT:
            return AUDIT_EVENT;
        case BASIC:
            return BASIC;
        case BINARY:
            return BINARY;
        case BIOLOGICALLY_DERIVED_PRODUCT:
            return BIOLOGICALLY_DERIVED_PRODUCT;
        case BODY_STRUCTURE:
            return BODY_STRUCTURE;
        case BUNDLE:
            return BUNDLE;
        case CAPABILITY_STATEMENT:
            return CAPABILITY_STATEMENT;
        case CARE_PLAN:
            return CARE_PLAN;
        case CARE_TEAM:
            return CARE_TEAM;
        case CATALOG_ENTRY:
            return CATALOG_ENTRY;
        case CHARGE_ITEM:
            return CHARGE_ITEM;
        case CHARGE_ITEM_DEFINITION:
            return CHARGE_ITEM_DEFINITION;
        case CLAIM:
            return CLAIM;
        case CLAIM_RESPONSE:
            return CLAIM_RESPONSE;
        case CLINICAL_IMPRESSION:
            return CLINICAL_IMPRESSION;
        case CODE_SYSTEM:
            return CODE_SYSTEM;
        case COMMUNICATION:
            return COMMUNICATION;
        case COMMUNICATION_REQUEST:
            return COMMUNICATION_REQUEST;
        case COMPARTMENT_DEFINITION:
            return COMPARTMENT_DEFINITION;
        case COMPOSITION:
            return COMPOSITION;
        case CONCEPT_MAP:
            return CONCEPT_MAP;
        case CONDITION:
            return CONDITION;
        case CONSENT:
            return CONSENT;
        case CONTRACT:
            return CONTRACT;
        case COVERAGE:
            return COVERAGE;
        case COVERAGE_ELIGIBILITY_REQUEST:
            return COVERAGE_ELIGIBILITY_REQUEST;
        case COVERAGE_ELIGIBILITY_RESPONSE:
            return COVERAGE_ELIGIBILITY_RESPONSE;
        case DETECTED_ISSUE:
            return DETECTED_ISSUE;
        case DEVICE:
            return DEVICE;
        case DEVICE_DEFINITION:
            return DEVICE_DEFINITION;
        case DEVICE_METRIC:
            return DEVICE_METRIC;
        case DEVICE_REQUEST:
            return DEVICE_REQUEST;
        case DEVICE_USE_STATEMENT:
            return DEVICE_USE_STATEMENT;
        case DIAGNOSTIC_REPORT:
            return DIAGNOSTIC_REPORT;
        case DOCUMENT_MANIFEST:
            return DOCUMENT_MANIFEST;
        case DOCUMENT_REFERENCE:
            return DOCUMENT_REFERENCE;
        case DOMAIN_RESOURCE:
            return DOMAIN_RESOURCE;
        case EFFECT_EVIDENCE_SYNTHESIS:
            return EFFECT_EVIDENCE_SYNTHESIS;
        case ENCOUNTER:
            return ENCOUNTER;
        case ENDPOINT:
            return ENDPOINT;
        case ENROLLMENT_REQUEST:
            return ENROLLMENT_REQUEST;
        case ENROLLMENT_RESPONSE:
            return ENROLLMENT_RESPONSE;
        case EPISODE_OF_CARE:
            return EPISODE_OF_CARE;
        case EVENT_DEFINITION:
            return EVENT_DEFINITION;
        case EVIDENCE:
            return EVIDENCE;
        case EVIDENCE_VARIABLE:
            return EVIDENCE_VARIABLE;
        case EXAMPLE_SCENARIO:
            return EXAMPLE_SCENARIO;
        case EXPLANATION_OF_BENEFIT:
            return EXPLANATION_OF_BENEFIT;
        case FAMILY_MEMBER_HISTORY:
            return FAMILY_MEMBER_HISTORY;
        case FLAG:
            return FLAG;
        case GOAL:
            return GOAL;
        case GRAPH_DEFINITION:
            return GRAPH_DEFINITION;
        case GROUP:
            return GROUP;
        case GUIDANCE_RESPONSE:
            return GUIDANCE_RESPONSE;
        case HEALTHCARE_SERVICE:
            return HEALTHCARE_SERVICE;
        case IMAGING_STUDY:
            return IMAGING_STUDY;
        case IMMUNIZATION:
            return IMMUNIZATION;
        case IMMUNIZATION_EVALUATION:
            return IMMUNIZATION_EVALUATION;
        case IMMUNIZATION_RECOMMENDATION:
            return IMMUNIZATION_RECOMMENDATION;
        case IMPLEMENTATION_GUIDE:
            return IMPLEMENTATION_GUIDE;
        case INSURANCE_PLAN:
            return INSURANCE_PLAN;
        case INVOICE:
            return INVOICE;
        case LIBRARY:
            return LIBRARY;
        case LINKAGE:
            return LINKAGE;
        case LIST:
            return LIST;
        case LOCATION:
            return LOCATION;
        case MEASURE:
            return MEASURE;
        case MEASURE_REPORT:
            return MEASURE_REPORT;
        case MEDIA:
            return MEDIA;
        case MEDICATION:
            return MEDICATION;
        case MEDICATION_ADMINISTRATION:
            return MEDICATION_ADMINISTRATION;
        case MEDICATION_DISPENSE:
            return MEDICATION_DISPENSE;
        case MEDICATION_KNOWLEDGE:
            return MEDICATION_KNOWLEDGE;
        case MEDICATION_REQUEST:
            return MEDICATION_REQUEST;
        case MEDICATION_STATEMENT:
            return MEDICATION_STATEMENT;
        case MEDICINAL_PRODUCT:
            return MEDICINAL_PRODUCT;
        case MEDICINAL_PRODUCT_AUTHORIZATION:
            return MEDICINAL_PRODUCT_AUTHORIZATION;
        case MEDICINAL_PRODUCT_CONTRAINDICATION:
            return MEDICINAL_PRODUCT_CONTRAINDICATION;
        case MEDICINAL_PRODUCT_INDICATION:
            return MEDICINAL_PRODUCT_INDICATION;
        case MEDICINAL_PRODUCT_INGREDIENT:
            return MEDICINAL_PRODUCT_INGREDIENT;
        case MEDICINAL_PRODUCT_INTERACTION:
            return MEDICINAL_PRODUCT_INTERACTION;
        case MEDICINAL_PRODUCT_MANUFACTURED:
            return MEDICINAL_PRODUCT_MANUFACTURED;
        case MEDICINAL_PRODUCT_PACKAGED:
            return MEDICINAL_PRODUCT_PACKAGED;
        case MEDICINAL_PRODUCT_PHARMACEUTICAL:
            return MEDICINAL_PRODUCT_PHARMACEUTICAL;
        case MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT:
            return MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT;
        case MESSAGE_DEFINITION:
            return MESSAGE_DEFINITION;
        case MESSAGE_HEADER:
            return MESSAGE_HEADER;
        case MOLECULAR_SEQUENCE:
            return MOLECULAR_SEQUENCE;
        case NAMING_SYSTEM:
            return NAMING_SYSTEM;
        case NUTRITION_ORDER:
            return NUTRITION_ORDER;
        case OBSERVATION:
            return OBSERVATION;
        case OBSERVATION_DEFINITION:
            return OBSERVATION_DEFINITION;
        case OPERATION_DEFINITION:
            return OPERATION_DEFINITION;
        case OPERATION_OUTCOME:
            return OPERATION_OUTCOME;
        case ORGANIZATION:
            return ORGANIZATION;
        case ORGANIZATION_AFFILIATION:
            return ORGANIZATION_AFFILIATION;
        case PARAMETERS:
            return PARAMETERS;
        case PATIENT:
            return PATIENT;
        case PAYMENT_NOTICE:
            return PAYMENT_NOTICE;
        case PAYMENT_RECONCILIATION:
            return PAYMENT_RECONCILIATION;
        case PERSON:
            return PERSON;
        case PLAN_DEFINITION:
            return PLAN_DEFINITION;
        case PRACTITIONER:
            return PRACTITIONER;
        case PRACTITIONER_ROLE:
            return PRACTITIONER_ROLE;
        case PROCEDURE:
            return PROCEDURE;
        case PROVENANCE:
            return PROVENANCE;
        case QUESTIONNAIRE:
            return QUESTIONNAIRE;
        case QUESTIONNAIRE_RESPONSE:
            return QUESTIONNAIRE_RESPONSE;
        case RELATED_PERSON:
            return RELATED_PERSON;
        case REQUEST_GROUP:
            return REQUEST_GROUP;
        case RESEARCH_DEFINITION:
            return RESEARCH_DEFINITION;
        case RESEARCH_ELEMENT_DEFINITION:
            return RESEARCH_ELEMENT_DEFINITION;
        case RESEARCH_STUDY:
            return RESEARCH_STUDY;
        case RESEARCH_SUBJECT:
            return RESEARCH_SUBJECT;
        case RESOURCE:
            return RESOURCE;
        case RISK_ASSESSMENT:
            return RISK_ASSESSMENT;
        case RISK_EVIDENCE_SYNTHESIS:
            return RISK_EVIDENCE_SYNTHESIS;
        case SCHEDULE:
            return SCHEDULE;
        case SEARCH_PARAMETER:
            return SEARCH_PARAMETER;
        case SERVICE_REQUEST:
            return SERVICE_REQUEST;
        case SLOT:
            return SLOT;
        case SPECIMEN:
            return SPECIMEN;
        case SPECIMEN_DEFINITION:
            return SPECIMEN_DEFINITION;
        case STRUCTURE_DEFINITION:
            return STRUCTURE_DEFINITION;
        case STRUCTURE_MAP:
            return STRUCTURE_MAP;
        case SUBSCRIPTION:
            return SUBSCRIPTION;
        case SUBSTANCE:
            return SUBSTANCE;
        case SUBSTANCE_NUCLEIC_ACID:
            return SUBSTANCE_NUCLEIC_ACID;
        case SUBSTANCE_POLYMER:
            return SUBSTANCE_POLYMER;
        case SUBSTANCE_PROTEIN:
            return SUBSTANCE_PROTEIN;
        case SUBSTANCE_REFERENCE_INFORMATION:
            return SUBSTANCE_REFERENCE_INFORMATION;
        case SUBSTANCE_SOURCE_MATERIAL:
            return SUBSTANCE_SOURCE_MATERIAL;
        case SUBSTANCE_SPECIFICATION:
            return SUBSTANCE_SPECIFICATION;
        case SUPPLY_DELIVERY:
            return SUPPLY_DELIVERY;
        case SUPPLY_REQUEST:
            return SUPPLY_REQUEST;
        case TASK:
            return TASK;
        case TERMINOLOGY_CAPABILITIES:
            return TERMINOLOGY_CAPABILITIES;
        case TEST_REPORT:
            return TEST_REPORT;
        case TEST_SCRIPT:
            return TEST_SCRIPT;
        case VALUE_SET:
            return VALUE_SET;
        case VERIFICATION_RESULT:
            return VERIFICATION_RESULT;
        case VISION_PRESCRIPTION:
            return VISION_PRESCRIPTION;
        default:
            throw new IllegalStateException(value.name());
        }
    }

    /**
     * Factory method for creating FHIRResourceType objects from a passed string value.
     * 
     * @param value
     *     A string that matches one of the allowed code values
     * @throws IllegalArgumentException
     *     If the passed string cannot be parsed into an allowed code value
     */
    public static FHIRResourceType of(java.lang.String value) {
        return of(ValueSet.from(value));
    }

    /**
     * Inhereted factory method for creating FHIRResourceType objects from a passed string value.
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
     * Inhereted factory method for creating FHIRResourceType objects from a passed string value.
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
        FHIRResourceType other = (FHIRResourceType) obj;
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
        public FHIRResourceType build() {
            return new FHIRResourceType(this);
        }
    }

    public enum ValueSet {
        /**
         * Account
         * 
         * <p>A financial tool for tracking value accrued for a particular purpose. In the healthcare field, used to track 
         * charges for a patient, cost centers, etc.
         */
        ACCOUNT("Account"),

        /**
         * ActivityDefinition
         * 
         * <p>This resource allows for the definition of some activity to be performed, independent of a particular patient, 
         * practitioner, or other performance context.
         */
        ACTIVITY_DEFINITION("ActivityDefinition"),

        /**
         * AdverseEvent
         * 
         * <p>Actual or potential/avoided event causing unintended physical injury resulting from or contributed to by medical 
         * care, a research study or other healthcare setting factors that requires additional monitoring, treatment, or 
         * hospitalization, or that results in death.
         */
        ADVERSE_EVENT("AdverseEvent"),

        /**
         * AllergyIntolerance
         * 
         * <p>Risk of harmful or undesirable, physiological response which is unique to an individual and associated with 
         * exposure to a substance.
         */
        ALLERGY_INTOLERANCE("AllergyIntolerance"),

        /**
         * Appointment
         * 
         * <p>A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or device(s) for a 
         * specific date/time. This may result in one or more Encounter(s).
         */
        APPOINTMENT("Appointment"),

        /**
         * AppointmentResponse
         * 
         * <p>A reply to an appointment request for a patient and/or practitioner(s), such as a confirmation or rejection.
         */
        APPOINTMENT_RESPONSE("AppointmentResponse"),

        /**
         * AuditEvent
         * 
         * <p>A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion 
         * attempts and monitoring for inappropriate usage.
         */
        AUDIT_EVENT("AuditEvent"),

        /**
         * Basic
         * 
         * <p>Basic is used for handling concepts not yet defined in FHIR, narrative-only resources that don't map to an existing 
         * resource, and custom resources not appropriate for inclusion in the FHIR specification.
         */
        BASIC("Basic"),

        /**
         * Binary
         * 
         * <p>A resource that represents the data of a single raw artifact as digital content accessible in its native format. A 
         * Binary resource can contain any content, whether text, image, pdf, zip archive, etc.
         */
        BINARY("Binary"),

        /**
         * BiologicallyDerivedProduct
         * 
         * <p>A material substance originating from a biological entity intended to be transplanted or infused
         * <p>into another (possibly the same) biological entity.
         */
        BIOLOGICALLY_DERIVED_PRODUCT("BiologicallyDerivedProduct"),

        /**
         * BodyStructure
         * 
         * <p>Record details about an anatomical structure. This resource may be used when a coded concept does not provide the 
         * necessary detail needed for the use case.
         */
        BODY_STRUCTURE("BodyStructure"),

        /**
         * Bundle
         * 
         * <p>A container for a collection of resources.
         */
        BUNDLE("Bundle"),

        /**
         * CapabilityStatement
         * 
         * <p>A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server for a particular version of 
         * FHIR that may be used as a statement of actual server functionality or a statement of required or desired server 
         * implementation.
         */
        CAPABILITY_STATEMENT("CapabilityStatement"),

        /**
         * CarePlan
         * 
         * <p>Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or 
         * community for a period of time, possibly limited to care for a specific condition or set of conditions.
         */
        CARE_PLAN("CarePlan"),

        /**
         * CareTeam
         * 
         * <p>The Care Team includes all the people and organizations who plan to participate in the coordination and delivery of 
         * care for a patient.
         */
        CARE_TEAM("CareTeam"),

        /**
         * CatalogEntry
         * 
         * <p>Catalog entries are wrappers that contextualize items included in a catalog.
         */
        CATALOG_ENTRY("CatalogEntry"),

        /**
         * ChargeItem
         * 
         * <p>The resource ChargeItem describes the provision of healthcare provider products for a certain patient, therefore 
         * referring not only to the product, but containing in addition details of the provision, like date, time, amounts and 
         * participating organizations and persons. Main Usage of the ChargeItem is to enable the billing process and internal 
         * cost allocation.
         */
        CHARGE_ITEM("ChargeItem"),

        /**
         * ChargeItemDefinition
         * 
         * <p>The ChargeItemDefinition resource provides the properties that apply to the (billing) codes necessary to calculate 
         * costs and prices. The properties may differ largely depending on type and realm, therefore this resource gives only a 
         * rough structure and requires profiling for each type of billing code system.
         */
        CHARGE_ITEM_DEFINITION("ChargeItemDefinition"),

        /**
         * Claim
         * 
         * <p>A provider issued list of professional services and products which have been provided, or are to be provided, to a 
         * patient which is sent to an insurer for reimbursement.
         */
        CLAIM("Claim"),

        /**
         * ClaimResponse
         * 
         * <p>This resource provides the adjudication details from the processing of a Claim resource.
         */
        CLAIM_RESPONSE("ClaimResponse"),

        /**
         * ClinicalImpression
         * 
         * <p>A record of a clinical assessment performed to determine what problem(s) may affect the patient and before planning 
         * the treatments or management strategies that are best to manage a patient's condition. Assessments are often 1:1 with 
         * a clinical consultation / encounter, but this varies greatly depending on the clinical workflow. This resource is 
         * called "ClinicalImpression" rather than "ClinicalAssessment" to avoid confusion with the recording of assessment tools 
         * such as Apgar score.
         */
        CLINICAL_IMPRESSION("ClinicalImpression"),

        /**
         * CodeSystem
         * 
         * <p>The CodeSystem resource is used to declare the existence of and describe a code system or code system supplement 
         * and its key properties, and optionally define a part or all of its content.
         */
        CODE_SYSTEM("CodeSystem"),

        /**
         * Communication
         * 
         * <p>An occurrence of information being transmitted; e.g. an alert that was sent to a responsible provider, a public 
         * health agency that was notified about a reportable condition.
         */
        COMMUNICATION("Communication"),

        /**
         * CommunicationRequest
         * 
         * <p>A request to convey information; e.g. the CDS system proposes that an alert be sent to a responsible provider, the 
         * CDS system proposes that the public health agency be notified about a reportable condition.
         */
        COMMUNICATION_REQUEST("CommunicationRequest"),

        /**
         * CompartmentDefinition
         * 
         * <p>A compartment definition that defines how resources are accessed on a server.
         */
        COMPARTMENT_DEFINITION("CompartmentDefinition"),

        /**
         * Composition
         * 
         * <p>A set of healthcare-related information that is assembled together into a single logical package that provides a 
         * single coherent statement of meaning, establishes its own context and that has clinical attestation with regard to who 
         * is making the statement. A Composition defines the structure and narrative content necessary for a document. However, 
         * a Composition alone does not constitute a document. Rather, the Composition must be the first entry in a Bundle where 
         * Bundle.type=document, and any other resources referenced from Composition must be included as subsequent entries in 
         * the Bundle (for example Patient, Practitioner, Encounter, etc.).
         */
        COMPOSITION("Composition"),

        /**
         * ConceptMap
         * 
         * <p>A statement of relationships from one set of concepts to one or more other concepts - either concepts in code 
         * systems, or data element/data element concepts, or classes in class models.
         */
        CONCEPT_MAP("ConceptMap"),

        /**
         * Condition
         * 
         * <p>A clinical condition, problem, diagnosis, or other event, situation, issue, or clinical concept that has risen to a 
         * level of concern.
         */
        CONDITION("Condition"),

        /**
         * Consent
         * 
         * <p>A record of a healthcare consumer’s choices, which permits or denies identified recipient(s) or recipient role(s) 
         * to perform one or more actions within a given policy context, for specific purposes and periods of time.
         */
        CONSENT("Consent"),

        /**
         * Contract
         * 
         * <p>Legally enforceable, formally recorded unilateral or bilateral directive i.e., a policy or agreement.
         */
        CONTRACT("Contract"),

        /**
         * Coverage
         * 
         * <p>Financial instrument which may be used to reimburse or pay for health care products and services. Includes both 
         * insurance and self-payment.
         */
        COVERAGE("Coverage"),

        /**
         * CoverageEligibilityRequest
         * 
         * <p>The CoverageEligibilityRequest provides patient and insurance coverage information to an insurer for them to 
         * respond, in the form of an CoverageEligibilityResponse, with information regarding whether the stated coverage is 
         * valid and in-force and optionally to provide the insurance details of the policy.
         */
        COVERAGE_ELIGIBILITY_REQUEST("CoverageEligibilityRequest"),

        /**
         * CoverageEligibilityResponse
         * 
         * <p>This resource provides eligibility and plan details from the processing of an CoverageEligibilityRequest resource.
         */
        COVERAGE_ELIGIBILITY_RESPONSE("CoverageEligibilityResponse"),

        /**
         * DetectedIssue
         * 
         * <p>Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for 
         * a patient; e.g. Drug-drug interaction, Ineffective treatment frequency, Procedure-condition conflict, etc.
         */
        DETECTED_ISSUE("DetectedIssue"),

        /**
         * Device
         * 
         * <p>A type of a manufactured item that is used in the provision of healthcare without being substantially changed 
         * through that activity. The device may be a medical or non-medical device.
         */
        DEVICE("Device"),

        /**
         * DeviceDefinition
         * 
         * <p>The characteristics, operational status and capabilities of a medical-related component of a medical device.
         */
        DEVICE_DEFINITION("DeviceDefinition"),

        /**
         * DeviceMetric
         * 
         * <p>Describes a measurement, calculation or setting capability of a medical device.
         */
        DEVICE_METRIC("DeviceMetric"),

        /**
         * DeviceRequest
         * 
         * <p>Represents a request for a patient to employ a medical device. The device may be an implantable device, or an 
         * external assistive device, such as a walker.
         */
        DEVICE_REQUEST("DeviceRequest"),

        /**
         * DeviceUseStatement
         * 
         * <p>A record of a device being used by a patient where the record is the result of a report from the patient or another 
         * clinician.
         */
        DEVICE_USE_STATEMENT("DeviceUseStatement"),

        /**
         * DiagnosticReport
         * 
         * <p>The findings and interpretation of diagnostic tests performed on patients, groups of patients, devices, and 
         * locations, and/or specimens derived from these. The report includes clinical context such as requesting and provider 
         * information, and some mix of atomic results, images, textual and coded interpretations, and formatted representation 
         * of diagnostic reports.
         */
        DIAGNOSTIC_REPORT("DiagnosticReport"),

        /**
         * DocumentManifest
         * 
         * <p>A collection of documents compiled for a purpose together with metadata that applies to the collection.
         */
        DOCUMENT_MANIFEST("DocumentManifest"),

        /**
         * DocumentReference
         * 
         * <p>A reference to a document of any kind for any purpose. Provides metadata about the document so that the document 
         * can be discovered and managed. The scope of a document is any seralized object with a mime-type, so includes formal 
         * patient centric documents (CDA), cliical notes, scanned paper, and non-patient specific documents like policy text.
         */
        DOCUMENT_REFERENCE("DocumentReference"),

        /**
         * DomainResource
         * 
         * <p>A resource that includes narrative, extensions, and contained resources.
         */
        DOMAIN_RESOURCE("DomainResource"),

        /**
         * EffectEvidenceSynthesis
         * 
         * <p>The EffectEvidenceSynthesis resource describes the difference in an outcome between exposures states in a 
         * population where the effect estimate is derived from a combination of research studies.
         */
        EFFECT_EVIDENCE_SYNTHESIS("EffectEvidenceSynthesis"),

        /**
         * Encounter
         * 
         * <p>An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or 
         * assessing the health status of a patient.
         */
        ENCOUNTER("Encounter"),

        /**
         * Endpoint
         * 
         * <p>The technical details of an endpoint that can be used for electronic services, such as for web services providing 
         * XDS.b or a REST endpoint for another FHIR server. This may include any security context information.
         */
        ENDPOINT("Endpoint"),

        /**
         * EnrollmentRequest
         * 
         * <p>This resource provides the insurance enrollment details to the insurer regarding a specified coverage.
         */
        ENROLLMENT_REQUEST("EnrollmentRequest"),

        /**
         * EnrollmentResponse
         * 
         * <p>This resource provides enrollment and plan details from the processing of an EnrollmentRequest resource.
         */
        ENROLLMENT_RESPONSE("EnrollmentResponse"),

        /**
         * EpisodeOfCare
         * 
         * <p>An association between a patient and an organization / healthcare provider(s) during which time encounters may 
         * occur. The managing organization assumes a level of responsibility for the patient during this time.
         */
        EPISODE_OF_CARE("EpisodeOfCare"),

        /**
         * EventDefinition
         * 
         * <p>The EventDefinition resource provides a reusable description of when a particular event can occur.
         */
        EVENT_DEFINITION("EventDefinition"),

        /**
         * Evidence
         * 
         * <p>The Evidence resource describes the conditional state (population and any exposures being compared within the 
         * population) and outcome (if specified) that the knowledge (evidence, assertion, recommendation) is about.
         */
        EVIDENCE("Evidence"),

        /**
         * EvidenceVariable
         * 
         * <p>The EvidenceVariable resource describes a "PICO" element that knowledge (evidence, assertion, recommendation) is 
         * about.
         */
        EVIDENCE_VARIABLE("EvidenceVariable"),

        /**
         * ExampleScenario
         * 
         * <p>Example of workflow instance.
         */
        EXAMPLE_SCENARIO("ExampleScenario"),

        /**
         * ExplanationOfBenefit
         * 
         * <p>This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally 
         * account balance information, for informing the subscriber of the benefits provided.
         */
        EXPLANATION_OF_BENEFIT("ExplanationOfBenefit"),

        /**
         * FamilyMemberHistory
         * 
         * <p>Significant health conditions for a person related to the patient relevant in the context of care for the patient.
         */
        FAMILY_MEMBER_HISTORY("FamilyMemberHistory"),

        /**
         * Flag
         * 
         * <p>Prospective warnings of potential issues when providing care to the patient.
         */
        FLAG("Flag"),

        /**
         * Goal
         * 
         * <p>Describes the intended objective(s) for a patient, group or organization care, for example, weight loss, restoring 
         * an activity of daily living, obtaining herd immunity via immunization, meeting a process improvement objective, etc.
         */
        GOAL("Goal"),

        /**
         * GraphDefinition
         * 
         * <p>A formal computable definition of a graph of resources - that is, a coherent set of resources that form a graph by 
         * following references. The Graph Definition resource defines a set and makes rules about the set.
         */
        GRAPH_DEFINITION("GraphDefinition"),

        /**
         * Group
         * 
         * <p>Represents a defined collection of entities that may be discussed or acted upon collectively but which are not 
         * expected to act collectively, and are not formally or legally recognized; i.e. a collection of entities that isn't an 
         * Organization.
         */
        GROUP("Group"),

        /**
         * GuidanceResponse
         * 
         * <p>A guidance response is the formal response to a guidance request, including any output parameters returned by the 
         * evaluation, as well as the description of any proposed actions to be taken.
         */
        GUIDANCE_RESPONSE("GuidanceResponse"),

        /**
         * HealthcareService
         * 
         * <p>The details of a healthcare service available at a location.
         */
        HEALTHCARE_SERVICE("HealthcareService"),

        /**
         * ImagingStudy
         * 
         * <p>Representation of the content produced in a DICOM imaging study. A study comprises a set of series, each of which 
         * includes a set of Service-Object Pair Instances (SOP Instances - images or other data) acquired or produced in a 
         * common context. A series is of only one modality (e.g. X-ray, CT, MR, ultrasound), but a study may have multiple 
         * series of different modalities.
         */
        IMAGING_STUDY("ImagingStudy"),

        /**
         * Immunization
         * 
         * <p>Describes the event of a patient being administered a vaccine or a record of an immunization as reported by a 
         * patient, a clinician or another party.
         */
        IMMUNIZATION("Immunization"),

        /**
         * ImmunizationEvaluation
         * 
         * <p>Describes a comparison of an immunization event against published recommendations to determine if the 
         * administration is "valid" in relation to those recommendations.
         */
        IMMUNIZATION_EVALUATION("ImmunizationEvaluation"),

        /**
         * ImmunizationRecommendation
         * 
         * <p>A patient's point-in-time set of recommendations (i.e. forecasting) according to a published schedule with optional 
         * supporting justification.
         */
        IMMUNIZATION_RECOMMENDATION("ImmunizationRecommendation"),

        /**
         * ImplementationGuide
         * 
         * <p>A set of rules of how a particular interoperability or standards problem is solved - typically through the use of 
         * FHIR resources. This resource is used to gather all the parts of an implementation guide into a logical whole and to 
         * publish a computable definition of all the parts.
         */
        IMPLEMENTATION_GUIDE("ImplementationGuide"),

        /**
         * InsurancePlan
         * 
         * <p>Details of a Health Insurance product/plan provided by an organization.
         */
        INSURANCE_PLAN("InsurancePlan"),

        /**
         * Invoice
         * 
         * <p>Invoice containing collected ChargeItems from an Account with calculated individual and total price for Billing 
         * purpose.
         */
        INVOICE("Invoice"),

        /**
         * Library
         * 
         * <p>The Library resource is a general-purpose container for knowledge asset definitions. It can be used to describe and 
         * expose existing knowledge assets such as logic libraries and information model descriptions, as well as to describe a 
         * collection of knowledge assets.
         */
        LIBRARY("Library"),

        /**
         * Linkage
         * 
         * <p>Identifies two or more records (resource instances) that refer to the same real-world "occurrence".
         */
        LINKAGE("Linkage"),

        /**
         * List
         * 
         * <p>A list is a curated collection of resources.
         */
        LIST("List"),

        /**
         * Location
         * 
         * <p>Details and position information for a physical place where services are provided and resources and participants 
         * may be stored, found, contained, or accommodated.
         */
        LOCATION("Location"),

        /**
         * Measure
         * 
         * <p>The Measure resource provides the definition of a quality measure.
         */
        MEASURE("Measure"),

        /**
         * MeasureReport
         * 
         * <p>The MeasureReport resource contains the results of the calculation of a measure; and optionally a reference to the 
         * resources involved in that calculation.
         */
        MEASURE_REPORT("MeasureReport"),

        /**
         * Media
         * 
         * <p>A photo, video, or audio recording acquired or used in healthcare. The actual content may be inline or provided by 
         * direct reference.
         */
        MEDIA("Media"),

        /**
         * Medication
         * 
         * <p>This resource is primarily used for the identification and definition of a medication for the purposes of 
         * prescribing, dispensing, and administering a medication as well as for making statements about medication use.
         */
        MEDICATION("Medication"),

        /**
         * MedicationAdministration
         * 
         * <p>Describes the event of a patient consuming or otherwise being administered a medication. This may be as simple as 
         * swallowing a tablet or it may be a long running infusion. Related resources tie this event to the authorizing 
         * prescription, and the specific encounter between patient and health care practitioner.
         */
        MEDICATION_ADMINISTRATION("MedicationAdministration"),

        /**
         * MedicationDispense
         * 
         * <p>Indicates that a medication product is to be or has been dispensed for a named person/patient. This includes a 
         * description of the medication product (supply) provided and the instructions for administering the medication. The 
         * medication dispense is the result of a pharmacy system responding to a medication order.
         */
        MEDICATION_DISPENSE("MedicationDispense"),

        /**
         * MedicationKnowledge
         * 
         * <p>Information about a medication that is used to support knowledge.
         */
        MEDICATION_KNOWLEDGE("MedicationKnowledge"),

        /**
         * MedicationRequest
         * 
         * <p>An order or request for both supply of the medication and the instructions for administration of the medication to 
         * a patient. The resource is called "MedicationRequest" rather than "MedicationPrescription" or "MedicationOrder" to 
         * generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with 
         * workflow patterns.
         */
        MEDICATION_REQUEST("MedicationRequest"),

        /**
         * MedicationStatement
         * 
         * <p>A record of a medication that is being consumed by a patient. A MedicationStatement may indicate that the patient 
         * may be taking the medication now or has taken the medication in the past or will be taking the medication in the 
         * future. The source of this information can be the patient, significant other (such as a family member or spouse), or a 
         * clinician. A common scenario where this information is captured is during the history taking process during a patient 
         * visit or stay. The medication information may come from sources such as the patient's memory, from a prescription 
         * bottle, or from a list of medications the patient, clinician or other party maintains. 
         * 
         * <p>The primary difference between a medication statement and a medication administration is that the medication 
         * administration has complete administration information and is based on actual administration information from the 
         * person who administered the medication. A medication statement is often, if not always, less specific. There is no 
         * required date/time when the medication was administered, in fact we only know that a source has reported the patient 
         * is taking this medication, where details such as time, quantity, or rate or even medication product may be incomplete 
         * or missing or less precise. As stated earlier, the medication statement information may come from the patient's 
         * memory, from a prescription bottle or from a list of medications the patient, clinician or other party maintains. 
         * Medication administration is more formal and is not missing detailed information.
         */
        MEDICATION_STATEMENT("MedicationStatement"),

        /**
         * MedicinalProduct
         * 
         * <p>Detailed definition of a medicinal product, typically for uses other than direct patient care (e.g. regulatory use).
         */
        MEDICINAL_PRODUCT("MedicinalProduct"),

        /**
         * MedicinalProductAuthorization
         * 
         * <p>The regulatory authorization of a medicinal product.
         */
        MEDICINAL_PRODUCT_AUTHORIZATION("MedicinalProductAuthorization"),

        /**
         * MedicinalProductContraindication
         * 
         * <p>The clinical particulars - indications, contraindications etc. of a medicinal product, including for regulatory 
         * purposes.
         */
        MEDICINAL_PRODUCT_CONTRAINDICATION("MedicinalProductContraindication"),

        /**
         * MedicinalProductIndication
         * 
         * <p>Indication for the Medicinal Product.
         */
        MEDICINAL_PRODUCT_INDICATION("MedicinalProductIndication"),

        /**
         * MedicinalProductIngredient
         * 
         * <p>An ingredient of a manufactured item or pharmaceutical product.
         */
        MEDICINAL_PRODUCT_INGREDIENT("MedicinalProductIngredient"),

        /**
         * MedicinalProductInteraction
         * 
         * <p>The interactions of the medicinal product with other medicinal products, or other forms of interactions.
         */
        MEDICINAL_PRODUCT_INTERACTION("MedicinalProductInteraction"),

        /**
         * MedicinalProductManufactured
         * 
         * <p>The manufactured item as contained in the packaged medicinal product.
         */
        MEDICINAL_PRODUCT_MANUFACTURED("MedicinalProductManufactured"),

        /**
         * MedicinalProductPackaged
         * 
         * <p>A medicinal product in a container or package.
         */
        MEDICINAL_PRODUCT_PACKAGED("MedicinalProductPackaged"),

        /**
         * MedicinalProductPharmaceutical
         * 
         * <p>A pharmaceutical product described in terms of its composition and dose form.
         */
        MEDICINAL_PRODUCT_PHARMACEUTICAL("MedicinalProductPharmaceutical"),

        /**
         * MedicinalProductUndesirableEffect
         * 
         * <p>Describe the undesirable effects of the medicinal product.
         */
        MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT("MedicinalProductUndesirableEffect"),

        /**
         * MessageDefinition
         * 
         * <p>Defines the characteristics of a message that can be shared between systems, including the type of event that 
         * initiates the message, the content to be transmitted and what response(s), if any, are permitted.
         */
        MESSAGE_DEFINITION("MessageDefinition"),

        /**
         * MessageHeader
         * 
         * <p>The header for a message exchange that is either requesting or responding to an action. The reference(s) that are 
         * the subject of the action as well as other information related to the action are typically transmitted in a bundle in 
         * which the MessageHeader resource instance is the first resource in the bundle.
         */
        MESSAGE_HEADER("MessageHeader"),

        /**
         * MolecularSequence
         * 
         * <p>Raw data describing a biological sequence.
         */
        MOLECULAR_SEQUENCE("MolecularSequence"),

        /**
         * NamingSystem
         * 
         * <p>A curated namespace that issues unique symbols within that namespace for the identification of concepts, people, 
         * devices, etc. Represents a "System" used within the Identifier and Coding data types.
         */
        NAMING_SYSTEM("NamingSystem"),

        /**
         * NutritionOrder
         * 
         * <p>A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.
         */
        NUTRITION_ORDER("NutritionOrder"),

        /**
         * Observation
         * 
         * <p>Measurements and simple assertions made about a patient, device or other subject.
         */
        OBSERVATION("Observation"),

        /**
         * ObservationDefinition
         * 
         * <p>Set of definitional characteristics for a kind of observation or measurement produced or consumed by an orderable 
         * health care service.
         */
        OBSERVATION_DEFINITION("ObservationDefinition"),

        /**
         * OperationDefinition
         * 
         * <p>A formal computable definition of an operation (on the RESTful interface) or a named query (using the search 
         * interaction).
         */
        OPERATION_DEFINITION("OperationDefinition"),

        /**
         * OperationOutcome
         * 
         * <p>A collection of error, warning, or information messages that result from a system action.
         */
        OPERATION_OUTCOME("OperationOutcome"),

        /**
         * Organization
         * 
         * <p>A formally or informally recognized grouping of people or organizations formed for the purpose of achieving some 
         * form of collective action. Includes companies, institutions, corporations, departments, community groups, healthcare 
         * practice groups, payer/insurer, etc.
         */
        ORGANIZATION("Organization"),

        /**
         * OrganizationAffiliation
         * 
         * <p>Defines an affiliation/assotiation/relationship between 2 distinct oganizations, that is not a part-of 
         * relationship/sub-division relationship.
         */
        ORGANIZATION_AFFILIATION("OrganizationAffiliation"),

        /**
         * Parameters
         * 
         * <p>This resource is a non-persisted resource used to pass information into and back from an [operation](operations.
         * html). It has no other use, and there is no RESTful endpoint associated with it.
         */
        PARAMETERS("Parameters"),

        /**
         * Patient
         * 
         * <p>Demographics and other administrative information about an individual or animal receiving care or other health-
         * related services.
         */
        PATIENT("Patient"),

        /**
         * PaymentNotice
         * 
         * <p>This resource provides the status of the payment for goods and services rendered, and the request and response 
         * resource references.
         */
        PAYMENT_NOTICE("PaymentNotice"),

        /**
         * PaymentReconciliation
         * 
         * <p>This resource provides the details including amount of a payment and allocates the payment items being paid.
         */
        PAYMENT_RECONCILIATION("PaymentReconciliation"),

        /**
         * Person
         * 
         * <p>Demographics and administrative information about a person independent of a specific health-related context.
         */
        PERSON("Person"),

        /**
         * PlanDefinition
         * 
         * <p>This resource allows for the definition of various types of plans as a sharable, consumable, and executable 
         * artifact. The resource is general enough to support the description of a broad range of clinical artifacts such as 
         * clinical decision support rules, order sets and protocols.
         */
        PLAN_DEFINITION("PlanDefinition"),

        /**
         * Practitioner
         * 
         * <p>A person who is directly or indirectly involved in the provisioning of healthcare.
         */
        PRACTITIONER("Practitioner"),

        /**
         * PractitionerRole
         * 
         * <p>A specific set of Roles/Locations/specialties/services that a practitioner may perform at an organization for a 
         * period of time.
         */
        PRACTITIONER_ROLE("PractitionerRole"),

        /**
         * Procedure
         * 
         * <p>An action that is or was performed on or for a patient. This can be a physical intervention like an operation, or 
         * less invasive like long term services, counseling, or hypnotherapy.
         */
        PROCEDURE("Procedure"),

        /**
         * Provenance
         * 
         * <p>Provenance of a resource is a record that describes entities and processes involved in producing and delivering or 
         * otherwise influencing that resource. Provenance provides a critical foundation for assessing authenticity, enabling 
         * trust, and allowing reproducibility. Provenance assertions are a form of contextual metadata and can themselves become 
         * important records with their own provenance. Provenance statement indicates clinical significance in terms of 
         * confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle (e.g. Document 
         * Completion - has the artifact been legally authenticated), all of which may impact security, privacy, and trust 
         * policies.
         */
        PROVENANCE("Provenance"),

        /**
         * Questionnaire
         * 
         * <p>A structured set of questions intended to guide the collection of answers from end-users. Questionnaires provide 
         * detailed control over order, presentation, phraseology and grouping to allow coherent, consistent data collection.
         */
        QUESTIONNAIRE("Questionnaire"),

        /**
         * QuestionnaireResponse
         * 
         * <p>A structured set of questions and their answers. The questions are ordered and grouped into coherent subsets, 
         * corresponding to the structure of the grouping of the questionnaire being responded to.
         */
        QUESTIONNAIRE_RESPONSE("QuestionnaireResponse"),

        /**
         * RelatedPerson
         * 
         * <p>Information about a person that is involved in the care for a patient, but who is not the target of healthcare, nor 
         * has a formal responsibility in the care process.
         */
        RELATED_PERSON("RelatedPerson"),

        /**
         * RequestGroup
         * 
         * <p>A group of related requests that can be used to capture intended activities that have inter-dependencies such as 
         * "give this medication after that one".
         */
        REQUEST_GROUP("RequestGroup"),

        /**
         * ResearchDefinition
         * 
         * <p>The ResearchDefinition resource describes the conditional state (population and any exposures being compared within 
         * the population) and outcome (if specified) that the knowledge (evidence, assertion, recommendation) is about.
         */
        RESEARCH_DEFINITION("ResearchDefinition"),

        /**
         * ResearchElementDefinition
         * 
         * <p>The ResearchElementDefinition resource describes a "PICO" element that knowledge (evidence, assertion, 
         * recommendation) is about.
         */
        RESEARCH_ELEMENT_DEFINITION("ResearchElementDefinition"),

        /**
         * ResearchStudy
         * 
         * <p>A process where a researcher or organization plans and then executes a series of steps intended to increase the 
         * field of healthcare-related knowledge. This includes studies of safety, efficacy, comparative effectiveness and other 
         * information about medications, devices, therapies and other interventional and investigative techniques. A 
         * ResearchStudy involves the gathering of information about human or animal subjects.
         */
        RESEARCH_STUDY("ResearchStudy"),

        /**
         * ResearchSubject
         * 
         * <p>A physical entity which is the primary unit of operational and/or administrative interest in a study.
         */
        RESEARCH_SUBJECT("ResearchSubject"),

        /**
         * Resource
         * 
         * <p>This is the base resource type for everything.
         */
        RESOURCE("Resource"),

        /**
         * RiskAssessment
         * 
         * <p>An assessment of the likely outcome(s) for a patient or other subject as well as the likelihood of each outcome.
         */
        RISK_ASSESSMENT("RiskAssessment"),

        /**
         * RiskEvidenceSynthesis
         * 
         * <p>The RiskEvidenceSynthesis resource describes the likelihood of an outcome in a population plus exposure state where 
         * the risk estimate is derived from a combination of research studies.
         */
        RISK_EVIDENCE_SYNTHESIS("RiskEvidenceSynthesis"),

        /**
         * Schedule
         * 
         * <p>A container for slots of time that may be available for booking appointments.
         */
        SCHEDULE("Schedule"),

        /**
         * SearchParameter
         * 
         * <p>A search parameter that defines a named search item that can be used to search/filter on a resource.
         */
        SEARCH_PARAMETER("SearchParameter"),

        /**
         * ServiceRequest
         * 
         * <p>A record of a request for service such as diagnostic investigations, treatments, or operations to be performed.
         */
        SERVICE_REQUEST("ServiceRequest"),

        /**
         * Slot
         * 
         * <p>A slot of time on a schedule that may be available for booking appointments.
         */
        SLOT("Slot"),

        /**
         * Specimen
         * 
         * <p>A sample to be used for analysis.
         */
        SPECIMEN("Specimen"),

        /**
         * SpecimenDefinition
         * 
         * <p>A kind of specimen with associated set of requirements.
         */
        SPECIMEN_DEFINITION("SpecimenDefinition"),

        /**
         * StructureDefinition
         * 
         * <p>A definition of a FHIR structure. This resource is used to describe the underlying resources, data types defined in 
         * FHIR, and also for describing extensions and constraints on resources and data types.
         */
        STRUCTURE_DEFINITION("StructureDefinition"),

        /**
         * StructureMap
         * 
         * <p>A Map of relationships between 2 structures that can be used to transform data.
         */
        STRUCTURE_MAP("StructureMap"),

        /**
         * Subscription
         * 
         * <p>The subscription resource is used to define a push-based subscription from a server to another system. Once a 
         * subscription is registered with the server, the server checks every resource that is created or updated, and if the 
         * resource matches the given criteria, it sends a message on the defined "channel" so that another system can take an 
         * appropriate action.
         */
        SUBSCRIPTION("Subscription"),

        /**
         * Substance
         * 
         * <p>A homogeneous material with a definite composition.
         */
        SUBSTANCE("Substance"),

        /**
         * SubstanceNucleicAcid
         * 
         * <p>Nucleic acids are defined by three distinct elements: the base, sugar and linkage. Individual substance/moiety IDs 
         * will be created for each of these elements. The nucleotide sequence will be always entered in the 5’-3’ direction.
         */
        SUBSTANCE_NUCLEIC_ACID("SubstanceNucleicAcid"),

        /**
         * SubstancePolymer
         * 
         * <p>Todo.
         */
        SUBSTANCE_POLYMER("SubstancePolymer"),

        /**
         * SubstanceProtein
         * 
         * <p>A SubstanceProtein is defined as a single unit of a linear amino acid sequence, or a combination of subunits that 
         * are either covalently linked or have a defined invariant stoichiometric relationship. This includes all synthetic, 
         * recombinant and purified SubstanceProteins of defined sequence, whether the use is therapeutic or prophylactic. This 
         * set of elements will be used to describe albumins, coagulation factors, cytokines, growth factors, 
         * peptide/SubstanceProtein hormones, enzymes, toxins, toxoids, recombinant vaccines, and immunomodulators.
         */
        SUBSTANCE_PROTEIN("SubstanceProtein"),

        /**
         * SubstanceReferenceInformation
         * 
         * <p>Todo.
         */
        SUBSTANCE_REFERENCE_INFORMATION("SubstanceReferenceInformation"),

        /**
         * SubstanceSourceMaterial
         * 
         * <p>Source material shall capture information on the taxonomic and anatomical origins as well as the fraction of a 
         * material that can result in or can be modified to form a substance. This set of data elements shall be used to define 
         * polymer substances isolated from biological matrices. Taxonomic and anatomical origins shall be described using a 
         * controlled vocabulary as required. This information is captured for naturally derived polymers ( . starch) and 
         * structurally diverse substances. For Organisms belonging to the Kingdom Plantae the Substance level defines the fresh 
         * material of a single species or infraspecies, the Herbal Drug and the Herbal preparation. For Herbal preparations, the 
         * fraction information will be captured at the Substance information level and additional information for herbal 
         * extracts will be captured at the Specified Substance Group 1 information level. See for further explanation the 
         * Substance Class: Structurally Diverse and the herbal annex.
         */
        SUBSTANCE_SOURCE_MATERIAL("SubstanceSourceMaterial"),

        /**
         * SubstanceSpecification
         * 
         * <p>The detailed description of a substance, typically at a level beyond what is used for prescribing.
         */
        SUBSTANCE_SPECIFICATION("SubstanceSpecification"),

        /**
         * SupplyDelivery
         * 
         * <p>Record of delivery of what is supplied.
         */
        SUPPLY_DELIVERY("SupplyDelivery"),

        /**
         * SupplyRequest
         * 
         * <p>A record of a request for a medication, substance or device used in the healthcare setting.
         */
        SUPPLY_REQUEST("SupplyRequest"),

        /**
         * Task
         * 
         * <p>A task to be performed.
         */
        TASK("Task"),

        /**
         * TerminologyCapabilities
         * 
         * <p>A TerminologyCapabilities resource documents a set of capabilities (behaviors) of a FHIR Terminology Server that 
         * may be used as a statement of actual server functionality or a statement of required or desired server implementation.
         */
        TERMINOLOGY_CAPABILITIES("TerminologyCapabilities"),

        /**
         * TestReport
         * 
         * <p>A summary of information based on the results of executing a TestScript.
         */
        TEST_REPORT("TestReport"),

        /**
         * TestScript
         * 
         * <p>A structured set of tests against a FHIR server or client implementation to determine compliance against the FHIR 
         * specification.
         */
        TEST_SCRIPT("TestScript"),

        /**
         * ValueSet
         * 
         * <p>A ValueSet resource instance specifies a set of codes drawn from one or more code systems, intended for use in a 
         * particular context. Value sets link between [[[CodeSystem]]] definitions and their use in [coded elements]
         * (terminologies.html).
         */
        VALUE_SET("ValueSet"),

        /**
         * VerificationResult
         * 
         * <p>Describes validation requirements, source(s), status and dates for one or more elements.
         */
        VERIFICATION_RESULT("VerificationResult"),

        /**
         * VisionPrescription
         * 
         * <p>An authorization for the provision of glasses and/or contact lenses to a patient.
         */
        VISION_PRESCRIPTION("VisionPrescription");

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
         * Factory method for creating FHIRResourceType.ValueSet values from a passed string value.
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

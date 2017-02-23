/**
 * (C) Copyright IBM Corp. 2017,2018,2019
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.ibm.watsonhealth.fhir.persistence.jdbc.impl;

import static com.ibm.watsonhealth.fhir.config.FHIRConfiguration.PROPERTY_UPDATE_CREATE_ENABLED;
import static com.ibm.watsonhealth.fhir.model.util.FHIRUtil.id;
import static com.ibm.watsonhealth.fhir.model.util.FHIRUtil.instant;

import java.io.ByteArrayOutputStream;
import java.sql.Timestamp;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.naming.InitialContext;
import javax.transaction.Status;
import javax.transaction.UserTransaction;
import javax.xml.bind.JAXBException;
import javax.xml.xpath.XPathExpressionException;

import com.ibm.watsonhealth.fhir.config.FHIRConfiguration;
import com.ibm.watsonhealth.fhir.config.PropertyGroup;
import com.ibm.watsonhealth.fhir.core.FHIRUtilities;
import com.ibm.watsonhealth.fhir.model.Instant;
import com.ibm.watsonhealth.fhir.model.Meta;
import com.ibm.watsonhealth.fhir.model.ObjectFactory;
import com.ibm.watsonhealth.fhir.model.Resource;
import com.ibm.watsonhealth.fhir.model.SearchParameter;
import com.ibm.watsonhealth.fhir.model.util.FHIRUtil;
import com.ibm.watsonhealth.fhir.model.util.FHIRUtil.Format;
import com.ibm.watsonhealth.fhir.persistence.FHIRPersistence;
import com.ibm.watsonhealth.fhir.persistence.FHIRPersistenceTransaction;
import com.ibm.watsonhealth.fhir.persistence.context.FHIRPersistenceContext;
import com.ibm.watsonhealth.fhir.persistence.exception.FHIRPersistenceException;
import com.ibm.watsonhealth.fhir.persistence.exception.FHIRPersistenceNotSupportedException;
import com.ibm.watsonhealth.fhir.persistence.exception.FHIRPersistenceProcessorException;
import com.ibm.watsonhealth.fhir.persistence.exception.FHIRPersistenceResourceNotFoundException;
import com.ibm.watsonhealth.fhir.persistence.jdbc.dao.impl.ParameterDAO;
import com.ibm.watsonhealth.fhir.persistence.jdbc.dao.impl.ResourceDAO;
import com.ibm.watsonhealth.fhir.persistence.jdbc.dto.Parameter;
import com.ibm.watsonhealth.fhir.persistence.jdbc.exception.FHIRPersistenceDBConnectException;
import com.ibm.watsonhealth.fhir.persistence.jdbc.exception.FHIRPersistenceDataAccessException;
import com.ibm.watsonhealth.fhir.persistence.jdbc.util.JDBCParameterBuilder;
import com.ibm.watsonhealth.fhir.persistence.util.Processor;
import com.ibm.watsonhealth.fhir.search.util.SearchUtil;

/**
 * This class is the JDBC implementation of the FHIRPersistence interface, providing implementations for CRUD type APIs and search.
 * @author markd
 *
 */
public class FHIRPersistenceJDBCImpl implements FHIRPersistence, FHIRPersistenceTransaction {
	
	private static final String CLASSNAME = FHIRPersistenceJDBCImpl.class.getName();
	private static final Logger log = Logger.getLogger(CLASSNAME);
	
	private static final String TXN_JNDI_NAME = "java:comp/UserTransaction";
	
	private ResourceDAO resourceDao;
	private ParameterDAO paramaterDao;
	private UserTransaction userTransaction = null;
	private Boolean updateCreateEnabled = null;
	private ObjectFactory objectFactory = new ObjectFactory();

	
	/**
	 * Constructor for use when running as web application in WLP. 
	 * @throws Exception 
	 */
	public FHIRPersistenceJDBCImpl() throws Exception {
		super();
		final String METHODNAME = "FHIRPersistenceJDBCImpl()";
		log.entering(CLASSNAME, METHODNAME);
		
		this.resourceDao = new ResourceDAO();
		this.paramaterDao = new ParameterDAO();
		PropertyGroup fhirConfig = FHIRConfiguration.loadConfiguration();
        this.updateCreateEnabled = fhirConfig.getBooleanProperty(PROPERTY_UPDATE_CREATE_ENABLED, Boolean.TRUE);
		this.userTransaction = retrieveUserTransaction(TXN_JNDI_NAME);
				
		log.exiting(CLASSNAME, METHODNAME);
		
	}
	
	/**
	 * Constructor for use when running standalone, outside of any web container.
	 * @throws Exception 
	 */
	public FHIRPersistenceJDBCImpl(Properties configProps) throws Exception {
		super();
		final String METHODNAME = "FHIRPersistenceJDBCImpl(Properties)";
		log.entering(CLASSNAME, METHODNAME);
		
		this.resourceDao = new ResourceDAO(configProps);
		this.paramaterDao = new ParameterDAO(configProps);
		this.updateCreateEnabled = Boolean.parseBoolean(configProps.getProperty("updateCreateEnabled"));
						
		log.exiting(CLASSNAME, METHODNAME);
		
	}

	/* (non-Javadoc)
	 * @see com.ibm.watsonhealth.fhir.persistence.FHIRPersistenceTransaction#isActive()
	 */
	@Override
	public boolean isActive() throws FHIRPersistenceException {
		
		boolean isActive = false;
		try {
			if (userTransaction != null) {
                isActive = (userTransaction.getStatus() == Status.STATUS_ACTIVE);
            }
        } 
		catch (Throwable e) {
            String msg = "An unexpected error occurred while examining transactional status.";
            log.log(Level.SEVERE, msg, e);
            throw new FHIRPersistenceException(msg);
        }
        return isActive;
	}

	/* (non-Javadoc)
	 * @see com.ibm.watsonhealth.fhir.persistence.FHIRPersistenceTransaction#begin()
	 */
	@Override
	public void begin() throws FHIRPersistenceException {
		final String METHODNAME = "begin";
		log.entering(CLASSNAME, METHODNAME);
		
		try {
			if (userTransaction != null) {
				userTransaction.begin();
			}
		}
        catch (Throwable e) {
            String msg = "An unexpected error occurred while starting a transaction.";
            log.log(Level.SEVERE, msg, e);
            throw new FHIRPersistenceException(msg);
        }
		finally {
			log.exiting(CLASSNAME, METHODNAME);
		}
	}

	/* (non-Javadoc)
	 * @see com.ibm.watsonhealth.fhir.persistence.FHIRPersistenceTransaction#commit()
	 */
	@Override
	public void commit() throws FHIRPersistenceException {
		final String METHODNAME = "commit";
		log.entering(CLASSNAME, METHODNAME);
		
        try {
            if (userTransaction != null) {
                userTransaction.commit();
            } 
        } 
        catch (Throwable e) {
            String msg = "An unexpected error occurred while committing a transaction.";
            log.log(Level.SEVERE, msg, e);
            throw new FHIRPersistenceException(msg);
        }
        finally {
        	log.exiting(CLASSNAME, METHODNAME);
        }

	}

	/* (non-Javadoc)
	 * @see com.ibm.watsonhealth.fhir.persistence.FHIRPersistenceTransaction#rollback()
	 */
	@Override
	public void rollback() throws FHIRPersistenceException {
		final String METHODNAME = "rollback";
		log.entering(CLASSNAME, METHODNAME);
		
        try {
        	if (userTransaction != null) {
                userTransaction.rollback();
            } 
        } 
        catch (Throwable e) {
            String msg = "An unexpected error occurred while rolling back a transaction.";
            log.log(Level.SEVERE, msg, e);
            throw new FHIRPersistenceException(msg);
        }
	}

	/* (non-Javadoc)
	 * @see com.ibm.watsonhealth.fhir.persistence.FHIRPersistence#create(com.ibm.watsonhealth.fhir.persistence.context.FHIRPersistenceContext, com.ibm.watsonhealth.fhir.model.Resource)
	 */
	@Override
	public void create(FHIRPersistenceContext context, Resource resource) throws FHIRPersistenceException  {
		final String METHODNAME = "create";
		log.entering(CLASSNAME, METHODNAME);
		
		boolean txnStarted = false;
		ByteArrayOutputStream stream = new ByteArrayOutputStream();
		
		try {
	        FHIRUtil.write(resource, Format.XML, stream, false);
	
	        // Start a new txn.
	        if (!isActive()) {
	            this.begin();
	            txnStarted = true;
	        }
	
	        // Default version is 1 for a brand new FHIR Resource.
	        int newVersionNumber = 1;
	        log.fine("Creating new FHIR Resource of type '" + resource.getClass().getSimpleName() + "'");
	        // Create the new Resource DTO instance.
	        com.ibm.watsonhealth.fhir.persistence.jdbc.dto.Resource resourceDTO = new com.ibm.watsonhealth.fhir.persistence.jdbc.dto.Resource();
	        resourceDTO.setLogicalId(UUID.randomUUID().toString());
	        resourceDTO.setVersionId(newVersionNumber);
	        resourceDTO.setData(stream.toByteArray());
	        Instant lastUpdated = instant(System.currentTimeMillis());
	        Timestamp timestamp = FHIRUtilities.convertToTimestamp(lastUpdated.getValue());
	        resourceDTO.setLastUpdated(timestamp);
	        resourceDTO.setResourceType(resource.getClass().getSimpleName());
	        
	        // Persist the Resource DTO.
	        this.resourceDao.insert(resourceDTO);
	        log.fine("Persisted FHIR Resource '" + resourceDTO.getResourceType() + "/" + resourceDTO.getLogicalId() + "' id=" + resourceDTO.getId()
	        + ", version=" + resourceDTO.getVersionId());
	        
	        // Set the resource id and meta fields.
	        resource.setId(id(resourceDTO.getLogicalId()));
	        Meta meta = resource.getMeta();
	        if (meta == null) {
	            meta = objectFactory.createMeta();
	        }
	        meta.setVersionId(id(Integer.toString(newVersionNumber)));
	        meta.setLastUpdated(lastUpdated);
	        resource.setMeta(meta);
	        
	        // Store search parameters
	        this.storeSearchParameters(resource, resourceDTO);
	        
	        // Time to commit the changes.
	        if (txnStarted) {
	            this.commit();
	            txnStarted = false;
	        }
		}
		catch(FHIRPersistenceException e) {
			throw e;
		}
		catch(Throwable e) {
			String msg = "Unexpected error while performing a create operation.";
            log.log(Level.SEVERE, msg, e);
            throw new FHIRPersistenceException(msg, e);
		}
		finally {
			log.exiting(CLASSNAME, METHODNAME);
		}
	}

	/* (non-Javadoc)
	 * @see com.ibm.watsonhealth.fhir.persistence.FHIRPersistence#read(com.ibm.watsonhealth.fhir.persistence.context.FHIRPersistenceContext, java.lang.Class, java.lang.String)
	 */
	@Override
	public Resource read(FHIRPersistenceContext context, Class<? extends Resource> resourceType, String logicalId)
			throws FHIRPersistenceException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.ibm.watsonhealth.fhir.persistence.FHIRPersistence#vread(com.ibm.watsonhealth.fhir.persistence.context.FHIRPersistenceContext, java.lang.Class, java.lang.String, java.lang.String)
	 */
	@Override
	public Resource vread(FHIRPersistenceContext context, Class<? extends Resource> resourceType, String logicalId,
			String versionId) throws FHIRPersistenceException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.ibm.watsonhealth.fhir.persistence.FHIRPersistence#update(com.ibm.watsonhealth.fhir.persistence.context.FHIRPersistenceContext, java.lang.String, com.ibm.watsonhealth.fhir.model.Resource)
	 */
	@Override
	public void update(FHIRPersistenceContext context, String logicalId, Resource resource) throws FHIRPersistenceException {
		final String METHODNAME = "update";
		log.entering(CLASSNAME, METHODNAME);
		
		Class<? extends Resource> resourceType = resource.getClass();
		com.ibm.watsonhealth.fhir.persistence.jdbc.dto.Resource existingResourceDTO;
		boolean txnStarted = false;
		int newVersionNumber = 1;
		ByteArrayOutputStream stream = new ByteArrayOutputStream();
		
		try {
			// Get the current version of the Resource.
			existingResourceDTO = this.resourceDao.read(logicalId, resourceType.getSimpleName());
	        
	        // If this FHIR Resource doesn't exist and updateCreateEnabled is turned off, throw an exception
	        if (existingResourceDTO == null && !updateCreateEnabled) {
	            String msg = "Resource '" + resourceType.getSimpleName() + "/" + logicalId + " not found.";
	            log.log(Level.SEVERE, msg);
	            throw new FHIRPersistenceResourceNotFoundException(msg);
	        }
	        
	        stream = new ByteArrayOutputStream();
	        FHIRUtil.write(resource, Format.XML, stream, false);
	
	        // Start a new txn.
	        if (!isActive()) {
	            begin();
	            txnStarted = true;
	        }
	        
	        // If the FHIR Resource already exists, then we'll simply bump up the version #, use its logical id,
	        // and remove its Parameter entries.
	        if (existingResourceDTO != null) {
	            newVersionNumber = existingResourceDTO.getVersionId() + 1;
	            log.fine("Updating FHIR Resource '" + existingResourceDTO.getResourceType() + "/" + existingResourceDTO.getLogicalId() + "', version="
	                        + existingResourceDTO.getVersionId());
	             
	            // Retrieve the Parameters associated with the current version of the Resource and remove them.
	            this.paramaterDao.deleteByResource(existingResourceDTO.getId());
	        } 
	        // Create the new Resource DTO instance.
	        com.ibm.watsonhealth.fhir.persistence.jdbc.dto.Resource resourceDTO = new com.ibm.watsonhealth.fhir.persistence.jdbc.dto.Resource();
	        resourceDTO.setLogicalId(logicalId);
	        resourceDTO.setVersionId(newVersionNumber);
	        resourceDTO.setData(stream.toByteArray());
	        Instant lastUpdated = instant(System.currentTimeMillis());
	        Timestamp timestamp = FHIRUtilities.convertToTimestamp(lastUpdated.getValue());
	        resourceDTO.setLastUpdated(timestamp);
	        resourceDTO.setResourceType(resource.getClass().getSimpleName());
	        
	        // Persist the Resource DTO.
	        this.resourceDao.insert(resourceDTO);
	        log.fine("Persisted FHIR Resource '" + resourceDTO.getResourceType() + "/" + resourceDTO.getLogicalId() + "' id=" + resourceDTO.getId()
	        + ", version=" + resourceDTO.getVersionId());
	        
	        // Set the resource id and meta fields.
	        resource.setId(id(logicalId));
	        Meta meta = resource.getMeta();
	        if (meta == null) {
	            meta = objectFactory.createMeta();
	        }
	        meta.setVersionId(id(Integer.toString(newVersionNumber)));
	        meta.setLastUpdated(lastUpdated);
	        resource.setMeta(meta);
	          
	        // Store search parameters
	        this.storeSearchParameters(resource, resourceDTO);
	        
	        // Time to commit the changes.
	        if (txnStarted) {
	            commit();
	            txnStarted = false;
	        }
		}
		catch(FHIRPersistenceException e) {
			throw e;
		}
		catch(Throwable e) {
			String msg = "Unexpected error while performing an update operation.";
            log.log(Level.SEVERE, msg, e);
            throw new FHIRPersistenceException(msg, e);
		}
		finally {
			log.exiting(CLASSNAME, METHODNAME);
		}
    }

	/* (non-Javadoc)
	 * @see com.ibm.watsonhealth.fhir.persistence.FHIRPersistence#delete(com.ibm.watsonhealth.fhir.persistence.context.FHIRPersistenceContext, java.lang.String)
	 */
	@Override
	public void delete(FHIRPersistenceContext context, String logicalId) throws FHIRPersistenceException {
		throw new FHIRPersistenceNotSupportedException("delete is not yet implemented");

	}

	/* (non-Javadoc)
	 * @see com.ibm.watsonhealth.fhir.persistence.FHIRPersistence#history(com.ibm.watsonhealth.fhir.persistence.context.FHIRPersistenceContext, java.lang.Class, java.lang.String)
	 */
	@Override
	public List<Resource> history(FHIRPersistenceContext context, Class<? extends Resource> resourceType,
			String logicalId) throws FHIRPersistenceException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.ibm.watsonhealth.fhir.persistence.FHIRPersistence#search(com.ibm.watsonhealth.fhir.persistence.context.FHIRPersistenceContext, java.lang.Class)
	 */
	@Override
	public List<Resource> search(FHIRPersistenceContext context, Class<? extends Resource> resourceType)
			throws FHIRPersistenceException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.ibm.watsonhealth.fhir.persistence.FHIRPersistence#isTransactional()
	 */
	@Override
	public boolean isTransactional() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.ibm.watsonhealth.fhir.persistence.FHIRPersistence#getTransaction()
	 */
	@Override
	public FHIRPersistenceTransaction getTransaction() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
     * Retrieves (via a JNDI lookup) a reference to the UserTransaction. If the JNDI lookup fails, we'll assume that
     * we're not running inside the container.
     */
    private UserTransaction retrieveUserTransaction(String jndiName) {
        UserTransaction txn = null;
        try {
            InitialContext ctx = new InitialContext();
            txn = (UserTransaction) ctx.lookup(jndiName);
        } catch (Throwable t) {
            // ignore any exceptions here.
        }

        return txn;
    }
    
    private void storeSearchParameters(Resource fhirResource, com.ibm.watsonhealth.fhir.persistence.jdbc.dto.Resource resourceDTO) 
    			 throws JAXBException, XPathExpressionException, FHIRPersistenceProcessorException, 
    			        FHIRPersistenceDataAccessException, FHIRPersistenceDBConnectException {
    	final String METHODNAME = "storeSearchParameters";
    	log.entering(CLASSNAME, METHODNAME);
    	
    	Map<SearchParameter, List<Object>> map;
    	String name, type, xpath;
    	Processor<List<Parameter>> processor = new JDBCParameterBuilder();
    	
    	try {
	        map = SearchUtil.extractParameterValues(fhirResource);
	        
	        for (SearchParameter parameter : map.keySet()) {
	            name = parameter.getName().getValue();
	            type = parameter.getType().getValue();
	            xpath = parameter.getXpath().getValue();
	            
	            log.fine("Processing SearchParameter name: " + name + ", type: " + type + ", xpath: " + xpath);
	            
	            List<Object> values = map.get(parameter);
	            for (Object value : values) {
	                List<Parameter> parameters = processor.process(parameter, value);
	                for (Parameter p : parameters) {
	                    p.setResourceId(resourceDTO.getId());
	                    p.setResourceType(fhirResource.getClass().getSimpleName());
	                    this.paramaterDao.insert(p);
	                    log.fine("Added Parameter '" + p.getName() + "' to Resource.");
	                }
	            }
	        }
    	}
    	finally {
    		log.exiting(CLASSNAME, METHODNAME);
    	}
    }

}
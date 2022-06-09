// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Map;

/** Azure File datastore configuration. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "datastoreType")
@JsonTypeName("AzureFile")
@Fluent
public final class AzureFileDatastore extends DatastoreDetails {
    /*
     * [Required] Storage account name.
     */
    @JsonProperty(value = "accountName", required = true)
    private String accountName;

    /*
     * Azure cloud endpoint for the storage account.
     */
    @JsonProperty(value = "endpoint")
    private String endpoint;

    /*
     * [Required] The name of the Azure file share that the datastore points
     * to.
     */
    @JsonProperty(value = "fileShareName", required = true)
    private String fileShareName;

    /*
     * Protocol used to communicate with the storage account.
     */
    @JsonProperty(value = "protocol")
    private String protocol;

    /*
     * Indicates which identity to use to authenticate service data access to
     * customer's storage.
     */
    @JsonProperty(value = "serviceDataAccessAuthIdentity")
    private ServiceDataAccessAuthIdentity serviceDataAccessAuthIdentity;

    /**
     * Get the accountName property: [Required] Storage account name.
     *
     * @return the accountName value.
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * Set the accountName property: [Required] Storage account name.
     *
     * @param accountName the accountName value to set.
     * @return the AzureFileDatastore object itself.
     */
    public AzureFileDatastore withAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * Get the endpoint property: Azure cloud endpoint for the storage account.
     *
     * @return the endpoint value.
     */
    public String endpoint() {
        return this.endpoint;
    }

    /**
     * Set the endpoint property: Azure cloud endpoint for the storage account.
     *
     * @param endpoint the endpoint value to set.
     * @return the AzureFileDatastore object itself.
     */
    public AzureFileDatastore withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * Get the fileShareName property: [Required] The name of the Azure file share that the datastore points to.
     *
     * @return the fileShareName value.
     */
    public String fileShareName() {
        return this.fileShareName;
    }

    /**
     * Set the fileShareName property: [Required] The name of the Azure file share that the datastore points to.
     *
     * @param fileShareName the fileShareName value to set.
     * @return the AzureFileDatastore object itself.
     */
    public AzureFileDatastore withFileShareName(String fileShareName) {
        this.fileShareName = fileShareName;
        return this;
    }

    /**
     * Get the protocol property: Protocol used to communicate with the storage account.
     *
     * @return the protocol value.
     */
    public String protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol property: Protocol used to communicate with the storage account.
     *
     * @param protocol the protocol value to set.
     * @return the AzureFileDatastore object itself.
     */
    public AzureFileDatastore withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the serviceDataAccessAuthIdentity property: Indicates which identity to use to authenticate service data
     * access to customer's storage.
     *
     * @return the serviceDataAccessAuthIdentity value.
     */
    public ServiceDataAccessAuthIdentity serviceDataAccessAuthIdentity() {
        return this.serviceDataAccessAuthIdentity;
    }

    /**
     * Set the serviceDataAccessAuthIdentity property: Indicates which identity to use to authenticate service data
     * access to customer's storage.
     *
     * @param serviceDataAccessAuthIdentity the serviceDataAccessAuthIdentity value to set.
     * @return the AzureFileDatastore object itself.
     */
    public AzureFileDatastore withServiceDataAccessAuthIdentity(
        ServiceDataAccessAuthIdentity serviceDataAccessAuthIdentity) {
        this.serviceDataAccessAuthIdentity = serviceDataAccessAuthIdentity;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureFileDatastore withCredentials(DatastoreCredentials credentials) {
        super.withCredentials(credentials);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureFileDatastore withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureFileDatastore withProperties(Map<String, String> properties) {
        super.withProperties(properties);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureFileDatastore withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (accountName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property accountName in model AzureFileDatastore"));
        }
        if (fileShareName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property fileShareName in model AzureFileDatastore"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AzureFileDatastore.class);
}
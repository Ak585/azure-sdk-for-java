// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confidentialledger.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.confidentialledger.models.LedgerProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Confidential Ledger. Contains the properties of Confidential Ledger Resource. */
@Fluent
public final class ConfidentialLedgerInner extends ProxyResource {
    /*
     * LedgerProperties Properties of Confidential Ledger Resource.
     */
    @JsonProperty(value = "properties")
    private LedgerProperties properties;

    /*
     * Metadata pertaining to creation and last modification of the resource
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * The Azure location where the Confidential Ledger is running.
     */
    @JsonProperty(value = "location")
    private String location;

    /*
     * Additional tags for Confidential Ledger
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /**
     * Get the properties property: LedgerProperties Properties of Confidential Ledger Resource.
     *
     * @return the properties value.
     */
    public LedgerProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: LedgerProperties Properties of Confidential Ledger Resource.
     *
     * @param properties the properties value to set.
     * @return the ConfidentialLedgerInner object itself.
     */
    public ConfidentialLedgerInner withProperties(LedgerProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the location property: The Azure location where the Confidential Ledger is running.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The Azure location where the Confidential Ledger is running.
     *
     * @param location the location value to set.
     * @return the ConfidentialLedgerInner object itself.
     */
    public ConfidentialLedgerInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the tags property: Additional tags for Confidential Ledger.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Additional tags for Confidential Ledger.
     *
     * @param tags the tags value to set.
     * @return the ConfidentialLedgerInner object itself.
     */
    public ConfidentialLedgerInner withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
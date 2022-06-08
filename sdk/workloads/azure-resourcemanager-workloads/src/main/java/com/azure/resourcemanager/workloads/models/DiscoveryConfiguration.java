// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Discovery Details. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "configurationType")
@JsonTypeName("Discovery")
@Fluent
public final class DiscoveryConfiguration extends SapConfiguration {
    /*
     * The virtual machine ID of the Central Server.
     */
    @JsonProperty(value = "centralServerVmId")
    private String centralServerVmId;

    /*
     * The geo-location where the SAP system exists.
     */
    @JsonProperty(value = "appLocation", access = JsonProperty.Access.WRITE_ONLY)
    private String appLocation;

    /**
     * Get the centralServerVmId property: The virtual machine ID of the Central Server.
     *
     * @return the centralServerVmId value.
     */
    public String centralServerVmId() {
        return this.centralServerVmId;
    }

    /**
     * Set the centralServerVmId property: The virtual machine ID of the Central Server.
     *
     * @param centralServerVmId the centralServerVmId value to set.
     * @return the DiscoveryConfiguration object itself.
     */
    public DiscoveryConfiguration withCentralServerVmId(String centralServerVmId) {
        this.centralServerVmId = centralServerVmId;
        return this;
    }

    /**
     * Get the appLocation property: The geo-location where the SAP system exists.
     *
     * @return the appLocation value.
     */
    public String appLocation() {
        return this.appLocation;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
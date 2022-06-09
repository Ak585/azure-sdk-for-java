// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Deploy SAP Infrastructure Details. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "deploymentType",
    defaultImpl = InfrastructureConfiguration.class)
@JsonTypeName("InfrastructureConfiguration")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "SingleServer", value = SingleServerConfiguration.class),
    @JsonSubTypes.Type(name = "ThreeTier", value = ThreeTierConfiguration.class)
})
@Fluent
public class InfrastructureConfiguration {
    /*
     * The application resource group where SAP system resources will be
     * deployed.
     */
    @JsonProperty(value = "appResourceGroup", required = true)
    private String appResourceGroup;

    /**
     * Get the appResourceGroup property: The application resource group where SAP system resources will be deployed.
     *
     * @return the appResourceGroup value.
     */
    public String appResourceGroup() {
        return this.appResourceGroup;
    }

    /**
     * Set the appResourceGroup property: The application resource group where SAP system resources will be deployed.
     *
     * @param appResourceGroup the appResourceGroup value to set.
     * @return the InfrastructureConfiguration object itself.
     */
    public InfrastructureConfiguration withAppResourceGroup(String appResourceGroup) {
        this.appResourceGroup = appResourceGroup;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (appResourceGroup() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property appResourceGroup in model InfrastructureConfiguration"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(InfrastructureConfiguration.class);
}
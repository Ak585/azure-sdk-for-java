// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The MicrosoftTeamsUserIdentifierModel model. */
@Fluent
public final class MicrosoftTeamsUserIdentifierModel {
    /*
     * The userId property.
     */
    @JsonProperty(value = "userId", required = true)
    private String userId;

    /*
     * The isAnonymous property.
     */
    @JsonProperty(value = "isAnonymous")
    private Boolean isAnonymous;

    /*
     * The cloud property.
     */
    @JsonProperty(value = "cloud")
    private CommunicationCloudEnvironmentModel cloud;

    /** Creates an instance of MicrosoftTeamsUserIdentifierModel class. */
    public MicrosoftTeamsUserIdentifierModel() {}

    /**
     * Get the userId property: The userId property.
     *
     * @return the userId value.
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * Set the userId property: The userId property.
     *
     * @param userId the userId value to set.
     * @return the MicrosoftTeamsUserIdentifierModel object itself.
     */
    public MicrosoftTeamsUserIdentifierModel setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Get the isAnonymous property: The isAnonymous property.
     *
     * @return the isAnonymous value.
     */
    public Boolean isAnonymous() {
        return this.isAnonymous;
    }

    /**
     * Set the isAnonymous property: The isAnonymous property.
     *
     * @param isAnonymous the isAnonymous value to set.
     * @return the MicrosoftTeamsUserIdentifierModel object itself.
     */
    public MicrosoftTeamsUserIdentifierModel setIsAnonymous(Boolean isAnonymous) {
        this.isAnonymous = isAnonymous;
        return this;
    }

    /**
     * Get the cloud property: The cloud property.
     *
     * @return the cloud value.
     */
    public CommunicationCloudEnvironmentModel getCloud() {
        return this.cloud;
    }

    /**
     * Set the cloud property: The cloud property.
     *
     * @param cloud the cloud value to set.
     * @return the MicrosoftTeamsUserIdentifierModel object itself.
     */
    public MicrosoftTeamsUserIdentifierModel setCloud(CommunicationCloudEnvironmentModel cloud) {
        this.cloud = cloud;
        return this;
    }
}

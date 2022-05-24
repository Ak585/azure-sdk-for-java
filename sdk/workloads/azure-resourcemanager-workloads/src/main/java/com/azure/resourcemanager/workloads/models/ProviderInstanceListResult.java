// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.workloads.fluent.models.ProviderInstanceInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The response from the List provider instances operation. */
@Fluent
public final class ProviderInstanceListResult {
    /*
     * The list of provider instances.
     */
    @JsonProperty(value = "value")
    private List<ProviderInstanceInner> value;

    /*
     * The URL to get the next set of provider instances.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The list of provider instances.
     *
     * @return the value value.
     */
    public List<ProviderInstanceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of provider instances.
     *
     * @param value the value value to set.
     * @return the ProviderInstanceListResult object itself.
     */
    public ProviderInstanceListResult withValue(List<ProviderInstanceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of provider instances.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to get the next set of provider instances.
     *
     * @param nextLink the nextLink value to set.
     * @return the ProviderInstanceListResult object itself.
     */
    public ProviderInstanceListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** An object representing the task definition for a PII Entities Recognition task. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("PiiEntityRecognition")
@Fluent
public final class PiiLROTask extends AnalyzeTextLROTask {
    /*
     * Supported parameters for a PII Entities Recognition task.
     */
    @JsonProperty(value = "parameters")
    private PiiTaskParameters parameters;

    /**
     * Get the parameters property: Supported parameters for a PII Entities Recognition task.
     *
     * @return the parameters value.
     */
    public PiiTaskParameters getParameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Supported parameters for a PII Entities Recognition task.
     *
     * @param parameters the parameters value to set.
     * @return the PiiLROTask object itself.
     */
    public PiiLROTask setParameters(PiiTaskParameters parameters) {
        this.parameters = parameters;
        return this;
    }
}
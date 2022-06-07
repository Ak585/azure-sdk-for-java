// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.Context;

/** Samples for EnvironmentVersions Delete. */
public final class EnvironmentVersionsDeleteSamples {
    /*
     * x-ms-original-file: specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/preview/2022-02-01-preview/examples/EnvironmentVersion/delete.json
     */
    /**
     * Sample code: Delete Environment Version.
     *
     * @param manager Entry point to MachineLearningManager.
     */
    public static void deleteEnvironmentVersion(
        com.azure.resourcemanager.machinelearning.MachineLearningManager manager) {
        manager
            .environmentVersions()
            .deleteWithResponse("test-rg", "my-aml-workspace", "string", "string", Context.NONE);
    }
}
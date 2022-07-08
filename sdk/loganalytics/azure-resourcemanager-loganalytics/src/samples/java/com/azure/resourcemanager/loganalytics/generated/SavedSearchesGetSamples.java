// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.generated;

import com.azure.core.util.Context;

/** Samples for SavedSearches Get. */
public final class SavedSearchesGetSamples {
    /*
     * x-ms-original-file: specification/operationalinsights/resource-manager/Microsoft.OperationalInsights/stable/2020-08-01/examples/WorkspacesSavedSearchesGet.json
     */
    /**
     * Sample code: SavedSearchesGet.
     *
     * @param manager Entry point to LogAnalyticsManager.
     */
    public static void savedSearchesGet(com.azure.resourcemanager.loganalytics.LogAnalyticsManager manager) {
        manager
            .savedSearches()
            .getWithResponse("TestRG", "TestWS", "00000000-0000-0000-0000-00000000000", Context.NONE);
    }
}
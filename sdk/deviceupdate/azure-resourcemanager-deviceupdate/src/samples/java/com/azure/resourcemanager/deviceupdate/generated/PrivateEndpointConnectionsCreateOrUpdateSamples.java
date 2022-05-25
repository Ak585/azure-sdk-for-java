// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceupdate.generated;

import com.azure.resourcemanager.deviceupdate.models.PrivateEndpointServiceConnectionStatus;
import com.azure.resourcemanager.deviceupdate.models.PrivateLinkServiceConnectionState;

/** Samples for PrivateEndpointConnections CreateOrUpdate. */
public final class PrivateEndpointConnectionsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/deviceupdate/resource-manager/Microsoft.DeviceUpdate/preview/2022-04-01-preview/examples/PrivateEndpointConnections/PrivateEndpointConnection_CreateOrUpdate.json
     */
    /**
     * Sample code: PrivateEndpointConnectionCreateOrUpdate.
     *
     * @param manager Entry point to DeviceUpdateManager.
     */
    public static void privateEndpointConnectionCreateOrUpdate(
        com.azure.resourcemanager.deviceupdate.DeviceUpdateManager manager) {
        manager
            .privateEndpointConnections()
            .define("peexample01")
            .withExistingAccount("test-rg", "contoso")
            .withPrivateLinkServiceConnectionState(
                new PrivateLinkServiceConnectionState()
                    .withStatus(PrivateEndpointServiceConnectionStatus.APPROVED)
                    .withDescription("Auto-Approved"))
            .create();
    }
}
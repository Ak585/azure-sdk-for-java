// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceupdate.generated;

import com.azure.core.util.Context;

/** Samples for PrivateEndpointConnections Delete. */
public final class PrivateEndpointConnectionsDeleteSamples {
    /*
     * x-ms-original-file: specification/deviceupdate/resource-manager/Microsoft.DeviceUpdate/preview/2022-04-01-preview/examples/PrivateEndpointConnections/PrivateEndpointConnection_Delete.json
     */
    /**
     * Sample code: PrivateEndpointConnectionDelete.
     *
     * @param manager Entry point to DeviceUpdateManager.
     */
    public static void privateEndpointConnectionDelete(
        com.azure.resourcemanager.deviceupdate.DeviceUpdateManager manager) {
        manager.privateEndpointConnections().delete("test-rg", "contoso", "peexample01", Context.NONE);
    }
}
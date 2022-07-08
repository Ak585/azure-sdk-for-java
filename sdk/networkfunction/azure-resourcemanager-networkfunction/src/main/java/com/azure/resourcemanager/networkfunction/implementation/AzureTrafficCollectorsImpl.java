// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkfunction.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.networkfunction.fluent.AzureTrafficCollectorsClient;
import com.azure.resourcemanager.networkfunction.fluent.models.AzureTrafficCollectorInner;
import com.azure.resourcemanager.networkfunction.models.AzureTrafficCollector;
import com.azure.resourcemanager.networkfunction.models.AzureTrafficCollectors;

public final class AzureTrafficCollectorsImpl implements AzureTrafficCollectors {
    private static final ClientLogger LOGGER = new ClientLogger(AzureTrafficCollectorsImpl.class);

    private final AzureTrafficCollectorsClient innerClient;

    private final com.azure.resourcemanager.networkfunction.AzureTrafficCollectorManager serviceManager;

    public AzureTrafficCollectorsImpl(
        AzureTrafficCollectorsClient innerClient,
        com.azure.resourcemanager.networkfunction.AzureTrafficCollectorManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public AzureTrafficCollector getByResourceGroup(String resourceGroupName, String azureTrafficCollectorName) {
        AzureTrafficCollectorInner inner =
            this.serviceClient().getByResourceGroup(resourceGroupName, azureTrafficCollectorName);
        if (inner != null) {
            return new AzureTrafficCollectorImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AzureTrafficCollector> getByResourceGroupWithResponse(
        String resourceGroupName, String azureTrafficCollectorName, Context context) {
        Response<AzureTrafficCollectorInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, azureTrafficCollectorName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AzureTrafficCollectorImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String azureTrafficCollectorName) {
        this.serviceClient().delete(resourceGroupName, azureTrafficCollectorName);
    }

    public void delete(String resourceGroupName, String azureTrafficCollectorName, Context context) {
        this.serviceClient().delete(resourceGroupName, azureTrafficCollectorName, context);
    }

    public AzureTrafficCollector getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String azureTrafficCollectorName = Utils.getValueFromIdByName(id, "azureTrafficCollectors");
        if (azureTrafficCollectorName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'azureTrafficCollectors'.",
                                id)));
        }
        return this
            .getByResourceGroupWithResponse(resourceGroupName, azureTrafficCollectorName, Context.NONE)
            .getValue();
    }

    public Response<AzureTrafficCollector> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String azureTrafficCollectorName = Utils.getValueFromIdByName(id, "azureTrafficCollectors");
        if (azureTrafficCollectorName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'azureTrafficCollectors'.",
                                id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, azureTrafficCollectorName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String azureTrafficCollectorName = Utils.getValueFromIdByName(id, "azureTrafficCollectors");
        if (azureTrafficCollectorName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'azureTrafficCollectors'.",
                                id)));
        }
        this.delete(resourceGroupName, azureTrafficCollectorName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String azureTrafficCollectorName = Utils.getValueFromIdByName(id, "azureTrafficCollectors");
        if (azureTrafficCollectorName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'azureTrafficCollectors'.",
                                id)));
        }
        this.delete(resourceGroupName, azureTrafficCollectorName, context);
    }

    private AzureTrafficCollectorsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.networkfunction.AzureTrafficCollectorManager manager() {
        return this.serviceManager;
    }

    public AzureTrafficCollectorImpl define(String name) {
        return new AzureTrafficCollectorImpl(name, this.manager());
    }
}
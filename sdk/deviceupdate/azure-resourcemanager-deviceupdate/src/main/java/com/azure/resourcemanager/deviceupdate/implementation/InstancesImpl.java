// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceupdate.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.deviceupdate.fluent.InstancesClient;
import com.azure.resourcemanager.deviceupdate.fluent.models.InstanceInner;
import com.azure.resourcemanager.deviceupdate.models.Instance;
import com.azure.resourcemanager.deviceupdate.models.Instances;

public final class InstancesImpl implements Instances {
    private static final ClientLogger LOGGER = new ClientLogger(InstancesImpl.class);

    private final InstancesClient innerClient;

    private final com.azure.resourcemanager.deviceupdate.DeviceUpdateManager serviceManager;

    public InstancesImpl(
        InstancesClient innerClient, com.azure.resourcemanager.deviceupdate.DeviceUpdateManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Instance> listByAccount(String resourceGroupName, String accountName) {
        PagedIterable<InstanceInner> inner = this.serviceClient().listByAccount(resourceGroupName, accountName);
        return Utils.mapPage(inner, inner1 -> new InstanceImpl(inner1, this.manager()));
    }

    public PagedIterable<Instance> listByAccount(String resourceGroupName, String accountName, Context context) {
        PagedIterable<InstanceInner> inner =
            this.serviceClient().listByAccount(resourceGroupName, accountName, context);
        return Utils.mapPage(inner, inner1 -> new InstanceImpl(inner1, this.manager()));
    }

    public Instance get(String resourceGroupName, String accountName, String instanceName) {
        InstanceInner inner = this.serviceClient().get(resourceGroupName, accountName, instanceName);
        if (inner != null) {
            return new InstanceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Instance> getWithResponse(
        String resourceGroupName, String accountName, String instanceName, Context context) {
        Response<InstanceInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, accountName, instanceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new InstanceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void head(String resourceGroupName, String accountName, String instanceName) {
        this.serviceClient().head(resourceGroupName, accountName, instanceName);
    }

    public Response<Void> headWithResponse(
        String resourceGroupName, String accountName, String instanceName, Context context) {
        return this.serviceClient().headWithResponse(resourceGroupName, accountName, instanceName, context);
    }

    public void delete(String resourceGroupName, String accountName, String instanceName) {
        this.serviceClient().delete(resourceGroupName, accountName, instanceName);
    }

    public void delete(String resourceGroupName, String accountName, String instanceName, Context context) {
        this.serviceClient().delete(resourceGroupName, accountName, instanceName, context);
    }

    public Instance getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "accounts");
        if (accountName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'accounts'.", id)));
        }
        String instanceName = Utils.getValueFromIdByName(id, "instances");
        if (instanceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'instances'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, instanceName, Context.NONE).getValue();
    }

    public Response<Instance> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "accounts");
        if (accountName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'accounts'.", id)));
        }
        String instanceName = Utils.getValueFromIdByName(id, "instances");
        if (instanceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'instances'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, instanceName, context);
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
        String accountName = Utils.getValueFromIdByName(id, "accounts");
        if (accountName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'accounts'.", id)));
        }
        String instanceName = Utils.getValueFromIdByName(id, "instances");
        if (instanceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'instances'.", id)));
        }
        this.delete(resourceGroupName, accountName, instanceName, Context.NONE);
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
        String accountName = Utils.getValueFromIdByName(id, "accounts");
        if (accountName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'accounts'.", id)));
        }
        String instanceName = Utils.getValueFromIdByName(id, "instances");
        if (instanceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'instances'.", id)));
        }
        this.delete(resourceGroupName, accountName, instanceName, context);
    }

    private InstancesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.deviceupdate.DeviceUpdateManager manager() {
        return this.serviceManager;
    }

    public InstanceImpl define(String name) {
        return new InstanceImpl(name, this.manager());
    }
}
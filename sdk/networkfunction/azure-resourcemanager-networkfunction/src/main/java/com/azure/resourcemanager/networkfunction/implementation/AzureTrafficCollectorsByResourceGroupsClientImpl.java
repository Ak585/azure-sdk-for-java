// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkfunction.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.networkfunction.fluent.AzureTrafficCollectorsByResourceGroupsClient;
import com.azure.resourcemanager.networkfunction.fluent.models.AzureTrafficCollectorInner;
import com.azure.resourcemanager.networkfunction.models.AzureTrafficCollectorListResult;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * AzureTrafficCollectorsByResourceGroupsClient.
 */
public final class AzureTrafficCollectorsByResourceGroupsClientImpl
    implements AzureTrafficCollectorsByResourceGroupsClient {
    /** The proxy service used to perform REST calls. */
    private final AzureTrafficCollectorsByResourceGroupsService service;

    /** The service client containing this operation class. */
    private final AzureTrafficCollectorManagementClientImpl client;

    /**
     * Initializes an instance of AzureTrafficCollectorsByResourceGroupsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    AzureTrafficCollectorsByResourceGroupsClientImpl(AzureTrafficCollectorManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    AzureTrafficCollectorsByResourceGroupsService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * AzureTrafficCollectorManagementClientAzureTrafficCollectorsByResourceGroups to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "AzureTrafficCollecto")
    private interface AzureTrafficCollectorsByResourceGroupsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.NetworkFunction"
                + "/azureTrafficCollectors")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<AzureTrafficCollectorListResult>> listByResourceGroup(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<AzureTrafficCollectorListResult>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Return list of Azure Traffic Collectors in a Resource Group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the ListTrafficCollectors API service call along with {@link PagedResponse} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<AzureTrafficCollectorInner>> listByResourceGroupSinglePageAsync(
        String resourceGroupName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listByResourceGroup(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            this.client.getSubscriptionId(),
                            this.client.getApiVersion(),
                            accept,
                            context))
            .<PagedResponse<AzureTrafficCollectorInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Return list of Azure Traffic Collectors in a Resource Group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the ListTrafficCollectors API service call along with {@link PagedResponse} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<AzureTrafficCollectorInner>> listByResourceGroupSinglePageAsync(
        String resourceGroupName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByResourceGroup(
                this.client.getEndpoint(),
                resourceGroupName,
                this.client.getSubscriptionId(),
                this.client.getApiVersion(),
                accept,
                context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }

    /**
     * Return list of Azure Traffic Collectors in a Resource Group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the ListTrafficCollectors API service call as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<AzureTrafficCollectorInner> listByResourceGroupAsync(String resourceGroupName) {
        return new PagedFlux<>(
            () -> listByResourceGroupSinglePageAsync(resourceGroupName), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Return list of Azure Traffic Collectors in a Resource Group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the ListTrafficCollectors API service call as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<AzureTrafficCollectorInner> listByResourceGroupAsync(String resourceGroupName, Context context) {
        return new PagedFlux<>(
            () -> listByResourceGroupSinglePageAsync(resourceGroupName, context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Return list of Azure Traffic Collectors in a Resource Group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the ListTrafficCollectors API service call as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<AzureTrafficCollectorInner> listByResourceGroup(String resourceGroupName) {
        return new PagedIterable<>(listByResourceGroupAsync(resourceGroupName));
    }

    /**
     * Return list of Azure Traffic Collectors in a Resource Group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the ListTrafficCollectors API service call as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<AzureTrafficCollectorInner> listByResourceGroup(String resourceGroupName, Context context) {
        return new PagedIterable<>(listByResourceGroupAsync(resourceGroupName, context));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the ListTrafficCollectors API service call along with {@link PagedResponse} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<AzureTrafficCollectorInner>> listNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<AzureTrafficCollectorInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the ListTrafficCollectors API service call along with {@link PagedResponse} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<AzureTrafficCollectorInner>> listNextSinglePageAsync(String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }
}
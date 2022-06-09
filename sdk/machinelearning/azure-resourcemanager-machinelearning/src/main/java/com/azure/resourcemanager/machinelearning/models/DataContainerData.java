// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.machinelearning.fluent.models.DataContainerDataInner;

/** An immutable client-side representation of DataContainerData. */
public interface DataContainerData {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the properties property: [Required] Additional attributes of the entity.
     *
     * @return the properties value.
     */
    DataContainerDetails properties();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.machinelearning.fluent.models.DataContainerDataInner object.
     *
     * @return the inner object.
     */
    DataContainerDataInner innerModel();

    /** The entirety of the DataContainerData definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithProperties,
            DefinitionStages.WithCreate {
    }
    /** The DataContainerData definition stages. */
    interface DefinitionStages {
        /** The first stage of the DataContainerData definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the DataContainerData definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, workspaceName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param workspaceName Name of Azure Machine Learning workspace.
             * @return the next definition stage.
             */
            WithProperties withExistingWorkspace(String resourceGroupName, String workspaceName);
        }
        /** The stage of the DataContainerData definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: [Required] Additional attributes of the entity..
             *
             * @param properties [Required] Additional attributes of the entity.
             * @return the next definition stage.
             */
            WithCreate withProperties(DataContainerDetails properties);
        }
        /**
         * The stage of the DataContainerData definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            DataContainerData create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            DataContainerData create(Context context);
        }
    }
    /**
     * Begins update for the DataContainerData resource.
     *
     * @return the stage of resource update.
     */
    DataContainerData.Update update();

    /** The template for DataContainerData update. */
    interface Update extends UpdateStages.WithProperties {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        DataContainerData apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        DataContainerData apply(Context context);
    }
    /** The DataContainerData update stages. */
    interface UpdateStages {
        /** The stage of the DataContainerData update allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: [Required] Additional attributes of the entity..
             *
             * @param properties [Required] Additional attributes of the entity.
             * @return the next definition stage.
             */
            Update withProperties(DataContainerDetails properties);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    DataContainerData refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    DataContainerData refresh(Context context);
}
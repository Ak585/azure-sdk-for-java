// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** VMSS profile. */
@Fluent
public final class VmssNodesProfile extends NodeProfile {
    /*
     * Minimum number of nodes for autoscale
     */
    @JsonProperty(value = "autoScaleMinCount")
    private Integer autoScaleMinCount;

    /*
     * Maximum number of nodes for autoscale
     */
    @JsonProperty(value = "autoScaleMaxCount")
    private Integer autoScaleMaxCount;

    /**
     * Get the autoScaleMinCount property: Minimum number of nodes for autoscale.
     *
     * @return the autoScaleMinCount value.
     */
    public Integer autoScaleMinCount() {
        return this.autoScaleMinCount;
    }

    /**
     * Set the autoScaleMinCount property: Minimum number of nodes for autoscale.
     *
     * @param autoScaleMinCount the autoScaleMinCount value to set.
     * @return the VmssNodesProfile object itself.
     */
    public VmssNodesProfile withAutoScaleMinCount(Integer autoScaleMinCount) {
        this.autoScaleMinCount = autoScaleMinCount;
        return this;
    }

    /**
     * Get the autoScaleMaxCount property: Maximum number of nodes for autoscale.
     *
     * @return the autoScaleMaxCount value.
     */
    public Integer autoScaleMaxCount() {
        return this.autoScaleMaxCount;
    }

    /**
     * Set the autoScaleMaxCount property: Maximum number of nodes for autoscale.
     *
     * @param autoScaleMaxCount the autoScaleMaxCount value to set.
     * @return the VmssNodesProfile object itself.
     */
    public VmssNodesProfile withAutoScaleMaxCount(Integer autoScaleMaxCount) {
        this.autoScaleMaxCount = autoScaleMaxCount;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VmssNodesProfile withName(String name) {
        super.withName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VmssNodesProfile withNodeSku(String nodeSku) {
        super.withNodeSku(nodeSku);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VmssNodesProfile withOsImage(OsImageProfile osImage) {
        super.withOsImage(osImage);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VmssNodesProfile withOsDisk(DiskInfo osDisk) {
        super.withOsDisk(osDisk);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VmssNodesProfile withDataDisks(List<DiskInfo> dataDisks) {
        super.withDataDisks(dataDisks);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
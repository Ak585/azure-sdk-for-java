// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.imagebuilder.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.imagebuilder.models.ImageTemplatePropertiesOptimizeVmBoot;
import com.azure.resourcemanager.imagebuilder.models.VMBootOptimizationState;
import org.junit.jupiter.api.Assertions;

public final class ImageTemplatePropertiesOptimizeVmBootTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ImageTemplatePropertiesOptimizeVmBoot model =
            BinaryData.fromString("{\"state\":\"Disabled\"}").toObject(ImageTemplatePropertiesOptimizeVmBoot.class);
        Assertions.assertEquals(VMBootOptimizationState.DISABLED, model.state());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ImageTemplatePropertiesOptimizeVmBoot model =
            new ImageTemplatePropertiesOptimizeVmBoot().withState(VMBootOptimizationState.DISABLED);
        model = BinaryData.fromObject(model).toObject(ImageTemplatePropertiesOptimizeVmBoot.class);
        Assertions.assertEquals(VMBootOptimizationState.DISABLED, model.state());
    }
}

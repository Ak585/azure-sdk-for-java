// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.frontdoor.models.LoadBalancingSettingsUpdateParameters;
import org.junit.jupiter.api.Assertions;

public final class LoadBalancingSettingsUpdateParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LoadBalancingSettingsUpdateParameters model =
            BinaryData
                .fromString(
                    "{\"sampleSize\":2032728059,\"successfulSamplesRequired\":1528851064,\"additionalLatencyMilliseconds\":398738394}")
                .toObject(LoadBalancingSettingsUpdateParameters.class);
        Assertions.assertEquals(2032728059, model.sampleSize());
        Assertions.assertEquals(1528851064, model.successfulSamplesRequired());
        Assertions.assertEquals(398738394, model.additionalLatencyMilliseconds());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LoadBalancingSettingsUpdateParameters model =
            new LoadBalancingSettingsUpdateParameters()
                .withSampleSize(2032728059)
                .withSuccessfulSamplesRequired(1528851064)
                .withAdditionalLatencyMilliseconds(398738394);
        model = BinaryData.fromObject(model).toObject(LoadBalancingSettingsUpdateParameters.class);
        Assertions.assertEquals(2032728059, model.sampleSize());
        Assertions.assertEquals(1528851064, model.successfulSamplesRequired());
        Assertions.assertEquals(398738394, model.additionalLatencyMilliseconds());
    }
}

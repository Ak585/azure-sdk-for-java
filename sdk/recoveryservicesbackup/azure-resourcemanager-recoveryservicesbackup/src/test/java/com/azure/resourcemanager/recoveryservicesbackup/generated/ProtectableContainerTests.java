// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupManagementType;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectableContainer;
import org.junit.jupiter.api.Assertions;

public final class ProtectableContainerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ProtectableContainer model =
            BinaryData
                .fromString(
                    "{\"protectableContainerType\":\"ProtectableContainer\",\"friendlyName\":\"uhpkxkgymar\",\"backupManagementType\":\"AzureIaasVM\",\"healthStatus\":\"jxqugjhky\",\"containerId\":\"beddgssofw\"}")
                .toObject(ProtectableContainer.class);
        Assertions.assertEquals("uhpkxkgymar", model.friendlyName());
        Assertions.assertEquals(BackupManagementType.AZURE_IAAS_VM, model.backupManagementType());
        Assertions.assertEquals("jxqugjhky", model.healthStatus());
        Assertions.assertEquals("beddgssofw", model.containerId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ProtectableContainer model =
            new ProtectableContainer()
                .withFriendlyName("uhpkxkgymar")
                .withBackupManagementType(BackupManagementType.AZURE_IAAS_VM)
                .withHealthStatus("jxqugjhky")
                .withContainerId("beddgssofw");
        model = BinaryData.fromObject(model).toObject(ProtectableContainer.class);
        Assertions.assertEquals("uhpkxkgymar", model.friendlyName());
        Assertions.assertEquals(BackupManagementType.AZURE_IAAS_VM, model.backupManagementType());
        Assertions.assertEquals("jxqugjhky", model.healthStatus());
        Assertions.assertEquals("beddgssofw", model.containerId());
    }
}

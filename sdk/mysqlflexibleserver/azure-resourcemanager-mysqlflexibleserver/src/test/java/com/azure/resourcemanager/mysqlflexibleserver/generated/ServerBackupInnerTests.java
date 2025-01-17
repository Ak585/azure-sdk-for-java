// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mysqlflexibleserver.fluent.models.ServerBackupInner;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class ServerBackupInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ServerBackupInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"backupType\":\"hq\",\"completedTime\":\"2021-08-01T15:29:09Z\",\"source\":\"xpyb\"},\"id\":\"m\",\"name\":\"hmtzopbsphrup\",\"type\":\"dgs\"}")
                .toObject(ServerBackupInner.class);
        Assertions.assertEquals("hq", model.backupType());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-01T15:29:09Z"), model.completedTime());
        Assertions.assertEquals("xpyb", model.source());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ServerBackupInner model =
            new ServerBackupInner()
                .withBackupType("hq")
                .withCompletedTime(OffsetDateTime.parse("2021-08-01T15:29:09Z"))
                .withSource("xpyb");
        model = BinaryData.fromObject(model).toObject(ServerBackupInner.class);
        Assertions.assertEquals("hq", model.backupType());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-01T15:29:09Z"), model.completedTime());
        Assertions.assertEquals("xpyb", model.source());
    }
}

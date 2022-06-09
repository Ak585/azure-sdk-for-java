// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.machinelearning.models.AmlToken;
import com.azure.resourcemanager.machinelearning.models.AutoMLJob;
import com.azure.resourcemanager.machinelearning.models.CommandJob;
import com.azure.resourcemanager.machinelearning.models.CommandJobLimits;
import com.azure.resourcemanager.machinelearning.models.CronSchedule;
import com.azure.resourcemanager.machinelearning.models.Goal;
import com.azure.resourcemanager.machinelearning.models.GridSamplingAlgorithm;
import com.azure.resourcemanager.machinelearning.models.ImageClassification;
import com.azure.resourcemanager.machinelearning.models.ImageLimitSettings;
import com.azure.resourcemanager.machinelearning.models.ImageModelDistributionSettingsClassification;
import com.azure.resourcemanager.machinelearning.models.ImageModelSettingsClassification;
import com.azure.resourcemanager.machinelearning.models.ImageVerticalDataSettings;
import com.azure.resourcemanager.machinelearning.models.JobService;
import com.azure.resourcemanager.machinelearning.models.LiteralJobInput;
import com.azure.resourcemanager.machinelearning.models.MLTableJobInput;
import com.azure.resourcemanager.machinelearning.models.MedianStoppingPolicy;
import com.azure.resourcemanager.machinelearning.models.Mpi;
import com.azure.resourcemanager.machinelearning.models.Objective;
import com.azure.resourcemanager.machinelearning.models.OutputDeliveryMode;
import com.azure.resourcemanager.machinelearning.models.PipelineJob;
import com.azure.resourcemanager.machinelearning.models.ResourceConfiguration;
import com.azure.resourcemanager.machinelearning.models.ScheduleStatus;
import com.azure.resourcemanager.machinelearning.models.SweepJob;
import com.azure.resourcemanager.machinelearning.models.SweepJobLimits;
import com.azure.resourcemanager.machinelearning.models.TensorFlow;
import com.azure.resourcemanager.machinelearning.models.TrainingDataSettings;
import com.azure.resourcemanager.machinelearning.models.TrialComponent;
import com.azure.resourcemanager.machinelearning.models.UriFileJobOutput;
import java.io.IOException;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for Jobs CreateOrUpdate. */
public final class JobsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/preview/2022-02-01-preview/examples/Job/AutoMLJob/createOrUpdate.json
     */
    /**
     * Sample code: CreateOrUpdate AutoML Job.
     *
     * @param manager Entry point to MachineLearningManager.
     */
    public static void createOrUpdateAutoMLJob(com.azure.resourcemanager.machinelearning.MachineLearningManager manager)
        throws IOException {
        manager
            .jobs()
            .define("string")
            .withExistingWorkspace("test-rg", "my-aml-workspace")
            .withProperties(
                new AutoMLJob()
                    .withDescription("string")
                    .withProperties(mapOf("string", "string"))
                    .withTags(mapOf("string", "string"))
                    .withComputeId("string")
                    .withDisplayName("string")
                    .withExperimentName("string")
                    .withIdentity(new AmlToken())
                    .withIsArchived(false)
                    .withSchedule(
                        new CronSchedule()
                            .withEndTime(OffsetDateTime.parse("2020-01-01T12:34:56.999Z"))
                            .withScheduleStatus(ScheduleStatus.DISABLED)
                            .withStartTime(OffsetDateTime.parse("2020-01-01T12:34:56.999Z"))
                            .withTimeZone("string")
                            .withExpression("string"))
                    .withServices(
                        mapOf(
                            "string",
                            new JobService()
                                .withEndpoint("string")
                                .withJobServiceType("string")
                                .withPort(1)
                                .withProperties(mapOf("string", "string"))))
                    .withEnvironmentId("string")
                    .withEnvironmentVariables(mapOf("string", "string"))
                    .withOutputs(
                        mapOf(
                            "string",
                            new UriFileJobOutput()
                                .withDescription("string")
                                .withMode(OutputDeliveryMode.READ_WRITE_MOUNT)
                                .withUri("string")))
                    .withResources(
                        new ResourceConfiguration()
                            .withInstanceCount(1)
                            .withInstanceType("string")
                            .withProperties(
                                mapOf(
                                    "string",
                                    SerializerFactory
                                        .createDefaultManagementSerializerAdapter()
                                        .deserialize(
                                            "{\"9bec0ab0-c62f-4fa9-a97c-7b24bbcc90ad\":null}",
                                            Object.class,
                                            SerializerEncoding.JSON))))
                    .withTaskDetails(
                        new ImageClassification()
                            .withModelSettings(new ImageModelSettingsClassification().withValidationCropSize(2))
                            .withSearchSpace(
                                Arrays
                                    .asList(
                                        new ImageModelDistributionSettingsClassification()
                                            .withValidationCropSize("choice(2, 360)")))
                            .withDataSettings(
                                new ImageVerticalDataSettings()
                                    .withTargetColumnName("string")
                                    .withTrainingData(
                                        new TrainingDataSettings().withData(new MLTableJobInput().withUri("string"))))
                            .withLimitSettings(new ImageLimitSettings().withMaxTrials(2))))
            .create();
    }

    /*
     * x-ms-original-file: specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/preview/2022-02-01-preview/examples/Job/SweepJob/createOrUpdate.json
     */
    /**
     * Sample code: CreateOrUpdate Sweep Job.
     *
     * @param manager Entry point to MachineLearningManager.
     */
    public static void createOrUpdateSweepJob(com.azure.resourcemanager.machinelearning.MachineLearningManager manager)
        throws IOException {
        manager
            .jobs()
            .define("string")
            .withExistingWorkspace("test-rg", "my-aml-workspace")
            .withProperties(
                new SweepJob()
                    .withDescription("string")
                    .withProperties(mapOf("string", "string"))
                    .withTags(mapOf("string", "string"))
                    .withComputeId("string")
                    .withDisplayName("string")
                    .withExperimentName("string")
                    .withServices(
                        mapOf(
                            "string",
                            new JobService()
                                .withEndpoint("string")
                                .withJobServiceType("string")
                                .withPort(1)
                                .withProperties(mapOf("string", "string"))))
                    .withEarlyTermination(new MedianStoppingPolicy().withDelayEvaluation(1).withEvaluationInterval(1))
                    .withLimits(
                        new SweepJobLimits()
                            .withMaxConcurrentTrials(1)
                            .withMaxTotalTrials(1)
                            .withTrialTimeout(Duration.parse("PT1S")))
                    .withObjective(new Objective().withGoal(Goal.MINIMIZE).withPrimaryMetric("string"))
                    .withSamplingAlgorithm(new GridSamplingAlgorithm())
                    .withSearchSpace(
                        SerializerFactory
                            .createDefaultManagementSerializerAdapter()
                            .deserialize("{\"string\":{}}", Object.class, SerializerEncoding.JSON))
                    .withTrial(
                        new TrialComponent()
                            .withCodeId("string")
                            .withCommand("string")
                            .withDistribution(new Mpi().withProcessCountPerInstance(1))
                            .withEnvironmentId("string")
                            .withEnvironmentVariables(mapOf("string", "string"))
                            .withResources(
                                new ResourceConfiguration()
                                    .withInstanceCount(1)
                                    .withInstanceType("string")
                                    .withProperties(
                                        mapOf(
                                            "string",
                                            SerializerFactory
                                                .createDefaultManagementSerializerAdapter()
                                                .deserialize(
                                                    "{\"e6b6493e-7d5e-4db3-be1e-306ec641327e\":null}",
                                                    Object.class,
                                                    SerializerEncoding.JSON))))))
            .create();
    }

    /*
     * x-ms-original-file: specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/preview/2022-02-01-preview/examples/Job/PipelineJob/createOrUpdate.json
     */
    /**
     * Sample code: CreateOrUpdate Pipeline Job.
     *
     * @param manager Entry point to MachineLearningManager.
     */
    public static void createOrUpdatePipelineJob(
        com.azure.resourcemanager.machinelearning.MachineLearningManager manager) throws IOException {
        manager
            .jobs()
            .define("string")
            .withExistingWorkspace("test-rg", "my-aml-workspace")
            .withProperties(
                new PipelineJob()
                    .withDescription("string")
                    .withProperties(mapOf("string", "string"))
                    .withTags(mapOf("string", "string"))
                    .withComputeId("string")
                    .withDisplayName("string")
                    .withExperimentName("string")
                    .withServices(
                        mapOf(
                            "string",
                            new JobService()
                                .withEndpoint("string")
                                .withJobServiceType("string")
                                .withPort(1)
                                .withProperties(mapOf("string", "string"))))
                    .withInputs(mapOf("string", new LiteralJobInput().withDescription("string").withValue("string")))
                    .withOutputs(
                        mapOf(
                            "string",
                            new UriFileJobOutput()
                                .withDescription("string")
                                .withMode(OutputDeliveryMode.UPLOAD)
                                .withUri("string")))
                    .withSettings(
                        SerializerFactory
                            .createDefaultManagementSerializerAdapter()
                            .deserialize("{}", Object.class, SerializerEncoding.JSON)))
            .create();
    }

    /*
     * x-ms-original-file: specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/preview/2022-02-01-preview/examples/Job/CommandJob/createOrUpdate.json
     */
    /**
     * Sample code: CreateOrUpdate Command Job.
     *
     * @param manager Entry point to MachineLearningManager.
     */
    public static void createOrUpdateCommandJob(
        com.azure.resourcemanager.machinelearning.MachineLearningManager manager) throws IOException {
        manager
            .jobs()
            .define("string")
            .withExistingWorkspace("test-rg", "my-aml-workspace")
            .withProperties(
                new CommandJob()
                    .withDescription("string")
                    .withProperties(mapOf("string", "string"))
                    .withTags(mapOf("string", "string"))
                    .withComputeId("string")
                    .withDisplayName("string")
                    .withExperimentName("string")
                    .withIdentity(new AmlToken())
                    .withServices(
                        mapOf(
                            "string",
                            new JobService()
                                .withEndpoint("string")
                                .withJobServiceType("string")
                                .withPort(1)
                                .withProperties(mapOf("string", "string"))))
                    .withCodeId("string")
                    .withCommand("string")
                    .withDistribution(new TensorFlow().withParameterServerCount(1).withWorkerCount(1))
                    .withEnvironmentId("string")
                    .withEnvironmentVariables(mapOf("string", "string"))
                    .withInputs(mapOf("string", new LiteralJobInput().withDescription("string").withValue("string")))
                    .withLimits(new CommandJobLimits().withTimeout(Duration.parse("PT5M")))
                    .withOutputs(
                        mapOf(
                            "string",
                            new UriFileJobOutput()
                                .withDescription("string")
                                .withMode(OutputDeliveryMode.READ_WRITE_MOUNT)
                                .withUri("string")))
                    .withResources(
                        new ResourceConfiguration()
                            .withInstanceCount(1)
                            .withInstanceType("string")
                            .withProperties(
                                mapOf(
                                    "string",
                                    SerializerFactory
                                        .createDefaultManagementSerializerAdapter()
                                        .deserialize(
                                            "{\"e6b6493e-7d5e-4db3-be1e-306ec641327e\":null}",
                                            Object.class,
                                            SerializerEncoding.JSON)))))
            .create();
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
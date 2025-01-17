// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Function information. */
@Fluent
public final class FunctionEnvelopeInner extends ProxyOnlyResource {
    /*
     * FunctionEnvelope resource specific properties
     */
    @JsonProperty(value = "properties")
    private FunctionEnvelopeProperties innerProperties;

    /** Creates an instance of FunctionEnvelopeInner class. */
    public FunctionEnvelopeInner() {
    }

    /**
     * Get the innerProperties property: FunctionEnvelope resource specific properties.
     *
     * @return the innerProperties value.
     */
    private FunctionEnvelopeProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public FunctionEnvelopeInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the functionAppId property: Function App ID.
     *
     * @return the functionAppId value.
     */
    public String functionAppId() {
        return this.innerProperties() == null ? null : this.innerProperties().functionAppId();
    }

    /**
     * Set the functionAppId property: Function App ID.
     *
     * @param functionAppId the functionAppId value to set.
     * @return the FunctionEnvelopeInner object itself.
     */
    public FunctionEnvelopeInner withFunctionAppId(String functionAppId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FunctionEnvelopeProperties();
        }
        this.innerProperties().withFunctionAppId(functionAppId);
        return this;
    }

    /**
     * Get the scriptRootPathHref property: Script root path URI.
     *
     * @return the scriptRootPathHref value.
     */
    public String scriptRootPathHref() {
        return this.innerProperties() == null ? null : this.innerProperties().scriptRootPathHref();
    }

    /**
     * Set the scriptRootPathHref property: Script root path URI.
     *
     * @param scriptRootPathHref the scriptRootPathHref value to set.
     * @return the FunctionEnvelopeInner object itself.
     */
    public FunctionEnvelopeInner withScriptRootPathHref(String scriptRootPathHref) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FunctionEnvelopeProperties();
        }
        this.innerProperties().withScriptRootPathHref(scriptRootPathHref);
        return this;
    }

    /**
     * Get the scriptHref property: Script URI.
     *
     * @return the scriptHref value.
     */
    public String scriptHref() {
        return this.innerProperties() == null ? null : this.innerProperties().scriptHref();
    }

    /**
     * Set the scriptHref property: Script URI.
     *
     * @param scriptHref the scriptHref value to set.
     * @return the FunctionEnvelopeInner object itself.
     */
    public FunctionEnvelopeInner withScriptHref(String scriptHref) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FunctionEnvelopeProperties();
        }
        this.innerProperties().withScriptHref(scriptHref);
        return this;
    }

    /**
     * Get the configHref property: Config URI.
     *
     * @return the configHref value.
     */
    public String configHref() {
        return this.innerProperties() == null ? null : this.innerProperties().configHref();
    }

    /**
     * Set the configHref property: Config URI.
     *
     * @param configHref the configHref value to set.
     * @return the FunctionEnvelopeInner object itself.
     */
    public FunctionEnvelopeInner withConfigHref(String configHref) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FunctionEnvelopeProperties();
        }
        this.innerProperties().withConfigHref(configHref);
        return this;
    }

    /**
     * Get the testDataHref property: Test data URI.
     *
     * @return the testDataHref value.
     */
    public String testDataHref() {
        return this.innerProperties() == null ? null : this.innerProperties().testDataHref();
    }

    /**
     * Set the testDataHref property: Test data URI.
     *
     * @param testDataHref the testDataHref value to set.
     * @return the FunctionEnvelopeInner object itself.
     */
    public FunctionEnvelopeInner withTestDataHref(String testDataHref) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FunctionEnvelopeProperties();
        }
        this.innerProperties().withTestDataHref(testDataHref);
        return this;
    }

    /**
     * Get the secretsFileHref property: Secrets file URI.
     *
     * @return the secretsFileHref value.
     */
    public String secretsFileHref() {
        return this.innerProperties() == null ? null : this.innerProperties().secretsFileHref();
    }

    /**
     * Set the secretsFileHref property: Secrets file URI.
     *
     * @param secretsFileHref the secretsFileHref value to set.
     * @return the FunctionEnvelopeInner object itself.
     */
    public FunctionEnvelopeInner withSecretsFileHref(String secretsFileHref) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FunctionEnvelopeProperties();
        }
        this.innerProperties().withSecretsFileHref(secretsFileHref);
        return this;
    }

    /**
     * Get the href property: Function URI.
     *
     * @return the href value.
     */
    public String href() {
        return this.innerProperties() == null ? null : this.innerProperties().href();
    }

    /**
     * Set the href property: Function URI.
     *
     * @param href the href value to set.
     * @return the FunctionEnvelopeInner object itself.
     */
    public FunctionEnvelopeInner withHref(String href) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FunctionEnvelopeProperties();
        }
        this.innerProperties().withHref(href);
        return this;
    }

    /**
     * Get the config property: Config information.
     *
     * @return the config value.
     */
    public Object config() {
        return this.innerProperties() == null ? null : this.innerProperties().config();
    }

    /**
     * Set the config property: Config information.
     *
     * @param config the config value to set.
     * @return the FunctionEnvelopeInner object itself.
     */
    public FunctionEnvelopeInner withConfig(Object config) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FunctionEnvelopeProperties();
        }
        this.innerProperties().withConfig(config);
        return this;
    }

    /**
     * Get the files property: File list.
     *
     * @return the files value.
     */
    public Map<String, String> files() {
        return this.innerProperties() == null ? null : this.innerProperties().files();
    }

    /**
     * Set the files property: File list.
     *
     * @param files the files value to set.
     * @return the FunctionEnvelopeInner object itself.
     */
    public FunctionEnvelopeInner withFiles(Map<String, String> files) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FunctionEnvelopeProperties();
        }
        this.innerProperties().withFiles(files);
        return this;
    }

    /**
     * Get the testData property: Test data used when testing via the Azure Portal.
     *
     * @return the testData value.
     */
    public String testData() {
        return this.innerProperties() == null ? null : this.innerProperties().testData();
    }

    /**
     * Set the testData property: Test data used when testing via the Azure Portal.
     *
     * @param testData the testData value to set.
     * @return the FunctionEnvelopeInner object itself.
     */
    public FunctionEnvelopeInner withTestData(String testData) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FunctionEnvelopeProperties();
        }
        this.innerProperties().withTestData(testData);
        return this;
    }

    /**
     * Get the invokeUrlTemplate property: The invocation URL.
     *
     * @return the invokeUrlTemplate value.
     */
    public String invokeUrlTemplate() {
        return this.innerProperties() == null ? null : this.innerProperties().invokeUrlTemplate();
    }

    /**
     * Set the invokeUrlTemplate property: The invocation URL.
     *
     * @param invokeUrlTemplate the invokeUrlTemplate value to set.
     * @return the FunctionEnvelopeInner object itself.
     */
    public FunctionEnvelopeInner withInvokeUrlTemplate(String invokeUrlTemplate) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FunctionEnvelopeProperties();
        }
        this.innerProperties().withInvokeUrlTemplate(invokeUrlTemplate);
        return this;
    }

    /**
     * Get the language property: The function language.
     *
     * @return the language value.
     */
    public String language() {
        return this.innerProperties() == null ? null : this.innerProperties().language();
    }

    /**
     * Set the language property: The function language.
     *
     * @param language the language value to set.
     * @return the FunctionEnvelopeInner object itself.
     */
    public FunctionEnvelopeInner withLanguage(String language) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FunctionEnvelopeProperties();
        }
        this.innerProperties().withLanguage(language);
        return this;
    }

    /**
     * Get the isDisabled property: Gets or sets a value indicating whether the function is disabled.
     *
     * @return the isDisabled value.
     */
    public Boolean isDisabled() {
        return this.innerProperties() == null ? null : this.innerProperties().isDisabled();
    }

    /**
     * Set the isDisabled property: Gets or sets a value indicating whether the function is disabled.
     *
     * @param isDisabled the isDisabled value to set.
     * @return the FunctionEnvelopeInner object itself.
     */
    public FunctionEnvelopeInner withIsDisabled(Boolean isDisabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FunctionEnvelopeProperties();
        }
        this.innerProperties().withIsDisabled(isDisabled);
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
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Admin credentials for virtual machine. */
@Fluent
public final class VirtualMachineSshCredentials {
    /*
     * Username of admin account
     */
    @JsonProperty(value = "username")
    private String username;

    /*
     * Password of admin account
     */
    @JsonProperty(value = "password")
    private String password;

    /*
     * Public key data
     */
    @JsonProperty(value = "publicKeyData")
    private String publicKeyData;

    /*
     * Private key data
     */
    @JsonProperty(value = "privateKeyData")
    private String privateKeyData;

    /**
     * Get the username property: Username of admin account.
     *
     * @return the username value.
     */
    public String username() {
        return this.username;
    }

    /**
     * Set the username property: Username of admin account.
     *
     * @param username the username value to set.
     * @return the VirtualMachineSshCredentials object itself.
     */
    public VirtualMachineSshCredentials withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: Password of admin account.
     *
     * @return the password value.
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password property: Password of admin account.
     *
     * @param password the password value to set.
     * @return the VirtualMachineSshCredentials object itself.
     */
    public VirtualMachineSshCredentials withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get the publicKeyData property: Public key data.
     *
     * @return the publicKeyData value.
     */
    public String publicKeyData() {
        return this.publicKeyData;
    }

    /**
     * Set the publicKeyData property: Public key data.
     *
     * @param publicKeyData the publicKeyData value to set.
     * @return the VirtualMachineSshCredentials object itself.
     */
    public VirtualMachineSshCredentials withPublicKeyData(String publicKeyData) {
        this.publicKeyData = publicKeyData;
        return this;
    }

    /**
     * Get the privateKeyData property: Private key data.
     *
     * @return the privateKeyData value.
     */
    public String privateKeyData() {
        return this.privateKeyData;
    }

    /**
     * Set the privateKeyData property: Private key data.
     *
     * @param privateKeyData the privateKeyData value to set.
     * @return the VirtualMachineSshCredentials object itself.
     */
    public VirtualMachineSshCredentials withPrivateKeyData(String privateKeyData) {
        this.privateKeyData = privateKeyData;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
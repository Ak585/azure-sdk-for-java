// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.communication.callautomation.models;

import com.azure.core.annotation.Fluent;

/**
 * The options for creating a call.
 */
@Fluent
public final class HangUpOptions {
    /**
     * Boolean to determine if the call should be terminated for all participants.
     */
    private final boolean isForEveryone;

    /**
     * Constructor
     *
     * @param isForEveryone Boolean to determine if the call should be terminated for all participants.
     */
    public HangUpOptions(boolean isForEveryone) {
        this.isForEveryone = isForEveryone;
    }

    /**
     * Get the boolean to determine if the call should be terminated for all participants.
     *
     * @return the isForEveryone.
     */
    public boolean getIsForEveryone() {
        return isForEveryone;
    }
}

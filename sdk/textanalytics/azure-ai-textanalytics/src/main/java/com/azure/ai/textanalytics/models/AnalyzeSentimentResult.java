// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.textanalytics.models;

import com.azure.ai.textanalytics.implementation.AnalyzeSentimentResultPropertiesHelper;
import com.azure.core.annotation.Immutable;

/**
 * The {@link AnalyzeSentimentResult} model.
 */
@Immutable
public final class AnalyzeSentimentResult extends TextAnalyticsResult {
    private final DocumentSentiment documentSentiment;

    private DetectedLanguage detectedLanguage;

    static {
        AnalyzeSentimentResultPropertiesHelper.setAccessor(
            (documentResult, detectedLanguage) -> documentResult.setDetectedLanguage(detectedLanguage));
    }

    /**
     * Creates a {@link AnalyzeSentimentResult} model that describes analyzed sentiment result.
     *
     * @param id Unique, non-empty document identifier.
     * @param textDocumentStatistics The text document statistics.
     * @param error The document error.
     * @param documentSentiment The document sentiment.
     */
    public AnalyzeSentimentResult(String id, TextDocumentStatistics textDocumentStatistics,
                                  TextAnalyticsError error, DocumentSentiment documentSentiment) {
        super(id, textDocumentStatistics, error);
        this.documentSentiment = documentSentiment;
    }

    /**
     * Gets the document sentiment.
     *
     * @return The document sentiment.
     *
     * @throws TextAnalyticsException if result has {@code isError} equals to true and when a non-error property
     * was accessed.
     */
    public DocumentSentiment getDocumentSentiment() {
        throwExceptionIfError();
        return documentSentiment;
    }

    /**
     * Get the detectedLanguage property: If 'language' is set to 'auto' for the document in the request this field will
     * contain an object of the language detected for this document.
     *
     * @return the detectedLanguage value.
     */
    public DetectedLanguage getDetectedLanguage() {
        return this.detectedLanguage;
    }

    private void setDetectedLanguage(DetectedLanguage detectedLanguage) {
        this.detectedLanguage = detectedLanguage;
    }
}

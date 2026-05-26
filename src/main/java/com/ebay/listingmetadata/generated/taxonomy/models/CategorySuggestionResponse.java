// Copyright 2026 eBay Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.ebay.listingmetadata.generated.taxonomy.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type contains an array of suggested category tree nodes that are considered by eBay to most closely correspond to the keywords provided in a query string, from a specified category tree.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CategorySuggestionResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Contains details about one or more suggested categories that correspond to the provided keywords. The array of suggested categories is sorted in order of eBay&apos;s confidence of the relevance of each category (the first category is the most relevant).&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;&lt;span style=&quot;color:red&quot;&gt;Important:&lt;/span&gt;&lt;/strong&gt; This call is not supported in the Sandbox environment. It will return a response payload in which the &lt;b&gt;categoryName&lt;/b&gt; fields contain random or boilerplate text regardless of the query submitted. &lt;/span&gt;
     */
    private java.util.List<CategorySuggestion> categorySuggestions;
    /**
     * The unique identifier of the eBay category tree from which suggestions are returned.
     */
    private String categoryTreeId;
    /**
     * The version of the category tree identified by &lt;b&gt;categoryTreeId&lt;/b&gt;. It&apos;s a good idea to cache this value for comparison so you can determine if this category tree has been modified in subsequent calls.
     */
    private String categoryTreeVersion;
    /**
     * Instantiates a new {@link CategorySuggestionResponse} and sets the default values.
     */
    public CategorySuggestionResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CategorySuggestionResponse}
     */
    @jakarta.annotation.Nonnull
    public static CategorySuggestionResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CategorySuggestionResponse();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the categorySuggestions property value. Contains details about one or more suggested categories that correspond to the provided keywords. The array of suggested categories is sorted in order of eBay&apos;s confidence of the relevance of each category (the first category is the most relevant).&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;&lt;span style=&quot;color:red&quot;&gt;Important:&lt;/span&gt;&lt;/strong&gt; This call is not supported in the Sandbox environment. It will return a response payload in which the &lt;b&gt;categoryName&lt;/b&gt; fields contain random or boilerplate text regardless of the query submitted. &lt;/span&gt;
     * @return a {@link java.util.List<CategorySuggestion>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CategorySuggestion> getCategorySuggestions() {
        return this.categorySuggestions;
    }
    /**
     * Gets the categoryTreeId property value. The unique identifier of the eBay category tree from which suggestions are returned.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCategoryTreeId() {
        return this.categoryTreeId;
    }
    /**
     * Gets the categoryTreeVersion property value. The version of the category tree identified by &lt;b&gt;categoryTreeId&lt;/b&gt;. It&apos;s a good idea to cache this value for comparison so you can determine if this category tree has been modified in subsequent calls.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCategoryTreeVersion() {
        return this.categoryTreeVersion;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("categorySuggestions", (n) -> { this.setCategorySuggestions(n.getCollectionOfObjectValues(CategorySuggestion::createFromDiscriminatorValue)); });
        deserializerMap.put("categoryTreeId", (n) -> { this.setCategoryTreeId(n.getStringValue()); });
        deserializerMap.put("categoryTreeVersion", (n) -> { this.setCategoryTreeVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("categorySuggestions", this.getCategorySuggestions());
        writer.writeStringValue("categoryTreeId", this.getCategoryTreeId());
        writer.writeStringValue("categoryTreeVersion", this.getCategoryTreeVersion());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the categorySuggestions property value. Contains details about one or more suggested categories that correspond to the provided keywords. The array of suggested categories is sorted in order of eBay&apos;s confidence of the relevance of each category (the first category is the most relevant).&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;&lt;span style=&quot;color:red&quot;&gt;Important:&lt;/span&gt;&lt;/strong&gt; This call is not supported in the Sandbox environment. It will return a response payload in which the &lt;b&gt;categoryName&lt;/b&gt; fields contain random or boilerplate text regardless of the query submitted. &lt;/span&gt;
     * @param value Value to set for the categorySuggestions property.
     */
    public void setCategorySuggestions(@jakarta.annotation.Nullable final java.util.List<CategorySuggestion> value) {
        this.categorySuggestions = value;
    }
    /**
     * Sets the categoryTreeId property value. The unique identifier of the eBay category tree from which suggestions are returned.
     * @param value Value to set for the categoryTreeId property.
     */
    public void setCategoryTreeId(@jakarta.annotation.Nullable final String value) {
        this.categoryTreeId = value;
    }
    /**
     * Sets the categoryTreeVersion property value. The version of the category tree identified by &lt;b&gt;categoryTreeId&lt;/b&gt;. It&apos;s a good idea to cache this value for comparison so you can determine if this category tree has been modified in subsequent calls.
     * @param value Value to set for the categoryTreeVersion property.
     */
    public void setCategoryTreeVersion(@jakarta.annotation.Nullable final String value) {
        this.categoryTreeVersion = value;
    }
}

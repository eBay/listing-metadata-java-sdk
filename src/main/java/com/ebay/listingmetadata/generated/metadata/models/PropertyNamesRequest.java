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

package com.ebay.listingmetadata.generated.metadata.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines the request fields for the &lt;b&gt;getCompatibilityPropertyNames&lt;/b&gt; method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PropertyNamesRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The unique identifier of the eBay leaf category for which to retrieve compatibility property names. This category must be a valid eBay category on the specified eBay marketplace, and the category must support parts compatibility.&lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/develop/api/sell/metadata_api#sell-metadata_api-marketplace-getautomotivepartscompatibilitypolicies&quot;&gt;getAutomotivePartsCompatibilityPolicies&lt;/a&gt; method to retrieve a list of categories that support parts compatibility.
     */
    private String categoryId;
    /**
     * This array defines the properties that will be returned for the compatibility-enabled category.&lt;br&gt;&lt;br&gt; For example, if you specify &lt;code&gt;Searchable&lt;/code&gt;, the compatibility details will contain properties that can be used to search for products, such as make or model.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;DisplayableProductDetails&lt;/code&gt;: Properties for use in a user interface to describe products.&lt;/li&gt;&lt;li&gt;&lt;code&gt;DisplayableSearchResults&lt;/code&gt;: Properties for use in results for product searches.&lt;/li&gt;&lt;li&gt;&lt;code&gt;Searchable&lt;/code&gt;: Properties for use in searches.&lt;/li&gt;&lt;li&gt;&lt;code&gt;Sortable&lt;/code&gt;: Properties that are suitable for sorting.&lt;/li&gt;&lt;/ul&gt;&lt;b&gt;Default:&lt;/b&gt; &lt;code&gt;DisplayableSearchResults&lt;/code&gt;
     */
    private java.util.List<String> dataset;
    /**
     * Instantiates a new {@link PropertyNamesRequest} and sets the default values.
     */
    public PropertyNamesRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PropertyNamesRequest}
     */
    @jakarta.annotation.Nonnull
    public static PropertyNamesRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PropertyNamesRequest();
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
     * Gets the categoryId property value. The unique identifier of the eBay leaf category for which to retrieve compatibility property names. This category must be a valid eBay category on the specified eBay marketplace, and the category must support parts compatibility.&lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/develop/api/sell/metadata_api#sell-metadata_api-marketplace-getautomotivepartscompatibilitypolicies&quot;&gt;getAutomotivePartsCompatibilityPolicies&lt;/a&gt; method to retrieve a list of categories that support parts compatibility.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCategoryId() {
        return this.categoryId;
    }
    /**
     * Gets the dataset property value. This array defines the properties that will be returned for the compatibility-enabled category.&lt;br&gt;&lt;br&gt; For example, if you specify &lt;code&gt;Searchable&lt;/code&gt;, the compatibility details will contain properties that can be used to search for products, such as make or model.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;DisplayableProductDetails&lt;/code&gt;: Properties for use in a user interface to describe products.&lt;/li&gt;&lt;li&gt;&lt;code&gt;DisplayableSearchResults&lt;/code&gt;: Properties for use in results for product searches.&lt;/li&gt;&lt;li&gt;&lt;code&gt;Searchable&lt;/code&gt;: Properties for use in searches.&lt;/li&gt;&lt;li&gt;&lt;code&gt;Sortable&lt;/code&gt;: Properties that are suitable for sorting.&lt;/li&gt;&lt;/ul&gt;&lt;b&gt;Default:&lt;/b&gt; &lt;code&gt;DisplayableSearchResults&lt;/code&gt;
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDataset() {
        return this.dataset;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("categoryId", (n) -> { this.setCategoryId(n.getStringValue()); });
        deserializerMap.put("dataset", (n) -> { this.setDataset(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("categoryId", this.getCategoryId());
        writer.writeCollectionOfPrimitiveValues("dataset", this.getDataset());
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
     * Sets the categoryId property value. The unique identifier of the eBay leaf category for which to retrieve compatibility property names. This category must be a valid eBay category on the specified eBay marketplace, and the category must support parts compatibility.&lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/develop/api/sell/metadata_api#sell-metadata_api-marketplace-getautomotivepartscompatibilitypolicies&quot;&gt;getAutomotivePartsCompatibilityPolicies&lt;/a&gt; method to retrieve a list of categories that support parts compatibility.
     * @param value Value to set for the categoryId property.
     */
    public void setCategoryId(@jakarta.annotation.Nullable final String value) {
        this.categoryId = value;
    }
    /**
     * Sets the dataset property value. This array defines the properties that will be returned for the compatibility-enabled category.&lt;br&gt;&lt;br&gt; For example, if you specify &lt;code&gt;Searchable&lt;/code&gt;, the compatibility details will contain properties that can be used to search for products, such as make or model.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;DisplayableProductDetails&lt;/code&gt;: Properties for use in a user interface to describe products.&lt;/li&gt;&lt;li&gt;&lt;code&gt;DisplayableSearchResults&lt;/code&gt;: Properties for use in results for product searches.&lt;/li&gt;&lt;li&gt;&lt;code&gt;Searchable&lt;/code&gt;: Properties for use in searches.&lt;/li&gt;&lt;li&gt;&lt;code&gt;Sortable&lt;/code&gt;: Properties that are suitable for sorting.&lt;/li&gt;&lt;/ul&gt;&lt;b&gt;Default:&lt;/b&gt; &lt;code&gt;DisplayableSearchResults&lt;/code&gt;
     * @param value Value to set for the dataset property.
     */
    public void setDataset(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.dataset = value;
    }
}

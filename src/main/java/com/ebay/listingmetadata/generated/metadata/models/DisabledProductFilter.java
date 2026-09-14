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
 * This container can be used to specify whether or not to filter out products which are disabled for selling on eBay and/or disabled for product review. 
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DisabledProductFilter implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Specifies whether to filter out products excluded for eBay reviews.&lt;br&gt;&lt;br&gt;If set to &lt;code&gt;true&lt;/code&gt;, items excluded from eBay reviews are not returned.
     */
    private Boolean excludeForEbayReviews;
    /**
     * Specifies whether to filter out products excluded for eBay selling.&lt;br&gt;&lt;br&gt;If set to &lt;code&gt;true&lt;/code&gt;, items excluded from eBay selling are not returned.
     */
    private Boolean excludeForEbaySelling;
    /**
     * Instantiates a new {@link DisabledProductFilter} and sets the default values.
     */
    public DisabledProductFilter() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DisabledProductFilter}
     */
    @jakarta.annotation.Nonnull
    public static DisabledProductFilter createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DisabledProductFilter();
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
     * Gets the excludeForEbayReviews property value. Specifies whether to filter out products excluded for eBay reviews.&lt;br&gt;&lt;br&gt;If set to &lt;code&gt;true&lt;/code&gt;, items excluded from eBay reviews are not returned.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getExcludeForEbayReviews() {
        return this.excludeForEbayReviews;
    }
    /**
     * Gets the excludeForEbaySelling property value. Specifies whether to filter out products excluded for eBay selling.&lt;br&gt;&lt;br&gt;If set to &lt;code&gt;true&lt;/code&gt;, items excluded from eBay selling are not returned.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getExcludeForEbaySelling() {
        return this.excludeForEbaySelling;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("excludeForEbayReviews", (n) -> { this.setExcludeForEbayReviews(n.getBooleanValue()); });
        deserializerMap.put("excludeForEbaySelling", (n) -> { this.setExcludeForEbaySelling(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("excludeForEbayReviews", this.getExcludeForEbayReviews());
        writer.writeBooleanValue("excludeForEbaySelling", this.getExcludeForEbaySelling());
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
     * Sets the excludeForEbayReviews property value. Specifies whether to filter out products excluded for eBay reviews.&lt;br&gt;&lt;br&gt;If set to &lt;code&gt;true&lt;/code&gt;, items excluded from eBay reviews are not returned.
     * @param value Value to set for the excludeForEbayReviews property.
     */
    public void setExcludeForEbayReviews(@jakarta.annotation.Nullable final Boolean value) {
        this.excludeForEbayReviews = value;
    }
    /**
     * Sets the excludeForEbaySelling property value. Specifies whether to filter out products excluded for eBay selling.&lt;br&gt;&lt;br&gt;If set to &lt;code&gt;true&lt;/code&gt;, items excluded from eBay selling are not returned.
     * @param value Value to set for the excludeForEbaySelling property.
     */
    public void setExcludeForEbaySelling(@jakarta.annotation.Nullable final Boolean value) {
        this.excludeForEbaySelling = value;
    }
}

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
 * This type defines the response fields for the &lt;b&gt;getProductCompatibilities&lt;/b&gt; method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProductResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This container provides compatibility details for the specified product.
     */
    private java.util.List<ProductResponseCompatibilityDetails> compatibilityDetails;
    /**
     * This type defines the pagination settings for a result set.
     */
    private Pagination pagination;
    /**
     * Instantiates a new {@link ProductResponse} and sets the default values.
     */
    public ProductResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ProductResponse}
     */
    @jakarta.annotation.Nonnull
    public static ProductResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProductResponse();
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
     * Gets the compatibilityDetails property value. This container provides compatibility details for the specified product.
     * @return a {@link java.util.List<ProductResponseCompatibilityDetails>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ProductResponseCompatibilityDetails> getCompatibilityDetails() {
        return this.compatibilityDetails;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("compatibilityDetails", (n) -> { this.setCompatibilityDetails(n.getCollectionOfObjectValues(ProductResponseCompatibilityDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("pagination", (n) -> { this.setPagination(n.getObjectValue(Pagination::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the pagination property value. This type defines the pagination settings for a result set.
     * @return a {@link Pagination}
     */
    @jakarta.annotation.Nullable
    public Pagination getPagination() {
        return this.pagination;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("compatibilityDetails", this.getCompatibilityDetails());
        writer.writeObjectValue("pagination", this.getPagination());
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
     * Sets the compatibilityDetails property value. This container provides compatibility details for the specified product.
     * @param value Value to set for the compatibilityDetails property.
     */
    public void setCompatibilityDetails(@jakarta.annotation.Nullable final java.util.List<ProductResponseCompatibilityDetails> value) {
        this.compatibilityDetails = value;
    }
    /**
     * Sets the pagination property value. This type defines the pagination settings for a result set.
     * @param value Value to set for the pagination property.
     */
    public void setPagination(@jakarta.annotation.Nullable final Pagination value) {
        this.pagination = value;
    }
}

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

package com.ebay.listingmetadata.generated.catalog.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type identifies a product category and the aspects associated with that category. Each aspect distribution container returns the distribution of values that have been used for the aspect.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Refinement implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This array contains information about one or more aspects that are associated with the category identified by &lt;strong&gt;dominantCategoryId&lt;/strong&gt;.
     */
    private java.util.List<AspectDistribution> aspectDistributions;
    /**
     * The ID of the category that eBay determines is most likely to cover the products matching the search criteria.
     */
    private String dominantCategoryId;
    /**
     * Instantiates a new {@link Refinement} and sets the default values.
     */
    public Refinement() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Refinement}
     */
    @jakarta.annotation.Nonnull
    public static Refinement createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Refinement();
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
     * Gets the aspectDistributions property value. This array contains information about one or more aspects that are associated with the category identified by &lt;strong&gt;dominantCategoryId&lt;/strong&gt;.
     * @return a {@link java.util.List<AspectDistribution>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AspectDistribution> getAspectDistributions() {
        return this.aspectDistributions;
    }
    /**
     * Gets the dominantCategoryId property value. The ID of the category that eBay determines is most likely to cover the products matching the search criteria.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDominantCategoryId() {
        return this.dominantCategoryId;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("aspectDistributions", (n) -> { this.setAspectDistributions(n.getCollectionOfObjectValues(AspectDistribution::createFromDiscriminatorValue)); });
        deserializerMap.put("dominantCategoryId", (n) -> { this.setDominantCategoryId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("aspectDistributions", this.getAspectDistributions());
        writer.writeStringValue("dominantCategoryId", this.getDominantCategoryId());
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
     * Sets the aspectDistributions property value. This array contains information about one or more aspects that are associated with the category identified by &lt;strong&gt;dominantCategoryId&lt;/strong&gt;.
     * @param value Value to set for the aspectDistributions property.
     */
    public void setAspectDistributions(@jakarta.annotation.Nullable final java.util.List<AspectDistribution> value) {
        this.aspectDistributions = value;
    }
    /**
     * Sets the dominantCategoryId property value. The ID of the category that eBay determines is most likely to cover the products matching the search criteria.
     * @param value Value to set for the dominantCategoryId property.
     */
    public void setDominantCategoryId(@jakarta.annotation.Nullable final String value) {
        this.dominantCategoryId = value;
    }
}

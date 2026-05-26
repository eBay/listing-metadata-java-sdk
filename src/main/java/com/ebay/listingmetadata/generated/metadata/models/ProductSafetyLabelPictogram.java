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
 * A type that describes pictograms for product safety labels.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProductSafetyLabelPictogram implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The description of the pictogram localized to the default language of the marketplace. 
     */
    private String pictogramDescription;
    /**
     * The identifier of the pictogram.
     */
    private String pictogramId;
    /**
     * The URL of the pictogram.
     */
    private String pictogramUrl;
    /**
     * Instantiates a new {@link ProductSafetyLabelPictogram} and sets the default values.
     */
    public ProductSafetyLabelPictogram() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ProductSafetyLabelPictogram}
     */
    @jakarta.annotation.Nonnull
    public static ProductSafetyLabelPictogram createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProductSafetyLabelPictogram();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("pictogramDescription", (n) -> { this.setPictogramDescription(n.getStringValue()); });
        deserializerMap.put("pictogramId", (n) -> { this.setPictogramId(n.getStringValue()); });
        deserializerMap.put("pictogramUrl", (n) -> { this.setPictogramUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the pictogramDescription property value. The description of the pictogram localized to the default language of the marketplace. 
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPictogramDescription() {
        return this.pictogramDescription;
    }
    /**
     * Gets the pictogramId property value. The identifier of the pictogram.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPictogramId() {
        return this.pictogramId;
    }
    /**
     * Gets the pictogramUrl property value. The URL of the pictogram.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPictogramUrl() {
        return this.pictogramUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("pictogramDescription", this.getPictogramDescription());
        writer.writeStringValue("pictogramId", this.getPictogramId());
        writer.writeStringValue("pictogramUrl", this.getPictogramUrl());
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
     * Sets the pictogramDescription property value. The description of the pictogram localized to the default language of the marketplace. 
     * @param value Value to set for the pictogramDescription property.
     */
    public void setPictogramDescription(@jakarta.annotation.Nullable final String value) {
        this.pictogramDescription = value;
    }
    /**
     * Sets the pictogramId property value. The identifier of the pictogram.
     * @param value Value to set for the pictogramId property.
     */
    public void setPictogramId(@jakarta.annotation.Nullable final String value) {
        this.pictogramId = value;
    }
    /**
     * Sets the pictogramUrl property value. The URL of the pictogram.
     * @param value Value to set for the pictogramUrl property.
     */
    public void setPictogramUrl(@jakarta.annotation.Nullable final String value) {
        this.pictogramUrl = value;
    }
}

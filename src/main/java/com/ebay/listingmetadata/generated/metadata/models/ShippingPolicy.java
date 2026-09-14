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
 * This type contains applicable shipping policy metadata for the leaf categories returned for the marketplace.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ShippingPolicy implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The unique identifier of the eBay leaf category for which metadata is being returned.
     */
    private String categoryId;
    /**
     * The unique identifier of the category tree.
     */
    private String categoryTreeId;
    /**
     * Indicates if the Global Shipping Program (GSP) is supported for the category.
     */
    private Boolean globalShippingEnabled;
    /**
     * Returns the applicable max cap per shipping cost for shipping service group1.
     */
    private Amount group1MaxFlatShippingCost;
    /**
     * Returns the applicable max cap per shipping cost for shipping service group2.
     */
    private Amount group2MaxFlatShippingCost;
    /**
     * Returns the applicable max cap per shipping cost for shipping service group3.
     */
    private Amount group3MaxFlatShippingCost;
    /**
     * Indicates if a seller&apos;s stated handling time is enabled for a category. A handling time is generally needed for items that are shipped to the buyer, but not necessarily applicable to freight shipping or local pickup.
     */
    private Boolean handlingTimeEnabled;
    /**
     * The maximum cost the seller can charge for the first domestic flat-rate shipping service. Mutually exclusive with the GroupNMaxFlatShippingCost elements.
     */
    private Amount maxFlatShippingCost;
    /**
     * Indicates whether the category requires sellers to specify shipping details at listing time.
     */
    private Boolean shippingTermsRequired;
    /**
     * Instantiates a new {@link ShippingPolicy} and sets the default values.
     */
    public ShippingPolicy() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ShippingPolicy}
     */
    @jakarta.annotation.Nonnull
    public static ShippingPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ShippingPolicy();
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
     * Gets the categoryId property value. The unique identifier of the eBay leaf category for which metadata is being returned.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCategoryId() {
        return this.categoryId;
    }
    /**
     * Gets the categoryTreeId property value. The unique identifier of the category tree.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCategoryTreeId() {
        return this.categoryTreeId;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("categoryId", (n) -> { this.setCategoryId(n.getStringValue()); });
        deserializerMap.put("categoryTreeId", (n) -> { this.setCategoryTreeId(n.getStringValue()); });
        deserializerMap.put("globalShippingEnabled", (n) -> { this.setGlobalShippingEnabled(n.getBooleanValue()); });
        deserializerMap.put("group1MaxFlatShippingCost", (n) -> { this.setGroup1MaxFlatShippingCost(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("group2MaxFlatShippingCost", (n) -> { this.setGroup2MaxFlatShippingCost(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("group3MaxFlatShippingCost", (n) -> { this.setGroup3MaxFlatShippingCost(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("handlingTimeEnabled", (n) -> { this.setHandlingTimeEnabled(n.getBooleanValue()); });
        deserializerMap.put("maxFlatShippingCost", (n) -> { this.setMaxFlatShippingCost(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("shippingTermsRequired", (n) -> { this.setShippingTermsRequired(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the globalShippingEnabled property value. Indicates if the Global Shipping Program (GSP) is supported for the category.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getGlobalShippingEnabled() {
        return this.globalShippingEnabled;
    }
    /**
     * Gets the group1MaxFlatShippingCost property value. Returns the applicable max cap per shipping cost for shipping service group1.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getGroup1MaxFlatShippingCost() {
        return this.group1MaxFlatShippingCost;
    }
    /**
     * Gets the group2MaxFlatShippingCost property value. Returns the applicable max cap per shipping cost for shipping service group2.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getGroup2MaxFlatShippingCost() {
        return this.group2MaxFlatShippingCost;
    }
    /**
     * Gets the group3MaxFlatShippingCost property value. Returns the applicable max cap per shipping cost for shipping service group3.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getGroup3MaxFlatShippingCost() {
        return this.group3MaxFlatShippingCost;
    }
    /**
     * Gets the handlingTimeEnabled property value. Indicates if a seller&apos;s stated handling time is enabled for a category. A handling time is generally needed for items that are shipped to the buyer, but not necessarily applicable to freight shipping or local pickup.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getHandlingTimeEnabled() {
        return this.handlingTimeEnabled;
    }
    /**
     * Gets the maxFlatShippingCost property value. The maximum cost the seller can charge for the first domestic flat-rate shipping service. Mutually exclusive with the GroupNMaxFlatShippingCost elements.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getMaxFlatShippingCost() {
        return this.maxFlatShippingCost;
    }
    /**
     * Gets the shippingTermsRequired property value. Indicates whether the category requires sellers to specify shipping details at listing time.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getShippingTermsRequired() {
        return this.shippingTermsRequired;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("categoryId", this.getCategoryId());
        writer.writeStringValue("categoryTreeId", this.getCategoryTreeId());
        writer.writeBooleanValue("globalShippingEnabled", this.getGlobalShippingEnabled());
        writer.writeObjectValue("group1MaxFlatShippingCost", this.getGroup1MaxFlatShippingCost());
        writer.writeObjectValue("group2MaxFlatShippingCost", this.getGroup2MaxFlatShippingCost());
        writer.writeObjectValue("group3MaxFlatShippingCost", this.getGroup3MaxFlatShippingCost());
        writer.writeBooleanValue("handlingTimeEnabled", this.getHandlingTimeEnabled());
        writer.writeObjectValue("maxFlatShippingCost", this.getMaxFlatShippingCost());
        writer.writeBooleanValue("shippingTermsRequired", this.getShippingTermsRequired());
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
     * Sets the categoryId property value. The unique identifier of the eBay leaf category for which metadata is being returned.
     * @param value Value to set for the categoryId property.
     */
    public void setCategoryId(@jakarta.annotation.Nullable final String value) {
        this.categoryId = value;
    }
    /**
     * Sets the categoryTreeId property value. The unique identifier of the category tree.
     * @param value Value to set for the categoryTreeId property.
     */
    public void setCategoryTreeId(@jakarta.annotation.Nullable final String value) {
        this.categoryTreeId = value;
    }
    /**
     * Sets the globalShippingEnabled property value. Indicates if the Global Shipping Program (GSP) is supported for the category.
     * @param value Value to set for the globalShippingEnabled property.
     */
    public void setGlobalShippingEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.globalShippingEnabled = value;
    }
    /**
     * Sets the group1MaxFlatShippingCost property value. Returns the applicable max cap per shipping cost for shipping service group1.
     * @param value Value to set for the group1MaxFlatShippingCost property.
     */
    public void setGroup1MaxFlatShippingCost(@jakarta.annotation.Nullable final Amount value) {
        this.group1MaxFlatShippingCost = value;
    }
    /**
     * Sets the group2MaxFlatShippingCost property value. Returns the applicable max cap per shipping cost for shipping service group2.
     * @param value Value to set for the group2MaxFlatShippingCost property.
     */
    public void setGroup2MaxFlatShippingCost(@jakarta.annotation.Nullable final Amount value) {
        this.group2MaxFlatShippingCost = value;
    }
    /**
     * Sets the group3MaxFlatShippingCost property value. Returns the applicable max cap per shipping cost for shipping service group3.
     * @param value Value to set for the group3MaxFlatShippingCost property.
     */
    public void setGroup3MaxFlatShippingCost(@jakarta.annotation.Nullable final Amount value) {
        this.group3MaxFlatShippingCost = value;
    }
    /**
     * Sets the handlingTimeEnabled property value. Indicates if a seller&apos;s stated handling time is enabled for a category. A handling time is generally needed for items that are shipped to the buyer, but not necessarily applicable to freight shipping or local pickup.
     * @param value Value to set for the handlingTimeEnabled property.
     */
    public void setHandlingTimeEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.handlingTimeEnabled = value;
    }
    /**
     * Sets the maxFlatShippingCost property value. The maximum cost the seller can charge for the first domestic flat-rate shipping service. Mutually exclusive with the GroupNMaxFlatShippingCost elements.
     * @param value Value to set for the maxFlatShippingCost property.
     */
    public void setMaxFlatShippingCost(@jakarta.annotation.Nullable final Amount value) {
        this.maxFlatShippingCost = value;
    }
    /**
     * Sets the shippingTermsRequired property value. Indicates whether the category requires sellers to specify shipping details at listing time.
     * @param value Value to set for the shippingTermsRequired property.
     */
    public void setShippingTermsRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.shippingTermsRequired = value;
    }
}

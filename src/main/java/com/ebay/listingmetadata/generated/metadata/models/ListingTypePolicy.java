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
 * This type contains the policies governing the listing type by category.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ListingTypePolicy implements AdditionalDataHolder, Parsable {
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
     * A &lt;code&gt;true&lt;/code&gt; value in this field indicates that the leaf category supports the listing of items (such as gift cards) that can be delivered electronically via a download link or sent to a buyer&apos;s email address.
     */
    private Boolean digitalGoodDeliveryEnabled;
    /**
     * An array of eBay listing types and the supported durations for the corresponding leaf category. If a specific eBay listing type does not appear for a leaf category, it indicates that the category does not support that listing type.
     */
    private java.util.List<ListingDuration> listingDurations;
    /**
     * A true value in this field indicates that items listed in the category (specified in the &lt;b&gt;listingTypePolicies.categoryId&lt;/b&gt; field) may be enabled with the &apos;Click and Collect&apos; feature. With the &apos;Click and Collect&apos; feature, a buyer can purchase certain items on an eBay site and collect them at a local store. Buyers are notified by eBay once their items are available. A false value in this field indicates that items listed in the category are not eligible for the &apos;Click and Collect&apos; feature.
     */
    private Boolean pickupDropOffEnabled;
    /**
     * Instantiates a new {@link ListingTypePolicy} and sets the default values.
     */
    public ListingTypePolicy() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ListingTypePolicy}
     */
    @jakarta.annotation.Nonnull
    public static ListingTypePolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ListingTypePolicy();
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
     * Gets the digitalGoodDeliveryEnabled property value. A &lt;code&gt;true&lt;/code&gt; value in this field indicates that the leaf category supports the listing of items (such as gift cards) that can be delivered electronically via a download link or sent to a buyer&apos;s email address.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getDigitalGoodDeliveryEnabled() {
        return this.digitalGoodDeliveryEnabled;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("categoryId", (n) -> { this.setCategoryId(n.getStringValue()); });
        deserializerMap.put("categoryTreeId", (n) -> { this.setCategoryTreeId(n.getStringValue()); });
        deserializerMap.put("digitalGoodDeliveryEnabled", (n) -> { this.setDigitalGoodDeliveryEnabled(n.getBooleanValue()); });
        deserializerMap.put("listingDurations", (n) -> { this.setListingDurations(n.getCollectionOfObjectValues(ListingDuration::createFromDiscriminatorValue)); });
        deserializerMap.put("pickupDropOffEnabled", (n) -> { this.setPickupDropOffEnabled(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the listingDurations property value. An array of eBay listing types and the supported durations for the corresponding leaf category. If a specific eBay listing type does not appear for a leaf category, it indicates that the category does not support that listing type.
     * @return a {@link java.util.List<ListingDuration>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ListingDuration> getListingDurations() {
        return this.listingDurations;
    }
    /**
     * Gets the pickupDropOffEnabled property value. A true value in this field indicates that items listed in the category (specified in the &lt;b&gt;listingTypePolicies.categoryId&lt;/b&gt; field) may be enabled with the &apos;Click and Collect&apos; feature. With the &apos;Click and Collect&apos; feature, a buyer can purchase certain items on an eBay site and collect them at a local store. Buyers are notified by eBay once their items are available. A false value in this field indicates that items listed in the category are not eligible for the &apos;Click and Collect&apos; feature.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getPickupDropOffEnabled() {
        return this.pickupDropOffEnabled;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("categoryId", this.getCategoryId());
        writer.writeStringValue("categoryTreeId", this.getCategoryTreeId());
        writer.writeBooleanValue("digitalGoodDeliveryEnabled", this.getDigitalGoodDeliveryEnabled());
        writer.writeCollectionOfObjectValues("listingDurations", this.getListingDurations());
        writer.writeBooleanValue("pickupDropOffEnabled", this.getPickupDropOffEnabled());
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
     * Sets the digitalGoodDeliveryEnabled property value. A &lt;code&gt;true&lt;/code&gt; value in this field indicates that the leaf category supports the listing of items (such as gift cards) that can be delivered electronically via a download link or sent to a buyer&apos;s email address.
     * @param value Value to set for the digitalGoodDeliveryEnabled property.
     */
    public void setDigitalGoodDeliveryEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.digitalGoodDeliveryEnabled = value;
    }
    /**
     * Sets the listingDurations property value. An array of eBay listing types and the supported durations for the corresponding leaf category. If a specific eBay listing type does not appear for a leaf category, it indicates that the category does not support that listing type.
     * @param value Value to set for the listingDurations property.
     */
    public void setListingDurations(@jakarta.annotation.Nullable final java.util.List<ListingDuration> value) {
        this.listingDurations = value;
    }
    /**
     * Sets the pickupDropOffEnabled property value. A true value in this field indicates that items listed in the category (specified in the &lt;b&gt;listingTypePolicies.categoryId&lt;/b&gt; field) may be enabled with the &apos;Click and Collect&apos; feature. With the &apos;Click and Collect&apos; feature, a buyer can purchase certain items on an eBay site and collect them at a local store. Buyers are notified by eBay once their items are available. A false value in this field indicates that items listed in the category are not eligible for the &apos;Click and Collect&apos; feature.
     * @param value Value to set for the pickupDropOffEnabled property.
     */
    public void setPickupDropOffEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.pickupDropOffEnabled = value;
    }
}

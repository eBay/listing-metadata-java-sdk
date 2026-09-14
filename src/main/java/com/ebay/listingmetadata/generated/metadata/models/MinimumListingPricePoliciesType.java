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
 * This type defines the minimum starting prices for the supported types of eBay listings
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MinimumListingPricePoliciesType implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The description of the listing type for which the pricing data is intended, such as &quot;Pricing for the auction-like listings&quot;.
     */
    private String description;
    /**
     * This enum value indicates the listing type for which minimum starting price policies are being returned.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The only applicable values for this method are &lt;code&gt;AUCTION&lt;/code&gt; and &lt;code&gt;FIXED_PRICE_ITEM&lt;/code&gt;.&lt;/span&gt;
     */
    private ListingTypeEnum listingType;
    /**
     * The minimum percentage value that a Buy It Now price for an auction listing must be above the starting bid price for the same listing.&lt;br&gt;&lt;br&gt;This field is only returned and applicable for auction listings.
     */
    private String minBuyItNowPricePercent;
    /**
     * For auction listings, this field indicates the lowest dollar value that can be set for the item&apos;s starting bid.&lt;br&gt;&lt;br&gt;For fixed-price listings, this field indicates the lower dollar value that can be set for the item&apos;s sale price.
     */
    private Amount startPrice;
    /**
     * Instantiates a new {@link MinimumListingPricePoliciesType} and sets the default values.
     */
    public MinimumListingPricePoliciesType() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MinimumListingPricePoliciesType}
     */
    @jakarta.annotation.Nonnull
    public static MinimumListingPricePoliciesType createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MinimumListingPricePoliciesType();
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
     * Gets the description property value. The description of the listing type for which the pricing data is intended, such as &quot;Pricing for the auction-like listings&quot;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("listingType", (n) -> { this.setListingType(n.getEnumValue(ListingTypeEnum::forValue)); });
        deserializerMap.put("minBuyItNowPricePercent", (n) -> { this.setMinBuyItNowPricePercent(n.getStringValue()); });
        deserializerMap.put("startPrice", (n) -> { this.setStartPrice(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the listingType property value. This enum value indicates the listing type for which minimum starting price policies are being returned.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The only applicable values for this method are &lt;code&gt;AUCTION&lt;/code&gt; and &lt;code&gt;FIXED_PRICE_ITEM&lt;/code&gt;.&lt;/span&gt;
     * @return a {@link ListingTypeEnum}
     */
    @jakarta.annotation.Nullable
    public ListingTypeEnum getListingType() {
        return this.listingType;
    }
    /**
     * Gets the minBuyItNowPricePercent property value. The minimum percentage value that a Buy It Now price for an auction listing must be above the starting bid price for the same listing.&lt;br&gt;&lt;br&gt;This field is only returned and applicable for auction listings.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMinBuyItNowPricePercent() {
        return this.minBuyItNowPricePercent;
    }
    /**
     * Gets the startPrice property value. For auction listings, this field indicates the lowest dollar value that can be set for the item&apos;s starting bid.&lt;br&gt;&lt;br&gt;For fixed-price listings, this field indicates the lower dollar value that can be set for the item&apos;s sale price.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getStartPrice() {
        return this.startPrice;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeEnumValue("listingType", this.getListingType());
        writer.writeStringValue("minBuyItNowPricePercent", this.getMinBuyItNowPricePercent());
        writer.writeObjectValue("startPrice", this.getStartPrice());
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
     * Sets the description property value. The description of the listing type for which the pricing data is intended, such as &quot;Pricing for the auction-like listings&quot;.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the listingType property value. This enum value indicates the listing type for which minimum starting price policies are being returned.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The only applicable values for this method are &lt;code&gt;AUCTION&lt;/code&gt; and &lt;code&gt;FIXED_PRICE_ITEM&lt;/code&gt;.&lt;/span&gt;
     * @param value Value to set for the listingType property.
     */
    public void setListingType(@jakarta.annotation.Nullable final ListingTypeEnum value) {
        this.listingType = value;
    }
    /**
     * Sets the minBuyItNowPricePercent property value. The minimum percentage value that a Buy It Now price for an auction listing must be above the starting bid price for the same listing.&lt;br&gt;&lt;br&gt;This field is only returned and applicable for auction listings.
     * @param value Value to set for the minBuyItNowPricePercent property.
     */
    public void setMinBuyItNowPricePercent(@jakarta.annotation.Nullable final String value) {
        this.minBuyItNowPricePercent = value;
    }
    /**
     * Sets the startPrice property value. For auction listings, this field indicates the lowest dollar value that can be set for the item&apos;s starting bid.&lt;br&gt;&lt;br&gt;For fixed-price listings, this field indicates the lower dollar value that can be set for the item&apos;s sale price.
     * @param value Value to set for the startPrice property.
     */
    public void setStartPrice(@jakarta.annotation.Nullable final Amount value) {
        this.startPrice = value;
    }
}

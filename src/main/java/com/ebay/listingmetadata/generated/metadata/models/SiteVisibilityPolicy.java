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
 * A type that contains eBay international cross border trade policy metadata fields.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SiteVisibilityPolicy implements AdditionalDataHolder, Parsable {
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
     * If &lt;code&gt;true&lt;/code&gt;, the category supports specifying that listings of a seller on the UK marketplace can pass in Australia as a value in a &lt;CrossBorderTrade&gt; field to expose that item on the eBay Australia site (ebay.com.au). For more information, see &lt;a href=&quot;/api-docs/user-guides/static/trading-user-guide/cross-border-trading.html&quot;  target=&quot;_blank&quot;&gt;Cross-border trading&lt;/a&gt;.
     */
    private Boolean crossBorderTradeAustraliaEnabled;
    /**
     * If &lt;code&gt;true&lt;/code&gt;, the category supports specifying that listings of a seller on the US or Canada marketplaces can pass in UK as a value in a &lt;CrossBorderTrade&gt; field to expose that item on the eBay UK (ebay.co.uk) and eBay IE (ebay.ie) sites. For more information, see &lt;a href=&quot;/api-docs/user-guides/static/trading-user-guide/cross-border-trading.html&quot;  target=&quot;_blank&quot;&gt;Cross-border trading&lt;/a&gt;.
     */
    private Boolean crossBorderTradeGBEnabled;
    /**
     * If &lt;code&gt;true&lt;/code&gt;, the category supports specifying that listings of a seller on the US or Canada marketplaces can pass in North America as a value in a &lt;CrossBorderTrade&gt; field to expose that item on the eBay US (ebay.com) and eBay Canada (ebay.ca) sites (English). For more information, see &lt;a href=&quot;/api-docs/user-guides/static/trading-user-guide/cross-border-trading.html&quot;  target=&quot;_blank&quot;&gt;Cross-border trading&lt;/a&gt;. 
     */
    private Boolean crossBorderTradeNorthAmericaEnabled;
    /**
     * Instantiates a new {@link SiteVisibilityPolicy} and sets the default values.
     */
    public SiteVisibilityPolicy() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SiteVisibilityPolicy}
     */
    @jakarta.annotation.Nonnull
    public static SiteVisibilityPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SiteVisibilityPolicy();
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
     * Gets the crossBorderTradeAustraliaEnabled property value. If &lt;code&gt;true&lt;/code&gt;, the category supports specifying that listings of a seller on the UK marketplace can pass in Australia as a value in a &lt;CrossBorderTrade&gt; field to expose that item on the eBay Australia site (ebay.com.au). For more information, see &lt;a href=&quot;/api-docs/user-guides/static/trading-user-guide/cross-border-trading.html&quot;  target=&quot;_blank&quot;&gt;Cross-border trading&lt;/a&gt;.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getCrossBorderTradeAustraliaEnabled() {
        return this.crossBorderTradeAustraliaEnabled;
    }
    /**
     * Gets the crossBorderTradeGBEnabled property value. If &lt;code&gt;true&lt;/code&gt;, the category supports specifying that listings of a seller on the US or Canada marketplaces can pass in UK as a value in a &lt;CrossBorderTrade&gt; field to expose that item on the eBay UK (ebay.co.uk) and eBay IE (ebay.ie) sites. For more information, see &lt;a href=&quot;/api-docs/user-guides/static/trading-user-guide/cross-border-trading.html&quot;  target=&quot;_blank&quot;&gt;Cross-border trading&lt;/a&gt;.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getCrossBorderTradeGBEnabled() {
        return this.crossBorderTradeGBEnabled;
    }
    /**
     * Gets the crossBorderTradeNorthAmericaEnabled property value. If &lt;code&gt;true&lt;/code&gt;, the category supports specifying that listings of a seller on the US or Canada marketplaces can pass in North America as a value in a &lt;CrossBorderTrade&gt; field to expose that item on the eBay US (ebay.com) and eBay Canada (ebay.ca) sites (English). For more information, see &lt;a href=&quot;/api-docs/user-guides/static/trading-user-guide/cross-border-trading.html&quot;  target=&quot;_blank&quot;&gt;Cross-border trading&lt;/a&gt;. 
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getCrossBorderTradeNorthAmericaEnabled() {
        return this.crossBorderTradeNorthAmericaEnabled;
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
        deserializerMap.put("crossBorderTradeAustraliaEnabled", (n) -> { this.setCrossBorderTradeAustraliaEnabled(n.getBooleanValue()); });
        deserializerMap.put("crossBorderTradeGBEnabled", (n) -> { this.setCrossBorderTradeGBEnabled(n.getBooleanValue()); });
        deserializerMap.put("crossBorderTradeNorthAmericaEnabled", (n) -> { this.setCrossBorderTradeNorthAmericaEnabled(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("categoryId", this.getCategoryId());
        writer.writeStringValue("categoryTreeId", this.getCategoryTreeId());
        writer.writeBooleanValue("crossBorderTradeAustraliaEnabled", this.getCrossBorderTradeAustraliaEnabled());
        writer.writeBooleanValue("crossBorderTradeGBEnabled", this.getCrossBorderTradeGBEnabled());
        writer.writeBooleanValue("crossBorderTradeNorthAmericaEnabled", this.getCrossBorderTradeNorthAmericaEnabled());
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
     * Sets the crossBorderTradeAustraliaEnabled property value. If &lt;code&gt;true&lt;/code&gt;, the category supports specifying that listings of a seller on the UK marketplace can pass in Australia as a value in a &lt;CrossBorderTrade&gt; field to expose that item on the eBay Australia site (ebay.com.au). For more information, see &lt;a href=&quot;/api-docs/user-guides/static/trading-user-guide/cross-border-trading.html&quot;  target=&quot;_blank&quot;&gt;Cross-border trading&lt;/a&gt;.
     * @param value Value to set for the crossBorderTradeAustraliaEnabled property.
     */
    public void setCrossBorderTradeAustraliaEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.crossBorderTradeAustraliaEnabled = value;
    }
    /**
     * Sets the crossBorderTradeGBEnabled property value. If &lt;code&gt;true&lt;/code&gt;, the category supports specifying that listings of a seller on the US or Canada marketplaces can pass in UK as a value in a &lt;CrossBorderTrade&gt; field to expose that item on the eBay UK (ebay.co.uk) and eBay IE (ebay.ie) sites. For more information, see &lt;a href=&quot;/api-docs/user-guides/static/trading-user-guide/cross-border-trading.html&quot;  target=&quot;_blank&quot;&gt;Cross-border trading&lt;/a&gt;.
     * @param value Value to set for the crossBorderTradeGBEnabled property.
     */
    public void setCrossBorderTradeGBEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.crossBorderTradeGBEnabled = value;
    }
    /**
     * Sets the crossBorderTradeNorthAmericaEnabled property value. If &lt;code&gt;true&lt;/code&gt;, the category supports specifying that listings of a seller on the US or Canada marketplaces can pass in North America as a value in a &lt;CrossBorderTrade&gt; field to expose that item on the eBay US (ebay.com) and eBay Canada (ebay.ca) sites (English). For more information, see &lt;a href=&quot;/api-docs/user-guides/static/trading-user-guide/cross-border-trading.html&quot;  target=&quot;_blank&quot;&gt;Cross-border trading&lt;/a&gt;. 
     * @param value Value to set for the crossBorderTradeNorthAmericaEnabled property.
     */
    public void setCrossBorderTradeNorthAmericaEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.crossBorderTradeNorthAmericaEnabled = value;
    }
}

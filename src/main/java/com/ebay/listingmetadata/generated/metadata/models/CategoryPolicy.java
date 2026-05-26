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
 * This type contains applicable policy metadata for the leaf categories returned for the marketplace.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CategoryPolicy implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * If this field is returned as &lt;code&gt;true&lt;/code&gt;, the corresponding category supports immediate payment for listings. The immediate payment feature is applicable to fixed-price listings, to auction listings with the &apos;Buy It Now&apos; option enabled, and for a motor vehicle listing that requires an initial deposit. If the immediate payment feature is enabled for a listing, the buyer must pay immediately after clicking the &apos;Buy it Now&apos; button. &lt;p&gt;This field is only returned when &lt;code&gt;true&lt;/code&gt; (not returned when false).&lt;/p&gt;
     */
    private Boolean autoPayEnabled;
    /**
     * If this field is returned as &lt;code&gt;true&lt;/code&gt;, the corresponding category supports business-to-business (B2B) VAT listings. If this field is not present, the category does not have B2B VAT listings. This feature is applicable to the eBay Germany (DE), Austria (AT), and Switzerland (CH) sites only.&lt;p&gt;This field is only returned when &lt;code&gt;true&lt;/code&gt; (not returned when false).&lt;/p&gt;
     */
    private Boolean b2bVatEnabled;
    /**
     * The unique identifier of the eBay leaf category for which metadata is being returned.
     */
    private String categoryId;
    /**
     * The unique identifier of the category tree.
     */
    private String categoryTreeId;
    /**
     * This enumerated value indicates whether or not European Article Numbers (EANs) are supported/required when listing products in the category. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:ProductIdentiferEnabledEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String eanSupport;
    /**
     * If this field is returned as &lt;code&gt;true&lt;/code&gt;, the corresponding category is no longer a valid eBay category on the site, and items may not be listed in this category. You can use the &lt;a href=&quot;/api-docs/sell/taxonomy/resources/category_tree/methods/getExpiredCategories&quot; target=&quot;_blank&quot;&gt;getExpiredCategories&lt;/a&gt; method (of the &lt;b&gt;Taxonomy API&lt;/b&gt;) to find the leaf category that replaced the expired category. &lt;p&gt;This field is only returned when &lt;code&gt;true&lt;/code&gt; (not returned when false).&lt;/p&gt;
     */
    private Boolean expired;
    /**
     * If this field is returned as &lt;code&gt;true&lt;/code&gt;, the category supports the listing of intangible goods or services.
     */
    private Boolean intangibleEnabled;
    /**
     * This enumerated value indicates whether or not International Standard Book Numbers (ISBNs) are supported/required when listing products in the specified category. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:ProductIdentiferEnabledEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String isbnSupport;
    /**
     * If this field (Lot Size Disabled) is returned as &lt;code&gt;true&lt;/code&gt;, the corresponding category does not support lot listings. A lot listing is a listing that features multiple related items that must be purchased by one buyer in one transaction. &lt;p&gt;This field is only returned when &lt;code&gt;true&lt;/code&gt; (not returned when false).&lt;/p&gt;
     */
    private Boolean lsd;
    /**
     * Indicates the Minimum Reserve Price for an auction listing in this category. If there is no Minimum Reserve Price, a value of &lt;code&gt;0.0&lt;/code&gt; is returned in this field.
     */
    private Double minimumReservePrice;
    /**
     * This field (Override Reserve Price Allowed) is returned as &lt;code&gt;true&lt;/code&gt; if the eBay marketplace&apos;s default policy is to allow reserve prices for auction listings, but the corresponding category does not allow a reserve price. &lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;This field is not returned if the marketplace does not permit reserve prices.&lt;/span&gt;&lt;/p&gt;
     */
    private Boolean orpa;
    /**
     * If this field (Override Reduce Reserve Allowed) is returned as &lt;code&gt;true&lt;/code&gt;, the seller can reduce or remove a reserve price that had already been reduced for an active auction listing.
     */
    private Boolean orra;
    /**
     * An array that indicates the acceptable offline payment methods that can be used when listing an item for sale in the corresponding category.
     */
    private java.util.List<String> paymentMethods;
    /**
     * If this field (Reduce Reserve Allowed) is &lt;code&gt;true&lt;/code&gt;, the corresponding leaf category allows the seller to reduce an item&apos;s reserve price. If false, this field is not returned in the response and the corresponding leaf category on the site do not normally allow sellers to reduce an item&apos;s reserve price.&lt;p&gt;This field is only returned when &lt;code&gt;true&lt;/code&gt; (not returned when false).&lt;/p&gt;
     */
    private Boolean reduceReserveAllowed;
    /**
     * This field indicates whether reserve prices are allowed for auction listings in this category. This field returns as &lt;code&gt;true&lt;/code&gt; when the category supports reserve prices, or &lt;code&gt;false&lt;/code&gt; if the eBay marketplace does not permit reserve prices or the category override blocks reserve prices (&lt;b&gt;orpa&lt;/b&gt; is &lt;code&gt;true&lt;/code&gt;).
     */
    private Boolean reservePriceAllowed;
    /**
     * This enumerated value indicates whether or not the category on the specified eBay site supports the use of Universal Product Codes (UPCs) to help create a listing. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:ProductIdentiferEnabledEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String upcSupport;
    /**
     * When returned as &lt;code&gt;true&lt;/code&gt;, this boolean indicates that the leaf category for the specified site is designated by eBay as a value category. Value categories can be used as a secondary category for a listing at no extra charge.
     */
    private Boolean valueCategory;
    /**
     * If this field is returned as &lt;code&gt;true&lt;/code&gt;, the corresponding category is an eBay virtual category, a category in which items may not be listed.&lt;p&gt;This field is only returned when &lt;code&gt;true&lt;/code&gt; (not returned when false).&lt;/p&gt;
     */
    private Boolean virtual;
    /**
     * Instantiates a new {@link CategoryPolicy} and sets the default values.
     */
    public CategoryPolicy() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CategoryPolicy}
     */
    @jakarta.annotation.Nonnull
    public static CategoryPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CategoryPolicy();
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
     * Gets the autoPayEnabled property value. If this field is returned as &lt;code&gt;true&lt;/code&gt;, the corresponding category supports immediate payment for listings. The immediate payment feature is applicable to fixed-price listings, to auction listings with the &apos;Buy It Now&apos; option enabled, and for a motor vehicle listing that requires an initial deposit. If the immediate payment feature is enabled for a listing, the buyer must pay immediately after clicking the &apos;Buy it Now&apos; button. &lt;p&gt;This field is only returned when &lt;code&gt;true&lt;/code&gt; (not returned when false).&lt;/p&gt;
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAutoPayEnabled() {
        return this.autoPayEnabled;
    }
    /**
     * Gets the b2bVatEnabled property value. If this field is returned as &lt;code&gt;true&lt;/code&gt;, the corresponding category supports business-to-business (B2B) VAT listings. If this field is not present, the category does not have B2B VAT listings. This feature is applicable to the eBay Germany (DE), Austria (AT), and Switzerland (CH) sites only.&lt;p&gt;This field is only returned when &lt;code&gt;true&lt;/code&gt; (not returned when false).&lt;/p&gt;
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getB2bVatEnabled() {
        return this.b2bVatEnabled;
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
     * Gets the eanSupport property value. This enumerated value indicates whether or not European Article Numbers (EANs) are supported/required when listing products in the category. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:ProductIdentiferEnabledEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEanSupport() {
        return this.eanSupport;
    }
    /**
     * Gets the expired property value. If this field is returned as &lt;code&gt;true&lt;/code&gt;, the corresponding category is no longer a valid eBay category on the site, and items may not be listed in this category. You can use the &lt;a href=&quot;/api-docs/sell/taxonomy/resources/category_tree/methods/getExpiredCategories&quot; target=&quot;_blank&quot;&gt;getExpiredCategories&lt;/a&gt; method (of the &lt;b&gt;Taxonomy API&lt;/b&gt;) to find the leaf category that replaced the expired category. &lt;p&gt;This field is only returned when &lt;code&gt;true&lt;/code&gt; (not returned when false).&lt;/p&gt;
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getExpired() {
        return this.expired;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(18);
        deserializerMap.put("autoPayEnabled", (n) -> { this.setAutoPayEnabled(n.getBooleanValue()); });
        deserializerMap.put("b2bVatEnabled", (n) -> { this.setB2bVatEnabled(n.getBooleanValue()); });
        deserializerMap.put("categoryId", (n) -> { this.setCategoryId(n.getStringValue()); });
        deserializerMap.put("categoryTreeId", (n) -> { this.setCategoryTreeId(n.getStringValue()); });
        deserializerMap.put("eanSupport", (n) -> { this.setEanSupport(n.getStringValue()); });
        deserializerMap.put("expired", (n) -> { this.setExpired(n.getBooleanValue()); });
        deserializerMap.put("intangibleEnabled", (n) -> { this.setIntangibleEnabled(n.getBooleanValue()); });
        deserializerMap.put("isbnSupport", (n) -> { this.setIsbnSupport(n.getStringValue()); });
        deserializerMap.put("lsd", (n) -> { this.setLsd(n.getBooleanValue()); });
        deserializerMap.put("minimumReservePrice", (n) -> { this.setMinimumReservePrice(n.getDoubleValue()); });
        deserializerMap.put("orpa", (n) -> { this.setOrpa(n.getBooleanValue()); });
        deserializerMap.put("orra", (n) -> { this.setOrra(n.getBooleanValue()); });
        deserializerMap.put("paymentMethods", (n) -> { this.setPaymentMethods(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("reduceReserveAllowed", (n) -> { this.setReduceReserveAllowed(n.getBooleanValue()); });
        deserializerMap.put("reservePriceAllowed", (n) -> { this.setReservePriceAllowed(n.getBooleanValue()); });
        deserializerMap.put("upcSupport", (n) -> { this.setUpcSupport(n.getStringValue()); });
        deserializerMap.put("valueCategory", (n) -> { this.setValueCategory(n.getBooleanValue()); });
        deserializerMap.put("virtual", (n) -> { this.setVirtual(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the intangibleEnabled property value. If this field is returned as &lt;code&gt;true&lt;/code&gt;, the category supports the listing of intangible goods or services.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIntangibleEnabled() {
        return this.intangibleEnabled;
    }
    /**
     * Gets the isbnSupport property value. This enumerated value indicates whether or not International Standard Book Numbers (ISBNs) are supported/required when listing products in the specified category. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:ProductIdentiferEnabledEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIsbnSupport() {
        return this.isbnSupport;
    }
    /**
     * Gets the lsd property value. If this field (Lot Size Disabled) is returned as &lt;code&gt;true&lt;/code&gt;, the corresponding category does not support lot listings. A lot listing is a listing that features multiple related items that must be purchased by one buyer in one transaction. &lt;p&gt;This field is only returned when &lt;code&gt;true&lt;/code&gt; (not returned when false).&lt;/p&gt;
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getLsd() {
        return this.lsd;
    }
    /**
     * Gets the minimumReservePrice property value. Indicates the Minimum Reserve Price for an auction listing in this category. If there is no Minimum Reserve Price, a value of &lt;code&gt;0.0&lt;/code&gt; is returned in this field.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getMinimumReservePrice() {
        return this.minimumReservePrice;
    }
    /**
     * Gets the orpa property value. This field (Override Reserve Price Allowed) is returned as &lt;code&gt;true&lt;/code&gt; if the eBay marketplace&apos;s default policy is to allow reserve prices for auction listings, but the corresponding category does not allow a reserve price. &lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;This field is not returned if the marketplace does not permit reserve prices.&lt;/span&gt;&lt;/p&gt;
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getOrpa() {
        return this.orpa;
    }
    /**
     * Gets the orra property value. If this field (Override Reduce Reserve Allowed) is returned as &lt;code&gt;true&lt;/code&gt;, the seller can reduce or remove a reserve price that had already been reduced for an active auction listing.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getOrra() {
        return this.orra;
    }
    /**
     * Gets the paymentMethods property value. An array that indicates the acceptable offline payment methods that can be used when listing an item for sale in the corresponding category.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getPaymentMethods() {
        return this.paymentMethods;
    }
    /**
     * Gets the reduceReserveAllowed property value. If this field (Reduce Reserve Allowed) is &lt;code&gt;true&lt;/code&gt;, the corresponding leaf category allows the seller to reduce an item&apos;s reserve price. If false, this field is not returned in the response and the corresponding leaf category on the site do not normally allow sellers to reduce an item&apos;s reserve price.&lt;p&gt;This field is only returned when &lt;code&gt;true&lt;/code&gt; (not returned when false).&lt;/p&gt;
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getReduceReserveAllowed() {
        return this.reduceReserveAllowed;
    }
    /**
     * Gets the reservePriceAllowed property value. This field indicates whether reserve prices are allowed for auction listings in this category. This field returns as &lt;code&gt;true&lt;/code&gt; when the category supports reserve prices, or &lt;code&gt;false&lt;/code&gt; if the eBay marketplace does not permit reserve prices or the category override blocks reserve prices (&lt;b&gt;orpa&lt;/b&gt; is &lt;code&gt;true&lt;/code&gt;).
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getReservePriceAllowed() {
        return this.reservePriceAllowed;
    }
    /**
     * Gets the upcSupport property value. This enumerated value indicates whether or not the category on the specified eBay site supports the use of Universal Product Codes (UPCs) to help create a listing. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:ProductIdentiferEnabledEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUpcSupport() {
        return this.upcSupport;
    }
    /**
     * Gets the valueCategory property value. When returned as &lt;code&gt;true&lt;/code&gt;, this boolean indicates that the leaf category for the specified site is designated by eBay as a value category. Value categories can be used as a secondary category for a listing at no extra charge.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getValueCategory() {
        return this.valueCategory;
    }
    /**
     * Gets the virtual property value. If this field is returned as &lt;code&gt;true&lt;/code&gt;, the corresponding category is an eBay virtual category, a category in which items may not be listed.&lt;p&gt;This field is only returned when &lt;code&gt;true&lt;/code&gt; (not returned when false).&lt;/p&gt;
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getVirtual() {
        return this.virtual;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("autoPayEnabled", this.getAutoPayEnabled());
        writer.writeBooleanValue("b2bVatEnabled", this.getB2bVatEnabled());
        writer.writeStringValue("categoryId", this.getCategoryId());
        writer.writeStringValue("categoryTreeId", this.getCategoryTreeId());
        writer.writeStringValue("eanSupport", this.getEanSupport());
        writer.writeBooleanValue("expired", this.getExpired());
        writer.writeBooleanValue("intangibleEnabled", this.getIntangibleEnabled());
        writer.writeStringValue("isbnSupport", this.getIsbnSupport());
        writer.writeBooleanValue("lsd", this.getLsd());
        writer.writeDoubleValue("minimumReservePrice", this.getMinimumReservePrice());
        writer.writeBooleanValue("orpa", this.getOrpa());
        writer.writeBooleanValue("orra", this.getOrra());
        writer.writeCollectionOfPrimitiveValues("paymentMethods", this.getPaymentMethods());
        writer.writeBooleanValue("reduceReserveAllowed", this.getReduceReserveAllowed());
        writer.writeBooleanValue("reservePriceAllowed", this.getReservePriceAllowed());
        writer.writeStringValue("upcSupport", this.getUpcSupport());
        writer.writeBooleanValue("valueCategory", this.getValueCategory());
        writer.writeBooleanValue("virtual", this.getVirtual());
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
     * Sets the autoPayEnabled property value. If this field is returned as &lt;code&gt;true&lt;/code&gt;, the corresponding category supports immediate payment for listings. The immediate payment feature is applicable to fixed-price listings, to auction listings with the &apos;Buy It Now&apos; option enabled, and for a motor vehicle listing that requires an initial deposit. If the immediate payment feature is enabled for a listing, the buyer must pay immediately after clicking the &apos;Buy it Now&apos; button. &lt;p&gt;This field is only returned when &lt;code&gt;true&lt;/code&gt; (not returned when false).&lt;/p&gt;
     * @param value Value to set for the autoPayEnabled property.
     */
    public void setAutoPayEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.autoPayEnabled = value;
    }
    /**
     * Sets the b2bVatEnabled property value. If this field is returned as &lt;code&gt;true&lt;/code&gt;, the corresponding category supports business-to-business (B2B) VAT listings. If this field is not present, the category does not have B2B VAT listings. This feature is applicable to the eBay Germany (DE), Austria (AT), and Switzerland (CH) sites only.&lt;p&gt;This field is only returned when &lt;code&gt;true&lt;/code&gt; (not returned when false).&lt;/p&gt;
     * @param value Value to set for the b2bVatEnabled property.
     */
    public void setB2bVatEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.b2bVatEnabled = value;
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
     * Sets the eanSupport property value. This enumerated value indicates whether or not European Article Numbers (EANs) are supported/required when listing products in the category. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:ProductIdentiferEnabledEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the eanSupport property.
     */
    public void setEanSupport(@jakarta.annotation.Nullable final String value) {
        this.eanSupport = value;
    }
    /**
     * Sets the expired property value. If this field is returned as &lt;code&gt;true&lt;/code&gt;, the corresponding category is no longer a valid eBay category on the site, and items may not be listed in this category. You can use the &lt;a href=&quot;/api-docs/sell/taxonomy/resources/category_tree/methods/getExpiredCategories&quot; target=&quot;_blank&quot;&gt;getExpiredCategories&lt;/a&gt; method (of the &lt;b&gt;Taxonomy API&lt;/b&gt;) to find the leaf category that replaced the expired category. &lt;p&gt;This field is only returned when &lt;code&gt;true&lt;/code&gt; (not returned when false).&lt;/p&gt;
     * @param value Value to set for the expired property.
     */
    public void setExpired(@jakarta.annotation.Nullable final Boolean value) {
        this.expired = value;
    }
    /**
     * Sets the intangibleEnabled property value. If this field is returned as &lt;code&gt;true&lt;/code&gt;, the category supports the listing of intangible goods or services.
     * @param value Value to set for the intangibleEnabled property.
     */
    public void setIntangibleEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.intangibleEnabled = value;
    }
    /**
     * Sets the isbnSupport property value. This enumerated value indicates whether or not International Standard Book Numbers (ISBNs) are supported/required when listing products in the specified category. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:ProductIdentiferEnabledEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the isbnSupport property.
     */
    public void setIsbnSupport(@jakarta.annotation.Nullable final String value) {
        this.isbnSupport = value;
    }
    /**
     * Sets the lsd property value. If this field (Lot Size Disabled) is returned as &lt;code&gt;true&lt;/code&gt;, the corresponding category does not support lot listings. A lot listing is a listing that features multiple related items that must be purchased by one buyer in one transaction. &lt;p&gt;This field is only returned when &lt;code&gt;true&lt;/code&gt; (not returned when false).&lt;/p&gt;
     * @param value Value to set for the lsd property.
     */
    public void setLsd(@jakarta.annotation.Nullable final Boolean value) {
        this.lsd = value;
    }
    /**
     * Sets the minimumReservePrice property value. Indicates the Minimum Reserve Price for an auction listing in this category. If there is no Minimum Reserve Price, a value of &lt;code&gt;0.0&lt;/code&gt; is returned in this field.
     * @param value Value to set for the minimumReservePrice property.
     */
    public void setMinimumReservePrice(@jakarta.annotation.Nullable final Double value) {
        this.minimumReservePrice = value;
    }
    /**
     * Sets the orpa property value. This field (Override Reserve Price Allowed) is returned as &lt;code&gt;true&lt;/code&gt; if the eBay marketplace&apos;s default policy is to allow reserve prices for auction listings, but the corresponding category does not allow a reserve price. &lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;This field is not returned if the marketplace does not permit reserve prices.&lt;/span&gt;&lt;/p&gt;
     * @param value Value to set for the orpa property.
     */
    public void setOrpa(@jakarta.annotation.Nullable final Boolean value) {
        this.orpa = value;
    }
    /**
     * Sets the orra property value. If this field (Override Reduce Reserve Allowed) is returned as &lt;code&gt;true&lt;/code&gt;, the seller can reduce or remove a reserve price that had already been reduced for an active auction listing.
     * @param value Value to set for the orra property.
     */
    public void setOrra(@jakarta.annotation.Nullable final Boolean value) {
        this.orra = value;
    }
    /**
     * Sets the paymentMethods property value. An array that indicates the acceptable offline payment methods that can be used when listing an item for sale in the corresponding category.
     * @param value Value to set for the paymentMethods property.
     */
    public void setPaymentMethods(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.paymentMethods = value;
    }
    /**
     * Sets the reduceReserveAllowed property value. If this field (Reduce Reserve Allowed) is &lt;code&gt;true&lt;/code&gt;, the corresponding leaf category allows the seller to reduce an item&apos;s reserve price. If false, this field is not returned in the response and the corresponding leaf category on the site do not normally allow sellers to reduce an item&apos;s reserve price.&lt;p&gt;This field is only returned when &lt;code&gt;true&lt;/code&gt; (not returned when false).&lt;/p&gt;
     * @param value Value to set for the reduceReserveAllowed property.
     */
    public void setReduceReserveAllowed(@jakarta.annotation.Nullable final Boolean value) {
        this.reduceReserveAllowed = value;
    }
    /**
     * Sets the reservePriceAllowed property value. This field indicates whether reserve prices are allowed for auction listings in this category. This field returns as &lt;code&gt;true&lt;/code&gt; when the category supports reserve prices, or &lt;code&gt;false&lt;/code&gt; if the eBay marketplace does not permit reserve prices or the category override blocks reserve prices (&lt;b&gt;orpa&lt;/b&gt; is &lt;code&gt;true&lt;/code&gt;).
     * @param value Value to set for the reservePriceAllowed property.
     */
    public void setReservePriceAllowed(@jakarta.annotation.Nullable final Boolean value) {
        this.reservePriceAllowed = value;
    }
    /**
     * Sets the upcSupport property value. This enumerated value indicates whether or not the category on the specified eBay site supports the use of Universal Product Codes (UPCs) to help create a listing. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:ProductIdentiferEnabledEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the upcSupport property.
     */
    public void setUpcSupport(@jakarta.annotation.Nullable final String value) {
        this.upcSupport = value;
    }
    /**
     * Sets the valueCategory property value. When returned as &lt;code&gt;true&lt;/code&gt;, this boolean indicates that the leaf category for the specified site is designated by eBay as a value category. Value categories can be used as a secondary category for a listing at no extra charge.
     * @param value Value to set for the valueCategory property.
     */
    public void setValueCategory(@jakarta.annotation.Nullable final Boolean value) {
        this.valueCategory = value;
    }
    /**
     * Sets the virtual property value. If this field is returned as &lt;code&gt;true&lt;/code&gt;, the corresponding category is an eBay virtual category, a category in which items may not be listed.&lt;p&gt;This field is only returned when &lt;code&gt;true&lt;/code&gt; (not returned when false).&lt;/p&gt;
     * @param value Value to set for the virtual property.
     */
    public void setVirtual(@jakarta.annotation.Nullable final Boolean value) {
        this.virtual = value;
    }
}

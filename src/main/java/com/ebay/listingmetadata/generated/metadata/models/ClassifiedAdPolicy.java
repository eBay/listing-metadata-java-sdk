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
 * This type provides fields that contain applicable Classified Ad policy metadata for the leaf categories returned for the marketplace.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ClassifiedAdPolicy implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This enumerated value indicates the type or status of available Classified Ad formats for this category.
     */
    private AdFormatEnabledEnum adFormatEnabled;
    /**
     * The unique identifier of the eBay leaf category for which metadata is being returned.
     */
    private String categoryId;
    /**
     * The unique identifier of the category tree.
     */
    private String categoryTreeId;
    /**
     * Indicates whether the category supports the Best Offer Automatic Accept feature for Classified Ad listings.
     */
    private Boolean classifiedAdAutoAcceptEnabled;
    /**
     * Indicates whether the category supports the Best Offer Automatic Reject feature for Classified Ad listings.
     */
    private Boolean classifiedAdAutoDeclineEnabled;
    /**
     * This enumerated value indicates if Best Offer is enabled, disabled, or required for Classified Ad listings in this category.
     */
    private ClassifiedAdBestOfferEnabledEnum classifiedAdBestOfferEnabled;
    /**
     * Indicates whether this category supports including a company name in the seller&apos;s contact information. This element is for For Sale By Owner listings.
     */
    private Boolean classifiedAdCompanyNameEnabled;
    /**
     * Indicates whether this category supports including an address in the seller&apos;s contact information. This element is for For Sale By Owner listings.
     */
    private Boolean classifiedAdContactByAddressEnabled;
    /**
     * Indicates whether most categories support including an email address in the seller&apos;s contact information.
     */
    private Boolean classifiedAdContactByEmailEnabled;
    /**
     * Indicates whether most categories support including a phone number in the seller&apos;s contact information.
     */
    private Boolean classifiedAdContactByPhoneEnabled;
    /**
     * Indicates whether counter offers are allowed on Best Offers for most categories.
     */
    private Boolean classifiedAdCounterOfferEnabled;
    /**
     * This enumerated value indicates support for the payment method being displayed to the user for the category. Even if enabled, checkout may or may not be enabled.
     */
    private ClassifiedAdPaymentMethodEnabledEnum classifiedAdPaymentMethodEnabled;
    /**
     * Indicates how many contact phone numbers can be specified in contact information for the category. This element is for &lt;b&gt;For Sale By Owner&lt;/b&gt; listings.
     */
    private Integer classifiedAdPhoneCount;
    /**
     * Indicates if shipping methods can be specified and displayed in the &lt;b&gt;View Item&lt;/b&gt; page for the category.
     */
    private Boolean classifiedAdShippingMethodEnabled;
    /**
     * Indicates how many street addresses can be specified in contact information for the category. This element is for &lt;b&gt;For Sale By Owner&lt;/b&gt; listings.
     */
    private Integer classifiedAdStreetCount;
    /**
     * Indicates whether this category supports seller-level contact information for Classified Ad listings.
     */
    private Boolean sellerContactDetailsEnabled;
    /**
     * Instantiates a new {@link ClassifiedAdPolicy} and sets the default values.
     */
    public ClassifiedAdPolicy() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ClassifiedAdPolicy}
     */
    @jakarta.annotation.Nonnull
    public static ClassifiedAdPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ClassifiedAdPolicy();
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
     * Gets the adFormatEnabled property value. This enumerated value indicates the type or status of available Classified Ad formats for this category.
     * @return a {@link AdFormatEnabledEnum}
     */
    @jakarta.annotation.Nullable
    public AdFormatEnabledEnum getAdFormatEnabled() {
        return this.adFormatEnabled;
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
     * Gets the classifiedAdAutoAcceptEnabled property value. Indicates whether the category supports the Best Offer Automatic Accept feature for Classified Ad listings.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getClassifiedAdAutoAcceptEnabled() {
        return this.classifiedAdAutoAcceptEnabled;
    }
    /**
     * Gets the classifiedAdAutoDeclineEnabled property value. Indicates whether the category supports the Best Offer Automatic Reject feature for Classified Ad listings.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getClassifiedAdAutoDeclineEnabled() {
        return this.classifiedAdAutoDeclineEnabled;
    }
    /**
     * Gets the classifiedAdBestOfferEnabled property value. This enumerated value indicates if Best Offer is enabled, disabled, or required for Classified Ad listings in this category.
     * @return a {@link ClassifiedAdBestOfferEnabledEnum}
     */
    @jakarta.annotation.Nullable
    public ClassifiedAdBestOfferEnabledEnum getClassifiedAdBestOfferEnabled() {
        return this.classifiedAdBestOfferEnabled;
    }
    /**
     * Gets the classifiedAdCompanyNameEnabled property value. Indicates whether this category supports including a company name in the seller&apos;s contact information. This element is for For Sale By Owner listings.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getClassifiedAdCompanyNameEnabled() {
        return this.classifiedAdCompanyNameEnabled;
    }
    /**
     * Gets the classifiedAdContactByAddressEnabled property value. Indicates whether this category supports including an address in the seller&apos;s contact information. This element is for For Sale By Owner listings.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getClassifiedAdContactByAddressEnabled() {
        return this.classifiedAdContactByAddressEnabled;
    }
    /**
     * Gets the classifiedAdContactByEmailEnabled property value. Indicates whether most categories support including an email address in the seller&apos;s contact information.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getClassifiedAdContactByEmailEnabled() {
        return this.classifiedAdContactByEmailEnabled;
    }
    /**
     * Gets the classifiedAdContactByPhoneEnabled property value. Indicates whether most categories support including a phone number in the seller&apos;s contact information.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getClassifiedAdContactByPhoneEnabled() {
        return this.classifiedAdContactByPhoneEnabled;
    }
    /**
     * Gets the classifiedAdCounterOfferEnabled property value. Indicates whether counter offers are allowed on Best Offers for most categories.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getClassifiedAdCounterOfferEnabled() {
        return this.classifiedAdCounterOfferEnabled;
    }
    /**
     * Gets the classifiedAdPaymentMethodEnabled property value. This enumerated value indicates support for the payment method being displayed to the user for the category. Even if enabled, checkout may or may not be enabled.
     * @return a {@link ClassifiedAdPaymentMethodEnabledEnum}
     */
    @jakarta.annotation.Nullable
    public ClassifiedAdPaymentMethodEnabledEnum getClassifiedAdPaymentMethodEnabled() {
        return this.classifiedAdPaymentMethodEnabled;
    }
    /**
     * Gets the classifiedAdPhoneCount property value. Indicates how many contact phone numbers can be specified in contact information for the category. This element is for &lt;b&gt;For Sale By Owner&lt;/b&gt; listings.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getClassifiedAdPhoneCount() {
        return this.classifiedAdPhoneCount;
    }
    /**
     * Gets the classifiedAdShippingMethodEnabled property value. Indicates if shipping methods can be specified and displayed in the &lt;b&gt;View Item&lt;/b&gt; page for the category.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getClassifiedAdShippingMethodEnabled() {
        return this.classifiedAdShippingMethodEnabled;
    }
    /**
     * Gets the classifiedAdStreetCount property value. Indicates how many street addresses can be specified in contact information for the category. This element is for &lt;b&gt;For Sale By Owner&lt;/b&gt; listings.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getClassifiedAdStreetCount() {
        return this.classifiedAdStreetCount;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(16);
        deserializerMap.put("adFormatEnabled", (n) -> { this.setAdFormatEnabled(n.getEnumValue(AdFormatEnabledEnum::forValue)); });
        deserializerMap.put("categoryId", (n) -> { this.setCategoryId(n.getStringValue()); });
        deserializerMap.put("categoryTreeId", (n) -> { this.setCategoryTreeId(n.getStringValue()); });
        deserializerMap.put("classifiedAdAutoAcceptEnabled", (n) -> { this.setClassifiedAdAutoAcceptEnabled(n.getBooleanValue()); });
        deserializerMap.put("classifiedAdAutoDeclineEnabled", (n) -> { this.setClassifiedAdAutoDeclineEnabled(n.getBooleanValue()); });
        deserializerMap.put("classifiedAdBestOfferEnabled", (n) -> { this.setClassifiedAdBestOfferEnabled(n.getEnumValue(ClassifiedAdBestOfferEnabledEnum::forValue)); });
        deserializerMap.put("classifiedAdCompanyNameEnabled", (n) -> { this.setClassifiedAdCompanyNameEnabled(n.getBooleanValue()); });
        deserializerMap.put("classifiedAdContactByAddressEnabled", (n) -> { this.setClassifiedAdContactByAddressEnabled(n.getBooleanValue()); });
        deserializerMap.put("classifiedAdContactByEmailEnabled", (n) -> { this.setClassifiedAdContactByEmailEnabled(n.getBooleanValue()); });
        deserializerMap.put("classifiedAdContactByPhoneEnabled", (n) -> { this.setClassifiedAdContactByPhoneEnabled(n.getBooleanValue()); });
        deserializerMap.put("classifiedAdCounterOfferEnabled", (n) -> { this.setClassifiedAdCounterOfferEnabled(n.getBooleanValue()); });
        deserializerMap.put("classifiedAdPaymentMethodEnabled", (n) -> { this.setClassifiedAdPaymentMethodEnabled(n.getEnumValue(ClassifiedAdPaymentMethodEnabledEnum::forValue)); });
        deserializerMap.put("classifiedAdPhoneCount", (n) -> { this.setClassifiedAdPhoneCount(n.getIntegerValue()); });
        deserializerMap.put("classifiedAdShippingMethodEnabled", (n) -> { this.setClassifiedAdShippingMethodEnabled(n.getBooleanValue()); });
        deserializerMap.put("classifiedAdStreetCount", (n) -> { this.setClassifiedAdStreetCount(n.getIntegerValue()); });
        deserializerMap.put("sellerContactDetailsEnabled", (n) -> { this.setSellerContactDetailsEnabled(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the sellerContactDetailsEnabled property value. Indicates whether this category supports seller-level contact information for Classified Ad listings.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSellerContactDetailsEnabled() {
        return this.sellerContactDetailsEnabled;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("adFormatEnabled", this.getAdFormatEnabled());
        writer.writeStringValue("categoryId", this.getCategoryId());
        writer.writeStringValue("categoryTreeId", this.getCategoryTreeId());
        writer.writeBooleanValue("classifiedAdAutoAcceptEnabled", this.getClassifiedAdAutoAcceptEnabled());
        writer.writeBooleanValue("classifiedAdAutoDeclineEnabled", this.getClassifiedAdAutoDeclineEnabled());
        writer.writeEnumValue("classifiedAdBestOfferEnabled", this.getClassifiedAdBestOfferEnabled());
        writer.writeBooleanValue("classifiedAdCompanyNameEnabled", this.getClassifiedAdCompanyNameEnabled());
        writer.writeBooleanValue("classifiedAdContactByAddressEnabled", this.getClassifiedAdContactByAddressEnabled());
        writer.writeBooleanValue("classifiedAdContactByEmailEnabled", this.getClassifiedAdContactByEmailEnabled());
        writer.writeBooleanValue("classifiedAdContactByPhoneEnabled", this.getClassifiedAdContactByPhoneEnabled());
        writer.writeBooleanValue("classifiedAdCounterOfferEnabled", this.getClassifiedAdCounterOfferEnabled());
        writer.writeEnumValue("classifiedAdPaymentMethodEnabled", this.getClassifiedAdPaymentMethodEnabled());
        writer.writeIntegerValue("classifiedAdPhoneCount", this.getClassifiedAdPhoneCount());
        writer.writeBooleanValue("classifiedAdShippingMethodEnabled", this.getClassifiedAdShippingMethodEnabled());
        writer.writeIntegerValue("classifiedAdStreetCount", this.getClassifiedAdStreetCount());
        writer.writeBooleanValue("sellerContactDetailsEnabled", this.getSellerContactDetailsEnabled());
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
     * Sets the adFormatEnabled property value. This enumerated value indicates the type or status of available Classified Ad formats for this category.
     * @param value Value to set for the adFormatEnabled property.
     */
    public void setAdFormatEnabled(@jakarta.annotation.Nullable final AdFormatEnabledEnum value) {
        this.adFormatEnabled = value;
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
     * Sets the classifiedAdAutoAcceptEnabled property value. Indicates whether the category supports the Best Offer Automatic Accept feature for Classified Ad listings.
     * @param value Value to set for the classifiedAdAutoAcceptEnabled property.
     */
    public void setClassifiedAdAutoAcceptEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.classifiedAdAutoAcceptEnabled = value;
    }
    /**
     * Sets the classifiedAdAutoDeclineEnabled property value. Indicates whether the category supports the Best Offer Automatic Reject feature for Classified Ad listings.
     * @param value Value to set for the classifiedAdAutoDeclineEnabled property.
     */
    public void setClassifiedAdAutoDeclineEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.classifiedAdAutoDeclineEnabled = value;
    }
    /**
     * Sets the classifiedAdBestOfferEnabled property value. This enumerated value indicates if Best Offer is enabled, disabled, or required for Classified Ad listings in this category.
     * @param value Value to set for the classifiedAdBestOfferEnabled property.
     */
    public void setClassifiedAdBestOfferEnabled(@jakarta.annotation.Nullable final ClassifiedAdBestOfferEnabledEnum value) {
        this.classifiedAdBestOfferEnabled = value;
    }
    /**
     * Sets the classifiedAdCompanyNameEnabled property value. Indicates whether this category supports including a company name in the seller&apos;s contact information. This element is for For Sale By Owner listings.
     * @param value Value to set for the classifiedAdCompanyNameEnabled property.
     */
    public void setClassifiedAdCompanyNameEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.classifiedAdCompanyNameEnabled = value;
    }
    /**
     * Sets the classifiedAdContactByAddressEnabled property value. Indicates whether this category supports including an address in the seller&apos;s contact information. This element is for For Sale By Owner listings.
     * @param value Value to set for the classifiedAdContactByAddressEnabled property.
     */
    public void setClassifiedAdContactByAddressEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.classifiedAdContactByAddressEnabled = value;
    }
    /**
     * Sets the classifiedAdContactByEmailEnabled property value. Indicates whether most categories support including an email address in the seller&apos;s contact information.
     * @param value Value to set for the classifiedAdContactByEmailEnabled property.
     */
    public void setClassifiedAdContactByEmailEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.classifiedAdContactByEmailEnabled = value;
    }
    /**
     * Sets the classifiedAdContactByPhoneEnabled property value. Indicates whether most categories support including a phone number in the seller&apos;s contact information.
     * @param value Value to set for the classifiedAdContactByPhoneEnabled property.
     */
    public void setClassifiedAdContactByPhoneEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.classifiedAdContactByPhoneEnabled = value;
    }
    /**
     * Sets the classifiedAdCounterOfferEnabled property value. Indicates whether counter offers are allowed on Best Offers for most categories.
     * @param value Value to set for the classifiedAdCounterOfferEnabled property.
     */
    public void setClassifiedAdCounterOfferEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.classifiedAdCounterOfferEnabled = value;
    }
    /**
     * Sets the classifiedAdPaymentMethodEnabled property value. This enumerated value indicates support for the payment method being displayed to the user for the category. Even if enabled, checkout may or may not be enabled.
     * @param value Value to set for the classifiedAdPaymentMethodEnabled property.
     */
    public void setClassifiedAdPaymentMethodEnabled(@jakarta.annotation.Nullable final ClassifiedAdPaymentMethodEnabledEnum value) {
        this.classifiedAdPaymentMethodEnabled = value;
    }
    /**
     * Sets the classifiedAdPhoneCount property value. Indicates how many contact phone numbers can be specified in contact information for the category. This element is for &lt;b&gt;For Sale By Owner&lt;/b&gt; listings.
     * @param value Value to set for the classifiedAdPhoneCount property.
     */
    public void setClassifiedAdPhoneCount(@jakarta.annotation.Nullable final Integer value) {
        this.classifiedAdPhoneCount = value;
    }
    /**
     * Sets the classifiedAdShippingMethodEnabled property value. Indicates if shipping methods can be specified and displayed in the &lt;b&gt;View Item&lt;/b&gt; page for the category.
     * @param value Value to set for the classifiedAdShippingMethodEnabled property.
     */
    public void setClassifiedAdShippingMethodEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.classifiedAdShippingMethodEnabled = value;
    }
    /**
     * Sets the classifiedAdStreetCount property value. Indicates how many street addresses can be specified in contact information for the category. This element is for &lt;b&gt;For Sale By Owner&lt;/b&gt; listings.
     * @param value Value to set for the classifiedAdStreetCount property.
     */
    public void setClassifiedAdStreetCount(@jakarta.annotation.Nullable final Integer value) {
        this.classifiedAdStreetCount = value;
    }
    /**
     * Sets the sellerContactDetailsEnabled property value. Indicates whether this category supports seller-level contact information for Classified Ad listings.
     * @param value Value to set for the sellerContactDetailsEnabled property.
     */
    public void setSellerContactDetailsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.sellerContactDetailsEnabled = value;
    }
}

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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MotorsListingPolicy implements AdditionalDataHolder, Parsable {
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
     * This field is returned as &lt;code&gt;true&lt;/code&gt; if the corresponding category supports the use of a deposit/down payment on a motor vehicle listing. In an AddItem call, the seller can configure a down payment for a motor vehicle listing using the PaymentDetails container.
     */
    private Boolean depositSupported;
    /**
     * Indicates whether or not eBay Motors Pro sellers can use classified ads in this category to sell their vehicles. This element is applicable for eBay Motors Pro users. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:AdFormatEnabledEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String ebayMotorsProAdFormatEnabled;
    /**
     * Indicates whether or not the category supports the Best Offer Auto Accept feature for eBay Motors Pro listings. This element is for eBay Motors Pro users.
     */
    private Boolean ebayMotorsProAutoAcceptEnabled;
    /**
     * Indicates whether or not the category allows auto-decline for Best Offers for eBay Motors Classified Ad listings. This element is for eBay Motors Pro users.
     */
    private Boolean ebayMotorsProAutoDeclineEnabled;
    /**
     * This enumerated value indicates whether or not Best Offer features are supported for eBay Motors Classified Ad listings in this category. This element is for eBay Motors Pro users. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:ClassifiedAdBestOfferEnabledEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String ebayMotorsProBestOfferEnabled;
    /**
     * Indicates whether this category supports including the company name in the seller&apos;s contact information. This element is for eBay Motors Pro users.
     */
    private Boolean ebayMotorsProCompanyNameEnabled;
    /**
     * Indicates whether this category supports including the address in the seller&apos;s contact information. This element is for eBay Motors Pro users.
     */
    private Boolean ebayMotorsProContactByAddressEnabled;
    /**
     * Indicates whether this category supports including an email address in the seller&apos;s contact information. This element is for eBay Motors Pro users.
     */
    private Boolean ebayMotorsProContactByEmailEnabled;
    /**
     * Indicates whether this category supports including the telephone in the seller&apos;s contact information. This element is for eBay Motors Pro users.
     */
    private Boolean ebayMotorsProContactByPhoneEnabled;
    /**
     * Indicates whether counter offers are allowed on Best Offers for this category in an eBay Motors Classified Ad listing. This element is for eBay Motors Pro users.
     */
    private Boolean ebayMotorsProCounterOfferEnabled;
    /**
     * This enumerated value indicates whether this category supports that the payment method should be displayed to the user for this category in an eBay Motors Classified Ad listing. Even if enabled, checkout may or may not be enabled. This element is for eBay Motors Pro users. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:ClassifiedAdPaymentMethodEnabledEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String ebayMotorsProPaymentMethodCheckOutEnabled;
    /**
     * Indicates the number of phone numbers that can be included through contact information for this category. This element is for eBay Motors Pro users.
     */
    private Integer ebayMotorsProPhoneCount;
    /**
     * Indicates whether this category allows seller-level contact information for eBay Motors Classified Ad listings. A value of true means seller-level contact information is available for Classified Ad listings. This element is for eBay Motors Pro users.
     */
    private Boolean ebayMotorsProSellerContactDetailsEnabled;
    /**
     * Indicates if shipping options should be displayed to the user for this category in an eBay Motors Classified Ad listing. This element is for eBay Motors Pro users.
     */
    private Boolean ebayMotorsProShippingMethodEnabled;
    /**
     * This field indicates the number of street addresses allowed in contact information for this category. This element is for eBay Motors Pro users.
     */
    private Integer ebayMotorsProStreetCount;
    /**
     * If returned as &lt;code&gt;true&lt;/code&gt;, this indicates the category supports the use of an eBay Product ID (e.g. ePID) to identify which motorcycles and/or scooters are compatible with a motor vehicle part or accessory. ePIDs can only be used to identify motorcycles and scooters on the Germany and UK sites.
     */
    private Boolean epidSupported;
    /**
     * This field indicates whether or not the category supports the use of a K type to identify the cars and trucks compatible with a motor vehicle part or accessory. Only the AU, DE, ES, FR, IT, and UK marketplaces support the use of K types. See &lt;a href=&quot;/api-docs/user-guides/static/trading-user-guide/manually-specify-compatibility.html#ktype&quot; target=&quot;_blank&quot;&gt;Compatibility by K type&lt;/a&gt; for more information
     */
    private Boolean kTypeSupported;
    /**
     * This array shows the supported distances (in miles) for different types of Local Market subscription types in this category. Motor vehicle listings will be shown to buyers located within these proximities of the vehicle&apos;s location.
     */
    private java.util.List<LocalListingDistance> localListingDistances;
    /**
     * Specifies whether this category supports Motor Local Market Classified Ad listings. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:AdFormatEnabledEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String localMarketAdFormatEnabled;
    /**
     * Specifies whether this category supports auto-accept for Best Offers for Motors Local Market Classified Ads.
     */
    private Boolean localMarketAutoAcceptEnabled;
    /**
     * Specifies whether this category supports auto-decline for Best Offers for Motors Local Market Classified Ads.
     */
    private Boolean localMarketAutoDeclineEnabled;
    /**
     * Indicates if Best Offer is enabled/required for Motors Local Market Classified Ad listings in this category.  For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:ClassifiedAdBestOfferEnabledEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String localMarketBestOfferEnabled;
    /**
     * Indicates whether the category supports the seller&apos;s company name being specified when using Motors Local Market classified ads.
     */
    private Boolean localMarketCompanyNameEnabled;
    /**
     * Indicates whether this category supports including the address in the seller&apos;s contact information.
     */
    private Boolean localMarketContactByAddressEnabled;
    /**
     * Indicates whether the category supports including an email address in the seller&apos;s contact information. 
     */
    private Boolean localMarketContactByEmailEnabled;
    /**
     * Indicates whether this category supports including the telephone in the seller&apos;s contact information.
     */
    private Boolean localMarketContactByPhoneEnabled;
    /**
     * Indicates whether counter offers are allowed on Best Offers for this category for Motors Local Market Classified Ad listings.
     */
    private Boolean localMarketCounterOfferEnabled;
    /**
     * Indicates whether the category supports a seller creating a Motors Local Market listing without a subscription. This feature is only available to licensed vehicle dealers.
     */
    private Boolean localMarketNonSubscription;
    /**
     * Indicates if the payment method should be displayed to the user for this category in an Motors Local Market Classified Ad listing. Even if enabled, checkout may or may not be enabled. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:ClassifiedAdPaymentMethodEnabledEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String localMarketPaymentMethodCheckOutEnabled;
    /**
     * Indicates the number of phone numbers that can be included through contact information for this category.
     */
    private Integer localMarketPhoneCount;
    /**
     * Indicates whether the category supports the Premium level subscription Motors Local Market listings. This feature is only available to licensed vehicle dealers.
     */
    private Boolean localMarketPremiumSubscription;
    /**
     * Indicates whether the category supports the Regular level subscription to Motors Local Market listings. This feature is only available to licensed vehicle dealers.
     */
    private Boolean localMarketRegularSubscription;
    /**
     * Specifies the whether this category allows seller-level contact information for Motors Local Market Classified Ad listings.
     */
    private Boolean localMarketSellerContactDetailsEnabled;
    /**
     * Indicates if shipping methods should be displayed to the user for this category in an Motors Local Market Classified Ad listing. Even if enabled, checkout may or may not be enabled.
     */
    private Boolean localMarketShippingMethodEnabled;
    /**
     * Indicates whether the category supports the Speciality level subscription to Motors Local Market listings. This feature is only available to licensed vehicle dealers.
     */
    private Boolean localMarketSpecialitySubscription;
    /**
     * Indicates which address option is enabled for the seller&apos;s contact information.
     */
    private Integer localMarketStreetCount;
    /**
     * Indicates the maximum number of compatible applications allowed per item when adding or revising items with compatibilities provided at the most detailed granularity. For example, in Car and Truck Parts on the US site, the most granular application would include Year, Make, Model, Trim, and Engine.
     */
    private Integer maxGranularFitmentCount;
    /**
     * Indicates the maximum number of compatible applications allowed per item when adding or revising items. This is relevant for specifying parts compatibility by application manually only. See &lt;a href=&quot;/api-docs/user-guides/static/trading-user-guide/manually-specify-compatibility.html&quot; target=&quot;_blank&quot;&gt;Specify parts compatibility manually&lt;/a&gt; and &lt;a href=&quot;/api-docs/sell/static/inventory/managing-product-compatibility.html&quot; target=&quot;_blank&quot;&gt;Managing product compatibility&lt;/a&gt; for more information.
     */
    private Integer maxItemCompatibility;
    /**
     * Indicates the minimum number of required compatible applications for listing items. A value of &lt;code&gt;0&lt;/code&gt; indicates it is not mandatory to specify parts compatibilities when listing.
     */
    private Integer minItemCompatibility;
    /**
     * The value in this field indicates whether the category supports Motors Local Market listings if the seller does not have a vehicle subscription. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:GeographicExposureEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String nonSubscription;
    /**
     * The value in this field indicates whether the category supports Motors Local Market listings if the seller has a Premium vehicle subscription. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:GeographicExposureEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String premiumSubscription;
    /**
     * The value in this field indicates whether the category supports Motors Local Market listings if the seller has a Regular vehicle subscription. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:GeographicExposureEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String regularSubscription;
    /**
     * This field is returned as &lt;code&gt;true&lt;/code&gt; if the corresponding category supports the use of a seller-provided title for a motor vehicle listing on the US or Canada Motors marketplaces. A seller-provided title is a descriptive title, given by the seller, that appears below eBay&apos;s pre-filled listing title for the motor vehicle. Visually, the seller-provided title is similar to a subtitle on other types of eBay listings (non-vehicle). A seller-provided title can assist in helping buyers discover the vehicle.
     */
    private Boolean sellerProvidedTitleSupported;
    /**
     * The value in this field indicates whether the category supports Motors Local Market listings if the seller has a Specialty vehicle subscription. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:GeographicExposureEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String specialitySubscription;
    /**
     * Indicates if Vehicle Identification Number is supported.
     */
    private Boolean vinSupported;
    /**
     * Indicates if Vehicle Registration Mark is supported.
     */
    private Boolean vrmSupported;
    /**
     * Instantiates a new {@link MotorsListingPolicy} and sets the default values.
     */
    public MotorsListingPolicy() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MotorsListingPolicy}
     */
    @jakarta.annotation.Nonnull
    public static MotorsListingPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MotorsListingPolicy();
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
     * Gets the depositSupported property value. This field is returned as &lt;code&gt;true&lt;/code&gt; if the corresponding category supports the use of a deposit/down payment on a motor vehicle listing. In an AddItem call, the seller can configure a down payment for a motor vehicle listing using the PaymentDetails container.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getDepositSupported() {
        return this.depositSupported;
    }
    /**
     * Gets the ebayMotorsProAdFormatEnabled property value. Indicates whether or not eBay Motors Pro sellers can use classified ads in this category to sell their vehicles. This element is applicable for eBay Motors Pro users. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:AdFormatEnabledEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEbayMotorsProAdFormatEnabled() {
        return this.ebayMotorsProAdFormatEnabled;
    }
    /**
     * Gets the ebayMotorsProAutoAcceptEnabled property value. Indicates whether or not the category supports the Best Offer Auto Accept feature for eBay Motors Pro listings. This element is for eBay Motors Pro users.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEbayMotorsProAutoAcceptEnabled() {
        return this.ebayMotorsProAutoAcceptEnabled;
    }
    /**
     * Gets the ebayMotorsProAutoDeclineEnabled property value. Indicates whether or not the category allows auto-decline for Best Offers for eBay Motors Classified Ad listings. This element is for eBay Motors Pro users.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEbayMotorsProAutoDeclineEnabled() {
        return this.ebayMotorsProAutoDeclineEnabled;
    }
    /**
     * Gets the ebayMotorsProBestOfferEnabled property value. This enumerated value indicates whether or not Best Offer features are supported for eBay Motors Classified Ad listings in this category. This element is for eBay Motors Pro users. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:ClassifiedAdBestOfferEnabledEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEbayMotorsProBestOfferEnabled() {
        return this.ebayMotorsProBestOfferEnabled;
    }
    /**
     * Gets the ebayMotorsProCompanyNameEnabled property value. Indicates whether this category supports including the company name in the seller&apos;s contact information. This element is for eBay Motors Pro users.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEbayMotorsProCompanyNameEnabled() {
        return this.ebayMotorsProCompanyNameEnabled;
    }
    /**
     * Gets the ebayMotorsProContactByAddressEnabled property value. Indicates whether this category supports including the address in the seller&apos;s contact information. This element is for eBay Motors Pro users.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEbayMotorsProContactByAddressEnabled() {
        return this.ebayMotorsProContactByAddressEnabled;
    }
    /**
     * Gets the ebayMotorsProContactByEmailEnabled property value. Indicates whether this category supports including an email address in the seller&apos;s contact information. This element is for eBay Motors Pro users.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEbayMotorsProContactByEmailEnabled() {
        return this.ebayMotorsProContactByEmailEnabled;
    }
    /**
     * Gets the ebayMotorsProContactByPhoneEnabled property value. Indicates whether this category supports including the telephone in the seller&apos;s contact information. This element is for eBay Motors Pro users.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEbayMotorsProContactByPhoneEnabled() {
        return this.ebayMotorsProContactByPhoneEnabled;
    }
    /**
     * Gets the ebayMotorsProCounterOfferEnabled property value. Indicates whether counter offers are allowed on Best Offers for this category in an eBay Motors Classified Ad listing. This element is for eBay Motors Pro users.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEbayMotorsProCounterOfferEnabled() {
        return this.ebayMotorsProCounterOfferEnabled;
    }
    /**
     * Gets the ebayMotorsProPaymentMethodCheckOutEnabled property value. This enumerated value indicates whether this category supports that the payment method should be displayed to the user for this category in an eBay Motors Classified Ad listing. Even if enabled, checkout may or may not be enabled. This element is for eBay Motors Pro users. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:ClassifiedAdPaymentMethodEnabledEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEbayMotorsProPaymentMethodCheckOutEnabled() {
        return this.ebayMotorsProPaymentMethodCheckOutEnabled;
    }
    /**
     * Gets the ebayMotorsProPhoneCount property value. Indicates the number of phone numbers that can be included through contact information for this category. This element is for eBay Motors Pro users.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getEbayMotorsProPhoneCount() {
        return this.ebayMotorsProPhoneCount;
    }
    /**
     * Gets the ebayMotorsProSellerContactDetailsEnabled property value. Indicates whether this category allows seller-level contact information for eBay Motors Classified Ad listings. A value of true means seller-level contact information is available for Classified Ad listings. This element is for eBay Motors Pro users.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEbayMotorsProSellerContactDetailsEnabled() {
        return this.ebayMotorsProSellerContactDetailsEnabled;
    }
    /**
     * Gets the ebayMotorsProShippingMethodEnabled property value. Indicates if shipping options should be displayed to the user for this category in an eBay Motors Classified Ad listing. This element is for eBay Motors Pro users.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEbayMotorsProShippingMethodEnabled() {
        return this.ebayMotorsProShippingMethodEnabled;
    }
    /**
     * Gets the ebayMotorsProStreetCount property value. This field indicates the number of street addresses allowed in contact information for this category. This element is for eBay Motors Pro users.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getEbayMotorsProStreetCount() {
        return this.ebayMotorsProStreetCount;
    }
    /**
     * Gets the epidSupported property value. If returned as &lt;code&gt;true&lt;/code&gt;, this indicates the category supports the use of an eBay Product ID (e.g. ePID) to identify which motorcycles and/or scooters are compatible with a motor vehicle part or accessory. ePIDs can only be used to identify motorcycles and scooters on the Germany and UK sites.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEpidSupported() {
        return this.epidSupported;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(48);
        deserializerMap.put("categoryId", (n) -> { this.setCategoryId(n.getStringValue()); });
        deserializerMap.put("categoryTreeId", (n) -> { this.setCategoryTreeId(n.getStringValue()); });
        deserializerMap.put("depositSupported", (n) -> { this.setDepositSupported(n.getBooleanValue()); });
        deserializerMap.put("ebayMotorsProAdFormatEnabled", (n) -> { this.setEbayMotorsProAdFormatEnabled(n.getStringValue()); });
        deserializerMap.put("ebayMotorsProAutoAcceptEnabled", (n) -> { this.setEbayMotorsProAutoAcceptEnabled(n.getBooleanValue()); });
        deserializerMap.put("ebayMotorsProAutoDeclineEnabled", (n) -> { this.setEbayMotorsProAutoDeclineEnabled(n.getBooleanValue()); });
        deserializerMap.put("ebayMotorsProBestOfferEnabled", (n) -> { this.setEbayMotorsProBestOfferEnabled(n.getStringValue()); });
        deserializerMap.put("ebayMotorsProCompanyNameEnabled", (n) -> { this.setEbayMotorsProCompanyNameEnabled(n.getBooleanValue()); });
        deserializerMap.put("ebayMotorsProContactByAddressEnabled", (n) -> { this.setEbayMotorsProContactByAddressEnabled(n.getBooleanValue()); });
        deserializerMap.put("ebayMotorsProContactByEmailEnabled", (n) -> { this.setEbayMotorsProContactByEmailEnabled(n.getBooleanValue()); });
        deserializerMap.put("ebayMotorsProContactByPhoneEnabled", (n) -> { this.setEbayMotorsProContactByPhoneEnabled(n.getBooleanValue()); });
        deserializerMap.put("ebayMotorsProCounterOfferEnabled", (n) -> { this.setEbayMotorsProCounterOfferEnabled(n.getBooleanValue()); });
        deserializerMap.put("ebayMotorsProPaymentMethodCheckOutEnabled", (n) -> { this.setEbayMotorsProPaymentMethodCheckOutEnabled(n.getStringValue()); });
        deserializerMap.put("ebayMotorsProPhoneCount", (n) -> { this.setEbayMotorsProPhoneCount(n.getIntegerValue()); });
        deserializerMap.put("ebayMotorsProSellerContactDetailsEnabled", (n) -> { this.setEbayMotorsProSellerContactDetailsEnabled(n.getBooleanValue()); });
        deserializerMap.put("ebayMotorsProShippingMethodEnabled", (n) -> { this.setEbayMotorsProShippingMethodEnabled(n.getBooleanValue()); });
        deserializerMap.put("ebayMotorsProStreetCount", (n) -> { this.setEbayMotorsProStreetCount(n.getIntegerValue()); });
        deserializerMap.put("epidSupported", (n) -> { this.setEpidSupported(n.getBooleanValue()); });
        deserializerMap.put("kTypeSupported", (n) -> { this.setKTypeSupported(n.getBooleanValue()); });
        deserializerMap.put("localListingDistances", (n) -> { this.setLocalListingDistances(n.getCollectionOfObjectValues(LocalListingDistance::createFromDiscriminatorValue)); });
        deserializerMap.put("localMarketAdFormatEnabled", (n) -> { this.setLocalMarketAdFormatEnabled(n.getStringValue()); });
        deserializerMap.put("localMarketAutoAcceptEnabled", (n) -> { this.setLocalMarketAutoAcceptEnabled(n.getBooleanValue()); });
        deserializerMap.put("localMarketAutoDeclineEnabled", (n) -> { this.setLocalMarketAutoDeclineEnabled(n.getBooleanValue()); });
        deserializerMap.put("localMarketBestOfferEnabled", (n) -> { this.setLocalMarketBestOfferEnabled(n.getStringValue()); });
        deserializerMap.put("localMarketCompanyNameEnabled", (n) -> { this.setLocalMarketCompanyNameEnabled(n.getBooleanValue()); });
        deserializerMap.put("localMarketContactByAddressEnabled", (n) -> { this.setLocalMarketContactByAddressEnabled(n.getBooleanValue()); });
        deserializerMap.put("localMarketContactByEmailEnabled", (n) -> { this.setLocalMarketContactByEmailEnabled(n.getBooleanValue()); });
        deserializerMap.put("localMarketContactByPhoneEnabled", (n) -> { this.setLocalMarketContactByPhoneEnabled(n.getBooleanValue()); });
        deserializerMap.put("localMarketCounterOfferEnabled", (n) -> { this.setLocalMarketCounterOfferEnabled(n.getBooleanValue()); });
        deserializerMap.put("localMarketNonSubscription", (n) -> { this.setLocalMarketNonSubscription(n.getBooleanValue()); });
        deserializerMap.put("localMarketPaymentMethodCheckOutEnabled", (n) -> { this.setLocalMarketPaymentMethodCheckOutEnabled(n.getStringValue()); });
        deserializerMap.put("localMarketPhoneCount", (n) -> { this.setLocalMarketPhoneCount(n.getIntegerValue()); });
        deserializerMap.put("localMarketPremiumSubscription", (n) -> { this.setLocalMarketPremiumSubscription(n.getBooleanValue()); });
        deserializerMap.put("localMarketRegularSubscription", (n) -> { this.setLocalMarketRegularSubscription(n.getBooleanValue()); });
        deserializerMap.put("localMarketSellerContactDetailsEnabled", (n) -> { this.setLocalMarketSellerContactDetailsEnabled(n.getBooleanValue()); });
        deserializerMap.put("localMarketShippingMethodEnabled", (n) -> { this.setLocalMarketShippingMethodEnabled(n.getBooleanValue()); });
        deserializerMap.put("localMarketSpecialitySubscription", (n) -> { this.setLocalMarketSpecialitySubscription(n.getBooleanValue()); });
        deserializerMap.put("localMarketStreetCount", (n) -> { this.setLocalMarketStreetCount(n.getIntegerValue()); });
        deserializerMap.put("maxGranularFitmentCount", (n) -> { this.setMaxGranularFitmentCount(n.getIntegerValue()); });
        deserializerMap.put("maxItemCompatibility", (n) -> { this.setMaxItemCompatibility(n.getIntegerValue()); });
        deserializerMap.put("minItemCompatibility", (n) -> { this.setMinItemCompatibility(n.getIntegerValue()); });
        deserializerMap.put("nonSubscription", (n) -> { this.setNonSubscription(n.getStringValue()); });
        deserializerMap.put("premiumSubscription", (n) -> { this.setPremiumSubscription(n.getStringValue()); });
        deserializerMap.put("regularSubscription", (n) -> { this.setRegularSubscription(n.getStringValue()); });
        deserializerMap.put("sellerProvidedTitleSupported", (n) -> { this.setSellerProvidedTitleSupported(n.getBooleanValue()); });
        deserializerMap.put("specialitySubscription", (n) -> { this.setSpecialitySubscription(n.getStringValue()); });
        deserializerMap.put("vinSupported", (n) -> { this.setVinSupported(n.getBooleanValue()); });
        deserializerMap.put("vrmSupported", (n) -> { this.setVrmSupported(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the kTypeSupported property value. This field indicates whether or not the category supports the use of a K type to identify the cars and trucks compatible with a motor vehicle part or accessory. Only the AU, DE, ES, FR, IT, and UK marketplaces support the use of K types. See &lt;a href=&quot;/api-docs/user-guides/static/trading-user-guide/manually-specify-compatibility.html#ktype&quot; target=&quot;_blank&quot;&gt;Compatibility by K type&lt;/a&gt; for more information
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getKTypeSupported() {
        return this.kTypeSupported;
    }
    /**
     * Gets the localListingDistances property value. This array shows the supported distances (in miles) for different types of Local Market subscription types in this category. Motor vehicle listings will be shown to buyers located within these proximities of the vehicle&apos;s location.
     * @return a {@link java.util.List<LocalListingDistance>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<LocalListingDistance> getLocalListingDistances() {
        return this.localListingDistances;
    }
    /**
     * Gets the localMarketAdFormatEnabled property value. Specifies whether this category supports Motor Local Market Classified Ad listings. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:AdFormatEnabledEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLocalMarketAdFormatEnabled() {
        return this.localMarketAdFormatEnabled;
    }
    /**
     * Gets the localMarketAutoAcceptEnabled property value. Specifies whether this category supports auto-accept for Best Offers for Motors Local Market Classified Ads.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getLocalMarketAutoAcceptEnabled() {
        return this.localMarketAutoAcceptEnabled;
    }
    /**
     * Gets the localMarketAutoDeclineEnabled property value. Specifies whether this category supports auto-decline for Best Offers for Motors Local Market Classified Ads.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getLocalMarketAutoDeclineEnabled() {
        return this.localMarketAutoDeclineEnabled;
    }
    /**
     * Gets the localMarketBestOfferEnabled property value. Indicates if Best Offer is enabled/required for Motors Local Market Classified Ad listings in this category.  For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:ClassifiedAdBestOfferEnabledEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLocalMarketBestOfferEnabled() {
        return this.localMarketBestOfferEnabled;
    }
    /**
     * Gets the localMarketCompanyNameEnabled property value. Indicates whether the category supports the seller&apos;s company name being specified when using Motors Local Market classified ads.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getLocalMarketCompanyNameEnabled() {
        return this.localMarketCompanyNameEnabled;
    }
    /**
     * Gets the localMarketContactByAddressEnabled property value. Indicates whether this category supports including the address in the seller&apos;s contact information.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getLocalMarketContactByAddressEnabled() {
        return this.localMarketContactByAddressEnabled;
    }
    /**
     * Gets the localMarketContactByEmailEnabled property value. Indicates whether the category supports including an email address in the seller&apos;s contact information. 
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getLocalMarketContactByEmailEnabled() {
        return this.localMarketContactByEmailEnabled;
    }
    /**
     * Gets the localMarketContactByPhoneEnabled property value. Indicates whether this category supports including the telephone in the seller&apos;s contact information.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getLocalMarketContactByPhoneEnabled() {
        return this.localMarketContactByPhoneEnabled;
    }
    /**
     * Gets the localMarketCounterOfferEnabled property value. Indicates whether counter offers are allowed on Best Offers for this category for Motors Local Market Classified Ad listings.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getLocalMarketCounterOfferEnabled() {
        return this.localMarketCounterOfferEnabled;
    }
    /**
     * Gets the localMarketNonSubscription property value. Indicates whether the category supports a seller creating a Motors Local Market listing without a subscription. This feature is only available to licensed vehicle dealers.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getLocalMarketNonSubscription() {
        return this.localMarketNonSubscription;
    }
    /**
     * Gets the localMarketPaymentMethodCheckOutEnabled property value. Indicates if the payment method should be displayed to the user for this category in an Motors Local Market Classified Ad listing. Even if enabled, checkout may or may not be enabled. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:ClassifiedAdPaymentMethodEnabledEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLocalMarketPaymentMethodCheckOutEnabled() {
        return this.localMarketPaymentMethodCheckOutEnabled;
    }
    /**
     * Gets the localMarketPhoneCount property value. Indicates the number of phone numbers that can be included through contact information for this category.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getLocalMarketPhoneCount() {
        return this.localMarketPhoneCount;
    }
    /**
     * Gets the localMarketPremiumSubscription property value. Indicates whether the category supports the Premium level subscription Motors Local Market listings. This feature is only available to licensed vehicle dealers.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getLocalMarketPremiumSubscription() {
        return this.localMarketPremiumSubscription;
    }
    /**
     * Gets the localMarketRegularSubscription property value. Indicates whether the category supports the Regular level subscription to Motors Local Market listings. This feature is only available to licensed vehicle dealers.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getLocalMarketRegularSubscription() {
        return this.localMarketRegularSubscription;
    }
    /**
     * Gets the localMarketSellerContactDetailsEnabled property value. Specifies the whether this category allows seller-level contact information for Motors Local Market Classified Ad listings.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getLocalMarketSellerContactDetailsEnabled() {
        return this.localMarketSellerContactDetailsEnabled;
    }
    /**
     * Gets the localMarketShippingMethodEnabled property value. Indicates if shipping methods should be displayed to the user for this category in an Motors Local Market Classified Ad listing. Even if enabled, checkout may or may not be enabled.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getLocalMarketShippingMethodEnabled() {
        return this.localMarketShippingMethodEnabled;
    }
    /**
     * Gets the localMarketSpecialitySubscription property value. Indicates whether the category supports the Speciality level subscription to Motors Local Market listings. This feature is only available to licensed vehicle dealers.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getLocalMarketSpecialitySubscription() {
        return this.localMarketSpecialitySubscription;
    }
    /**
     * Gets the localMarketStreetCount property value. Indicates which address option is enabled for the seller&apos;s contact information.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getLocalMarketStreetCount() {
        return this.localMarketStreetCount;
    }
    /**
     * Gets the maxGranularFitmentCount property value. Indicates the maximum number of compatible applications allowed per item when adding or revising items with compatibilities provided at the most detailed granularity. For example, in Car and Truck Parts on the US site, the most granular application would include Year, Make, Model, Trim, and Engine.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMaxGranularFitmentCount() {
        return this.maxGranularFitmentCount;
    }
    /**
     * Gets the maxItemCompatibility property value. Indicates the maximum number of compatible applications allowed per item when adding or revising items. This is relevant for specifying parts compatibility by application manually only. See &lt;a href=&quot;/api-docs/user-guides/static/trading-user-guide/manually-specify-compatibility.html&quot; target=&quot;_blank&quot;&gt;Specify parts compatibility manually&lt;/a&gt; and &lt;a href=&quot;/api-docs/sell/static/inventory/managing-product-compatibility.html&quot; target=&quot;_blank&quot;&gt;Managing product compatibility&lt;/a&gt; for more information.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMaxItemCompatibility() {
        return this.maxItemCompatibility;
    }
    /**
     * Gets the minItemCompatibility property value. Indicates the minimum number of required compatible applications for listing items. A value of &lt;code&gt;0&lt;/code&gt; indicates it is not mandatory to specify parts compatibilities when listing.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMinItemCompatibility() {
        return this.minItemCompatibility;
    }
    /**
     * Gets the nonSubscription property value. The value in this field indicates whether the category supports Motors Local Market listings if the seller does not have a vehicle subscription. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:GeographicExposureEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNonSubscription() {
        return this.nonSubscription;
    }
    /**
     * Gets the premiumSubscription property value. The value in this field indicates whether the category supports Motors Local Market listings if the seller has a Premium vehicle subscription. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:GeographicExposureEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPremiumSubscription() {
        return this.premiumSubscription;
    }
    /**
     * Gets the regularSubscription property value. The value in this field indicates whether the category supports Motors Local Market listings if the seller has a Regular vehicle subscription. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:GeographicExposureEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRegularSubscription() {
        return this.regularSubscription;
    }
    /**
     * Gets the sellerProvidedTitleSupported property value. This field is returned as &lt;code&gt;true&lt;/code&gt; if the corresponding category supports the use of a seller-provided title for a motor vehicle listing on the US or Canada Motors marketplaces. A seller-provided title is a descriptive title, given by the seller, that appears below eBay&apos;s pre-filled listing title for the motor vehicle. Visually, the seller-provided title is similar to a subtitle on other types of eBay listings (non-vehicle). A seller-provided title can assist in helping buyers discover the vehicle.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSellerProvidedTitleSupported() {
        return this.sellerProvidedTitleSupported;
    }
    /**
     * Gets the specialitySubscription property value. The value in this field indicates whether the category supports Motors Local Market listings if the seller has a Specialty vehicle subscription. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:GeographicExposureEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSpecialitySubscription() {
        return this.specialitySubscription;
    }
    /**
     * Gets the vinSupported property value. Indicates if Vehicle Identification Number is supported.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getVinSupported() {
        return this.vinSupported;
    }
    /**
     * Gets the vrmSupported property value. Indicates if Vehicle Registration Mark is supported.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getVrmSupported() {
        return this.vrmSupported;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("categoryId", this.getCategoryId());
        writer.writeStringValue("categoryTreeId", this.getCategoryTreeId());
        writer.writeBooleanValue("depositSupported", this.getDepositSupported());
        writer.writeStringValue("ebayMotorsProAdFormatEnabled", this.getEbayMotorsProAdFormatEnabled());
        writer.writeBooleanValue("ebayMotorsProAutoAcceptEnabled", this.getEbayMotorsProAutoAcceptEnabled());
        writer.writeBooleanValue("ebayMotorsProAutoDeclineEnabled", this.getEbayMotorsProAutoDeclineEnabled());
        writer.writeStringValue("ebayMotorsProBestOfferEnabled", this.getEbayMotorsProBestOfferEnabled());
        writer.writeBooleanValue("ebayMotorsProCompanyNameEnabled", this.getEbayMotorsProCompanyNameEnabled());
        writer.writeBooleanValue("ebayMotorsProContactByAddressEnabled", this.getEbayMotorsProContactByAddressEnabled());
        writer.writeBooleanValue("ebayMotorsProContactByEmailEnabled", this.getEbayMotorsProContactByEmailEnabled());
        writer.writeBooleanValue("ebayMotorsProContactByPhoneEnabled", this.getEbayMotorsProContactByPhoneEnabled());
        writer.writeBooleanValue("ebayMotorsProCounterOfferEnabled", this.getEbayMotorsProCounterOfferEnabled());
        writer.writeStringValue("ebayMotorsProPaymentMethodCheckOutEnabled", this.getEbayMotorsProPaymentMethodCheckOutEnabled());
        writer.writeIntegerValue("ebayMotorsProPhoneCount", this.getEbayMotorsProPhoneCount());
        writer.writeBooleanValue("ebayMotorsProSellerContactDetailsEnabled", this.getEbayMotorsProSellerContactDetailsEnabled());
        writer.writeBooleanValue("ebayMotorsProShippingMethodEnabled", this.getEbayMotorsProShippingMethodEnabled());
        writer.writeIntegerValue("ebayMotorsProStreetCount", this.getEbayMotorsProStreetCount());
        writer.writeBooleanValue("epidSupported", this.getEpidSupported());
        writer.writeBooleanValue("kTypeSupported", this.getKTypeSupported());
        writer.writeCollectionOfObjectValues("localListingDistances", this.getLocalListingDistances());
        writer.writeStringValue("localMarketAdFormatEnabled", this.getLocalMarketAdFormatEnabled());
        writer.writeBooleanValue("localMarketAutoAcceptEnabled", this.getLocalMarketAutoAcceptEnabled());
        writer.writeBooleanValue("localMarketAutoDeclineEnabled", this.getLocalMarketAutoDeclineEnabled());
        writer.writeStringValue("localMarketBestOfferEnabled", this.getLocalMarketBestOfferEnabled());
        writer.writeBooleanValue("localMarketCompanyNameEnabled", this.getLocalMarketCompanyNameEnabled());
        writer.writeBooleanValue("localMarketContactByAddressEnabled", this.getLocalMarketContactByAddressEnabled());
        writer.writeBooleanValue("localMarketContactByEmailEnabled", this.getLocalMarketContactByEmailEnabled());
        writer.writeBooleanValue("localMarketContactByPhoneEnabled", this.getLocalMarketContactByPhoneEnabled());
        writer.writeBooleanValue("localMarketCounterOfferEnabled", this.getLocalMarketCounterOfferEnabled());
        writer.writeBooleanValue("localMarketNonSubscription", this.getLocalMarketNonSubscription());
        writer.writeStringValue("localMarketPaymentMethodCheckOutEnabled", this.getLocalMarketPaymentMethodCheckOutEnabled());
        writer.writeIntegerValue("localMarketPhoneCount", this.getLocalMarketPhoneCount());
        writer.writeBooleanValue("localMarketPremiumSubscription", this.getLocalMarketPremiumSubscription());
        writer.writeBooleanValue("localMarketRegularSubscription", this.getLocalMarketRegularSubscription());
        writer.writeBooleanValue("localMarketSellerContactDetailsEnabled", this.getLocalMarketSellerContactDetailsEnabled());
        writer.writeBooleanValue("localMarketShippingMethodEnabled", this.getLocalMarketShippingMethodEnabled());
        writer.writeBooleanValue("localMarketSpecialitySubscription", this.getLocalMarketSpecialitySubscription());
        writer.writeIntegerValue("localMarketStreetCount", this.getLocalMarketStreetCount());
        writer.writeIntegerValue("maxGranularFitmentCount", this.getMaxGranularFitmentCount());
        writer.writeIntegerValue("maxItemCompatibility", this.getMaxItemCompatibility());
        writer.writeIntegerValue("minItemCompatibility", this.getMinItemCompatibility());
        writer.writeStringValue("nonSubscription", this.getNonSubscription());
        writer.writeStringValue("premiumSubscription", this.getPremiumSubscription());
        writer.writeStringValue("regularSubscription", this.getRegularSubscription());
        writer.writeBooleanValue("sellerProvidedTitleSupported", this.getSellerProvidedTitleSupported());
        writer.writeStringValue("specialitySubscription", this.getSpecialitySubscription());
        writer.writeBooleanValue("vinSupported", this.getVinSupported());
        writer.writeBooleanValue("vrmSupported", this.getVrmSupported());
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
     * Sets the depositSupported property value. This field is returned as &lt;code&gt;true&lt;/code&gt; if the corresponding category supports the use of a deposit/down payment on a motor vehicle listing. In an AddItem call, the seller can configure a down payment for a motor vehicle listing using the PaymentDetails container.
     * @param value Value to set for the depositSupported property.
     */
    public void setDepositSupported(@jakarta.annotation.Nullable final Boolean value) {
        this.depositSupported = value;
    }
    /**
     * Sets the ebayMotorsProAdFormatEnabled property value. Indicates whether or not eBay Motors Pro sellers can use classified ads in this category to sell their vehicles. This element is applicable for eBay Motors Pro users. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:AdFormatEnabledEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the ebayMotorsProAdFormatEnabled property.
     */
    public void setEbayMotorsProAdFormatEnabled(@jakarta.annotation.Nullable final String value) {
        this.ebayMotorsProAdFormatEnabled = value;
    }
    /**
     * Sets the ebayMotorsProAutoAcceptEnabled property value. Indicates whether or not the category supports the Best Offer Auto Accept feature for eBay Motors Pro listings. This element is for eBay Motors Pro users.
     * @param value Value to set for the ebayMotorsProAutoAcceptEnabled property.
     */
    public void setEbayMotorsProAutoAcceptEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.ebayMotorsProAutoAcceptEnabled = value;
    }
    /**
     * Sets the ebayMotorsProAutoDeclineEnabled property value. Indicates whether or not the category allows auto-decline for Best Offers for eBay Motors Classified Ad listings. This element is for eBay Motors Pro users.
     * @param value Value to set for the ebayMotorsProAutoDeclineEnabled property.
     */
    public void setEbayMotorsProAutoDeclineEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.ebayMotorsProAutoDeclineEnabled = value;
    }
    /**
     * Sets the ebayMotorsProBestOfferEnabled property value. This enumerated value indicates whether or not Best Offer features are supported for eBay Motors Classified Ad listings in this category. This element is for eBay Motors Pro users. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:ClassifiedAdBestOfferEnabledEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the ebayMotorsProBestOfferEnabled property.
     */
    public void setEbayMotorsProBestOfferEnabled(@jakarta.annotation.Nullable final String value) {
        this.ebayMotorsProBestOfferEnabled = value;
    }
    /**
     * Sets the ebayMotorsProCompanyNameEnabled property value. Indicates whether this category supports including the company name in the seller&apos;s contact information. This element is for eBay Motors Pro users.
     * @param value Value to set for the ebayMotorsProCompanyNameEnabled property.
     */
    public void setEbayMotorsProCompanyNameEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.ebayMotorsProCompanyNameEnabled = value;
    }
    /**
     * Sets the ebayMotorsProContactByAddressEnabled property value. Indicates whether this category supports including the address in the seller&apos;s contact information. This element is for eBay Motors Pro users.
     * @param value Value to set for the ebayMotorsProContactByAddressEnabled property.
     */
    public void setEbayMotorsProContactByAddressEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.ebayMotorsProContactByAddressEnabled = value;
    }
    /**
     * Sets the ebayMotorsProContactByEmailEnabled property value. Indicates whether this category supports including an email address in the seller&apos;s contact information. This element is for eBay Motors Pro users.
     * @param value Value to set for the ebayMotorsProContactByEmailEnabled property.
     */
    public void setEbayMotorsProContactByEmailEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.ebayMotorsProContactByEmailEnabled = value;
    }
    /**
     * Sets the ebayMotorsProContactByPhoneEnabled property value. Indicates whether this category supports including the telephone in the seller&apos;s contact information. This element is for eBay Motors Pro users.
     * @param value Value to set for the ebayMotorsProContactByPhoneEnabled property.
     */
    public void setEbayMotorsProContactByPhoneEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.ebayMotorsProContactByPhoneEnabled = value;
    }
    /**
     * Sets the ebayMotorsProCounterOfferEnabled property value. Indicates whether counter offers are allowed on Best Offers for this category in an eBay Motors Classified Ad listing. This element is for eBay Motors Pro users.
     * @param value Value to set for the ebayMotorsProCounterOfferEnabled property.
     */
    public void setEbayMotorsProCounterOfferEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.ebayMotorsProCounterOfferEnabled = value;
    }
    /**
     * Sets the ebayMotorsProPaymentMethodCheckOutEnabled property value. This enumerated value indicates whether this category supports that the payment method should be displayed to the user for this category in an eBay Motors Classified Ad listing. Even if enabled, checkout may or may not be enabled. This element is for eBay Motors Pro users. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:ClassifiedAdPaymentMethodEnabledEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the ebayMotorsProPaymentMethodCheckOutEnabled property.
     */
    public void setEbayMotorsProPaymentMethodCheckOutEnabled(@jakarta.annotation.Nullable final String value) {
        this.ebayMotorsProPaymentMethodCheckOutEnabled = value;
    }
    /**
     * Sets the ebayMotorsProPhoneCount property value. Indicates the number of phone numbers that can be included through contact information for this category. This element is for eBay Motors Pro users.
     * @param value Value to set for the ebayMotorsProPhoneCount property.
     */
    public void setEbayMotorsProPhoneCount(@jakarta.annotation.Nullable final Integer value) {
        this.ebayMotorsProPhoneCount = value;
    }
    /**
     * Sets the ebayMotorsProSellerContactDetailsEnabled property value. Indicates whether this category allows seller-level contact information for eBay Motors Classified Ad listings. A value of true means seller-level contact information is available for Classified Ad listings. This element is for eBay Motors Pro users.
     * @param value Value to set for the ebayMotorsProSellerContactDetailsEnabled property.
     */
    public void setEbayMotorsProSellerContactDetailsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.ebayMotorsProSellerContactDetailsEnabled = value;
    }
    /**
     * Sets the ebayMotorsProShippingMethodEnabled property value. Indicates if shipping options should be displayed to the user for this category in an eBay Motors Classified Ad listing. This element is for eBay Motors Pro users.
     * @param value Value to set for the ebayMotorsProShippingMethodEnabled property.
     */
    public void setEbayMotorsProShippingMethodEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.ebayMotorsProShippingMethodEnabled = value;
    }
    /**
     * Sets the ebayMotorsProStreetCount property value. This field indicates the number of street addresses allowed in contact information for this category. This element is for eBay Motors Pro users.
     * @param value Value to set for the ebayMotorsProStreetCount property.
     */
    public void setEbayMotorsProStreetCount(@jakarta.annotation.Nullable final Integer value) {
        this.ebayMotorsProStreetCount = value;
    }
    /**
     * Sets the epidSupported property value. If returned as &lt;code&gt;true&lt;/code&gt;, this indicates the category supports the use of an eBay Product ID (e.g. ePID) to identify which motorcycles and/or scooters are compatible with a motor vehicle part or accessory. ePIDs can only be used to identify motorcycles and scooters on the Germany and UK sites.
     * @param value Value to set for the epidSupported property.
     */
    public void setEpidSupported(@jakarta.annotation.Nullable final Boolean value) {
        this.epidSupported = value;
    }
    /**
     * Sets the kTypeSupported property value. This field indicates whether or not the category supports the use of a K type to identify the cars and trucks compatible with a motor vehicle part or accessory. Only the AU, DE, ES, FR, IT, and UK marketplaces support the use of K types. See &lt;a href=&quot;/api-docs/user-guides/static/trading-user-guide/manually-specify-compatibility.html#ktype&quot; target=&quot;_blank&quot;&gt;Compatibility by K type&lt;/a&gt; for more information
     * @param value Value to set for the kTypeSupported property.
     */
    public void setKTypeSupported(@jakarta.annotation.Nullable final Boolean value) {
        this.kTypeSupported = value;
    }
    /**
     * Sets the localListingDistances property value. This array shows the supported distances (in miles) for different types of Local Market subscription types in this category. Motor vehicle listings will be shown to buyers located within these proximities of the vehicle&apos;s location.
     * @param value Value to set for the localListingDistances property.
     */
    public void setLocalListingDistances(@jakarta.annotation.Nullable final java.util.List<LocalListingDistance> value) {
        this.localListingDistances = value;
    }
    /**
     * Sets the localMarketAdFormatEnabled property value. Specifies whether this category supports Motor Local Market Classified Ad listings. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:AdFormatEnabledEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the localMarketAdFormatEnabled property.
     */
    public void setLocalMarketAdFormatEnabled(@jakarta.annotation.Nullable final String value) {
        this.localMarketAdFormatEnabled = value;
    }
    /**
     * Sets the localMarketAutoAcceptEnabled property value. Specifies whether this category supports auto-accept for Best Offers for Motors Local Market Classified Ads.
     * @param value Value to set for the localMarketAutoAcceptEnabled property.
     */
    public void setLocalMarketAutoAcceptEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.localMarketAutoAcceptEnabled = value;
    }
    /**
     * Sets the localMarketAutoDeclineEnabled property value. Specifies whether this category supports auto-decline for Best Offers for Motors Local Market Classified Ads.
     * @param value Value to set for the localMarketAutoDeclineEnabled property.
     */
    public void setLocalMarketAutoDeclineEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.localMarketAutoDeclineEnabled = value;
    }
    /**
     * Sets the localMarketBestOfferEnabled property value. Indicates if Best Offer is enabled/required for Motors Local Market Classified Ad listings in this category.  For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:ClassifiedAdBestOfferEnabledEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the localMarketBestOfferEnabled property.
     */
    public void setLocalMarketBestOfferEnabled(@jakarta.annotation.Nullable final String value) {
        this.localMarketBestOfferEnabled = value;
    }
    /**
     * Sets the localMarketCompanyNameEnabled property value. Indicates whether the category supports the seller&apos;s company name being specified when using Motors Local Market classified ads.
     * @param value Value to set for the localMarketCompanyNameEnabled property.
     */
    public void setLocalMarketCompanyNameEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.localMarketCompanyNameEnabled = value;
    }
    /**
     * Sets the localMarketContactByAddressEnabled property value. Indicates whether this category supports including the address in the seller&apos;s contact information.
     * @param value Value to set for the localMarketContactByAddressEnabled property.
     */
    public void setLocalMarketContactByAddressEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.localMarketContactByAddressEnabled = value;
    }
    /**
     * Sets the localMarketContactByEmailEnabled property value. Indicates whether the category supports including an email address in the seller&apos;s contact information. 
     * @param value Value to set for the localMarketContactByEmailEnabled property.
     */
    public void setLocalMarketContactByEmailEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.localMarketContactByEmailEnabled = value;
    }
    /**
     * Sets the localMarketContactByPhoneEnabled property value. Indicates whether this category supports including the telephone in the seller&apos;s contact information.
     * @param value Value to set for the localMarketContactByPhoneEnabled property.
     */
    public void setLocalMarketContactByPhoneEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.localMarketContactByPhoneEnabled = value;
    }
    /**
     * Sets the localMarketCounterOfferEnabled property value. Indicates whether counter offers are allowed on Best Offers for this category for Motors Local Market Classified Ad listings.
     * @param value Value to set for the localMarketCounterOfferEnabled property.
     */
    public void setLocalMarketCounterOfferEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.localMarketCounterOfferEnabled = value;
    }
    /**
     * Sets the localMarketNonSubscription property value. Indicates whether the category supports a seller creating a Motors Local Market listing without a subscription. This feature is only available to licensed vehicle dealers.
     * @param value Value to set for the localMarketNonSubscription property.
     */
    public void setLocalMarketNonSubscription(@jakarta.annotation.Nullable final Boolean value) {
        this.localMarketNonSubscription = value;
    }
    /**
     * Sets the localMarketPaymentMethodCheckOutEnabled property value. Indicates if the payment method should be displayed to the user for this category in an Motors Local Market Classified Ad listing. Even if enabled, checkout may or may not be enabled. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:ClassifiedAdPaymentMethodEnabledEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the localMarketPaymentMethodCheckOutEnabled property.
     */
    public void setLocalMarketPaymentMethodCheckOutEnabled(@jakarta.annotation.Nullable final String value) {
        this.localMarketPaymentMethodCheckOutEnabled = value;
    }
    /**
     * Sets the localMarketPhoneCount property value. Indicates the number of phone numbers that can be included through contact information for this category.
     * @param value Value to set for the localMarketPhoneCount property.
     */
    public void setLocalMarketPhoneCount(@jakarta.annotation.Nullable final Integer value) {
        this.localMarketPhoneCount = value;
    }
    /**
     * Sets the localMarketPremiumSubscription property value. Indicates whether the category supports the Premium level subscription Motors Local Market listings. This feature is only available to licensed vehicle dealers.
     * @param value Value to set for the localMarketPremiumSubscription property.
     */
    public void setLocalMarketPremiumSubscription(@jakarta.annotation.Nullable final Boolean value) {
        this.localMarketPremiumSubscription = value;
    }
    /**
     * Sets the localMarketRegularSubscription property value. Indicates whether the category supports the Regular level subscription to Motors Local Market listings. This feature is only available to licensed vehicle dealers.
     * @param value Value to set for the localMarketRegularSubscription property.
     */
    public void setLocalMarketRegularSubscription(@jakarta.annotation.Nullable final Boolean value) {
        this.localMarketRegularSubscription = value;
    }
    /**
     * Sets the localMarketSellerContactDetailsEnabled property value. Specifies the whether this category allows seller-level contact information for Motors Local Market Classified Ad listings.
     * @param value Value to set for the localMarketSellerContactDetailsEnabled property.
     */
    public void setLocalMarketSellerContactDetailsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.localMarketSellerContactDetailsEnabled = value;
    }
    /**
     * Sets the localMarketShippingMethodEnabled property value. Indicates if shipping methods should be displayed to the user for this category in an Motors Local Market Classified Ad listing. Even if enabled, checkout may or may not be enabled.
     * @param value Value to set for the localMarketShippingMethodEnabled property.
     */
    public void setLocalMarketShippingMethodEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.localMarketShippingMethodEnabled = value;
    }
    /**
     * Sets the localMarketSpecialitySubscription property value. Indicates whether the category supports the Speciality level subscription to Motors Local Market listings. This feature is only available to licensed vehicle dealers.
     * @param value Value to set for the localMarketSpecialitySubscription property.
     */
    public void setLocalMarketSpecialitySubscription(@jakarta.annotation.Nullable final Boolean value) {
        this.localMarketSpecialitySubscription = value;
    }
    /**
     * Sets the localMarketStreetCount property value. Indicates which address option is enabled for the seller&apos;s contact information.
     * @param value Value to set for the localMarketStreetCount property.
     */
    public void setLocalMarketStreetCount(@jakarta.annotation.Nullable final Integer value) {
        this.localMarketStreetCount = value;
    }
    /**
     * Sets the maxGranularFitmentCount property value. Indicates the maximum number of compatible applications allowed per item when adding or revising items with compatibilities provided at the most detailed granularity. For example, in Car and Truck Parts on the US site, the most granular application would include Year, Make, Model, Trim, and Engine.
     * @param value Value to set for the maxGranularFitmentCount property.
     */
    public void setMaxGranularFitmentCount(@jakarta.annotation.Nullable final Integer value) {
        this.maxGranularFitmentCount = value;
    }
    /**
     * Sets the maxItemCompatibility property value. Indicates the maximum number of compatible applications allowed per item when adding or revising items. This is relevant for specifying parts compatibility by application manually only. See &lt;a href=&quot;/api-docs/user-guides/static/trading-user-guide/manually-specify-compatibility.html&quot; target=&quot;_blank&quot;&gt;Specify parts compatibility manually&lt;/a&gt; and &lt;a href=&quot;/api-docs/sell/static/inventory/managing-product-compatibility.html&quot; target=&quot;_blank&quot;&gt;Managing product compatibility&lt;/a&gt; for more information.
     * @param value Value to set for the maxItemCompatibility property.
     */
    public void setMaxItemCompatibility(@jakarta.annotation.Nullable final Integer value) {
        this.maxItemCompatibility = value;
    }
    /**
     * Sets the minItemCompatibility property value. Indicates the minimum number of required compatible applications for listing items. A value of &lt;code&gt;0&lt;/code&gt; indicates it is not mandatory to specify parts compatibilities when listing.
     * @param value Value to set for the minItemCompatibility property.
     */
    public void setMinItemCompatibility(@jakarta.annotation.Nullable final Integer value) {
        this.minItemCompatibility = value;
    }
    /**
     * Sets the nonSubscription property value. The value in this field indicates whether the category supports Motors Local Market listings if the seller does not have a vehicle subscription. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:GeographicExposureEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the nonSubscription property.
     */
    public void setNonSubscription(@jakarta.annotation.Nullable final String value) {
        this.nonSubscription = value;
    }
    /**
     * Sets the premiumSubscription property value. The value in this field indicates whether the category supports Motors Local Market listings if the seller has a Premium vehicle subscription. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:GeographicExposureEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the premiumSubscription property.
     */
    public void setPremiumSubscription(@jakarta.annotation.Nullable final String value) {
        this.premiumSubscription = value;
    }
    /**
     * Sets the regularSubscription property value. The value in this field indicates whether the category supports Motors Local Market listings if the seller has a Regular vehicle subscription. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:GeographicExposureEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the regularSubscription property.
     */
    public void setRegularSubscription(@jakarta.annotation.Nullable final String value) {
        this.regularSubscription = value;
    }
    /**
     * Sets the sellerProvidedTitleSupported property value. This field is returned as &lt;code&gt;true&lt;/code&gt; if the corresponding category supports the use of a seller-provided title for a motor vehicle listing on the US or Canada Motors marketplaces. A seller-provided title is a descriptive title, given by the seller, that appears below eBay&apos;s pre-filled listing title for the motor vehicle. Visually, the seller-provided title is similar to a subtitle on other types of eBay listings (non-vehicle). A seller-provided title can assist in helping buyers discover the vehicle.
     * @param value Value to set for the sellerProvidedTitleSupported property.
     */
    public void setSellerProvidedTitleSupported(@jakarta.annotation.Nullable final Boolean value) {
        this.sellerProvidedTitleSupported = value;
    }
    /**
     * Sets the specialitySubscription property value. The value in this field indicates whether the category supports Motors Local Market listings if the seller has a Specialty vehicle subscription. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:GeographicExposureEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the specialitySubscription property.
     */
    public void setSpecialitySubscription(@jakarta.annotation.Nullable final String value) {
        this.specialitySubscription = value;
    }
    /**
     * Sets the vinSupported property value. Indicates if Vehicle Identification Number is supported.
     * @param value Value to set for the vinSupported property.
     */
    public void setVinSupported(@jakarta.annotation.Nullable final Boolean value) {
        this.vinSupported = value;
    }
    /**
     * Sets the vrmSupported property value. Indicates if Vehicle Registration Mark is supported.
     * @param value Value to set for the vrmSupported property.
     */
    public void setVrmSupported(@jakarta.annotation.Nullable final Boolean value) {
        this.vrmSupported = value;
    }
}

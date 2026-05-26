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
 * This type contains the full details of a specified product, including information about the product&apos;s identifiers, product images, aspects, and categories.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Product implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Contains information about  additional images associated with this product. For the primary image, see the &lt;b&gt;image&lt;/b&gt; container.
     */
    private java.util.List<Image> additionalImages;
    /**
     * Contains an array of the category aspects and their values that are associated with this product.
     */
    private java.util.List<Aspect> aspects;
    /**
     * The manufacturer&apos;s brand name for this product.
     */
    private String brand;
    /**
     * The number of distinct motor vehicles that are compatible with the product.&lt;br&gt;&lt;br&gt;This field is only applicable for and will only be returned for Parts &amp; Accessory products on the eBay US Motors marketplace.
     */
    private Integer compatibilityCount;
    /**
     * The rich description of this product, which might contain HTML.
     */
    private String description;
    /**
     * A list of all European Article Numbers (EANs) that identify this product.
     */
    private java.util.List<String> ean;
    /**
     * The eBay product ID of this product.
     */
    private String epid;
    /**
     * A list of all GTINs that identify this product. Currently this can include EAN, ISBN, and UPC identifier types.
     */
    private java.util.List<String> gtin;
    /**
     * This type contains information about a product image stored in eBay Picture Services (EPS).
     */
    private Image image;
    /**
     * A list of all International Standard Book Numbers (ISBNs) that identify this product. 
     */
    private java.util.List<String> isbn;
    /**
     * A list of all MPN values that the manufacturer uses to identify this product.
     */
    private java.util.List<String> mpn;
    /**
     * A list of category IDs (other than the value of &lt;b&gt;primaryCategoryId&lt;/b&gt;) for all the leaf categories to which this product might belong.
     */
    private java.util.List<String> otherApplicableCategoryIds;
    /**
     * The identifier of the leaf category that eBay recommends using to list this product, based on previous listings of similar products. Products in the eBay catalog are not automatically associated with any particular category, but using an inappropriate category can make it difficult for prospective buyers to find the product. For other possible categories that might be used, see &lt;b&gt;otherApplicableCategoryIds&lt;/b&gt;.
     */
    private String primaryCategoryId;
    /**
     * The URL for this product&apos;s eBay product page.
     */
    private String productWebUrl;
    /**
     * The title of this product on eBay.
     */
    private String title;
    /**
     * A list of Universal Product Codes (UPCs) that identify this product.
     */
    private java.util.List<String> upc;
    /**
     * The current version number of this product record in the catalog.
     */
    private String version;
    /**
     * Instantiates a new {@link Product} and sets the default values.
     */
    public Product() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Product}
     */
    @jakarta.annotation.Nonnull
    public static Product createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Product();
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
     * Gets the additionalImages property value. Contains information about  additional images associated with this product. For the primary image, see the &lt;b&gt;image&lt;/b&gt; container.
     * @return a {@link java.util.List<Image>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Image> getAdditionalImages() {
        return this.additionalImages;
    }
    /**
     * Gets the aspects property value. Contains an array of the category aspects and their values that are associated with this product.
     * @return a {@link java.util.List<Aspect>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Aspect> getAspects() {
        return this.aspects;
    }
    /**
     * Gets the brand property value. The manufacturer&apos;s brand name for this product.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBrand() {
        return this.brand;
    }
    /**
     * Gets the compatibilityCount property value. The number of distinct motor vehicles that are compatible with the product.&lt;br&gt;&lt;br&gt;This field is only applicable for and will only be returned for Parts &amp; Accessory products on the eBay US Motors marketplace.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCompatibilityCount() {
        return this.compatibilityCount;
    }
    /**
     * Gets the description property value. The rich description of this product, which might contain HTML.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the ean property value. A list of all European Article Numbers (EANs) that identify this product.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getEan() {
        return this.ean;
    }
    /**
     * Gets the epid property value. The eBay product ID of this product.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEpid() {
        return this.epid;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(17);
        deserializerMap.put("additionalImages", (n) -> { this.setAdditionalImages(n.getCollectionOfObjectValues(Image::createFromDiscriminatorValue)); });
        deserializerMap.put("aspects", (n) -> { this.setAspects(n.getCollectionOfObjectValues(Aspect::createFromDiscriminatorValue)); });
        deserializerMap.put("brand", (n) -> { this.setBrand(n.getStringValue()); });
        deserializerMap.put("compatibilityCount", (n) -> { this.setCompatibilityCount(n.getIntegerValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("ean", (n) -> { this.setEan(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("epid", (n) -> { this.setEpid(n.getStringValue()); });
        deserializerMap.put("gtin", (n) -> { this.setGtin(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("image", (n) -> { this.setImage(n.getObjectValue(Image::createFromDiscriminatorValue)); });
        deserializerMap.put("isbn", (n) -> { this.setIsbn(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("mpn", (n) -> { this.setMpn(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("otherApplicableCategoryIds", (n) -> { this.setOtherApplicableCategoryIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("primaryCategoryId", (n) -> { this.setPrimaryCategoryId(n.getStringValue()); });
        deserializerMap.put("productWebUrl", (n) -> { this.setProductWebUrl(n.getStringValue()); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        deserializerMap.put("upc", (n) -> { this.setUpc(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the gtin property value. A list of all GTINs that identify this product. Currently this can include EAN, ISBN, and UPC identifier types.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getGtin() {
        return this.gtin;
    }
    /**
     * Gets the image property value. This type contains information about a product image stored in eBay Picture Services (EPS).
     * @return a {@link Image}
     */
    @jakarta.annotation.Nullable
    public Image getImage() {
        return this.image;
    }
    /**
     * Gets the isbn property value. A list of all International Standard Book Numbers (ISBNs) that identify this product. 
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getIsbn() {
        return this.isbn;
    }
    /**
     * Gets the mpn property value. A list of all MPN values that the manufacturer uses to identify this product.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getMpn() {
        return this.mpn;
    }
    /**
     * Gets the otherApplicableCategoryIds property value. A list of category IDs (other than the value of &lt;b&gt;primaryCategoryId&lt;/b&gt;) for all the leaf categories to which this product might belong.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getOtherApplicableCategoryIds() {
        return this.otherApplicableCategoryIds;
    }
    /**
     * Gets the primaryCategoryId property value. The identifier of the leaf category that eBay recommends using to list this product, based on previous listings of similar products. Products in the eBay catalog are not automatically associated with any particular category, but using an inappropriate category can make it difficult for prospective buyers to find the product. For other possible categories that might be used, see &lt;b&gt;otherApplicableCategoryIds&lt;/b&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPrimaryCategoryId() {
        return this.primaryCategoryId;
    }
    /**
     * Gets the productWebUrl property value. The URL for this product&apos;s eBay product page.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProductWebUrl() {
        return this.productWebUrl;
    }
    /**
     * Gets the title property value. The title of this product on eBay.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTitle() {
        return this.title;
    }
    /**
     * Gets the upc property value. A list of Universal Product Codes (UPCs) that identify this product.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getUpc() {
        return this.upc;
    }
    /**
     * Gets the version property value. The current version number of this product record in the catalog.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVersion() {
        return this.version;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("additionalImages", this.getAdditionalImages());
        writer.writeCollectionOfObjectValues("aspects", this.getAspects());
        writer.writeStringValue("brand", this.getBrand());
        writer.writeIntegerValue("compatibilityCount", this.getCompatibilityCount());
        writer.writeStringValue("description", this.getDescription());
        writer.writeCollectionOfPrimitiveValues("ean", this.getEan());
        writer.writeStringValue("epid", this.getEpid());
        writer.writeCollectionOfPrimitiveValues("gtin", this.getGtin());
        writer.writeObjectValue("image", this.getImage());
        writer.writeCollectionOfPrimitiveValues("isbn", this.getIsbn());
        writer.writeCollectionOfPrimitiveValues("mpn", this.getMpn());
        writer.writeCollectionOfPrimitiveValues("otherApplicableCategoryIds", this.getOtherApplicableCategoryIds());
        writer.writeStringValue("primaryCategoryId", this.getPrimaryCategoryId());
        writer.writeStringValue("productWebUrl", this.getProductWebUrl());
        writer.writeStringValue("title", this.getTitle());
        writer.writeCollectionOfPrimitiveValues("upc", this.getUpc());
        writer.writeStringValue("version", this.getVersion());
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
     * Sets the additionalImages property value. Contains information about  additional images associated with this product. For the primary image, see the &lt;b&gt;image&lt;/b&gt; container.
     * @param value Value to set for the additionalImages property.
     */
    public void setAdditionalImages(@jakarta.annotation.Nullable final java.util.List<Image> value) {
        this.additionalImages = value;
    }
    /**
     * Sets the aspects property value. Contains an array of the category aspects and their values that are associated with this product.
     * @param value Value to set for the aspects property.
     */
    public void setAspects(@jakarta.annotation.Nullable final java.util.List<Aspect> value) {
        this.aspects = value;
    }
    /**
     * Sets the brand property value. The manufacturer&apos;s brand name for this product.
     * @param value Value to set for the brand property.
     */
    public void setBrand(@jakarta.annotation.Nullable final String value) {
        this.brand = value;
    }
    /**
     * Sets the compatibilityCount property value. The number of distinct motor vehicles that are compatible with the product.&lt;br&gt;&lt;br&gt;This field is only applicable for and will only be returned for Parts &amp; Accessory products on the eBay US Motors marketplace.
     * @param value Value to set for the compatibilityCount property.
     */
    public void setCompatibilityCount(@jakarta.annotation.Nullable final Integer value) {
        this.compatibilityCount = value;
    }
    /**
     * Sets the description property value. The rich description of this product, which might contain HTML.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the ean property value. A list of all European Article Numbers (EANs) that identify this product.
     * @param value Value to set for the ean property.
     */
    public void setEan(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.ean = value;
    }
    /**
     * Sets the epid property value. The eBay product ID of this product.
     * @param value Value to set for the epid property.
     */
    public void setEpid(@jakarta.annotation.Nullable final String value) {
        this.epid = value;
    }
    /**
     * Sets the gtin property value. A list of all GTINs that identify this product. Currently this can include EAN, ISBN, and UPC identifier types.
     * @param value Value to set for the gtin property.
     */
    public void setGtin(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.gtin = value;
    }
    /**
     * Sets the image property value. This type contains information about a product image stored in eBay Picture Services (EPS).
     * @param value Value to set for the image property.
     */
    public void setImage(@jakarta.annotation.Nullable final Image value) {
        this.image = value;
    }
    /**
     * Sets the isbn property value. A list of all International Standard Book Numbers (ISBNs) that identify this product. 
     * @param value Value to set for the isbn property.
     */
    public void setIsbn(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.isbn = value;
    }
    /**
     * Sets the mpn property value. A list of all MPN values that the manufacturer uses to identify this product.
     * @param value Value to set for the mpn property.
     */
    public void setMpn(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.mpn = value;
    }
    /**
     * Sets the otherApplicableCategoryIds property value. A list of category IDs (other than the value of &lt;b&gt;primaryCategoryId&lt;/b&gt;) for all the leaf categories to which this product might belong.
     * @param value Value to set for the otherApplicableCategoryIds property.
     */
    public void setOtherApplicableCategoryIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.otherApplicableCategoryIds = value;
    }
    /**
     * Sets the primaryCategoryId property value. The identifier of the leaf category that eBay recommends using to list this product, based on previous listings of similar products. Products in the eBay catalog are not automatically associated with any particular category, but using an inappropriate category can make it difficult for prospective buyers to find the product. For other possible categories that might be used, see &lt;b&gt;otherApplicableCategoryIds&lt;/b&gt;.
     * @param value Value to set for the primaryCategoryId property.
     */
    public void setPrimaryCategoryId(@jakarta.annotation.Nullable final String value) {
        this.primaryCategoryId = value;
    }
    /**
     * Sets the productWebUrl property value. The URL for this product&apos;s eBay product page.
     * @param value Value to set for the productWebUrl property.
     */
    public void setProductWebUrl(@jakarta.annotation.Nullable final String value) {
        this.productWebUrl = value;
    }
    /**
     * Sets the title property value. The title of this product on eBay.
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.title = value;
    }
    /**
     * Sets the upc property value. A list of Universal Product Codes (UPCs) that identify this product.
     * @param value Value to set for the upc property.
     */
    public void setUpc(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.upc = value;
    }
    /**
     * Sets the version property value. The current version number of this product record in the catalog.
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final String value) {
        this.version = value;
    }
}

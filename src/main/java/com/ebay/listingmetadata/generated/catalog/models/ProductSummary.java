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
 * This type contains a summary of a specified product. The product summary includes information about the product&apos;s identifiers, product images, aspects, and the &lt;strong&gt;getProduct&lt;/strong&gt; URL for retrieving the product details.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProductSummary implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This array is returned if the category product has additional images besides the primary image returned in the &lt;strong&gt;image&lt;/strong&gt; container.
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
     * A list of all European Article Numbers (EANs) that identify this product.
     */
    private java.util.List<String> ean;
    /**
     * The eBay product ID of this product.
     */
    private String epid;
    /**
     * A list of all GTINs that identify this product. This includes all of the values returned in the &lt;strong&gt;ean&lt;/strong&gt;, &lt;strong&gt;isbn&lt;/strong&gt;, and &lt;strong&gt;upc&lt;/strong&gt; fields.
     */
    private java.util.List<String> gtin;
    /**
     * Contains information about the primary image of this product. For more images of this product, see the &lt;strong&gt;additionalImages&lt;/strong&gt; container.
     */
    private Image image;
    /**
     * A list of all International Standard Book Numbers (ISBNs) that identify this product.
     */
    private java.util.List<String> isbn;
    /**
     * A list of all Manufacturer Product Number (MPN) values that the manufacturer uses to identify this product.
     */
    private java.util.List<String> mpn;
    /**
     * The URI of the &lt;strong&gt;getProduct&lt;/strong&gt; call request that retrieves this product&apos;s details.
     */
    private String productHref;
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
     * Instantiates a new {@link ProductSummary} and sets the default values.
     */
    public ProductSummary() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ProductSummary}
     */
    @jakarta.annotation.Nonnull
    public static ProductSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProductSummary();
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
     * Gets the additionalImages property value. This array is returned if the category product has additional images besides the primary image returned in the &lt;strong&gt;image&lt;/strong&gt; container.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(13);
        deserializerMap.put("additionalImages", (n) -> { this.setAdditionalImages(n.getCollectionOfObjectValues(Image::createFromDiscriminatorValue)); });
        deserializerMap.put("aspects", (n) -> { this.setAspects(n.getCollectionOfObjectValues(Aspect::createFromDiscriminatorValue)); });
        deserializerMap.put("brand", (n) -> { this.setBrand(n.getStringValue()); });
        deserializerMap.put("ean", (n) -> { this.setEan(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("epid", (n) -> { this.setEpid(n.getStringValue()); });
        deserializerMap.put("gtin", (n) -> { this.setGtin(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("image", (n) -> { this.setImage(n.getObjectValue(Image::createFromDiscriminatorValue)); });
        deserializerMap.put("isbn", (n) -> { this.setIsbn(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("mpn", (n) -> { this.setMpn(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("productHref", (n) -> { this.setProductHref(n.getStringValue()); });
        deserializerMap.put("productWebUrl", (n) -> { this.setProductWebUrl(n.getStringValue()); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        deserializerMap.put("upc", (n) -> { this.setUpc(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the gtin property value. A list of all GTINs that identify this product. This includes all of the values returned in the &lt;strong&gt;ean&lt;/strong&gt;, &lt;strong&gt;isbn&lt;/strong&gt;, and &lt;strong&gt;upc&lt;/strong&gt; fields.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getGtin() {
        return this.gtin;
    }
    /**
     * Gets the image property value. Contains information about the primary image of this product. For more images of this product, see the &lt;strong&gt;additionalImages&lt;/strong&gt; container.
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
     * Gets the mpn property value. A list of all Manufacturer Product Number (MPN) values that the manufacturer uses to identify this product.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getMpn() {
        return this.mpn;
    }
    /**
     * Gets the productHref property value. The URI of the &lt;strong&gt;getProduct&lt;/strong&gt; call request that retrieves this product&apos;s details.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProductHref() {
        return this.productHref;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("additionalImages", this.getAdditionalImages());
        writer.writeCollectionOfObjectValues("aspects", this.getAspects());
        writer.writeStringValue("brand", this.getBrand());
        writer.writeCollectionOfPrimitiveValues("ean", this.getEan());
        writer.writeStringValue("epid", this.getEpid());
        writer.writeCollectionOfPrimitiveValues("gtin", this.getGtin());
        writer.writeObjectValue("image", this.getImage());
        writer.writeCollectionOfPrimitiveValues("isbn", this.getIsbn());
        writer.writeCollectionOfPrimitiveValues("mpn", this.getMpn());
        writer.writeStringValue("productHref", this.getProductHref());
        writer.writeStringValue("productWebUrl", this.getProductWebUrl());
        writer.writeStringValue("title", this.getTitle());
        writer.writeCollectionOfPrimitiveValues("upc", this.getUpc());
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
     * Sets the additionalImages property value. This array is returned if the category product has additional images besides the primary image returned in the &lt;strong&gt;image&lt;/strong&gt; container.
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
     * Sets the gtin property value. A list of all GTINs that identify this product. This includes all of the values returned in the &lt;strong&gt;ean&lt;/strong&gt;, &lt;strong&gt;isbn&lt;/strong&gt;, and &lt;strong&gt;upc&lt;/strong&gt; fields.
     * @param value Value to set for the gtin property.
     */
    public void setGtin(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.gtin = value;
    }
    /**
     * Sets the image property value. Contains information about the primary image of this product. For more images of this product, see the &lt;strong&gt;additionalImages&lt;/strong&gt; container.
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
     * Sets the mpn property value. A list of all Manufacturer Product Number (MPN) values that the manufacturer uses to identify this product.
     * @param value Value to set for the mpn property.
     */
    public void setMpn(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.mpn = value;
    }
    /**
     * Sets the productHref property value. The URI of the &lt;strong&gt;getProduct&lt;/strong&gt; call request that retrieves this product&apos;s details.
     * @param value Value to set for the productHref property.
     */
    public void setProductHref(@jakarta.annotation.Nullable final String value) {
        this.productHref = value;
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
}

package com.ebay.listingmetadata.generated.metadata.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines the supported product identifiers.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProductIdentifier implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The EAN of the item, if applicable. EAN is the European Article Number, a barcode standard for retail product labeling primarily used outside of North America.
     */
    private String ean;
    /**
     * The ePID (eBay Product Identifier) of the item, if applicable. ePID is a unique identifier used by eBay to track products in its catalog.&lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/api-docs/commerce/catalog/resources/product/methods/getProduct&quot; target=&quot;_blank &quot;&gt;getProduct&lt;/a&gt; method of the Catalog API to retrieve the ePID of an item.
     */
    private String epid;
    /**
     * The ISBN of the item, if applicable. ISBN is the International Standard Book Number, a unique identifier for books.
     */
    private String isbn;
    /**
     * The product ID of the item, if applicable. The product ID is a general term for a unique identifier assigned to a product.
     */
    private String productId;
    /**
     * The UPC of the item, if applicable. UPC stands for Universal Product Code, a unique identifier for products, primarily in North America.
     */
    private String upc;
    /**
     * Instantiates a new {@link ProductIdentifier} and sets the default values.
     */
    public ProductIdentifier() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ProductIdentifier}
     */
    @jakarta.annotation.Nonnull
    public static ProductIdentifier createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProductIdentifier();
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
     * Gets the ean property value. The EAN of the item, if applicable. EAN is the European Article Number, a barcode standard for retail product labeling primarily used outside of North America.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEan() {
        return this.ean;
    }
    /**
     * Gets the epid property value. The ePID (eBay Product Identifier) of the item, if applicable. ePID is a unique identifier used by eBay to track products in its catalog.&lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/api-docs/commerce/catalog/resources/product/methods/getProduct&quot; target=&quot;_blank &quot;&gt;getProduct&lt;/a&gt; method of the Catalog API to retrieve the ePID of an item.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("ean", (n) -> { this.setEan(n.getStringValue()); });
        deserializerMap.put("epid", (n) -> { this.setEpid(n.getStringValue()); });
        deserializerMap.put("isbn", (n) -> { this.setIsbn(n.getStringValue()); });
        deserializerMap.put("productId", (n) -> { this.setProductId(n.getStringValue()); });
        deserializerMap.put("upc", (n) -> { this.setUpc(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isbn property value. The ISBN of the item, if applicable. ISBN is the International Standard Book Number, a unique identifier for books.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIsbn() {
        return this.isbn;
    }
    /**
     * Gets the productId property value. The product ID of the item, if applicable. The product ID is a general term for a unique identifier assigned to a product.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProductId() {
        return this.productId;
    }
    /**
     * Gets the upc property value. The UPC of the item, if applicable. UPC stands for Universal Product Code, a unique identifier for products, primarily in North America.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUpc() {
        return this.upc;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("ean", this.getEan());
        writer.writeStringValue("epid", this.getEpid());
        writer.writeStringValue("isbn", this.getIsbn());
        writer.writeStringValue("productId", this.getProductId());
        writer.writeStringValue("upc", this.getUpc());
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
     * Sets the ean property value. The EAN of the item, if applicable. EAN is the European Article Number, a barcode standard for retail product labeling primarily used outside of North America.
     * @param value Value to set for the ean property.
     */
    public void setEan(@jakarta.annotation.Nullable final String value) {
        this.ean = value;
    }
    /**
     * Sets the epid property value. The ePID (eBay Product Identifier) of the item, if applicable. ePID is a unique identifier used by eBay to track products in its catalog.&lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/api-docs/commerce/catalog/resources/product/methods/getProduct&quot; target=&quot;_blank &quot;&gt;getProduct&lt;/a&gt; method of the Catalog API to retrieve the ePID of an item.
     * @param value Value to set for the epid property.
     */
    public void setEpid(@jakarta.annotation.Nullable final String value) {
        this.epid = value;
    }
    /**
     * Sets the isbn property value. The ISBN of the item, if applicable. ISBN is the International Standard Book Number, a unique identifier for books.
     * @param value Value to set for the isbn property.
     */
    public void setIsbn(@jakarta.annotation.Nullable final String value) {
        this.isbn = value;
    }
    /**
     * Sets the productId property value. The product ID of the item, if applicable. The product ID is a general term for a unique identifier assigned to a product.
     * @param value Value to set for the productId property.
     */
    public void setProductId(@jakarta.annotation.Nullable final String value) {
        this.productId = value;
    }
    /**
     * Sets the upc property value. The UPC of the item, if applicable. UPC stands for Universal Product Code, a unique identifier for products, primarily in North America.
     * @param value Value to set for the upc property.
     */
    public void setUpc(@jakarta.annotation.Nullable final String value) {
        this.upc = value;
    }
}

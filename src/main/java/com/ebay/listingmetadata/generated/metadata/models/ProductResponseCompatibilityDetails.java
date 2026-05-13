package com.ebay.listingmetadata.generated.metadata.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines the compatibility details for a product.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProductResponseCompatibilityDetails implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This array returns additional comments about the corresponding product in the form of name-value pairs.
     */
    private java.util.List<PropertyFilterInner> noteDetails;
    /**
     * This array returns details about the product in the form of name-value pairs. 
     */
    private java.util.List<PropertyValues> productDetails;
    /**
     * Instantiates a new {@link ProductResponseCompatibilityDetails} and sets the default values.
     */
    public ProductResponseCompatibilityDetails() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ProductResponseCompatibilityDetails}
     */
    @jakarta.annotation.Nonnull
    public static ProductResponseCompatibilityDetails createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProductResponseCompatibilityDetails();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("noteDetails", (n) -> { this.setNoteDetails(n.getCollectionOfObjectValues(PropertyFilterInner::createFromDiscriminatorValue)); });
        deserializerMap.put("productDetails", (n) -> { this.setProductDetails(n.getCollectionOfObjectValues(PropertyValues::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the noteDetails property value. This array returns additional comments about the corresponding product in the form of name-value pairs.
     * @return a {@link java.util.List<PropertyFilterInner>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PropertyFilterInner> getNoteDetails() {
        return this.noteDetails;
    }
    /**
     * Gets the productDetails property value. This array returns details about the product in the form of name-value pairs. 
     * @return a {@link java.util.List<PropertyValues>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PropertyValues> getProductDetails() {
        return this.productDetails;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("noteDetails", this.getNoteDetails());
        writer.writeCollectionOfObjectValues("productDetails", this.getProductDetails());
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
     * Sets the noteDetails property value. This array returns additional comments about the corresponding product in the form of name-value pairs.
     * @param value Value to set for the noteDetails property.
     */
    public void setNoteDetails(@jakarta.annotation.Nullable final java.util.List<PropertyFilterInner> value) {
        this.noteDetails = value;
    }
    /**
     * Sets the productDetails property value. This array returns details about the product in the form of name-value pairs. 
     * @param value Value to set for the productDetails property.
     */
    public void setProductDetails(@jakarta.annotation.Nullable final java.util.List<PropertyValues> value) {
        this.productDetails = value;
    }
}

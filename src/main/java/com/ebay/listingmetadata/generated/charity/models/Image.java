package com.ebay.listingmetadata.generated.charity.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The logo of the charitable organization.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Image implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The height of the logo image.
     */
    private String height;
    /**
     * The URL to the logo image location.
     */
    private String imageUrl;
    /**
     * The width of the logo image.
     */
    private String width;
    /**
     * Instantiates a new {@link Image} and sets the default values.
     */
    public Image() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Image}
     */
    @jakarta.annotation.Nonnull
    public static Image createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Image();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("height", (n) -> { this.setHeight(n.getStringValue()); });
        deserializerMap.put("imageUrl", (n) -> { this.setImageUrl(n.getStringValue()); });
        deserializerMap.put("width", (n) -> { this.setWidth(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the height property value. The height of the logo image.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getHeight() {
        return this.height;
    }
    /**
     * Gets the imageUrl property value. The URL to the logo image location.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getImageUrl() {
        return this.imageUrl;
    }
    /**
     * Gets the width property value. The width of the logo image.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getWidth() {
        return this.width;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("height", this.getHeight());
        writer.writeStringValue("imageUrl", this.getImageUrl());
        writer.writeStringValue("width", this.getWidth());
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
     * Sets the height property value. The height of the logo image.
     * @param value Value to set for the height property.
     */
    public void setHeight(@jakarta.annotation.Nullable final String value) {
        this.height = value;
    }
    /**
     * Sets the imageUrl property value. The URL to the logo image location.
     * @param value Value to set for the imageUrl property.
     */
    public void setImageUrl(@jakarta.annotation.Nullable final String value) {
        this.imageUrl = value;
    }
    /**
     * Sets the width property value. The width of the logo image.
     * @param value Value to set for the width property.
     */
    public void setWidth(@jakarta.annotation.Nullable final String value) {
        this.width = value;
    }
}

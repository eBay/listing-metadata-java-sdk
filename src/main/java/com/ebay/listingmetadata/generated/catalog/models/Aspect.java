package com.ebay.listingmetadata.generated.catalog.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type contains the name and values of a category aspect.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Aspect implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The localized name of this category aspect.
     */
    private String localizedName;
    /**
     * A list of the localized values of this category aspect.
     */
    private java.util.List<String> localizedValues;
    /**
     * Instantiates a new {@link Aspect} and sets the default values.
     */
    public Aspect() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Aspect}
     */
    @jakarta.annotation.Nonnull
    public static Aspect createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Aspect();
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
        deserializerMap.put("localizedName", (n) -> { this.setLocalizedName(n.getStringValue()); });
        deserializerMap.put("localizedValues", (n) -> { this.setLocalizedValues(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the localizedName property value. The localized name of this category aspect.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLocalizedName() {
        return this.localizedName;
    }
    /**
     * Gets the localizedValues property value. A list of the localized values of this category aspect.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getLocalizedValues() {
        return this.localizedValues;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("localizedName", this.getLocalizedName());
        writer.writeCollectionOfPrimitiveValues("localizedValues", this.getLocalizedValues());
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
     * Sets the localizedName property value. The localized name of this category aspect.
     * @param value Value to set for the localizedName property.
     */
    public void setLocalizedName(@jakarta.annotation.Nullable final String value) {
        this.localizedName = value;
    }
    /**
     * Sets the localizedValues property value. A list of the localized values of this category aspect.
     * @param value Value to set for the localizedValues property.
     */
    public void setLocalizedValues(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.localizedValues = value;
    }
}

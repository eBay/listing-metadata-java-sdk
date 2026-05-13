package com.ebay.listingmetadata.generated.metadata.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines the property names and values that are compatible with the property name values specified in the request.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Compatibility implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This array returns a list of compatibility details associated with the specified property name(s).
     */
    private java.util.List<CompatibilityDetails> compatibilityDetails;
    /**
     * Instantiates a new {@link Compatibility} and sets the default values.
     */
    public Compatibility() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Compatibility}
     */
    @jakarta.annotation.Nonnull
    public static Compatibility createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Compatibility();
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
     * Gets the compatibilityDetails property value. This array returns a list of compatibility details associated with the specified property name(s).
     * @return a {@link java.util.List<CompatibilityDetails>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CompatibilityDetails> getCompatibilityDetails() {
        return this.compatibilityDetails;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("compatibilityDetails", (n) -> { this.setCompatibilityDetails(n.getCollectionOfObjectValues(CompatibilityDetails::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("compatibilityDetails", this.getCompatibilityDetails());
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
     * Sets the compatibilityDetails property value. This array returns a list of compatibility details associated with the specified property name(s).
     * @param value Value to set for the compatibilityDetails property.
     */
    public void setCompatibilityDetails(@jakarta.annotation.Nullable final java.util.List<CompatibilityDetails> value) {
        this.compatibilityDetails = value;
    }
}

package com.ebay.listingmetadata.generated.metadata.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type provides applicable shipping location metadata returned.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ShippingLocationResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The complete list of geographical regions, countries, domestic areas, and special locations for the specified eBay marketplace that can be set as shipping locations.
     */
    private java.util.List<ShippingLocation> shippingLocations;
    /**
     * Instantiates a new {@link ShippingLocationResponse} and sets the default values.
     */
    public ShippingLocationResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ShippingLocationResponse}
     */
    @jakarta.annotation.Nonnull
    public static ShippingLocationResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ShippingLocationResponse();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("shippingLocations", (n) -> { this.setShippingLocations(n.getCollectionOfObjectValues(ShippingLocation::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the shippingLocations property value. The complete list of geographical regions, countries, domestic areas, and special locations for the specified eBay marketplace that can be set as shipping locations.
     * @return a {@link java.util.List<ShippingLocation>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ShippingLocation> getShippingLocations() {
        return this.shippingLocations;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("shippingLocations", this.getShippingLocations());
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
     * Sets the shippingLocations property value. The complete list of geographical regions, countries, domestic areas, and special locations for the specified eBay marketplace that can be set as shipping locations.
     * @param value Value to set for the shippingLocations property.
     */
    public void setShippingLocations(@jakarta.annotation.Nullable final java.util.List<ShippingLocation> value) {
        this.shippingLocations = value;
    }
}

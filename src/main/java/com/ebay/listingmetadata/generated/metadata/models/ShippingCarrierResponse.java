package com.ebay.listingmetadata.generated.metadata.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type provides applicable shipping carrier metadata for returned for the marketplace.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ShippingCarrierResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A list of shipping carriers available for the marketplace.
     */
    private java.util.List<ShippingCarrier> shippingCarriers;
    /**
     * Instantiates a new {@link ShippingCarrierResponse} and sets the default values.
     */
    public ShippingCarrierResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ShippingCarrierResponse}
     */
    @jakarta.annotation.Nonnull
    public static ShippingCarrierResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ShippingCarrierResponse();
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
        deserializerMap.put("shippingCarriers", (n) -> { this.setShippingCarriers(n.getCollectionOfObjectValues(ShippingCarrier::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the shippingCarriers property value. A list of shipping carriers available for the marketplace.
     * @return a {@link java.util.List<ShippingCarrier>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ShippingCarrier> getShippingCarriers() {
        return this.shippingCarriers;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("shippingCarriers", this.getShippingCarriers());
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
     * Sets the shippingCarriers property value. A list of shipping carriers available for the marketplace.
     * @param value Value to set for the shippingCarriers property.
     */
    public void setShippingCarriers(@jakarta.annotation.Nullable final java.util.List<ShippingCarrier> value) {
        this.shippingCarriers = value;
    }
}

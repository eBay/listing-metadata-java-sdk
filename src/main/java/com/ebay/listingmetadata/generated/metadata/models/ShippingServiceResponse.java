package com.ebay.listingmetadata.generated.metadata.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type provides applicable shipping service metadata returned.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ShippingServiceResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A complete list of shipping service options that can be used on the marketplace for shipping items.
     */
    private java.util.List<ShippingService> shippingServices;
    /**
     * Instantiates a new {@link ShippingServiceResponse} and sets the default values.
     */
    public ShippingServiceResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ShippingServiceResponse}
     */
    @jakarta.annotation.Nonnull
    public static ShippingServiceResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ShippingServiceResponse();
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
        deserializerMap.put("shippingServices", (n) -> { this.setShippingServices(n.getCollectionOfObjectValues(ShippingService::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the shippingServices property value. A complete list of shipping service options that can be used on the marketplace for shipping items.
     * @return a {@link java.util.List<ShippingService>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ShippingService> getShippingServices() {
        return this.shippingServices;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("shippingServices", this.getShippingServices());
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
     * Sets the shippingServices property value. A complete list of shipping service options that can be used on the marketplace for shipping items.
     * @param value Value to set for the shippingServices property.
     */
    public void setShippingServices(@jakarta.annotation.Nullable final java.util.List<ShippingService> value) {
        this.shippingServices = value;
    }
}

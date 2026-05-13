package com.ebay.listingmetadata.generated.metadata.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type provides applicable shipping carrier metadata for the marketplace.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ShippingCarrier implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The localized description of the shipping carrier, such as &lt;code&gt;UPS&lt;/code&gt;, &lt;code&gt;FedEx&lt;/code&gt;, and &lt;code&gt;USPS&lt;/code&gt;.
     */
    private String description;
    /**
     * An enumerated value describing the shipping carrier returned, for example, &lt;code&gt;UPS&lt;/code&gt;, &lt;code&gt;FedEx&lt;/code&gt;, and &lt;code&gt;USPS&lt;/code&gt;. These values are needed when providing shipment tracking information for each specific shipping carrier.
     */
    private String shippingCarrier;
    /**
     * Instantiates a new {@link ShippingCarrier} and sets the default values.
     */
    public ShippingCarrier() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ShippingCarrier}
     */
    @jakarta.annotation.Nonnull
    public static ShippingCarrier createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ShippingCarrier();
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
     * Gets the description property value. The localized description of the shipping carrier, such as &lt;code&gt;UPS&lt;/code&gt;, &lt;code&gt;FedEx&lt;/code&gt;, and &lt;code&gt;USPS&lt;/code&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("shippingCarrier", (n) -> { this.setShippingCarrier(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the shippingCarrier property value. An enumerated value describing the shipping carrier returned, for example, &lt;code&gt;UPS&lt;/code&gt;, &lt;code&gt;FedEx&lt;/code&gt;, and &lt;code&gt;USPS&lt;/code&gt;. These values are needed when providing shipment tracking information for each specific shipping carrier.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getShippingCarrier() {
        return this.shippingCarrier;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("shippingCarrier", this.getShippingCarrier());
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
     * Sets the description property value. The localized description of the shipping carrier, such as &lt;code&gt;UPS&lt;/code&gt;, &lt;code&gt;FedEx&lt;/code&gt;, and &lt;code&gt;USPS&lt;/code&gt;.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the shippingCarrier property value. An enumerated value describing the shipping carrier returned, for example, &lt;code&gt;UPS&lt;/code&gt;, &lt;code&gt;FedEx&lt;/code&gt;, and &lt;code&gt;USPS&lt;/code&gt;. These values are needed when providing shipment tracking information for each specific shipping carrier.
     * @param value Value to set for the shippingCarrier property.
     */
    public void setShippingCarrier(@jakarta.annotation.Nullable final String value) {
        this.shippingCarrier = value;
    }
}

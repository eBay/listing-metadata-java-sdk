package com.ebay.listingmetadata.generated.charity.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Location implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The physical location of the item.
     */
    private Address address;
    /**
     * Defines the format of a geographic coordinate.
     */
    private GeoCoordinates geoCoordinates;
    /**
     * Instantiates a new {@link Location} and sets the default values.
     */
    public Location() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Location}
     */
    @jakarta.annotation.Nonnull
    public static Location createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Location();
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
     * Gets the address property value. The physical location of the item.
     * @return a {@link Address}
     */
    @jakarta.annotation.Nullable
    public Address getAddress() {
        return this.address;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("address", (n) -> { this.setAddress(n.getObjectValue(Address::createFromDiscriminatorValue)); });
        deserializerMap.put("geoCoordinates", (n) -> { this.setGeoCoordinates(n.getObjectValue(GeoCoordinates::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the geoCoordinates property value. Defines the format of a geographic coordinate.
     * @return a {@link GeoCoordinates}
     */
    @jakarta.annotation.Nullable
    public GeoCoordinates getGeoCoordinates() {
        return this.geoCoordinates;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("address", this.getAddress());
        writer.writeObjectValue("geoCoordinates", this.getGeoCoordinates());
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
     * Sets the address property value. The physical location of the item.
     * @param value Value to set for the address property.
     */
    public void setAddress(@jakarta.annotation.Nullable final Address value) {
        this.address = value;
    }
    /**
     * Sets the geoCoordinates property value. Defines the format of a geographic coordinate.
     * @param value Value to set for the geoCoordinates property.
     */
    public void setGeoCoordinates(@jakarta.annotation.Nullable final GeoCoordinates value) {
        this.geoCoordinates = value;
    }
}

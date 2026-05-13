package com.ebay.listingmetadata.generated.metadata.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines the response fields for the &lt;b&gt;getMultiCompatibilityPropertyValues&lt;/b&gt; method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MultiCompatibilityPropertyValuesResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This container defines the compatibility details associated with the specified property name value(s).
     */
    private java.util.List<Compatibility> compatibilities;
    /**
     * The version number of the metadata. This version is upticked whenever there are compatibility name changes for the specified marketplace.
     */
    private String metadataVersion;
    /**
     * Instantiates a new {@link MultiCompatibilityPropertyValuesResponse} and sets the default values.
     */
    public MultiCompatibilityPropertyValuesResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MultiCompatibilityPropertyValuesResponse}
     */
    @jakarta.annotation.Nonnull
    public static MultiCompatibilityPropertyValuesResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MultiCompatibilityPropertyValuesResponse();
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
     * Gets the compatibilities property value. This container defines the compatibility details associated with the specified property name value(s).
     * @return a {@link java.util.List<Compatibility>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Compatibility> getCompatibilities() {
        return this.compatibilities;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("compatibilities", (n) -> { this.setCompatibilities(n.getCollectionOfObjectValues(Compatibility::createFromDiscriminatorValue)); });
        deserializerMap.put("metadataVersion", (n) -> { this.setMetadataVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the metadataVersion property value. The version number of the metadata. This version is upticked whenever there are compatibility name changes for the specified marketplace.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMetadataVersion() {
        return this.metadataVersion;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("compatibilities", this.getCompatibilities());
        writer.writeStringValue("metadataVersion", this.getMetadataVersion());
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
     * Sets the compatibilities property value. This container defines the compatibility details associated with the specified property name value(s).
     * @param value Value to set for the compatibilities property.
     */
    public void setCompatibilities(@jakarta.annotation.Nullable final java.util.List<Compatibility> value) {
        this.compatibilities = value;
    }
    /**
     * Sets the metadataVersion property value. The version number of the metadata. This version is upticked whenever there are compatibility name changes for the specified marketplace.
     * @param value Value to set for the metadataVersion property.
     */
    public void setMetadataVersion(@jakarta.annotation.Nullable final String value) {
        this.metadataVersion = value;
    }
}

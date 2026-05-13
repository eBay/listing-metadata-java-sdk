package com.ebay.listingmetadata.generated.metadata.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines the response fields used in the &lt;b&gt;getCompatibilityPropertyValues&lt;/b&gt; method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PropertyValuesResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The version number of the metadata. This version is upticked whenever there are compatibility name changes for the specified marketplace.
     */
    private String metadataVersion;
    /**
     * The name of the property specified in the request.
     */
    private String propertyName;
    /**
     * This array specifies the property values associated with the specified &lt;b&gt;propertyName&lt;/b&gt;, in the specified category.
     */
    private java.util.List<String> propertyValues;
    /**
     * Instantiates a new {@link PropertyValuesResponse} and sets the default values.
     */
    public PropertyValuesResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PropertyValuesResponse}
     */
    @jakarta.annotation.Nonnull
    public static PropertyValuesResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PropertyValuesResponse();
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
        deserializerMap.put("metadataVersion", (n) -> { this.setMetadataVersion(n.getStringValue()); });
        deserializerMap.put("propertyName", (n) -> { this.setPropertyName(n.getStringValue()); });
        deserializerMap.put("propertyValues", (n) -> { this.setPropertyValues(n.getCollectionOfPrimitiveValues(String.class)); });
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
     * Gets the propertyName property value. The name of the property specified in the request.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPropertyName() {
        return this.propertyName;
    }
    /**
     * Gets the propertyValues property value. This array specifies the property values associated with the specified &lt;b&gt;propertyName&lt;/b&gt;, in the specified category.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getPropertyValues() {
        return this.propertyValues;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("metadataVersion", this.getMetadataVersion());
        writer.writeStringValue("propertyName", this.getPropertyName());
        writer.writeCollectionOfPrimitiveValues("propertyValues", this.getPropertyValues());
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
     * Sets the metadataVersion property value. The version number of the metadata. This version is upticked whenever there are compatibility name changes for the specified marketplace.
     * @param value Value to set for the metadataVersion property.
     */
    public void setMetadataVersion(@jakarta.annotation.Nullable final String value) {
        this.metadataVersion = value;
    }
    /**
     * Sets the propertyName property value. The name of the property specified in the request.
     * @param value Value to set for the propertyName property.
     */
    public void setPropertyName(@jakarta.annotation.Nullable final String value) {
        this.propertyName = value;
    }
    /**
     * Sets the propertyValues property value. This array specifies the property values associated with the specified &lt;b&gt;propertyName&lt;/b&gt;, in the specified category.
     * @param value Value to set for the propertyValues property.
     */
    public void setPropertyValues(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.propertyValues = value;
    }
}

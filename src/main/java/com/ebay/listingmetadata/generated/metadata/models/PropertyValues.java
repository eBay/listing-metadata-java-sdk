package com.ebay.listingmetadata.generated.metadata.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines the name-value pair associated with a property value.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PropertyValues implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The name of the property.&lt;br&gt;&lt;br&gt;For example, typical vehicle property names are &apos;Make&apos;, &apos;Model&apos;, &apos;Year&apos;, &apos;Engine&apos;, and &apos;Trim&apos;, but will vary based on the eBay marketplace and the eBay category.
     */
    private String propertyName;
    /**
     * The value for the property specified in the &lt;b&gt;properyName&lt;/b&gt; field.&lt;br&gt;&lt;br&gt;For example, if the &lt;b&gt;propertyName&lt;/b&gt; is &lt;code&gt;make&lt;/code&gt;, then the &lt;b&gt;propertyValue&lt;/b&gt; will be the specific make of the vehicle, such as &lt;code&gt;Toyota&lt;/code&gt;.
     */
    private String propertyValue;
    /**
     * Instantiates a new {@link PropertyValues} and sets the default values.
     */
    public PropertyValues() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PropertyValues}
     */
    @jakarta.annotation.Nonnull
    public static PropertyValues createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PropertyValues();
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
        deserializerMap.put("propertyName", (n) -> { this.setPropertyName(n.getStringValue()); });
        deserializerMap.put("propertyValue", (n) -> { this.setPropertyValue(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the propertyName property value. The name of the property.&lt;br&gt;&lt;br&gt;For example, typical vehicle property names are &apos;Make&apos;, &apos;Model&apos;, &apos;Year&apos;, &apos;Engine&apos;, and &apos;Trim&apos;, but will vary based on the eBay marketplace and the eBay category.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPropertyName() {
        return this.propertyName;
    }
    /**
     * Gets the propertyValue property value. The value for the property specified in the &lt;b&gt;properyName&lt;/b&gt; field.&lt;br&gt;&lt;br&gt;For example, if the &lt;b&gt;propertyName&lt;/b&gt; is &lt;code&gt;make&lt;/code&gt;, then the &lt;b&gt;propertyValue&lt;/b&gt; will be the specific make of the vehicle, such as &lt;code&gt;Toyota&lt;/code&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPropertyValue() {
        return this.propertyValue;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("propertyName", this.getPropertyName());
        writer.writeStringValue("propertyValue", this.getPropertyValue());
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
     * Sets the propertyName property value. The name of the property.&lt;br&gt;&lt;br&gt;For example, typical vehicle property names are &apos;Make&apos;, &apos;Model&apos;, &apos;Year&apos;, &apos;Engine&apos;, and &apos;Trim&apos;, but will vary based on the eBay marketplace and the eBay category.
     * @param value Value to set for the propertyName property.
     */
    public void setPropertyName(@jakarta.annotation.Nullable final String value) {
        this.propertyName = value;
    }
    /**
     * Sets the propertyValue property value. The value for the property specified in the &lt;b&gt;properyName&lt;/b&gt; field.&lt;br&gt;&lt;br&gt;For example, if the &lt;b&gt;propertyName&lt;/b&gt; is &lt;code&gt;make&lt;/code&gt;, then the &lt;b&gt;propertyValue&lt;/b&gt; will be the specific make of the vehicle, such as &lt;code&gt;Toyota&lt;/code&gt;.
     * @param value Value to set for the propertyValue property.
     */
    public void setPropertyValue(@jakarta.annotation.Nullable final String value) {
        this.propertyValue = value;
    }
}

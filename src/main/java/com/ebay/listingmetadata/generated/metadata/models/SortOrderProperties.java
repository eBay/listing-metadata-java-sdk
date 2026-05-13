package com.ebay.listingmetadata.generated.metadata.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type is used to define the property to be used in sorting. 
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SortOrderProperties implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Defines the order of the sort.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values&lt;/b&gt;:&lt;ul&gt;&lt;li&gt;&lt;code&gt;Ascending&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;Descending&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
     */
    private String order;
    /**
     * The name of the searchable property to be used for sorting.&lt;br&gt;&lt;br&gt;For example, typical vehicle property names are &apos;Make&apos;, &apos;Model&apos;, &apos;Year&apos;, &apos;Engine&apos;, and &apos;Trim&apos;, but will vary based on the eBay marketplace and the eBay category.
     */
    private String propertyName;
    /**
     * Instantiates a new {@link SortOrderProperties} and sets the default values.
     */
    public SortOrderProperties() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SortOrderProperties}
     */
    @jakarta.annotation.Nonnull
    public static SortOrderProperties createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SortOrderProperties();
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
        deserializerMap.put("order", (n) -> { this.setOrder(n.getStringValue()); });
        deserializerMap.put("propertyName", (n) -> { this.setPropertyName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the order property value. Defines the order of the sort.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values&lt;/b&gt;:&lt;ul&gt;&lt;li&gt;&lt;code&gt;Ascending&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;Descending&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrder() {
        return this.order;
    }
    /**
     * Gets the propertyName property value. The name of the searchable property to be used for sorting.&lt;br&gt;&lt;br&gt;For example, typical vehicle property names are &apos;Make&apos;, &apos;Model&apos;, &apos;Year&apos;, &apos;Engine&apos;, and &apos;Trim&apos;, but will vary based on the eBay marketplace and the eBay category.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPropertyName() {
        return this.propertyName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("order", this.getOrder());
        writer.writeStringValue("propertyName", this.getPropertyName());
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
     * Sets the order property value. Defines the order of the sort.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values&lt;/b&gt;:&lt;ul&gt;&lt;li&gt;&lt;code&gt;Ascending&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;Descending&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
     * @param value Value to set for the order property.
     */
    public void setOrder(@jakarta.annotation.Nullable final String value) {
        this.order = value;
    }
    /**
     * Sets the propertyName property value. The name of the searchable property to be used for sorting.&lt;br&gt;&lt;br&gt;For example, typical vehicle property names are &apos;Make&apos;, &apos;Model&apos;, &apos;Year&apos;, &apos;Engine&apos;, and &apos;Trim&apos;, but will vary based on the eBay marketplace and the eBay category.
     * @param value Value to set for the propertyName property.
     */
    public void setPropertyName(@jakarta.annotation.Nullable final String value) {
        this.propertyName = value;
    }
}

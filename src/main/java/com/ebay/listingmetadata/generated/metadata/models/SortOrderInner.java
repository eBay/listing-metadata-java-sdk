package com.ebay.listingmetadata.generated.metadata.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type is used to provide the sort order of compatibility properties returned in the response.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SortOrderInner implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This type is used to define the property to be used in sorting. 
     */
    private SortOrderProperties sortOrder;
    /**
     * The priority of the specified sort order provided.&lt;br&gt;&lt;br&gt;For example, when a property is assigned &lt;code&gt;Sort1&lt;/code&gt;, its values are sorted first. Values for the property assigned &lt;code&gt;Sort2&lt;/code&gt; are sorted second, and so on.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values&lt;/b&gt;:&lt;ul&gt;&lt;li&gt;&lt;code&gt;Sort1&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;Sort2&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;Sort3&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;Sort4&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;Sort5&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
     */
    private String sortPriority;
    /**
     * Instantiates a new {@link SortOrderInner} and sets the default values.
     */
    public SortOrderInner() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SortOrderInner}
     */
    @jakarta.annotation.Nonnull
    public static SortOrderInner createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SortOrderInner();
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
        deserializerMap.put("sortOrder", (n) -> { this.setSortOrder(n.getObjectValue(SortOrderProperties::createFromDiscriminatorValue)); });
        deserializerMap.put("sortPriority", (n) -> { this.setSortPriority(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the sortOrder property value. This type is used to define the property to be used in sorting. 
     * @return a {@link SortOrderProperties}
     */
    @jakarta.annotation.Nullable
    public SortOrderProperties getSortOrder() {
        return this.sortOrder;
    }
    /**
     * Gets the sortPriority property value. The priority of the specified sort order provided.&lt;br&gt;&lt;br&gt;For example, when a property is assigned &lt;code&gt;Sort1&lt;/code&gt;, its values are sorted first. Values for the property assigned &lt;code&gt;Sort2&lt;/code&gt; are sorted second, and so on.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values&lt;/b&gt;:&lt;ul&gt;&lt;li&gt;&lt;code&gt;Sort1&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;Sort2&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;Sort3&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;Sort4&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;Sort5&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSortPriority() {
        return this.sortPriority;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("sortOrder", this.getSortOrder());
        writer.writeStringValue("sortPriority", this.getSortPriority());
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
     * Sets the sortOrder property value. This type is used to define the property to be used in sorting. 
     * @param value Value to set for the sortOrder property.
     */
    public void setSortOrder(@jakarta.annotation.Nullable final SortOrderProperties value) {
        this.sortOrder = value;
    }
    /**
     * Sets the sortPriority property value. The priority of the specified sort order provided.&lt;br&gt;&lt;br&gt;For example, when a property is assigned &lt;code&gt;Sort1&lt;/code&gt;, its values are sorted first. Values for the property assigned &lt;code&gt;Sort2&lt;/code&gt; are sorted second, and so on.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values&lt;/b&gt;:&lt;ul&gt;&lt;li&gt;&lt;code&gt;Sort1&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;Sort2&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;Sort3&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;Sort4&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;Sort5&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;
     * @param value Value to set for the sortPriority property.
     */
    public void setSortPriority(@jakarta.annotation.Nullable final String value) {
        this.sortPriority = value;
    }
}

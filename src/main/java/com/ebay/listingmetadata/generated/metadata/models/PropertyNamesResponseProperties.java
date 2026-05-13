package com.ebay.listingmetadata.generated.metadata.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines the properties and dataset for a specified category.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PropertyNamesResponseProperties implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This field defines the types of properties are returned for the specified catalog-enabled category.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;DisplayableProductDetails&lt;/code&gt;: Properties for use in a user interface to describe products.&lt;/li&gt;&lt;li&gt;&lt;code&gt;DisplayableSearchResults&lt;/code&gt;: Properties for use in results for product searches.&lt;/li&gt;&lt;li&gt;&lt;code&gt;Searchable&lt;/code&gt;: Properties for use in searches.&lt;/li&gt;&lt;li&gt;&lt;code&gt;Sortable&lt;/code&gt;: Properties that are suitable for sorting.&lt;/li&gt;&lt;/ul&gt;
     */
    private String dataset;
    /**
     * This array specifies the names of the properties associated with the specified category in the specified marketplace.&lt;br&gt;&lt;br&gt;For example, typical vehicle property names are &apos;Make&apos;, &apos;Model&apos;, &apos;Year&apos;, &apos;Engine&apos;, and &apos;Trim&apos;, but will vary based on the eBay marketplace and the eBay category.
     */
    private java.util.List<PropertyNamesResponsePropertyNames> propertyNames;
    /**
     * Instantiates a new {@link PropertyNamesResponseProperties} and sets the default values.
     */
    public PropertyNamesResponseProperties() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PropertyNamesResponseProperties}
     */
    @jakarta.annotation.Nonnull
    public static PropertyNamesResponseProperties createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PropertyNamesResponseProperties();
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
     * Gets the dataset property value. This field defines the types of properties are returned for the specified catalog-enabled category.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;DisplayableProductDetails&lt;/code&gt;: Properties for use in a user interface to describe products.&lt;/li&gt;&lt;li&gt;&lt;code&gt;DisplayableSearchResults&lt;/code&gt;: Properties for use in results for product searches.&lt;/li&gt;&lt;li&gt;&lt;code&gt;Searchable&lt;/code&gt;: Properties for use in searches.&lt;/li&gt;&lt;li&gt;&lt;code&gt;Sortable&lt;/code&gt;: Properties that are suitable for sorting.&lt;/li&gt;&lt;/ul&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDataset() {
        return this.dataset;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("dataset", (n) -> { this.setDataset(n.getStringValue()); });
        deserializerMap.put("propertyNames", (n) -> { this.setPropertyNames(n.getCollectionOfObjectValues(PropertyNamesResponsePropertyNames::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the propertyNames property value. This array specifies the names of the properties associated with the specified category in the specified marketplace.&lt;br&gt;&lt;br&gt;For example, typical vehicle property names are &apos;Make&apos;, &apos;Model&apos;, &apos;Year&apos;, &apos;Engine&apos;, and &apos;Trim&apos;, but will vary based on the eBay marketplace and the eBay category.
     * @return a {@link java.util.List<PropertyNamesResponsePropertyNames>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PropertyNamesResponsePropertyNames> getPropertyNames() {
        return this.propertyNames;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("dataset", this.getDataset());
        writer.writeCollectionOfObjectValues("propertyNames", this.getPropertyNames());
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
     * Sets the dataset property value. This field defines the types of properties are returned for the specified catalog-enabled category.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;DisplayableProductDetails&lt;/code&gt;: Properties for use in a user interface to describe products.&lt;/li&gt;&lt;li&gt;&lt;code&gt;DisplayableSearchResults&lt;/code&gt;: Properties for use in results for product searches.&lt;/li&gt;&lt;li&gt;&lt;code&gt;Searchable&lt;/code&gt;: Properties for use in searches.&lt;/li&gt;&lt;li&gt;&lt;code&gt;Sortable&lt;/code&gt;: Properties that are suitable for sorting.&lt;/li&gt;&lt;/ul&gt;
     * @param value Value to set for the dataset property.
     */
    public void setDataset(@jakarta.annotation.Nullable final String value) {
        this.dataset = value;
    }
    /**
     * Sets the propertyNames property value. This array specifies the names of the properties associated with the specified category in the specified marketplace.&lt;br&gt;&lt;br&gt;For example, typical vehicle property names are &apos;Make&apos;, &apos;Model&apos;, &apos;Year&apos;, &apos;Engine&apos;, and &apos;Trim&apos;, but will vary based on the eBay marketplace and the eBay category.
     * @param value Value to set for the propertyNames property.
     */
    public void setPropertyNames(@jakarta.annotation.Nullable final java.util.List<PropertyNamesResponsePropertyNames> value) {
        this.propertyNames = value;
    }
}

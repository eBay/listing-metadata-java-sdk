package com.ebay.listingmetadata.generated.taxonomy.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The base response type of the &lt;strong&gt;getCompatibilityPropertyValues&lt;/strong&gt; method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetCompatibilityPropertyValuesResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This array contains all compatible vehicle property values that match the specified eBay marketplace, specified eBay category, and filters in the request. If the &lt;strong&gt;compatibility_property&lt;/strong&gt; parameter value in the request is &apos;Trim&apos;, each value returned in each &lt;strong&gt;value&lt;/strong&gt; field will be a different vehicle trim, applicable to any filters that are set in the &lt;string&gt;filter&lt;/string&gt; query parameter of the request, and also based on the eBay marketplace and category specified in the call request.
     */
    private java.util.List<CompatibilityPropertyValue> compatibilityPropertyValues;
    /**
     * Instantiates a new {@link GetCompatibilityPropertyValuesResponse} and sets the default values.
     */
    public GetCompatibilityPropertyValuesResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GetCompatibilityPropertyValuesResponse}
     */
    @jakarta.annotation.Nonnull
    public static GetCompatibilityPropertyValuesResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetCompatibilityPropertyValuesResponse();
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
     * Gets the compatibilityPropertyValues property value. This array contains all compatible vehicle property values that match the specified eBay marketplace, specified eBay category, and filters in the request. If the &lt;strong&gt;compatibility_property&lt;/strong&gt; parameter value in the request is &apos;Trim&apos;, each value returned in each &lt;strong&gt;value&lt;/strong&gt; field will be a different vehicle trim, applicable to any filters that are set in the &lt;string&gt;filter&lt;/string&gt; query parameter of the request, and also based on the eBay marketplace and category specified in the call request.
     * @return a {@link java.util.List<CompatibilityPropertyValue>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CompatibilityPropertyValue> getCompatibilityPropertyValues() {
        return this.compatibilityPropertyValues;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("compatibilityPropertyValues", (n) -> { this.setCompatibilityPropertyValues(n.getCollectionOfObjectValues(CompatibilityPropertyValue::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("compatibilityPropertyValues", this.getCompatibilityPropertyValues());
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
     * Sets the compatibilityPropertyValues property value. This array contains all compatible vehicle property values that match the specified eBay marketplace, specified eBay category, and filters in the request. If the &lt;strong&gt;compatibility_property&lt;/strong&gt; parameter value in the request is &apos;Trim&apos;, each value returned in each &lt;strong&gt;value&lt;/strong&gt; field will be a different vehicle trim, applicable to any filters that are set in the &lt;string&gt;filter&lt;/string&gt; query parameter of the request, and also based on the eBay marketplace and category specified in the call request.
     * @param value Value to set for the compatibilityPropertyValues property.
     */
    public void setCompatibilityPropertyValues(@jakarta.annotation.Nullable final java.util.List<CompatibilityPropertyValue> value) {
        this.compatibilityPropertyValues = value;
    }
}

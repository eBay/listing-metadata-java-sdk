package com.ebay.listingmetadata.generated.taxonomy.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type is the container type for the response payload of the &lt;b&gt;getItemAspectsForCategory&lt;/b&gt; call.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AspectMetadata implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A list of item aspects (for example, color) that are appropriate or necessary for accurately describing items in a particular leaf category. Each category has a different set of aspects and different requirements for aspect values. Sellers are required or encouraged to provide one or more acceptable values for each aspect when offering an item in that category on eBay.
     */
    private java.util.List<Aspect> aspects;
    /**
     * Instantiates a new {@link AspectMetadata} and sets the default values.
     */
    public AspectMetadata() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AspectMetadata}
     */
    @jakarta.annotation.Nonnull
    public static AspectMetadata createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AspectMetadata();
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
     * Gets the aspects property value. A list of item aspects (for example, color) that are appropriate or necessary for accurately describing items in a particular leaf category. Each category has a different set of aspects and different requirements for aspect values. Sellers are required or encouraged to provide one or more acceptable values for each aspect when offering an item in that category on eBay.
     * @return a {@link java.util.List<Aspect>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Aspect> getAspects() {
        return this.aspects;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("aspects", (n) -> { this.setAspects(n.getCollectionOfObjectValues(Aspect::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("aspects", this.getAspects());
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
     * Sets the aspects property value. A list of item aspects (for example, color) that are appropriate or necessary for accurately describing items in a particular leaf category. Each category has a different set of aspects and different requirements for aspect values. Sellers are required or encouraged to provide one or more acceptable values for each aspect when offering an item in that category on eBay.
     * @param value Value to set for the aspects property.
     */
    public void setAspects(@jakarta.annotation.Nullable final java.util.List<Aspect> value) {
        this.aspects = value;
    }
}

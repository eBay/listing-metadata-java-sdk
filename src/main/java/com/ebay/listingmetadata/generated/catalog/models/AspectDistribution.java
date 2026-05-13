package com.ebay.listingmetadata.generated.catalog.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type contains information about one category aspect that is associated with a specified category.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AspectDistribution implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Contains information about one or more values of the category aspect identified by &lt;b&gt;localizedAspectName&lt;/b&gt;. 
     */
    private java.util.List<AspectValueDistribution> aspectValueDistributions;
    /**
     * The localized name of an aspect that is associated with the category identified by &lt;b&gt;dominantCategoryId&lt;/b&gt;.
     */
    private String localizedAspectName;
    /**
     * Instantiates a new {@link AspectDistribution} and sets the default values.
     */
    public AspectDistribution() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AspectDistribution}
     */
    @jakarta.annotation.Nonnull
    public static AspectDistribution createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AspectDistribution();
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
     * Gets the aspectValueDistributions property value. Contains information about one or more values of the category aspect identified by &lt;b&gt;localizedAspectName&lt;/b&gt;. 
     * @return a {@link java.util.List<AspectValueDistribution>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AspectValueDistribution> getAspectValueDistributions() {
        return this.aspectValueDistributions;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("aspectValueDistributions", (n) -> { this.setAspectValueDistributions(n.getCollectionOfObjectValues(AspectValueDistribution::createFromDiscriminatorValue)); });
        deserializerMap.put("localizedAspectName", (n) -> { this.setLocalizedAspectName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the localizedAspectName property value. The localized name of an aspect that is associated with the category identified by &lt;b&gt;dominantCategoryId&lt;/b&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLocalizedAspectName() {
        return this.localizedAspectName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("aspectValueDistributions", this.getAspectValueDistributions());
        writer.writeStringValue("localizedAspectName", this.getLocalizedAspectName());
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
     * Sets the aspectValueDistributions property value. Contains information about one or more values of the category aspect identified by &lt;b&gt;localizedAspectName&lt;/b&gt;. 
     * @param value Value to set for the aspectValueDistributions property.
     */
    public void setAspectValueDistributions(@jakarta.annotation.Nullable final java.util.List<AspectValueDistribution> value) {
        this.aspectValueDistributions = value;
    }
    /**
     * Sets the localizedAspectName property value. The localized name of an aspect that is associated with the category identified by &lt;b&gt;dominantCategoryId&lt;/b&gt;.
     * @param value Value to set for the localizedAspectName property.
     */
    public void setLocalizedAspectName(@jakarta.annotation.Nullable final String value) {
        this.localizedAspectName = value;
    }
}

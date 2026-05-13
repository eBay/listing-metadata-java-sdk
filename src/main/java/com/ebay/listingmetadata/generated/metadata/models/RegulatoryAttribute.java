package com.ebay.listingmetadata.generated.metadata.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A type that defines the attributes of a regulatory policy.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RegulatoryAttribute implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A unique value identifying a specific regulatory attribute. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:RegulatoryAttributeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String name;
    /**
     * The enumeration value in this field indicates whether the corresponding attribute is recommended or required for the corresponding leaf category. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:GenericUsageEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String usage;
    /**
     * Instantiates a new {@link RegulatoryAttribute} and sets the default values.
     */
    public RegulatoryAttribute() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RegulatoryAttribute}
     */
    @jakarta.annotation.Nonnull
    public static RegulatoryAttribute createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RegulatoryAttribute();
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
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("usage", (n) -> { this.setUsage(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. A unique value identifying a specific regulatory attribute. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:RegulatoryAttributeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the usage property value. The enumeration value in this field indicates whether the corresponding attribute is recommended or required for the corresponding leaf category. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:GenericUsageEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUsage() {
        return this.usage;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("usage", this.getUsage());
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
     * Sets the name property value. A unique value identifying a specific regulatory attribute. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:RegulatoryAttributeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the usage property value. The enumeration value in this field indicates whether the corresponding attribute is recommended or required for the corresponding leaf category. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:GenericUsageEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the usage property.
     */
    public void setUsage(@jakarta.annotation.Nullable final String value) {
        this.usage = value;
    }
}

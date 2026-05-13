package com.ebay.listingmetadata.generated.metadata.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A type that defines the Extended Producer Responsibility policy.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExtendedProducerResponsibilityPolicy implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The unique identifier for the category under which the policy applies.
     */
    private String categoryId;
    /**
     * The unique identifier for the category tree under which the policy applies.
     */
    private String categoryTreeId;
    /**
     * The details regarding the attributes included in the policy, such as their usage guidelines and whether they can be specified at the listing variation level.
     */
    private java.util.List<ExtendedProducerResponsibility> supportedAttributes;
    /**
     * Instantiates a new {@link ExtendedProducerResponsibilityPolicy} and sets the default values.
     */
    public ExtendedProducerResponsibilityPolicy() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ExtendedProducerResponsibilityPolicy}
     */
    @jakarta.annotation.Nonnull
    public static ExtendedProducerResponsibilityPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExtendedProducerResponsibilityPolicy();
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
     * Gets the categoryId property value. The unique identifier for the category under which the policy applies.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCategoryId() {
        return this.categoryId;
    }
    /**
     * Gets the categoryTreeId property value. The unique identifier for the category tree under which the policy applies.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCategoryTreeId() {
        return this.categoryTreeId;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("categoryId", (n) -> { this.setCategoryId(n.getStringValue()); });
        deserializerMap.put("categoryTreeId", (n) -> { this.setCategoryTreeId(n.getStringValue()); });
        deserializerMap.put("supportedAttributes", (n) -> { this.setSupportedAttributes(n.getCollectionOfObjectValues(ExtendedProducerResponsibility::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the supportedAttributes property value. The details regarding the attributes included in the policy, such as their usage guidelines and whether they can be specified at the listing variation level.
     * @return a {@link java.util.List<ExtendedProducerResponsibility>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ExtendedProducerResponsibility> getSupportedAttributes() {
        return this.supportedAttributes;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("categoryId", this.getCategoryId());
        writer.writeStringValue("categoryTreeId", this.getCategoryTreeId());
        writer.writeCollectionOfObjectValues("supportedAttributes", this.getSupportedAttributes());
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
     * Sets the categoryId property value. The unique identifier for the category under which the policy applies.
     * @param value Value to set for the categoryId property.
     */
    public void setCategoryId(@jakarta.annotation.Nullable final String value) {
        this.categoryId = value;
    }
    /**
     * Sets the categoryTreeId property value. The unique identifier for the category tree under which the policy applies.
     * @param value Value to set for the categoryTreeId property.
     */
    public void setCategoryTreeId(@jakarta.annotation.Nullable final String value) {
        this.categoryTreeId = value;
    }
    /**
     * Sets the supportedAttributes property value. The details regarding the attributes included in the policy, such as their usage guidelines and whether they can be specified at the listing variation level.
     * @param value Value to set for the supportedAttributes property.
     */
    public void setSupportedAttributes(@jakarta.annotation.Nullable final java.util.List<ExtendedProducerResponsibility> value) {
        this.supportedAttributes = value;
    }
}

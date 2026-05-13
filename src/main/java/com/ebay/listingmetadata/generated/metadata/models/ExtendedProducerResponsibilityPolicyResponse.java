package com.ebay.listingmetadata.generated.metadata.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A type that defines the response fields for the &lt;b&gt;getExtendedProducerResponsibilityPolicies&lt;/b&gt; method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExtendedProducerResponsibilityPolicyResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * An array of response fields detailing the Extended Producer Responsibility policies supported for the specified marketplace.
     */
    private java.util.List<ExtendedProducerResponsibilityPolicy> extendedProducerResponsibilities;
    /**
     * A collection of warnings generated for the request.
     */
    private java.util.List<Error> warnings;
    /**
     * Instantiates a new {@link ExtendedProducerResponsibilityPolicyResponse} and sets the default values.
     */
    public ExtendedProducerResponsibilityPolicyResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ExtendedProducerResponsibilityPolicyResponse}
     */
    @jakarta.annotation.Nonnull
    public static ExtendedProducerResponsibilityPolicyResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExtendedProducerResponsibilityPolicyResponse();
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
     * Gets the extendedProducerResponsibilities property value. An array of response fields detailing the Extended Producer Responsibility policies supported for the specified marketplace.
     * @return a {@link java.util.List<ExtendedProducerResponsibilityPolicy>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ExtendedProducerResponsibilityPolicy> getExtendedProducerResponsibilities() {
        return this.extendedProducerResponsibilities;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("extendedProducerResponsibilities", (n) -> { this.setExtendedProducerResponsibilities(n.getCollectionOfObjectValues(ExtendedProducerResponsibilityPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("warnings", (n) -> { this.setWarnings(n.getCollectionOfObjectValues(Error::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the warnings property value. A collection of warnings generated for the request.
     * @return a {@link java.util.List<Error>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Error> getWarnings() {
        return this.warnings;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("extendedProducerResponsibilities", this.getExtendedProducerResponsibilities());
        writer.writeCollectionOfObjectValues("warnings", this.getWarnings());
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
     * Sets the extendedProducerResponsibilities property value. An array of response fields detailing the Extended Producer Responsibility policies supported for the specified marketplace.
     * @param value Value to set for the extendedProducerResponsibilities property.
     */
    public void setExtendedProducerResponsibilities(@jakarta.annotation.Nullable final java.util.List<ExtendedProducerResponsibilityPolicy> value) {
        this.extendedProducerResponsibilities = value;
    }
    /**
     * Sets the warnings property value. A collection of warnings generated for the request.
     * @param value Value to set for the warnings property.
     */
    public void setWarnings(@jakarta.annotation.Nullable final java.util.List<Error> value) {
        this.warnings = value;
    }
}

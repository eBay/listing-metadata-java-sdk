package com.ebay.listingmetadata.generated.metadata.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A type that describes hazard statements for hazardous materials labels
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class HazardStatement implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The description of the statement localized to the default language of the marketplace. For sample values, see &lt;a href=&apos;/api-docs/sell/static/metadata/feature-regulatorhazmatcontainer.html#Hazard&apos;&gt;Hazard statement sample values&lt;/a&gt;.
     */
    private String statementDescription;
    /**
     * The identifier of the statement. For sample values, see &lt;a href=&apos;/api-docs/sell/static/metadata/feature-regulatorhazmatcontainer.html#Hazard&apos;&gt;Hazard statement sample values&lt;/a&gt;.
     */
    private String statementId;
    /**
     * Instantiates a new {@link HazardStatement} and sets the default values.
     */
    public HazardStatement() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link HazardStatement}
     */
    @jakarta.annotation.Nonnull
    public static HazardStatement createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new HazardStatement();
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
        deserializerMap.put("statementDescription", (n) -> { this.setStatementDescription(n.getStringValue()); });
        deserializerMap.put("statementId", (n) -> { this.setStatementId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the statementDescription property value. The description of the statement localized to the default language of the marketplace. For sample values, see &lt;a href=&apos;/api-docs/sell/static/metadata/feature-regulatorhazmatcontainer.html#Hazard&apos;&gt;Hazard statement sample values&lt;/a&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStatementDescription() {
        return this.statementDescription;
    }
    /**
     * Gets the statementId property value. The identifier of the statement. For sample values, see &lt;a href=&apos;/api-docs/sell/static/metadata/feature-regulatorhazmatcontainer.html#Hazard&apos;&gt;Hazard statement sample values&lt;/a&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStatementId() {
        return this.statementId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("statementDescription", this.getStatementDescription());
        writer.writeStringValue("statementId", this.getStatementId());
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
     * Sets the statementDescription property value. The description of the statement localized to the default language of the marketplace. For sample values, see &lt;a href=&apos;/api-docs/sell/static/metadata/feature-regulatorhazmatcontainer.html#Hazard&apos;&gt;Hazard statement sample values&lt;/a&gt;.
     * @param value Value to set for the statementDescription property.
     */
    public void setStatementDescription(@jakarta.annotation.Nullable final String value) {
        this.statementDescription = value;
    }
    /**
     * Sets the statementId property value. The identifier of the statement. For sample values, see &lt;a href=&apos;/api-docs/sell/static/metadata/feature-regulatorhazmatcontainer.html#Hazard&apos;&gt;Hazard statement sample values&lt;/a&gt;.
     * @param value Value to set for the statementId property.
     */
    public void setStatementId(@jakarta.annotation.Nullable final String value) {
        this.statementId = value;
    }
}

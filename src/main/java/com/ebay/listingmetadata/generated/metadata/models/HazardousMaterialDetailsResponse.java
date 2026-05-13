package com.ebay.listingmetadata.generated.metadata.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A type that defines the response fields for the &lt;b&gt;getHazardousMaterialsLabels&lt;/b&gt; method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class HazardousMaterialDetailsResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This array contains available hazardous materials hazard pictograms for the specified marketplace.
     */
    private java.util.List<Pictogram> pictograms;
    /**
     * This array contains available hazardous materials signal words for the specified marketplace.
     */
    private java.util.List<SignalWord> signalWords;
    /**
     * This array contains available hazardous materials hazard statements for the specified marketplace.
     */
    private java.util.List<HazardStatement> statements;
    /**
     * Instantiates a new {@link HazardousMaterialDetailsResponse} and sets the default values.
     */
    public HazardousMaterialDetailsResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link HazardousMaterialDetailsResponse}
     */
    @jakarta.annotation.Nonnull
    public static HazardousMaterialDetailsResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new HazardousMaterialDetailsResponse();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("pictograms", (n) -> { this.setPictograms(n.getCollectionOfObjectValues(Pictogram::createFromDiscriminatorValue)); });
        deserializerMap.put("signalWords", (n) -> { this.setSignalWords(n.getCollectionOfObjectValues(SignalWord::createFromDiscriminatorValue)); });
        deserializerMap.put("statements", (n) -> { this.setStatements(n.getCollectionOfObjectValues(HazardStatement::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the pictograms property value. This array contains available hazardous materials hazard pictograms for the specified marketplace.
     * @return a {@link java.util.List<Pictogram>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Pictogram> getPictograms() {
        return this.pictograms;
    }
    /**
     * Gets the signalWords property value. This array contains available hazardous materials signal words for the specified marketplace.
     * @return a {@link java.util.List<SignalWord>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SignalWord> getSignalWords() {
        return this.signalWords;
    }
    /**
     * Gets the statements property value. This array contains available hazardous materials hazard statements for the specified marketplace.
     * @return a {@link java.util.List<HazardStatement>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<HazardStatement> getStatements() {
        return this.statements;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("pictograms", this.getPictograms());
        writer.writeCollectionOfObjectValues("signalWords", this.getSignalWords());
        writer.writeCollectionOfObjectValues("statements", this.getStatements());
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
     * Sets the pictograms property value. This array contains available hazardous materials hazard pictograms for the specified marketplace.
     * @param value Value to set for the pictograms property.
     */
    public void setPictograms(@jakarta.annotation.Nullable final java.util.List<Pictogram> value) {
        this.pictograms = value;
    }
    /**
     * Sets the signalWords property value. This array contains available hazardous materials signal words for the specified marketplace.
     * @param value Value to set for the signalWords property.
     */
    public void setSignalWords(@jakarta.annotation.Nullable final java.util.List<SignalWord> value) {
        this.signalWords = value;
    }
    /**
     * Sets the statements property value. This array contains available hazardous materials hazard statements for the specified marketplace.
     * @param value Value to set for the statements property.
     */
    public void setStatements(@jakarta.annotation.Nullable final java.util.List<HazardStatement> value) {
        this.statements = value;
    }
}

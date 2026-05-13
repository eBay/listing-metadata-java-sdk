package com.ebay.listingmetadata.generated.catalog.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type contains information about one value of a specified aspect. This value serves as a product refinement.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AspectValueDistribution implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The localized value of the category aspect identified by &lt;b&gt;refinement.aspectDistributions.localizedAspectName&lt;/b&gt;.
     */
    private String localizedAspectValue;
    /**
     * The number of times the value of &lt;b&gt;localizedAspectValue&lt;/b&gt; has been used for eBay product listings. By comparing this quantity to the &lt;b&gt;matchCount&lt;/b&gt; for other values of the same aspect, you can present a histogram of the values to sellers, who can use that information to select which aspect value is most appropriate for their product. You can then include the user-selected value in the the &lt;b&gt;search&lt;/b&gt; call&apos;s &lt;b&gt;aspect_filter&lt;/b&gt; parameter to refine your search.
     */
    private Integer matchCount;
    /**
     * A HATEOAS reference that further refines the search with this particular &lt;b&gt;localizedAspectValue&lt;/b&gt;.
     */
    private String refinementHref;
    /**
     * Instantiates a new {@link AspectValueDistribution} and sets the default values.
     */
    public AspectValueDistribution() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AspectValueDistribution}
     */
    @jakarta.annotation.Nonnull
    public static AspectValueDistribution createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AspectValueDistribution();
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
        deserializerMap.put("localizedAspectValue", (n) -> { this.setLocalizedAspectValue(n.getStringValue()); });
        deserializerMap.put("matchCount", (n) -> { this.setMatchCount(n.getIntegerValue()); });
        deserializerMap.put("refinementHref", (n) -> { this.setRefinementHref(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the localizedAspectValue property value. The localized value of the category aspect identified by &lt;b&gt;refinement.aspectDistributions.localizedAspectName&lt;/b&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLocalizedAspectValue() {
        return this.localizedAspectValue;
    }
    /**
     * Gets the matchCount property value. The number of times the value of &lt;b&gt;localizedAspectValue&lt;/b&gt; has been used for eBay product listings. By comparing this quantity to the &lt;b&gt;matchCount&lt;/b&gt; for other values of the same aspect, you can present a histogram of the values to sellers, who can use that information to select which aspect value is most appropriate for their product. You can then include the user-selected value in the the &lt;b&gt;search&lt;/b&gt; call&apos;s &lt;b&gt;aspect_filter&lt;/b&gt; parameter to refine your search.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMatchCount() {
        return this.matchCount;
    }
    /**
     * Gets the refinementHref property value. A HATEOAS reference that further refines the search with this particular &lt;b&gt;localizedAspectValue&lt;/b&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRefinementHref() {
        return this.refinementHref;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("localizedAspectValue", this.getLocalizedAspectValue());
        writer.writeIntegerValue("matchCount", this.getMatchCount());
        writer.writeStringValue("refinementHref", this.getRefinementHref());
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
     * Sets the localizedAspectValue property value. The localized value of the category aspect identified by &lt;b&gt;refinement.aspectDistributions.localizedAspectName&lt;/b&gt;.
     * @param value Value to set for the localizedAspectValue property.
     */
    public void setLocalizedAspectValue(@jakarta.annotation.Nullable final String value) {
        this.localizedAspectValue = value;
    }
    /**
     * Sets the matchCount property value. The number of times the value of &lt;b&gt;localizedAspectValue&lt;/b&gt; has been used for eBay product listings. By comparing this quantity to the &lt;b&gt;matchCount&lt;/b&gt; for other values of the same aspect, you can present a histogram of the values to sellers, who can use that information to select which aspect value is most appropriate for their product. You can then include the user-selected value in the the &lt;b&gt;search&lt;/b&gt; call&apos;s &lt;b&gt;aspect_filter&lt;/b&gt; parameter to refine your search.
     * @param value Value to set for the matchCount property.
     */
    public void setMatchCount(@jakarta.annotation.Nullable final Integer value) {
        this.matchCount = value;
    }
    /**
     * Sets the refinementHref property value. A HATEOAS reference that further refines the search with this particular &lt;b&gt;localizedAspectValue&lt;/b&gt;.
     * @param value Value to set for the refinementHref property.
     */
    public void setRefinementHref(@jakarta.annotation.Nullable final String value) {
        this.refinementHref = value;
    }
}

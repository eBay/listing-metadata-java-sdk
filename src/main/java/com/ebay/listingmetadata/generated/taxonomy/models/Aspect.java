package com.ebay.listingmetadata.generated.taxonomy.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type contains information about an item attribute (for example, color) that is appropriate or necessary for accurately describing items in a particular leaf category. Sellers are required or encouraged to provide one or more values of this aspect when offering an item in that category on eBay.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Aspect implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This type contains information about the formatting, occurrence, and support of an aspect.
     */
    private AspectConstraint aspectConstraint;
    /**
     * A list of valid values for this aspect (for example: &lt;code&gt;Red&lt;/code&gt;, &lt;code&gt;Green&lt;/code&gt;, and &lt;code&gt;Blue&lt;/code&gt;), along with any constraints on those values.
     */
    private java.util.List<AspectValue> aspectValues;
    /**
     * The localized name of this aspect (for example: &lt;code&gt;Colour&lt;/code&gt; on the eBay UK site). &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; This name is always localized for the specified marketplace. &lt;/span&gt;
     */
    private String localizedAspectName;
    /**
     * The relevance of this aspect. This field is returned if eBay has data on how many searches have been performed for listings in the category using this item aspect.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; This container is restricted to applications that have been granted permission to access this feature. You must submit an &lt;a href=&quot;https://developer.ebay.com/my/support/tickets?tab=app-check &quot;&gt;App Check ticket&lt;/a&gt; to request this access. In the App Check form, add a note to the &lt;b&gt;Application Title/Summary&lt;/b&gt; and/or &lt;b&gt;Application Details&lt;/b&gt; fields that you want access to &apos;Buyer Demand Data&apos; in the Taxonomy API.&lt;/span&gt;
     */
    private RelevanceIndicator relevanceIndicator;
    /**
     * Instantiates a new {@link Aspect} and sets the default values.
     */
    public Aspect() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Aspect}
     */
    @jakarta.annotation.Nonnull
    public static Aspect createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Aspect();
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
     * Gets the aspectConstraint property value. This type contains information about the formatting, occurrence, and support of an aspect.
     * @return a {@link AspectConstraint}
     */
    @jakarta.annotation.Nullable
    public AspectConstraint getAspectConstraint() {
        return this.aspectConstraint;
    }
    /**
     * Gets the aspectValues property value. A list of valid values for this aspect (for example: &lt;code&gt;Red&lt;/code&gt;, &lt;code&gt;Green&lt;/code&gt;, and &lt;code&gt;Blue&lt;/code&gt;), along with any constraints on those values.
     * @return a {@link java.util.List<AspectValue>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AspectValue> getAspectValues() {
        return this.aspectValues;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("aspectConstraint", (n) -> { this.setAspectConstraint(n.getObjectValue(AspectConstraint::createFromDiscriminatorValue)); });
        deserializerMap.put("aspectValues", (n) -> { this.setAspectValues(n.getCollectionOfObjectValues(AspectValue::createFromDiscriminatorValue)); });
        deserializerMap.put("localizedAspectName", (n) -> { this.setLocalizedAspectName(n.getStringValue()); });
        deserializerMap.put("relevanceIndicator", (n) -> { this.setRelevanceIndicator(n.getObjectValue(RelevanceIndicator::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the localizedAspectName property value. The localized name of this aspect (for example: &lt;code&gt;Colour&lt;/code&gt; on the eBay UK site). &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; This name is always localized for the specified marketplace. &lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLocalizedAspectName() {
        return this.localizedAspectName;
    }
    /**
     * Gets the relevanceIndicator property value. The relevance of this aspect. This field is returned if eBay has data on how many searches have been performed for listings in the category using this item aspect.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; This container is restricted to applications that have been granted permission to access this feature. You must submit an &lt;a href=&quot;https://developer.ebay.com/my/support/tickets?tab=app-check &quot;&gt;App Check ticket&lt;/a&gt; to request this access. In the App Check form, add a note to the &lt;b&gt;Application Title/Summary&lt;/b&gt; and/or &lt;b&gt;Application Details&lt;/b&gt; fields that you want access to &apos;Buyer Demand Data&apos; in the Taxonomy API.&lt;/span&gt;
     * @return a {@link RelevanceIndicator}
     */
    @jakarta.annotation.Nullable
    public RelevanceIndicator getRelevanceIndicator() {
        return this.relevanceIndicator;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("aspectConstraint", this.getAspectConstraint());
        writer.writeCollectionOfObjectValues("aspectValues", this.getAspectValues());
        writer.writeStringValue("localizedAspectName", this.getLocalizedAspectName());
        writer.writeObjectValue("relevanceIndicator", this.getRelevanceIndicator());
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
     * Sets the aspectConstraint property value. This type contains information about the formatting, occurrence, and support of an aspect.
     * @param value Value to set for the aspectConstraint property.
     */
    public void setAspectConstraint(@jakarta.annotation.Nullable final AspectConstraint value) {
        this.aspectConstraint = value;
    }
    /**
     * Sets the aspectValues property value. A list of valid values for this aspect (for example: &lt;code&gt;Red&lt;/code&gt;, &lt;code&gt;Green&lt;/code&gt;, and &lt;code&gt;Blue&lt;/code&gt;), along with any constraints on those values.
     * @param value Value to set for the aspectValues property.
     */
    public void setAspectValues(@jakarta.annotation.Nullable final java.util.List<AspectValue> value) {
        this.aspectValues = value;
    }
    /**
     * Sets the localizedAspectName property value. The localized name of this aspect (for example: &lt;code&gt;Colour&lt;/code&gt; on the eBay UK site). &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; This name is always localized for the specified marketplace. &lt;/span&gt;
     * @param value Value to set for the localizedAspectName property.
     */
    public void setLocalizedAspectName(@jakarta.annotation.Nullable final String value) {
        this.localizedAspectName = value;
    }
    /**
     * Sets the relevanceIndicator property value. The relevance of this aspect. This field is returned if eBay has data on how many searches have been performed for listings in the category using this item aspect.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; This container is restricted to applications that have been granted permission to access this feature. You must submit an &lt;a href=&quot;https://developer.ebay.com/my/support/tickets?tab=app-check &quot;&gt;App Check ticket&lt;/a&gt; to request this access. In the App Check form, add a note to the &lt;b&gt;Application Title/Summary&lt;/b&gt; and/or &lt;b&gt;Application Details&lt;/b&gt; fields that you want access to &apos;Buyer Demand Data&apos; in the Taxonomy API.&lt;/span&gt;
     * @param value Value to set for the relevanceIndicator property.
     */
    public void setRelevanceIndicator(@jakarta.annotation.Nullable final RelevanceIndicator value) {
        this.relevanceIndicator = value;
    }
}

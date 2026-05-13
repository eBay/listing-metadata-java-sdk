package com.ebay.listingmetadata.generated.taxonomy.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines the expired category ID for the requested category tree, and the currently active category ID that has replaced it.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExpiredCategory implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The unique identifier of the expired eBay leaf category.
     */
    private String fromCategoryId;
    /**
     * The unique identifier of the currently active eBay leaf category that has replaced the expired leaf category.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; More than one &lt;b&gt;fromCategoryID&lt;/b&gt; value may map into the same &lt;b&gt;toCategoryID&lt;/b&gt; value, as multiple eBay categories may be consolidated into one new, expanded category.&lt;/span&gt;
     */
    private String toCategoryId;
    /**
     * Instantiates a new {@link ExpiredCategory} and sets the default values.
     */
    public ExpiredCategory() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ExpiredCategory}
     */
    @jakarta.annotation.Nonnull
    public static ExpiredCategory createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExpiredCategory();
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
        deserializerMap.put("fromCategoryId", (n) -> { this.setFromCategoryId(n.getStringValue()); });
        deserializerMap.put("toCategoryId", (n) -> { this.setToCategoryId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fromCategoryId property value. The unique identifier of the expired eBay leaf category.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFromCategoryId() {
        return this.fromCategoryId;
    }
    /**
     * Gets the toCategoryId property value. The unique identifier of the currently active eBay leaf category that has replaced the expired leaf category.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; More than one &lt;b&gt;fromCategoryID&lt;/b&gt; value may map into the same &lt;b&gt;toCategoryID&lt;/b&gt; value, as multiple eBay categories may be consolidated into one new, expanded category.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getToCategoryId() {
        return this.toCategoryId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("fromCategoryId", this.getFromCategoryId());
        writer.writeStringValue("toCategoryId", this.getToCategoryId());
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
     * Sets the fromCategoryId property value. The unique identifier of the expired eBay leaf category.
     * @param value Value to set for the fromCategoryId property.
     */
    public void setFromCategoryId(@jakarta.annotation.Nullable final String value) {
        this.fromCategoryId = value;
    }
    /**
     * Sets the toCategoryId property value. The unique identifier of the currently active eBay leaf category that has replaced the expired leaf category.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; More than one &lt;b&gt;fromCategoryID&lt;/b&gt; value may map into the same &lt;b&gt;toCategoryID&lt;/b&gt; value, as multiple eBay categories may be consolidated into one new, expanded category.&lt;/span&gt;
     * @param value Value to set for the toCategoryId property.
     */
    public void setToCategoryId(@jakarta.annotation.Nullable final String value) {
        this.toCategoryId = value;
    }
}

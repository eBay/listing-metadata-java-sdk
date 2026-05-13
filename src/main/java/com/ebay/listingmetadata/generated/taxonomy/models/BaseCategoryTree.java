package com.ebay.listingmetadata.generated.taxonomy.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type contains identifying information for the category tree associated with a particular eBay marketplace.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BaseCategoryTree implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The unique identifier of the eBay category tree for the specified marketplace.
     */
    private String categoryTreeId;
    /**
     * The version of the category tree identified by &lt;b&gt;categoryTreeId&lt;/b&gt;. It&apos;s a good idea to cache this value for comparison so you can determine if this category tree has been modified in subsequent calls.
     */
    private String categoryTreeVersion;
    /**
     * Instantiates a new {@link BaseCategoryTree} and sets the default values.
     */
    public BaseCategoryTree() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link BaseCategoryTree}
     */
    @jakarta.annotation.Nonnull
    public static BaseCategoryTree createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BaseCategoryTree();
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
     * Gets the categoryTreeId property value. The unique identifier of the eBay category tree for the specified marketplace.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCategoryTreeId() {
        return this.categoryTreeId;
    }
    /**
     * Gets the categoryTreeVersion property value. The version of the category tree identified by &lt;b&gt;categoryTreeId&lt;/b&gt;. It&apos;s a good idea to cache this value for comparison so you can determine if this category tree has been modified in subsequent calls.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCategoryTreeVersion() {
        return this.categoryTreeVersion;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("categoryTreeId", (n) -> { this.setCategoryTreeId(n.getStringValue()); });
        deserializerMap.put("categoryTreeVersion", (n) -> { this.setCategoryTreeVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("categoryTreeId", this.getCategoryTreeId());
        writer.writeStringValue("categoryTreeVersion", this.getCategoryTreeVersion());
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
     * Sets the categoryTreeId property value. The unique identifier of the eBay category tree for the specified marketplace.
     * @param value Value to set for the categoryTreeId property.
     */
    public void setCategoryTreeId(@jakarta.annotation.Nullable final String value) {
        this.categoryTreeId = value;
    }
    /**
     * Sets the categoryTreeVersion property value. The version of the category tree identified by &lt;b&gt;categoryTreeId&lt;/b&gt;. It&apos;s a good idea to cache this value for comparison so you can determine if this category tree has been modified in subsequent calls.
     * @param value Value to set for the categoryTreeVersion property.
     */
    public void setCategoryTreeVersion(@jakarta.annotation.Nullable final String value) {
        this.categoryTreeVersion = value;
    }
}

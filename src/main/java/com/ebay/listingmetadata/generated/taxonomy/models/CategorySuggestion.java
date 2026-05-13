package com.ebay.listingmetadata.generated.taxonomy.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type contains information about a suggested category tree leaf node that corresponds to keywords provided in the request. It includes details about each of the category&apos;s ancestor nodes extending up to the root of the category tree.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CategorySuggestion implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This type contains information about a particular eBay category.
     */
    private Category category;
    /**
     * An ordered list of category references that describes the location of the suggested category in the specified category tree. The list identifies the category&apos;s ancestry as a sequence of parent nodes, from the current node&apos;s immediate parent to the root node of the category tree.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; The root node of a full default category tree includes &lt;b&gt;categoryId&lt;/b&gt; and &lt;b&gt;categoryName&lt;/b&gt; fields, but their values should not be relied upon. They provide no useful information for application development.&lt;/span&gt;
     */
    private java.util.List<AncestorReference> categoryTreeNodeAncestors;
    /**
     * The absolute level of the category tree node in the hierarchy of its category tree.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; The root node of any full category tree is always at level &lt;code&gt;&lt;b&gt;0&lt;/b&gt;&lt;/code&gt;.&lt;/span&gt;
     */
    private Integer categoryTreeNodeLevel;
    /**
     * This field is reserved for internal or future use.
     */
    private String relevancy;
    /**
     * Instantiates a new {@link CategorySuggestion} and sets the default values.
     */
    public CategorySuggestion() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CategorySuggestion}
     */
    @jakarta.annotation.Nonnull
    public static CategorySuggestion createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CategorySuggestion();
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
     * Gets the category property value. This type contains information about a particular eBay category.
     * @return a {@link Category}
     */
    @jakarta.annotation.Nullable
    public Category getCategory() {
        return this.category;
    }
    /**
     * Gets the categoryTreeNodeAncestors property value. An ordered list of category references that describes the location of the suggested category in the specified category tree. The list identifies the category&apos;s ancestry as a sequence of parent nodes, from the current node&apos;s immediate parent to the root node of the category tree.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; The root node of a full default category tree includes &lt;b&gt;categoryId&lt;/b&gt; and &lt;b&gt;categoryName&lt;/b&gt; fields, but their values should not be relied upon. They provide no useful information for application development.&lt;/span&gt;
     * @return a {@link java.util.List<AncestorReference>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AncestorReference> getCategoryTreeNodeAncestors() {
        return this.categoryTreeNodeAncestors;
    }
    /**
     * Gets the categoryTreeNodeLevel property value. The absolute level of the category tree node in the hierarchy of its category tree.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; The root node of any full category tree is always at level &lt;code&gt;&lt;b&gt;0&lt;/b&gt;&lt;/code&gt;.&lt;/span&gt;
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCategoryTreeNodeLevel() {
        return this.categoryTreeNodeLevel;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("category", (n) -> { this.setCategory(n.getObjectValue(Category::createFromDiscriminatorValue)); });
        deserializerMap.put("categoryTreeNodeAncestors", (n) -> { this.setCategoryTreeNodeAncestors(n.getCollectionOfObjectValues(AncestorReference::createFromDiscriminatorValue)); });
        deserializerMap.put("categoryTreeNodeLevel", (n) -> { this.setCategoryTreeNodeLevel(n.getIntegerValue()); });
        deserializerMap.put("relevancy", (n) -> { this.setRelevancy(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the relevancy property value. This field is reserved for internal or future use.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRelevancy() {
        return this.relevancy;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("category", this.getCategory());
        writer.writeCollectionOfObjectValues("categoryTreeNodeAncestors", this.getCategoryTreeNodeAncestors());
        writer.writeIntegerValue("categoryTreeNodeLevel", this.getCategoryTreeNodeLevel());
        writer.writeStringValue("relevancy", this.getRelevancy());
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
     * Sets the category property value. This type contains information about a particular eBay category.
     * @param value Value to set for the category property.
     */
    public void setCategory(@jakarta.annotation.Nullable final Category value) {
        this.category = value;
    }
    /**
     * Sets the categoryTreeNodeAncestors property value. An ordered list of category references that describes the location of the suggested category in the specified category tree. The list identifies the category&apos;s ancestry as a sequence of parent nodes, from the current node&apos;s immediate parent to the root node of the category tree.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; The root node of a full default category tree includes &lt;b&gt;categoryId&lt;/b&gt; and &lt;b&gt;categoryName&lt;/b&gt; fields, but their values should not be relied upon. They provide no useful information for application development.&lt;/span&gt;
     * @param value Value to set for the categoryTreeNodeAncestors property.
     */
    public void setCategoryTreeNodeAncestors(@jakarta.annotation.Nullable final java.util.List<AncestorReference> value) {
        this.categoryTreeNodeAncestors = value;
    }
    /**
     * Sets the categoryTreeNodeLevel property value. The absolute level of the category tree node in the hierarchy of its category tree.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; The root node of any full category tree is always at level &lt;code&gt;&lt;b&gt;0&lt;/b&gt;&lt;/code&gt;.&lt;/span&gt;
     * @param value Value to set for the categoryTreeNodeLevel property.
     */
    public void setCategoryTreeNodeLevel(@jakarta.annotation.Nullable final Integer value) {
        this.categoryTreeNodeLevel = value;
    }
    /**
     * Sets the relevancy property value. This field is reserved for internal or future use.
     * @param value Value to set for the relevancy property.
     */
    public void setRelevancy(@jakarta.annotation.Nullable final String value) {
        this.relevancy = value;
    }
}

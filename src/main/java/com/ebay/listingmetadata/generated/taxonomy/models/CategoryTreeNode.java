package com.ebay.listingmetadata.generated.taxonomy.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type contains information about all nodes of a category tree or subtree hierarchy, including and below the specified &lt;b&gt;Category&lt;/b&gt;, down to the leaf nodes. It is a recursive structure.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CategoryTreeNode implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This type contains information about a particular eBay category.
     */
    private Category category;
    /**
     * The absolute level of the current category tree node in the hierarchy of its category tree.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; The root node of any full category tree is always at level &lt;code&gt;&lt;b&gt;0&lt;/b&gt;&lt;/code&gt;. &lt;/span&gt;
     */
    private Integer categoryTreeNodeLevel;
    /**
     * An array of one or more category tree nodes that are the immediate children of the current category tree node, as well as their children, recursively down to the leaf nodes.&lt;br&gt;&lt;br&gt;&lt;i&gt;Returned only if&lt;/i&gt; the current category tree node is not a leaf node (the value of &lt;b&gt;leafCategoryTreeNode&lt;/b&gt; is &lt;code&gt;false&lt;/code&gt;).
     */
    private java.util.List<CategoryTreeNode> childCategoryTreeNodes;
    /**
     * A value of &lt;code&gt;true&lt;/code&gt; indicates that the current category tree node is a leaf node (it has no child nodes). A value of &lt;code&gt;false&lt;/code&gt; indicates that the current node has one or more child nodes, which are identified by the &lt;b&gt;childCategoryTreeNodes&lt;/b&gt; array.&lt;br&gt;&lt;br&gt;&lt;i&gt;Returned only if&lt;/i&gt; the value of this field is &lt;code&gt;true&lt;/code&gt;.
     */
    private Boolean leafCategoryTreeNode;
    /**
     * The href portion of the &lt;b&gt;getCategorySubtree&lt;/b&gt; call that retrieves the subtree below the parent of this category tree node.&lt;br&gt;&lt;br&gt;&lt;i&gt;Not returned if&lt;/i&gt; the current category tree node is the root node of its tree.
     */
    private String parentCategoryTreeNodeHref;
    /**
     * Instantiates a new {@link CategoryTreeNode} and sets the default values.
     */
    public CategoryTreeNode() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CategoryTreeNode}
     */
    @jakarta.annotation.Nonnull
    public static CategoryTreeNode createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CategoryTreeNode();
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
     * Gets the categoryTreeNodeLevel property value. The absolute level of the current category tree node in the hierarchy of its category tree.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; The root node of any full category tree is always at level &lt;code&gt;&lt;b&gt;0&lt;/b&gt;&lt;/code&gt;. &lt;/span&gt;
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCategoryTreeNodeLevel() {
        return this.categoryTreeNodeLevel;
    }
    /**
     * Gets the childCategoryTreeNodes property value. An array of one or more category tree nodes that are the immediate children of the current category tree node, as well as their children, recursively down to the leaf nodes.&lt;br&gt;&lt;br&gt;&lt;i&gt;Returned only if&lt;/i&gt; the current category tree node is not a leaf node (the value of &lt;b&gt;leafCategoryTreeNode&lt;/b&gt; is &lt;code&gt;false&lt;/code&gt;).
     * @return a {@link java.util.List<CategoryTreeNode>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CategoryTreeNode> getChildCategoryTreeNodes() {
        return this.childCategoryTreeNodes;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("category", (n) -> { this.setCategory(n.getObjectValue(Category::createFromDiscriminatorValue)); });
        deserializerMap.put("categoryTreeNodeLevel", (n) -> { this.setCategoryTreeNodeLevel(n.getIntegerValue()); });
        deserializerMap.put("childCategoryTreeNodes", (n) -> { this.setChildCategoryTreeNodes(n.getCollectionOfObjectValues(CategoryTreeNode::createFromDiscriminatorValue)); });
        deserializerMap.put("leafCategoryTreeNode", (n) -> { this.setLeafCategoryTreeNode(n.getBooleanValue()); });
        deserializerMap.put("parentCategoryTreeNodeHref", (n) -> { this.setParentCategoryTreeNodeHref(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the leafCategoryTreeNode property value. A value of &lt;code&gt;true&lt;/code&gt; indicates that the current category tree node is a leaf node (it has no child nodes). A value of &lt;code&gt;false&lt;/code&gt; indicates that the current node has one or more child nodes, which are identified by the &lt;b&gt;childCategoryTreeNodes&lt;/b&gt; array.&lt;br&gt;&lt;br&gt;&lt;i&gt;Returned only if&lt;/i&gt; the value of this field is &lt;code&gt;true&lt;/code&gt;.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getLeafCategoryTreeNode() {
        return this.leafCategoryTreeNode;
    }
    /**
     * Gets the parentCategoryTreeNodeHref property value. The href portion of the &lt;b&gt;getCategorySubtree&lt;/b&gt; call that retrieves the subtree below the parent of this category tree node.&lt;br&gt;&lt;br&gt;&lt;i&gt;Not returned if&lt;/i&gt; the current category tree node is the root node of its tree.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getParentCategoryTreeNodeHref() {
        return this.parentCategoryTreeNodeHref;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("category", this.getCategory());
        writer.writeIntegerValue("categoryTreeNodeLevel", this.getCategoryTreeNodeLevel());
        writer.writeCollectionOfObjectValues("childCategoryTreeNodes", this.getChildCategoryTreeNodes());
        writer.writeBooleanValue("leafCategoryTreeNode", this.getLeafCategoryTreeNode());
        writer.writeStringValue("parentCategoryTreeNodeHref", this.getParentCategoryTreeNodeHref());
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
     * Sets the categoryTreeNodeLevel property value. The absolute level of the current category tree node in the hierarchy of its category tree.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; The root node of any full category tree is always at level &lt;code&gt;&lt;b&gt;0&lt;/b&gt;&lt;/code&gt;. &lt;/span&gt;
     * @param value Value to set for the categoryTreeNodeLevel property.
     */
    public void setCategoryTreeNodeLevel(@jakarta.annotation.Nullable final Integer value) {
        this.categoryTreeNodeLevel = value;
    }
    /**
     * Sets the childCategoryTreeNodes property value. An array of one or more category tree nodes that are the immediate children of the current category tree node, as well as their children, recursively down to the leaf nodes.&lt;br&gt;&lt;br&gt;&lt;i&gt;Returned only if&lt;/i&gt; the current category tree node is not a leaf node (the value of &lt;b&gt;leafCategoryTreeNode&lt;/b&gt; is &lt;code&gt;false&lt;/code&gt;).
     * @param value Value to set for the childCategoryTreeNodes property.
     */
    public void setChildCategoryTreeNodes(@jakarta.annotation.Nullable final java.util.List<CategoryTreeNode> value) {
        this.childCategoryTreeNodes = value;
    }
    /**
     * Sets the leafCategoryTreeNode property value. A value of &lt;code&gt;true&lt;/code&gt; indicates that the current category tree node is a leaf node (it has no child nodes). A value of &lt;code&gt;false&lt;/code&gt; indicates that the current node has one or more child nodes, which are identified by the &lt;b&gt;childCategoryTreeNodes&lt;/b&gt; array.&lt;br&gt;&lt;br&gt;&lt;i&gt;Returned only if&lt;/i&gt; the value of this field is &lt;code&gt;true&lt;/code&gt;.
     * @param value Value to set for the leafCategoryTreeNode property.
     */
    public void setLeafCategoryTreeNode(@jakarta.annotation.Nullable final Boolean value) {
        this.leafCategoryTreeNode = value;
    }
    /**
     * Sets the parentCategoryTreeNodeHref property value. The href portion of the &lt;b&gt;getCategorySubtree&lt;/b&gt; call that retrieves the subtree below the parent of this category tree node.&lt;br&gt;&lt;br&gt;&lt;i&gt;Not returned if&lt;/i&gt; the current category tree node is the root node of its tree.
     * @param value Value to set for the parentCategoryTreeNodeHref property.
     */
    public void setParentCategoryTreeNodeHref(@jakarta.annotation.Nullable final String value) {
        this.parentCategoryTreeNodeHref = value;
    }
}

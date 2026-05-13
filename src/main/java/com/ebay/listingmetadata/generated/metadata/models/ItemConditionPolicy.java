package com.ebay.listingmetadata.generated.metadata.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ItemConditionPolicy implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The category ID to which the item-condition policy applies.
     */
    private String categoryId;
    /**
     * A value that indicates the root node of the category tree used for the response set. Each marketplace is based on a category tree whose root node is indicated by this unique category ID value. All category policy information returned by this call pertains to the categories included below this root node of the tree.    &lt;br&gt;&lt;br&gt;A &lt;i&gt;category tree&lt;/i&gt; is a hierarchical framework of eBay categories that begins at the root node of the tree and extends to include all the child nodes in the tree. Each child node in the tree is an eBay category that is represented by a unique &lt;b&gt;categoryId&lt;/b&gt; value. Within a category tree, the root node has no parent node and &lt;i&gt;leaf nodes&lt;/i&gt; are nodes that have no child nodes.
     */
    private String categoryTreeId;
    /**
     * This flag denotes whether or not you must list the item condition in a listing for the specified category. If set to &lt;code&gt;true&lt;/code&gt;, you must specify an item condition for the associated category.
     */
    private Boolean itemConditionRequired;
    /**
     * The item-condition values allowed in the category.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The Seller Refurbished item condition (condition ID 2500) has been replaced by the &apos;Excellent - Refurbished&apos;, &apos;Very Good - Refurbished&apos;, and &apos;Good - Refurbished&apos; item conditions in a select number of eBay marketplaces and categories.&lt;br/&gt;&lt;br/&gt;Similar to the Certified Refurbished item condition (condition ID 2000), a sellers OAuth user token will have to be used instead of an OAuth application token, since each seller must  go through an application and qualification process before using any of these new refurbished item conditions in supported categories. If a seller is not qualified to use the new refurbished item conditions, these item condition values will not be returned by &lt;b&gt;getItemConditionPolicies&lt;/b&gt;.&lt;/span&gt;
     */
    private java.util.List<ItemCondition> itemConditions;
    /**
     * Instantiates a new {@link ItemConditionPolicy} and sets the default values.
     */
    public ItemConditionPolicy() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ItemConditionPolicy}
     */
    @jakarta.annotation.Nonnull
    public static ItemConditionPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ItemConditionPolicy();
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
     * Gets the categoryId property value. The category ID to which the item-condition policy applies.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCategoryId() {
        return this.categoryId;
    }
    /**
     * Gets the categoryTreeId property value. A value that indicates the root node of the category tree used for the response set. Each marketplace is based on a category tree whose root node is indicated by this unique category ID value. All category policy information returned by this call pertains to the categories included below this root node of the tree.    &lt;br&gt;&lt;br&gt;A &lt;i&gt;category tree&lt;/i&gt; is a hierarchical framework of eBay categories that begins at the root node of the tree and extends to include all the child nodes in the tree. Each child node in the tree is an eBay category that is represented by a unique &lt;b&gt;categoryId&lt;/b&gt; value. Within a category tree, the root node has no parent node and &lt;i&gt;leaf nodes&lt;/i&gt; are nodes that have no child nodes.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("categoryId", (n) -> { this.setCategoryId(n.getStringValue()); });
        deserializerMap.put("categoryTreeId", (n) -> { this.setCategoryTreeId(n.getStringValue()); });
        deserializerMap.put("itemConditionRequired", (n) -> { this.setItemConditionRequired(n.getBooleanValue()); });
        deserializerMap.put("itemConditions", (n) -> { this.setItemConditions(n.getCollectionOfObjectValues(ItemCondition::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the itemConditionRequired property value. This flag denotes whether or not you must list the item condition in a listing for the specified category. If set to &lt;code&gt;true&lt;/code&gt;, you must specify an item condition for the associated category.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getItemConditionRequired() {
        return this.itemConditionRequired;
    }
    /**
     * Gets the itemConditions property value. The item-condition values allowed in the category.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The Seller Refurbished item condition (condition ID 2500) has been replaced by the &apos;Excellent - Refurbished&apos;, &apos;Very Good - Refurbished&apos;, and &apos;Good - Refurbished&apos; item conditions in a select number of eBay marketplaces and categories.&lt;br/&gt;&lt;br/&gt;Similar to the Certified Refurbished item condition (condition ID 2000), a sellers OAuth user token will have to be used instead of an OAuth application token, since each seller must  go through an application and qualification process before using any of these new refurbished item conditions in supported categories. If a seller is not qualified to use the new refurbished item conditions, these item condition values will not be returned by &lt;b&gt;getItemConditionPolicies&lt;/b&gt;.&lt;/span&gt;
     * @return a {@link java.util.List<ItemCondition>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ItemCondition> getItemConditions() {
        return this.itemConditions;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("categoryId", this.getCategoryId());
        writer.writeStringValue("categoryTreeId", this.getCategoryTreeId());
        writer.writeBooleanValue("itemConditionRequired", this.getItemConditionRequired());
        writer.writeCollectionOfObjectValues("itemConditions", this.getItemConditions());
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
     * Sets the categoryId property value. The category ID to which the item-condition policy applies.
     * @param value Value to set for the categoryId property.
     */
    public void setCategoryId(@jakarta.annotation.Nullable final String value) {
        this.categoryId = value;
    }
    /**
     * Sets the categoryTreeId property value. A value that indicates the root node of the category tree used for the response set. Each marketplace is based on a category tree whose root node is indicated by this unique category ID value. All category policy information returned by this call pertains to the categories included below this root node of the tree.    &lt;br&gt;&lt;br&gt;A &lt;i&gt;category tree&lt;/i&gt; is a hierarchical framework of eBay categories that begins at the root node of the tree and extends to include all the child nodes in the tree. Each child node in the tree is an eBay category that is represented by a unique &lt;b&gt;categoryId&lt;/b&gt; value. Within a category tree, the root node has no parent node and &lt;i&gt;leaf nodes&lt;/i&gt; are nodes that have no child nodes.
     * @param value Value to set for the categoryTreeId property.
     */
    public void setCategoryTreeId(@jakarta.annotation.Nullable final String value) {
        this.categoryTreeId = value;
    }
    /**
     * Sets the itemConditionRequired property value. This flag denotes whether or not you must list the item condition in a listing for the specified category. If set to &lt;code&gt;true&lt;/code&gt;, you must specify an item condition for the associated category.
     * @param value Value to set for the itemConditionRequired property.
     */
    public void setItemConditionRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.itemConditionRequired = value;
    }
    /**
     * Sets the itemConditions property value. The item-condition values allowed in the category.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The Seller Refurbished item condition (condition ID 2500) has been replaced by the &apos;Excellent - Refurbished&apos;, &apos;Very Good - Refurbished&apos;, and &apos;Good - Refurbished&apos; item conditions in a select number of eBay marketplaces and categories.&lt;br/&gt;&lt;br/&gt;Similar to the Certified Refurbished item condition (condition ID 2000), a sellers OAuth user token will have to be used instead of an OAuth application token, since each seller must  go through an application and qualification process before using any of these new refurbished item conditions in supported categories. If a seller is not qualified to use the new refurbished item conditions, these item condition values will not be returned by &lt;b&gt;getItemConditionPolicies&lt;/b&gt;.&lt;/span&gt;
     * @param value Value to set for the itemConditions property.
     */
    public void setItemConditions(@jakarta.annotation.Nullable final java.util.List<ItemCondition> value) {
        this.itemConditions = value;
    }
}

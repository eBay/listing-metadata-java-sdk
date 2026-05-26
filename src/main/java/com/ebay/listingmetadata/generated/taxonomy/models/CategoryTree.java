// Copyright 2026 eBay Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.ebay.listingmetadata.generated.taxonomy.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type contains information about all nodes of a specified eBay category tree.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CategoryTree implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A list of one or more identifiers of the eBay marketplaces that use this category tree.
     */
    private java.util.List<String> applicableMarketplaceIds;
    /**
     * The unique identifier of this eBay category tree.
     */
    private String categoryTreeId;
    /**
     * The version of this category tree. It&apos;s a good idea to cache this value for comparison so you can determine if this category tree has been modified in subsequent calls.
     */
    private String categoryTreeVersion;
    /**
     * This type contains information about all nodes of a category tree or subtree hierarchy, including and below the specified &lt;b&gt;Category&lt;/b&gt;, down to the leaf nodes. It is a recursive structure.
     */
    private CategoryTreeNode rootCategoryNode;
    /**
     * Instantiates a new {@link CategoryTree} and sets the default values.
     */
    public CategoryTree() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CategoryTree}
     */
    @jakarta.annotation.Nonnull
    public static CategoryTree createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CategoryTree();
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
     * Gets the applicableMarketplaceIds property value. A list of one or more identifiers of the eBay marketplaces that use this category tree.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getApplicableMarketplaceIds() {
        return this.applicableMarketplaceIds;
    }
    /**
     * Gets the categoryTreeId property value. The unique identifier of this eBay category tree.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCategoryTreeId() {
        return this.categoryTreeId;
    }
    /**
     * Gets the categoryTreeVersion property value. The version of this category tree. It&apos;s a good idea to cache this value for comparison so you can determine if this category tree has been modified in subsequent calls.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("applicableMarketplaceIds", (n) -> { this.setApplicableMarketplaceIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("categoryTreeId", (n) -> { this.setCategoryTreeId(n.getStringValue()); });
        deserializerMap.put("categoryTreeVersion", (n) -> { this.setCategoryTreeVersion(n.getStringValue()); });
        deserializerMap.put("rootCategoryNode", (n) -> { this.setRootCategoryNode(n.getObjectValue(CategoryTreeNode::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the rootCategoryNode property value. This type contains information about all nodes of a category tree or subtree hierarchy, including and below the specified &lt;b&gt;Category&lt;/b&gt;, down to the leaf nodes. It is a recursive structure.
     * @return a {@link CategoryTreeNode}
     */
    @jakarta.annotation.Nullable
    public CategoryTreeNode getRootCategoryNode() {
        return this.rootCategoryNode;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("applicableMarketplaceIds", this.getApplicableMarketplaceIds());
        writer.writeStringValue("categoryTreeId", this.getCategoryTreeId());
        writer.writeStringValue("categoryTreeVersion", this.getCategoryTreeVersion());
        writer.writeObjectValue("rootCategoryNode", this.getRootCategoryNode());
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
     * Sets the applicableMarketplaceIds property value. A list of one or more identifiers of the eBay marketplaces that use this category tree.
     * @param value Value to set for the applicableMarketplaceIds property.
     */
    public void setApplicableMarketplaceIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.applicableMarketplaceIds = value;
    }
    /**
     * Sets the categoryTreeId property value. The unique identifier of this eBay category tree.
     * @param value Value to set for the categoryTreeId property.
     */
    public void setCategoryTreeId(@jakarta.annotation.Nullable final String value) {
        this.categoryTreeId = value;
    }
    /**
     * Sets the categoryTreeVersion property value. The version of this category tree. It&apos;s a good idea to cache this value for comparison so you can determine if this category tree has been modified in subsequent calls.
     * @param value Value to set for the categoryTreeVersion property.
     */
    public void setCategoryTreeVersion(@jakarta.annotation.Nullable final String value) {
        this.categoryTreeVersion = value;
    }
    /**
     * Sets the rootCategoryNode property value. This type contains information about all nodes of a category tree or subtree hierarchy, including and below the specified &lt;b&gt;Category&lt;/b&gt;, down to the leaf nodes. It is a recursive structure.
     * @param value Value to set for the rootCategoryNode property.
     */
    public void setRootCategoryNode(@jakarta.annotation.Nullable final CategoryTreeNode value) {
        this.rootCategoryNode = value;
    }
}

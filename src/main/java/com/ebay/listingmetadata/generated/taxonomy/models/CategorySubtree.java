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
 * This type contains information about a particular subtree of a specified eBay category tree. A category subtree consists of a non-root node of the category tree, and all of its descendants down to the leaf nodes.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CategorySubtree implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This type contains information about all nodes of a category tree or subtree hierarchy, including and below the specified &lt;b&gt;Category&lt;/b&gt;, down to the leaf nodes. It is a recursive structure.
     */
    private CategoryTreeNode categorySubtreeNode;
    /**
     * The unique identifier of the eBay category tree to which this subtree belongs.
     */
    private String categoryTreeId;
    /**
     * The version of the category tree identified by &lt;b&gt;categoryTreeId&lt;/b&gt;. It&apos;s a good idea to cache this value for comparison so you can determine if this category tree has been modified in subsequent calls.
     */
    private String categoryTreeVersion;
    /**
     * Instantiates a new {@link CategorySubtree} and sets the default values.
     */
    public CategorySubtree() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CategorySubtree}
     */
    @jakarta.annotation.Nonnull
    public static CategorySubtree createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CategorySubtree();
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
     * Gets the categorySubtreeNode property value. This type contains information about all nodes of a category tree or subtree hierarchy, including and below the specified &lt;b&gt;Category&lt;/b&gt;, down to the leaf nodes. It is a recursive structure.
     * @return a {@link CategoryTreeNode}
     */
    @jakarta.annotation.Nullable
    public CategoryTreeNode getCategorySubtreeNode() {
        return this.categorySubtreeNode;
    }
    /**
     * Gets the categoryTreeId property value. The unique identifier of the eBay category tree to which this subtree belongs.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("categorySubtreeNode", (n) -> { this.setCategorySubtreeNode(n.getObjectValue(CategoryTreeNode::createFromDiscriminatorValue)); });
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
        writer.writeObjectValue("categorySubtreeNode", this.getCategorySubtreeNode());
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
     * Sets the categorySubtreeNode property value. This type contains information about all nodes of a category tree or subtree hierarchy, including and below the specified &lt;b&gt;Category&lt;/b&gt;, down to the leaf nodes. It is a recursive structure.
     * @param value Value to set for the categorySubtreeNode property.
     */
    public void setCategorySubtreeNode(@jakarta.annotation.Nullable final CategoryTreeNode value) {
        this.categorySubtreeNode = value;
    }
    /**
     * Sets the categoryTreeId property value. The unique identifier of the eBay category tree to which this subtree belongs.
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

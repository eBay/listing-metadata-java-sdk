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

package com.ebay.listingmetadata.generated.metadata.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type contains applicable return policy metadata for the leaf categories returned for the marketplace.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ReturnPolicy implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The category ID to which the return policies apply.
     */
    private String categoryId;
    /**
     * A value that indicates the root node of the category tree used for the response set. Each marketplace is based on a category tree whose root node is indicated by this unique category ID value. All category policy information returned by this call pertains to the categories included below this root node of the tree.    &lt;br&gt;&lt;br&gt;A &lt;i&gt;category tree&lt;/i&gt; is a hierarchical framework of eBay categories that begins at the root node of the tree and extends to include all the child nodes in the tree. Each child node in the tree is an eBay category that is represented by a unique &lt;b&gt;categoryId&lt;/b&gt; value. Within a category tree, the root node has no parent node and &lt;i&gt;leaf nodes&lt;/i&gt; are nodes that have no child nodes.
     */
    private String categoryTreeId;
    /**
     * This complex type defines the category policies related to domestic item returns.
     */
    private ReturnPolicyDetails domestic;
    /**
     * This complex type defines the category policies related to international item returns.
     */
    private ReturnPolicyDetails international;
    /**
     * If set to &lt;code&gt;true&lt;/code&gt;, this flag indicates that you must specify a return policy for items listed in the associated category.  &lt;br&gt;&lt;br&gt;Note that not accepting returns (setting &lt;b&gt;returnsAcceptedEnabled&lt;/b&gt; to &lt;code&gt;false&lt;/code&gt;) is a valid return policy.
     */
    private Boolean required;
    /**
     * Instantiates a new {@link ReturnPolicy} and sets the default values.
     */
    public ReturnPolicy() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ReturnPolicy}
     */
    @jakarta.annotation.Nonnull
    public static ReturnPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ReturnPolicy();
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
     * Gets the categoryId property value. The category ID to which the return policies apply.
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
     * Gets the domestic property value. This complex type defines the category policies related to domestic item returns.
     * @return a {@link ReturnPolicyDetails}
     */
    @jakarta.annotation.Nullable
    public ReturnPolicyDetails getDomestic() {
        return this.domestic;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("categoryId", (n) -> { this.setCategoryId(n.getStringValue()); });
        deserializerMap.put("categoryTreeId", (n) -> { this.setCategoryTreeId(n.getStringValue()); });
        deserializerMap.put("domestic", (n) -> { this.setDomestic(n.getObjectValue(ReturnPolicyDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("international", (n) -> { this.setInternational(n.getObjectValue(ReturnPolicyDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("required", (n) -> { this.setRequired(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the international property value. This complex type defines the category policies related to international item returns.
     * @return a {@link ReturnPolicyDetails}
     */
    @jakarta.annotation.Nullable
    public ReturnPolicyDetails getInternational() {
        return this.international;
    }
    /**
     * Gets the required property value. If set to &lt;code&gt;true&lt;/code&gt;, this flag indicates that you must specify a return policy for items listed in the associated category.  &lt;br&gt;&lt;br&gt;Note that not accepting returns (setting &lt;b&gt;returnsAcceptedEnabled&lt;/b&gt; to &lt;code&gt;false&lt;/code&gt;) is a valid return policy.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getRequired() {
        return this.required;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("categoryId", this.getCategoryId());
        writer.writeStringValue("categoryTreeId", this.getCategoryTreeId());
        writer.writeObjectValue("domestic", this.getDomestic());
        writer.writeObjectValue("international", this.getInternational());
        writer.writeBooleanValue("required", this.getRequired());
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
     * Sets the categoryId property value. The category ID to which the return policies apply.
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
     * Sets the domestic property value. This complex type defines the category policies related to domestic item returns.
     * @param value Value to set for the domestic property.
     */
    public void setDomestic(@jakarta.annotation.Nullable final ReturnPolicyDetails value) {
        this.domestic = value;
    }
    /**
     * Sets the international property value. This complex type defines the category policies related to international item returns.
     * @param value Value to set for the international property.
     */
    public void setInternational(@jakarta.annotation.Nullable final ReturnPolicyDetails value) {
        this.international = value;
    }
    /**
     * Sets the required property value. If set to &lt;code&gt;true&lt;/code&gt;, this flag indicates that you must specify a return policy for items listed in the associated category.  &lt;br&gt;&lt;br&gt;Note that not accepting returns (setting &lt;b&gt;returnsAcceptedEnabled&lt;/b&gt; to &lt;code&gt;false&lt;/code&gt;) is a valid return policy.
     * @param value Value to set for the required property.
     */
    public void setRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.required = value;
    }
}

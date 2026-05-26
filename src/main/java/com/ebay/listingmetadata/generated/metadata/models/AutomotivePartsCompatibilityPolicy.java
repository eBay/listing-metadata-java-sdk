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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AutomotivePartsCompatibilityPolicy implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The category ID to which the automotive parts compatibility policies apply.
     */
    private String categoryId;
    /**
     * A value that indicates the root node of the category tree used for the response set. Each marketplace is based on a category tree whose root node is indicated by this unique category ID value. All category policy information returned by this call pertains to the categories included below this root node of the tree.    &lt;br&gt;&lt;br&gt;A &lt;i&gt;category tree&lt;/i&gt; is a hierarchical framework of eBay categories that begins at the root node of the tree and extends to include all the child nodes in the tree. Each child node in the tree is an eBay category that is represented by a unique &lt;b&gt;categoryId&lt;/b&gt; value. Within a category tree, the root node has no parent node and &lt;i&gt;leaf nodes&lt;/i&gt; are nodes that have no child nodes.
     */
    private String categoryTreeId;
    /**
     * Indicates whether the category supports parts compatibility by either &lt;code&gt;ASSEMBLY&lt;/code&gt; or by &lt;code&gt;SPECIFICATION&lt;/code&gt;. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:CompatibilityTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String compatibilityBasedOn;
    /**
     * Indicates the compatibility classification of the part based on high-level vehicle types.
     */
    private java.util.List<String> compatibleVehicleTypes;
    /**
     * Specifies the maximum number of compatible vehicle-applications allowed per item.
     */
    private Integer maxNumberOfCompatibleVehicles;
    /**
     * Instantiates a new {@link AutomotivePartsCompatibilityPolicy} and sets the default values.
     */
    public AutomotivePartsCompatibilityPolicy() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AutomotivePartsCompatibilityPolicy}
     */
    @jakarta.annotation.Nonnull
    public static AutomotivePartsCompatibilityPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AutomotivePartsCompatibilityPolicy();
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
     * Gets the categoryId property value. The category ID to which the automotive parts compatibility policies apply.
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
     * Gets the compatibilityBasedOn property value. Indicates whether the category supports parts compatibility by either &lt;code&gt;ASSEMBLY&lt;/code&gt; or by &lt;code&gt;SPECIFICATION&lt;/code&gt;. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:CompatibilityTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCompatibilityBasedOn() {
        return this.compatibilityBasedOn;
    }
    /**
     * Gets the compatibleVehicleTypes property value. Indicates the compatibility classification of the part based on high-level vehicle types.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getCompatibleVehicleTypes() {
        return this.compatibleVehicleTypes;
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
        deserializerMap.put("compatibilityBasedOn", (n) -> { this.setCompatibilityBasedOn(n.getStringValue()); });
        deserializerMap.put("compatibleVehicleTypes", (n) -> { this.setCompatibleVehicleTypes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("maxNumberOfCompatibleVehicles", (n) -> { this.setMaxNumberOfCompatibleVehicles(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the maxNumberOfCompatibleVehicles property value. Specifies the maximum number of compatible vehicle-applications allowed per item.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMaxNumberOfCompatibleVehicles() {
        return this.maxNumberOfCompatibleVehicles;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("categoryId", this.getCategoryId());
        writer.writeStringValue("categoryTreeId", this.getCategoryTreeId());
        writer.writeStringValue("compatibilityBasedOn", this.getCompatibilityBasedOn());
        writer.writeCollectionOfPrimitiveValues("compatibleVehicleTypes", this.getCompatibleVehicleTypes());
        writer.writeIntegerValue("maxNumberOfCompatibleVehicles", this.getMaxNumberOfCompatibleVehicles());
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
     * Sets the categoryId property value. The category ID to which the automotive parts compatibility policies apply.
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
     * Sets the compatibilityBasedOn property value. Indicates whether the category supports parts compatibility by either &lt;code&gt;ASSEMBLY&lt;/code&gt; or by &lt;code&gt;SPECIFICATION&lt;/code&gt;. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:CompatibilityTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the compatibilityBasedOn property.
     */
    public void setCompatibilityBasedOn(@jakarta.annotation.Nullable final String value) {
        this.compatibilityBasedOn = value;
    }
    /**
     * Sets the compatibleVehicleTypes property value. Indicates the compatibility classification of the part based on high-level vehicle types.
     * @param value Value to set for the compatibleVehicleTypes property.
     */
    public void setCompatibleVehicleTypes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.compatibleVehicleTypes = value;
    }
    /**
     * Sets the maxNumberOfCompatibleVehicles property value. Specifies the maximum number of compatible vehicle-applications allowed per item.
     * @param value Value to set for the maxNumberOfCompatibleVehicles property.
     */
    public void setMaxNumberOfCompatibleVehicles(@jakarta.annotation.Nullable final Integer value) {
        this.maxNumberOfCompatibleVehicles = value;
    }
}

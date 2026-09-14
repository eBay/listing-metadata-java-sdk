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
 * This type defines the request fields used in the &lt;b&gt;getCompatibilityPropertyValues&lt;/b&gt; method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PropertyValuesRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The unique identifier of the eBay leaf category for which to retrieve compatibility property values. This category must be a valid eBay category on the specified eBay marketplace, and the category must support parts compatibility.&lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/develop/api/sell/metadata_api#sell-metadata_api-marketplace-getautomotivepartscompatibilitypolicies&quot;&gt;getAutomotivePartsCompatibilityPolicies&lt;/a&gt; method to retrieve a list of categories that support parts compatibility.
     */
    private String categoryId;
    /**
     * This array can be used to specify the compatibility properties used limit the result set. Only values associated with the specified name-value pairs will be returned in the response.&lt;br&gt;&lt;br&gt;For example, if the &lt;b&gt;propertyName&lt;/b&gt; is set to &lt;code&gt;Make&lt;/code&gt; and the &lt;b&gt;propertyValue&lt;/b&gt; is set to &lt;code&gt;Honda&lt;/code&gt;, only compatible Honda vehicles will be returned.
     */
    private java.util.List<PropertyFilterInner> propertyFilters;
    /**
     * This field specifies the name of the property for which to retrieve associated property values.&lt;br&gt;&lt;br&gt;For example, typical vehicle property names are &apos;Make&apos;, &apos;Model&apos;, &apos;Year&apos;, &apos;Engine&apos;, and &apos;Trim&apos;, but will vary based on the eBay marketplace and the eBay category. Use the &lt;a href=&quot;/develop/api/sell/metadata_api#sell-metadata_api-compatibilities-getcompatibilitypropertynames&quot;&gt;getCompatibilityPropertyNames&lt;/a&gt; method to retrieve valid property names for a specified category.
     */
    private String propertyName;
    /**
     * This field specifies the sort order for the property values in the result set.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;Ascending&lt;/code&gt;&lt;/li&gt;&lt;li&gt;Descending&lt;/li&gt;&lt;/ul&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; If no search order is specified, values are sorted in ascending order.&lt;/span&gt;
     */
    private String sortOrder;
    /**
     * Instantiates a new {@link PropertyValuesRequest} and sets the default values.
     */
    public PropertyValuesRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PropertyValuesRequest}
     */
    @jakarta.annotation.Nonnull
    public static PropertyValuesRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PropertyValuesRequest();
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
     * Gets the categoryId property value. The unique identifier of the eBay leaf category for which to retrieve compatibility property values. This category must be a valid eBay category on the specified eBay marketplace, and the category must support parts compatibility.&lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/develop/api/sell/metadata_api#sell-metadata_api-marketplace-getautomotivepartscompatibilitypolicies&quot;&gt;getAutomotivePartsCompatibilityPolicies&lt;/a&gt; method to retrieve a list of categories that support parts compatibility.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCategoryId() {
        return this.categoryId;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("categoryId", (n) -> { this.setCategoryId(n.getStringValue()); });
        deserializerMap.put("propertyFilters", (n) -> { this.setPropertyFilters(n.getCollectionOfObjectValues(PropertyFilterInner::createFromDiscriminatorValue)); });
        deserializerMap.put("propertyName", (n) -> { this.setPropertyName(n.getStringValue()); });
        deserializerMap.put("sortOrder", (n) -> { this.setSortOrder(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the propertyFilters property value. This array can be used to specify the compatibility properties used limit the result set. Only values associated with the specified name-value pairs will be returned in the response.&lt;br&gt;&lt;br&gt;For example, if the &lt;b&gt;propertyName&lt;/b&gt; is set to &lt;code&gt;Make&lt;/code&gt; and the &lt;b&gt;propertyValue&lt;/b&gt; is set to &lt;code&gt;Honda&lt;/code&gt;, only compatible Honda vehicles will be returned.
     * @return a {@link java.util.List<PropertyFilterInner>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PropertyFilterInner> getPropertyFilters() {
        return this.propertyFilters;
    }
    /**
     * Gets the propertyName property value. This field specifies the name of the property for which to retrieve associated property values.&lt;br&gt;&lt;br&gt;For example, typical vehicle property names are &apos;Make&apos;, &apos;Model&apos;, &apos;Year&apos;, &apos;Engine&apos;, and &apos;Trim&apos;, but will vary based on the eBay marketplace and the eBay category. Use the &lt;a href=&quot;/develop/api/sell/metadata_api#sell-metadata_api-compatibilities-getcompatibilitypropertynames&quot;&gt;getCompatibilityPropertyNames&lt;/a&gt; method to retrieve valid property names for a specified category.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPropertyName() {
        return this.propertyName;
    }
    /**
     * Gets the sortOrder property value. This field specifies the sort order for the property values in the result set.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;Ascending&lt;/code&gt;&lt;/li&gt;&lt;li&gt;Descending&lt;/li&gt;&lt;/ul&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; If no search order is specified, values are sorted in ascending order.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSortOrder() {
        return this.sortOrder;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("categoryId", this.getCategoryId());
        writer.writeCollectionOfObjectValues("propertyFilters", this.getPropertyFilters());
        writer.writeStringValue("propertyName", this.getPropertyName());
        writer.writeStringValue("sortOrder", this.getSortOrder());
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
     * Sets the categoryId property value. The unique identifier of the eBay leaf category for which to retrieve compatibility property values. This category must be a valid eBay category on the specified eBay marketplace, and the category must support parts compatibility.&lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/develop/api/sell/metadata_api#sell-metadata_api-marketplace-getautomotivepartscompatibilitypolicies&quot;&gt;getAutomotivePartsCompatibilityPolicies&lt;/a&gt; method to retrieve a list of categories that support parts compatibility.
     * @param value Value to set for the categoryId property.
     */
    public void setCategoryId(@jakarta.annotation.Nullable final String value) {
        this.categoryId = value;
    }
    /**
     * Sets the propertyFilters property value. This array can be used to specify the compatibility properties used limit the result set. Only values associated with the specified name-value pairs will be returned in the response.&lt;br&gt;&lt;br&gt;For example, if the &lt;b&gt;propertyName&lt;/b&gt; is set to &lt;code&gt;Make&lt;/code&gt; and the &lt;b&gt;propertyValue&lt;/b&gt; is set to &lt;code&gt;Honda&lt;/code&gt;, only compatible Honda vehicles will be returned.
     * @param value Value to set for the propertyFilters property.
     */
    public void setPropertyFilters(@jakarta.annotation.Nullable final java.util.List<PropertyFilterInner> value) {
        this.propertyFilters = value;
    }
    /**
     * Sets the propertyName property value. This field specifies the name of the property for which to retrieve associated property values.&lt;br&gt;&lt;br&gt;For example, typical vehicle property names are &apos;Make&apos;, &apos;Model&apos;, &apos;Year&apos;, &apos;Engine&apos;, and &apos;Trim&apos;, but will vary based on the eBay marketplace and the eBay category. Use the &lt;a href=&quot;/develop/api/sell/metadata_api#sell-metadata_api-compatibilities-getcompatibilitypropertynames&quot;&gt;getCompatibilityPropertyNames&lt;/a&gt; method to retrieve valid property names for a specified category.
     * @param value Value to set for the propertyName property.
     */
    public void setPropertyName(@jakarta.annotation.Nullable final String value) {
        this.propertyName = value;
    }
    /**
     * Sets the sortOrder property value. This field specifies the sort order for the property values in the result set.&lt;br&gt;&lt;br&gt;&lt;b&gt;Valid values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;Ascending&lt;/code&gt;&lt;/li&gt;&lt;li&gt;Descending&lt;/li&gt;&lt;/ul&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; If no search order is specified, values are sorted in ascending order.&lt;/span&gt;
     * @param value Value to set for the sortOrder property.
     */
    public void setSortOrder(@jakarta.annotation.Nullable final String value) {
        this.sortOrder = value;
    }
}

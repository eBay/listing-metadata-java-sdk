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
 * This type provides the properties and specifications to use to search for compatibilities.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SpecificationRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The unique identifier of the eBay leaf category for which compatibility details are being retrieved. This category must be a valid eBay category on the specified eBay marketplace, and the category must support parts compatibility for cars, trucks, or motorcycles.&lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/develop/api/sell/metadata_api#sell-metadata_api-marketplace-getautomotivepartscompatibilitypolicies&quot;&gt;getAutomotivePartsCompatibilityPolicies&lt;/a&gt; method to retrieve a list of categories that support parts compatibility by specification. For the categories in the response that support compatibility by specification, youll see &lt;code&gt;SPECIFICATIONS&lt;/code&gt; as the value for the &lt;b&gt;compatibilityBasedOn&lt;/b&gt; field 
     */
    private String categoryId;
    /**
     * This comma-delimited array can be used to restrict the number of compatible application name-value pairs returned in the response by specifying the properties that the seller wishes to be included in the response.&lt;br&gt;&lt;br&gt;Only compatible applications with the specified properties will be returned. Properties that can be specified here include make, model, year, and trim.
     */
    private java.util.List<PropertyFilterInner> compatibilityPropertyFilters;
    /**
     * This field can be used to define the type of properties that will be returned in the response.&lt;br&gt;&lt;br&gt; For example, if you specify &lt;code&gt;Searchable&lt;/code&gt;, the compatibility details will contain properties that can be used to search for products, such as make or model.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field cannot be used alongside &lt;b&gt;dataPropertyName&lt;/b&gt;. If both are used, an error will occur.&lt;/span&gt;&lt;br&gt;&lt;b&gt;Valid values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;DisplayableProductDetails&lt;/code&gt;: Properties for use in a user interface to describe products.&lt;/li&gt;&lt;li&gt;&lt;code&gt;DisplayableSearchResults&lt;/code&gt;: Properties for use in results for product searches.&lt;/li&gt;&lt;li&gt;&lt;code&gt;Searchable&lt;/code&gt;: Properties for use in searches.&lt;/li&gt;&lt;li&gt;&lt;code&gt;Sortable&lt;/code&gt;: Properties that are suitable for sorting.&lt;/li&gt;&lt;/ul&gt;&lt;b&gt;Default value:&lt;/b&gt; &lt;code&gt;DisplayableSearchResults&lt;/code&gt;
     */
    private String dataset;
    /**
     * This comma-delimited array can be used to define the specific property name(s) that will be returned in the response.&lt;br&gt;&lt;br&gt;For example, if you specify &lt;code&gt;Engine&lt;/code&gt;, the result set will only contain engines that are compatible with the input criteria.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This array cannot be used alongside &lt;b&gt;dataset&lt;/b&gt;. If both are used, an error will occur.&lt;/span&gt;
     */
    private java.util.List<String> datasetPropertyName;
    /**
     * This boolean can be used to specify that the compatibilities returned in the response are to be defined by an exact match on the input value of specification properties.&lt;br&gt;&lt;br&gt;By default, an expanded compatibility match is done when it applies, such as for Load Index, where a compatible vehicle is one that has a load index requirement that is less than or equal to the input. By specifying this field as &lt;code&gt;true&lt;/code&gt;, only exact matches are returned.
     */
    private Boolean exactMatch;
    /**
     * &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Pagination is not yet supported by this method. If this container is included in the request, it will be ignored.&lt;/p&gt;&lt;/div&gt;
     */
    private PaginationInput paginationInput;
    /**
     * This array specifies the sorting order of the compatibility properties. Any of the searchable properties can be used to specify search order. Up to 5 levels of sort order may be specified.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; If no sort order is specified through this field, the default sort order of &lt;b&gt;popularity descending&lt;/b&gt; is applied.&lt;/span&gt;
     */
    private java.util.List<SortOrderInner> sortOrders;
    /**
     * This array defines the specifications of the part, in the form of name-value pairs, for which compatible applications will be retrieved.
     */
    private java.util.List<PropertyFilterInner> specifications;
    /**
     * Instantiates a new {@link SpecificationRequest} and sets the default values.
     */
    public SpecificationRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SpecificationRequest}
     */
    @jakarta.annotation.Nonnull
    public static SpecificationRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SpecificationRequest();
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
     * Gets the categoryId property value. The unique identifier of the eBay leaf category for which compatibility details are being retrieved. This category must be a valid eBay category on the specified eBay marketplace, and the category must support parts compatibility for cars, trucks, or motorcycles.&lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/develop/api/sell/metadata_api#sell-metadata_api-marketplace-getautomotivepartscompatibilitypolicies&quot;&gt;getAutomotivePartsCompatibilityPolicies&lt;/a&gt; method to retrieve a list of categories that support parts compatibility by specification. For the categories in the response that support compatibility by specification, youll see &lt;code&gt;SPECIFICATIONS&lt;/code&gt; as the value for the &lt;b&gt;compatibilityBasedOn&lt;/b&gt; field 
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCategoryId() {
        return this.categoryId;
    }
    /**
     * Gets the compatibilityPropertyFilters property value. This comma-delimited array can be used to restrict the number of compatible application name-value pairs returned in the response by specifying the properties that the seller wishes to be included in the response.&lt;br&gt;&lt;br&gt;Only compatible applications with the specified properties will be returned. Properties that can be specified here include make, model, year, and trim.
     * @return a {@link java.util.List<PropertyFilterInner>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PropertyFilterInner> getCompatibilityPropertyFilters() {
        return this.compatibilityPropertyFilters;
    }
    /**
     * Gets the dataset property value. This field can be used to define the type of properties that will be returned in the response.&lt;br&gt;&lt;br&gt; For example, if you specify &lt;code&gt;Searchable&lt;/code&gt;, the compatibility details will contain properties that can be used to search for products, such as make or model.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field cannot be used alongside &lt;b&gt;dataPropertyName&lt;/b&gt;. If both are used, an error will occur.&lt;/span&gt;&lt;br&gt;&lt;b&gt;Valid values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;DisplayableProductDetails&lt;/code&gt;: Properties for use in a user interface to describe products.&lt;/li&gt;&lt;li&gt;&lt;code&gt;DisplayableSearchResults&lt;/code&gt;: Properties for use in results for product searches.&lt;/li&gt;&lt;li&gt;&lt;code&gt;Searchable&lt;/code&gt;: Properties for use in searches.&lt;/li&gt;&lt;li&gt;&lt;code&gt;Sortable&lt;/code&gt;: Properties that are suitable for sorting.&lt;/li&gt;&lt;/ul&gt;&lt;b&gt;Default value:&lt;/b&gt; &lt;code&gt;DisplayableSearchResults&lt;/code&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDataset() {
        return this.dataset;
    }
    /**
     * Gets the datasetPropertyName property value. This comma-delimited array can be used to define the specific property name(s) that will be returned in the response.&lt;br&gt;&lt;br&gt;For example, if you specify &lt;code&gt;Engine&lt;/code&gt;, the result set will only contain engines that are compatible with the input criteria.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This array cannot be used alongside &lt;b&gt;dataset&lt;/b&gt;. If both are used, an error will occur.&lt;/span&gt;
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDatasetPropertyName() {
        return this.datasetPropertyName;
    }
    /**
     * Gets the exactMatch property value. This boolean can be used to specify that the compatibilities returned in the response are to be defined by an exact match on the input value of specification properties.&lt;br&gt;&lt;br&gt;By default, an expanded compatibility match is done when it applies, such as for Load Index, where a compatible vehicle is one that has a load index requirement that is less than or equal to the input. By specifying this field as &lt;code&gt;true&lt;/code&gt;, only exact matches are returned.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getExactMatch() {
        return this.exactMatch;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("categoryId", (n) -> { this.setCategoryId(n.getStringValue()); });
        deserializerMap.put("compatibilityPropertyFilters", (n) -> { this.setCompatibilityPropertyFilters(n.getCollectionOfObjectValues(PropertyFilterInner::createFromDiscriminatorValue)); });
        deserializerMap.put("dataset", (n) -> { this.setDataset(n.getStringValue()); });
        deserializerMap.put("datasetPropertyName", (n) -> { this.setDatasetPropertyName(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("exactMatch", (n) -> { this.setExactMatch(n.getBooleanValue()); });
        deserializerMap.put("paginationInput", (n) -> { this.setPaginationInput(n.getObjectValue(PaginationInput::createFromDiscriminatorValue)); });
        deserializerMap.put("sortOrders", (n) -> { this.setSortOrders(n.getCollectionOfObjectValues(SortOrderInner::createFromDiscriminatorValue)); });
        deserializerMap.put("specifications", (n) -> { this.setSpecifications(n.getCollectionOfObjectValues(PropertyFilterInner::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the paginationInput property value. &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Pagination is not yet supported by this method. If this container is included in the request, it will be ignored.&lt;/p&gt;&lt;/div&gt;
     * @return a {@link PaginationInput}
     */
    @jakarta.annotation.Nullable
    public PaginationInput getPaginationInput() {
        return this.paginationInput;
    }
    /**
     * Gets the sortOrders property value. This array specifies the sorting order of the compatibility properties. Any of the searchable properties can be used to specify search order. Up to 5 levels of sort order may be specified.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; If no sort order is specified through this field, the default sort order of &lt;b&gt;popularity descending&lt;/b&gt; is applied.&lt;/span&gt;
     * @return a {@link java.util.List<SortOrderInner>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SortOrderInner> getSortOrders() {
        return this.sortOrders;
    }
    /**
     * Gets the specifications property value. This array defines the specifications of the part, in the form of name-value pairs, for which compatible applications will be retrieved.
     * @return a {@link java.util.List<PropertyFilterInner>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PropertyFilterInner> getSpecifications() {
        return this.specifications;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("categoryId", this.getCategoryId());
        writer.writeCollectionOfObjectValues("compatibilityPropertyFilters", this.getCompatibilityPropertyFilters());
        writer.writeStringValue("dataset", this.getDataset());
        writer.writeCollectionOfPrimitiveValues("datasetPropertyName", this.getDatasetPropertyName());
        writer.writeBooleanValue("exactMatch", this.getExactMatch());
        writer.writeObjectValue("paginationInput", this.getPaginationInput());
        writer.writeCollectionOfObjectValues("sortOrders", this.getSortOrders());
        writer.writeCollectionOfObjectValues("specifications", this.getSpecifications());
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
     * Sets the categoryId property value. The unique identifier of the eBay leaf category for which compatibility details are being retrieved. This category must be a valid eBay category on the specified eBay marketplace, and the category must support parts compatibility for cars, trucks, or motorcycles.&lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/develop/api/sell/metadata_api#sell-metadata_api-marketplace-getautomotivepartscompatibilitypolicies&quot;&gt;getAutomotivePartsCompatibilityPolicies&lt;/a&gt; method to retrieve a list of categories that support parts compatibility by specification. For the categories in the response that support compatibility by specification, youll see &lt;code&gt;SPECIFICATIONS&lt;/code&gt; as the value for the &lt;b&gt;compatibilityBasedOn&lt;/b&gt; field 
     * @param value Value to set for the categoryId property.
     */
    public void setCategoryId(@jakarta.annotation.Nullable final String value) {
        this.categoryId = value;
    }
    /**
     * Sets the compatibilityPropertyFilters property value. This comma-delimited array can be used to restrict the number of compatible application name-value pairs returned in the response by specifying the properties that the seller wishes to be included in the response.&lt;br&gt;&lt;br&gt;Only compatible applications with the specified properties will be returned. Properties that can be specified here include make, model, year, and trim.
     * @param value Value to set for the compatibilityPropertyFilters property.
     */
    public void setCompatibilityPropertyFilters(@jakarta.annotation.Nullable final java.util.List<PropertyFilterInner> value) {
        this.compatibilityPropertyFilters = value;
    }
    /**
     * Sets the dataset property value. This field can be used to define the type of properties that will be returned in the response.&lt;br&gt;&lt;br&gt; For example, if you specify &lt;code&gt;Searchable&lt;/code&gt;, the compatibility details will contain properties that can be used to search for products, such as make or model.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field cannot be used alongside &lt;b&gt;dataPropertyName&lt;/b&gt;. If both are used, an error will occur.&lt;/span&gt;&lt;br&gt;&lt;b&gt;Valid values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;DisplayableProductDetails&lt;/code&gt;: Properties for use in a user interface to describe products.&lt;/li&gt;&lt;li&gt;&lt;code&gt;DisplayableSearchResults&lt;/code&gt;: Properties for use in results for product searches.&lt;/li&gt;&lt;li&gt;&lt;code&gt;Searchable&lt;/code&gt;: Properties for use in searches.&lt;/li&gt;&lt;li&gt;&lt;code&gt;Sortable&lt;/code&gt;: Properties that are suitable for sorting.&lt;/li&gt;&lt;/ul&gt;&lt;b&gt;Default value:&lt;/b&gt; &lt;code&gt;DisplayableSearchResults&lt;/code&gt;
     * @param value Value to set for the dataset property.
     */
    public void setDataset(@jakarta.annotation.Nullable final String value) {
        this.dataset = value;
    }
    /**
     * Sets the datasetPropertyName property value. This comma-delimited array can be used to define the specific property name(s) that will be returned in the response.&lt;br&gt;&lt;br&gt;For example, if you specify &lt;code&gt;Engine&lt;/code&gt;, the result set will only contain engines that are compatible with the input criteria.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This array cannot be used alongside &lt;b&gt;dataset&lt;/b&gt;. If both are used, an error will occur.&lt;/span&gt;
     * @param value Value to set for the datasetPropertyName property.
     */
    public void setDatasetPropertyName(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.datasetPropertyName = value;
    }
    /**
     * Sets the exactMatch property value. This boolean can be used to specify that the compatibilities returned in the response are to be defined by an exact match on the input value of specification properties.&lt;br&gt;&lt;br&gt;By default, an expanded compatibility match is done when it applies, such as for Load Index, where a compatible vehicle is one that has a load index requirement that is less than or equal to the input. By specifying this field as &lt;code&gt;true&lt;/code&gt;, only exact matches are returned.
     * @param value Value to set for the exactMatch property.
     */
    public void setExactMatch(@jakarta.annotation.Nullable final Boolean value) {
        this.exactMatch = value;
    }
    /**
     * Sets the paginationInput property value. &lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; Pagination is not yet supported by this method. If this container is included in the request, it will be ignored.&lt;/p&gt;&lt;/div&gt;
     * @param value Value to set for the paginationInput property.
     */
    public void setPaginationInput(@jakarta.annotation.Nullable final PaginationInput value) {
        this.paginationInput = value;
    }
    /**
     * Sets the sortOrders property value. This array specifies the sorting order of the compatibility properties. Any of the searchable properties can be used to specify search order. Up to 5 levels of sort order may be specified.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; If no sort order is specified through this field, the default sort order of &lt;b&gt;popularity descending&lt;/b&gt; is applied.&lt;/span&gt;
     * @param value Value to set for the sortOrders property.
     */
    public void setSortOrders(@jakarta.annotation.Nullable final java.util.List<SortOrderInner> value) {
        this.sortOrders = value;
    }
    /**
     * Sets the specifications property value. This array defines the specifications of the part, in the form of name-value pairs, for which compatible applications will be retrieved.
     * @param value Value to set for the specifications property.
     */
    public void setSpecifications(@jakarta.annotation.Nullable final java.util.List<PropertyFilterInner> value) {
        this.specifications = value;
    }
}

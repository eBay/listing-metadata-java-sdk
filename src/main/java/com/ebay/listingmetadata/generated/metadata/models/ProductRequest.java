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
 * This type defines properties for which to find compatibilities.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProductRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This array is used to filter the properties of an application, such as a vehicle&apos;s make or model, that will be returned in the response.&lt;br&gt;&lt;br&gt;Application property filters are specified as name-value pairs. Only products compatible with these name-value pairs will be returned.
     */
    private java.util.List<PropertyFilterInner> applicationPropertyFilters;
    /**
     * This array defines the type of properties that are returned for the catalog-enabled category.&lt;br&gt;&lt;br&gt;For example, if you specify &lt;code&gt;Searchable&lt;/code&gt;, the compatibility details will contain properties that can be used to search for products, such as make or model.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field cannot be used alongside &lt;b&gt;dataPropertyName&lt;/b&gt;. If both are used, an error will occur.&lt;/span&gt;&lt;br&gt;&lt;b&gt;Valid values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;DisplayableProductDetails&lt;/code&gt;: Properties for use in a user interface to describe products.&lt;/li&gt;&lt;li&gt;&lt;code&gt;DisplayableSearchResults&lt;/code&gt;: Properties for use in results for product searches.&lt;/li&gt;&lt;li&gt;&lt;code&gt;Searchable&lt;/code&gt;: Properties for use in searches.&lt;/li&gt;&lt;li&gt;&lt;code&gt;Sortable&lt;/code&gt;: Properties that are suitable for sorting.&lt;/li&gt;&lt;/ul&gt;&lt;br&gt;&lt;b&gt;Default:&lt;/b&gt; &lt;code&gt;DisplayableSearchResults&lt;/code&gt;
     */
    private java.util.List<String> dataset;
    /**
     * This comma-delimted array can be used to define the specific property name(s) that will be returned in the response.&lt;br&gt;&lt;br&gt;For example, if you specify &lt;code&gt;Engine&lt;/code&gt;, the result set will only contain engines that are compatible with the input criteria.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This array cannot be used alongside &lt;b&gt;dataset&lt;/b&gt;. If both are used, an error will occur.&lt;/span&gt;
     */
    private java.util.List<String> datasetPropertyName;
    /**
     * This container can be used to specify whether or not to filter out products which are disabled for selling on eBay and/or disabled for product review. 
     */
    private DisabledProductFilter disabledProductFilter;
    /**
     * This container controls the pagination of the result set.
     */
    private PaginationInput paginationInput;
    /**
     * This container is used to provide unique identifier for the product. The product identifier consists of an identifier type and value, and are unique across all sites.
     */
    private ProductIdentifier productIdentifier;
    /**
     * This array controls the sort order of compatibility properties.
     */
    private java.util.List<SortOrderInner> sortOrders;
    /**
     * Instantiates a new {@link ProductRequest} and sets the default values.
     */
    public ProductRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ProductRequest}
     */
    @jakarta.annotation.Nonnull
    public static ProductRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProductRequest();
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
     * Gets the applicationPropertyFilters property value. This array is used to filter the properties of an application, such as a vehicle&apos;s make or model, that will be returned in the response.&lt;br&gt;&lt;br&gt;Application property filters are specified as name-value pairs. Only products compatible with these name-value pairs will be returned.
     * @return a {@link java.util.List<PropertyFilterInner>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PropertyFilterInner> getApplicationPropertyFilters() {
        return this.applicationPropertyFilters;
    }
    /**
     * Gets the dataset property value. This array defines the type of properties that are returned for the catalog-enabled category.&lt;br&gt;&lt;br&gt;For example, if you specify &lt;code&gt;Searchable&lt;/code&gt;, the compatibility details will contain properties that can be used to search for products, such as make or model.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field cannot be used alongside &lt;b&gt;dataPropertyName&lt;/b&gt;. If both are used, an error will occur.&lt;/span&gt;&lt;br&gt;&lt;b&gt;Valid values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;DisplayableProductDetails&lt;/code&gt;: Properties for use in a user interface to describe products.&lt;/li&gt;&lt;li&gt;&lt;code&gt;DisplayableSearchResults&lt;/code&gt;: Properties for use in results for product searches.&lt;/li&gt;&lt;li&gt;&lt;code&gt;Searchable&lt;/code&gt;: Properties for use in searches.&lt;/li&gt;&lt;li&gt;&lt;code&gt;Sortable&lt;/code&gt;: Properties that are suitable for sorting.&lt;/li&gt;&lt;/ul&gt;&lt;br&gt;&lt;b&gt;Default:&lt;/b&gt; &lt;code&gt;DisplayableSearchResults&lt;/code&gt;
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDataset() {
        return this.dataset;
    }
    /**
     * Gets the datasetPropertyName property value. This comma-delimted array can be used to define the specific property name(s) that will be returned in the response.&lt;br&gt;&lt;br&gt;For example, if you specify &lt;code&gt;Engine&lt;/code&gt;, the result set will only contain engines that are compatible with the input criteria.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This array cannot be used alongside &lt;b&gt;dataset&lt;/b&gt;. If both are used, an error will occur.&lt;/span&gt;
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDatasetPropertyName() {
        return this.datasetPropertyName;
    }
    /**
     * Gets the disabledProductFilter property value. This container can be used to specify whether or not to filter out products which are disabled for selling on eBay and/or disabled for product review. 
     * @return a {@link DisabledProductFilter}
     */
    @jakarta.annotation.Nullable
    public DisabledProductFilter getDisabledProductFilter() {
        return this.disabledProductFilter;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("applicationPropertyFilters", (n) -> { this.setApplicationPropertyFilters(n.getCollectionOfObjectValues(PropertyFilterInner::createFromDiscriminatorValue)); });
        deserializerMap.put("dataset", (n) -> { this.setDataset(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("datasetPropertyName", (n) -> { this.setDatasetPropertyName(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("disabledProductFilter", (n) -> { this.setDisabledProductFilter(n.getObjectValue(DisabledProductFilter::createFromDiscriminatorValue)); });
        deserializerMap.put("paginationInput", (n) -> { this.setPaginationInput(n.getObjectValue(PaginationInput::createFromDiscriminatorValue)); });
        deserializerMap.put("productIdentifier", (n) -> { this.setProductIdentifier(n.getObjectValue(ProductIdentifier::createFromDiscriminatorValue)); });
        deserializerMap.put("sortOrders", (n) -> { this.setSortOrders(n.getCollectionOfObjectValues(SortOrderInner::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the paginationInput property value. This container controls the pagination of the result set.
     * @return a {@link PaginationInput}
     */
    @jakarta.annotation.Nullable
    public PaginationInput getPaginationInput() {
        return this.paginationInput;
    }
    /**
     * Gets the productIdentifier property value. This container is used to provide unique identifier for the product. The product identifier consists of an identifier type and value, and are unique across all sites.
     * @return a {@link ProductIdentifier}
     */
    @jakarta.annotation.Nullable
    public ProductIdentifier getProductIdentifier() {
        return this.productIdentifier;
    }
    /**
     * Gets the sortOrders property value. This array controls the sort order of compatibility properties.
     * @return a {@link java.util.List<SortOrderInner>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SortOrderInner> getSortOrders() {
        return this.sortOrders;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("applicationPropertyFilters", this.getApplicationPropertyFilters());
        writer.writeCollectionOfPrimitiveValues("dataset", this.getDataset());
        writer.writeCollectionOfPrimitiveValues("datasetPropertyName", this.getDatasetPropertyName());
        writer.writeObjectValue("disabledProductFilter", this.getDisabledProductFilter());
        writer.writeObjectValue("paginationInput", this.getPaginationInput());
        writer.writeObjectValue("productIdentifier", this.getProductIdentifier());
        writer.writeCollectionOfObjectValues("sortOrders", this.getSortOrders());
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
     * Sets the applicationPropertyFilters property value. This array is used to filter the properties of an application, such as a vehicle&apos;s make or model, that will be returned in the response.&lt;br&gt;&lt;br&gt;Application property filters are specified as name-value pairs. Only products compatible with these name-value pairs will be returned.
     * @param value Value to set for the applicationPropertyFilters property.
     */
    public void setApplicationPropertyFilters(@jakarta.annotation.Nullable final java.util.List<PropertyFilterInner> value) {
        this.applicationPropertyFilters = value;
    }
    /**
     * Sets the dataset property value. This array defines the type of properties that are returned for the catalog-enabled category.&lt;br&gt;&lt;br&gt;For example, if you specify &lt;code&gt;Searchable&lt;/code&gt;, the compatibility details will contain properties that can be used to search for products, such as make or model.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This field cannot be used alongside &lt;b&gt;dataPropertyName&lt;/b&gt;. If both are used, an error will occur.&lt;/span&gt;&lt;br&gt;&lt;b&gt;Valid values:&lt;/b&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;DisplayableProductDetails&lt;/code&gt;: Properties for use in a user interface to describe products.&lt;/li&gt;&lt;li&gt;&lt;code&gt;DisplayableSearchResults&lt;/code&gt;: Properties for use in results for product searches.&lt;/li&gt;&lt;li&gt;&lt;code&gt;Searchable&lt;/code&gt;: Properties for use in searches.&lt;/li&gt;&lt;li&gt;&lt;code&gt;Sortable&lt;/code&gt;: Properties that are suitable for sorting.&lt;/li&gt;&lt;/ul&gt;&lt;br&gt;&lt;b&gt;Default:&lt;/b&gt; &lt;code&gt;DisplayableSearchResults&lt;/code&gt;
     * @param value Value to set for the dataset property.
     */
    public void setDataset(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.dataset = value;
    }
    /**
     * Sets the datasetPropertyName property value. This comma-delimted array can be used to define the specific property name(s) that will be returned in the response.&lt;br&gt;&lt;br&gt;For example, if you specify &lt;code&gt;Engine&lt;/code&gt;, the result set will only contain engines that are compatible with the input criteria.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This array cannot be used alongside &lt;b&gt;dataset&lt;/b&gt;. If both are used, an error will occur.&lt;/span&gt;
     * @param value Value to set for the datasetPropertyName property.
     */
    public void setDatasetPropertyName(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.datasetPropertyName = value;
    }
    /**
     * Sets the disabledProductFilter property value. This container can be used to specify whether or not to filter out products which are disabled for selling on eBay and/or disabled for product review. 
     * @param value Value to set for the disabledProductFilter property.
     */
    public void setDisabledProductFilter(@jakarta.annotation.Nullable final DisabledProductFilter value) {
        this.disabledProductFilter = value;
    }
    /**
     * Sets the paginationInput property value. This container controls the pagination of the result set.
     * @param value Value to set for the paginationInput property.
     */
    public void setPaginationInput(@jakarta.annotation.Nullable final PaginationInput value) {
        this.paginationInput = value;
    }
    /**
     * Sets the productIdentifier property value. This container is used to provide unique identifier for the product. The product identifier consists of an identifier type and value, and are unique across all sites.
     * @param value Value to set for the productIdentifier property.
     */
    public void setProductIdentifier(@jakarta.annotation.Nullable final ProductIdentifier value) {
        this.productIdentifier = value;
    }
    /**
     * Sets the sortOrders property value. This array controls the sort order of compatibility properties.
     * @param value Value to set for the sortOrders property.
     */
    public void setSortOrders(@jakarta.annotation.Nullable final java.util.List<SortOrderInner> value) {
        this.sortOrders = value;
    }
}

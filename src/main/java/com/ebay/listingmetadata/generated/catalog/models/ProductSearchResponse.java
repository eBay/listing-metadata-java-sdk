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

package com.ebay.listingmetadata.generated.catalog.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type contains the specifications for the collection of products that match the search or filter criteria of a &lt;strong&gt;search&lt;/strong&gt; call. A maximum of 200 product summaries is returned (the result set), fewer if you include the &lt;strong&gt;limit&lt;/strong&gt; query parameter in the request. 
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProductSearchResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This field is reserved for internal or future use. &lt;!-- The URI of the &lt;strong&gt;search&lt;/strong&gt; method request that produced this result set. --&gt;
     */
    private String href;
    /**
     * The number of product summaries returned in the response. This is the &lt;i&gt;result set&lt;/i&gt;, a subset of the full collection of products that match the search or filter criteria of this call. If the &lt;strong&gt;limit&lt;/strong&gt; query parameter was included in the request, this field will have the same value. &lt;br /&gt;&lt;br /&gt; &lt;strong&gt;Default:&lt;/strong&gt; &lt;code&gt;50&lt;/code&gt;
     */
    private Integer limit;
    /**
     * This field is reserved for internal or future use. &lt;!-- &lt;i&gt;Returned only if&lt;/i&gt; there are more product records to retrieve from the current collection of matching products, this field contains the &lt;b&gt;search&lt;/b&gt; call URI for the next result set. For example, the following URI returns records 41 thru 50 from the collection of matched products: &lt;br /&gt;&lt;br /&gt; &lt;code&gt;&lt;i&gt;path&lt;/i&gt;/product_summary/search?limit=10&amp;offset=40&lt;/code&gt; &lt;br /&gt;&lt;br /&gt;  &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This feature employs a zero-based list, where the first product in the list has an offset of &lt;code&gt;0&lt;/code&gt;.&lt;/span&gt; --&gt;
     */
    private String next;
    /**
     * This field is reserved for internal or future use. &lt;!-- The distance (number of records) from the first product in the collection to the first product in this result set. If the &lt;b&gt;offset&lt;/b&gt; query parameter was included in the request, this field will have the same value. The &lt;b&gt;offset&lt;/b&gt; value is used in conjunction with the &lt;b&gt;limit&lt;/b&gt; value to control the pagination of the output. For example, if &lt;b&gt;offset&lt;/b&gt; is set to &lt;code&gt;30&lt;/code&gt; and &lt;b&gt;limit&lt;/b&gt; is set to &lt;code&gt;10&lt;/code&gt;, the call retrieves products 31 thru 40 from the resulting collection of products. &lt;br /&gt;&lt;br /&gt;  &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This feature employs a zero-based list, where the first item in the list has an offset of &lt;code&gt;0&lt;/code&gt;.&lt;/span&gt; &lt;br /&gt;&lt;br /&gt; &lt;b&gt;Default:&lt;/b&gt; &lt;code&gt;0&lt;/code&gt; (zero) --&gt;
     */
    private Integer offset;
    /**
     * This field is reserved for internal or future use.  &lt;!-- &lt;i&gt;Not returned if&lt;/i&gt; the currently returned result set is the first set of product records from the current collection of matching products. This field contains the &lt;b&gt;search&lt;/b&gt; call URI for the previous result set. For example, the following URI returns products 21 thru 30 from the collection of products: &lt;br /&gt;&lt;br /&gt; &lt;code&gt;&lt;i&gt;path&lt;/i&gt;/product_summary/search?limit=10&amp;offset=20&lt;/code&gt; &lt;br /&gt;&lt;br /&gt;  &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This feature employs a zero-based list, where the first product in the list has an offset of &lt;code&gt;0&lt;/code&gt;.&lt;/span&gt; --&gt;
     */
    private String prev;
    /**
     * &lt;i&gt;Returned if&lt;/i&gt; the &lt;strong&gt;fieldGroups&lt;/strong&gt; query parameter was omitted from the request, or if it was included with a value of &lt;code&gt;MATCHING_PRODUCTS&lt;/code&gt; or &lt;code&gt;FULL&lt;/code&gt;. This container provides an array of product summaries in the current result set for products that match the combination of the &lt;strong&gt;q&lt;/strong&gt;, &lt;strong&gt;category_ids&lt;/strong&gt;, and &lt;strong&gt;aspect_filter&lt;/strong&gt; parameters that were provided in the request. Each product summary includes information about the product&apos;s identifiers, product images, aspects, the product page URL, and the &lt;strong&gt;getProduct&lt;/strong&gt; URL for retrieving the product details.
     */
    private java.util.List<ProductSummary> productSummaries;
    /**
     * &lt;i&gt;Returned only if&lt;/i&gt; the &lt;strong&gt;fieldGroups&lt;/strong&gt; query parameter was included in the request with a value of &lt;code&gt;ASPECT_REFINEMENTS&lt;/code&gt; or &lt;code&gt;FULL&lt;/code&gt;. &lt;br /&gt;&lt;br /&gt; An aspect is a property of a category, used by sellers to provide details about the items they&apos;re listing. For example, the &lt;i&gt;Cell Phones &amp;amp; Smartphones&lt;/i&gt; category (#9355) includes a &lt;i&gt;Storage Capacity&lt;/i&gt; aspect. &lt;br /&gt;&lt;br /&gt; This container provides information about the distribution of values of a set of category aspects. The category aspects are those associated with the category that eBay determines is most likely to cover the products that match the search criteria.
     */
    private Refinement refinement;
    /**
     * This field is reserved for internal or future use. &lt;!-- The total number of product records in the returned collection of matched products. --&gt;
     */
    private Integer total;
    /**
     * Instantiates a new {@link ProductSearchResponse} and sets the default values.
     */
    public ProductSearchResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ProductSearchResponse}
     */
    @jakarta.annotation.Nonnull
    public static ProductSearchResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProductSearchResponse();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("href", (n) -> { this.setHref(n.getStringValue()); });
        deserializerMap.put("limit", (n) -> { this.setLimit(n.getIntegerValue()); });
        deserializerMap.put("next", (n) -> { this.setNext(n.getStringValue()); });
        deserializerMap.put("offset", (n) -> { this.setOffset(n.getIntegerValue()); });
        deserializerMap.put("prev", (n) -> { this.setPrev(n.getStringValue()); });
        deserializerMap.put("productSummaries", (n) -> { this.setProductSummaries(n.getCollectionOfObjectValues(ProductSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("refinement", (n) -> { this.setRefinement(n.getObjectValue(Refinement::createFromDiscriminatorValue)); });
        deserializerMap.put("total", (n) -> { this.setTotal(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the href property value. This field is reserved for internal or future use. &lt;!-- The URI of the &lt;strong&gt;search&lt;/strong&gt; method request that produced this result set. --&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getHref() {
        return this.href;
    }
    /**
     * Gets the limit property value. The number of product summaries returned in the response. This is the &lt;i&gt;result set&lt;/i&gt;, a subset of the full collection of products that match the search or filter criteria of this call. If the &lt;strong&gt;limit&lt;/strong&gt; query parameter was included in the request, this field will have the same value. &lt;br /&gt;&lt;br /&gt; &lt;strong&gt;Default:&lt;/strong&gt; &lt;code&gt;50&lt;/code&gt;
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getLimit() {
        return this.limit;
    }
    /**
     * Gets the next property value. This field is reserved for internal or future use. &lt;!-- &lt;i&gt;Returned only if&lt;/i&gt; there are more product records to retrieve from the current collection of matching products, this field contains the &lt;b&gt;search&lt;/b&gt; call URI for the next result set. For example, the following URI returns records 41 thru 50 from the collection of matched products: &lt;br /&gt;&lt;br /&gt; &lt;code&gt;&lt;i&gt;path&lt;/i&gt;/product_summary/search?limit=10&amp;offset=40&lt;/code&gt; &lt;br /&gt;&lt;br /&gt;  &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This feature employs a zero-based list, where the first product in the list has an offset of &lt;code&gt;0&lt;/code&gt;.&lt;/span&gt; --&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNext() {
        return this.next;
    }
    /**
     * Gets the offset property value. This field is reserved for internal or future use. &lt;!-- The distance (number of records) from the first product in the collection to the first product in this result set. If the &lt;b&gt;offset&lt;/b&gt; query parameter was included in the request, this field will have the same value. The &lt;b&gt;offset&lt;/b&gt; value is used in conjunction with the &lt;b&gt;limit&lt;/b&gt; value to control the pagination of the output. For example, if &lt;b&gt;offset&lt;/b&gt; is set to &lt;code&gt;30&lt;/code&gt; and &lt;b&gt;limit&lt;/b&gt; is set to &lt;code&gt;10&lt;/code&gt;, the call retrieves products 31 thru 40 from the resulting collection of products. &lt;br /&gt;&lt;br /&gt;  &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This feature employs a zero-based list, where the first item in the list has an offset of &lt;code&gt;0&lt;/code&gt;.&lt;/span&gt; &lt;br /&gt;&lt;br /&gt; &lt;b&gt;Default:&lt;/b&gt; &lt;code&gt;0&lt;/code&gt; (zero) --&gt;
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getOffset() {
        return this.offset;
    }
    /**
     * Gets the prev property value. This field is reserved for internal or future use.  &lt;!-- &lt;i&gt;Not returned if&lt;/i&gt; the currently returned result set is the first set of product records from the current collection of matching products. This field contains the &lt;b&gt;search&lt;/b&gt; call URI for the previous result set. For example, the following URI returns products 21 thru 30 from the collection of products: &lt;br /&gt;&lt;br /&gt; &lt;code&gt;&lt;i&gt;path&lt;/i&gt;/product_summary/search?limit=10&amp;offset=20&lt;/code&gt; &lt;br /&gt;&lt;br /&gt;  &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This feature employs a zero-based list, where the first product in the list has an offset of &lt;code&gt;0&lt;/code&gt;.&lt;/span&gt; --&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPrev() {
        return this.prev;
    }
    /**
     * Gets the productSummaries property value. &lt;i&gt;Returned if&lt;/i&gt; the &lt;strong&gt;fieldGroups&lt;/strong&gt; query parameter was omitted from the request, or if it was included with a value of &lt;code&gt;MATCHING_PRODUCTS&lt;/code&gt; or &lt;code&gt;FULL&lt;/code&gt;. This container provides an array of product summaries in the current result set for products that match the combination of the &lt;strong&gt;q&lt;/strong&gt;, &lt;strong&gt;category_ids&lt;/strong&gt;, and &lt;strong&gt;aspect_filter&lt;/strong&gt; parameters that were provided in the request. Each product summary includes information about the product&apos;s identifiers, product images, aspects, the product page URL, and the &lt;strong&gt;getProduct&lt;/strong&gt; URL for retrieving the product details.
     * @return a {@link java.util.List<ProductSummary>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ProductSummary> getProductSummaries() {
        return this.productSummaries;
    }
    /**
     * Gets the refinement property value. &lt;i&gt;Returned only if&lt;/i&gt; the &lt;strong&gt;fieldGroups&lt;/strong&gt; query parameter was included in the request with a value of &lt;code&gt;ASPECT_REFINEMENTS&lt;/code&gt; or &lt;code&gt;FULL&lt;/code&gt;. &lt;br /&gt;&lt;br /&gt; An aspect is a property of a category, used by sellers to provide details about the items they&apos;re listing. For example, the &lt;i&gt;Cell Phones &amp;amp; Smartphones&lt;/i&gt; category (#9355) includes a &lt;i&gt;Storage Capacity&lt;/i&gt; aspect. &lt;br /&gt;&lt;br /&gt; This container provides information about the distribution of values of a set of category aspects. The category aspects are those associated with the category that eBay determines is most likely to cover the products that match the search criteria.
     * @return a {@link Refinement}
     */
    @jakarta.annotation.Nullable
    public Refinement getRefinement() {
        return this.refinement;
    }
    /**
     * Gets the total property value. This field is reserved for internal or future use. &lt;!-- The total number of product records in the returned collection of matched products. --&gt;
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotal() {
        return this.total;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("href", this.getHref());
        writer.writeIntegerValue("limit", this.getLimit());
        writer.writeStringValue("next", this.getNext());
        writer.writeIntegerValue("offset", this.getOffset());
        writer.writeStringValue("prev", this.getPrev());
        writer.writeCollectionOfObjectValues("productSummaries", this.getProductSummaries());
        writer.writeObjectValue("refinement", this.getRefinement());
        writer.writeIntegerValue("total", this.getTotal());
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
     * Sets the href property value. This field is reserved for internal or future use. &lt;!-- The URI of the &lt;strong&gt;search&lt;/strong&gt; method request that produced this result set. --&gt;
     * @param value Value to set for the href property.
     */
    public void setHref(@jakarta.annotation.Nullable final String value) {
        this.href = value;
    }
    /**
     * Sets the limit property value. The number of product summaries returned in the response. This is the &lt;i&gt;result set&lt;/i&gt;, a subset of the full collection of products that match the search or filter criteria of this call. If the &lt;strong&gt;limit&lt;/strong&gt; query parameter was included in the request, this field will have the same value. &lt;br /&gt;&lt;br /&gt; &lt;strong&gt;Default:&lt;/strong&gt; &lt;code&gt;50&lt;/code&gt;
     * @param value Value to set for the limit property.
     */
    public void setLimit(@jakarta.annotation.Nullable final Integer value) {
        this.limit = value;
    }
    /**
     * Sets the next property value. This field is reserved for internal or future use. &lt;!-- &lt;i&gt;Returned only if&lt;/i&gt; there are more product records to retrieve from the current collection of matching products, this field contains the &lt;b&gt;search&lt;/b&gt; call URI for the next result set. For example, the following URI returns records 41 thru 50 from the collection of matched products: &lt;br /&gt;&lt;br /&gt; &lt;code&gt;&lt;i&gt;path&lt;/i&gt;/product_summary/search?limit=10&amp;offset=40&lt;/code&gt; &lt;br /&gt;&lt;br /&gt;  &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This feature employs a zero-based list, where the first product in the list has an offset of &lt;code&gt;0&lt;/code&gt;.&lt;/span&gt; --&gt;
     * @param value Value to set for the next property.
     */
    public void setNext(@jakarta.annotation.Nullable final String value) {
        this.next = value;
    }
    /**
     * Sets the offset property value. This field is reserved for internal or future use. &lt;!-- The distance (number of records) from the first product in the collection to the first product in this result set. If the &lt;b&gt;offset&lt;/b&gt; query parameter was included in the request, this field will have the same value. The &lt;b&gt;offset&lt;/b&gt; value is used in conjunction with the &lt;b&gt;limit&lt;/b&gt; value to control the pagination of the output. For example, if &lt;b&gt;offset&lt;/b&gt; is set to &lt;code&gt;30&lt;/code&gt; and &lt;b&gt;limit&lt;/b&gt; is set to &lt;code&gt;10&lt;/code&gt;, the call retrieves products 31 thru 40 from the resulting collection of products. &lt;br /&gt;&lt;br /&gt;  &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This feature employs a zero-based list, where the first item in the list has an offset of &lt;code&gt;0&lt;/code&gt;.&lt;/span&gt; &lt;br /&gt;&lt;br /&gt; &lt;b&gt;Default:&lt;/b&gt; &lt;code&gt;0&lt;/code&gt; (zero) --&gt;
     * @param value Value to set for the offset property.
     */
    public void setOffset(@jakarta.annotation.Nullable final Integer value) {
        this.offset = value;
    }
    /**
     * Sets the prev property value. This field is reserved for internal or future use.  &lt;!-- &lt;i&gt;Not returned if&lt;/i&gt; the currently returned result set is the first set of product records from the current collection of matching products. This field contains the &lt;b&gt;search&lt;/b&gt; call URI for the previous result set. For example, the following URI returns products 21 thru 30 from the collection of products: &lt;br /&gt;&lt;br /&gt; &lt;code&gt;&lt;i&gt;path&lt;/i&gt;/product_summary/search?limit=10&amp;offset=20&lt;/code&gt; &lt;br /&gt;&lt;br /&gt;  &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This feature employs a zero-based list, where the first product in the list has an offset of &lt;code&gt;0&lt;/code&gt;.&lt;/span&gt; --&gt;
     * @param value Value to set for the prev property.
     */
    public void setPrev(@jakarta.annotation.Nullable final String value) {
        this.prev = value;
    }
    /**
     * Sets the productSummaries property value. &lt;i&gt;Returned if&lt;/i&gt; the &lt;strong&gt;fieldGroups&lt;/strong&gt; query parameter was omitted from the request, or if it was included with a value of &lt;code&gt;MATCHING_PRODUCTS&lt;/code&gt; or &lt;code&gt;FULL&lt;/code&gt;. This container provides an array of product summaries in the current result set for products that match the combination of the &lt;strong&gt;q&lt;/strong&gt;, &lt;strong&gt;category_ids&lt;/strong&gt;, and &lt;strong&gt;aspect_filter&lt;/strong&gt; parameters that were provided in the request. Each product summary includes information about the product&apos;s identifiers, product images, aspects, the product page URL, and the &lt;strong&gt;getProduct&lt;/strong&gt; URL for retrieving the product details.
     * @param value Value to set for the productSummaries property.
     */
    public void setProductSummaries(@jakarta.annotation.Nullable final java.util.List<ProductSummary> value) {
        this.productSummaries = value;
    }
    /**
     * Sets the refinement property value. &lt;i&gt;Returned only if&lt;/i&gt; the &lt;strong&gt;fieldGroups&lt;/strong&gt; query parameter was included in the request with a value of &lt;code&gt;ASPECT_REFINEMENTS&lt;/code&gt; or &lt;code&gt;FULL&lt;/code&gt;. &lt;br /&gt;&lt;br /&gt; An aspect is a property of a category, used by sellers to provide details about the items they&apos;re listing. For example, the &lt;i&gt;Cell Phones &amp;amp; Smartphones&lt;/i&gt; category (#9355) includes a &lt;i&gt;Storage Capacity&lt;/i&gt; aspect. &lt;br /&gt;&lt;br /&gt; This container provides information about the distribution of values of a set of category aspects. The category aspects are those associated with the category that eBay determines is most likely to cover the products that match the search criteria.
     * @param value Value to set for the refinement property.
     */
    public void setRefinement(@jakarta.annotation.Nullable final Refinement value) {
        this.refinement = value;
    }
    /**
     * Sets the total property value. This field is reserved for internal or future use. &lt;!-- The total number of product records in the returned collection of matched products. --&gt;
     * @param value Value to set for the total property.
     */
    public void setTotal(@jakarta.annotation.Nullable final Integer value) {
        this.total = value;
    }
}

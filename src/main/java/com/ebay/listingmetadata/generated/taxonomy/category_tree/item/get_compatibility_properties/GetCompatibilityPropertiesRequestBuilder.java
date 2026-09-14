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

package com.ebay.listingmetadata.generated.taxonomy.category_tree.item.get_compatibility_properties;

import com.ebay.listingmetadata.generated.taxonomy.models.Error;
import com.ebay.listingmetadata.generated.taxonomy.models.GetCompatibilityMetadataResponse;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /category_tree/{category_tree_id}/get_compatibility_properties
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetCompatibilityPropertiesRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link GetCompatibilityPropertiesRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetCompatibilityPropertiesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/category_tree/{category_tree_id}/get_compatibility_properties?category_id={category_id}", pathParameters);
    }
    /**
     * Instantiates a new {@link GetCompatibilityPropertiesRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetCompatibilityPropertiesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/category_tree/{category_tree_id}/get_compatibility_properties?category_id={category_id}", rawUrl);
    }
    /**
     * This method retrieves the compatible vehicle aspects that are used to define a motor vehicle that is compatible with a motor vehicle part or accessory. The values that are retrieved here might include motor vehicle aspects such as &apos;Make&apos;, &apos;Model&apos;, &apos;Year&apos;, &apos;Engine&apos;, and &apos;Trim&apos;, and each of these aspects are localized for the eBay marketplace.&lt;br&gt;&lt;br&gt; The &lt;strong&gt;category_tree_id&lt;/strong&gt; value is passed in as a path parameter, and this value identifies the eBay category tree. The &lt;strong&gt;category_id&lt;/strong&gt; value is passed in as a query parameter, as this parameter is also required. The specified category must be a category that supports parts compatibility.&lt;br&gt;&lt;br&gt; At this time, this operation only supports parts and accessories listings for cars, trucks, and motorcycles (not boats, power sports, or any other vehicle types). Only the following eBay marketplaces support parts compatibility:&lt;ul&gt;&lt;li&gt;eBay US (Motors and non-Motors categories)&lt;/li&gt;&lt;li&gt;eBay Canada (Motors and non-Motors categories)&lt;/li&gt;&lt;li&gt;eBay UK&lt;/li&gt;&lt;li&gt;eBay Germany&lt;/li&gt;&lt;li&gt;eBay Australia&lt;/li&gt;&lt;li&gt;eBay France&lt;/li&gt;&lt;li&gt;eBay Italy&lt;/li&gt;&lt;li&gt;eBay Spain&lt;/li&gt;&lt;/ul&gt;
     * @return a {@link GetCompatibilityMetadataResponse}
     * @throws java.util.List<Error> When receiving a 400 status code
     * @throws java.util.List<Error> When receiving a 404 status code
     * @throws java.util.List<Error> When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public GetCompatibilityMetadataResponse get() {
        return get(null);
    }
    /**
     * This method retrieves the compatible vehicle aspects that are used to define a motor vehicle that is compatible with a motor vehicle part or accessory. The values that are retrieved here might include motor vehicle aspects such as &apos;Make&apos;, &apos;Model&apos;, &apos;Year&apos;, &apos;Engine&apos;, and &apos;Trim&apos;, and each of these aspects are localized for the eBay marketplace.&lt;br&gt;&lt;br&gt; The &lt;strong&gt;category_tree_id&lt;/strong&gt; value is passed in as a path parameter, and this value identifies the eBay category tree. The &lt;strong&gt;category_id&lt;/strong&gt; value is passed in as a query parameter, as this parameter is also required. The specified category must be a category that supports parts compatibility.&lt;br&gt;&lt;br&gt; At this time, this operation only supports parts and accessories listings for cars, trucks, and motorcycles (not boats, power sports, or any other vehicle types). Only the following eBay marketplaces support parts compatibility:&lt;ul&gt;&lt;li&gt;eBay US (Motors and non-Motors categories)&lt;/li&gt;&lt;li&gt;eBay Canada (Motors and non-Motors categories)&lt;/li&gt;&lt;li&gt;eBay UK&lt;/li&gt;&lt;li&gt;eBay Germany&lt;/li&gt;&lt;li&gt;eBay Australia&lt;/li&gt;&lt;li&gt;eBay France&lt;/li&gt;&lt;li&gt;eBay Italy&lt;/li&gt;&lt;li&gt;eBay Spain&lt;/li&gt;&lt;/ul&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link GetCompatibilityMetadataResponse}
     * @throws java.util.List<Error> When receiving a 400 status code
     * @throws java.util.List<Error> When receiving a 404 status code
     * @throws java.util.List<Error> When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public GetCompatibilityMetadataResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("404", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, GetCompatibilityMetadataResponse::createFromDiscriminatorValue);
    }
    /**
     * This method retrieves the compatible vehicle aspects that are used to define a motor vehicle that is compatible with a motor vehicle part or accessory. The values that are retrieved here might include motor vehicle aspects such as &apos;Make&apos;, &apos;Model&apos;, &apos;Year&apos;, &apos;Engine&apos;, and &apos;Trim&apos;, and each of these aspects are localized for the eBay marketplace.&lt;br&gt;&lt;br&gt; The &lt;strong&gt;category_tree_id&lt;/strong&gt; value is passed in as a path parameter, and this value identifies the eBay category tree. The &lt;strong&gt;category_id&lt;/strong&gt; value is passed in as a query parameter, as this parameter is also required. The specified category must be a category that supports parts compatibility.&lt;br&gt;&lt;br&gt; At this time, this operation only supports parts and accessories listings for cars, trucks, and motorcycles (not boats, power sports, or any other vehicle types). Only the following eBay marketplaces support parts compatibility:&lt;ul&gt;&lt;li&gt;eBay US (Motors and non-Motors categories)&lt;/li&gt;&lt;li&gt;eBay Canada (Motors and non-Motors categories)&lt;/li&gt;&lt;li&gt;eBay UK&lt;/li&gt;&lt;li&gt;eBay Germany&lt;/li&gt;&lt;li&gt;eBay Australia&lt;/li&gt;&lt;li&gt;eBay France&lt;/li&gt;&lt;li&gt;eBay Italy&lt;/li&gt;&lt;li&gt;eBay Spain&lt;/li&gt;&lt;/ul&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method retrieves the compatible vehicle aspects that are used to define a motor vehicle that is compatible with a motor vehicle part or accessory. The values that are retrieved here might include motor vehicle aspects such as &apos;Make&apos;, &apos;Model&apos;, &apos;Year&apos;, &apos;Engine&apos;, and &apos;Trim&apos;, and each of these aspects are localized for the eBay marketplace.&lt;br&gt;&lt;br&gt; The &lt;strong&gt;category_tree_id&lt;/strong&gt; value is passed in as a path parameter, and this value identifies the eBay category tree. The &lt;strong&gt;category_id&lt;/strong&gt; value is passed in as a query parameter, as this parameter is also required. The specified category must be a category that supports parts compatibility.&lt;br&gt;&lt;br&gt; At this time, this operation only supports parts and accessories listings for cars, trucks, and motorcycles (not boats, power sports, or any other vehicle types). Only the following eBay marketplaces support parts compatibility:&lt;ul&gt;&lt;li&gt;eBay US (Motors and non-Motors categories)&lt;/li&gt;&lt;li&gt;eBay Canada (Motors and non-Motors categories)&lt;/li&gt;&lt;li&gt;eBay UK&lt;/li&gt;&lt;li&gt;eBay Germany&lt;/li&gt;&lt;li&gt;eBay Australia&lt;/li&gt;&lt;li&gt;eBay France&lt;/li&gt;&lt;li&gt;eBay Italy&lt;/li&gt;&lt;li&gt;eBay Spain&lt;/li&gt;&lt;/ul&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link GetCompatibilityPropertiesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetCompatibilityPropertiesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GetCompatibilityPropertiesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * This method retrieves the compatible vehicle aspects that are used to define a motor vehicle that is compatible with a motor vehicle part or accessory. The values that are retrieved here might include motor vehicle aspects such as &apos;Make&apos;, &apos;Model&apos;, &apos;Year&apos;, &apos;Engine&apos;, and &apos;Trim&apos;, and each of these aspects are localized for the eBay marketplace.&lt;br&gt;&lt;br&gt; The &lt;strong&gt;category_tree_id&lt;/strong&gt; value is passed in as a path parameter, and this value identifies the eBay category tree. The &lt;strong&gt;category_id&lt;/strong&gt; value is passed in as a query parameter, as this parameter is also required. The specified category must be a category that supports parts compatibility.&lt;br&gt;&lt;br&gt; At this time, this operation only supports parts and accessories listings for cars, trucks, and motorcycles (not boats, power sports, or any other vehicle types). Only the following eBay marketplaces support parts compatibility:&lt;ul&gt;&lt;li&gt;eBay US (Motors and non-Motors categories)&lt;/li&gt;&lt;li&gt;eBay Canada (Motors and non-Motors categories)&lt;/li&gt;&lt;li&gt;eBay UK&lt;/li&gt;&lt;li&gt;eBay Germany&lt;/li&gt;&lt;li&gt;eBay Australia&lt;/li&gt;&lt;li&gt;eBay France&lt;/li&gt;&lt;li&gt;eBay Italy&lt;/li&gt;&lt;li&gt;eBay Spain&lt;/li&gt;&lt;/ul&gt;
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * The unique identifier of an eBay category. This eBay category must be a valid eBay category on the specified eBay marketplace, and the category must support parts compatibility for cars, trucks, or motorcycles.&lt;br&gt;&lt;br&gt; The &lt;a href=&quot;/api-docs/sell/metadata/resources/marketplace/methods/getAutomotivePartsCompatibilityPolicies&quot; target=&quot;_blank&quot;&gt;getAutomotivePartsCompatibilityPolicies&lt;/a&gt; method of the Selling Metadata API can be used to retrieve all eBay categories for an eBay marketplace that support parts compatibility for vehicles.
         */
        @jakarta.annotation.Nullable
        public String categoryId;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("category_id", categoryId);
            return allQueryParams;
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
}

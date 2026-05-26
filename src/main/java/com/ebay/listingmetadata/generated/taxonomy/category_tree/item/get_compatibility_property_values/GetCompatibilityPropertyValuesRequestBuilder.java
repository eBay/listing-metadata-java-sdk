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

package com.ebay.listingmetadata.generated.taxonomy.category_tree.item.get_compatibility_property_values;

import com.ebay.listingmetadata.generated.taxonomy.models.GetCompatibilityPropertyValuesResponse;
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
 * Builds and executes requests for operations under /category_tree/{category_tree_id}/get_compatibility_property_values
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetCompatibilityPropertyValuesRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link GetCompatibilityPropertyValuesRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetCompatibilityPropertyValuesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/category_tree/{category_tree_id}/get_compatibility_property_values?category_id={category_id}&compatibility_property={compatibility_property}{&filter*}", pathParameters);
    }
    /**
     * Instantiates a new {@link GetCompatibilityPropertyValuesRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetCompatibilityPropertyValuesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/category_tree/{category_tree_id}/get_compatibility_property_values?category_id={category_id}&compatibility_property={compatibility_property}{&filter*}", rawUrl);
    }
    /**
     * This call retrieves applicable compatible vehicle property values based on the specified eBay marketplace, specified eBay category, and filters used in the request. Compatible vehicle properties are returned in the &lt;strong&gt;compatibilityProperties.name&lt;/strong&gt; field of a &lt;strong&gt;getCompatibilityProperties&lt;/strong&gt; response. &lt;br&gt;&lt;br&gt; One compatible vehicle property applicable to the specified eBay marketplace and eBay category is specified through the required &lt;strong&gt;compatibility_property&lt;/strong&gt; filter. Then, the user has the option of further restricting the compatible vehicle property values that are returned in the response by specifying one or more compatible vehicle property name/value pairs through the &lt;strong&gt;filter&lt;/strong&gt; query parameter.&lt;br&gt;&lt;br&gt;See the documentation in &lt;strong&gt;URI parameters&lt;/strong&gt; section for more information on using the &lt;strong&gt;compatibility_property&lt;/strong&gt; and &lt;strong&gt;filter&lt;/strong&gt; query parameters together to customize the data that is retrieved.
     * @return a {@link GetCompatibilityPropertyValuesResponse}
     */
    @jakarta.annotation.Nullable
    public GetCompatibilityPropertyValuesResponse get() {
        return get(null);
    }
    /**
     * This call retrieves applicable compatible vehicle property values based on the specified eBay marketplace, specified eBay category, and filters used in the request. Compatible vehicle properties are returned in the &lt;strong&gt;compatibilityProperties.name&lt;/strong&gt; field of a &lt;strong&gt;getCompatibilityProperties&lt;/strong&gt; response. &lt;br&gt;&lt;br&gt; One compatible vehicle property applicable to the specified eBay marketplace and eBay category is specified through the required &lt;strong&gt;compatibility_property&lt;/strong&gt; filter. Then, the user has the option of further restricting the compatible vehicle property values that are returned in the response by specifying one or more compatible vehicle property name/value pairs through the &lt;strong&gt;filter&lt;/strong&gt; query parameter.&lt;br&gt;&lt;br&gt;See the documentation in &lt;strong&gt;URI parameters&lt;/strong&gt; section for more information on using the &lt;strong&gt;compatibility_property&lt;/strong&gt; and &lt;strong&gt;filter&lt;/strong&gt; query parameters together to customize the data that is retrieved.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link GetCompatibilityPropertyValuesResponse}
     */
    @jakarta.annotation.Nullable
    public GetCompatibilityPropertyValuesResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, GetCompatibilityPropertyValuesResponse::createFromDiscriminatorValue);
    }
    /**
     * This call retrieves applicable compatible vehicle property values based on the specified eBay marketplace, specified eBay category, and filters used in the request. Compatible vehicle properties are returned in the &lt;strong&gt;compatibilityProperties.name&lt;/strong&gt; field of a &lt;strong&gt;getCompatibilityProperties&lt;/strong&gt; response. &lt;br&gt;&lt;br&gt; One compatible vehicle property applicable to the specified eBay marketplace and eBay category is specified through the required &lt;strong&gt;compatibility_property&lt;/strong&gt; filter. Then, the user has the option of further restricting the compatible vehicle property values that are returned in the response by specifying one or more compatible vehicle property name/value pairs through the &lt;strong&gt;filter&lt;/strong&gt; query parameter.&lt;br&gt;&lt;br&gt;See the documentation in &lt;strong&gt;URI parameters&lt;/strong&gt; section for more information on using the &lt;strong&gt;compatibility_property&lt;/strong&gt; and &lt;strong&gt;filter&lt;/strong&gt; query parameters together to customize the data that is retrieved.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This call retrieves applicable compatible vehicle property values based on the specified eBay marketplace, specified eBay category, and filters used in the request. Compatible vehicle properties are returned in the &lt;strong&gt;compatibilityProperties.name&lt;/strong&gt; field of a &lt;strong&gt;getCompatibilityProperties&lt;/strong&gt; response. &lt;br&gt;&lt;br&gt; One compatible vehicle property applicable to the specified eBay marketplace and eBay category is specified through the required &lt;strong&gt;compatibility_property&lt;/strong&gt; filter. Then, the user has the option of further restricting the compatible vehicle property values that are returned in the response by specifying one or more compatible vehicle property name/value pairs through the &lt;strong&gt;filter&lt;/strong&gt; query parameter.&lt;br&gt;&lt;br&gt;See the documentation in &lt;strong&gt;URI parameters&lt;/strong&gt; section for more information on using the &lt;strong&gt;compatibility_property&lt;/strong&gt; and &lt;strong&gt;filter&lt;/strong&gt; query parameters together to customize the data that is retrieved.
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
     * @return a {@link GetCompatibilityPropertyValuesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetCompatibilityPropertyValuesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GetCompatibilityPropertyValuesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * This call retrieves applicable compatible vehicle property values based on the specified eBay marketplace, specified eBay category, and filters used in the request. Compatible vehicle properties are returned in the &lt;strong&gt;compatibilityProperties.name&lt;/strong&gt; field of a &lt;strong&gt;getCompatibilityProperties&lt;/strong&gt; response. &lt;br&gt;&lt;br&gt; One compatible vehicle property applicable to the specified eBay marketplace and eBay category is specified through the required &lt;strong&gt;compatibility_property&lt;/strong&gt; filter. Then, the user has the option of further restricting the compatible vehicle property values that are returned in the response by specifying one or more compatible vehicle property name/value pairs through the &lt;strong&gt;filter&lt;/strong&gt; query parameter.&lt;br&gt;&lt;br&gt;See the documentation in &lt;strong&gt;URI parameters&lt;/strong&gt; section for more information on using the &lt;strong&gt;compatibility_property&lt;/strong&gt; and &lt;strong&gt;filter&lt;/strong&gt; query parameters together to customize the data that is retrieved.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * The unique identifier of an eBay category. This eBay category must be a valid eBay category on the specified eBay marketplace, and the category must support parts compatibility for cars, trucks, or motorcycles.&lt;br&gt;&lt;br&gt; The &lt;strong&gt;getAutomotivePartsCompatibilityPolicies&lt;/strong&gt; method of the Selling Metadata API can be used to retrieve all eBay categories for an eBay marketplace that support parts compatibility for vehicles.
         */
        @jakarta.annotation.Nullable
        public String categoryId;
        /**
         * One compatible vehicle property applicable to the specified eBay marketplace and eBay category is specified in this required filter. Compatible vehicle properties are returned in the &lt;strong&gt;compatibilityProperties.name&lt;/strong&gt; field of a &lt;strong&gt;getCompatibilityProperties&lt;/strong&gt; response. &lt;br&gt;&lt;br&gt; For example, if you wanted to retrieve all vehicle trims for a 2018 Toyota Camry, you would set this filter as follows: &lt;code&gt;compatibility_property=Trim&lt;/code&gt; and then include the following three name/value filters through one &lt;strong&gt;filter&lt;/strong&gt; parameter: &lt;code&gt;filter=Year:2018,Make:Toyota,Model:Camry&lt;/code&gt;.&lt;br&gt;&lt;br&gt;So, putting this all together, the URI would look something like this:&lt;br&gt;&lt;br&gt;&lt;pre&gt;&lt;code&gt;GET https://api.ebay.com/commerce/&lt;br&gt;taxonomy/v1/category_tree/100/&lt;br&gt;get_compatibility_property_values?&lt;br&gt;&lt;strong&gt;category_id&lt;/strong&gt;=6016&amp;&lt;strong&gt;compatibility_property&lt;/strong&gt;=Trim&lt;br&gt;&amp;&lt;strong&gt;filter&lt;/strong&gt;=Year:2018,Make:Toyota,Model:Camry&lt;/code&gt;&lt;/pre&gt;
         */
        @jakarta.annotation.Nullable
        public String compatibilityProperty;
        /**
         * One or more compatible vehicle property name/value pairs are passed in through this query parameter. The compatible vehicle property name and corresponding value are delimited with a colon (:), such as &lt;code&gt;filter=Year:2018&lt;/code&gt;, and multiple compatible vehicle property name/value pairs are delimited with a comma (,).&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Commas are used as delimiters between filter values. If a value includes a comma (e.g., &lt;code&gt;BodyStyle:AWD B9 8W5&lt;b&gt;,&lt;/b&gt;C8WD&lt;/code&gt;) you &lt;b&gt;must&lt;/b&gt; include a backslash (&lt;b&gt;/&lt;/b&gt;) immediately before the comma to prevent it from being evaluated as a delimiter.&lt;br&gt;&lt;br&gt;As with all query parameter values, the filter parameters must be URL encoded. For more information about encoding request parameters, refer to &lt;a href=&quot;/api-docs/static/rest-request-components.html#parameters&quot; target=&quot;_blank&quot;&gt;URL encoding query parameter values&lt;/a&gt;.&lt;/span&gt;&lt;br&gt;For example, to retrieve all vehicle trims for a 2022 Audi A4:&lt;ul&gt;&lt;li&gt;Set the &lt;strong&gt;compatibility_property&lt;/strong&gt; filter to &lt;code&gt;compatibility_property=Trim&lt;/code&gt;&lt;/li&gt;&lt;li&gt;Include the following name/value filters using one &lt;strong&gt;filter&lt;/strong&gt; parameter:&lt;ul&gt;&lt;li&gt;&lt;code&gt;Year:2022&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;Make:Audi&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;Model:A4&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;BodyStyle:AWD B9 8W5/,8WD&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;&lt;/li&gt;&lt;/ul&gt;The resulting comma-separated filter query parameter is:&lt;pre&gt;&lt;code&gt;filter=Year:2022,Make:Audi,Model:A4,BodyStyle:AWD B9 8W5/,8WD&lt;/code&gt;&lt;/pre&gt;&lt;br&gt;The following sample shows the same filter but with URL encoding for the blank spaces.&lt;br&gt;&lt;pre&gt;&lt;code&gt;GET https://api.ebay.com/commerce/&lt;br&gt;taxonomy/v1/category_tree/100/&lt;br&gt;get_compatibility_property_values?&lt;b&gt;category_id&lt;/b&gt;=6016&amp;&lt;b&gt;compatibility_property&lt;/b&gt;=Trim&amp;&lt;b&gt;filter&lt;/b&gt;=Year:2022,Make:Audi,Model:A4,BodyStyle:AWD%20B9%208W5%5C%2C8WD&lt;/code&gt;&lt;/pre&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; While not required, it is strongly recommended that users limit the size of the result set by using the &lt;b&gt;filter&lt;/b&gt; query parameter. Failure to do so may result in a timeout error if too much data is attempted to be returned.&lt;/span&gt; For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/commerce/taxonomy/types/txn:ConstraintFilter
         */
        @jakarta.annotation.Nullable
        public String filter;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("category_id", categoryId);
            allQueryParams.put("compatibility_property", compatibilityProperty);
            allQueryParams.put("filter", filter);
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

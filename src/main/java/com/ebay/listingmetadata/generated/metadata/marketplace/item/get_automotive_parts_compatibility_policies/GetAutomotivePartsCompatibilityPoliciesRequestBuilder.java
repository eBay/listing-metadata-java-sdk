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

package com.ebay.listingmetadata.generated.metadata.marketplace.item.get_automotive_parts_compatibility_policies;

import com.ebay.listingmetadata.generated.metadata.models.AutomotivePartsCompatibilityPolicyResponse;
import com.ebay.listingmetadata.generated.metadata.models.Error;
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
 * Builds and executes requests for operations under /marketplace/{marketplace_id}/get_automotive_parts_compatibility_policies
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetAutomotivePartsCompatibilityPoliciesRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link GetAutomotivePartsCompatibilityPoliciesRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetAutomotivePartsCompatibilityPoliciesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/marketplace/{marketplace_id}/get_automotive_parts_compatibility_policies{?filter*}", pathParameters);
    }
    /**
     * Instantiates a new {@link GetAutomotivePartsCompatibilityPoliciesRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetAutomotivePartsCompatibilityPoliciesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/marketplace/{marketplace_id}/get_automotive_parts_compatibility_policies{?filter*}", rawUrl);
    }
    /**
     * This method returns the eBay policies that define how to list automotive parts compatibility items in the categories of the specified marketplace.  &lt;br&gt;&lt;br&gt;By default, this method returns all categories that support parts compatibility. You can limit the size of the result set by using the &lt;b&gt;filter&lt;/b&gt; query parameter to specify only the category IDs you want to review.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note: &lt;/b&gt;To return policy information for the eBay US marketplace, specify &lt;code&gt;EBAY_MOTORS_US&lt;/code&gt; as the path parameter for &lt;b&gt;marketplace_id&lt;/b&gt;.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#478415&quot;&gt;&lt;strong&gt;Tip:&lt;/strong&gt;&lt;/span&gt; This method can potentially return a very large response payload. eBay recommends that the response payload be compressed by passing in the &lt;b&gt;Accept-Encoding&lt;/b&gt; request header and setting the value to &lt;code&gt;gzip&lt;/code&gt;.&lt;/span&gt;&lt;br&gt;If you specify a valid marketplace ID but that marketplace does not contain policy information, or if you filter out all results, a &lt;b&gt;204 No content&lt;/b&gt; status code is returned with an empty response body.
     * @return a {@link AutomotivePartsCompatibilityPolicyResponse}
     * @throws java.util.List<Error> When receiving a 400 status code
     * @throws java.util.List<Error> When receiving a 404 status code
     * @throws java.util.List<Error> When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public AutomotivePartsCompatibilityPolicyResponse get() {
        return get(null);
    }
    /**
     * This method returns the eBay policies that define how to list automotive parts compatibility items in the categories of the specified marketplace.  &lt;br&gt;&lt;br&gt;By default, this method returns all categories that support parts compatibility. You can limit the size of the result set by using the &lt;b&gt;filter&lt;/b&gt; query parameter to specify only the category IDs you want to review.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note: &lt;/b&gt;To return policy information for the eBay US marketplace, specify &lt;code&gt;EBAY_MOTORS_US&lt;/code&gt; as the path parameter for &lt;b&gt;marketplace_id&lt;/b&gt;.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#478415&quot;&gt;&lt;strong&gt;Tip:&lt;/strong&gt;&lt;/span&gt; This method can potentially return a very large response payload. eBay recommends that the response payload be compressed by passing in the &lt;b&gt;Accept-Encoding&lt;/b&gt; request header and setting the value to &lt;code&gt;gzip&lt;/code&gt;.&lt;/span&gt;&lt;br&gt;If you specify a valid marketplace ID but that marketplace does not contain policy information, or if you filter out all results, a &lt;b&gt;204 No content&lt;/b&gt; status code is returned with an empty response body.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link AutomotivePartsCompatibilityPolicyResponse}
     * @throws java.util.List<Error> When receiving a 400 status code
     * @throws java.util.List<Error> When receiving a 404 status code
     * @throws java.util.List<Error> When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public AutomotivePartsCompatibilityPolicyResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("404", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, AutomotivePartsCompatibilityPolicyResponse::createFromDiscriminatorValue);
    }
    /**
     * This method returns the eBay policies that define how to list automotive parts compatibility items in the categories of the specified marketplace.  &lt;br&gt;&lt;br&gt;By default, this method returns all categories that support parts compatibility. You can limit the size of the result set by using the &lt;b&gt;filter&lt;/b&gt; query parameter to specify only the category IDs you want to review.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note: &lt;/b&gt;To return policy information for the eBay US marketplace, specify &lt;code&gt;EBAY_MOTORS_US&lt;/code&gt; as the path parameter for &lt;b&gt;marketplace_id&lt;/b&gt;.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#478415&quot;&gt;&lt;strong&gt;Tip:&lt;/strong&gt;&lt;/span&gt; This method can potentially return a very large response payload. eBay recommends that the response payload be compressed by passing in the &lt;b&gt;Accept-Encoding&lt;/b&gt; request header and setting the value to &lt;code&gt;gzip&lt;/code&gt;.&lt;/span&gt;&lt;br&gt;If you specify a valid marketplace ID but that marketplace does not contain policy information, or if you filter out all results, a &lt;b&gt;204 No content&lt;/b&gt; status code is returned with an empty response body.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method returns the eBay policies that define how to list automotive parts compatibility items in the categories of the specified marketplace.  &lt;br&gt;&lt;br&gt;By default, this method returns all categories that support parts compatibility. You can limit the size of the result set by using the &lt;b&gt;filter&lt;/b&gt; query parameter to specify only the category IDs you want to review.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note: &lt;/b&gt;To return policy information for the eBay US marketplace, specify &lt;code&gt;EBAY_MOTORS_US&lt;/code&gt; as the path parameter for &lt;b&gt;marketplace_id&lt;/b&gt;.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#478415&quot;&gt;&lt;strong&gt;Tip:&lt;/strong&gt;&lt;/span&gt; This method can potentially return a very large response payload. eBay recommends that the response payload be compressed by passing in the &lt;b&gt;Accept-Encoding&lt;/b&gt; request header and setting the value to &lt;code&gt;gzip&lt;/code&gt;.&lt;/span&gt;&lt;br&gt;If you specify a valid marketplace ID but that marketplace does not contain policy information, or if you filter out all results, a &lt;b&gt;204 No content&lt;/b&gt; status code is returned with an empty response body.
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
     * @return a {@link GetAutomotivePartsCompatibilityPoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetAutomotivePartsCompatibilityPoliciesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GetAutomotivePartsCompatibilityPoliciesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * This method returns the eBay policies that define how to list automotive parts compatibility items in the categories of the specified marketplace.  &lt;br&gt;&lt;br&gt;By default, this method returns all categories that support parts compatibility. You can limit the size of the result set by using the &lt;b&gt;filter&lt;/b&gt; query parameter to specify only the category IDs you want to review.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note: &lt;/b&gt;To return policy information for the eBay US marketplace, specify &lt;code&gt;EBAY_MOTORS_US&lt;/code&gt; as the path parameter for &lt;b&gt;marketplace_id&lt;/b&gt;.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#478415&quot;&gt;&lt;strong&gt;Tip:&lt;/strong&gt;&lt;/span&gt; This method can potentially return a very large response payload. eBay recommends that the response payload be compressed by passing in the &lt;b&gt;Accept-Encoding&lt;/b&gt; request header and setting the value to &lt;code&gt;gzip&lt;/code&gt;.&lt;/span&gt;&lt;br&gt;If you specify a valid marketplace ID but that marketplace does not contain policy information, or if you filter out all results, a &lt;b&gt;204 No content&lt;/b&gt; status code is returned with an empty response body.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * This query parameter limits the response by returning policy information for only the selected sections of the category tree. Supply &lt;b&gt;categoryId&lt;/b&gt; values for the sections of the tree you want returned. Use the &lt;a href=&quot;/api-docs/commerce/taxonomy/overview.html&quot; target=&quot;_blank &quot;&gt;Taxonomy API&lt;/a&gt; to retrieve category ID values.&lt;br&gt;&lt;br&gt;The parameter takes a list of &lt;b&gt;categoryId&lt;/b&gt; values and you can specify up to 50 separate category IDs. Separate multiple values with a pipe character (&apos;|&apos;). If you specify more than 50 &lt;code&gt;categoryId&lt;/code&gt; values, eBay returns the policies for the first 50 IDs and a warning that not all categories were returned.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;filter=categoryIds:{183521|183523|183524}&lt;/code&gt;  &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note: &lt;/b&gt;URL-encoding of the parameter list is no longer required.&lt;/span&gt;
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

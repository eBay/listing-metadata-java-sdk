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

package com.ebay.listingmetadata.generated.metadata.marketplace.item.get_extended_producer_responsibility_policies;

import com.ebay.listingmetadata.generated.metadata.models.ExtendedProducerResponsibilityPolicyResponse;
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
 * Builds and executes requests for operations under /marketplace/{marketplace_id}/get_extended_producer_responsibility_policies
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetExtendedProducerResponsibilityPoliciesRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link GetExtendedProducerResponsibilityPoliciesRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetExtendedProducerResponsibilityPoliciesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/marketplace/{marketplace_id}/get_extended_producer_responsibility_policies{?filter*}", pathParameters);
    }
    /**
     * Instantiates a new {@link GetExtendedProducerResponsibilityPoliciesRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetExtendedProducerResponsibilityPoliciesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/marketplace/{marketplace_id}/get_extended_producer_responsibility_policies{?filter*}", rawUrl);
    }
    /**
     * This method returns the Extended Producer Responsibility policies for one, multiple, or all eBay categories in an eBay marketplace.&lt;br&gt;&lt;br&gt;The identifier of the eBay marketplace is passed in as a path parameter, and unless one or more eBay category IDs are passed in through the filter query parameter, this method will return metadata on every applicable category for the specified marketplace.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; Currently, the Extended Producer Responsibility policies are only applicable to a limited number of categories.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;&lt;/span&gt;Extended Producer Responsibility IDs are no longer set at the listing level so category-level metadata is no longer returned. Instead, sellers will provide/manage these IDs at the account level by going to &lt;a href=&quot;https://accountsettings.ebay.fr/epr-fr &quot; target=&quot;_blank&quot;&gt;Account Settings&lt;/a&gt;.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#478415&quot;&gt;&lt;strong&gt;Tip:&lt;/strong&gt;&lt;/span&gt; This method can potentially return a very large response payload. eBay recommends that the response payload be compressed by passing in the &lt;b&gt;Accept-Encoding&lt;/b&gt; request header and setting the value to &lt;code&gt;gzip&lt;/code&gt;.&lt;/span&gt;
     * @return a {@link ExtendedProducerResponsibilityPolicyResponse}
     */
    @jakarta.annotation.Nullable
    public ExtendedProducerResponsibilityPolicyResponse get() {
        return get(null);
    }
    /**
     * This method returns the Extended Producer Responsibility policies for one, multiple, or all eBay categories in an eBay marketplace.&lt;br&gt;&lt;br&gt;The identifier of the eBay marketplace is passed in as a path parameter, and unless one or more eBay category IDs are passed in through the filter query parameter, this method will return metadata on every applicable category for the specified marketplace.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; Currently, the Extended Producer Responsibility policies are only applicable to a limited number of categories.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;&lt;/span&gt;Extended Producer Responsibility IDs are no longer set at the listing level so category-level metadata is no longer returned. Instead, sellers will provide/manage these IDs at the account level by going to &lt;a href=&quot;https://accountsettings.ebay.fr/epr-fr &quot; target=&quot;_blank&quot;&gt;Account Settings&lt;/a&gt;.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#478415&quot;&gt;&lt;strong&gt;Tip:&lt;/strong&gt;&lt;/span&gt; This method can potentially return a very large response payload. eBay recommends that the response payload be compressed by passing in the &lt;b&gt;Accept-Encoding&lt;/b&gt; request header and setting the value to &lt;code&gt;gzip&lt;/code&gt;.&lt;/span&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ExtendedProducerResponsibilityPolicyResponse}
     */
    @jakarta.annotation.Nullable
    public ExtendedProducerResponsibilityPolicyResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ExtendedProducerResponsibilityPolicyResponse::createFromDiscriminatorValue);
    }
    /**
     * This method returns the Extended Producer Responsibility policies for one, multiple, or all eBay categories in an eBay marketplace.&lt;br&gt;&lt;br&gt;The identifier of the eBay marketplace is passed in as a path parameter, and unless one or more eBay category IDs are passed in through the filter query parameter, this method will return metadata on every applicable category for the specified marketplace.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; Currently, the Extended Producer Responsibility policies are only applicable to a limited number of categories.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;&lt;/span&gt;Extended Producer Responsibility IDs are no longer set at the listing level so category-level metadata is no longer returned. Instead, sellers will provide/manage these IDs at the account level by going to &lt;a href=&quot;https://accountsettings.ebay.fr/epr-fr &quot; target=&quot;_blank&quot;&gt;Account Settings&lt;/a&gt;.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#478415&quot;&gt;&lt;strong&gt;Tip:&lt;/strong&gt;&lt;/span&gt; This method can potentially return a very large response payload. eBay recommends that the response payload be compressed by passing in the &lt;b&gt;Accept-Encoding&lt;/b&gt; request header and setting the value to &lt;code&gt;gzip&lt;/code&gt;.&lt;/span&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method returns the Extended Producer Responsibility policies for one, multiple, or all eBay categories in an eBay marketplace.&lt;br&gt;&lt;br&gt;The identifier of the eBay marketplace is passed in as a path parameter, and unless one or more eBay category IDs are passed in through the filter query parameter, this method will return metadata on every applicable category for the specified marketplace.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; Currently, the Extended Producer Responsibility policies are only applicable to a limited number of categories.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;&lt;/span&gt;Extended Producer Responsibility IDs are no longer set at the listing level so category-level metadata is no longer returned. Instead, sellers will provide/manage these IDs at the account level by going to &lt;a href=&quot;https://accountsettings.ebay.fr/epr-fr &quot; target=&quot;_blank&quot;&gt;Account Settings&lt;/a&gt;.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#478415&quot;&gt;&lt;strong&gt;Tip:&lt;/strong&gt;&lt;/span&gt; This method can potentially return a very large response payload. eBay recommends that the response payload be compressed by passing in the &lt;b&gt;Accept-Encoding&lt;/b&gt; request header and setting the value to &lt;code&gt;gzip&lt;/code&gt;.&lt;/span&gt;
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
     * @return a {@link GetExtendedProducerResponsibilityPoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetExtendedProducerResponsibilityPoliciesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GetExtendedProducerResponsibilityPoliciesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * This method returns the Extended Producer Responsibility policies for one, multiple, or all eBay categories in an eBay marketplace.&lt;br&gt;&lt;br&gt;The identifier of the eBay marketplace is passed in as a path parameter, and unless one or more eBay category IDs are passed in through the filter query parameter, this method will return metadata on every applicable category for the specified marketplace.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; Currently, the Extended Producer Responsibility policies are only applicable to a limited number of categories.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;&lt;/span&gt;Extended Producer Responsibility IDs are no longer set at the listing level so category-level metadata is no longer returned. Instead, sellers will provide/manage these IDs at the account level by going to &lt;a href=&quot;https://accountsettings.ebay.fr/epr-fr &quot; target=&quot;_blank&quot;&gt;Account Settings&lt;/a&gt;.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#478415&quot;&gt;&lt;strong&gt;Tip:&lt;/strong&gt;&lt;/span&gt; This method can potentially return a very large response payload. eBay recommends that the response payload be compressed by passing in the &lt;b&gt;Accept-Encoding&lt;/b&gt; request header and setting the value to &lt;code&gt;gzip&lt;/code&gt;.&lt;/span&gt;
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * A query parameter that can be used to limit the response by returning policy information for only the selected sections of the category tree. Supply &lt;b&gt;categoryId&lt;/b&gt; values for the sections of the tree that should be returned.&lt;br&gt;&lt;br&gt;When a &lt;b&gt;categoryId&lt;/b&gt; value is specified, the returned category tree includes the policies for that parent node, as well as the policies for any child nodes below that parent node.&lt;br&gt;&lt;br&gt;Pass in the &lt;b&gt;categoryId&lt;/b&gt; values using a URL-encoded, pipe-separated (&apos;|&apos;) list. For example:&lt;br&gt;&lt;br&gt;&lt;code&gt;filter=categoryIds%3A%7B100%7C101%7C102%7D&lt;/code&gt;&lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum:&lt;/b&gt; 50
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

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

package com.ebay.listingmetadata.generated.metadata.marketplace.item.get_item_condition_policies;

import com.ebay.listingmetadata.generated.metadata.models.ItemConditionPolicyResponse;
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
 * Builds and executes requests for operations under /marketplace/{marketplace_id}/get_item_condition_policies
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetItemConditionPoliciesRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link GetItemConditionPoliciesRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetItemConditionPoliciesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/marketplace/{marketplace_id}/get_item_condition_policies{?filter*}", pathParameters);
    }
    /**
     * Instantiates a new {@link GetItemConditionPoliciesRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetItemConditionPoliciesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/marketplace/{marketplace_id}/get_item_condition_policies{?filter*}", rawUrl);
    }
    /**
     * This method returns item condition metadata on one, multiple, or all eBay categories on an eBay marketplace. This metadata consists of the different item conditions (with IDs) that an eBay category supports, and a boolean to indicate if an eBay category requires an item condition. &lt;br&gt;&lt;br&gt;If applicable, this metadata also shows the different condition descriptors (with IDs) that an eBay category supports.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Currently, condition grading is only applicable to the following trading card categories: &lt;ul&gt;&lt;li&gt;Non-Sport Trading Card Singles&lt;/li&gt;&lt;li&gt;CCG Individual Cards&lt;/li&gt;&lt;li&gt;Sports Trading Cards Singles&lt;/li&gt;&lt;/ul&gt;&lt;/span&gt;&lt;br&gt;The identifier of the eBay marketplace is passed in as a path parameter, and unless one or more eBay category IDs are passed in through the &lt;b&gt;filter&lt;/b&gt; query parameter, this method will return metadata on every single category for the specified marketplace. If you only want to view item condition metadata for one eBay category or a select group of eBay categories, you can pass in up to 50 eBay category ID through the &lt;b&gt;filter&lt;/b&gt; query parameter.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#FF0000&quot;&gt;&lt;strong&gt;Important:&lt;/strong&gt;&lt;/span&gt; &lt;b&gt;Certified - Refurbished&lt;/b&gt;-eligible sellers, and sellers who are eligible to list with the new values (EXCELLENT_REFURBISHED, VERY_GOOD_REFURBISHED, and GOOD_REFURBISHED) must use an OAuth token created with the &lt;a href=&quot;/api-docs/static/oauth-authorization-code-grant.html&quot; target=&quot;_blank&quot;&gt;authorization code grant flow&lt;/a&gt; and &lt;b&gt;https://api.ebay.com/oauth/api_scope/sell.inventory&lt;/b&gt; scope in order to retrieve the refurbished conditions for the relevant categories.&lt;br/&gt;&lt;br/&gt;Refurbished item conditions are only supported in the Australia, Canada, French Canada, Germany, France, Italy, UK, and US marketplaces. See the &lt;a href=&quot;https://www.ebay.com/sellercenter/ebay-for-business/ebay-refurbished-program&quot; target=&quot;_blank&quot;&gt;eBay Refurbished Program&lt;/a&gt; page in help center for the categories that support refurbished conditions. &lt;br/&gt;&lt;br/&gt;These restricted item conditions will not be returned if an OAuth token created with the &lt;a href=&quot;/api-docs/static/oauth-client-credentials-grant.html&quot; target=&quot;_blank&quot;&gt;client credentials grant flow&lt;/a&gt; and &lt;b&gt;https://api.ebay.com/oauth/api_scope&lt;/b&gt; scope is used, or if any seller is not eligible to list with that item condition. &lt;br/&gt;&lt;br/&gt; See the &lt;a href=&quot;/api-docs/static/oauth-scopes.html&quot; target=&quot;_blank&quot;&gt;Specifying OAuth scopes&lt;/a&gt; topic for more information about specifying scopes.&lt;/span&gt;&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#478415&quot;&gt;&lt;strong&gt;Tip:&lt;/strong&gt;&lt;/span&gt; This method can potentially return a very large response payload. eBay recommends that the response payload be compressed by passing in the &lt;b&gt;Accept-Encoding&lt;/b&gt; request header and setting the value to &lt;code&gt;gzip&lt;/code&gt;.&lt;/span&gt;
     * @return a {@link ItemConditionPolicyResponse}
     */
    @jakarta.annotation.Nullable
    public ItemConditionPolicyResponse get() {
        return get(null);
    }
    /**
     * This method returns item condition metadata on one, multiple, or all eBay categories on an eBay marketplace. This metadata consists of the different item conditions (with IDs) that an eBay category supports, and a boolean to indicate if an eBay category requires an item condition. &lt;br&gt;&lt;br&gt;If applicable, this metadata also shows the different condition descriptors (with IDs) that an eBay category supports.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Currently, condition grading is only applicable to the following trading card categories: &lt;ul&gt;&lt;li&gt;Non-Sport Trading Card Singles&lt;/li&gt;&lt;li&gt;CCG Individual Cards&lt;/li&gt;&lt;li&gt;Sports Trading Cards Singles&lt;/li&gt;&lt;/ul&gt;&lt;/span&gt;&lt;br&gt;The identifier of the eBay marketplace is passed in as a path parameter, and unless one or more eBay category IDs are passed in through the &lt;b&gt;filter&lt;/b&gt; query parameter, this method will return metadata on every single category for the specified marketplace. If you only want to view item condition metadata for one eBay category or a select group of eBay categories, you can pass in up to 50 eBay category ID through the &lt;b&gt;filter&lt;/b&gt; query parameter.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#FF0000&quot;&gt;&lt;strong&gt;Important:&lt;/strong&gt;&lt;/span&gt; &lt;b&gt;Certified - Refurbished&lt;/b&gt;-eligible sellers, and sellers who are eligible to list with the new values (EXCELLENT_REFURBISHED, VERY_GOOD_REFURBISHED, and GOOD_REFURBISHED) must use an OAuth token created with the &lt;a href=&quot;/api-docs/static/oauth-authorization-code-grant.html&quot; target=&quot;_blank&quot;&gt;authorization code grant flow&lt;/a&gt; and &lt;b&gt;https://api.ebay.com/oauth/api_scope/sell.inventory&lt;/b&gt; scope in order to retrieve the refurbished conditions for the relevant categories.&lt;br/&gt;&lt;br/&gt;Refurbished item conditions are only supported in the Australia, Canada, French Canada, Germany, France, Italy, UK, and US marketplaces. See the &lt;a href=&quot;https://www.ebay.com/sellercenter/ebay-for-business/ebay-refurbished-program&quot; target=&quot;_blank&quot;&gt;eBay Refurbished Program&lt;/a&gt; page in help center for the categories that support refurbished conditions. &lt;br/&gt;&lt;br/&gt;These restricted item conditions will not be returned if an OAuth token created with the &lt;a href=&quot;/api-docs/static/oauth-client-credentials-grant.html&quot; target=&quot;_blank&quot;&gt;client credentials grant flow&lt;/a&gt; and &lt;b&gt;https://api.ebay.com/oauth/api_scope&lt;/b&gt; scope is used, or if any seller is not eligible to list with that item condition. &lt;br/&gt;&lt;br/&gt; See the &lt;a href=&quot;/api-docs/static/oauth-scopes.html&quot; target=&quot;_blank&quot;&gt;Specifying OAuth scopes&lt;/a&gt; topic for more information about specifying scopes.&lt;/span&gt;&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#478415&quot;&gt;&lt;strong&gt;Tip:&lt;/strong&gt;&lt;/span&gt; This method can potentially return a very large response payload. eBay recommends that the response payload be compressed by passing in the &lt;b&gt;Accept-Encoding&lt;/b&gt; request header and setting the value to &lt;code&gt;gzip&lt;/code&gt;.&lt;/span&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ItemConditionPolicyResponse}
     */
    @jakarta.annotation.Nullable
    public ItemConditionPolicyResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ItemConditionPolicyResponse::createFromDiscriminatorValue);
    }
    /**
     * This method returns item condition metadata on one, multiple, or all eBay categories on an eBay marketplace. This metadata consists of the different item conditions (with IDs) that an eBay category supports, and a boolean to indicate if an eBay category requires an item condition. &lt;br&gt;&lt;br&gt;If applicable, this metadata also shows the different condition descriptors (with IDs) that an eBay category supports.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Currently, condition grading is only applicable to the following trading card categories: &lt;ul&gt;&lt;li&gt;Non-Sport Trading Card Singles&lt;/li&gt;&lt;li&gt;CCG Individual Cards&lt;/li&gt;&lt;li&gt;Sports Trading Cards Singles&lt;/li&gt;&lt;/ul&gt;&lt;/span&gt;&lt;br&gt;The identifier of the eBay marketplace is passed in as a path parameter, and unless one or more eBay category IDs are passed in through the &lt;b&gt;filter&lt;/b&gt; query parameter, this method will return metadata on every single category for the specified marketplace. If you only want to view item condition metadata for one eBay category or a select group of eBay categories, you can pass in up to 50 eBay category ID through the &lt;b&gt;filter&lt;/b&gt; query parameter.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#FF0000&quot;&gt;&lt;strong&gt;Important:&lt;/strong&gt;&lt;/span&gt; &lt;b&gt;Certified - Refurbished&lt;/b&gt;-eligible sellers, and sellers who are eligible to list with the new values (EXCELLENT_REFURBISHED, VERY_GOOD_REFURBISHED, and GOOD_REFURBISHED) must use an OAuth token created with the &lt;a href=&quot;/api-docs/static/oauth-authorization-code-grant.html&quot; target=&quot;_blank&quot;&gt;authorization code grant flow&lt;/a&gt; and &lt;b&gt;https://api.ebay.com/oauth/api_scope/sell.inventory&lt;/b&gt; scope in order to retrieve the refurbished conditions for the relevant categories.&lt;br/&gt;&lt;br/&gt;Refurbished item conditions are only supported in the Australia, Canada, French Canada, Germany, France, Italy, UK, and US marketplaces. See the &lt;a href=&quot;https://www.ebay.com/sellercenter/ebay-for-business/ebay-refurbished-program&quot; target=&quot;_blank&quot;&gt;eBay Refurbished Program&lt;/a&gt; page in help center for the categories that support refurbished conditions. &lt;br/&gt;&lt;br/&gt;These restricted item conditions will not be returned if an OAuth token created with the &lt;a href=&quot;/api-docs/static/oauth-client-credentials-grant.html&quot; target=&quot;_blank&quot;&gt;client credentials grant flow&lt;/a&gt; and &lt;b&gt;https://api.ebay.com/oauth/api_scope&lt;/b&gt; scope is used, or if any seller is not eligible to list with that item condition. &lt;br/&gt;&lt;br/&gt; See the &lt;a href=&quot;/api-docs/static/oauth-scopes.html&quot; target=&quot;_blank&quot;&gt;Specifying OAuth scopes&lt;/a&gt; topic for more information about specifying scopes.&lt;/span&gt;&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#478415&quot;&gt;&lt;strong&gt;Tip:&lt;/strong&gt;&lt;/span&gt; This method can potentially return a very large response payload. eBay recommends that the response payload be compressed by passing in the &lt;b&gt;Accept-Encoding&lt;/b&gt; request header and setting the value to &lt;code&gt;gzip&lt;/code&gt;.&lt;/span&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method returns item condition metadata on one, multiple, or all eBay categories on an eBay marketplace. This metadata consists of the different item conditions (with IDs) that an eBay category supports, and a boolean to indicate if an eBay category requires an item condition. &lt;br&gt;&lt;br&gt;If applicable, this metadata also shows the different condition descriptors (with IDs) that an eBay category supports.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Currently, condition grading is only applicable to the following trading card categories: &lt;ul&gt;&lt;li&gt;Non-Sport Trading Card Singles&lt;/li&gt;&lt;li&gt;CCG Individual Cards&lt;/li&gt;&lt;li&gt;Sports Trading Cards Singles&lt;/li&gt;&lt;/ul&gt;&lt;/span&gt;&lt;br&gt;The identifier of the eBay marketplace is passed in as a path parameter, and unless one or more eBay category IDs are passed in through the &lt;b&gt;filter&lt;/b&gt; query parameter, this method will return metadata on every single category for the specified marketplace. If you only want to view item condition metadata for one eBay category or a select group of eBay categories, you can pass in up to 50 eBay category ID through the &lt;b&gt;filter&lt;/b&gt; query parameter.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#FF0000&quot;&gt;&lt;strong&gt;Important:&lt;/strong&gt;&lt;/span&gt; &lt;b&gt;Certified - Refurbished&lt;/b&gt;-eligible sellers, and sellers who are eligible to list with the new values (EXCELLENT_REFURBISHED, VERY_GOOD_REFURBISHED, and GOOD_REFURBISHED) must use an OAuth token created with the &lt;a href=&quot;/api-docs/static/oauth-authorization-code-grant.html&quot; target=&quot;_blank&quot;&gt;authorization code grant flow&lt;/a&gt; and &lt;b&gt;https://api.ebay.com/oauth/api_scope/sell.inventory&lt;/b&gt; scope in order to retrieve the refurbished conditions for the relevant categories.&lt;br/&gt;&lt;br/&gt;Refurbished item conditions are only supported in the Australia, Canada, French Canada, Germany, France, Italy, UK, and US marketplaces. See the &lt;a href=&quot;https://www.ebay.com/sellercenter/ebay-for-business/ebay-refurbished-program&quot; target=&quot;_blank&quot;&gt;eBay Refurbished Program&lt;/a&gt; page in help center for the categories that support refurbished conditions. &lt;br/&gt;&lt;br/&gt;These restricted item conditions will not be returned if an OAuth token created with the &lt;a href=&quot;/api-docs/static/oauth-client-credentials-grant.html&quot; target=&quot;_blank&quot;&gt;client credentials grant flow&lt;/a&gt; and &lt;b&gt;https://api.ebay.com/oauth/api_scope&lt;/b&gt; scope is used, or if any seller is not eligible to list with that item condition. &lt;br/&gt;&lt;br/&gt; See the &lt;a href=&quot;/api-docs/static/oauth-scopes.html&quot; target=&quot;_blank&quot;&gt;Specifying OAuth scopes&lt;/a&gt; topic for more information about specifying scopes.&lt;/span&gt;&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#478415&quot;&gt;&lt;strong&gt;Tip:&lt;/strong&gt;&lt;/span&gt; This method can potentially return a very large response payload. eBay recommends that the response payload be compressed by passing in the &lt;b&gt;Accept-Encoding&lt;/b&gt; request header and setting the value to &lt;code&gt;gzip&lt;/code&gt;.&lt;/span&gt;
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
     * @return a {@link GetItemConditionPoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetItemConditionPoliciesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GetItemConditionPoliciesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * This method returns item condition metadata on one, multiple, or all eBay categories on an eBay marketplace. This metadata consists of the different item conditions (with IDs) that an eBay category supports, and a boolean to indicate if an eBay category requires an item condition. &lt;br&gt;&lt;br&gt;If applicable, this metadata also shows the different condition descriptors (with IDs) that an eBay category supports.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Currently, condition grading is only applicable to the following trading card categories: &lt;ul&gt;&lt;li&gt;Non-Sport Trading Card Singles&lt;/li&gt;&lt;li&gt;CCG Individual Cards&lt;/li&gt;&lt;li&gt;Sports Trading Cards Singles&lt;/li&gt;&lt;/ul&gt;&lt;/span&gt;&lt;br&gt;The identifier of the eBay marketplace is passed in as a path parameter, and unless one or more eBay category IDs are passed in through the &lt;b&gt;filter&lt;/b&gt; query parameter, this method will return metadata on every single category for the specified marketplace. If you only want to view item condition metadata for one eBay category or a select group of eBay categories, you can pass in up to 50 eBay category ID through the &lt;b&gt;filter&lt;/b&gt; query parameter.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#FF0000&quot;&gt;&lt;strong&gt;Important:&lt;/strong&gt;&lt;/span&gt; &lt;b&gt;Certified - Refurbished&lt;/b&gt;-eligible sellers, and sellers who are eligible to list with the new values (EXCELLENT_REFURBISHED, VERY_GOOD_REFURBISHED, and GOOD_REFURBISHED) must use an OAuth token created with the &lt;a href=&quot;/api-docs/static/oauth-authorization-code-grant.html&quot; target=&quot;_blank&quot;&gt;authorization code grant flow&lt;/a&gt; and &lt;b&gt;https://api.ebay.com/oauth/api_scope/sell.inventory&lt;/b&gt; scope in order to retrieve the refurbished conditions for the relevant categories.&lt;br/&gt;&lt;br/&gt;Refurbished item conditions are only supported in the Australia, Canada, French Canada, Germany, France, Italy, UK, and US marketplaces. See the &lt;a href=&quot;https://www.ebay.com/sellercenter/ebay-for-business/ebay-refurbished-program&quot; target=&quot;_blank&quot;&gt;eBay Refurbished Program&lt;/a&gt; page in help center for the categories that support refurbished conditions. &lt;br/&gt;&lt;br/&gt;These restricted item conditions will not be returned if an OAuth token created with the &lt;a href=&quot;/api-docs/static/oauth-client-credentials-grant.html&quot; target=&quot;_blank&quot;&gt;client credentials grant flow&lt;/a&gt; and &lt;b&gt;https://api.ebay.com/oauth/api_scope&lt;/b&gt; scope is used, or if any seller is not eligible to list with that item condition. &lt;br/&gt;&lt;br/&gt; See the &lt;a href=&quot;/api-docs/static/oauth-scopes.html&quot; target=&quot;_blank&quot;&gt;Specifying OAuth scopes&lt;/a&gt; topic for more information about specifying scopes.&lt;/span&gt;&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#478415&quot;&gt;&lt;strong&gt;Tip:&lt;/strong&gt;&lt;/span&gt; This method can potentially return a very large response payload. eBay recommends that the response payload be compressed by passing in the &lt;b&gt;Accept-Encoding&lt;/b&gt; request header and setting the value to &lt;code&gt;gzip&lt;/code&gt;.&lt;/span&gt;
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * This query parameter limits the response by returning policy information for only the selected sections of the category tree. Supply &lt;b&gt;categoryId&lt;/b&gt; values for the sections of the tree you want returned.  &lt;br&gt;&lt;br&gt;When you specify a &lt;b&gt;categoryId&lt;/b&gt; value, the returned category tree includes the policies for that parent node, plus the policies for any leaf nodes below that parent node.  &lt;br&gt;&lt;br&gt;The parameter takes a list of &lt;b&gt;categoryId&lt;/b&gt; values and you can specify up to 50 separate category IDs. Separate multiple values with a pipe character (&apos;|&apos;). If you specify more than 50 &lt;code&gt;categoryId&lt;/code&gt; values, eBay returns the policies for the first 50 IDs and a warning that not all categories were returned.  &lt;br&gt;&lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;filter=categoryIds:{100|101|102}&lt;/code&gt;  &lt;br&gt;&lt;br&gt;Note that you must URL-encode the parameter list, which results in the following filter for the above example: &lt;br&gt;&lt;br&gt; &amp;nbsp;&amp;nbsp;&lt;code&gt;filter=categoryIds%3A%7B100%7C101%7C102%7D&lt;/code&gt;
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

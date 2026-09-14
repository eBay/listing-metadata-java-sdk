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

package com.ebay.listingmetadata.generated.taxonomy.category_tree.item.get_category_suggestions;

import com.ebay.listingmetadata.generated.taxonomy.models.CategorySuggestionResponse;
import com.ebay.listingmetadata.generated.taxonomy.models.Error;
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
 * Builds and executes requests for operations under /category_tree/{category_tree_id}/get_category_suggestions
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetCategorySuggestionsRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link GetCategorySuggestionsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetCategorySuggestionsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/category_tree/{category_tree_id}/get_category_suggestions?q={q}", pathParameters);
    }
    /**
     * Instantiates a new {@link GetCategorySuggestionsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetCategorySuggestionsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/category_tree/{category_tree_id}/get_category_suggestions?q={q}", rawUrl);
    }
    /**
     * This method returns an array of category tree leaf nodes in the specified category tree that are considered by eBay to most closely correspond to the query string &lt;b&gt;q&lt;/b&gt;. Returned with each suggested node is a localized name for that category (based on the &lt;b&gt;Accept-Language&lt;/b&gt; header specified for the call), and details about each of the category&apos;s ancestor nodes, extending from its immediate parent up to the root of the category tree.&lt;br&gt;&lt;br&gt;You identify the tree using the &lt;b&gt;category_tree_id&lt;/b&gt; parameter, which was returned by the &lt;a href=&quot;/develop/api/sell/taxonomy_api#sell-taxonomy_api-category_tree-getdefaultcategorytreeid&quot; &gt;getDefaultCategoryTreeId&lt;/a&gt; call in the &lt;b&gt;categoryTreeId&lt;/b&gt; field.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;b&gt;&lt;span class=&quot;mcFormatColor&quot;&gt;Important! &lt;/span&gt;&lt;/b&gt;&lt;/span&gt; This call is not supported in the Sandbox environment. It will return a response payload in which the &lt;b&gt;categoryName&lt;/b&gt; fields contain random or boilerplate text regardless of the query submitted.&lt;/span&gt;&lt;/p&gt;&lt;/div&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Category suggestions returned by this method are partially determined by live inventory data on the eBay platform. In cases where items with similar titles are miscategorized, this may influence the recommendations returned and cause a less accurate category to rank higher. Suggestions should be treated as recommendations rather than authoritative classifications.&lt;/span&gt;
     * @return a {@link CategorySuggestionResponse}
     * @throws java.util.List<Error> When receiving a 400 status code
     * @throws java.util.List<Error> When receiving a 404 status code
     * @throws java.util.List<Error> When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public CategorySuggestionResponse get() {
        return get(null);
    }
    /**
     * This method returns an array of category tree leaf nodes in the specified category tree that are considered by eBay to most closely correspond to the query string &lt;b&gt;q&lt;/b&gt;. Returned with each suggested node is a localized name for that category (based on the &lt;b&gt;Accept-Language&lt;/b&gt; header specified for the call), and details about each of the category&apos;s ancestor nodes, extending from its immediate parent up to the root of the category tree.&lt;br&gt;&lt;br&gt;You identify the tree using the &lt;b&gt;category_tree_id&lt;/b&gt; parameter, which was returned by the &lt;a href=&quot;/develop/api/sell/taxonomy_api#sell-taxonomy_api-category_tree-getdefaultcategorytreeid&quot; &gt;getDefaultCategoryTreeId&lt;/a&gt; call in the &lt;b&gt;categoryTreeId&lt;/b&gt; field.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;b&gt;&lt;span class=&quot;mcFormatColor&quot;&gt;Important! &lt;/span&gt;&lt;/b&gt;&lt;/span&gt; This call is not supported in the Sandbox environment. It will return a response payload in which the &lt;b&gt;categoryName&lt;/b&gt; fields contain random or boilerplate text regardless of the query submitted.&lt;/span&gt;&lt;/p&gt;&lt;/div&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Category suggestions returned by this method are partially determined by live inventory data on the eBay platform. In cases where items with similar titles are miscategorized, this may influence the recommendations returned and cause a less accurate category to rank higher. Suggestions should be treated as recommendations rather than authoritative classifications.&lt;/span&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CategorySuggestionResponse}
     * @throws java.util.List<Error> When receiving a 400 status code
     * @throws java.util.List<Error> When receiving a 404 status code
     * @throws java.util.List<Error> When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public CategorySuggestionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("404", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, CategorySuggestionResponse::createFromDiscriminatorValue);
    }
    /**
     * This method returns an array of category tree leaf nodes in the specified category tree that are considered by eBay to most closely correspond to the query string &lt;b&gt;q&lt;/b&gt;. Returned with each suggested node is a localized name for that category (based on the &lt;b&gt;Accept-Language&lt;/b&gt; header specified for the call), and details about each of the category&apos;s ancestor nodes, extending from its immediate parent up to the root of the category tree.&lt;br&gt;&lt;br&gt;You identify the tree using the &lt;b&gt;category_tree_id&lt;/b&gt; parameter, which was returned by the &lt;a href=&quot;/develop/api/sell/taxonomy_api#sell-taxonomy_api-category_tree-getdefaultcategorytreeid&quot; &gt;getDefaultCategoryTreeId&lt;/a&gt; call in the &lt;b&gt;categoryTreeId&lt;/b&gt; field.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;b&gt;&lt;span class=&quot;mcFormatColor&quot;&gt;Important! &lt;/span&gt;&lt;/b&gt;&lt;/span&gt; This call is not supported in the Sandbox environment. It will return a response payload in which the &lt;b&gt;categoryName&lt;/b&gt; fields contain random or boilerplate text regardless of the query submitted.&lt;/span&gt;&lt;/p&gt;&lt;/div&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Category suggestions returned by this method are partially determined by live inventory data on the eBay platform. In cases where items with similar titles are miscategorized, this may influence the recommendations returned and cause a less accurate category to rank higher. Suggestions should be treated as recommendations rather than authoritative classifications.&lt;/span&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method returns an array of category tree leaf nodes in the specified category tree that are considered by eBay to most closely correspond to the query string &lt;b&gt;q&lt;/b&gt;. Returned with each suggested node is a localized name for that category (based on the &lt;b&gt;Accept-Language&lt;/b&gt; header specified for the call), and details about each of the category&apos;s ancestor nodes, extending from its immediate parent up to the root of the category tree.&lt;br&gt;&lt;br&gt;You identify the tree using the &lt;b&gt;category_tree_id&lt;/b&gt; parameter, which was returned by the &lt;a href=&quot;/develop/api/sell/taxonomy_api#sell-taxonomy_api-category_tree-getdefaultcategorytreeid&quot; &gt;getDefaultCategoryTreeId&lt;/a&gt; call in the &lt;b&gt;categoryTreeId&lt;/b&gt; field.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;b&gt;&lt;span class=&quot;mcFormatColor&quot;&gt;Important! &lt;/span&gt;&lt;/b&gt;&lt;/span&gt; This call is not supported in the Sandbox environment. It will return a response payload in which the &lt;b&gt;categoryName&lt;/b&gt; fields contain random or boilerplate text regardless of the query submitted.&lt;/span&gt;&lt;/p&gt;&lt;/div&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Category suggestions returned by this method are partially determined by live inventory data on the eBay platform. In cases where items with similar titles are miscategorized, this may influence the recommendations returned and cause a less accurate category to rank higher. Suggestions should be treated as recommendations rather than authoritative classifications.&lt;/span&gt;
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
     * @return a {@link GetCategorySuggestionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetCategorySuggestionsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GetCategorySuggestionsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * This method returns an array of category tree leaf nodes in the specified category tree that are considered by eBay to most closely correspond to the query string &lt;b&gt;q&lt;/b&gt;. Returned with each suggested node is a localized name for that category (based on the &lt;b&gt;Accept-Language&lt;/b&gt; header specified for the call), and details about each of the category&apos;s ancestor nodes, extending from its immediate parent up to the root of the category tree.&lt;br&gt;&lt;br&gt;You identify the tree using the &lt;b&gt;category_tree_id&lt;/b&gt; parameter, which was returned by the &lt;a href=&quot;/develop/api/sell/taxonomy_api#sell-taxonomy_api-category_tree-getdefaultcategorytreeid&quot; &gt;getDefaultCategoryTreeId&lt;/a&gt; call in the &lt;b&gt;categoryTreeId&lt;/b&gt; field.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;b&gt;&lt;span class=&quot;mcFormatColor&quot;&gt;Important! &lt;/span&gt;&lt;/b&gt;&lt;/span&gt; This call is not supported in the Sandbox environment. It will return a response payload in which the &lt;b&gt;categoryName&lt;/b&gt; fields contain random or boilerplate text regardless of the query submitted.&lt;/span&gt;&lt;/p&gt;&lt;/div&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Category suggestions returned by this method are partially determined by live inventory data on the eBay platform. In cases where items with similar titles are miscategorized, this may influence the recommendations returned and cause a less accurate category to rank higher. Suggestions should be treated as recommendations rather than authoritative classifications.&lt;/span&gt;
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * A quoted string that describes or characterizes the item being offered for sale. The string format is free form, and can contain any combination of phrases or keywords. eBay will parse the string and return suggested categories for the item.
         */
        @jakarta.annotation.Nullable
        public String q;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("q", q);
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

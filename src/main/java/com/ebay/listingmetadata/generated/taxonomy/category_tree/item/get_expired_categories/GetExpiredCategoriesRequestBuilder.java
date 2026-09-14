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

package com.ebay.listingmetadata.generated.taxonomy.category_tree.item.get_expired_categories;

import com.ebay.listingmetadata.generated.taxonomy.models.Error;
import com.ebay.listingmetadata.generated.taxonomy.models.ExpiredCategories;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
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
 * Builds and executes requests for operations under /category_tree/{category_tree_id}/get_expired_categories
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetExpiredCategoriesRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link GetExpiredCategoriesRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetExpiredCategoriesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/category_tree/{category_tree_id}/get_expired_categories", pathParameters);
    }
    /**
     * Instantiates a new {@link GetExpiredCategoriesRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetExpiredCategoriesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/category_tree/{category_tree_id}/get_expired_categories", rawUrl);
    }
    /**
     * This method retrieves the mappings of expired leaf categories in the specified category tree to their corresponding active leaf categories. Note that in some cases, several expired categories are mapped to a single active category.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only returns information about categories that have been mapped (i.e., combined categories and split categories). It does not return information about expired categories that have no corresponding active categories. When a category expires in this manner, any completed items that were listed in the expired category can still be found, but new listings cannot be created in the category.&lt;/span&gt;
     * @return a {@link ExpiredCategories}
     * @throws java.util.List<Error> When receiving a 400 status code
     * @throws java.util.List<Error> When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public ExpiredCategories get() {
        return get(null);
    }
    /**
     * This method retrieves the mappings of expired leaf categories in the specified category tree to their corresponding active leaf categories. Note that in some cases, several expired categories are mapped to a single active category.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only returns information about categories that have been mapped (i.e., combined categories and split categories). It does not return information about expired categories that have no corresponding active categories. When a category expires in this manner, any completed items that were listed in the expired category can still be found, but new listings cannot be created in the category.&lt;/span&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ExpiredCategories}
     * @throws java.util.List<Error> When receiving a 400 status code
     * @throws java.util.List<Error> When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public ExpiredCategories get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ExpiredCategories::createFromDiscriminatorValue);
    }
    /**
     * This method retrieves the mappings of expired leaf categories in the specified category tree to their corresponding active leaf categories. Note that in some cases, several expired categories are mapped to a single active category.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only returns information about categories that have been mapped (i.e., combined categories and split categories). It does not return information about expired categories that have no corresponding active categories. When a category expires in this manner, any completed items that were listed in the expired category can still be found, but new listings cannot be created in the category.&lt;/span&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method retrieves the mappings of expired leaf categories in the specified category tree to their corresponding active leaf categories. Note that in some cases, several expired categories are mapped to a single active category.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method only returns information about categories that have been mapped (i.e., combined categories and split categories). It does not return information about expired categories that have no corresponding active categories. When a category expires in this manner, any completed items that were listed in the expired category can still be found, but new listings cannot be created in the category.&lt;/span&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link GetExpiredCategoriesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetExpiredCategoriesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GetExpiredCategoriesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}

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

package com.ebay.listingmetadata.generated.metadata.marketplace.item.get_minimum_listing_price_policies;

import com.ebay.listingmetadata.generated.metadata.models.GetMinimumListingPricePoliciesResponse;
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
 * Builds and executes requests for operations under /marketplace/{marketplace_id}/get_minimum_listing_price_policies
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetMinimumListingPricePoliciesRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link GetMinimumListingPricePoliciesRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetMinimumListingPricePoliciesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/marketplace/{marketplace_id}/get_minimum_listing_price_policies", pathParameters);
    }
    /**
     * Instantiates a new {@link GetMinimumListingPricePoliciesRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetMinimumListingPricePoliciesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/marketplace/{marketplace_id}/get_minimum_listing_price_policies", rawUrl);
    }
    /**
     * This method returns minimum listing price policies for supported types of listings on a specific marketplace. This includes the minimum start price for auction listings, the minimum sale price for fixed-price listings, and the minimum percentage value that a Buy It Now or auction listing must be above the minimum start price for the same listing.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The only applicable listing type values for this method are &lt;code&gt;AUCTION&lt;/code&gt; and &lt;code&gt;FIXED_PRICE_ITEM&lt;/code&gt;.&lt;/span&gt;&lt;br&gt;The identifier of the eBay marketplace for which to retrieve supported minimum listing price policies is passed through the &lt;b&gt;marketplace_id&lt;/b&gt; path parameter.
     * @return a {@link GetMinimumListingPricePoliciesResponse}
     */
    @jakarta.annotation.Nullable
    public GetMinimumListingPricePoliciesResponse get() {
        return get(null);
    }
    /**
     * This method returns minimum listing price policies for supported types of listings on a specific marketplace. This includes the minimum start price for auction listings, the minimum sale price for fixed-price listings, and the minimum percentage value that a Buy It Now or auction listing must be above the minimum start price for the same listing.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The only applicable listing type values for this method are &lt;code&gt;AUCTION&lt;/code&gt; and &lt;code&gt;FIXED_PRICE_ITEM&lt;/code&gt;.&lt;/span&gt;&lt;br&gt;The identifier of the eBay marketplace for which to retrieve supported minimum listing price policies is passed through the &lt;b&gt;marketplace_id&lt;/b&gt; path parameter.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link GetMinimumListingPricePoliciesResponse}
     */
    @jakarta.annotation.Nullable
    public GetMinimumListingPricePoliciesResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, GetMinimumListingPricePoliciesResponse::createFromDiscriminatorValue);
    }
    /**
     * This method returns minimum listing price policies for supported types of listings on a specific marketplace. This includes the minimum start price for auction listings, the minimum sale price for fixed-price listings, and the minimum percentage value that a Buy It Now or auction listing must be above the minimum start price for the same listing.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The only applicable listing type values for this method are &lt;code&gt;AUCTION&lt;/code&gt; and &lt;code&gt;FIXED_PRICE_ITEM&lt;/code&gt;.&lt;/span&gt;&lt;br&gt;The identifier of the eBay marketplace for which to retrieve supported minimum listing price policies is passed through the &lt;b&gt;marketplace_id&lt;/b&gt; path parameter.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method returns minimum listing price policies for supported types of listings on a specific marketplace. This includes the minimum start price for auction listings, the minimum sale price for fixed-price listings, and the minimum percentage value that a Buy It Now or auction listing must be above the minimum start price for the same listing.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The only applicable listing type values for this method are &lt;code&gt;AUCTION&lt;/code&gt; and &lt;code&gt;FIXED_PRICE_ITEM&lt;/code&gt;.&lt;/span&gt;&lt;br&gt;The identifier of the eBay marketplace for which to retrieve supported minimum listing price policies is passed through the &lt;b&gt;marketplace_id&lt;/b&gt; path parameter.
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
     * @return a {@link GetMinimumListingPricePoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetMinimumListingPricePoliciesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GetMinimumListingPricePoliciesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}

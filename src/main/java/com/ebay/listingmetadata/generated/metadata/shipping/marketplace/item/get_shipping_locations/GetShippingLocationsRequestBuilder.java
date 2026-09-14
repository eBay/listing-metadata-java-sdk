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

package com.ebay.listingmetadata.generated.metadata.shipping.marketplace.item.get_shipping_locations;

import com.ebay.listingmetadata.generated.metadata.models.ShippingLocationResponse;
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
 * Builds and executes requests for operations under /shipping/marketplace/{marketplace_id}/get_shipping_locations
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetShippingLocationsRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link GetShippingLocationsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetShippingLocationsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/shipping/marketplace/{marketplace_id}/get_shipping_locations", pathParameters);
    }
    /**
     * Instantiates a new {@link GetShippingLocationsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetShippingLocationsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/shipping/marketplace/{marketplace_id}/get_shipping_locations", rawUrl);
    }
    /**
     * This method retrieves a list of supported shipping locations for the specified marketplace. It provides sellers with information on where they can ship their items. Sellers can use this information to configure their shipping settings. &lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Tip: &lt;/strong&gt; Use the &lt;a href=&quot;/develop/api/sell/metadata_api#sell-metadata_api-shipping:marketplace-getexcludeshippinglocations&quot;&gt;getExcludeShippingLocations&lt;/a&gt; method to return locations where the seller does not ship.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;Manage shipping locations using business policies through the &lt;b&gt;fulfillment_policy&lt;/b&gt; resource of the &lt;b&gt;Account v1 API&lt;/b&gt;.&lt;/p&gt;
     * @return a {@link ShippingLocationResponse}
     */
    @jakarta.annotation.Nullable
    public ShippingLocationResponse get() {
        return get(null);
    }
    /**
     * This method retrieves a list of supported shipping locations for the specified marketplace. It provides sellers with information on where they can ship their items. Sellers can use this information to configure their shipping settings. &lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Tip: &lt;/strong&gt; Use the &lt;a href=&quot;/develop/api/sell/metadata_api#sell-metadata_api-shipping:marketplace-getexcludeshippinglocations&quot;&gt;getExcludeShippingLocations&lt;/a&gt; method to return locations where the seller does not ship.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;Manage shipping locations using business policies through the &lt;b&gt;fulfillment_policy&lt;/b&gt; resource of the &lt;b&gt;Account v1 API&lt;/b&gt;.&lt;/p&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ShippingLocationResponse}
     */
    @jakarta.annotation.Nullable
    public ShippingLocationResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ShippingLocationResponse::createFromDiscriminatorValue);
    }
    /**
     * This method retrieves a list of supported shipping locations for the specified marketplace. It provides sellers with information on where they can ship their items. Sellers can use this information to configure their shipping settings. &lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Tip: &lt;/strong&gt; Use the &lt;a href=&quot;/develop/api/sell/metadata_api#sell-metadata_api-shipping:marketplace-getexcludeshippinglocations&quot;&gt;getExcludeShippingLocations&lt;/a&gt; method to return locations where the seller does not ship.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;Manage shipping locations using business policies through the &lt;b&gt;fulfillment_policy&lt;/b&gt; resource of the &lt;b&gt;Account v1 API&lt;/b&gt;.&lt;/p&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method retrieves a list of supported shipping locations for the specified marketplace. It provides sellers with information on where they can ship their items. Sellers can use this information to configure their shipping settings. &lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Tip: &lt;/strong&gt; Use the &lt;a href=&quot;/develop/api/sell/metadata_api#sell-metadata_api-shipping:marketplace-getexcludeshippinglocations&quot;&gt;getExcludeShippingLocations&lt;/a&gt; method to return locations where the seller does not ship.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;Manage shipping locations using business policies through the &lt;b&gt;fulfillment_policy&lt;/b&gt; resource of the &lt;b&gt;Account v1 API&lt;/b&gt;.&lt;/p&gt;
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
     * @return a {@link GetShippingLocationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetShippingLocationsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GetShippingLocationsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}

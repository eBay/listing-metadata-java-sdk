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

package com.ebay.listingmetadata.generated.metadata.shipping.marketplace.item.get_shipping_carriers;

import com.ebay.listingmetadata.generated.metadata.models.ShippingCarrierResponse;
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
 * Builds and executes requests for operations under /shipping/marketplace/{marketplace_id}/get_shipping_carriers
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetShippingCarriersRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link GetShippingCarriersRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetShippingCarriersRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/shipping/marketplace/{marketplace_id}/get_shipping_carriers", pathParameters);
    }
    /**
     * Instantiates a new {@link GetShippingCarriersRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetShippingCarriersRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/shipping/marketplace/{marketplace_id}/get_shipping_carriers", rawUrl);
    }
    /**
     * This method retrieves a list of supported shipping carriers for the specified marketplace. It provides essential information for sellers to understand which shipping carriers are available for use when listing items on that eBay marketplace. Knowing the supported carriers can help sellers optimize their shipping options and ensure efficient delivery to buyers.&lt;p&gt;The value returned in the &lt;b&gt;shippingCarrier&lt;/b&gt; field is the enumerated value required when providing shipment tracking information for that carrier.&lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Tip: &lt;/strong&gt; Use the &lt;a href=&quot;/api-docs/sell/metadata/resources/shipping:marketplace/methods/getShippingServices&quot;  target=&quot;_blank&quot;&gt;getShippingServices&lt;/a&gt; method to explore available shipping services for each carrier.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;Manage shipping carriers using business policies through the &lt;a href=&quot;/api-docs/sell/account/resources/methods#s0-1-30-4-7-5-6-2[1]-h2-fulfillment_policy&quot;  target=&quot;_blank&quot;&gt;fulfillment_policy&lt;/a&gt; resource of the &lt;b&gt;Account v1 API&lt;/b&gt;.&lt;/p&gt;
     * @return a {@link ShippingCarrierResponse}
     */
    @jakarta.annotation.Nullable
    public ShippingCarrierResponse get() {
        return get(null);
    }
    /**
     * This method retrieves a list of supported shipping carriers for the specified marketplace. It provides essential information for sellers to understand which shipping carriers are available for use when listing items on that eBay marketplace. Knowing the supported carriers can help sellers optimize their shipping options and ensure efficient delivery to buyers.&lt;p&gt;The value returned in the &lt;b&gt;shippingCarrier&lt;/b&gt; field is the enumerated value required when providing shipment tracking information for that carrier.&lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Tip: &lt;/strong&gt; Use the &lt;a href=&quot;/api-docs/sell/metadata/resources/shipping:marketplace/methods/getShippingServices&quot;  target=&quot;_blank&quot;&gt;getShippingServices&lt;/a&gt; method to explore available shipping services for each carrier.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;Manage shipping carriers using business policies through the &lt;a href=&quot;/api-docs/sell/account/resources/methods#s0-1-30-4-7-5-6-2[1]-h2-fulfillment_policy&quot;  target=&quot;_blank&quot;&gt;fulfillment_policy&lt;/a&gt; resource of the &lt;b&gt;Account v1 API&lt;/b&gt;.&lt;/p&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ShippingCarrierResponse}
     */
    @jakarta.annotation.Nullable
    public ShippingCarrierResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ShippingCarrierResponse::createFromDiscriminatorValue);
    }
    /**
     * This method retrieves a list of supported shipping carriers for the specified marketplace. It provides essential information for sellers to understand which shipping carriers are available for use when listing items on that eBay marketplace. Knowing the supported carriers can help sellers optimize their shipping options and ensure efficient delivery to buyers.&lt;p&gt;The value returned in the &lt;b&gt;shippingCarrier&lt;/b&gt; field is the enumerated value required when providing shipment tracking information for that carrier.&lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Tip: &lt;/strong&gt; Use the &lt;a href=&quot;/api-docs/sell/metadata/resources/shipping:marketplace/methods/getShippingServices&quot;  target=&quot;_blank&quot;&gt;getShippingServices&lt;/a&gt; method to explore available shipping services for each carrier.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;Manage shipping carriers using business policies through the &lt;a href=&quot;/api-docs/sell/account/resources/methods#s0-1-30-4-7-5-6-2[1]-h2-fulfillment_policy&quot;  target=&quot;_blank&quot;&gt;fulfillment_policy&lt;/a&gt; resource of the &lt;b&gt;Account v1 API&lt;/b&gt;.&lt;/p&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method retrieves a list of supported shipping carriers for the specified marketplace. It provides essential information for sellers to understand which shipping carriers are available for use when listing items on that eBay marketplace. Knowing the supported carriers can help sellers optimize their shipping options and ensure efficient delivery to buyers.&lt;p&gt;The value returned in the &lt;b&gt;shippingCarrier&lt;/b&gt; field is the enumerated value required when providing shipment tracking information for that carrier.&lt;/p&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Tip: &lt;/strong&gt; Use the &lt;a href=&quot;/api-docs/sell/metadata/resources/shipping:marketplace/methods/getShippingServices&quot;  target=&quot;_blank&quot;&gt;getShippingServices&lt;/a&gt; method to explore available shipping services for each carrier.&lt;/span&gt;&lt;/p&gt;&lt;p&gt;Manage shipping carriers using business policies through the &lt;a href=&quot;/api-docs/sell/account/resources/methods#s0-1-30-4-7-5-6-2[1]-h2-fulfillment_policy&quot;  target=&quot;_blank&quot;&gt;fulfillment_policy&lt;/a&gt; resource of the &lt;b&gt;Account v1 API&lt;/b&gt;.&lt;/p&gt;
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
     * @return a {@link GetShippingCarriersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetShippingCarriersRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GetShippingCarriersRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}

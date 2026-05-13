package com.ebay.listingmetadata.generated.metadata.shipping.marketplace.item.get_exclude_shipping_locations;

import com.ebay.listingmetadata.generated.metadata.models.ShippingExcludeLocationResponse;
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
 * Builds and executes requests for operations under /shipping/marketplace/{marketplace_id}/get_exclude_shipping_locations
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetExcludeShippingLocationsRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link GetExcludeShippingLocationsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetExcludeShippingLocationsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/shipping/marketplace/{marketplace_id}/get_exclude_shipping_locations", pathParameters);
    }
    /**
     * Instantiates a new {@link GetExcludeShippingLocationsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetExcludeShippingLocationsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/shipping/marketplace/{marketplace_id}/get_exclude_shipping_locations", rawUrl);
    }
    /**
     * This method retrieves a list of locations that the seller can use as excluded shipping locations within their listings or in their fulfillment business policies for the specified marketplace. These are locations that a seller designates as areas where they will not ship items. &lt;p&gt;Excluded shipping locations and ship-to locations are used in tandem at the listing level and in fulfillment business policies. Excluded shipping locations and ship-to locations share a lot of the same values and they should not contradict each other.&lt;p&gt;Manage excluded shipping locations using business policies through the &lt;a href=&quot;/api-docs/sell/account/resources/methods#s0-1-30-4-7-5-6-2[1]-h2-fulfillment_policy&quot;  target=&quot;_blank&quot;&gt;fulfillment_policy&lt;/a&gt; resource of the &lt;b&gt;Account v1 API&lt;/b&gt;.&lt;/p&gt;
     * @return a {@link ShippingExcludeLocationResponse}
     */
    @jakarta.annotation.Nullable
    public ShippingExcludeLocationResponse get() {
        return get(null);
    }
    /**
     * This method retrieves a list of locations that the seller can use as excluded shipping locations within their listings or in their fulfillment business policies for the specified marketplace. These are locations that a seller designates as areas where they will not ship items. &lt;p&gt;Excluded shipping locations and ship-to locations are used in tandem at the listing level and in fulfillment business policies. Excluded shipping locations and ship-to locations share a lot of the same values and they should not contradict each other.&lt;p&gt;Manage excluded shipping locations using business policies through the &lt;a href=&quot;/api-docs/sell/account/resources/methods#s0-1-30-4-7-5-6-2[1]-h2-fulfillment_policy&quot;  target=&quot;_blank&quot;&gt;fulfillment_policy&lt;/a&gt; resource of the &lt;b&gt;Account v1 API&lt;/b&gt;.&lt;/p&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ShippingExcludeLocationResponse}
     */
    @jakarta.annotation.Nullable
    public ShippingExcludeLocationResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ShippingExcludeLocationResponse::createFromDiscriminatorValue);
    }
    /**
     * This method retrieves a list of locations that the seller can use as excluded shipping locations within their listings or in their fulfillment business policies for the specified marketplace. These are locations that a seller designates as areas where they will not ship items. &lt;p&gt;Excluded shipping locations and ship-to locations are used in tandem at the listing level and in fulfillment business policies. Excluded shipping locations and ship-to locations share a lot of the same values and they should not contradict each other.&lt;p&gt;Manage excluded shipping locations using business policies through the &lt;a href=&quot;/api-docs/sell/account/resources/methods#s0-1-30-4-7-5-6-2[1]-h2-fulfillment_policy&quot;  target=&quot;_blank&quot;&gt;fulfillment_policy&lt;/a&gt; resource of the &lt;b&gt;Account v1 API&lt;/b&gt;.&lt;/p&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method retrieves a list of locations that the seller can use as excluded shipping locations within their listings or in their fulfillment business policies for the specified marketplace. These are locations that a seller designates as areas where they will not ship items. &lt;p&gt;Excluded shipping locations and ship-to locations are used in tandem at the listing level and in fulfillment business policies. Excluded shipping locations and ship-to locations share a lot of the same values and they should not contradict each other.&lt;p&gt;Manage excluded shipping locations using business policies through the &lt;a href=&quot;/api-docs/sell/account/resources/methods#s0-1-30-4-7-5-6-2[1]-h2-fulfillment_policy&quot;  target=&quot;_blank&quot;&gt;fulfillment_policy&lt;/a&gt; resource of the &lt;b&gt;Account v1 API&lt;/b&gt;.&lt;/p&gt;
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
     * @return a {@link GetExcludeShippingLocationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetExcludeShippingLocationsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GetExcludeShippingLocationsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}

package com.ebay.listingmetadata.generated.metadata.shipping.marketplace.item.get_handling_times;

import com.ebay.listingmetadata.generated.metadata.models.ShippingHandlingTimeResponse;
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
 * Builds and executes requests for operations under /shipping/marketplace/{marketplace_id}/get_handling_times
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetHandlingTimesRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link GetHandlingTimesRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetHandlingTimesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/shipping/marketplace/{marketplace_id}/get_handling_times", pathParameters);
    }
    /**
     * Instantiates a new {@link GetHandlingTimesRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetHandlingTimesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/shipping/marketplace/{marketplace_id}/get_handling_times", rawUrl);
    }
    /**
     * This method retrieves a list of supported handling times for the specified marketplace. The handling time returned specifies the maximum number of business days the eBay site allows for shipping an item to domestic buyers after receiving a cleared payment. Handling times apply to both domestic and international orders. If the handling time is 1 day, the seller commits to dropping the item off for shipment one business day after payment clears. &lt;p&gt;Manage handing times using business policies through the &lt;a href=&quot;/api-docs/sell/account/resources/methods#s0-1-30-4-7-5-6-2[1]-h2-fulfillment_policy&quot;  target=&quot;_blank&quot;&gt;fulfillment_policy&lt;/a&gt; resource of the &lt;b&gt;Account v1 API&lt;/b&gt;.&lt;/p&gt;
     * @return a {@link ShippingHandlingTimeResponse}
     */
    @jakarta.annotation.Nullable
    public ShippingHandlingTimeResponse get() {
        return get(null);
    }
    /**
     * This method retrieves a list of supported handling times for the specified marketplace. The handling time returned specifies the maximum number of business days the eBay site allows for shipping an item to domestic buyers after receiving a cleared payment. Handling times apply to both domestic and international orders. If the handling time is 1 day, the seller commits to dropping the item off for shipment one business day after payment clears. &lt;p&gt;Manage handing times using business policies through the &lt;a href=&quot;/api-docs/sell/account/resources/methods#s0-1-30-4-7-5-6-2[1]-h2-fulfillment_policy&quot;  target=&quot;_blank&quot;&gt;fulfillment_policy&lt;/a&gt; resource of the &lt;b&gt;Account v1 API&lt;/b&gt;.&lt;/p&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ShippingHandlingTimeResponse}
     */
    @jakarta.annotation.Nullable
    public ShippingHandlingTimeResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ShippingHandlingTimeResponse::createFromDiscriminatorValue);
    }
    /**
     * This method retrieves a list of supported handling times for the specified marketplace. The handling time returned specifies the maximum number of business days the eBay site allows for shipping an item to domestic buyers after receiving a cleared payment. Handling times apply to both domestic and international orders. If the handling time is 1 day, the seller commits to dropping the item off for shipment one business day after payment clears. &lt;p&gt;Manage handing times using business policies through the &lt;a href=&quot;/api-docs/sell/account/resources/methods#s0-1-30-4-7-5-6-2[1]-h2-fulfillment_policy&quot;  target=&quot;_blank&quot;&gt;fulfillment_policy&lt;/a&gt; resource of the &lt;b&gt;Account v1 API&lt;/b&gt;.&lt;/p&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method retrieves a list of supported handling times for the specified marketplace. The handling time returned specifies the maximum number of business days the eBay site allows for shipping an item to domestic buyers after receiving a cleared payment. Handling times apply to both domestic and international orders. If the handling time is 1 day, the seller commits to dropping the item off for shipment one business day after payment clears. &lt;p&gt;Manage handing times using business policies through the &lt;a href=&quot;/api-docs/sell/account/resources/methods#s0-1-30-4-7-5-6-2[1]-h2-fulfillment_policy&quot;  target=&quot;_blank&quot;&gt;fulfillment_policy&lt;/a&gt; resource of the &lt;b&gt;Account v1 API&lt;/b&gt;.&lt;/p&gt;
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
     * @return a {@link GetHandlingTimesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetHandlingTimesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GetHandlingTimesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}

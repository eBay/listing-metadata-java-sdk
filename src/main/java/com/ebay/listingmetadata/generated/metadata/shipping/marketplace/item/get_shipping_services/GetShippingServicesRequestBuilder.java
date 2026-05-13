package com.ebay.listingmetadata.generated.metadata.shipping.marketplace.item.get_shipping_services;

import com.ebay.listingmetadata.generated.metadata.models.ShippingServiceResponse;
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
 * Builds and executes requests for operations under /shipping/marketplace/{marketplace_id}/get_shipping_services
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetShippingServicesRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link GetShippingServicesRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetShippingServicesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/shipping/marketplace/{marketplace_id}/get_shipping_services", pathParameters);
    }
    /**
     * Instantiates a new {@link GetShippingServicesRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetShippingServicesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/shipping/marketplace/{marketplace_id}/get_shipping_services", rawUrl);
    }
    /**
     * This method retrieves a list of shipping services supported for the specified marketplace, including valid shipping services, shipping times, and package constraints such as size and weight.&lt;p&gt;Manage shipping services using business policies through the &lt;a href=&quot;/api-docs/sell/account/resources/methods#s0-1-30-4-7-5-6-2[1]-h2-fulfillment_policy&quot;  target=&quot;_blank&quot;&gt;fulfillment_policy&lt;/a&gt; resource of the &lt;b&gt;Account v1 API&lt;/b&gt;.&lt;/p&gt;
     * @return a {@link ShippingServiceResponse}
     */
    @jakarta.annotation.Nullable
    public ShippingServiceResponse get() {
        return get(null);
    }
    /**
     * This method retrieves a list of shipping services supported for the specified marketplace, including valid shipping services, shipping times, and package constraints such as size and weight.&lt;p&gt;Manage shipping services using business policies through the &lt;a href=&quot;/api-docs/sell/account/resources/methods#s0-1-30-4-7-5-6-2[1]-h2-fulfillment_policy&quot;  target=&quot;_blank&quot;&gt;fulfillment_policy&lt;/a&gt; resource of the &lt;b&gt;Account v1 API&lt;/b&gt;.&lt;/p&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ShippingServiceResponse}
     */
    @jakarta.annotation.Nullable
    public ShippingServiceResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ShippingServiceResponse::createFromDiscriminatorValue);
    }
    /**
     * This method retrieves a list of shipping services supported for the specified marketplace, including valid shipping services, shipping times, and package constraints such as size and weight.&lt;p&gt;Manage shipping services using business policies through the &lt;a href=&quot;/api-docs/sell/account/resources/methods#s0-1-30-4-7-5-6-2[1]-h2-fulfillment_policy&quot;  target=&quot;_blank&quot;&gt;fulfillment_policy&lt;/a&gt; resource of the &lt;b&gt;Account v1 API&lt;/b&gt;.&lt;/p&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method retrieves a list of shipping services supported for the specified marketplace, including valid shipping services, shipping times, and package constraints such as size and weight.&lt;p&gt;Manage shipping services using business policies through the &lt;a href=&quot;/api-docs/sell/account/resources/methods#s0-1-30-4-7-5-6-2[1]-h2-fulfillment_policy&quot;  target=&quot;_blank&quot;&gt;fulfillment_policy&lt;/a&gt; resource of the &lt;b&gt;Account v1 API&lt;/b&gt;.&lt;/p&gt;
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
     * @return a {@link GetShippingServicesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetShippingServicesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GetShippingServicesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}

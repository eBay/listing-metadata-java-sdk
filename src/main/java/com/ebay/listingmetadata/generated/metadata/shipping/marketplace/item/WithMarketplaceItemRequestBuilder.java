package com.ebay.listingmetadata.generated.metadata.shipping.marketplace.item;

import com.ebay.listingmetadata.generated.metadata.shipping.marketplace.item.get_exclude_shipping_locations.GetExcludeShippingLocationsRequestBuilder;
import com.ebay.listingmetadata.generated.metadata.shipping.marketplace.item.get_handling_times.GetHandlingTimesRequestBuilder;
import com.ebay.listingmetadata.generated.metadata.shipping.marketplace.item.get_shipping_carriers.GetShippingCarriersRequestBuilder;
import com.ebay.listingmetadata.generated.metadata.shipping.marketplace.item.get_shipping_locations.GetShippingLocationsRequestBuilder;
import com.ebay.listingmetadata.generated.metadata.shipping.marketplace.item.get_shipping_services.GetShippingServicesRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /shipping/marketplace/{marketplace_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithMarketplaceItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The get_exclude_shipping_locations property
     * @return a {@link GetExcludeShippingLocationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetExcludeShippingLocationsRequestBuilder getExcludeShippingLocations() {
        return new GetExcludeShippingLocationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The get_handling_times property
     * @return a {@link GetHandlingTimesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetHandlingTimesRequestBuilder getHandlingTimes() {
        return new GetHandlingTimesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The get_shipping_carriers property
     * @return a {@link GetShippingCarriersRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetShippingCarriersRequestBuilder getShippingCarriers() {
        return new GetShippingCarriersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The get_shipping_locations property
     * @return a {@link GetShippingLocationsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetShippingLocationsRequestBuilder getShippingLocations() {
        return new GetShippingLocationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The get_shipping_services property
     * @return a {@link GetShippingServicesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetShippingServicesRequestBuilder getShippingServices() {
        return new GetShippingServicesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithMarketplaceItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithMarketplaceItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/shipping/marketplace/{marketplace_id}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithMarketplaceItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithMarketplaceItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/shipping/marketplace/{marketplace_id}", rawUrl);
    }
}

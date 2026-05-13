package com.ebay.listingmetadata.generated.metadata.shipping;

import com.ebay.listingmetadata.generated.metadata.shipping.marketplace.MarketplaceRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /shipping
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ShippingRequestBuilder extends BaseRequestBuilder {
    /**
     * The marketplace property
     * @return a {@link MarketplaceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MarketplaceRequestBuilder marketplace() {
        return new MarketplaceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link ShippingRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ShippingRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/shipping", pathParameters);
    }
    /**
     * Instantiates a new {@link ShippingRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ShippingRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/shipping", rawUrl);
    }
}

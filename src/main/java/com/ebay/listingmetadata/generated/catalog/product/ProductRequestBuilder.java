package com.ebay.listingmetadata.generated.catalog.product;

import com.ebay.listingmetadata.generated.catalog.product.item.WithEpItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /product
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProductRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.ebay.listingmetadata.generated.catalog.product.item collection
     * @param epid The eBay product identifier (ePID) of the product being requested. This value can be discovered by issuing the &lt;b&gt;search&lt;/b&gt; method and examining the value of the &lt;b&gt;productSummaries.epid&lt;/b&gt; field for the desired returned product summary.
     * @return a {@link WithEpItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithEpItemRequestBuilder byEpid(@jakarta.annotation.Nonnull final String epid) {
        Objects.requireNonNull(epid);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("epid", epid);
        return new WithEpItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link ProductRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ProductRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/product", pathParameters);
    }
    /**
     * Instantiates a new {@link ProductRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ProductRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/product", rawUrl);
    }
}

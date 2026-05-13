package com.ebay.listingmetadata.generated.catalog.product_summary;

import com.ebay.listingmetadata.generated.catalog.product_summary.search.SearchRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /product_summary
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProductSummaryRequestBuilder extends BaseRequestBuilder {
    /**
     * The search property
     * @return a {@link SearchRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SearchRequestBuilder search() {
        return new SearchRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link ProductSummaryRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ProductSummaryRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/product_summary", pathParameters);
    }
    /**
     * Instantiates a new {@link ProductSummaryRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ProductSummaryRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/product_summary", rawUrl);
    }
}

package com.ebay.listingmetadata.generated.metadata.marketplace;

import com.ebay.listingmetadata.generated.metadata.marketplace.item.WithMarketplaceItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /marketplace
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MarketplaceRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.ebay.listingmetadata.generated.metadata.marketplace.item collection
     * @param marketplace_id This path parameter specifies the eBay marketplace for which policy information is retrieved.  &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note: &lt;/b&gt;Only the following eBay marketplaces support automotive parts compatibility: &lt;ul&gt; &lt;li&gt;EBAY_MOTORS_US&lt;/li&gt; &lt;li&gt;EBAY_AU&lt;/li&gt; &lt;li&gt;EBAY_CA&lt;/li&gt; &lt;li&gt;EBAY_DE&lt;/li&gt; &lt;li&gt;EBAY_ES&lt;/li&gt; &lt;li&gt;EBAY_FR&lt;/li&gt; &lt;li&gt;EBAY_GB&lt;/li&gt; &lt;li&gt;EBAY_IT&lt;/li&gt;&lt;/ul&gt;&lt;/span&gt;
     * @return a {@link WithMarketplaceItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithMarketplaceItemRequestBuilder byMarketplace_id(@jakarta.annotation.Nonnull final String marketplace_id) {
        Objects.requireNonNull(marketplace_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("marketplace_id", marketplace_id);
        return new WithMarketplaceItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link MarketplaceRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MarketplaceRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/marketplace", pathParameters);
    }
    /**
     * Instantiates a new {@link MarketplaceRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MarketplaceRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/marketplace", rawUrl);
    }
}

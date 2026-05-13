package com.ebay.listingmetadata.generated.metadata.shipping.marketplace;

import com.ebay.listingmetadata.generated.metadata.shipping.marketplace.item.WithMarketplaceItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /shipping/marketplace
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MarketplaceRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.ebay.listingmetadata.generated.metadata.shipping.marketplace.item collection
     * @param marketplace_id This path parameter specifies the eBay marketplace for which excluded shipping locations information is retrieved.&lt;br&gt;&lt;br&gt;See &lt;a href=&quot;/api-docs/sell/metadata/types/bas:MarketplaceIdEnum&quot; target=&quot;_blank&quot;&gt;MarketplaceIdEnum&lt;/a&gt; for supported eBay marketplace ID values. &lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt; When listing the items on the French Canada, French Belgium, and Dutch Belgium marketplaces, also set the &lt;b&gt;Accept-Language&lt;/b&gt; header as needed.&lt;/span&gt;&lt;/p&gt;
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
        super(requestAdapter, "{+baseurl}/shipping/marketplace", pathParameters);
    }
    /**
     * Instantiates a new {@link MarketplaceRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MarketplaceRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/shipping/marketplace", rawUrl);
    }
}

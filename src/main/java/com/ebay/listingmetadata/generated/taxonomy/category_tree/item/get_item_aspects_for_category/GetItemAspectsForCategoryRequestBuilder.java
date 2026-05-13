package com.ebay.listingmetadata.generated.taxonomy.category_tree.item.get_item_aspects_for_category;

import com.ebay.listingmetadata.generated.taxonomy.models.AspectMetadata;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
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
 * Builds and executes requests for operations under /category_tree/{category_tree_id}/get_item_aspects_for_category
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetItemAspectsForCategoryRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link GetItemAspectsForCategoryRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetItemAspectsForCategoryRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/category_tree/{category_tree_id}/get_item_aspects_for_category?category_id={category_id}", pathParameters);
    }
    /**
     * Instantiates a new {@link GetItemAspectsForCategoryRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetItemAspectsForCategoryRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/category_tree/{category_tree_id}/get_item_aspects_for_category?category_id={category_id}", rawUrl);
    }
    /**
     * This call returns a list of &lt;i&gt;aspects&lt;/i&gt; that are appropriate or necessary for accurately describing items in the specified leaf category. Each aspect identifies an item attribute (for example, color,) for which the seller will be required or encouraged to provide a value (or variation values) when offering an item in that category on eBay.&lt;br&gt;&lt;br&gt;For each aspect, &lt;b&gt;getItemAspectsForCategory&lt;/b&gt; provides complete metadata, including: &lt;ul&gt;&lt;li&gt;The aspect&apos;s data type, format, and entry mode&lt;/li&gt;&lt;li&gt;Whether the aspect is required in listings&lt;/li&gt;&lt;li&gt;Whether the aspect can be used for item variations&lt;/li&gt;&lt;li&gt;Whether the aspect accepts multiple values for an item&lt;/li&gt;&lt;li&gt;Allowed values for the aspect&lt;/li&gt;&lt;/ul&gt; Use this information to construct an interface through which sellers can enter or select the appropriate values for their items or item variations. Once you collect those values, include them as product aspects when creating inventory items using the Inventory API.
     * @return a {@link AspectMetadata}
     */
    @jakarta.annotation.Nullable
    public AspectMetadata get() {
        return get(null);
    }
    /**
     * This call returns a list of &lt;i&gt;aspects&lt;/i&gt; that are appropriate or necessary for accurately describing items in the specified leaf category. Each aspect identifies an item attribute (for example, color,) for which the seller will be required or encouraged to provide a value (or variation values) when offering an item in that category on eBay.&lt;br&gt;&lt;br&gt;For each aspect, &lt;b&gt;getItemAspectsForCategory&lt;/b&gt; provides complete metadata, including: &lt;ul&gt;&lt;li&gt;The aspect&apos;s data type, format, and entry mode&lt;/li&gt;&lt;li&gt;Whether the aspect is required in listings&lt;/li&gt;&lt;li&gt;Whether the aspect can be used for item variations&lt;/li&gt;&lt;li&gt;Whether the aspect accepts multiple values for an item&lt;/li&gt;&lt;li&gt;Allowed values for the aspect&lt;/li&gt;&lt;/ul&gt; Use this information to construct an interface through which sellers can enter or select the appropriate values for their items or item variations. Once you collect those values, include them as product aspects when creating inventory items using the Inventory API.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link AspectMetadata}
     */
    @jakarta.annotation.Nullable
    public AspectMetadata get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, AspectMetadata::createFromDiscriminatorValue);
    }
    /**
     * This call returns a list of &lt;i&gt;aspects&lt;/i&gt; that are appropriate or necessary for accurately describing items in the specified leaf category. Each aspect identifies an item attribute (for example, color,) for which the seller will be required or encouraged to provide a value (or variation values) when offering an item in that category on eBay.&lt;br&gt;&lt;br&gt;For each aspect, &lt;b&gt;getItemAspectsForCategory&lt;/b&gt; provides complete metadata, including: &lt;ul&gt;&lt;li&gt;The aspect&apos;s data type, format, and entry mode&lt;/li&gt;&lt;li&gt;Whether the aspect is required in listings&lt;/li&gt;&lt;li&gt;Whether the aspect can be used for item variations&lt;/li&gt;&lt;li&gt;Whether the aspect accepts multiple values for an item&lt;/li&gt;&lt;li&gt;Allowed values for the aspect&lt;/li&gt;&lt;/ul&gt; Use this information to construct an interface through which sellers can enter or select the appropriate values for their items or item variations. Once you collect those values, include them as product aspects when creating inventory items using the Inventory API.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This call returns a list of &lt;i&gt;aspects&lt;/i&gt; that are appropriate or necessary for accurately describing items in the specified leaf category. Each aspect identifies an item attribute (for example, color,) for which the seller will be required or encouraged to provide a value (or variation values) when offering an item in that category on eBay.&lt;br&gt;&lt;br&gt;For each aspect, &lt;b&gt;getItemAspectsForCategory&lt;/b&gt; provides complete metadata, including: &lt;ul&gt;&lt;li&gt;The aspect&apos;s data type, format, and entry mode&lt;/li&gt;&lt;li&gt;Whether the aspect is required in listings&lt;/li&gt;&lt;li&gt;Whether the aspect can be used for item variations&lt;/li&gt;&lt;li&gt;Whether the aspect accepts multiple values for an item&lt;/li&gt;&lt;li&gt;Allowed values for the aspect&lt;/li&gt;&lt;/ul&gt; Use this information to construct an interface through which sellers can enter or select the appropriate values for their items or item variations. Once you collect those values, include them as product aspects when creating inventory items using the Inventory API.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link GetItemAspectsForCategoryRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetItemAspectsForCategoryRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GetItemAspectsForCategoryRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * This call returns a list of &lt;i&gt;aspects&lt;/i&gt; that are appropriate or necessary for accurately describing items in the specified leaf category. Each aspect identifies an item attribute (for example, color,) for which the seller will be required or encouraged to provide a value (or variation values) when offering an item in that category on eBay.&lt;br&gt;&lt;br&gt;For each aspect, &lt;b&gt;getItemAspectsForCategory&lt;/b&gt; provides complete metadata, including: &lt;ul&gt;&lt;li&gt;The aspect&apos;s data type, format, and entry mode&lt;/li&gt;&lt;li&gt;Whether the aspect is required in listings&lt;/li&gt;&lt;li&gt;Whether the aspect can be used for item variations&lt;/li&gt;&lt;li&gt;Whether the aspect accepts multiple values for an item&lt;/li&gt;&lt;li&gt;Allowed values for the aspect&lt;/li&gt;&lt;/ul&gt; Use this information to construct an interface through which sellers can enter or select the appropriate values for their items or item variations. Once you collect those values, include them as product aspects when creating inventory items using the Inventory API.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * The unique identifier of the leaf category for which aspects are being requested.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; If the &lt;b&gt;category_id&lt;/b&gt; submitted does not identify a leaf node of the tree, this call returns an error. &lt;/span&gt;
         */
        @jakarta.annotation.Nullable
        public String categoryId;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("category_id", categoryId);
            return allQueryParams;
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
}

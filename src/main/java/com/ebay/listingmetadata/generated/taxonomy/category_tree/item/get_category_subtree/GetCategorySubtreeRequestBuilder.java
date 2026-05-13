package com.ebay.listingmetadata.generated.taxonomy.category_tree.item.get_category_subtree;

import com.ebay.listingmetadata.generated.taxonomy.models.CategorySubtree;
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
 * Builds and executes requests for operations under /category_tree/{category_tree_id}/get_category_subtree
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetCategorySubtreeRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link GetCategorySubtreeRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetCategorySubtreeRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/category_tree/{category_tree_id}/get_category_subtree?category_id={category_id}", pathParameters);
    }
    /**
     * Instantiates a new {@link GetCategorySubtreeRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetCategorySubtreeRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/category_tree/{category_tree_id}/get_category_subtree?category_id={category_id}", rawUrl);
    }
    /**
     * This call retrieves the details of all nodes of the category tree hierarchy (the subtree) below a specified category of a category tree. You identify the tree using the &lt;b&gt;category_tree_id&lt;/b&gt; parameter, which was returned by the &lt;b&gt;getDefaultCategoryTreeId&lt;/b&gt; call in the &lt;b&gt;categoryTreeId&lt;/b&gt; field.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; This method can return a very large payload, so gzip compression is supported. To enable gzip compression, include the &lt;code&gt;Accept-Encoding&lt;/code&gt; header and set its value to &lt;code&gt;gzip&lt;/code&gt; as shown below: &lt;br&gt;&lt;br&gt;&lt;code&gt;&amp;nbsp;&amp;nbsp;Accept-Encoding: gzip&lt;/code&gt;&lt;/span&gt;
     * @return a {@link CategorySubtree}
     */
    @jakarta.annotation.Nullable
    public CategorySubtree get() {
        return get(null);
    }
    /**
     * This call retrieves the details of all nodes of the category tree hierarchy (the subtree) below a specified category of a category tree. You identify the tree using the &lt;b&gt;category_tree_id&lt;/b&gt; parameter, which was returned by the &lt;b&gt;getDefaultCategoryTreeId&lt;/b&gt; call in the &lt;b&gt;categoryTreeId&lt;/b&gt; field.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; This method can return a very large payload, so gzip compression is supported. To enable gzip compression, include the &lt;code&gt;Accept-Encoding&lt;/code&gt; header and set its value to &lt;code&gt;gzip&lt;/code&gt; as shown below: &lt;br&gt;&lt;br&gt;&lt;code&gt;&amp;nbsp;&amp;nbsp;Accept-Encoding: gzip&lt;/code&gt;&lt;/span&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CategorySubtree}
     */
    @jakarta.annotation.Nullable
    public CategorySubtree get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, CategorySubtree::createFromDiscriminatorValue);
    }
    /**
     * This call retrieves the details of all nodes of the category tree hierarchy (the subtree) below a specified category of a category tree. You identify the tree using the &lt;b&gt;category_tree_id&lt;/b&gt; parameter, which was returned by the &lt;b&gt;getDefaultCategoryTreeId&lt;/b&gt; call in the &lt;b&gt;categoryTreeId&lt;/b&gt; field.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; This method can return a very large payload, so gzip compression is supported. To enable gzip compression, include the &lt;code&gt;Accept-Encoding&lt;/code&gt; header and set its value to &lt;code&gt;gzip&lt;/code&gt; as shown below: &lt;br&gt;&lt;br&gt;&lt;code&gt;&amp;nbsp;&amp;nbsp;Accept-Encoding: gzip&lt;/code&gt;&lt;/span&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This call retrieves the details of all nodes of the category tree hierarchy (the subtree) below a specified category of a category tree. You identify the tree using the &lt;b&gt;category_tree_id&lt;/b&gt; parameter, which was returned by the &lt;b&gt;getDefaultCategoryTreeId&lt;/b&gt; call in the &lt;b&gt;categoryTreeId&lt;/b&gt; field.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; This method can return a very large payload, so gzip compression is supported. To enable gzip compression, include the &lt;code&gt;Accept-Encoding&lt;/code&gt; header and set its value to &lt;code&gt;gzip&lt;/code&gt; as shown below: &lt;br&gt;&lt;br&gt;&lt;code&gt;&amp;nbsp;&amp;nbsp;Accept-Encoding: gzip&lt;/code&gt;&lt;/span&gt;
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
     * @return a {@link GetCategorySubtreeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetCategorySubtreeRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GetCategorySubtreeRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * This call retrieves the details of all nodes of the category tree hierarchy (the subtree) below a specified category of a category tree. You identify the tree using the &lt;b&gt;category_tree_id&lt;/b&gt; parameter, which was returned by the &lt;b&gt;getDefaultCategoryTreeId&lt;/b&gt; call in the &lt;b&gt;categoryTreeId&lt;/b&gt; field.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; This method can return a very large payload, so gzip compression is supported. To enable gzip compression, include the &lt;code&gt;Accept-Encoding&lt;/code&gt; header and set its value to &lt;code&gt;gzip&lt;/code&gt; as shown below: &lt;br&gt;&lt;br&gt;&lt;code&gt;&amp;nbsp;&amp;nbsp;Accept-Encoding: gzip&lt;/code&gt;&lt;/span&gt;
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * The unique identifier of the category at the top of the subtree being requested. Metadata on this category and all its descendant categories are retrieved.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; If the &lt;b&gt;category_id&lt;/b&gt; submitted identifies a leaf node of the tree, the call response will contain information about only that leaf node, which is a valid subtree.&lt;!-- &lt;br&gt;&lt;br&gt; This call also returns an error if &lt;b&gt;category_id&lt;/b&gt; identifies a deprecated category. This can occur if you routinely cache your category trees. Use the &lt;b&gt;Get Deprecated Categories and Mapping&lt;/b&gt; call to determine which current category should be used in place of the deprecated category, and use the &lt;b&gt;getCategoryTree&lt;/b&gt; call to update your cached copy of the tree. --&gt; &lt;/span&gt;
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

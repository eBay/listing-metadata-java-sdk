package com.ebay.listingmetadata.generated.taxonomy.category_tree;

import com.ebay.listingmetadata.generated.taxonomy.category_tree.item.WithCategoryTreeItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /category_tree
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CategoryTreeRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.ebay.listingmetadata.generated.taxonomy.category_tree.item collection
     * @param category_tree_id The unique identifier of the eBay category tree. The category tree ID for an eBay marketplace can be retrieved using the &lt;b&gt;getDefaultCategoryTreeId&lt;/b&gt; method.
     * @return a {@link WithCategoryTreeItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithCategoryTreeItemRequestBuilder byCategory_tree_id(@jakarta.annotation.Nonnull final String category_tree_id) {
        Objects.requireNonNull(category_tree_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("category_tree_id", category_tree_id);
        return new WithCategoryTreeItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link CategoryTreeRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CategoryTreeRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/category_tree", pathParameters);
    }
    /**
     * Instantiates a new {@link CategoryTreeRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CategoryTreeRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/category_tree", rawUrl);
    }
}

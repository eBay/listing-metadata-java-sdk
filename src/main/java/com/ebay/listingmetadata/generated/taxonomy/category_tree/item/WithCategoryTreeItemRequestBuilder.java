package com.ebay.listingmetadata.generated.taxonomy.category_tree.item;

import com.ebay.listingmetadata.generated.taxonomy.category_tree.item.fetch_item_aspects.FetchItemAspectsRequestBuilder;
import com.ebay.listingmetadata.generated.taxonomy.category_tree.item.get_category_subtree.GetCategorySubtreeRequestBuilder;
import com.ebay.listingmetadata.generated.taxonomy.category_tree.item.get_category_suggestions.GetCategorySuggestionsRequestBuilder;
import com.ebay.listingmetadata.generated.taxonomy.category_tree.item.get_compatibility_properties.GetCompatibilityPropertiesRequestBuilder;
import com.ebay.listingmetadata.generated.taxonomy.category_tree.item.get_compatibility_property_values.GetCompatibilityPropertyValuesRequestBuilder;
import com.ebay.listingmetadata.generated.taxonomy.category_tree.item.get_expired_categories.GetExpiredCategoriesRequestBuilder;
import com.ebay.listingmetadata.generated.taxonomy.category_tree.item.get_item_aspects_for_category.GetItemAspectsForCategoryRequestBuilder;
import com.ebay.listingmetadata.generated.taxonomy.models.CategoryTree;
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
 * Builds and executes requests for operations under /category_tree/{category_tree_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithCategoryTreeItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The fetch_item_aspects property
     * @return a {@link FetchItemAspectsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FetchItemAspectsRequestBuilder fetchItemAspects() {
        return new FetchItemAspectsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The get_category_subtree property
     * @return a {@link GetCategorySubtreeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetCategorySubtreeRequestBuilder getCategorySubtree() {
        return new GetCategorySubtreeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The get_category_suggestions property
     * @return a {@link GetCategorySuggestionsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetCategorySuggestionsRequestBuilder getCategorySuggestions() {
        return new GetCategorySuggestionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The get_compatibility_properties property
     * @return a {@link GetCompatibilityPropertiesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetCompatibilityPropertiesRequestBuilder getCompatibilityProperties() {
        return new GetCompatibilityPropertiesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The get_compatibility_property_values property
     * @return a {@link GetCompatibilityPropertyValuesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetCompatibilityPropertyValuesRequestBuilder getCompatibilityPropertyValues() {
        return new GetCompatibilityPropertyValuesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The get_expired_categories property
     * @return a {@link GetExpiredCategoriesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetExpiredCategoriesRequestBuilder getExpiredCategories() {
        return new GetExpiredCategoriesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The get_item_aspects_for_category property
     * @return a {@link GetItemAspectsForCategoryRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetItemAspectsForCategoryRequestBuilder getItemAspectsForCategory() {
        return new GetItemAspectsForCategoryRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithCategoryTreeItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithCategoryTreeItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/category_tree/{category_tree_id}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithCategoryTreeItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithCategoryTreeItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/category_tree/{category_tree_id}", rawUrl);
    }
    /**
     * This method retrieves the complete category tree that is identified by the &lt;b&gt;category_tree_id&lt;/b&gt; parameter. The value of &lt;b&gt;category_tree_id&lt;/b&gt; was returned by the &lt;b&gt;getDefaultCategoryTreeId&lt;/b&gt; method in the &lt;b&gt;categoryTreeId&lt;/b&gt; field. The response contains details of all nodes of the specified eBay category tree, as well as the eBay marketplaces that use this category tree.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; This method can return a very large payload, so gzip compression is supported. To enable gzip compression, include the &lt;code&gt;Accept-Encoding&lt;/code&gt; header and set its value to &lt;code&gt;gzip&lt;/code&gt; as shown below: &lt;br&gt;&lt;br&gt;&lt;code&gt;&amp;nbsp;&amp;nbsp;Accept-Encoding: gzip&lt;/code&gt;&lt;/span&gt;
     * @return a {@link CategoryTree}
     */
    @jakarta.annotation.Nullable
    public CategoryTree get() {
        return get(null);
    }
    /**
     * This method retrieves the complete category tree that is identified by the &lt;b&gt;category_tree_id&lt;/b&gt; parameter. The value of &lt;b&gt;category_tree_id&lt;/b&gt; was returned by the &lt;b&gt;getDefaultCategoryTreeId&lt;/b&gt; method in the &lt;b&gt;categoryTreeId&lt;/b&gt; field. The response contains details of all nodes of the specified eBay category tree, as well as the eBay marketplaces that use this category tree.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; This method can return a very large payload, so gzip compression is supported. To enable gzip compression, include the &lt;code&gt;Accept-Encoding&lt;/code&gt; header and set its value to &lt;code&gt;gzip&lt;/code&gt; as shown below: &lt;br&gt;&lt;br&gt;&lt;code&gt;&amp;nbsp;&amp;nbsp;Accept-Encoding: gzip&lt;/code&gt;&lt;/span&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CategoryTree}
     */
    @jakarta.annotation.Nullable
    public CategoryTree get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, CategoryTree::createFromDiscriminatorValue);
    }
    /**
     * This method retrieves the complete category tree that is identified by the &lt;b&gt;category_tree_id&lt;/b&gt; parameter. The value of &lt;b&gt;category_tree_id&lt;/b&gt; was returned by the &lt;b&gt;getDefaultCategoryTreeId&lt;/b&gt; method in the &lt;b&gt;categoryTreeId&lt;/b&gt; field. The response contains details of all nodes of the specified eBay category tree, as well as the eBay marketplaces that use this category tree.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; This method can return a very large payload, so gzip compression is supported. To enable gzip compression, include the &lt;code&gt;Accept-Encoding&lt;/code&gt; header and set its value to &lt;code&gt;gzip&lt;/code&gt; as shown below: &lt;br&gt;&lt;br&gt;&lt;code&gt;&amp;nbsp;&amp;nbsp;Accept-Encoding: gzip&lt;/code&gt;&lt;/span&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method retrieves the complete category tree that is identified by the &lt;b&gt;category_tree_id&lt;/b&gt; parameter. The value of &lt;b&gt;category_tree_id&lt;/b&gt; was returned by the &lt;b&gt;getDefaultCategoryTreeId&lt;/b&gt; method in the &lt;b&gt;categoryTreeId&lt;/b&gt; field. The response contains details of all nodes of the specified eBay category tree, as well as the eBay marketplaces that use this category tree.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; This method can return a very large payload, so gzip compression is supported. To enable gzip compression, include the &lt;code&gt;Accept-Encoding&lt;/code&gt; header and set its value to &lt;code&gt;gzip&lt;/code&gt; as shown below: &lt;br&gt;&lt;br&gt;&lt;code&gt;&amp;nbsp;&amp;nbsp;Accept-Encoding: gzip&lt;/code&gt;&lt;/span&gt;
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
     * @return a {@link WithCategoryTreeItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithCategoryTreeItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithCategoryTreeItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}

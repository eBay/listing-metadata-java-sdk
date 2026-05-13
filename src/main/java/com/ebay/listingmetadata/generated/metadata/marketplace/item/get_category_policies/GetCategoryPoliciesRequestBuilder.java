package com.ebay.listingmetadata.generated.metadata.marketplace.item.get_category_policies;

import com.ebay.listingmetadata.generated.metadata.models.CategoryPolicyResponse;
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
 * Builds and executes requests for operations under /marketplace/{marketplace_id}/get_category_policies
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetCategoryPoliciesRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link GetCategoryPoliciesRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetCategoryPoliciesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/marketplace/{marketplace_id}/get_category_policies{?filter*}", pathParameters);
    }
    /**
     * Instantiates a new {@link GetCategoryPoliciesRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetCategoryPoliciesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/marketplace/{marketplace_id}/get_category_policies{?filter*}", rawUrl);
    }
    /**
     * This method returns eBay category policy metadata for all leaf categories on the specified marketplace.&lt;p&gt;By default, this method returns metadata on all leaf categories. You can limit the size of the result set by using the &lt;b&gt;filter&lt;/b&gt; query parameter to specify only the leaf category IDs you want to review.&lt;/p&gt;&lt;p&gt;If you specify a valid marketplace ID but that marketplace does not contain policy information, or if you filter out all results, a successful call returns a &lt;b&gt;204 No content&lt;/b&gt; status code with an empty response body.&lt;/p&gt;
     * @return a {@link CategoryPolicyResponse}
     */
    @jakarta.annotation.Nullable
    public CategoryPolicyResponse get() {
        return get(null);
    }
    /**
     * This method returns eBay category policy metadata for all leaf categories on the specified marketplace.&lt;p&gt;By default, this method returns metadata on all leaf categories. You can limit the size of the result set by using the &lt;b&gt;filter&lt;/b&gt; query parameter to specify only the leaf category IDs you want to review.&lt;/p&gt;&lt;p&gt;If you specify a valid marketplace ID but that marketplace does not contain policy information, or if you filter out all results, a successful call returns a &lt;b&gt;204 No content&lt;/b&gt; status code with an empty response body.&lt;/p&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CategoryPolicyResponse}
     */
    @jakarta.annotation.Nullable
    public CategoryPolicyResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, CategoryPolicyResponse::createFromDiscriminatorValue);
    }
    /**
     * This method returns eBay category policy metadata for all leaf categories on the specified marketplace.&lt;p&gt;By default, this method returns metadata on all leaf categories. You can limit the size of the result set by using the &lt;b&gt;filter&lt;/b&gt; query parameter to specify only the leaf category IDs you want to review.&lt;/p&gt;&lt;p&gt;If you specify a valid marketplace ID but that marketplace does not contain policy information, or if you filter out all results, a successful call returns a &lt;b&gt;204 No content&lt;/b&gt; status code with an empty response body.&lt;/p&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method returns eBay category policy metadata for all leaf categories on the specified marketplace.&lt;p&gt;By default, this method returns metadata on all leaf categories. You can limit the size of the result set by using the &lt;b&gt;filter&lt;/b&gt; query parameter to specify only the leaf category IDs you want to review.&lt;/p&gt;&lt;p&gt;If you specify a valid marketplace ID but that marketplace does not contain policy information, or if you filter out all results, a successful call returns a &lt;b&gt;204 No content&lt;/b&gt; status code with an empty response body.&lt;/p&gt;
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
     * @return a {@link GetCategoryPoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetCategoryPoliciesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GetCategoryPoliciesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * This method returns eBay category policy metadata for all leaf categories on the specified marketplace.&lt;p&gt;By default, this method returns metadata on all leaf categories. You can limit the size of the result set by using the &lt;b&gt;filter&lt;/b&gt; query parameter to specify only the leaf category IDs you want to review.&lt;/p&gt;&lt;p&gt;If you specify a valid marketplace ID but that marketplace does not contain policy information, or if you filter out all results, a successful call returns a &lt;b&gt;204 No content&lt;/b&gt; status code with an empty response body.&lt;/p&gt;
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * This query parameter limits the response by only returning metadata for the specified leaf categories. Supply the &lt;b&gt;categoryId&lt;/b&gt; for one or more leaf categories. You can verify if a category is a leaf category by using the &lt;a href=&quot;/api-docs/commerce/taxonomy/overview.html&quot; target=&quot;_blank &quot;&gt;Taxonomy API&lt;/a&gt; and looking for a &lt;code&gt;&quot;leafCategory&quot;: true&lt;/code&gt; tag.  &lt;br&gt;&lt;br&gt;The parameter takes a list of &lt;b&gt;categoryId&lt;/b&gt; values and you can specify up to 50 separate category IDs. Separate multiple values with a pipe character (&apos;|&apos;). If you specify more than 50 &lt;code&gt;categoryId&lt;/code&gt; values, eBay returns the policies for the first 50 IDs and a warning that not all categories were returned.&lt;br&gt;&lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;filter=categoryIds:{3767|171784}&lt;/code&gt;
         */
        @jakarta.annotation.Nullable
        public String filter;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("filter", filter);
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

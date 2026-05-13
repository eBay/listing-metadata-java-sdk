package com.ebay.listingmetadata.generated.charity.charity_org;

import com.ebay.listingmetadata.generated.charity.charity_org.item.WithCharityOrgItemRequestBuilder;
import com.ebay.listingmetadata.generated.charity.models.CharitySearchResponse;
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
 * Builds and executes requests for operations under /charity_org
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CharityOrgRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.ebay.listingmetadata.generated.charity.charity_org.item collection
     * @param charity_org_id The unique ID of the charitable organization.
     * @return a {@link WithCharityOrgItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithCharityOrgItemRequestBuilder byCharity_org_id(@jakarta.annotation.Nonnull final String charity_org_id) {
        Objects.requireNonNull(charity_org_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("charity_org_id", charity_org_id);
        return new WithCharityOrgItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link CharityOrgRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CharityOrgRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/charity_org{?limit*,offset*,q*,registration_ids*}", pathParameters);
    }
    /**
     * Instantiates a new {@link CharityOrgRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CharityOrgRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/charity_org{?limit*,offset*,q*,registration_ids*}", rawUrl);
    }
    /**
     * This call is used to search for supported charitable organizations. It allows users to search for a specific charitable organization, or for multiple charitable organizations, from a particular charitable domain and/or geographical region, or by using search criteria.&lt;br /&gt;&lt;br /&gt;The call returns paginated search results containing the charitable organizations that match the specified criteria.
     * @return a {@link CharitySearchResponse}
     */
    @jakarta.annotation.Nullable
    public CharitySearchResponse get() {
        return get(null);
    }
    /**
     * This call is used to search for supported charitable organizations. It allows users to search for a specific charitable organization, or for multiple charitable organizations, from a particular charitable domain and/or geographical region, or by using search criteria.&lt;br /&gt;&lt;br /&gt;The call returns paginated search results containing the charitable organizations that match the specified criteria.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CharitySearchResponse}
     */
    @jakarta.annotation.Nullable
    public CharitySearchResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, CharitySearchResponse::createFromDiscriminatorValue);
    }
    /**
     * This call is used to search for supported charitable organizations. It allows users to search for a specific charitable organization, or for multiple charitable organizations, from a particular charitable domain and/or geographical region, or by using search criteria.&lt;br /&gt;&lt;br /&gt;The call returns paginated search results containing the charitable organizations that match the specified criteria.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This call is used to search for supported charitable organizations. It allows users to search for a specific charitable organization, or for multiple charitable organizations, from a particular charitable domain and/or geographical region, or by using search criteria.&lt;br /&gt;&lt;br /&gt;The call returns paginated search results containing the charitable organizations that match the specified criteria.
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
     * @return a {@link CharityOrgRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CharityOrgRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new CharityOrgRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * This call is used to search for supported charitable organizations. It allows users to search for a specific charitable organization, or for multiple charitable organizations, from a particular charitable domain and/or geographical region, or by using search criteria.&lt;br /&gt;&lt;br /&gt;The call returns paginated search results containing the charitable organizations that match the specified criteria.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * The number of items, from the result set, returned in a single page.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Valid Values:&lt;/b&gt; &lt;code&gt;1-100&lt;/code&gt;&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Default:&lt;/b&gt; &lt;code&gt;20&lt;/code&gt;
         */
        @jakarta.annotation.Nullable
        public String limit;
        /**
         * The number of items that will be skipped in the result set. This is used with the &lt;b&gt;limit&lt;/b&gt; field to control the pagination of the output.&lt;br /&gt;&lt;br /&gt;For example, if the &lt;b&gt;offset&lt;/b&gt; is set to &lt;code&gt;0&lt;/code&gt; and the &lt;b&gt;limit&lt;/b&gt; is set to &lt;code&gt;10&lt;/code&gt;, the method will retrieve items 1 through 10 from the list of items returned. If the &lt;b&gt;offset&lt;/b&gt; is set to &lt;code&gt;10&lt;/code&gt; and the &lt;b&gt;limit&lt;/b&gt; is set to &lt;code&gt;10&lt;/code&gt;, the method will retrieve items 11 through 20 from the list of items returned.&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Valid Values:&lt;/b&gt; &lt;code&gt;0-10,000&lt;/code&gt;&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Default:&lt;/b&gt; &lt;code&gt;0&lt;/code&gt;
         */
        @jakarta.annotation.Nullable
        public String offset;
        /**
         * A query string that matches the keywords in name, mission statement, or description.
         */
        @jakarta.annotation.Nullable
        public String q;
        /**
         * A comma-separated list of charitable organization registration IDs.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note: &lt;/b&gt;Do not specify this parameter for query-based searches. Specify either the &lt;b&gt;q&lt;/b&gt; or &lt;b&gt;registration_ids&lt;/b&gt; parameter, but not both.&lt;/span&gt;&lt;br /&gt;&lt;br /&gt;&lt;b&gt;Maximum Limit:&lt;/b&gt; &lt;code&gt;20&lt;/code&gt;
         */
        @jakarta.annotation.Nullable
        public String registrationIds;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("limit", limit);
            allQueryParams.put("offset", offset);
            allQueryParams.put("q", q);
            allQueryParams.put("registration_ids", registrationIds);
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

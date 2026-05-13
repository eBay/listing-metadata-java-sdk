package com.ebay.listingmetadata.generated.metadata.compatibilities.get_product_compatibilities;

import com.ebay.listingmetadata.generated.metadata.models.ProductRequest;
import com.ebay.listingmetadata.generated.metadata.models.ProductResponse;
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
 * Builds and executes requests for operations under /compatibilities/get_product_compatibilities
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetProductCompatibilitiesRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link GetProductCompatibilitiesRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetProductCompatibilitiesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/compatibilities/get_product_compatibilities", pathParameters);
    }
    /**
     * Instantiates a new {@link GetProductCompatibilitiesRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetProductCompatibilitiesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/compatibilities/get_product_compatibilities", rawUrl);
    }
    /**
     * This method is used to retrieve all available item compatibility details for the specified product.&lt;br&gt;&lt;br&gt;Item compatibility details can be used to see the properties for which an item is compatible. For example, if you are searching for a part for a specific vehicle, you can use this method to see the years, engine, and/or trim for which the part is compatible. Item compatibility details are returned as name-value pairs.&lt;br&gt;&lt;br&gt;The product for which to retrieve item compatibility details must be provided through the &lt;b&gt;productIdentifier&lt;/b&gt; field. This value can be either an eBay specific identifier (such as an ePID) or an external identifier (such as a UPC).&lt;br&gt;&lt;br&gt;By default, all available item compatibility details for the specified product are returned. You can limit the size of the result set using the &lt;b&gt;dataset&lt;/b&gt; or &lt;b&gt;datasetPropertyName&lt;/b&gt; fields to specify the types of properties you want returned in the response. The &lt;b&gt;applicationPropertyFilter&lt;/b&gt; array can also be used so that only parts compatible with the specified name-value pairs are returned.
     * @param body This type defines the request fields for the &lt;b&gt;getProductCompatibilities&lt;/b&gt; method.
     * @return a {@link ProductResponse}
     */
    @jakarta.annotation.Nullable
    public ProductResponse post(@jakarta.annotation.Nonnull final ProductRequest body) {
        return post(body, null);
    }
    /**
     * This method is used to retrieve all available item compatibility details for the specified product.&lt;br&gt;&lt;br&gt;Item compatibility details can be used to see the properties for which an item is compatible. For example, if you are searching for a part for a specific vehicle, you can use this method to see the years, engine, and/or trim for which the part is compatible. Item compatibility details are returned as name-value pairs.&lt;br&gt;&lt;br&gt;The product for which to retrieve item compatibility details must be provided through the &lt;b&gt;productIdentifier&lt;/b&gt; field. This value can be either an eBay specific identifier (such as an ePID) or an external identifier (such as a UPC).&lt;br&gt;&lt;br&gt;By default, all available item compatibility details for the specified product are returned. You can limit the size of the result set using the &lt;b&gt;dataset&lt;/b&gt; or &lt;b&gt;datasetPropertyName&lt;/b&gt; fields to specify the types of properties you want returned in the response. The &lt;b&gt;applicationPropertyFilter&lt;/b&gt; array can also be used so that only parts compatible with the specified name-value pairs are returned.
     * @param body This type defines the request fields for the &lt;b&gt;getProductCompatibilities&lt;/b&gt; method.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ProductResponse}
     */
    @jakarta.annotation.Nullable
    public ProductResponse post(@jakarta.annotation.Nonnull final ProductRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ProductResponse::createFromDiscriminatorValue);
    }
    /**
     * This method is used to retrieve all available item compatibility details for the specified product.&lt;br&gt;&lt;br&gt;Item compatibility details can be used to see the properties for which an item is compatible. For example, if you are searching for a part for a specific vehicle, you can use this method to see the years, engine, and/or trim for which the part is compatible. Item compatibility details are returned as name-value pairs.&lt;br&gt;&lt;br&gt;The product for which to retrieve item compatibility details must be provided through the &lt;b&gt;productIdentifier&lt;/b&gt; field. This value can be either an eBay specific identifier (such as an ePID) or an external identifier (such as a UPC).&lt;br&gt;&lt;br&gt;By default, all available item compatibility details for the specified product are returned. You can limit the size of the result set using the &lt;b&gt;dataset&lt;/b&gt; or &lt;b&gt;datasetPropertyName&lt;/b&gt; fields to specify the types of properties you want returned in the response. The &lt;b&gt;applicationPropertyFilter&lt;/b&gt; array can also be used so that only parts compatible with the specified name-value pairs are returned.
     * @param body This type defines the request fields for the &lt;b&gt;getProductCompatibilities&lt;/b&gt; method.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ProductRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method is used to retrieve all available item compatibility details for the specified product.&lt;br&gt;&lt;br&gt;Item compatibility details can be used to see the properties for which an item is compatible. For example, if you are searching for a part for a specific vehicle, you can use this method to see the years, engine, and/or trim for which the part is compatible. Item compatibility details are returned as name-value pairs.&lt;br&gt;&lt;br&gt;The product for which to retrieve item compatibility details must be provided through the &lt;b&gt;productIdentifier&lt;/b&gt; field. This value can be either an eBay specific identifier (such as an ePID) or an external identifier (such as a UPC).&lt;br&gt;&lt;br&gt;By default, all available item compatibility details for the specified product are returned. You can limit the size of the result set using the &lt;b&gt;dataset&lt;/b&gt; or &lt;b&gt;datasetPropertyName&lt;/b&gt; fields to specify the types of properties you want returned in the response. The &lt;b&gt;applicationPropertyFilter&lt;/b&gt; array can also be used so that only parts compatible with the specified name-value pairs are returned.
     * @param body This type defines the request fields for the &lt;b&gt;getProductCompatibilities&lt;/b&gt; method.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ProductRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link GetProductCompatibilitiesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetProductCompatibilitiesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GetProductCompatibilitiesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}

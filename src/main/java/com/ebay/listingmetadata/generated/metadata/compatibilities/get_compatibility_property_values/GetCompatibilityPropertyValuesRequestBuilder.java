package com.ebay.listingmetadata.generated.metadata.compatibilities.get_compatibility_property_values;

import com.ebay.listingmetadata.generated.metadata.models.PropertyValuesRequest;
import com.ebay.listingmetadata.generated.metadata.models.PropertyValuesResponse;
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
 * Builds and executes requests for operations under /compatibilities/get_compatibility_property_values
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetCompatibilityPropertyValuesRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link GetCompatibilityPropertyValuesRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetCompatibilityPropertyValuesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/compatibilities/get_compatibility_property_values", pathParameters);
    }
    /**
     * Instantiates a new {@link GetCompatibilityPropertyValuesRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetCompatibilityPropertyValuesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/compatibilities/get_compatibility_property_values", rawUrl);
    }
    /**
     * This method is used to retrieve product compatibility property values associated with a single property name, in the specified category.&lt;br&gt;&lt;br&gt;Compatibility property values can be used alongside the corresponding compatibility property name (retrieved using the &lt;a href=&quot;/api-docs/sell/metadata/resources/compatibilities/methods/getCompatibilityPropertyNames&quot; target=&quot;_blank &quot;&gt;getCompatibilityPropertyNames&lt;/a&gt; method) to describe the assembly for which an item is compatible.&lt;br&gt;&lt;br&gt;The &lt;b&gt;categoryId&lt;/b&gt; of the compatibility-enabled category for which to retrieve compatibility property values is required in the request body, as well as the &lt;b&gt;propertyName&lt;/b&gt; for which you wish to retrieve associated values.&lt;br&gt;&lt;br&gt;By default, all property values associated with the specified &lt;b&gt;propertyName&lt;/b&gt; are returned. You can limit the size of the result set by using the &lt;b&gt;propertyFilter&lt;/b&gt; array. Only property values associated with the specified name-value pairs will be returned.
     * @param body This type defines the request fields used in the &lt;b&gt;getCompatibilityPropertyValues&lt;/b&gt; method.
     * @return a {@link PropertyValuesResponse}
     */
    @jakarta.annotation.Nullable
    public PropertyValuesResponse post(@jakarta.annotation.Nonnull final PropertyValuesRequest body) {
        return post(body, null);
    }
    /**
     * This method is used to retrieve product compatibility property values associated with a single property name, in the specified category.&lt;br&gt;&lt;br&gt;Compatibility property values can be used alongside the corresponding compatibility property name (retrieved using the &lt;a href=&quot;/api-docs/sell/metadata/resources/compatibilities/methods/getCompatibilityPropertyNames&quot; target=&quot;_blank &quot;&gt;getCompatibilityPropertyNames&lt;/a&gt; method) to describe the assembly for which an item is compatible.&lt;br&gt;&lt;br&gt;The &lt;b&gt;categoryId&lt;/b&gt; of the compatibility-enabled category for which to retrieve compatibility property values is required in the request body, as well as the &lt;b&gt;propertyName&lt;/b&gt; for which you wish to retrieve associated values.&lt;br&gt;&lt;br&gt;By default, all property values associated with the specified &lt;b&gt;propertyName&lt;/b&gt; are returned. You can limit the size of the result set by using the &lt;b&gt;propertyFilter&lt;/b&gt; array. Only property values associated with the specified name-value pairs will be returned.
     * @param body This type defines the request fields used in the &lt;b&gt;getCompatibilityPropertyValues&lt;/b&gt; method.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link PropertyValuesResponse}
     */
    @jakarta.annotation.Nullable
    public PropertyValuesResponse post(@jakarta.annotation.Nonnull final PropertyValuesRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, PropertyValuesResponse::createFromDiscriminatorValue);
    }
    /**
     * This method is used to retrieve product compatibility property values associated with a single property name, in the specified category.&lt;br&gt;&lt;br&gt;Compatibility property values can be used alongside the corresponding compatibility property name (retrieved using the &lt;a href=&quot;/api-docs/sell/metadata/resources/compatibilities/methods/getCompatibilityPropertyNames&quot; target=&quot;_blank &quot;&gt;getCompatibilityPropertyNames&lt;/a&gt; method) to describe the assembly for which an item is compatible.&lt;br&gt;&lt;br&gt;The &lt;b&gt;categoryId&lt;/b&gt; of the compatibility-enabled category for which to retrieve compatibility property values is required in the request body, as well as the &lt;b&gt;propertyName&lt;/b&gt; for which you wish to retrieve associated values.&lt;br&gt;&lt;br&gt;By default, all property values associated with the specified &lt;b&gt;propertyName&lt;/b&gt; are returned. You can limit the size of the result set by using the &lt;b&gt;propertyFilter&lt;/b&gt; array. Only property values associated with the specified name-value pairs will be returned.
     * @param body This type defines the request fields used in the &lt;b&gt;getCompatibilityPropertyValues&lt;/b&gt; method.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final PropertyValuesRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method is used to retrieve product compatibility property values associated with a single property name, in the specified category.&lt;br&gt;&lt;br&gt;Compatibility property values can be used alongside the corresponding compatibility property name (retrieved using the &lt;a href=&quot;/api-docs/sell/metadata/resources/compatibilities/methods/getCompatibilityPropertyNames&quot; target=&quot;_blank &quot;&gt;getCompatibilityPropertyNames&lt;/a&gt; method) to describe the assembly for which an item is compatible.&lt;br&gt;&lt;br&gt;The &lt;b&gt;categoryId&lt;/b&gt; of the compatibility-enabled category for which to retrieve compatibility property values is required in the request body, as well as the &lt;b&gt;propertyName&lt;/b&gt; for which you wish to retrieve associated values.&lt;br&gt;&lt;br&gt;By default, all property values associated with the specified &lt;b&gt;propertyName&lt;/b&gt; are returned. You can limit the size of the result set by using the &lt;b&gt;propertyFilter&lt;/b&gt; array. Only property values associated with the specified name-value pairs will be returned.
     * @param body This type defines the request fields used in the &lt;b&gt;getCompatibilityPropertyValues&lt;/b&gt; method.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final PropertyValuesRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link GetCompatibilityPropertyValuesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetCompatibilityPropertyValuesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GetCompatibilityPropertyValuesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}

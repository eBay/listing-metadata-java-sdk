// Copyright 2026 eBay Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.ebay.listingmetadata.generated.metadata.compatibilities.get_compatibility_property_names;

import com.ebay.listingmetadata.generated.metadata.models.PropertyNamesRequest;
import com.ebay.listingmetadata.generated.metadata.models.PropertyNamesResponse;
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
 * Builds and executes requests for operations under /compatibilities/get_compatibility_property_names
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetCompatibilityPropertyNamesRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link GetCompatibilityPropertyNamesRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetCompatibilityPropertyNamesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/compatibilities/get_compatibility_property_names", pathParameters);
    }
    /**
     * Instantiates a new {@link GetCompatibilityPropertyNamesRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetCompatibilityPropertyNamesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/compatibilities/get_compatibility_property_names", rawUrl);
    }
    /**
     * This method is used to retrieve product compatibility property names for the specified compatibility-enabled category.&lt;br&gt;&lt;br&gt;Compatibility property names can be used alongside the corresponding compatibility property value (retrieved using the &lt;a href=&quot;/api-docs/sell/metadata/resources/compatibilities/methods/getCompatibilityPropertyValues&quot; target=&quot;_blank &quot;&gt;getCompatibilityPropertyValues&lt;/a&gt; method) to describe the assembly for which an item is compatible.&lt;br&gt;&lt;br&gt;The &lt;b&gt;categoryId&lt;/b&gt; of the compatibility-enabled category for which to retrieve compatibility property names is required in the request body.&lt;br&gt;&lt;br&gt;By default, all property names within the compatibility category of the specified compatibility-enable category are returned. You can limit the size of the result set by using the &lt;b&gt;dataset&lt;/b&gt; array to specify the types of properties you want returned.
     * @param body This type defines the request fields for the &lt;b&gt;getCompatibilityPropertyNames&lt;/b&gt; method.
     * @return a {@link PropertyNamesResponse}
     */
    @jakarta.annotation.Nullable
    public PropertyNamesResponse post(@jakarta.annotation.Nonnull final PropertyNamesRequest body) {
        return post(body, null);
    }
    /**
     * This method is used to retrieve product compatibility property names for the specified compatibility-enabled category.&lt;br&gt;&lt;br&gt;Compatibility property names can be used alongside the corresponding compatibility property value (retrieved using the &lt;a href=&quot;/api-docs/sell/metadata/resources/compatibilities/methods/getCompatibilityPropertyValues&quot; target=&quot;_blank &quot;&gt;getCompatibilityPropertyValues&lt;/a&gt; method) to describe the assembly for which an item is compatible.&lt;br&gt;&lt;br&gt;The &lt;b&gt;categoryId&lt;/b&gt; of the compatibility-enabled category for which to retrieve compatibility property names is required in the request body.&lt;br&gt;&lt;br&gt;By default, all property names within the compatibility category of the specified compatibility-enable category are returned. You can limit the size of the result set by using the &lt;b&gt;dataset&lt;/b&gt; array to specify the types of properties you want returned.
     * @param body This type defines the request fields for the &lt;b&gt;getCompatibilityPropertyNames&lt;/b&gt; method.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link PropertyNamesResponse}
     */
    @jakarta.annotation.Nullable
    public PropertyNamesResponse post(@jakarta.annotation.Nonnull final PropertyNamesRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, PropertyNamesResponse::createFromDiscriminatorValue);
    }
    /**
     * This method is used to retrieve product compatibility property names for the specified compatibility-enabled category.&lt;br&gt;&lt;br&gt;Compatibility property names can be used alongside the corresponding compatibility property value (retrieved using the &lt;a href=&quot;/api-docs/sell/metadata/resources/compatibilities/methods/getCompatibilityPropertyValues&quot; target=&quot;_blank &quot;&gt;getCompatibilityPropertyValues&lt;/a&gt; method) to describe the assembly for which an item is compatible.&lt;br&gt;&lt;br&gt;The &lt;b&gt;categoryId&lt;/b&gt; of the compatibility-enabled category for which to retrieve compatibility property names is required in the request body.&lt;br&gt;&lt;br&gt;By default, all property names within the compatibility category of the specified compatibility-enable category are returned. You can limit the size of the result set by using the &lt;b&gt;dataset&lt;/b&gt; array to specify the types of properties you want returned.
     * @param body This type defines the request fields for the &lt;b&gt;getCompatibilityPropertyNames&lt;/b&gt; method.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final PropertyNamesRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method is used to retrieve product compatibility property names for the specified compatibility-enabled category.&lt;br&gt;&lt;br&gt;Compatibility property names can be used alongside the corresponding compatibility property value (retrieved using the &lt;a href=&quot;/api-docs/sell/metadata/resources/compatibilities/methods/getCompatibilityPropertyValues&quot; target=&quot;_blank &quot;&gt;getCompatibilityPropertyValues&lt;/a&gt; method) to describe the assembly for which an item is compatible.&lt;br&gt;&lt;br&gt;The &lt;b&gt;categoryId&lt;/b&gt; of the compatibility-enabled category for which to retrieve compatibility property names is required in the request body.&lt;br&gt;&lt;br&gt;By default, all property names within the compatibility category of the specified compatibility-enable category are returned. You can limit the size of the result set by using the &lt;b&gt;dataset&lt;/b&gt; array to specify the types of properties you want returned.
     * @param body This type defines the request fields for the &lt;b&gt;getCompatibilityPropertyNames&lt;/b&gt; method.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final PropertyNamesRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link GetCompatibilityPropertyNamesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetCompatibilityPropertyNamesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GetCompatibilityPropertyNamesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}

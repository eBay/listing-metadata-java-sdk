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

package com.ebay.listingmetadata.generated.metadata.compatibilities.get_compatibilities_by_specification;

import com.ebay.listingmetadata.generated.metadata.models.SpecificationRequest;
import com.ebay.listingmetadata.generated.metadata.models.SpecificationResponse;
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
 * Builds and executes requests for operations under /compatibilities/get_compatibilities_by_specification
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetCompatibilitiesBySpecificationRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link GetCompatibilitiesBySpecificationRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetCompatibilitiesBySpecificationRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/compatibilities/get_compatibilities_by_specification", pathParameters);
    }
    /**
     * Instantiates a new {@link GetCompatibilitiesBySpecificationRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetCompatibilitiesBySpecificationRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/compatibilities/get_compatibilities_by_specification", rawUrl);
    }
    /**
     * This method is used to retrieve all compatible application name-value pairs for a part based on the provided specification(s).&lt;br&gt;&lt;br&gt;The part&apos;s relevant dimensions and/or characteristics can be provided through the &lt;b&gt;specifications&lt;/b&gt; container. For example, when retrieving compatible application name-value pairs for a tire, the tire&apos;s dimensions (such as the section width or rim diameter) should be provided.&lt;br&gt;&lt;br&gt;By default, all compatible application name-value pairs for the specifications are returned. You can limit the size of the result set by using the &lt;b&gt;compatibilityPropertyFilters&lt;/b&gt; array to specify the properties (such as make, model, year, or trim) you wish to be included in the response.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The &lt;a href=&quot;/develop/api/sell/metadata_api#sell-metadata_api-compatibilities-getcompatibilitypropertynames&quot;&gt;getCompatibilityPropertyNames&lt;/a&gt; and &lt;a href=&quot;/develop/api/sell/metadata_api#sell-metadata_api-compatibilities-getcompatibilitypropertyvalues&quot;&gt;getCompatibilityPropertyValues&lt;/a&gt; methods can be used to retrieve valid property names and values that can be used as the name-value pairs to define specifications.&lt;/span&gt;
     * @param body This type defines the properties and specifications to use to search for compatibilities.
     * @return a {@link SpecificationResponse}
     */
    @jakarta.annotation.Nullable
    public SpecificationResponse post(@jakarta.annotation.Nonnull final SpecificationRequest body) {
        return post(body, null);
    }
    /**
     * This method is used to retrieve all compatible application name-value pairs for a part based on the provided specification(s).&lt;br&gt;&lt;br&gt;The part&apos;s relevant dimensions and/or characteristics can be provided through the &lt;b&gt;specifications&lt;/b&gt; container. For example, when retrieving compatible application name-value pairs for a tire, the tire&apos;s dimensions (such as the section width or rim diameter) should be provided.&lt;br&gt;&lt;br&gt;By default, all compatible application name-value pairs for the specifications are returned. You can limit the size of the result set by using the &lt;b&gt;compatibilityPropertyFilters&lt;/b&gt; array to specify the properties (such as make, model, year, or trim) you wish to be included in the response.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The &lt;a href=&quot;/develop/api/sell/metadata_api#sell-metadata_api-compatibilities-getcompatibilitypropertynames&quot;&gt;getCompatibilityPropertyNames&lt;/a&gt; and &lt;a href=&quot;/develop/api/sell/metadata_api#sell-metadata_api-compatibilities-getcompatibilitypropertyvalues&quot;&gt;getCompatibilityPropertyValues&lt;/a&gt; methods can be used to retrieve valid property names and values that can be used as the name-value pairs to define specifications.&lt;/span&gt;
     * @param body This type defines the properties and specifications to use to search for compatibilities.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link SpecificationResponse}
     */
    @jakarta.annotation.Nullable
    public SpecificationResponse post(@jakarta.annotation.Nonnull final SpecificationRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, SpecificationResponse::createFromDiscriminatorValue);
    }
    /**
     * This method is used to retrieve all compatible application name-value pairs for a part based on the provided specification(s).&lt;br&gt;&lt;br&gt;The part&apos;s relevant dimensions and/or characteristics can be provided through the &lt;b&gt;specifications&lt;/b&gt; container. For example, when retrieving compatible application name-value pairs for a tire, the tire&apos;s dimensions (such as the section width or rim diameter) should be provided.&lt;br&gt;&lt;br&gt;By default, all compatible application name-value pairs for the specifications are returned. You can limit the size of the result set by using the &lt;b&gt;compatibilityPropertyFilters&lt;/b&gt; array to specify the properties (such as make, model, year, or trim) you wish to be included in the response.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The &lt;a href=&quot;/develop/api/sell/metadata_api#sell-metadata_api-compatibilities-getcompatibilitypropertynames&quot;&gt;getCompatibilityPropertyNames&lt;/a&gt; and &lt;a href=&quot;/develop/api/sell/metadata_api#sell-metadata_api-compatibilities-getcompatibilitypropertyvalues&quot;&gt;getCompatibilityPropertyValues&lt;/a&gt; methods can be used to retrieve valid property names and values that can be used as the name-value pairs to define specifications.&lt;/span&gt;
     * @param body This type defines the properties and specifications to use to search for compatibilities.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final SpecificationRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method is used to retrieve all compatible application name-value pairs for a part based on the provided specification(s).&lt;br&gt;&lt;br&gt;The part&apos;s relevant dimensions and/or characteristics can be provided through the &lt;b&gt;specifications&lt;/b&gt; container. For example, when retrieving compatible application name-value pairs for a tire, the tire&apos;s dimensions (such as the section width or rim diameter) should be provided.&lt;br&gt;&lt;br&gt;By default, all compatible application name-value pairs for the specifications are returned. You can limit the size of the result set by using the &lt;b&gt;compatibilityPropertyFilters&lt;/b&gt; array to specify the properties (such as make, model, year, or trim) you wish to be included in the response.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The &lt;a href=&quot;/develop/api/sell/metadata_api#sell-metadata_api-compatibilities-getcompatibilitypropertynames&quot;&gt;getCompatibilityPropertyNames&lt;/a&gt; and &lt;a href=&quot;/develop/api/sell/metadata_api#sell-metadata_api-compatibilities-getcompatibilitypropertyvalues&quot;&gt;getCompatibilityPropertyValues&lt;/a&gt; methods can be used to retrieve valid property names and values that can be used as the name-value pairs to define specifications.&lt;/span&gt;
     * @param body This type defines the properties and specifications to use to search for compatibilities.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final SpecificationRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link GetCompatibilitiesBySpecificationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetCompatibilitiesBySpecificationRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GetCompatibilitiesBySpecificationRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}

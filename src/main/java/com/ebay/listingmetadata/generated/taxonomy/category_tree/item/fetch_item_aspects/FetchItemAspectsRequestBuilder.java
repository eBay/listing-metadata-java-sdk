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

package com.ebay.listingmetadata.generated.taxonomy.category_tree.item.fetch_item_aspects;

import com.ebay.listingmetadata.generated.taxonomy.models.Error;
import com.ebay.listingmetadata.generated.taxonomy.models.GetCategoriesAspectResponse;
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
 * Builds and executes requests for operations under /category_tree/{category_tree_id}/fetch_item_aspects
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FetchItemAspectsRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link FetchItemAspectsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public FetchItemAspectsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/category_tree/{category_tree_id}/fetch_item_aspects", pathParameters);
    }
    /**
     * Instantiates a new {@link FetchItemAspectsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public FetchItemAspectsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/category_tree/{category_tree_id}/fetch_item_aspects", rawUrl);
    }
    /**
     * This method returns a complete list of aspects for all of the leaf categories that belong to an eBay marketplace. The eBay marketplace is specified through the &lt;b&gt;category_tree_id&lt;/b&gt; URI parameter.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; A successful call returns a payload as a gzipped JSON file sent as a binary file using the content-type:application/octet-stream in the response. This file may be large (over 100 MB, compressed). Extract the JSON file from the compressed file with a utility that handles .gz or .gzip. The open source &lt;a href=&quot;https://github.com/eBay/taxonomy-sdk &quot; target=&quot;_blank&quot;&gt;Taxonomy SDK&lt;/a&gt; can be used to compare the aspect metadata that is returned in this response. The &lt;b&gt;Taxonomy SDK&lt;/b&gt; uses this call to surface changes (new, modified, and removed entities) between an updated version of a bulk downloaded file relative to a previous version.&lt;/span&gt;
     * @return a {@link GetCategoriesAspectResponse}
     * @throws java.util.List<Error> When receiving a 400 status code
     * @throws Error When receiving a 404 status code
     * @throws java.util.List<Error> When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public GetCategoriesAspectResponse get() {
        return get(null);
    }
    /**
     * This method returns a complete list of aspects for all of the leaf categories that belong to an eBay marketplace. The eBay marketplace is specified through the &lt;b&gt;category_tree_id&lt;/b&gt; URI parameter.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; A successful call returns a payload as a gzipped JSON file sent as a binary file using the content-type:application/octet-stream in the response. This file may be large (over 100 MB, compressed). Extract the JSON file from the compressed file with a utility that handles .gz or .gzip. The open source &lt;a href=&quot;https://github.com/eBay/taxonomy-sdk &quot; target=&quot;_blank&quot;&gt;Taxonomy SDK&lt;/a&gt; can be used to compare the aspect metadata that is returned in this response. The &lt;b&gt;Taxonomy SDK&lt;/b&gt; uses this call to surface changes (new, modified, and removed entities) between an updated version of a bulk downloaded file relative to a previous version.&lt;/span&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link GetCategoriesAspectResponse}
     * @throws java.util.List<Error> When receiving a 400 status code
     * @throws Error When receiving a 404 status code
     * @throws java.util.List<Error> When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public GetCategoriesAspectResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("404", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, GetCategoriesAspectResponse::createFromDiscriminatorValue);
    }
    /**
     * This method returns a complete list of aspects for all of the leaf categories that belong to an eBay marketplace. The eBay marketplace is specified through the &lt;b&gt;category_tree_id&lt;/b&gt; URI parameter.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; A successful call returns a payload as a gzipped JSON file sent as a binary file using the content-type:application/octet-stream in the response. This file may be large (over 100 MB, compressed). Extract the JSON file from the compressed file with a utility that handles .gz or .gzip. The open source &lt;a href=&quot;https://github.com/eBay/taxonomy-sdk &quot; target=&quot;_blank&quot;&gt;Taxonomy SDK&lt;/a&gt; can be used to compare the aspect metadata that is returned in this response. The &lt;b&gt;Taxonomy SDK&lt;/b&gt; uses this call to surface changes (new, modified, and removed entities) between an updated version of a bulk downloaded file relative to a previous version.&lt;/span&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method returns a complete list of aspects for all of the leaf categories that belong to an eBay marketplace. The eBay marketplace is specified through the &lt;b&gt;category_tree_id&lt;/b&gt; URI parameter.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; A successful call returns a payload as a gzipped JSON file sent as a binary file using the content-type:application/octet-stream in the response. This file may be large (over 100 MB, compressed). Extract the JSON file from the compressed file with a utility that handles .gz or .gzip. The open source &lt;a href=&quot;https://github.com/eBay/taxonomy-sdk &quot; target=&quot;_blank&quot;&gt;Taxonomy SDK&lt;/a&gt; can be used to compare the aspect metadata that is returned in this response. The &lt;b&gt;Taxonomy SDK&lt;/b&gt; uses this call to surface changes (new, modified, and removed entities) between an updated version of a bulk downloaded file relative to a previous version.&lt;/span&gt;
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
     * @return a {@link FetchItemAspectsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FetchItemAspectsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new FetchItemAspectsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}

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

package com.ebay.listingmetadata.generated.catalog.product.item;

import com.ebay.listingmetadata.generated.catalog.models.Error;
import com.ebay.listingmetadata.generated.catalog.models.Product;
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
 * Builds and executes requests for operations under /product/{epid}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithEpItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link WithEpItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithEpItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/product/{epid}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithEpItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithEpItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/product/{epid}", rawUrl);
    }
    /**
     * This method retrieves details of the catalog product identified by the eBay product identifier (ePID) specified in the request. These details include the product&apos;s title and description, aspects and their values, associated images, applicable category IDs, and any recognized identifiers that apply to the product. &lt;br /&gt;&lt;br /&gt; For a new listing, you can use the &lt;strong&gt;search&lt;/strong&gt; method to identify candidate products on which to base the listing, then use the &lt;strong&gt;getProduct&lt;/strong&gt; method to present the full details of those candidate products to the seller to make a a final selection.
     * @return a {@link Product}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 403 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public Product get() {
        return get(null);
    }
    /**
     * This method retrieves details of the catalog product identified by the eBay product identifier (ePID) specified in the request. These details include the product&apos;s title and description, aspects and their values, associated images, applicable category IDs, and any recognized identifiers that apply to the product. &lt;br /&gt;&lt;br /&gt; For a new listing, you can use the &lt;strong&gt;search&lt;/strong&gt; method to identify candidate products on which to base the listing, then use the &lt;strong&gt;getProduct&lt;/strong&gt; method to present the full details of those candidate products to the seller to make a a final selection.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Product}
     * @throws Error When receiving a 400 status code
     * @throws Error When receiving a 403 status code
     * @throws Error When receiving a 404 status code
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public Product get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("403", Error::createFromDiscriminatorValue);
        errorMapping.put("404", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Product::createFromDiscriminatorValue);
    }
    /**
     * This method retrieves details of the catalog product identified by the eBay product identifier (ePID) specified in the request. These details include the product&apos;s title and description, aspects and their values, associated images, applicable category IDs, and any recognized identifiers that apply to the product. &lt;br /&gt;&lt;br /&gt; For a new listing, you can use the &lt;strong&gt;search&lt;/strong&gt; method to identify candidate products on which to base the listing, then use the &lt;strong&gt;getProduct&lt;/strong&gt; method to present the full details of those candidate products to the seller to make a a final selection.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method retrieves details of the catalog product identified by the eBay product identifier (ePID) specified in the request. These details include the product&apos;s title and description, aspects and their values, associated images, applicable category IDs, and any recognized identifiers that apply to the product. &lt;br /&gt;&lt;br /&gt; For a new listing, you can use the &lt;strong&gt;search&lt;/strong&gt; method to identify candidate products on which to base the listing, then use the &lt;strong&gt;getProduct&lt;/strong&gt; method to present the full details of those candidate products to the seller to make a a final selection.
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
     * @return a {@link WithEpItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithEpItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithEpItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}

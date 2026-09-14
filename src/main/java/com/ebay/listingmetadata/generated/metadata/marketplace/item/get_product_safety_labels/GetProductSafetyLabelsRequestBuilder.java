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

package com.ebay.listingmetadata.generated.metadata.marketplace.item.get_product_safety_labels;

import com.ebay.listingmetadata.generated.metadata.models.Error;
import com.ebay.listingmetadata.generated.metadata.models.ProductSafetyLabelsResponse;
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
 * Builds and executes requests for operations under /marketplace/{marketplace_id}/get_product_safety_labels
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetProductSafetyLabelsRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link GetProductSafetyLabelsRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetProductSafetyLabelsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/marketplace/{marketplace_id}/get_product_safety_labels", pathParameters);
    }
    /**
     * Instantiates a new {@link GetProductSafetyLabelsRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GetProductSafetyLabelsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/marketplace/{marketplace_id}/get_product_safety_labels", rawUrl);
    }
    /**
     * This method returns product safety label information for the specified eBay marketplace. The information includes IDs, descriptions, and URLs (as applicable) for the available statements and pictograms. The returned statements are localized for the default language of the marketplace. If a marketplace does not support product safety label information, no response payload is returned, but only a &lt;b&gt;204 No content&lt;/b&gt; status code.&lt;p&gt;This information is used by the seller to add product safety label related information to their listings. The &lt;a href=&apos;/develop/api/sell/metadata_api#sell-metadata_api-marketplace-getregulatorypolicies&apos;&gt;getRegulatoryPolicies&lt;/a&gt; method can be used to see which categories recommend or require product safety labels.&lt;/p&gt;
     * @return a {@link ProductSafetyLabelsResponse}
     * @throws java.util.List<Error> When receiving a 400 status code
     * @throws java.util.List<Error> When receiving a 404 status code
     * @throws java.util.List<Error> When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public ProductSafetyLabelsResponse get() {
        return get(null);
    }
    /**
     * This method returns product safety label information for the specified eBay marketplace. The information includes IDs, descriptions, and URLs (as applicable) for the available statements and pictograms. The returned statements are localized for the default language of the marketplace. If a marketplace does not support product safety label information, no response payload is returned, but only a &lt;b&gt;204 No content&lt;/b&gt; status code.&lt;p&gt;This information is used by the seller to add product safety label related information to their listings. The &lt;a href=&apos;/develop/api/sell/metadata_api#sell-metadata_api-marketplace-getregulatorypolicies&apos;&gt;getRegulatoryPolicies&lt;/a&gt; method can be used to see which categories recommend or require product safety labels.&lt;/p&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ProductSafetyLabelsResponse}
     * @throws java.util.List<Error> When receiving a 400 status code
     * @throws java.util.List<Error> When receiving a 404 status code
     * @throws java.util.List<Error> When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public ProductSafetyLabelsResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", Error::createFromDiscriminatorValue);
        errorMapping.put("404", Error::createFromDiscriminatorValue);
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ProductSafetyLabelsResponse::createFromDiscriminatorValue);
    }
    /**
     * This method returns product safety label information for the specified eBay marketplace. The information includes IDs, descriptions, and URLs (as applicable) for the available statements and pictograms. The returned statements are localized for the default language of the marketplace. If a marketplace does not support product safety label information, no response payload is returned, but only a &lt;b&gt;204 No content&lt;/b&gt; status code.&lt;p&gt;This information is used by the seller to add product safety label related information to their listings. The &lt;a href=&apos;/develop/api/sell/metadata_api#sell-metadata_api-marketplace-getregulatorypolicies&apos;&gt;getRegulatoryPolicies&lt;/a&gt; method can be used to see which categories recommend or require product safety labels.&lt;/p&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method returns product safety label information for the specified eBay marketplace. The information includes IDs, descriptions, and URLs (as applicable) for the available statements and pictograms. The returned statements are localized for the default language of the marketplace. If a marketplace does not support product safety label information, no response payload is returned, but only a &lt;b&gt;204 No content&lt;/b&gt; status code.&lt;p&gt;This information is used by the seller to add product safety label related information to their listings. The &lt;a href=&apos;/develop/api/sell/metadata_api#sell-metadata_api-marketplace-getregulatorypolicies&apos;&gt;getRegulatoryPolicies&lt;/a&gt; method can be used to see which categories recommend or require product safety labels.&lt;/p&gt;
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
     * @return a {@link GetProductSafetyLabelsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetProductSafetyLabelsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GetProductSafetyLabelsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}

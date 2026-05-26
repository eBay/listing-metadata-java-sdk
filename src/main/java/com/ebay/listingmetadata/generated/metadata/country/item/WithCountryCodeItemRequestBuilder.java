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

package com.ebay.listingmetadata.generated.metadata.country.item;

import com.ebay.listingmetadata.generated.metadata.country.item.sales_tax_jurisdiction.SalesTaxJurisdictionRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /country/{countryCode}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithCountryCodeItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The sales_tax_jurisdiction property
     * @return a {@link SalesTaxJurisdictionRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SalesTaxJurisdictionRequestBuilder salesTaxJurisdiction() {
        return new SalesTaxJurisdictionRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithCountryCodeItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithCountryCodeItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/country/{countryCode}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithCountryCodeItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithCountryCodeItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/country/{countryCode}", rawUrl);
    }
}

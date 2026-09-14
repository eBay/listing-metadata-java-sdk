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

package com.ebay.listingmetadata.clients.rest;

import com.ebay.listingmetadata.configuration.ListingMetadataConfiguration;
import com.ebay.listingmetadata.configuration.RequestOptions;
import com.ebay.listingmetadata.configuration.TokenContext;
import com.ebay.listingmetadata.generated.catalog.CatalogApiClient;
import com.ebay.listingmetadata.generated.catalog.models.*;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public final class CatalogClient {
    private final CatalogApiClient kiota;
    private final ListingMetadataConfiguration config;

    public CatalogClient(CatalogApiClient kiota, ListingMetadataConfiguration config) {
        this.kiota = kiota;
        this.config = config;
    }

    private Map<String, String> mergedHeaders(RequestOptions requestOptions) {
        Map<String, String> headers = new HashMap<>(config.getDefaultRequestOptions().getHeaders());
        if (requestOptions != null) {
            headers.putAll(requestOptions.getHeaders());
        }
        return headers;
    }

    public CompletableFuture<Product> getProductAsync(
            String epid, String xEBAYCMARKETPLACEID, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.product().byEpid(Params.requireValid("epid", epid)).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (xEBAYCMARKETPLACEID != null) config.headers.add("X-EBAY-C-MARKETPLACE-ID", xEBAYCMARKETPLACEID);
            });
        }));
    }

    public CompletableFuture<ProductSearchResponse> searchAsync(
            String aspectFilter, String categoryIds, String fieldgroups, String gtin, String limit, String mpn, String offset, String q, String xEBAYCMARKETPLACEID, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.productSummary().search().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (aspectFilter != null) config.queryParameters.aspectFilter = aspectFilter;
                if (categoryIds != null) config.queryParameters.categoryIds = categoryIds;
                if (fieldgroups != null) config.queryParameters.fieldgroups = fieldgroups;
                if (gtin != null) config.queryParameters.gtin = gtin;
                if (limit != null) config.queryParameters.limit = limit;
                if (mpn != null) config.queryParameters.mpn = mpn;
                if (offset != null) config.queryParameters.offset = offset;
                if (q != null) config.queryParameters.q = q;
                if (xEBAYCMARKETPLACEID != null) config.headers.add("X-EBAY-C-MARKETPLACE-ID", xEBAYCMARKETPLACEID);
            });
        }));
    }
}

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
import com.ebay.listingmetadata.generated.taxonomy.TaxonomyApiClient;
import com.ebay.listingmetadata.generated.taxonomy.models.*;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.io.InputStream;
import com.microsoft.kiota.serialization.UntypedNode;

public final class TaxonomyClient {
    private final TaxonomyApiClient kiota;
    private final ListingMetadataConfiguration config;

    public TaxonomyClient(TaxonomyApiClient kiota, ListingMetadataConfiguration config) {
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

    public CompletableFuture<GetCategoriesAspectResponse> fetchItemAspectsAsync(
            String categoryTreeId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.categoryTree().byCategory_tree_id(Params.requireValid("categoryTreeId", categoryTreeId)).fetchItemAspects().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<BaseCategoryTree> getDefaultCategoryTreeIdAsync(
            String marketplaceId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.getDefaultCategoryTreeId().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (marketplaceId != null) config.queryParameters.marketplaceId = marketplaceId;
            });
        }));
    }

    public CompletableFuture<CategoryTree> getCategoryTreeAsync(
            String categoryTreeId, String acceptEncoding, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.categoryTree().byCategory_tree_id(Params.requireValid("categoryTreeId", categoryTreeId)).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (acceptEncoding != null) config.headers.add("Accept-Encoding", acceptEncoding);
            });
        }));
    }

    public CompletableFuture<CategorySubtree> getCategorySubtreeAsync(
            String categoryTreeId, String categoryId, String acceptEncoding, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.categoryTree().byCategory_tree_id(Params.requireValid("categoryTreeId", categoryTreeId)).getCategorySubtree().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (categoryId != null) config.queryParameters.categoryId = categoryId;
                if (acceptEncoding != null) config.headers.add("Accept-Encoding", acceptEncoding);
            });
        }));
    }

    public CompletableFuture<CategorySuggestionResponse> getCategorySuggestionsAsync(
            String categoryTreeId, String q, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.categoryTree().byCategory_tree_id(Params.requireValid("categoryTreeId", categoryTreeId)).getCategorySuggestions().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (q != null) config.queryParameters.q = q;
            });
        }));
    }

    public CompletableFuture<AspectMetadata> getItemAspectsForCategoryAsync(
            String categoryTreeId, String categoryId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.categoryTree().byCategory_tree_id(Params.requireValid("categoryTreeId", categoryTreeId)).getItemAspectsForCategory().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (categoryId != null) config.queryParameters.categoryId = categoryId;
            });
        }));
    }

    public CompletableFuture<GetCompatibilityMetadataResponse> getCompatibilityPropertiesAsync(
            String categoryTreeId, String categoryId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.categoryTree().byCategory_tree_id(Params.requireValid("categoryTreeId", categoryTreeId)).getCompatibilityProperties().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (categoryId != null) config.queryParameters.categoryId = categoryId;
            });
        }));
    }

    public CompletableFuture<GetCompatibilityPropertyValuesResponse> getCompatibilityPropertyValuesAsync(
            String categoryTreeId, String compatibilityProperty, String categoryId, String filter, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.categoryTree().byCategory_tree_id(Params.requireValid("categoryTreeId", categoryTreeId)).getCompatibilityPropertyValues().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (compatibilityProperty != null) config.queryParameters.compatibilityProperty = compatibilityProperty;
                if (categoryId != null) config.queryParameters.categoryId = categoryId;
                if (filter != null) config.queryParameters.filter = filter;
            });
        }));
    }

    public CompletableFuture<ExpiredCategories> getExpiredCategoriesAsync(
            String categoryTreeId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.categoryTree().byCategory_tree_id(Params.requireValid("categoryTreeId", categoryTreeId)).getExpiredCategories().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }
}

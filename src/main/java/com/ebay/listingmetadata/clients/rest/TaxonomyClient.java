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
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * Client for the Commerce Taxonomy API.
 * Provides methods to retrieve category trees, aspects, and compatibility information.
 */
public final class TaxonomyClient {
    private final TaxonomyApiClient kiota;
    private final ListingMetadataConfiguration config;

    public TaxonomyClient(TaxonomyApiClient kiota, ListingMetadataConfiguration config) {
        this.kiota = kiota;
        this.config = config;
    }

    /**
     * Merges default headers from config with per-call headers.
     * Per-call headers override defaults.
     */
    private Map<String, String> mergedHeaders(RequestOptions requestOptions) {
        Map<String, String> headers = new HashMap<>(config.getDefaultRequestOptions().getHeaders());
        if (requestOptions != null) {
            headers.putAll(requestOptions.getHeaders());
        }
        return headers;
    }

    /**
     * Returns a complete list of aspects for all leaf categories in a marketplace.
     *
     * @param categoryTreeId The unique identifier of the eBay category tree
     * @param accessToken Per-call token; overrides config fallback
     * @param requestOptions Per-call headers; merged over defaults
     * @return Aspect metadata (response type varies based on OpenAPI schema)
     */
    public CompletableFuture<Object> fetchItemAspectsAsync(
            String categoryTreeId,
            String accessToken,
            RequestOptions requestOptions) {
        Params.requireValid("categoryTreeId", categoryTreeId);
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.categoryTree().byCategory_tree_id(categoryTreeId)
                .fetchItemAspects().get(config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
        }));
    }

    /**
     * Returns a subtree of a category tree, including the root node of the subtree.
     *
     * @param categoryTreeId The unique identifier of the eBay category tree
     * @param categoryId The unique identifier of the category at the top of the subtree
     * @param accessToken Per-call token; overrides config fallback
     * @param requestOptions Per-call headers; merged over defaults
     * @return Category subtree data
     */
    public CompletableFuture<Object> getCategorySubtreeAsync(
            String categoryTreeId,
            String categoryId,
            String accessToken,
            RequestOptions requestOptions) {
        Params.requireValid("categoryTreeId", categoryTreeId);
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.categoryTree().byCategory_tree_id(categoryTreeId)
                .getCategorySubtree().get(config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                    if (categoryId != null) {
                        config.queryParameters.categoryId = categoryId;
                    }
                });
        }));
    }

    /**
     * Returns an array of categories, with suggestions for the best matching categories
     * for the keywords or aspects provided.
     *
     * @param categoryTreeId The unique identifier of the eBay category tree
     * @param q A string that describes or characterizes the item being offered for sale
     * @param accessToken Per-call token; overrides config fallback
     * @param requestOptions Per-call headers; merged over defaults
     * @return Category suggestions
     */
    public CompletableFuture<Object> getCategorySuggestionsAsync(
            String categoryTreeId,
            String q,
            String accessToken,
            RequestOptions requestOptions) {
        Params.requireValid("categoryTreeId", categoryTreeId);
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.categoryTree().byCategory_tree_id(categoryTreeId)
                .getCategorySuggestions().get(config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                    if (q != null) {
                        config.queryParameters.q = q;
                    }
                });
        }));
    }

    /**
     * Returns the complete category tree identified by the category_tree_id.
     *
     * @param categoryTreeId The unique identifier of the eBay category tree
     * @param accessToken Per-call token; overrides config fallback
     * @param requestOptions Per-call headers; merged over defaults
     * @return Complete category tree
     */
    public CompletableFuture<Object> getCategoryTreeAsync(
            String categoryTreeId,
            String accessToken,
            RequestOptions requestOptions) {
        Params.requireValid("categoryTreeId", categoryTreeId);
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.categoryTree().byCategory_tree_id(categoryTreeId).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    /**
     * Returns the compatibility properties (aspects) for a given category tree and dataset.
     *
     * @param categoryTreeId The unique identifier of the eBay category tree
     * @param categoryId The unique identifier of an eBay category that supports parts compatibility
     * @param accessToken Per-call token; overrides config fallback
     * @param requestOptions Per-call headers; merged over defaults
     * @return Compatibility properties
     */
    public CompletableFuture<Object> getCompatibilityPropertiesAsync(
            String categoryTreeId,
            String categoryId,
            String accessToken,
            RequestOptions requestOptions) {
        Params.requireValid("categoryTreeId", categoryTreeId);
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.categoryTree().byCategory_tree_id(categoryTreeId)
                .getCompatibilityProperties().get(config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                    if (categoryId != null) {
                        config.queryParameters.categoryId = categoryId;
                    }
                });
        }));
    }

    /**
     * Returns the values of a specified compatibility property for items in a given category.
     *
     * @param categoryTreeId The unique identifier of the eBay category tree
     * @param categoryId The unique identifier of an eBay category that supports parts compatibility
     * @param compatibilityProperty One compatible vehicle property to retrieve values for (e.g. "Trim")
     * @param filter One or more name/value pairs to narrow down returned values
     * @param accessToken Per-call token; overrides config fallback
     * @param requestOptions Per-call headers; merged over defaults
     * @return Compatibility property values
     */
    public CompletableFuture<Object> getCompatibilityPropertyValuesAsync(
            String categoryTreeId,
            String categoryId,
            String compatibilityProperty,
            String filter,
            String accessToken,
            RequestOptions requestOptions) {
        Params.requireValid("categoryTreeId", categoryTreeId);
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.categoryTree().byCategory_tree_id(categoryTreeId)
                .getCompatibilityPropertyValues().get(config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                    if (categoryId != null) {
                        config.queryParameters.categoryId = categoryId;
                    }
                    if (compatibilityProperty != null) {
                        config.queryParameters.compatibilityProperty = compatibilityProperty;
                    }
                    if (filter != null) {
                        config.queryParameters.filter = filter;
                    }
                });
        }));
    }

    /**
     * Returns the eBay category tree identifier for the default eBay marketplace.
     *
     * @param marketplaceId The unique identifier of the eBay marketplace (e.g. EBAY_US)
     * @param accessToken Per-call token; overrides config fallback
     * @param requestOptions Per-call headers; merged over defaults
     * @return Default category tree ID
     */
    public CompletableFuture<Object> getDefaultCategoryTreeIdAsync(
            String marketplaceId,
            String accessToken,
            RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.getDefaultCategoryTreeId().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (marketplaceId != null) {
                    config.queryParameters.marketplaceId = marketplaceId;
                }
            });
        }));
    }

    /**
     * Returns all categories in a specified category tree that have been marked as expired.
     *
     * @param categoryTreeId The unique identifier of the eBay category tree
     * @param accessToken Per-call token; overrides config fallback
     * @param requestOptions Per-call headers; merged over defaults
     * @return Expired categories
     */
    public CompletableFuture<Object> getExpiredCategoriesAsync(
            String categoryTreeId,
            String accessToken,
            RequestOptions requestOptions) {
        Params.requireValid("categoryTreeId", categoryTreeId);
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.categoryTree().byCategory_tree_id(categoryTreeId)
                .getExpiredCategories().get(config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
        }));
    }

    /**
     * Returns aspects that are appropriate or required for accurately describing
     * items in the specified leaf category.
     *
     * @param categoryTreeId The unique identifier of the eBay category tree
     * @param categoryId The unique identifier of the leaf category for which aspects are being requested
     * @param accessToken Per-call token; overrides config fallback
     * @param requestOptions Per-call headers; merged over defaults
     * @return Item aspects for category
     */
    public CompletableFuture<Object> getItemAspectsForCategoryAsync(
            String categoryTreeId,
            String categoryId,
            String accessToken,
            RequestOptions requestOptions) {
        Params.requireValid("categoryTreeId", categoryTreeId);
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.categoryTree().byCategory_tree_id(categoryTreeId)
                .getItemAspectsForCategory().get(config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                    if (categoryId != null) {
                        config.queryParameters.categoryId = categoryId;
                    }
                });
        }));
    }
}

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
import com.ebay.listingmetadata.generated.metadata.MetadataApiClient;
import com.ebay.listingmetadata.generated.metadata.models.*;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * Client for the Sell Metadata API.
 * Provides methods to retrieve marketplace policies, compatibility data, and shipping metadata.
 */
public final class MetadataClient {
    private final MetadataApiClient kiota;
    private final ListingMetadataConfiguration config;

    public MetadataClient(MetadataApiClient kiota, ListingMetadataConfiguration config) {
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

    // ── Marketplace-scoped policies ─────────────────────────────────────────

    /**
     * Returns eBay policies that define how to list automotive parts compatibility items.
     *
     * @param marketplaceId eBay marketplace ID (e.g. EBAY_US)
     * @param filter Limits response to specified categoryId values (pipe-separated)
     * @param accessToken Per-call token; overrides config fallback
     * @param requestOptions Per-call headers; merged over defaults
     * @return Automotive parts compatibility policies
     */
    public CompletableFuture<Object> getAutomotivePartsCompatibilityPoliciesAsync(
            String marketplaceId,
            String filter,
            String accessToken,
            RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.marketplace().byMarketplace_id(marketplaceId)
                .getAutomotivePartsCompatibilityPolicies().get(config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                    if (filter != null) {
                        config.queryParameters.filter = filter;
                    }
                });
        });
    }

    /**
     * Returns category-specific policies for the specified marketplace.
     *
     * @param marketplaceId eBay marketplace ID (e.g. EBAY_US)
     * @param filter Limits response to specified categoryId values (pipe-separated)
     * @param accessToken Per-call token; overrides config fallback
     * @param requestOptions Per-call headers; merged over defaults
     * @return Category policies
     */
    public CompletableFuture<Object> getCategoryPoliciesAsync(
            String marketplaceId,
            String filter,
            String accessToken,
            RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.marketplace().byMarketplace_id(marketplaceId)
                    .getCategoryPolicies().get(config -> {
                        headers.forEach((k, v) -> config.headers.add(k, v));
                        if (filter != null) {
                            config.queryParameters.filter = filter;
                        }
                    });
        });
    }

    /**
     * Returns classified ad policies for the specified marketplace.
     *
     * @param marketplaceId eBay marketplace ID (e.g. EBAY_US)
     * @param filter Limits response to specified categoryId values (pipe-separated)
     * @param accessToken Per-call token; overrides config fallback
     * @param requestOptions Per-call headers; merged over defaults
     * @return Classified ad policies
     */
    public CompletableFuture<Object> getClassifiedAdPoliciesAsync(
            String marketplaceId,
            String filter,
            String accessToken,
            RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.marketplace().byMarketplace_id(marketplaceId)
                    .getClassifiedAdPolicies().get(config -> {
                        headers.forEach((k, v) -> config.headers.add(k, v));
                        if (filter != null) {
                            config.queryParameters.filter = filter;
                        }
                    });
        });
    }

    /**
     * Returns the supported currencies for the specified marketplace.
     *
     * @param marketplaceId eBay marketplace ID (e.g. EBAY_US)
     * @param accessToken Per-call token; overrides config fallback
     * @param requestOptions Per-call headers; merged over defaults
     * @return Supported currencies
     */
    public CompletableFuture<Object> getCurrenciesAsync(
            String marketplaceId,
            String accessToken,
            RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.marketplace().byMarketplace_id(marketplaceId)
                    .getCurrencies().get(config -> {
                        headers.forEach((k, v) -> config.headers.add(k, v));
                    });
        });
    }

    /**
     * Returns extended producer responsibility policies for the specified marketplace.
     *
     * @param marketplaceId eBay marketplace ID (e.g. EBAY_US)
     * @param filter Limits response to specified categoryId values (pipe-separated)
     * @param accessToken Per-call token; overrides config fallback
     * @param requestOptions Per-call headers; merged over defaults
     * @return EPR policies
     */
    public CompletableFuture<Object> getExtendedProducerResponsibilityPoliciesAsync(
            String marketplaceId,
            String filter,
            String accessToken,
            RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.marketplace().byMarketplace_id(marketplaceId)
                    .getExtendedProducerResponsibilityPolicies().get(config -> {
                        headers.forEach((k, v) -> config.headers.add(k, v));
                        if (filter != null) {
                            config.queryParameters.filter = filter;
                        }
                    });
        });
    }

    /**
     * Returns hazardous materials label information for the specified marketplace.
     *
     * @param marketplaceId eBay marketplace ID (e.g. EBAY_US)
     * @param accessToken Per-call token; overrides config fallback
     * @param requestOptions Per-call headers; merged over defaults
     * @return Hazardous materials labels
     */
    public CompletableFuture<Object> getHazardousMaterialsLabelsAsync(
            String marketplaceId,
            String accessToken,
            RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.marketplace().byMarketplace_id(marketplaceId)
                    .getHazardousMaterialsLabels().get(config -> {
                        headers.forEach((k, v) -> config.headers.add(k, v));
                    });
        });
    }

    /**
     * Returns item condition policies for the specified marketplace.
     *
     * @param marketplaceId eBay marketplace ID (e.g. EBAY_US)
     * @param filter Limits response to specified categoryId values (pipe-separated)
     * @param accessToken Per-call token; overrides config fallback
     * @param requestOptions Per-call headers; merged over defaults
     * @return Item condition policies
     */
    public CompletableFuture<Object> getItemConditionPoliciesAsync(
            String marketplaceId,
            String filter,
            String accessToken,
            RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.marketplace().byMarketplace_id(marketplaceId)
                    .getItemConditionPolicies().get(config -> {
                        headers.forEach((k, v) -> config.headers.add(k, v));
                        if (filter != null) {
                            config.queryParameters.filter = filter;
                        }
                    });
        });
    }

    /**
     * Returns listing structure policies for the specified marketplace.
     *
     * @param marketplaceId eBay marketplace ID (e.g. EBAY_US)
     * @param filter Limits response to specified categoryId values (pipe-separated)
     * @param accessToken Per-call token; overrides config fallback
     * @param requestOptions Per-call headers; merged over defaults
     * @return Listing structure policies
     */
    public CompletableFuture<Object> getListingStructurePoliciesAsync(
            String marketplaceId,
            String filter,
            String accessToken,
            RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.marketplace().byMarketplace_id(marketplaceId)
                    .getListingStructurePolicies().get(config -> {
                        headers.forEach((k, v) -> config.headers.add(k, v));
                        if (filter != null) {
                            config.queryParameters.filter = filter;
                        }
                    });
        });
    }

    /**
     * Returns listing type policies for the specified marketplace.
     *
     * @param marketplaceId eBay marketplace ID (e.g. EBAY_US)
     * @param filter Limits response to specified categoryId values (pipe-separated)
     * @param accessToken Per-call token; overrides config fallback
     * @param requestOptions Per-call headers; merged over defaults
     * @return Listing type policies
     */
    public CompletableFuture<Object> getListingTypePoliciesAsync(
            String marketplaceId,
            String filter,
            String accessToken,
            RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.marketplace().byMarketplace_id(marketplaceId)
                    .getListingTypePolicies().get(config -> {
                        headers.forEach((k, v) -> config.headers.add(k, v));
                        if (filter != null) {
                            config.queryParameters.filter = filter;
                        }
                    });
        });
    }

    /**
     * Returns motors listing policies for the specified marketplace.
     *
     * @param marketplaceId eBay marketplace ID (e.g. EBAY_US)
     * @param filter Limits response to specified categoryId values (pipe-separated)
     * @param accessToken Per-call token; overrides config fallback
     * @param requestOptions Per-call headers; merged over defaults
     * @return Motors listing policies
     */
    public CompletableFuture<Object> getMotorsListingPoliciesAsync(
            String marketplaceId,
            String filter,
            String accessToken,
            RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.marketplace().byMarketplace_id(marketplaceId)
                    .getMotorsListingPolicies().get(config -> {
                        headers.forEach((k, v) -> config.headers.add(k, v));
                        if (filter != null) {
                            config.queryParameters.filter = filter;
                        }
                    });
        });
    }

    /**
     * Returns negotiated price policies for the specified marketplace.
     *
     * @param marketplaceId eBay marketplace ID (e.g. EBAY_US)
     * @param filter Limits response to specified categoryId values (pipe-separated)
     * @param accessToken Per-call token; overrides config fallback
     * @param requestOptions Per-call headers; merged over defaults
     * @return Negotiated price policies
     */
    public CompletableFuture<Object> getNegotiatedPricePoliciesAsync(
            String marketplaceId,
            String filter,
            String accessToken,
            RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.marketplace().byMarketplace_id(marketplaceId)
                    .getNegotiatedPricePolicies().get(config -> {
                        headers.forEach((k, v) -> config.headers.add(k, v));
                        if (filter != null) {
                            config.queryParameters.filter = filter;
                        }
                    });
        });
    }

    /**
     * Returns product safety label information for the specified marketplace.
     *
     * @param marketplaceId eBay marketplace ID (e.g. EBAY_US)
     * @param accessToken Per-call token; overrides config fallback
     * @param requestOptions Per-call headers; merged over defaults
     * @return Product safety labels
     */
    public CompletableFuture<Object> getProductSafetyLabelsAsync(
            String marketplaceId,
            String accessToken,
            RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.marketplace().byMarketplace_id(marketplaceId)
                    .getProductSafetyLabels().get(config -> {
                        headers.forEach((k, v) -> config.headers.add(k, v));
                    });
        });
    }

    /**
     * Returns regulatory policies for the specified marketplace.
     *
     * @param marketplaceId eBay marketplace ID (e.g. EBAY_US)
     * @param filter Limits response to specified categoryId values (pipe-separated)
     * @param accessToken Per-call token; overrides config fallback
     * @param requestOptions Per-call headers; merged over defaults
     * @return Regulatory policies
     */
    public CompletableFuture<Object> getRegulatoryPoliciesAsync(
            String marketplaceId,
            String filter,
            String accessToken,
            RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.marketplace().byMarketplace_id(marketplaceId)
                    .getRegulatoryPolicies().get(config -> {
                        headers.forEach((k, v) -> config.headers.add(k, v));
                        if (filter != null) {
                            config.queryParameters.filter = filter;
                        }
                    });
        });
    }

    /**
     * Returns return policies for the specified marketplace.
     *
     * @param marketplaceId eBay marketplace ID (e.g. EBAY_US)
     * @param filter Limits response to specified categoryId values (pipe-separated)
     * @param accessToken Per-call token; overrides config fallback
     * @param requestOptions Per-call headers; merged over defaults
     * @return Return policies
     */
    public CompletableFuture<Object> getReturnPoliciesAsync(
            String marketplaceId,
            String filter,
            String accessToken,
            RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.marketplace().byMarketplace_id(marketplaceId)
                    .getReturnPolicies().get(config -> {
                        headers.forEach((k, v) -> config.headers.add(k, v));
                        if (filter != null) {
                            config.queryParameters.filter = filter;
                        }
                    });
        });
    }

    /**
     * Returns shipping policies for the specified marketplace.
     *
     * @param marketplaceId eBay marketplace ID (e.g. EBAY_US)
     * @param filter Limits response to specified categoryId values (pipe-separated)
     * @param accessToken Per-call token; overrides config fallback
     * @param requestOptions Per-call headers; merged over defaults
     * @return Shipping policies
     */
    public CompletableFuture<Object> getShippingPoliciesAsync(
            String marketplaceId,
            String filter,
            String accessToken,
            RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.marketplace().byMarketplace_id(marketplaceId)
                    .getShippingPolicies().get(config -> {
                        headers.forEach((k, v) -> config.headers.add(k, v));
                        if (filter != null) {
                            config.queryParameters.filter = filter;
                        }
                    });
        });
    }

    /**
     * Returns site visibility policies for the specified marketplace.
     *
     * @param marketplaceId eBay marketplace ID (e.g. EBAY_US)
     * @param filter Limits response to specified categoryId values (pipe-separated)
     * @param accessToken Per-call token; overrides config fallback
     * @param requestOptions Per-call headers; merged over defaults
     * @return Site visibility policies
     */
    public CompletableFuture<Object> getSiteVisibilityPoliciesAsync(
            String marketplaceId,
            String filter,
            String accessToken,
            RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.marketplace().byMarketplace_id(marketplaceId)
                    .getSiteVisibilityPolicies().get(config -> {
                        headers.forEach((k, v) -> config.headers.add(k, v));
                        if (filter != null) {
                            config.queryParameters.filter = filter;
                        }
                    });
        });
    }

    // ── Compatibility operations ─────────────────────────────────────────────

    /**
     * Returns compatibilities for a set of product specifications.
     *
     * @param body Request body containing specification criteria
     * @param accessToken Per-call token; overrides config fallback
     * @param requestOptions Per-call headers; merged over defaults
     * @return Compatibilities
     */
    public CompletableFuture<Object> getCompatibilitiesBySpecificationAsync(
            SpecificationRequest body,
            String accessToken,
            RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.compatibilities().getCompatibilitiesBySpecification().post(body, config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
        });
    }

    /**
     * Returns compatibility property names for the specified dataset.
     *
     * @param body Request body containing categoryId and optional dataset filters
     * @param accessToken Per-call token; overrides config fallback
     * @param requestOptions Per-call headers; merged over defaults
     * @return Compatibility property names
     */
    public CompletableFuture<Object> getCompatibilityPropertyNamesAsync(
            PropertyNamesRequest body,
            String accessToken,
            RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.compatibilities().getCompatibilityPropertyNames().post(body, config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
        });
    }

    /**
     * Returns compatibility property values for the specified property name and dataset.
     *
     * @param body Request body containing categoryId, propertyName, and optional filters
     * @param accessToken Per-call token; overrides config fallback
     * @param requestOptions Per-call headers; merged over defaults
     * @return Compatibility property values
     */
    public CompletableFuture<Object> getCompatibilityPropertyValuesAsync(
            PropertyValuesRequest body,
            String accessToken,
            RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.compatibilities().getCompatibilityPropertyValues().post(body, config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
        });
    }

    /**
     * Returns multiple compatibility property values in a single call.
     *
     * @param body Request body containing categoryId, propertyNames, and required propertyFilter
     * @param accessToken Per-call token; overrides config fallback
     * @param requestOptions Per-call headers; merged over defaults
     * @return Multiple compatibility property values
     */
    public CompletableFuture<Object> getMultiCompatibilityPropertyValuesAsync(
            MultiCompatibilityPropertyValuesRequest body,
            String accessToken,
            RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.compatibilities().getMultiCompatibilityPropertyValues().post(body, config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
        });
    }

    /**
     * Returns product compatibilities for the specified product.
     *
     * @param body Request body containing productIdentifier and optional filters
     * @param accessToken Per-call token; overrides config fallback
     * @param requestOptions Per-call headers; merged over defaults
     * @return Product compatibilities
     */
    public CompletableFuture<Object> getProductCompatibilitiesAsync(
            ProductRequest body,
            String accessToken,
            RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.compatibilities().getProductCompatibilities().post(body, config -> {
                    headers.forEach((k, v) -> config.headers.add(k, v));
                });
        });
    }

    // ── Shipping marketplace operations ─────────────────────────────────────

    /**
     * Returns exclude shipping locations for the specified marketplace.
     *
     * @param marketplaceId eBay marketplace ID (e.g. EBAY_US)
     * @param accessToken Per-call token; overrides config fallback
     * @param requestOptions Per-call headers; merged over defaults
     * @return Exclude shipping locations
     */
    public CompletableFuture<Object> getExcludeShippingLocationsAsync(
            String marketplaceId,
            String accessToken,
            RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.shipping().marketplace().byMarketplace_id(marketplaceId)
                    .getExcludeShippingLocations().get(config -> {
                        headers.forEach((k, v) -> config.headers.add(k, v));
                    });
        });
    }

    /**
     * Returns handling times for the specified marketplace.
     *
     * @param marketplaceId eBay marketplace ID (e.g. EBAY_US)
     * @param accessToken Per-call token; overrides config fallback
     * @param requestOptions Per-call headers; merged over defaults
     * @return Handling times
     */
    public CompletableFuture<Object> getHandlingTimesAsync(
            String marketplaceId,
            String accessToken,
            RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.shipping().marketplace().byMarketplace_id(marketplaceId)
                    .getHandlingTimes().get(config -> {
                        headers.forEach((k, v) -> config.headers.add(k, v));
                    });
        });
    }

    /**
     * Returns available shipping carriers for the specified marketplace.
     *
     * @param marketplaceId eBay marketplace ID (e.g. EBAY_US)
     * @param accessToken Per-call token; overrides config fallback
     * @param requestOptions Per-call headers; merged over defaults
     * @return Shipping carriers
     */
    public CompletableFuture<Object> getShippingCarriersAsync(
            String marketplaceId,
            String accessToken,
            RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.shipping().marketplace().byMarketplace_id(marketplaceId)
                    .getShippingCarriers().get(config -> {
                        headers.forEach((k, v) -> config.headers.add(k, v));
                    });
        });
    }

    /**
     * Returns available shipping locations for the specified marketplace.
     *
     * @param marketplaceId eBay marketplace ID (e.g. EBAY_US)
     * @param accessToken Per-call token; overrides config fallback
     * @param requestOptions Per-call headers; merged over defaults
     * @return Shipping locations
     */
    public CompletableFuture<Object> getShippingLocationsAsync(
            String marketplaceId,
            String accessToken,
            RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.shipping().marketplace().byMarketplace_id(marketplaceId)
                    .getShippingLocations().get(config -> {
                        headers.forEach((k, v) -> config.headers.add(k, v));
                    });
        });
    }

    /**
     * Returns available shipping services for the specified marketplace.
     *
     * @param marketplaceId eBay marketplace ID (e.g. EBAY_US)
     * @param accessToken Per-call token; overrides config fallback
     * @param requestOptions Per-call headers; merged over defaults
     * @return Shipping services
     */
    public CompletableFuture<Object> getShippingServicesAsync(
            String marketplaceId,
            String accessToken,
            RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.shipping().marketplace().byMarketplace_id(marketplaceId)
                    .getShippingServices().get(config -> {
                        headers.forEach((k, v) -> config.headers.add(k, v));
                    });
        });
    }

    // ── Sales-tax jurisdiction ───────────────────────────────────────────────

    /**
     * Returns all sales-tax jurisdictions for the specified country (US or CA).
     *
     * @param countryCode Two-letter ISO 3166 country code (US or CA)
     * @param accessToken Per-call token; overrides config fallback
     * @param requestOptions Per-call headers; merged over defaults
     * @return Sales tax jurisdictions
     */
    public CompletableFuture<Object> getSalesTaxJurisdictionsAsync(
            String countryCode,
            String accessToken,
            RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.country().byCountryCode(countryCode)
                    .salesTaxJurisdiction().get(config -> {
                        headers.forEach((k, v) -> config.headers.add(k, v));
                    });
        });
    }
}

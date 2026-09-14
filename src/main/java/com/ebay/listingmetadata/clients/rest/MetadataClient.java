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
import java.io.InputStream;
import com.microsoft.kiota.serialization.UntypedNode;

public final class MetadataClient {
    private final MetadataApiClient kiota;
    private final ListingMetadataConfiguration config;

    public MetadataClient(MetadataApiClient kiota, ListingMetadataConfiguration config) {
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

    public CompletableFuture<AutomotivePartsCompatibilityPolicyResponse> getAutomotivePartsCompatibilityPoliciesAsync(
            String marketplaceId, String filter, String acceptEncoding, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.marketplace().byMarketplace_id(Params.requireValid("marketplaceId", marketplaceId)).getAutomotivePartsCompatibilityPolicies().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (filter != null) config.queryParameters.filter = filter;
                if (acceptEncoding != null) config.headers.add("Accept-Encoding", acceptEncoding);
            });
        }));
    }

    public CompletableFuture<CategoryPolicyResponse> getCategoryPoliciesAsync(
            String marketplaceId, String filter, String acceptLanguage, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.marketplace().byMarketplace_id(Params.requireValid("marketplaceId", marketplaceId)).getCategoryPolicies().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (filter != null) config.queryParameters.filter = filter;
                if (acceptLanguage != null) config.headers.add("Accept-Language", acceptLanguage);
            });
        }));
    }

    public CompletableFuture<ClassifiedAdPolicyResponse> getClassifiedAdPoliciesAsync(
            String marketplaceId, String filter, String acceptLanguage, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.marketplace().byMarketplace_id(Params.requireValid("marketplaceId", marketplaceId)).getClassifiedAdPolicies().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (filter != null) config.queryParameters.filter = filter;
                if (acceptLanguage != null) config.headers.add("Accept-Language", acceptLanguage);
            });
        }));
    }

    public CompletableFuture<GetCurrenciesResponse> getCurrenciesAsync(
            String marketplaceId, String acceptLanguage, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.marketplace().byMarketplace_id(Params.requireValid("marketplaceId", marketplaceId)).getCurrencies().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (acceptLanguage != null) config.headers.add("Accept-Language", acceptLanguage);
            });
        }));
    }

    public CompletableFuture<ExtendedProducerResponsibilityPolicyResponse> getExtendedProducerResponsibilityPoliciesAsync(
            String marketplaceId, String filter, String acceptEncoding, String acceptLanguage, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.marketplace().byMarketplace_id(Params.requireValid("marketplaceId", marketplaceId)).getExtendedProducerResponsibilityPolicies().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (filter != null) config.queryParameters.filter = filter;
                if (acceptEncoding != null) config.headers.add("Accept-Encoding", acceptEncoding);
                if (acceptLanguage != null) config.headers.add("Accept-Language", acceptLanguage);
            });
        }));
    }

    public CompletableFuture<HazardousMaterialDetailsResponse> getHazardousMaterialsLabelsAsync(
            String marketplaceId, String acceptLanguage, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.marketplace().byMarketplace_id(Params.requireValid("marketplaceId", marketplaceId)).getHazardousMaterialsLabels().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (acceptLanguage != null) config.headers.add("Accept-Language", acceptLanguage);
            });
        }));
    }

    public CompletableFuture<ItemConditionPolicyResponse> getItemConditionPoliciesAsync(
            String marketplaceId, String filter, String acceptEncoding, String acceptLanguage, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.marketplace().byMarketplace_id(Params.requireValid("marketplaceId", marketplaceId)).getItemConditionPolicies().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (filter != null) config.queryParameters.filter = filter;
                if (acceptEncoding != null) config.headers.add("Accept-Encoding", acceptEncoding);
                if (acceptLanguage != null) config.headers.add("Accept-Language", acceptLanguage);
            });
        }));
    }

    public CompletableFuture<ListingStructurePolicyResponse> getListingStructurePoliciesAsync(
            String marketplaceId, String filter, String acceptEncoding, String acceptLanguage, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.marketplace().byMarketplace_id(Params.requireValid("marketplaceId", marketplaceId)).getListingStructurePolicies().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (filter != null) config.queryParameters.filter = filter;
                if (acceptEncoding != null) config.headers.add("Accept-Encoding", acceptEncoding);
                if (acceptLanguage != null) config.headers.add("Accept-Language", acceptLanguage);
            });
        }));
    }

    public CompletableFuture<ListingTypePoliciesResponse> getListingTypePoliciesAsync(
            String marketplaceId, String filter, String acceptLanguage, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.marketplace().byMarketplace_id(Params.requireValid("marketplaceId", marketplaceId)).getListingTypePolicies().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (filter != null) config.queryParameters.filter = filter;
                if (acceptLanguage != null) config.headers.add("Accept-Language", acceptLanguage);
            });
        }));
    }

    public CompletableFuture<GetMinimumListingPricePoliciesResponse> getMinimumListingPricePoliciesAsync(
            String marketplaceId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.marketplace().byMarketplace_id(Params.requireValid("marketplaceId", marketplaceId)).getMinimumListingPricePolicies().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<MotorsListingPoliciesResponse> getMotorsListingPoliciesAsync(
            String marketplaceId, String filter, String acceptLanguage, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.marketplace().byMarketplace_id(Params.requireValid("marketplaceId", marketplaceId)).getMotorsListingPolicies().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (filter != null) config.queryParameters.filter = filter;
                if (acceptLanguage != null) config.headers.add("Accept-Language", acceptLanguage);
            });
        }));
    }

    public CompletableFuture<NegotiatedPricePolicyResponse> getNegotiatedPricePoliciesAsync(
            String marketplaceId, String filter, String acceptEncoding, String acceptLanguage, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.marketplace().byMarketplace_id(Params.requireValid("marketplaceId", marketplaceId)).getNegotiatedPricePolicies().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (filter != null) config.queryParameters.filter = filter;
                if (acceptEncoding != null) config.headers.add("Accept-Encoding", acceptEncoding);
                if (acceptLanguage != null) config.headers.add("Accept-Language", acceptLanguage);
            });
        }));
    }

    public CompletableFuture<ProductSafetyLabelsResponse> getProductSafetyLabelsAsync(
            String marketplaceId, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.marketplace().byMarketplace_id(Params.requireValid("marketplaceId", marketplaceId)).getProductSafetyLabels().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }

    public CompletableFuture<RegulatoryPolicyResponse> getRegulatoryPoliciesAsync(
            String marketplaceId, String filter, String acceptLanguage, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.marketplace().byMarketplace_id(Params.requireValid("marketplaceId", marketplaceId)).getRegulatoryPolicies().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (filter != null) config.queryParameters.filter = filter;
                if (acceptLanguage != null) config.headers.add("Accept-Language", acceptLanguage);
            });
        }));
    }

    public CompletableFuture<ReturnPolicyResponse> getReturnPoliciesAsync(
            String marketplaceId, String filter, String acceptEncoding, String acceptLanguage, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.marketplace().byMarketplace_id(Params.requireValid("marketplaceId", marketplaceId)).getReturnPolicies().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (filter != null) config.queryParameters.filter = filter;
                if (acceptEncoding != null) config.headers.add("Accept-Encoding", acceptEncoding);
                if (acceptLanguage != null) config.headers.add("Accept-Language", acceptLanguage);
            });
        }));
    }

    public CompletableFuture<ShippingPoliciesResponse> getShippingPoliciesAsync(
            String marketplaceId, String filter, String acceptLanguage, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.marketplace().byMarketplace_id(Params.requireValid("marketplaceId", marketplaceId)).getShippingPolicies().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (filter != null) config.queryParameters.filter = filter;
                if (acceptLanguage != null) config.headers.add("Accept-Language", acceptLanguage);
            });
        }));
    }

    public CompletableFuture<SiteVisibilityPoliciesResponse> getSiteVisibilityPoliciesAsync(
            String marketplaceId, String filter, String acceptLanguage, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.marketplace().byMarketplace_id(Params.requireValid("marketplaceId", marketplaceId)).getSiteVisibilityPolicies().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (filter != null) config.queryParameters.filter = filter;
                if (acceptLanguage != null) config.headers.add("Accept-Language", acceptLanguage);
            });
        }));
    }

    public CompletableFuture<SpecificationResponse> getCompatibilitiesBySpecificationAsync(
            SpecificationRequest body, String xEBAYCMARKETPLACEID, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.compatibilities().getCompatibilitiesBySpecification().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (xEBAYCMARKETPLACEID != null) config.headers.add("X-EBAY-C-MARKETPLACE-ID", xEBAYCMARKETPLACEID);
            });
        }));
    }

    public CompletableFuture<PropertyNamesResponse> getCompatibilityPropertyNamesAsync(
            PropertyNamesRequest body, String xEBAYCMARKETPLACEID, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.compatibilities().getCompatibilityPropertyNames().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (xEBAYCMARKETPLACEID != null) config.headers.add("X-EBAY-C-MARKETPLACE-ID", xEBAYCMARKETPLACEID);
            });
        }));
    }

    public CompletableFuture<PropertyValuesResponse> getCompatibilityPropertyValuesAsync(
            PropertyValuesRequest body, String xEBAYCMARKETPLACEID, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.compatibilities().getCompatibilityPropertyValues().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (xEBAYCMARKETPLACEID != null) config.headers.add("X-EBAY-C-MARKETPLACE-ID", xEBAYCMARKETPLACEID);
            });
        }));
    }

    public CompletableFuture<MultiCompatibilityPropertyValuesResponse> getMultiCompatibilityPropertyValuesAsync(
            MultiCompatibilityPropertyValuesRequest body, String xEBAYCMARKETPLACEID, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.compatibilities().getMultiCompatibilityPropertyValues().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (xEBAYCMARKETPLACEID != null) config.headers.add("X-EBAY-C-MARKETPLACE-ID", xEBAYCMARKETPLACEID);
            });
        }));
    }

    public CompletableFuture<ProductResponse> getProductCompatibilitiesAsync(
            ProductRequest body, String xEBAYCMARKETPLACEID, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.compatibilities().getProductCompatibilities().post(body, config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (xEBAYCMARKETPLACEID != null) config.headers.add("X-EBAY-C-MARKETPLACE-ID", xEBAYCMARKETPLACEID);
            });
        }));
    }

    public CompletableFuture<ShippingExcludeLocationResponse> getExcludeShippingLocationsAsync(
            String marketplaceId, String acceptLanguage, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.shipping().marketplace().byMarketplace_id(Params.requireValid("marketplaceId", marketplaceId)).getExcludeShippingLocations().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (acceptLanguage != null) config.headers.add("Accept-Language", acceptLanguage);
            });
        }));
    }

    public CompletableFuture<ShippingHandlingTimeResponse> getHandlingTimesAsync(
            String marketplaceId, String acceptLanguage, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.shipping().marketplace().byMarketplace_id(Params.requireValid("marketplaceId", marketplaceId)).getHandlingTimes().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (acceptLanguage != null) config.headers.add("Accept-Language", acceptLanguage);
            });
        }));
    }

    public CompletableFuture<ShippingCarrierResponse> getShippingCarriersAsync(
            String marketplaceId, String acceptLanguage, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.shipping().marketplace().byMarketplace_id(Params.requireValid("marketplaceId", marketplaceId)).getShippingCarriers().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (acceptLanguage != null) config.headers.add("Accept-Language", acceptLanguage);
            });
        }));
    }

    public CompletableFuture<ShippingLocationResponse> getShippingLocationsAsync(
            String marketplaceId, String acceptLanguage, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.shipping().marketplace().byMarketplace_id(Params.requireValid("marketplaceId", marketplaceId)).getShippingLocations().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (acceptLanguage != null) config.headers.add("Accept-Language", acceptLanguage);
            });
        }));
    }

    public CompletableFuture<ShippingServiceResponse> getShippingServicesAsync(
            String marketplaceId, String acceptLanguage, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.shipping().marketplace().byMarketplace_id(Params.requireValid("marketplaceId", marketplaceId)).getShippingServices().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (acceptLanguage != null) config.headers.add("Accept-Language", acceptLanguage);
            });
        }));
    }

    public CompletableFuture<SalesTaxJurisdictions> getSalesTaxJurisdictionsAsync(
            String countryCode, String accessToken, RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> TokenContext.runWith(accessToken, () -> {
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.country().byCountryCode(Params.requireValid("countryCode", countryCode)).salesTaxJurisdiction().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        }));
    }
}

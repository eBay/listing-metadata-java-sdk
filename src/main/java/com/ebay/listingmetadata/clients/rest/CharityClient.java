package com.ebay.listingmetadata.clients.rest;

import com.ebay.listingmetadata.configuration.ListingMetadataConfiguration;
import com.ebay.listingmetadata.configuration.RequestOptions;
import com.ebay.listingmetadata.configuration.TokenContext;
import com.ebay.listingmetadata.generated.charity.CharityApiClient;
import com.ebay.listingmetadata.generated.charity.models.CharityOrg;
import com.ebay.listingmetadata.generated.charity.models.CharitySearchResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * Client for the Commerce Charity API.
 * Provides methods to retrieve information about charitable organizations.
 */
public final class CharityClient {
    private final CharityApiClient kiota;
    private final ListingMetadataConfiguration config;

    public CharityClient(CharityApiClient kiota, ListingMetadataConfiguration config) {
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
     * Retrieve detailed information about a specific charitable organization.
     *
     * @param charityOrgId The unique ID of the charitable organization
     * @param accessToken Per-call token; overrides config fallback
     * @param requestOptions Per-call headers; merged over defaults
     * @return CharityOrg details
     */
    public CompletableFuture<CharityOrg> getCharityOrgAsync(
            String charityOrgId,
            String accessToken,
            RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.charityOrg().byCharity_org_id(charityOrgId).get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
            });
        });
    }

    /**
     * Search for charitable organizations.
     *
     * @param limit Number of items to return per page (1-100; default 20)
     * @param offset Number of items to skip for pagination (default 0)
     * @param q Keywords to match against name, mission statement, or description
     * @param registrationIds Comma-separated list of charitable organization registration IDs
     * @param accessToken Per-call token; overrides config fallback
     * @param requestOptions Per-call headers; merged over defaults
     * @return CharitySearchResponse with search results
     */
    public CompletableFuture<CharitySearchResponse> getCharityOrgsAsync(
            String limit,
            String offset,
            String q,
            String registrationIds,
            String accessToken,
            RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() -> {
            TokenContext.CURRENT.set(accessToken);
            Map<String, String> headers = mergedHeaders(requestOptions);
            return kiota.charityOrg().get(config -> {
                headers.forEach((k, v) -> config.headers.add(k, v));
                if (limit != null) {
                    config.queryParameters.limit = limit;
                }
                if (offset != null) {
                    config.queryParameters.offset = offset;
                }
                if (q != null) {
                    config.queryParameters.q = q;
                }
                if (registrationIds != null) {
                    config.queryParameters.registrationIds = registrationIds;
                }
            });
        });
    }
}

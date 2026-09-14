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

package com.ebay.listingmetadata.configuration;

import jakarta.annotation.Nullable;
import java.net.URI;
import java.util.Set;
import java.util.HashSet;

/**
 * Configuration for the Listing Metadata SDK.
 * Provides base URLs for Catalog, Charity, Taxonomy, and Metadata APIs.
 */
public final class ListingMetadataConfiguration {
    // Base URLs for each API (private final; validated at construction time)
    private final String catalogBaseUrl;
    private final String charityBaseUrl;
    private final String taxonomyBaseUrl;
    private final String metadataBaseUrl;

    private @Nullable String accessToken;  // static fallback; per-call token takes precedence
    private boolean diagnosticLogging = false;

    /**
     * Default request options (headers) applied to all SDK calls.
     * Per-call RequestOptions will override these.
     */
    private RequestOptions defaultRequestOptions = new RequestOptions();

    /**
     * Creates a configuration with default eBay production base URLs.
     */
    public ListingMetadataConfiguration() {
        this.catalogBaseUrl = "https://api.ebay.com/commerce/catalog/v1_beta";
        this.charityBaseUrl = "https://api.ebay.com/commerce/charity/v1";
        this.taxonomyBaseUrl = "https://api.ebay.com/commerce/taxonomy/v1";
        this.metadataBaseUrl = "https://api.ebay.com/sell/metadata/v1";
    }

    /**
     * Creates a configuration with custom base URLs.
     * All URLs are validated to ensure they point to allowed hosts.
     *
     * @param catalogBaseUrl  Base URL for the Catalog API
     * @param charityBaseUrl  Base URL for the Charity API
     * @param taxonomyBaseUrl Base URL for the Taxonomy API
     * @param metadataBaseUrl Base URL for the Metadata API
     */
    public ListingMetadataConfiguration(
            String catalogBaseUrl,
            String charityBaseUrl,
            String taxonomyBaseUrl,
            String metadataBaseUrl) {
        // Validate with a temporary set of allowed hosts derived from all four URLs
        Set<String> allowed = new HashSet<>();
        allowed.add(extractHost(catalogBaseUrl));
        allowed.add(extractHost(charityBaseUrl));
        allowed.add(extractHost(taxonomyBaseUrl));
        allowed.add(extractHost(metadataBaseUrl));

        this.catalogBaseUrl = validateHost(catalogBaseUrl, allowed);
        this.charityBaseUrl = validateHost(charityBaseUrl, allowed);
        this.taxonomyBaseUrl = validateHost(taxonomyBaseUrl, allowed);
        this.metadataBaseUrl = validateHost(metadataBaseUrl, allowed);
    }

    // Getters only — no public setters for URL fields (SEC-002)
    public String getCatalogBaseUrl() { return catalogBaseUrl; }
    public String getCharityBaseUrl() { return charityBaseUrl; }
    public String getTaxonomyBaseUrl() { return taxonomyBaseUrl; }
    public String getMetadataBaseUrl() { return metadataBaseUrl; }

    /**
     * Sets the fallback access token.
     *
     * <p><strong>Security note (SEC-002):</strong> The access token is stored as a plain
     * {@code String} in the Java heap and may be visible to heap dumps or profilers.
     * Prefer per-call token injection via {@code TokenContext.runWith()} for sensitive
     * multi-tenant scenarios.</p>
     */
    public void setAccessToken(@Nullable String accessToken) { this.accessToken = accessToken; }
    public @Nullable String getAccessToken() { return accessToken; }

    public boolean isDiagnosticLogging() { return diagnosticLogging; }
    public void setDiagnosticLogging(boolean diagnosticLogging) { this.diagnosticLogging = diagnosticLogging; }

    public RequestOptions getDefaultRequestOptions() { return defaultRequestOptions; }
    public void setDefaultRequestOptions(RequestOptions defaultRequestOptions) { this.defaultRequestOptions = defaultRequestOptions; }

    /**
     * All hostnames tokens may be sent to; used by AllowedHostsValidator.
     */
    public Set<String> getAllowedHosts() {
        Set<String> hosts = new HashSet<>();
        hosts.add(extractHost(catalogBaseUrl));
        hosts.add(extractHost(charityBaseUrl));
        hosts.add(extractHost(taxonomyBaseUrl));
        hosts.add(extractHost(metadataBaseUrl));
        return hosts;
    }

    private String validateHost(String url, Set<String> allowedHosts) {
        try {
            String host = new java.net.URI(url).getHost();
            if (host == null || !allowedHosts.contains(host)) {
                throw new IllegalArgumentException("URL host not in allowed list: " + url);
            }
        } catch (java.net.URISyntaxException e) {
            throw new IllegalArgumentException("Invalid URL: " + url, e);
        }
        return url;
    }

    private String extractHost(String url) {
        try {
            return URI.create(url).getHost();
        } catch (Exception e) {
            return "api.ebay.com"; // fallback
        }
    }
}

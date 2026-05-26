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

import java.net.URI;
import java.util.Set;
import java.util.HashSet;

/**
 * Configuration for the Listing Metadata SDK.
 * Provides base URLs for Catalog, Charity, Taxonomy, and Metadata APIs.
 */
public final class ListingMetadataConfiguration {
    // Base URLs for each API
    private String catalogBaseUrl = "https://api.ebay.com/commerce/catalog/v1_beta";
    private String charityBaseUrl = "https://api.ebay.com/commerce/charity/v1";
    private String taxonomyBaseUrl = "https://api.ebay.com/commerce/taxonomy/v1";
    private String metadataBaseUrl = "https://api.ebay.com/sell/metadata/v1";

    private String accessToken;  // static fallback; per-call token takes precedence
    private boolean diagnosticLogging = false;

    /**
     * Default request options (headers) applied to all SDK calls.
     * Per-call RequestOptions will override these.
     */
    private RequestOptions defaultRequestOptions = new RequestOptions();

    // Getters and setters
    public String getCatalogBaseUrl() { return catalogBaseUrl; }
    public void setCatalogBaseUrl(String catalogBaseUrl) { this.catalogBaseUrl = catalogBaseUrl; }

    public String getCharityBaseUrl() { return charityBaseUrl; }
    public void setCharityBaseUrl(String charityBaseUrl) { this.charityBaseUrl = charityBaseUrl; }

    public String getTaxonomyBaseUrl() { return taxonomyBaseUrl; }
    public void setTaxonomyBaseUrl(String taxonomyBaseUrl) { this.taxonomyBaseUrl = taxonomyBaseUrl; }

    public String getMetadataBaseUrl() { return metadataBaseUrl; }
    public void setMetadataBaseUrl(String metadataBaseUrl) { this.metadataBaseUrl = metadataBaseUrl; }

    public String getAccessToken() { return accessToken; }
    public void setAccessToken(String accessToken) { this.accessToken = accessToken; }

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

    private String extractHost(String url) {
        try {
            return URI.create(url).getHost();
        } catch (Exception e) {
            return "api.ebay.com"; // fallback
        }
    }
}

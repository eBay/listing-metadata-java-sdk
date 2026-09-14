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
import java.util.HashSet;
import java.util.Set;

public final class ListingMetadataConfiguration {
    private @Nullable String accessToken;
    private RequestOptions defaultRequestOptions = new RequestOptions();

    private final String catalogBaseUrl;
    private final String charityBaseUrl;
    private final String metadataBaseUrl;
    private final String taxonomyBaseUrl;

    public ListingMetadataConfiguration() {
        this.catalogBaseUrl = "https://api.ebay.com/commerce/catalog/v1_beta";
        this.charityBaseUrl = "https://api.ebay.com/commerce/charity/v1";
        this.metadataBaseUrl = "https://api.ebay.com/sell/metadata/v1";
        this.taxonomyBaseUrl = "https://api.ebay.com/commerce/taxonomy/v1";
    }

    public ListingMetadataConfiguration(
            String catalogBaseUrl,
            String charityBaseUrl,
            String metadataBaseUrl,
            String taxonomyBaseUrl) {
        this.catalogBaseUrl = validateHost(catalogBaseUrl);
        this.charityBaseUrl = validateHost(charityBaseUrl);
        this.metadataBaseUrl = validateHost(metadataBaseUrl);
        this.taxonomyBaseUrl = validateHost(taxonomyBaseUrl);
    }

    private String validateHost(String url) {
        try {
            String host = new java.net.URI(url).getHost();
            if (host == null || !getAllowedHosts().contains(host)) {
                throw new IllegalArgumentException("URL host not in allowed list: " + url);
            }
        } catch (java.net.URISyntaxException e) {
            throw new IllegalArgumentException("Invalid URL: " + url, e);
        }
        return url;
    }

    /**
     * Sets the OAuth Bearer token used for API calls when no per-call token is provided.
     *
     * <p><b>Security note:</b> The token is stored as a Java {@code String} and will remain
     * in heap memory until garbage collected. To minimize exposure: do not log this
     * configuration object, null out the token reference when it is no longer needed,
     * and avoid storing the configuration longer than the client lifecycle.
     */
    public void setAccessToken(@Nullable String token) {
        this.accessToken = token;
    }

    public @Nullable String getAccessToken() {
        return accessToken;
    }

    public RequestOptions getDefaultRequestOptions() {
        return defaultRequestOptions;
    }

    public Set<String> getAllowedHosts() {
        Set<String> hosts = new HashSet<>();
        hosts.add("api.ebay.com");
        return hosts;
    }

    public String getCatalogBaseUrl() {
        return catalogBaseUrl;
    }

    public String getCharityBaseUrl() {
        return charityBaseUrl;
    }

    public String getMetadataBaseUrl() {
        return metadataBaseUrl;
    }

    public String getTaxonomyBaseUrl() {
        return taxonomyBaseUrl;
    }
}

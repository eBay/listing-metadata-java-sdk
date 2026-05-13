package com.ebay.listingmetadata;

import com.ebay.listingmetadata.clients.rest.CatalogClient;
import com.ebay.listingmetadata.clients.rest.CharityClient;
import com.ebay.listingmetadata.clients.rest.MetadataClient;
import com.ebay.listingmetadata.clients.rest.TaxonomyClient;
import com.ebay.listingmetadata.configuration.KiotaAuthProvider;
import com.ebay.listingmetadata.configuration.ListingMetadataConfiguration;
import com.ebay.listingmetadata.generated.catalog.CatalogApiClient;
import com.ebay.listingmetadata.generated.charity.CharityApiClient;
import com.ebay.listingmetadata.generated.metadata.MetadataApiClient;
import com.ebay.listingmetadata.generated.taxonomy.TaxonomyApiClient;
import com.microsoft.kiota.authentication.BaseBearerTokenAuthenticationProvider;
import com.microsoft.kiota.http.OkHttpRequestAdapter;
import okhttp3.OkHttpClient;
import java.io.Closeable;

/**
 * Main facade for the Listing Metadata SDK.
 * Provides unified access to Catalog, Charity, Taxonomy, and Metadata APIs.
 *
 * <pre>{@code
 * var config = new ListingMetadataConfiguration();
 * config.setAccessToken("your-token");
 *
 * try (var sdk = new ListingMetadataClient(config)) {
 *     var product = sdk.catalog.getProduct("12345", null, null);
 *     System.out.println(product);
 * }
 * }</pre>
 */
public final class ListingMetadataClient implements Closeable {
    private final OkHttpClient sharedHttpClient;

    public final CatalogClient catalog;
    public final CharityClient charity;
    public final TaxonomyClient taxonomy;
    public final MetadataClient metadata;

    public ListingMetadataClient(ListingMetadataConfiguration config) {
        // Shared OkHttpClient for all REST clients
        this.sharedHttpClient = new OkHttpClient.Builder()
            .build();

        var authProvider = new BaseBearerTokenAuthenticationProvider(new KiotaAuthProvider(config));

        // Catalog API client
        var catalogAdapter = new OkHttpRequestAdapter(authProvider, null, null, sharedHttpClient);
        catalogAdapter.setBaseUrl(config.getCatalogBaseUrl());
        this.catalog = new CatalogClient(new CatalogApiClient(catalogAdapter), config);

        // Charity API client
        var charityAdapter = new OkHttpRequestAdapter(authProvider, null, null, sharedHttpClient);
        charityAdapter.setBaseUrl(config.getCharityBaseUrl());
        this.charity = new CharityClient(new CharityApiClient(charityAdapter), config);

        // Taxonomy API client
        var taxonomyAdapter = new OkHttpRequestAdapter(authProvider, null, null, sharedHttpClient);
        taxonomyAdapter.setBaseUrl(config.getTaxonomyBaseUrl());
        this.taxonomy = new TaxonomyClient(new TaxonomyApiClient(taxonomyAdapter), config);

        // Metadata API client
        var metadataAdapter = new OkHttpRequestAdapter(authProvider, null, null, sharedHttpClient);
        metadataAdapter.setBaseUrl(config.getMetadataBaseUrl());
        this.metadata = new MetadataClient(new MetadataApiClient(metadataAdapter), config);
    }

    /**
     * Constructor with custom OkHttpClient.
     * Useful for testing or custom HTTP configuration.
     */
    public ListingMetadataClient(ListingMetadataConfiguration config, OkHttpClient httpClient) {
        this.sharedHttpClient = httpClient;

        var authProvider = new BaseBearerTokenAuthenticationProvider(new KiotaAuthProvider(config));

        var catalogAdapter = new OkHttpRequestAdapter(authProvider, null, null, sharedHttpClient);
        catalogAdapter.setBaseUrl(config.getCatalogBaseUrl());
        this.catalog = new CatalogClient(new CatalogApiClient(catalogAdapter), config);

        var charityAdapter = new OkHttpRequestAdapter(authProvider, null, null, sharedHttpClient);
        charityAdapter.setBaseUrl(config.getCharityBaseUrl());
        this.charity = new CharityClient(new CharityApiClient(charityAdapter), config);

        var taxonomyAdapter = new OkHttpRequestAdapter(authProvider, null, null, sharedHttpClient);
        taxonomyAdapter.setBaseUrl(config.getTaxonomyBaseUrl());
        this.taxonomy = new TaxonomyClient(new TaxonomyApiClient(taxonomyAdapter), config);

        var metadataAdapter = new OkHttpRequestAdapter(authProvider, null, null, sharedHttpClient);
        metadataAdapter.setBaseUrl(config.getMetadataBaseUrl());
        this.metadata = new MetadataClient(new MetadataApiClient(metadataAdapter), config);
    }

    @Override
    public void close() {
        sharedHttpClient.dispatcher().executorService().shutdown();
        sharedHttpClient.connectionPool().evictAll();
    }
}

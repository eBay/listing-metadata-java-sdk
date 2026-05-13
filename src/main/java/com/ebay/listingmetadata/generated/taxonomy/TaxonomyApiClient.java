package com.ebay.listingmetadata.generated.taxonomy;

import com.ebay.listingmetadata.generated.taxonomy.category_tree.CategoryTreeRequestBuilder;
import com.ebay.listingmetadata.generated.taxonomy.get_default_category_tree_id.GetDefaultCategoryTreeIdRequestBuilder;
import com.microsoft.kiota.ApiClientBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.serialization.FormParseNodeFactory;
import com.microsoft.kiota.serialization.FormSerializationWriterFactory;
import com.microsoft.kiota.serialization.JsonParseNodeFactory;
import com.microsoft.kiota.serialization.JsonSerializationWriterFactory;
import com.microsoft.kiota.serialization.MultipartSerializationWriterFactory;
import com.microsoft.kiota.serialization.ParseNodeFactoryRegistry;
import com.microsoft.kiota.serialization.SerializationWriterFactoryRegistry;
import com.microsoft.kiota.serialization.TextParseNodeFactory;
import com.microsoft.kiota.serialization.TextSerializationWriterFactory;
import java.util.HashMap;
import java.util.Objects;
/**
 * The main entry point of the SDK, exposes the configuration and the fluent API.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TaxonomyApiClient extends BaseRequestBuilder {
    /**
     * The category_tree property
     * @return a {@link CategoryTreeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CategoryTreeRequestBuilder categoryTree() {
        return new CategoryTreeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The get_default_category_tree_id property
     * @return a {@link GetDefaultCategoryTreeIdRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetDefaultCategoryTreeIdRequestBuilder getDefaultCategoryTreeId() {
        return new GetDefaultCategoryTreeIdRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link TaxonomyApiClient} and sets the default values.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public TaxonomyApiClient(@jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}");
        this.pathParameters = new HashMap<>();
        ApiClientBuilder.registerDefaultSerializer(() -> new JsonSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new TextSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new FormSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new MultipartSerializationWriterFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new JsonParseNodeFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new FormParseNodeFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new TextParseNodeFactory());
        if (requestAdapter.getBaseUrl() == null || requestAdapter.getBaseUrl().isEmpty()) {
            requestAdapter.setBaseUrl("https://api.ebay.com{basePath}");
        }
        pathParameters.put("baseurl", requestAdapter.getBaseUrl());
    }
}

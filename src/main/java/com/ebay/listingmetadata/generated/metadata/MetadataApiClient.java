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

package com.ebay.listingmetadata.generated.metadata;

import com.ebay.listingmetadata.generated.metadata.compatibilities.CompatibilitiesRequestBuilder;
import com.ebay.listingmetadata.generated.metadata.country.CountryRequestBuilder;
import com.ebay.listingmetadata.generated.metadata.marketplace.MarketplaceRequestBuilder;
import com.ebay.listingmetadata.generated.metadata.shipping.ShippingRequestBuilder;
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
public class MetadataApiClient extends BaseRequestBuilder {
    /**
     * The compatibilities property
     * @return a {@link CompatibilitiesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CompatibilitiesRequestBuilder compatibilities() {
        return new CompatibilitiesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The country property
     * @return a {@link CountryRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CountryRequestBuilder country() {
        return new CountryRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The marketplace property
     * @return a {@link MarketplaceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MarketplaceRequestBuilder marketplace() {
        return new MarketplaceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The shipping property
     * @return a {@link ShippingRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ShippingRequestBuilder shipping() {
        return new ShippingRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link MetadataApiClient} and sets the default values.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MetadataApiClient(@jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
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
            requestAdapter.setBaseUrl("https://api.ebay.com/sell/metadata/v1");
        }
        pathParameters.put("baseurl", requestAdapter.getBaseUrl());
    }
}

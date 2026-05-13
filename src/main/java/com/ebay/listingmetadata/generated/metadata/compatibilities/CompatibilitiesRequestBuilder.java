package com.ebay.listingmetadata.generated.metadata.compatibilities;

import com.ebay.listingmetadata.generated.metadata.compatibilities.get_compatibilities_by_specification.GetCompatibilitiesBySpecificationRequestBuilder;
import com.ebay.listingmetadata.generated.metadata.compatibilities.get_compatibility_property_names.GetCompatibilityPropertyNamesRequestBuilder;
import com.ebay.listingmetadata.generated.metadata.compatibilities.get_compatibility_property_values.GetCompatibilityPropertyValuesRequestBuilder;
import com.ebay.listingmetadata.generated.metadata.compatibilities.get_multi_compatibility_property_values.GetMultiCompatibilityPropertyValuesRequestBuilder;
import com.ebay.listingmetadata.generated.metadata.compatibilities.get_product_compatibilities.GetProductCompatibilitiesRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /compatibilities
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CompatibilitiesRequestBuilder extends BaseRequestBuilder {
    /**
     * The get_compatibilities_by_specification property
     * @return a {@link GetCompatibilitiesBySpecificationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetCompatibilitiesBySpecificationRequestBuilder getCompatibilitiesBySpecification() {
        return new GetCompatibilitiesBySpecificationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The get_compatibility_property_names property
     * @return a {@link GetCompatibilityPropertyNamesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetCompatibilityPropertyNamesRequestBuilder getCompatibilityPropertyNames() {
        return new GetCompatibilityPropertyNamesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The get_compatibility_property_values property
     * @return a {@link GetCompatibilityPropertyValuesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetCompatibilityPropertyValuesRequestBuilder getCompatibilityPropertyValues() {
        return new GetCompatibilityPropertyValuesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The get_multi_compatibility_property_values property
     * @return a {@link GetMultiCompatibilityPropertyValuesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetMultiCompatibilityPropertyValuesRequestBuilder getMultiCompatibilityPropertyValues() {
        return new GetMultiCompatibilityPropertyValuesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The get_product_compatibilities property
     * @return a {@link GetProductCompatibilitiesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetProductCompatibilitiesRequestBuilder getProductCompatibilities() {
        return new GetProductCompatibilitiesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link CompatibilitiesRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CompatibilitiesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/compatibilities", pathParameters);
    }
    /**
     * Instantiates a new {@link CompatibilitiesRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CompatibilitiesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/compatibilities", rawUrl);
    }
}

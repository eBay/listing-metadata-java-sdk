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

package com.ebay.listingmetadata.generated.metadata.marketplace.item;

import com.ebay.listingmetadata.generated.metadata.marketplace.item.get_automotive_parts_compatibility_policies.GetAutomotivePartsCompatibilityPoliciesRequestBuilder;
import com.ebay.listingmetadata.generated.metadata.marketplace.item.get_category_policies.GetCategoryPoliciesRequestBuilder;
import com.ebay.listingmetadata.generated.metadata.marketplace.item.get_classified_ad_policies.GetClassifiedAdPoliciesRequestBuilder;
import com.ebay.listingmetadata.generated.metadata.marketplace.item.get_currencies.GetCurrenciesRequestBuilder;
import com.ebay.listingmetadata.generated.metadata.marketplace.item.get_extended_producer_responsibility_policies.GetExtendedProducerResponsibilityPoliciesRequestBuilder;
import com.ebay.listingmetadata.generated.metadata.marketplace.item.get_hazardous_materials_labels.GetHazardousMaterialsLabelsRequestBuilder;
import com.ebay.listingmetadata.generated.metadata.marketplace.item.get_item_condition_policies.GetItemConditionPoliciesRequestBuilder;
import com.ebay.listingmetadata.generated.metadata.marketplace.item.get_listing_structure_policies.GetListingStructurePoliciesRequestBuilder;
import com.ebay.listingmetadata.generated.metadata.marketplace.item.get_listing_type_policies.GetListingTypePoliciesRequestBuilder;
import com.ebay.listingmetadata.generated.metadata.marketplace.item.get_motors_listing_policies.GetMotorsListingPoliciesRequestBuilder;
import com.ebay.listingmetadata.generated.metadata.marketplace.item.get_negotiated_price_policies.GetNegotiatedPricePoliciesRequestBuilder;
import com.ebay.listingmetadata.generated.metadata.marketplace.item.get_product_safety_labels.GetProductSafetyLabelsRequestBuilder;
import com.ebay.listingmetadata.generated.metadata.marketplace.item.get_regulatory_policies.GetRegulatoryPoliciesRequestBuilder;
import com.ebay.listingmetadata.generated.metadata.marketplace.item.get_return_policies.GetReturnPoliciesRequestBuilder;
import com.ebay.listingmetadata.generated.metadata.marketplace.item.get_shipping_policies.GetShippingPoliciesRequestBuilder;
import com.ebay.listingmetadata.generated.metadata.marketplace.item.get_site_visibility_policies.GetSiteVisibilityPoliciesRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /marketplace/{marketplace_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithMarketplaceItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The get_automotive_parts_compatibility_policies property
     * @return a {@link GetAutomotivePartsCompatibilityPoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetAutomotivePartsCompatibilityPoliciesRequestBuilder getAutomotivePartsCompatibilityPolicies() {
        return new GetAutomotivePartsCompatibilityPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The get_category_policies property
     * @return a {@link GetCategoryPoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetCategoryPoliciesRequestBuilder getCategoryPolicies() {
        return new GetCategoryPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The get_classified_ad_policies property
     * @return a {@link GetClassifiedAdPoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetClassifiedAdPoliciesRequestBuilder getClassifiedAdPolicies() {
        return new GetClassifiedAdPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The get_currencies property
     * @return a {@link GetCurrenciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetCurrenciesRequestBuilder getCurrencies() {
        return new GetCurrenciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The get_extended_producer_responsibility_policies property
     * @return a {@link GetExtendedProducerResponsibilityPoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetExtendedProducerResponsibilityPoliciesRequestBuilder getExtendedProducerResponsibilityPolicies() {
        return new GetExtendedProducerResponsibilityPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The get_hazardous_materials_labels property
     * @return a {@link GetHazardousMaterialsLabelsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetHazardousMaterialsLabelsRequestBuilder getHazardousMaterialsLabels() {
        return new GetHazardousMaterialsLabelsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The get_item_condition_policies property
     * @return a {@link GetItemConditionPoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetItemConditionPoliciesRequestBuilder getItemConditionPolicies() {
        return new GetItemConditionPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The get_listing_structure_policies property
     * @return a {@link GetListingStructurePoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetListingStructurePoliciesRequestBuilder getListingStructurePolicies() {
        return new GetListingStructurePoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The get_listing_type_policies property
     * @return a {@link GetListingTypePoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetListingTypePoliciesRequestBuilder getListingTypePolicies() {
        return new GetListingTypePoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The get_motors_listing_policies property
     * @return a {@link GetMotorsListingPoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetMotorsListingPoliciesRequestBuilder getMotorsListingPolicies() {
        return new GetMotorsListingPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The get_negotiated_price_policies property
     * @return a {@link GetNegotiatedPricePoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetNegotiatedPricePoliciesRequestBuilder getNegotiatedPricePolicies() {
        return new GetNegotiatedPricePoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The get_product_safety_labels property
     * @return a {@link GetProductSafetyLabelsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetProductSafetyLabelsRequestBuilder getProductSafetyLabels() {
        return new GetProductSafetyLabelsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The get_regulatory_policies property
     * @return a {@link GetRegulatoryPoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetRegulatoryPoliciesRequestBuilder getRegulatoryPolicies() {
        return new GetRegulatoryPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The get_return_policies property
     * @return a {@link GetReturnPoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetReturnPoliciesRequestBuilder getReturnPolicies() {
        return new GetReturnPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The get_shipping_policies property
     * @return a {@link GetShippingPoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetShippingPoliciesRequestBuilder getShippingPolicies() {
        return new GetShippingPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The get_site_visibility_policies property
     * @return a {@link GetSiteVisibilityPoliciesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public GetSiteVisibilityPoliciesRequestBuilder getSiteVisibilityPolicies() {
        return new GetSiteVisibilityPoliciesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithMarketplaceItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithMarketplaceItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/marketplace/{marketplace_id}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithMarketplaceItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithMarketplaceItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/marketplace/{marketplace_id}", rawUrl);
    }
}

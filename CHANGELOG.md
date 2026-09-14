# ChangeLog

## 1.0.0 (09/14/2026)

**Breaking changes**
- The following operations changed signature on `CatalogClient`:
  - `getProductAsync`: `(String, String, RequestOptions)` → `(String, String, String, RequestOptions)`
  - `searchAsync`: `(String, String, String, String, String, String, String, String, String, RequestOptions)` → `(String, String, String, String, String, String, String, String, String, String, RequestOptions)`
- The following operations changed signature on `CharityClient`:
  - `getCharityOrgAsync`: `(String, String, RequestOptions)` → `(String, String, String, RequestOptions)`
  - `getCharityOrgsAsync`: `(String, String, String, String, String, RequestOptions)` → `(String, String, String, String, String, String, RequestOptions)`
- The following operations changed signature on `MetadataClient`:
  - `getAutomotivePartsCompatibilityPoliciesAsync`: `(String, String, String, RequestOptions)` → `(String, String, String, String, RequestOptions)`
  - `getCategoryPoliciesAsync`: `(String, String, String, RequestOptions)` → `(String, String, String, String, RequestOptions)`
  - `getClassifiedAdPoliciesAsync`: `(String, String, String, RequestOptions)` → `(String, String, String, String, RequestOptions)`
  - `getCompatibilitiesBySpecificationAsync`: `(SpecificationRequest, String, RequestOptions)` → `(SpecificationRequest, String, String, RequestOptions)`
  - `getCompatibilityPropertyNamesAsync`: `(PropertyNamesRequest, String, RequestOptions)` → `(PropertyNamesRequest, String, String, RequestOptions)`
  - `getCompatibilityPropertyValuesAsync`: `(PropertyValuesRequest, String, RequestOptions)` → `(PropertyValuesRequest, String, String, RequestOptions)`
  - `getCurrenciesAsync`: `(String, String, RequestOptions)` → `(String, String, String, RequestOptions)`
  - `getExcludeShippingLocationsAsync`: `(String, String, RequestOptions)` → `(String, String, String, RequestOptions)`
  - `getExtendedProducerResponsibilityPoliciesAsync`: `(String, String, String, RequestOptions)` → `(String, String, String, String, String, RequestOptions)`
  - `getHandlingTimesAsync`: `(String, String, RequestOptions)` → `(String, String, String, RequestOptions)`
  - `getHazardousMaterialsLabelsAsync`: `(String, String, RequestOptions)` → `(String, String, String, RequestOptions)`
  - `getItemConditionPoliciesAsync`: `(String, String, String, RequestOptions)` → `(String, String, String, String, String, RequestOptions)`
  - `getListingStructurePoliciesAsync`: `(String, String, String, RequestOptions)` → `(String, String, String, String, String, RequestOptions)`
  - `getListingTypePoliciesAsync`: `(String, String, String, RequestOptions)` → `(String, String, String, String, RequestOptions)`
  - `getMotorsListingPoliciesAsync`: `(String, String, String, RequestOptions)` → `(String, String, String, String, RequestOptions)`
  - `getMultiCompatibilityPropertyValuesAsync`: `(MultiCompatibilityPropertyValuesRequest, String, RequestOptions)` → `(MultiCompatibilityPropertyValuesRequest, String, String, RequestOptions)`
  - `getNegotiatedPricePoliciesAsync`: `(String, String, String, RequestOptions)` → `(String, String, String, String, String, RequestOptions)`
  - `getProductCompatibilitiesAsync`: `(ProductRequest, String, RequestOptions)` → `(ProductRequest, String, String, RequestOptions)`
  - `getRegulatoryPoliciesAsync`: `(String, String, String, RequestOptions)` → `(String, String, String, String, RequestOptions)`
  - `getReturnPoliciesAsync`: `(String, String, String, RequestOptions)` → `(String, String, String, String, String, RequestOptions)`
  - `getShippingCarriersAsync`: `(String, String, RequestOptions)` → `(String, String, String, RequestOptions)`
  - `getShippingLocationsAsync`: `(String, String, RequestOptions)` → `(String, String, String, RequestOptions)`
  - `getShippingPoliciesAsync`: `(String, String, String, RequestOptions)` → `(String, String, String, String, RequestOptions)`
  - `getShippingServicesAsync`: `(String, String, RequestOptions)` → `(String, String, String, RequestOptions)`
  - `getSiteVisibilityPoliciesAsync`: `(String, String, String, RequestOptions)` → `(String, String, String, String, RequestOptions)`
- The following operations changed signature on `TaxonomyClient`:
  - `getCategorySubtreeAsync`: `(String, String, String, RequestOptions)` → `(String, String, String, String, RequestOptions)`
  - `getCategoryTreeAsync`: `(String, String, RequestOptions)` → `(String, String, String, RequestOptions)`

- The following operations were added to `MetadataClient`:
  - `getMinimumListingPricePoliciesAsync`

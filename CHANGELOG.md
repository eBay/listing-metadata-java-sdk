# ChangeLog

## 0.2.2 (10/15/2026)

### Dependencies

- DCCOMICS-21031: Bumped transitive `com.google.guava:guava` from 33.4.0-jre to 33.7.2-jre for Error Prone and NullAway to fix CVE-2026-102554 (SNYK-JAVA-COMGOOGLEGUAVA-20825054), an allocation of resources without limits vulnerability during deserialization.

## 0.2.1 (09/25/2026)

### Dependencies

- Bumped `com.fasterxml.jackson.core:jackson-databind` from 2.22.2 to 2.22.3.


## 0.2.0 (09/14/2026)

### Breaking changes

#### Changed signatures

`CatalogClient`:

| Operation | Previous parameters | Current parameters |
| --- | --- | --- |
| `getProductAsync` | `(String epid, String accessToken, RequestOptions requestOptions)` | `(String epid, String xEBAYCMARKETPLACEID, String accessToken, RequestOptions requestOptions)` |
| `searchAsync` | `(String aspectFilter, String categoryIds, String fieldgroups, String gtin, String limit, String mpn, String offset, String q, String accessToken, RequestOptions requestOptions)` | `(String aspectFilter, String categoryIds, String fieldgroups, String gtin, String limit, String mpn, String offset, String q, String xEBAYCMARKETPLACEID, String accessToken, RequestOptions requestOptions)` |

`CharityClient`:

| Operation | Previous parameters | Current parameters |
| --- | --- | --- |
| `getCharityOrgAsync` | `(String charityOrgId, String accessToken, RequestOptions requestOptions)` | `(String charityOrgId, String xEBAYCMARKETPLACEID, String accessToken, RequestOptions requestOptions)` |
| `getCharityOrgsAsync` | `(String limit, String offset, String q, String registrationIds, String accessToken, RequestOptions requestOptions)` | `(String limit, String offset, String q, String registrationIds, String xEBAYCMARKETPLACEID, String accessToken, RequestOptions requestOptions)` |

`MetadataClient`:

| Operation | Previous parameters | Current parameters |
| --- | --- | --- |
| `getAutomotivePartsCompatibilityPoliciesAsync` | `(String marketplaceId, String filter, String accessToken, RequestOptions requestOptions)` | `(String marketplaceId, String filter, String acceptEncoding, String accessToken, RequestOptions requestOptions)` |
| `getCategoryPoliciesAsync` | `(String marketplaceId, String filter, String accessToken, RequestOptions requestOptions)` | `(String marketplaceId, String filter, String acceptLanguage, String accessToken, RequestOptions requestOptions)` |
| `getClassifiedAdPoliciesAsync` | `(String marketplaceId, String filter, String accessToken, RequestOptions requestOptions)` | `(String marketplaceId, String filter, String acceptLanguage, String accessToken, RequestOptions requestOptions)` |
| `getCompatibilitiesBySpecificationAsync` | `(SpecificationRequest body, String accessToken, RequestOptions requestOptions)` | `(SpecificationRequest body, String xEBAYCMARKETPLACEID, String accessToken, RequestOptions requestOptions)` |
| `getCompatibilityPropertyNamesAsync` | `(PropertyNamesRequest body, String accessToken, RequestOptions requestOptions)` | `(PropertyNamesRequest body, String xEBAYCMARKETPLACEID, String accessToken, RequestOptions requestOptions)` |
| `getCompatibilityPropertyValuesAsync` | `(PropertyValuesRequest body, String accessToken, RequestOptions requestOptions)` | `(PropertyValuesRequest body, String xEBAYCMARKETPLACEID, String accessToken, RequestOptions requestOptions)` |
| `getCurrenciesAsync` | `(String marketplaceId, String accessToken, RequestOptions requestOptions)` | `(String marketplaceId, String acceptLanguage, String accessToken, RequestOptions requestOptions)` |
| `getExcludeShippingLocationsAsync` | `(String marketplaceId, String accessToken, RequestOptions requestOptions)` | `(String marketplaceId, String acceptLanguage, String accessToken, RequestOptions requestOptions)` |
| `getExtendedProducerResponsibilityPoliciesAsync` | `(String marketplaceId, String filter, String accessToken, RequestOptions requestOptions)` | `(String marketplaceId, String filter, String acceptEncoding, String acceptLanguage, String accessToken, RequestOptions requestOptions)` |
| `getHandlingTimesAsync` | `(String marketplaceId, String accessToken, RequestOptions requestOptions)` | `(String marketplaceId, String acceptLanguage, String accessToken, RequestOptions requestOptions)` |
| `getHazardousMaterialsLabelsAsync` | `(String marketplaceId, String accessToken, RequestOptions requestOptions)` | `(String marketplaceId, String acceptLanguage, String accessToken, RequestOptions requestOptions)` |
| `getItemConditionPoliciesAsync` | `(String marketplaceId, String filter, String accessToken, RequestOptions requestOptions)` | `(String marketplaceId, String filter, String acceptEncoding, String acceptLanguage, String accessToken, RequestOptions requestOptions)` |
| `getListingStructurePoliciesAsync` | `(String marketplaceId, String filter, String accessToken, RequestOptions requestOptions)` | `(String marketplaceId, String filter, String acceptEncoding, String acceptLanguage, String accessToken, RequestOptions requestOptions)` |
| `getListingTypePoliciesAsync` | `(String marketplaceId, String filter, String accessToken, RequestOptions requestOptions)` | `(String marketplaceId, String filter, String acceptLanguage, String accessToken, RequestOptions requestOptions)` |
| `getMotorsListingPoliciesAsync` | `(String marketplaceId, String filter, String accessToken, RequestOptions requestOptions)` | `(String marketplaceId, String filter, String acceptLanguage, String accessToken, RequestOptions requestOptions)` |
| `getMultiCompatibilityPropertyValuesAsync` | `(MultiCompatibilityPropertyValuesRequest body, String accessToken, RequestOptions requestOptions)` | `(MultiCompatibilityPropertyValuesRequest body, String xEBAYCMARKETPLACEID, String accessToken, RequestOptions requestOptions)` |
| `getNegotiatedPricePoliciesAsync` | `(String marketplaceId, String filter, String accessToken, RequestOptions requestOptions)` | `(String marketplaceId, String filter, String acceptEncoding, String acceptLanguage, String accessToken, RequestOptions requestOptions)` |
| `getProductCompatibilitiesAsync` | `(ProductRequest body, String accessToken, RequestOptions requestOptions)` | `(ProductRequest body, String xEBAYCMARKETPLACEID, String accessToken, RequestOptions requestOptions)` |
| `getRegulatoryPoliciesAsync` | `(String marketplaceId, String filter, String accessToken, RequestOptions requestOptions)` | `(String marketplaceId, String filter, String acceptLanguage, String accessToken, RequestOptions requestOptions)` |
| `getReturnPoliciesAsync` | `(String marketplaceId, String filter, String accessToken, RequestOptions requestOptions)` | `(String marketplaceId, String filter, String acceptEncoding, String acceptLanguage, String accessToken, RequestOptions requestOptions)` |
| `getShippingCarriersAsync` | `(String marketplaceId, String accessToken, RequestOptions requestOptions)` | `(String marketplaceId, String acceptLanguage, String accessToken, RequestOptions requestOptions)` |
| `getShippingLocationsAsync` | `(String marketplaceId, String accessToken, RequestOptions requestOptions)` | `(String marketplaceId, String acceptLanguage, String accessToken, RequestOptions requestOptions)` |
| `getShippingPoliciesAsync` | `(String marketplaceId, String filter, String accessToken, RequestOptions requestOptions)` | `(String marketplaceId, String filter, String acceptLanguage, String accessToken, RequestOptions requestOptions)` |
| `getShippingServicesAsync` | `(String marketplaceId, String accessToken, RequestOptions requestOptions)` | `(String marketplaceId, String acceptLanguage, String accessToken, RequestOptions requestOptions)` |
| `getSiteVisibilityPoliciesAsync` | `(String marketplaceId, String filter, String accessToken, RequestOptions requestOptions)` | `(String marketplaceId, String filter, String acceptLanguage, String accessToken, RequestOptions requestOptions)` |

`TaxonomyClient`:

| Operation | Previous parameters | Current parameters |
| --- | --- | --- |
| `getCategorySubtreeAsync` | `(String categoryTreeId, String categoryId, String accessToken, RequestOptions requestOptions)` | `(String categoryTreeId, String categoryId, String acceptEncoding, String accessToken, RequestOptions requestOptions)` |
| `getCategoryTreeAsync` | `(String categoryTreeId, String accessToken, RequestOptions requestOptions)` | `(String categoryTreeId, String acceptEncoding, String accessToken, RequestOptions requestOptions)` |

### Added

- `MetadataClient.getMinimumListingPricePoliciesAsync`.
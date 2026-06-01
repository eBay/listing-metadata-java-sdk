# eBay Listing Metadata Java SDK

A production-ready Java SDK for eBay Listing Metadata APIs, providing unified access to Catalog, Charity, Taxonomy, and Metadata REST APIs.

## Features

- **Catalog API**: Search and retrieve eBay catalog products (2 operations)
- **Charity API**: Find and retrieve charitable organizations (2 operations)
- **Taxonomy API**: Category trees, item aspects, and compatibility data (9 operations)
- **Metadata API**: Marketplace policies, shipping data, and compatibility information (28 operations)
- **Strong Typing**: Internal Kiota-generated types with public client wrappers
- **Per-call Overrides**: Pass per-request headers and access tokens alongside SDK-wide defaults

## Architecture

```
src/main/java/com/ebay/listingmetadata/
├── generated/                         # Kiota-generated REST clients (internal)
│   ├── catalog/
│   ├── charity/
│   ├── taxonomy/
│   └── metadata/
├── clients/
│   └── rest/
│       ├── CatalogClient.java         # REST client wrappers (public API)
│       ├── CharityClient.java
│       ├── TaxonomyClient.java
│       └── MetadataClient.java
├── configuration/                     # SDK configuration and auth
├── exceptions/                        # SDK exceptions
└── ListingMetadataClient.java         # Main SDK facade
```

## Requirements

- Java 17+
- Maven

## Installation

```xml
<dependency>
    <groupId>com.ebay</groupId>
    <artifactId>listing-metadata-java-sdk</artifactId>
    <version>1.0.0</version>
</dependency>
```

## Quick Start

```java
var config = new ListingMetadataConfiguration();
config.setAccessToken("your-oauth-token");

try (var sdk = new ListingMetadataClient(config)) {
    var product = sdk.catalog.getProduct("12345", null, null);
    var tree = sdk.taxonomy.getCategoryTree("0", null, null);
    var returnPolicies = sdk.metadata.getReturnPolicies("EBAY_US", null, null, null);
    var charities = sdk.charity.getCharityOrgs("20", "0", "cancer", null, null, null);
}
```

Per-request headers and tokens can be passed to any method:

```java
var options = new RequestOptions();
options.addHeader("X-EBAY-C-MARKETPLACE-ID", "EBAY_US");

sdk.taxonomy.getCategoryTree("0", "per-call-token", options);
```

## API Operations

### Catalog API

| Method | Description |
|---|---|
| `getProduct` | Get a catalog product by ePID |
| `search` | Search for catalog products |

### Charity API

| Method | Description |
|---|---|
| `getCharityOrg` | Get a charitable organization by ID |
| `getCharityOrgs` | Search for charitable organizations |

### Taxonomy API

| Method | Description |
|---|---|
| `getDefaultCategoryTreeId` | Get the default category tree ID for a marketplace |
| `getCategoryTree` | Get the complete category tree |
| `getCategorySubtree` | Get a category subtree |
| `getCategorySuggestions` | Get category suggestions by keyword |
| `getItemAspectsForCategory` | Get item aspects for a category |
| `fetchItemAspects` | Fetch all item aspects in bulk |
| `getCompatibilityProperties` | Get compatibility properties for a category |
| `getCompatibilityPropertyValues` | Get compatibility property values |
| `getExpiredCategories` | Get expired categories |

### Metadata API

| Method | Description |
|---|---|
| `getAutomotivePartsCompatibilityPolicies` | Get automotive parts compatibility policies |
| `getCategoryPolicies` | Get category policies |
| `getClassifiedAdPolicies` | Get classified ad policies |
| `getCurrencies` | Get supported currencies |
| `getExtendedProducerResponsibilityPolicies` | Get extended producer responsibility policies |
| `getHazardousMaterialsLabels` | Get hazardous materials labels |
| `getItemConditionPolicies` | Get item condition policies |
| `getListingStructurePolicies` | Get listing structure policies |
| `getListingTypePolicies` | Get listing type policies |
| `getMotorsListingPolicies` | Get motors listing policies |
| `getNegotiatedPricePolicies` | Get negotiated price policies |
| `getProductSafetyLabels` | Get product safety labels |
| `getRegulatoryPolicies` | Get regulatory policies |
| `getReturnPolicies` | Get return policies |
| `getShippingPolicies` | Get shipping policies |
| `getSiteVisibilityPolicies` | Get site visibility policies |
| `getCompatibilitiesBySpecification` | Get compatibilities by specification |
| `getCompatibilityPropertyNames` | Get compatibility property names |
| `getCompatibilityPropertyValues` | Get compatibility property values |
| `getMultiCompatibilityPropertyValues` | Get multi-compatibility property values |
| `getProductCompatibilities` | Get product compatibilities |
| `getExcludeShippingLocations` | Get exclude shipping locations |
| `getHandlingTimes` | Get handling times |
| `getShippingCarriers` | Get shipping carriers |
| `getShippingLocations` | Get shipping locations |
| `getShippingServices` | Get shipping services |
| `getSalesTaxJurisdictions` | Get sales tax jurisdictions |
| `getItemAspectsForCategory` | Get item aspects for a metadata category |

## Error Handling

```java
try {
    var product = sdk.catalog.getProduct("12345", null, null);
} catch (ListingMetadataException ex) {
    System.err.println("SDK error: " + ex.getMessage());
}
```

## Configuration Options

| Property | Default | Description |
|---|---|---|
| `catalogBaseUrl` | `https://api.ebay.com/commerce/catalog/v1_beta` | Catalog API base URL |
| `charityBaseUrl` | `https://api.ebay.com/commerce/charity/v1` | Charity API base URL |
| `taxonomyBaseUrl` | `https://api.ebay.com/commerce/taxonomy/v1` | Taxonomy API base URL |
| `metadataBaseUrl` | `https://api.ebay.com/sell/metadata/v1` | Metadata API base URL |
| `accessToken` | `null` | Static fallback token; per-call token takes precedence |
| `defaultRequestOptions` | `RequestOptions()` | Default headers applied to all SDK calls |
| `diagnosticLogging` | `false` | Enable diagnostic request/response logging |

## Regenerating the SDK

```bash
./generate.sh
mvn clean install
```

## Development

```bash
mvn clean install   # Build and install
mvn test            # Run tests
mvn package         # Package
```

## Specs

- `commerce_catalog_v1_beta_oas3.yaml` — Catalog V1 Beta
- `commerce_charity_v1_oas3.yaml` — Charity V1
- `commerce_taxonomy_v1_oas3.yaml` — Taxonomy V1
- `sell_metadata_v1_oas3.yaml` — Metadata V1
- `eBay_Graph.graphqls` — eBay Graph schema

## Dependencies

- **microsoft-kiota-bundle**: REST client generation and runtime
- **okhttp3**: HTTP client
- **jackson-databind**: JSON processing
- **slf4j-api**: Logging facade

## License

Apache 2.0 © 2026 eBay Inc. See [LICENSE](LICENSE) for details.

# Listing Metadata Java SDK

A production-ready Java SDK for eBay Listing Metadata APIs, providing unified access to catalog products, charitable organizations, category taxonomies, and marketplace metadata.

## Features

- **Catalog API**: Search and retrieve eBay catalog products (2 operations)
- **Charity API**: Find and retrieve charitable organizations (2 operations)
- **Taxonomy API**: Access category trees, aspects, and compatibility data (9 operations)
- **Metadata API**: Retrieve marketplace policies, shipping data, and compatibility information (27 operations)
- **Per-Call Authentication**: Token can be passed per-call or set globally
- **Strong Typing**: Kiota-generated types with public abstraction layer
- **Custom Headers Support**: Per-call and global header configuration via RequestOptions
- **Java 17+**: Modern Java with synchronous APIs

## Architecture

```
src/main/java/com/ebay/listingmetadata/
├── generated/                    # Kiota-generated REST clients (package-private)
│   ├── catalog/
│   ├── charity/
│   ├── taxonomy/
│   └── metadata/
├── clients/
│   └── rest/
│       ├── CatalogClient.java
│       ├── CharityClient.java
│       ├── TaxonomyClient.java
│       └── MetadataClient.java
├── configuration/                # SDK configuration and auth
├── exceptions/                   # SDK exceptions
└── ListingMetadataClient.java   # Main SDK facade
```

## Installation

```bash
# Build from source
mvn clean install

# Publish to local Maven repository
mvn install -DskipTests
```

Then add the dependency to your project:

```xml
<dependency>
    <groupId>com.ebay</groupId>
    <artifactId>listing-metadata-java-sdk</artifactId>
    <version>1.0.0</version>
</dependency>
```

## Quick Start

### 1. Basic Usage

```java
import com.ebay.listingmetadata.ListingMetadataClient;
import com.ebay.listingmetadata.configuration.ListingMetadataConfiguration;

var config = new ListingMetadataConfiguration();
config.setAccessToken("your-ebay-oauth-token");

try (var sdk = new ListingMetadataClient(config)) {
    // Get catalog product by ePID
    var product = sdk.catalog.getProduct("12345", null, null);
    System.out.println("Product: " + product);
}
```

### 2. Per-Call Token (Multi-Tenant)

```java
var config = new ListingMetadataConfiguration();
// No global token set

try (var sdk = new ListingMetadataClient(config)) {
    // Pass token per-call for multi-tenant scenarios
    String userToken = getUserTokenFromRequest();
    var product = sdk.catalog.getProduct("12345", userToken, null);
}
```

### 3. Custom Headers (RequestOptions)

```java
import com.ebay.listingmetadata.configuration.RequestOptions;

var config = new ListingMetadataConfiguration();
config.setAccessToken("token");

// Set default headers for ALL calls
config.getDefaultRequestOptions().addHeader("X-EBAY-C-MARKETPLACE-ID", "EBAY_US");
config.getDefaultRequestOptions().addHeader("Accept-Language", "en-US");

try (var sdk = new ListingMetadataClient(config)) {
    // Per-call headers override defaults
    var options = new RequestOptions();
    options.addHeader("X-EBAY-C-MARKETPLACE-ID", "EBAY_UK");  // Override marketplace
    options.addHeader("X-Request-ID", "correlation-123");     // Add correlation ID
    
    var products = sdk.catalog.search(null, "9355", null, null, null, null, null, "iPhone", null, options);
}
```

## API Reference

### Catalog API (2 operations)

```java
// Get product details by ePID
var product = sdk.catalog.getProduct(
    "12345",        // epid - eBay product identifier
    token,
    options
);

// Search for products
var results = sdk.catalog.search(
    null,           // aspectFilter - Category and aspect value pairs
    "9355",         // categoryIds - Comma-separated category IDs
    "FULL",         // fieldgroups - ASPECT_REFINEMENTS, FULL, MATCHING_PRODUCTS
    "0885909950805", // gtin - Comma-separated GTINs
    "50",           // limit - Max 200, default 50
    null,           // mpn - Manufacturer Part Numbers
    null,           // offset
    "iPhone",       // q - Keywords
    token,
    options
);
```

### Charity API (2 operations)

```java
// Get charity organization by ID
var charity = sdk.charity.getCharityOrg(
    "charity-org-id",
    token,
    options
);

// Search for charitable organizations
var charities = sdk.charity.getCharityOrgs(
    "20",           // limit - 1-100, default 20
    "0",            // offset
    "cancer",       // q - Keywords
    null,           // registrationIds
    token,
    options
);
```

### Taxonomy API (9 operations)

```java
// Get default category tree ID for a marketplace
var treeId = sdk.taxonomy.getDefaultCategoryTreeId(
    "EBAY_US",      // marketplaceId
    token,
    options
);

// Get complete category tree
var tree = sdk.taxonomy.getCategoryTree(
    "0",            // categoryTreeId
    token,
    options
);

// Get category subtree
var subtree = sdk.taxonomy.getCategorySubtree(
    "0",            // categoryTreeId
    "550",          // categoryId
    token,
    options
);

// Get category suggestions
var suggestions = sdk.taxonomy.getCategorySuggestions(
    "0",            // categoryTreeId
    "iPhone",       // q - Keywords
    token,
    options
);

// Get item aspects for category
var aspects = sdk.taxonomy.getItemAspectsForCategory(
    "0",            // categoryTreeId
    "9355",         // categoryId
    token,
    options
);

// Fetch all item aspects (bulk)
var allAspects = sdk.taxonomy.fetchItemAspects(
    "0",            // categoryTreeId
    token,
    options
);

// Get compatibility properties
var properties = sdk.taxonomy.getCompatibilityProperties(
    "0",            // categoryTreeId
    "6016",         // categoryId
    token,
    options
);

// Get compatibility property values
var values = sdk.taxonomy.getCompatibilityPropertyValues(
    "0",            // categoryTreeId
    "6016",         // categoryId
    "Make",         // compatibilityProperty
    null,           // filter
    token,
    options
);

// Get expired categories
var expired = sdk.taxonomy.getExpiredCategories(
    "0",            // categoryTreeId
    token,
    options
);
```

### Metadata API (27 operations)

#### Marketplace Policies (17 operations)

```java
// Get automotive parts compatibility policies
var autoPolicies = sdk.metadata.getAutomotivePartsCompatibilityPolicies(
    "EBAY_US",      // marketplaceId
    "filter=categoryIds:{6016}", // filter
    token,
    options
);

// Get category policies
var categoryPolicies = sdk.metadata.getCategoryPolicies("EBAY_US", null, token, options);

// Get classified ad policies
var classifiedPolicies = sdk.metadata.getClassifiedAdPolicies("EBAY_US", null, token, options);

// Get supported currencies
var currencies = sdk.metadata.getCurrencies("EBAY_US", token, options);

// Get extended producer responsibility policies
var eprPolicies = sdk.metadata.getExtendedProducerResponsibilityPolicies("EBAY_US", null, token, options);

// Get hazardous materials labels
var hazmatLabels = sdk.metadata.getHazardousMaterialsLabels("EBAY_US", token, options);

// Get item condition policies
var conditionPolicies = sdk.metadata.getItemConditionPolicies("EBAY_US", null, token, options);

// Get listing structure policies
var structurePolicies = sdk.metadata.getListingStructurePolicies("EBAY_US", null, token, options);

// Get listing type policies
var typePolicies = sdk.metadata.getListingTypePolicies("EBAY_US", null, token, options);

// Get motors listing policies
var motorsPolicies = sdk.metadata.getMotorsListingPolicies("EBAY_US", null, token, options);

// Get negotiated price policies
var pricePolicies = sdk.metadata.getNegotiatedPricePolicies("EBAY_US", null, token, options);

// Get product safety labels
var safetyLabels = sdk.metadata.getProductSafetyLabels("EBAY_US", token, options);

// Get regulatory policies
var regulatoryPolicies = sdk.metadata.getRegulatoryPolicies("EBAY_US", null, token, options);

// Get return policies
var returnPolicies = sdk.metadata.getReturnPolicies("EBAY_US", null, token, options);

// Get shipping policies
var shippingPolicies = sdk.metadata.getShippingPolicies("EBAY_US", null, token, options);

// Get site visibility policies
var visibilityPolicies = sdk.metadata.getSiteVisibilityPolicies("EBAY_US", null, token, options);
```

#### Compatibility Operations (5 operations)

```java
import com.ebay.listingmetadata.generated.metadata.models.*;

// Get compatibilities by specification
var specRequest = new SpecificationRequest();
// Set specification fields...
var compatibilities = sdk.metadata.getCompatibilitiesBySpecification(specRequest, token, options);

// Get compatibility property names
var namesRequest = new PropertyNamesRequest();
// Set property names fields...
var propertyNames = sdk.metadata.getCompatibilityPropertyNames(namesRequest, token, options);

// Get compatibility property values
var valuesRequest = new PropertyValuesRequest();
// Set property values fields...
var propertyValues = sdk.metadata.getCompatibilityPropertyValues(valuesRequest, token, options);

// Get multi compatibility property values
var multiRequest = new MultiCompatibilityPropertyValuesRequest();
// Set multi-property fields...
var multiValues = sdk.metadata.getMultiCompatibilityPropertyValues(multiRequest, token, options);

// Get product compatibilities
var productRequest = new ProductRequest();
// Set product fields...
var productCompat = sdk.metadata.getProductCompatibilities(productRequest, token, options);
```

#### Shipping Operations (5 operations)

```java
// Get exclude shipping locations
var excludeLocations = sdk.metadata.getExcludeShippingLocations("EBAY_US", token, options);

// Get handling times
var handlingTimes = sdk.metadata.getHandlingTimes("EBAY_US", token, options);

// Get shipping carriers
var carriers = sdk.metadata.getShippingCarriers("EBAY_US", token, options);

// Get shipping locations
var shippingLocations = sdk.metadata.getShippingLocations("EBAY_US", token, options);

// Get shipping services
var shippingServices = sdk.metadata.getShippingServices("EBAY_US", token, options);
```

#### Sales Tax Jurisdictions (1 operation)

```java
// Get sales tax jurisdictions
var jurisdictions = sdk.metadata.getSalesTaxJurisdictions(
    "US",           // countryCode - US or CA
    token,
    options
);
```

## Configuration

### ListingMetadataConfiguration Options

```java
var config = new ListingMetadataConfiguration();

// Base URLs (defaults shown)
config.setCatalogBaseUrl("https://api.ebay.com/commerce/catalog/v1_beta");
config.setCharityBaseUrl("https://api.ebay.com/commerce/charity/v1");
config.setTaxonomyBaseUrl("https://api.ebay.com/commerce/taxonomy/v1");
config.setMetadataBaseUrl("https://api.ebay.com/sell/metadata/v1");

// Authentication
config.setAccessToken("your-token");  // Optional fallback token

// Diagnostics
config.setDiagnosticLogging(true);    // Enable request/response logging

// Default headers (applied to all requests)
config.getDefaultRequestOptions().addHeader("X-EBAY-C-MARKETPLACE-ID", "EBAY_US");
config.getDefaultRequestOptions().addHeader("Accept-Language", "en-US");
```

## API Coverage Summary

| API | Operations | Description |
|-----|------------|-------------|
| **Catalog** | 2 | Search and retrieve catalog products |
| **Charity** | 2 | Find charitable organizations |
| **Taxonomy** | 9 | Category trees, aspects, compatibility |
| **Metadata** | 27 | Marketplace policies, shipping, tax |
| **Total** | **40** | |

## Regenerating REST Clients

If the OpenAPI specs are updated:

```bash
./generate.sh
mvn clean install
```

This will regenerate all Kiota clients from the specs in the `specs/` directory.

## Requirements

- Java 17 or higher
- Kiota CLI (for regeneration only)

## Dependencies

- `microsoft.kiota:microsoft-kiota-bundle:1.9.2` - REST client runtime
- `com.squareup.okhttp3:okhttp:4.12.0` - HTTP client
- `com.fasterxml.jackson.core:jackson-databind:2.18.2` - JSON processing

## Project Structure

```
listing-metadata-java-sdk/
├── specs/                       # OpenAPI specs
│   ├── commerce_catalog_v1_beta_oas3.yaml
│   ├── commerce_charity_v1_oas3.yaml
│   ├── commerce_taxonomy_v1_oas3.yaml
│   └── sell_metadata_v1_oas3.yaml
├── src/main/java/
│   └── com/ebay/listingmetadata/
│       ├── ListingMetadataClient.java
│       ├── configuration/
│       │   ├── ListingMetadataConfiguration.java
│       │   ├── TokenContext.java
│       │   ├── RequestOptions.java
│       │   └── KiotaAuthProvider.java
│       ├── clients/
│       │   └── rest/
│       │       ├── CatalogClient.java
│       │       ├── CharityClient.java
│       │       ├── TaxonomyClient.java
│       │       └── MetadataClient.java
│       ├── generated/           # Kiota-generated (committed)
│       │   ├── catalog/
│       │   ├── charity/
│       │   ├── taxonomy/
│       │   └── metadata/
│       └── exceptions/
│           └── ListingMetadataException.java
├── pom.xml
├── generate.sh
├── operations.json
└── README.md
```

## Consistency with .NET and PHP SDKs

This Java SDK mirrors the architecture of the .NET and PHP Listing Metadata SDKs:

- **Same API Coverage**: All 40 operations across 4 APIs
- **Same Auth Pattern**: Per-call token with optional fallback
- **Same Naming**: `ListingMetadataClient`, `ListingMetadataConfiguration`
- **Same Structure**: Generated layer + thin abstraction wrappers
- **Same Tooling**: Kiota for REST code generation
- **RequestOptions Support**: Per-call and global custom headers

The main difference is the async model: Java uses synchronous calls with exception handling, .NET uses `Task`, and PHP is synchronous with similar patterns.

## Error Handling

```java
try (var sdk = new ListingMetadataClient(config)) {
    var product = sdk.catalog.getProduct("12345", token, null);
} catch (RuntimeException e) {
    // Handle API errors
    System.err.println("Error: " + e.getMessage());
    e.printStackTrace();
}
```

## License

Internal eBay use only.

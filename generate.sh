#!/bin/bash
set -e
echo "Generating Listing Metadata Java SDK with Kiota..."
rm -rf src/main/java/com/ebay/listingmetadata/generated

echo "Generating Catalog API client..."
kiota generate -l java -d specs/commerce_catalog_v1_beta_oas3.yaml \
  -c CatalogApiClient -n com.ebay.listingmetadata.generated.catalog \
  -o src/main/java/com/ebay/listingmetadata/generated/catalog --ebc --co

echo "Generating Charity API client..."
kiota generate -l java -d specs/commerce_charity_v1_oas3.yaml \
  -c CharityApiClient -n com.ebay.listingmetadata.generated.charity \
  -o src/main/java/com/ebay/listingmetadata/generated/charity --ebc --co

echo "Generating Taxonomy API client..."
kiota generate -l java -d specs/commerce_taxonomy_v1_oas3.yaml \
  -c TaxonomyApiClient -n com.ebay.listingmetadata.generated.taxonomy \
  -o src/main/java/com/ebay/listingmetadata/generated/taxonomy --ebc --co

echo "Generating Metadata API client..."
kiota generate -l java -d specs/sell_metadata_v1_oas3.yaml \
  -c MetadataApiClient -n com.ebay.listingmetadata.generated.metadata \
  -o src/main/java/com/ebay/listingmetadata/generated/metadata --ebc --co


echo "Adding license headers to generated files..."
./add-license-headers.sh ./src

echo "Code generation complete!"

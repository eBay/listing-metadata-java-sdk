#!/usr/bin/env bash

# Copyright 2026 eBay Inc.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

set -euo pipefail

echo "Generating Listing Metadata Java SDK with Kiota..."
rm -rf src/main/java/com/ebay/listingmetadata/generated

echo "Generating CatalogApiClient..."
kiota generate -l java -d specs/openapi/catalog.yaml \
  -c CatalogApiClient -n com.ebay.listingmetadata.generated.catalog \
  -o src/main/java/com/ebay/listingmetadata/generated/catalog --ebc --co

echo "Generating CharityApiClient..."
kiota generate -l java -d specs/openapi/charity.yaml \
  -c CharityApiClient -n com.ebay.listingmetadata.generated.charity \
  -o src/main/java/com/ebay/listingmetadata/generated/charity --ebc --co

echo "Generating MetadataApiClient..."
kiota generate -l java -d specs/openapi/metadata.yaml \
  -c MetadataApiClient -n com.ebay.listingmetadata.generated.metadata \
  -o src/main/java/com/ebay/listingmetadata/generated/metadata --ebc --co

echo "Generating TaxonomyApiClient..."
kiota generate -l java -d specs/openapi/taxonomy.yaml \
  -c TaxonomyApiClient -n com.ebay.listingmetadata.generated.taxonomy \
  -o src/main/java/com/ebay/listingmetadata/generated/taxonomy --ebc --co

echo "Adding license headers to generated files..."
./add-license-headers.sh ./src
echo "Code generation complete!"

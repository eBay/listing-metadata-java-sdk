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

package com.ebay.listingmetadata.generated.metadata.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines the base response fields of the &lt;b&gt;getListingStructuresPolicies&lt;/b&gt; method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ListingStructurePolicyResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Returns a list of category IDs plus a flag indicating whether or not each listed category supports item variations.
     */
    private java.util.List<ListingStructurePolicy> listingStructurePolicies;
    /**
     * Collection of warnings generated for the request
     */
    private java.util.List<ErrorDetailV3> warnings;
    /**
     * Instantiates a new {@link ListingStructurePolicyResponse} and sets the default values.
     */
    public ListingStructurePolicyResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ListingStructurePolicyResponse}
     */
    @jakarta.annotation.Nonnull
    public static ListingStructurePolicyResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ListingStructurePolicyResponse();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("listingStructurePolicies", (n) -> { this.setListingStructurePolicies(n.getCollectionOfObjectValues(ListingStructurePolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("warnings", (n) -> { this.setWarnings(n.getCollectionOfObjectValues(ErrorDetailV3::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the listingStructurePolicies property value. Returns a list of category IDs plus a flag indicating whether or not each listed category supports item variations.
     * @return a {@link java.util.List<ListingStructurePolicy>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ListingStructurePolicy> getListingStructurePolicies() {
        return this.listingStructurePolicies;
    }
    /**
     * Gets the warnings property value. Collection of warnings generated for the request
     * @return a {@link java.util.List<ErrorDetailV3>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ErrorDetailV3> getWarnings() {
        return this.warnings;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("listingStructurePolicies", this.getListingStructurePolicies());
        writer.writeCollectionOfObjectValues("warnings", this.getWarnings());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the listingStructurePolicies property value. Returns a list of category IDs plus a flag indicating whether or not each listed category supports item variations.
     * @param value Value to set for the listingStructurePolicies property.
     */
    public void setListingStructurePolicies(@jakarta.annotation.Nullable final java.util.List<ListingStructurePolicy> value) {
        this.listingStructurePolicies = value;
    }
    /**
     * Sets the warnings property value. Collection of warnings generated for the request
     * @param value Value to set for the warnings property.
     */
    public void setWarnings(@jakarta.annotation.Nullable final java.util.List<ErrorDetailV3> value) {
        this.warnings = value;
    }
}

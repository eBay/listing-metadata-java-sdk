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
 * This type defines the response container for the &lt;b&gt;getMinimumListingPricePolicies&lt;/b&gt; method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetMinimumListingPricePoliciesResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This array returns a list of minimum listing price policies for supported types of listings on the specific marketplace
     */
    private java.util.List<MinimumListingPricePoliciesType> minimumListingPricePolicies;
    /**
     * Instantiates a new {@link GetMinimumListingPricePoliciesResponse} and sets the default values.
     */
    public GetMinimumListingPricePoliciesResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GetMinimumListingPricePoliciesResponse}
     */
    @jakarta.annotation.Nonnull
    public static GetMinimumListingPricePoliciesResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetMinimumListingPricePoliciesResponse();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("minimumListingPricePolicies", (n) -> { this.setMinimumListingPricePolicies(n.getCollectionOfObjectValues(MinimumListingPricePoliciesType::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the minimumListingPricePolicies property value. This array returns a list of minimum listing price policies for supported types of listings on the specific marketplace
     * @return a {@link java.util.List<MinimumListingPricePoliciesType>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MinimumListingPricePoliciesType> getMinimumListingPricePolicies() {
        return this.minimumListingPricePolicies;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("minimumListingPricePolicies", this.getMinimumListingPricePolicies());
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
     * Sets the minimumListingPricePolicies property value. This array returns a list of minimum listing price policies for supported types of listings on the specific marketplace
     * @param value Value to set for the minimumListingPricePolicies property.
     */
    public void setMinimumListingPricePolicies(@jakarta.annotation.Nullable final java.util.List<MinimumListingPricePoliciesType> value) {
        this.minimumListingPricePolicies = value;
    }
}

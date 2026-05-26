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
 * This type contains the kind of distance and radius of the selling area for Local Market Vehicle listings.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LocalListingDistance implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This array indicates the radius (in miles) of the selling area for Local Market Vehicle listings.
     */
    private java.util.List<Integer> distances;
    /**
     * This enumerated value indicates the type of local listing distances, such as non-subscription or regular, for items listed by sellers. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:DistanceType&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String distanceType;
    /**
     * Instantiates a new {@link LocalListingDistance} and sets the default values.
     */
    public LocalListingDistance() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link LocalListingDistance}
     */
    @jakarta.annotation.Nonnull
    public static LocalListingDistance createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LocalListingDistance();
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
     * Gets the distances property value. This array indicates the radius (in miles) of the selling area for Local Market Vehicle listings.
     * @return a {@link java.util.List<Integer>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Integer> getDistances() {
        return this.distances;
    }
    /**
     * Gets the distanceType property value. This enumerated value indicates the type of local listing distances, such as non-subscription or regular, for items listed by sellers. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:DistanceType&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDistanceType() {
        return this.distanceType;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("distances", (n) -> { this.setDistances(n.getCollectionOfPrimitiveValues(Integer.class)); });
        deserializerMap.put("distanceType", (n) -> { this.setDistanceType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("distances", this.getDistances());
        writer.writeStringValue("distanceType", this.getDistanceType());
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
     * Sets the distances property value. This array indicates the radius (in miles) of the selling area for Local Market Vehicle listings.
     * @param value Value to set for the distances property.
     */
    public void setDistances(@jakarta.annotation.Nullable final java.util.List<Integer> value) {
        this.distances = value;
    }
    /**
     * Sets the distanceType property value. This enumerated value indicates the type of local listing distances, such as non-subscription or regular, for items listed by sellers. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:DistanceType&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the distanceType property.
     */
    public void setDistanceType(@jakarta.annotation.Nullable final String value) {
        this.distanceType = value;
    }
}

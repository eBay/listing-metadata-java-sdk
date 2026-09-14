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
 * This type identifies the kind of listing and its duration periods.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ListingDuration implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This array defines the supported time duration options available for the listing type.
     */
    private java.util.List<DurationEnum> durationValues;
    /**
     * The enumerated value returned in this field indicates the listing type for the duration value(s).
     */
    private ListingTypeEnum listingType;
    /**
     * Instantiates a new {@link ListingDuration} and sets the default values.
     */
    public ListingDuration() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ListingDuration}
     */
    @jakarta.annotation.Nonnull
    public static ListingDuration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ListingDuration();
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
     * Gets the durationValues property value. This array defines the supported time duration options available for the listing type.
     * @return a {@link java.util.List<DurationEnum>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DurationEnum> getDurationValues() {
        return this.durationValues;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("durationValues", (n) -> { this.setDurationValues(n.getCollectionOfEnumValues(DurationEnum::forValue)); });
        deserializerMap.put("listingType", (n) -> { this.setListingType(n.getEnumValue(ListingTypeEnum::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the listingType property value. The enumerated value returned in this field indicates the listing type for the duration value(s).
     * @return a {@link ListingTypeEnum}
     */
    @jakarta.annotation.Nullable
    public ListingTypeEnum getListingType() {
        return this.listingType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfEnumValues("durationValues", this.getDurationValues());
        writer.writeEnumValue("listingType", this.getListingType());
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
     * Sets the durationValues property value. This array defines the supported time duration options available for the listing type.
     * @param value Value to set for the durationValues property.
     */
    public void setDurationValues(@jakarta.annotation.Nullable final java.util.List<DurationEnum> value) {
        this.durationValues = value;
    }
    /**
     * Sets the listingType property value. The enumerated value returned in this field indicates the listing type for the duration value(s).
     * @param value Value to set for the listingType property.
     */
    public void setListingType(@jakarta.annotation.Nullable final ListingTypeEnum value) {
        this.listingType = value;
    }
}

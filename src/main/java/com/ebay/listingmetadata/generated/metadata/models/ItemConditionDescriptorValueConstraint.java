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
 * This type shows the constraints on a condition descriptor value, such as any associated condition descriptor ID and condition descriptor value IDs required for a listing.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ItemConditionDescriptorValueConstraint implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This string is returned if the corresponding condition descriptor value requires an associated condition descriptor that must also be specified in a listing. The condition descriptor ID for the associated condition descriptors is returned here.
     */
    private String applicableToConditionDescriptorId;
    /**
     * This array is returned if the corresponding condition descriptor value is required for one or more associated condition descriptor values that must also be specified in a listing. The condition descriptor values IDs for the associated condition descriptor values are returned here.
     */
    private java.util.List<String> applicableToConditionDescriptorValueIds;
    /**
     * Instantiates a new {@link ItemConditionDescriptorValueConstraint} and sets the default values.
     */
    public ItemConditionDescriptorValueConstraint() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ItemConditionDescriptorValueConstraint}
     */
    @jakarta.annotation.Nonnull
    public static ItemConditionDescriptorValueConstraint createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ItemConditionDescriptorValueConstraint();
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
     * Gets the applicableToConditionDescriptorId property value. This string is returned if the corresponding condition descriptor value requires an associated condition descriptor that must also be specified in a listing. The condition descriptor ID for the associated condition descriptors is returned here.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getApplicableToConditionDescriptorId() {
        return this.applicableToConditionDescriptorId;
    }
    /**
     * Gets the applicableToConditionDescriptorValueIds property value. This array is returned if the corresponding condition descriptor value is required for one or more associated condition descriptor values that must also be specified in a listing. The condition descriptor values IDs for the associated condition descriptor values are returned here.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getApplicableToConditionDescriptorValueIds() {
        return this.applicableToConditionDescriptorValueIds;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("applicableToConditionDescriptorId", (n) -> { this.setApplicableToConditionDescriptorId(n.getStringValue()); });
        deserializerMap.put("applicableToConditionDescriptorValueIds", (n) -> { this.setApplicableToConditionDescriptorValueIds(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("applicableToConditionDescriptorId", this.getApplicableToConditionDescriptorId());
        writer.writeCollectionOfPrimitiveValues("applicableToConditionDescriptorValueIds", this.getApplicableToConditionDescriptorValueIds());
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
     * Sets the applicableToConditionDescriptorId property value. This string is returned if the corresponding condition descriptor value requires an associated condition descriptor that must also be specified in a listing. The condition descriptor ID for the associated condition descriptors is returned here.
     * @param value Value to set for the applicableToConditionDescriptorId property.
     */
    public void setApplicableToConditionDescriptorId(@jakarta.annotation.Nullable final String value) {
        this.applicableToConditionDescriptorId = value;
    }
    /**
     * Sets the applicableToConditionDescriptorValueIds property value. This array is returned if the corresponding condition descriptor value is required for one or more associated condition descriptor values that must also be specified in a listing. The condition descriptor values IDs for the associated condition descriptor values are returned here.
     * @param value Value to set for the applicableToConditionDescriptorValueIds property.
     */
    public void setApplicableToConditionDescriptorValueIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.applicableToConditionDescriptorValueIds = value;
    }
}

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
 * This type defines the fields associated with a property name.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PropertyNamesResponsePropertyNames implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The display name of a property. This is the localized name of the compatible property.
     */
    private String propertyDisplayName;
    /**
     * The canonical name of a property. This value is used as part of the name-value pairs used to specify compatibility.
     */
    private String propertyName;
    /**
     * The metadata for a property.
     */
    private PropertyNamesResponsePropertyNameMetadata propertyNameMetadata;
    /**
     * Instantiates a new {@link PropertyNamesResponsePropertyNames} and sets the default values.
     */
    public PropertyNamesResponsePropertyNames() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PropertyNamesResponsePropertyNames}
     */
    @jakarta.annotation.Nonnull
    public static PropertyNamesResponsePropertyNames createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PropertyNamesResponsePropertyNames();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("propertyDisplayName", (n) -> { this.setPropertyDisplayName(n.getStringValue()); });
        deserializerMap.put("propertyName", (n) -> { this.setPropertyName(n.getStringValue()); });
        deserializerMap.put("propertyNameMetadata", (n) -> { this.setPropertyNameMetadata(n.getObjectValue(PropertyNamesResponsePropertyNameMetadata::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the propertyDisplayName property value. The display name of a property. This is the localized name of the compatible property.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPropertyDisplayName() {
        return this.propertyDisplayName;
    }
    /**
     * Gets the propertyName property value. The canonical name of a property. This value is used as part of the name-value pairs used to specify compatibility.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPropertyName() {
        return this.propertyName;
    }
    /**
     * Gets the propertyNameMetadata property value. The metadata for a property.
     * @return a {@link PropertyNamesResponsePropertyNameMetadata}
     */
    @jakarta.annotation.Nullable
    public PropertyNamesResponsePropertyNameMetadata getPropertyNameMetadata() {
        return this.propertyNameMetadata;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("propertyDisplayName", this.getPropertyDisplayName());
        writer.writeStringValue("propertyName", this.getPropertyName());
        writer.writeObjectValue("propertyNameMetadata", this.getPropertyNameMetadata());
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
     * Sets the propertyDisplayName property value. The display name of a property. This is the localized name of the compatible property.
     * @param value Value to set for the propertyDisplayName property.
     */
    public void setPropertyDisplayName(@jakarta.annotation.Nullable final String value) {
        this.propertyDisplayName = value;
    }
    /**
     * Sets the propertyName property value. The canonical name of a property. This value is used as part of the name-value pairs used to specify compatibility.
     * @param value Value to set for the propertyName property.
     */
    public void setPropertyName(@jakarta.annotation.Nullable final String value) {
        this.propertyName = value;
    }
    /**
     * Sets the propertyNameMetadata property value. The metadata for a property.
     * @param value Value to set for the propertyNameMetadata property.
     */
    public void setPropertyNameMetadata(@jakarta.annotation.Nullable final PropertyNamesResponsePropertyNameMetadata value) {
        this.propertyNameMetadata = value;
    }
}

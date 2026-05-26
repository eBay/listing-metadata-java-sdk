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
 * This type displays the possible values for the corresponding condition descriptor, along with help text and constraint information.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ItemConditionDescriptorValue implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Additional information about the the condition of the item that is not included in the &lt;b&gt;conditionDescriptorValueHelpText&lt;/b&gt; field.
     */
    private java.util.List<String> conditionDescriptorValueAdditionalHelpText;
    /**
     * The constraints on a condition descriptor value, such as which descriptor value IDs and Descriptor ID it is associated with.
     */
    private java.util.List<ItemConditionDescriptorValueConstraint> conditionDescriptorValueConstraints;
    /**
     * A detailed description of the condition descriptor value. 
     */
    private String conditionDescriptorValueHelpText;
    /**
     * The unique identification number of a condition descriptor value associated with the &lt;b&gt;conditionDescriptorValueName&lt;/b&gt;.
     */
    private String conditionDescriptorValueId;
    /**
     * The human-readable label for the condition descriptor value associated with the &lt;b&gt;conditionDescriptorValueID&lt;/b&gt;.
     */
    private String conditionDescriptorValueName;
    /**
     * Instantiates a new {@link ItemConditionDescriptorValue} and sets the default values.
     */
    public ItemConditionDescriptorValue() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ItemConditionDescriptorValue}
     */
    @jakarta.annotation.Nonnull
    public static ItemConditionDescriptorValue createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ItemConditionDescriptorValue();
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
     * Gets the conditionDescriptorValueAdditionalHelpText property value. Additional information about the the condition of the item that is not included in the &lt;b&gt;conditionDescriptorValueHelpText&lt;/b&gt; field.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getConditionDescriptorValueAdditionalHelpText() {
        return this.conditionDescriptorValueAdditionalHelpText;
    }
    /**
     * Gets the conditionDescriptorValueConstraints property value. The constraints on a condition descriptor value, such as which descriptor value IDs and Descriptor ID it is associated with.
     * @return a {@link java.util.List<ItemConditionDescriptorValueConstraint>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ItemConditionDescriptorValueConstraint> getConditionDescriptorValueConstraints() {
        return this.conditionDescriptorValueConstraints;
    }
    /**
     * Gets the conditionDescriptorValueHelpText property value. A detailed description of the condition descriptor value. 
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getConditionDescriptorValueHelpText() {
        return this.conditionDescriptorValueHelpText;
    }
    /**
     * Gets the conditionDescriptorValueId property value. The unique identification number of a condition descriptor value associated with the &lt;b&gt;conditionDescriptorValueName&lt;/b&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getConditionDescriptorValueId() {
        return this.conditionDescriptorValueId;
    }
    /**
     * Gets the conditionDescriptorValueName property value. The human-readable label for the condition descriptor value associated with the &lt;b&gt;conditionDescriptorValueID&lt;/b&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getConditionDescriptorValueName() {
        return this.conditionDescriptorValueName;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("conditionDescriptorValueAdditionalHelpText", (n) -> { this.setConditionDescriptorValueAdditionalHelpText(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("conditionDescriptorValueConstraints", (n) -> { this.setConditionDescriptorValueConstraints(n.getCollectionOfObjectValues(ItemConditionDescriptorValueConstraint::createFromDiscriminatorValue)); });
        deserializerMap.put("conditionDescriptorValueHelpText", (n) -> { this.setConditionDescriptorValueHelpText(n.getStringValue()); });
        deserializerMap.put("conditionDescriptorValueId", (n) -> { this.setConditionDescriptorValueId(n.getStringValue()); });
        deserializerMap.put("conditionDescriptorValueName", (n) -> { this.setConditionDescriptorValueName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("conditionDescriptorValueAdditionalHelpText", this.getConditionDescriptorValueAdditionalHelpText());
        writer.writeCollectionOfObjectValues("conditionDescriptorValueConstraints", this.getConditionDescriptorValueConstraints());
        writer.writeStringValue("conditionDescriptorValueHelpText", this.getConditionDescriptorValueHelpText());
        writer.writeStringValue("conditionDescriptorValueId", this.getConditionDescriptorValueId());
        writer.writeStringValue("conditionDescriptorValueName", this.getConditionDescriptorValueName());
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
     * Sets the conditionDescriptorValueAdditionalHelpText property value. Additional information about the the condition of the item that is not included in the &lt;b&gt;conditionDescriptorValueHelpText&lt;/b&gt; field.
     * @param value Value to set for the conditionDescriptorValueAdditionalHelpText property.
     */
    public void setConditionDescriptorValueAdditionalHelpText(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.conditionDescriptorValueAdditionalHelpText = value;
    }
    /**
     * Sets the conditionDescriptorValueConstraints property value. The constraints on a condition descriptor value, such as which descriptor value IDs and Descriptor ID it is associated with.
     * @param value Value to set for the conditionDescriptorValueConstraints property.
     */
    public void setConditionDescriptorValueConstraints(@jakarta.annotation.Nullable final java.util.List<ItemConditionDescriptorValueConstraint> value) {
        this.conditionDescriptorValueConstraints = value;
    }
    /**
     * Sets the conditionDescriptorValueHelpText property value. A detailed description of the condition descriptor value. 
     * @param value Value to set for the conditionDescriptorValueHelpText property.
     */
    public void setConditionDescriptorValueHelpText(@jakarta.annotation.Nullable final String value) {
        this.conditionDescriptorValueHelpText = value;
    }
    /**
     * Sets the conditionDescriptorValueId property value. The unique identification number of a condition descriptor value associated with the &lt;b&gt;conditionDescriptorValueName&lt;/b&gt;.
     * @param value Value to set for the conditionDescriptorValueId property.
     */
    public void setConditionDescriptorValueId(@jakarta.annotation.Nullable final String value) {
        this.conditionDescriptorValueId = value;
    }
    /**
     * Sets the conditionDescriptorValueName property value. The human-readable label for the condition descriptor value associated with the &lt;b&gt;conditionDescriptorValueID&lt;/b&gt;.
     * @param value Value to set for the conditionDescriptorValueName property.
     */
    public void setConditionDescriptorValueName(@jakarta.annotation.Nullable final String value) {
        this.conditionDescriptorValueName = value;
    }
}

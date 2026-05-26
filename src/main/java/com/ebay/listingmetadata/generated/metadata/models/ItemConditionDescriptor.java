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
 * This type is used to display the possible condition descriptors and condition values applicable for a specified category. It also returns usage requirements, maximum length, cardinality, and help text.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ItemConditionDescriptor implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This type specifies the constraints on a condition descriptor, such as the maximum length, default condition descriptor value ID, cardinality, mode, usage, and applicable descriptor IDs.
     */
    private ItemConditionDescriptorConstraint conditionDescriptorConstraint;
    /**
     * A description of the condition descriptor that directs a user to its condition descriptor values.&lt;br&gt;&lt;br&gt; For example, the help text for &lt;code&gt;Card Condition&lt;/code&gt; is &lt;code&gt;Select ungraded condition&lt;/code&gt;.
     */
    private String conditionDescriptorHelpText;
    /**
     * The unique identification number of a condition descriptor associated with with a &lt;b&gt;conditionDescriptorName&lt;/b&gt;. &lt;br&gt;&lt;br&gt;For example, &lt;code&gt;40001&lt;/code&gt; is the ID for &lt;code&gt;Card Condition&lt;/code&gt;.&lt;br&gt;&lt;br&gt;These IDs are used in the addItem family of calls of the &lt;b&gt;Trading API&lt;/b&gt; to provide condition descriptor names for the item. These IDs are used by the inventoryItem family of calls of the &lt;b&gt;Inventory API&lt;/b&gt; to provide condition descriptor names for the item.
     */
    private String conditionDescriptorId;
    /**
     * The human-readable label for the condition descriptor associated with the &lt;b&gt;conditionDescriptorID&lt;/b&gt;. &lt;br&gt;&lt;br&gt;For example, &lt;code&gt;Card Condition&lt;/code&gt; is the condition descriptor name for ID &lt;code&gt;40001&lt;/code&gt;
     */
    private String conditionDescriptorName;
    /**
     * This array shows the possible values that map to the corresponding &lt;b&gt;conditionDescriptorName&lt;/b&gt; values. Constraint information and help text are also shown for each value. &lt;br&gt;&lt;br&gt;For example, The ID &lt;code&gt;40001&lt;/code&gt; is ID for the condition descriptor &lt;code&gt;card condition&lt;/code&gt;. The ID &lt;code&gt;400012&lt;/code&gt; is the ID for the &lt;code&gt;Very Good&lt;/code&gt; card condition value.
     */
    private java.util.List<ItemConditionDescriptorValue> conditionDescriptorValues;
    /**
     * Instantiates a new {@link ItemConditionDescriptor} and sets the default values.
     */
    public ItemConditionDescriptor() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ItemConditionDescriptor}
     */
    @jakarta.annotation.Nonnull
    public static ItemConditionDescriptor createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ItemConditionDescriptor();
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
     * Gets the conditionDescriptorConstraint property value. This type specifies the constraints on a condition descriptor, such as the maximum length, default condition descriptor value ID, cardinality, mode, usage, and applicable descriptor IDs.
     * @return a {@link ItemConditionDescriptorConstraint}
     */
    @jakarta.annotation.Nullable
    public ItemConditionDescriptorConstraint getConditionDescriptorConstraint() {
        return this.conditionDescriptorConstraint;
    }
    /**
     * Gets the conditionDescriptorHelpText property value. A description of the condition descriptor that directs a user to its condition descriptor values.&lt;br&gt;&lt;br&gt; For example, the help text for &lt;code&gt;Card Condition&lt;/code&gt; is &lt;code&gt;Select ungraded condition&lt;/code&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getConditionDescriptorHelpText() {
        return this.conditionDescriptorHelpText;
    }
    /**
     * Gets the conditionDescriptorId property value. The unique identification number of a condition descriptor associated with with a &lt;b&gt;conditionDescriptorName&lt;/b&gt;. &lt;br&gt;&lt;br&gt;For example, &lt;code&gt;40001&lt;/code&gt; is the ID for &lt;code&gt;Card Condition&lt;/code&gt;.&lt;br&gt;&lt;br&gt;These IDs are used in the addItem family of calls of the &lt;b&gt;Trading API&lt;/b&gt; to provide condition descriptor names for the item. These IDs are used by the inventoryItem family of calls of the &lt;b&gt;Inventory API&lt;/b&gt; to provide condition descriptor names for the item.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getConditionDescriptorId() {
        return this.conditionDescriptorId;
    }
    /**
     * Gets the conditionDescriptorName property value. The human-readable label for the condition descriptor associated with the &lt;b&gt;conditionDescriptorID&lt;/b&gt;. &lt;br&gt;&lt;br&gt;For example, &lt;code&gt;Card Condition&lt;/code&gt; is the condition descriptor name for ID &lt;code&gt;40001&lt;/code&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getConditionDescriptorName() {
        return this.conditionDescriptorName;
    }
    /**
     * Gets the conditionDescriptorValues property value. This array shows the possible values that map to the corresponding &lt;b&gt;conditionDescriptorName&lt;/b&gt; values. Constraint information and help text are also shown for each value. &lt;br&gt;&lt;br&gt;For example, The ID &lt;code&gt;40001&lt;/code&gt; is ID for the condition descriptor &lt;code&gt;card condition&lt;/code&gt;. The ID &lt;code&gt;400012&lt;/code&gt; is the ID for the &lt;code&gt;Very Good&lt;/code&gt; card condition value.
     * @return a {@link java.util.List<ItemConditionDescriptorValue>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ItemConditionDescriptorValue> getConditionDescriptorValues() {
        return this.conditionDescriptorValues;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("conditionDescriptorConstraint", (n) -> { this.setConditionDescriptorConstraint(n.getObjectValue(ItemConditionDescriptorConstraint::createFromDiscriminatorValue)); });
        deserializerMap.put("conditionDescriptorHelpText", (n) -> { this.setConditionDescriptorHelpText(n.getStringValue()); });
        deserializerMap.put("conditionDescriptorId", (n) -> { this.setConditionDescriptorId(n.getStringValue()); });
        deserializerMap.put("conditionDescriptorName", (n) -> { this.setConditionDescriptorName(n.getStringValue()); });
        deserializerMap.put("conditionDescriptorValues", (n) -> { this.setConditionDescriptorValues(n.getCollectionOfObjectValues(ItemConditionDescriptorValue::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("conditionDescriptorConstraint", this.getConditionDescriptorConstraint());
        writer.writeStringValue("conditionDescriptorHelpText", this.getConditionDescriptorHelpText());
        writer.writeStringValue("conditionDescriptorId", this.getConditionDescriptorId());
        writer.writeStringValue("conditionDescriptorName", this.getConditionDescriptorName());
        writer.writeCollectionOfObjectValues("conditionDescriptorValues", this.getConditionDescriptorValues());
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
     * Sets the conditionDescriptorConstraint property value. This type specifies the constraints on a condition descriptor, such as the maximum length, default condition descriptor value ID, cardinality, mode, usage, and applicable descriptor IDs.
     * @param value Value to set for the conditionDescriptorConstraint property.
     */
    public void setConditionDescriptorConstraint(@jakarta.annotation.Nullable final ItemConditionDescriptorConstraint value) {
        this.conditionDescriptorConstraint = value;
    }
    /**
     * Sets the conditionDescriptorHelpText property value. A description of the condition descriptor that directs a user to its condition descriptor values.&lt;br&gt;&lt;br&gt; For example, the help text for &lt;code&gt;Card Condition&lt;/code&gt; is &lt;code&gt;Select ungraded condition&lt;/code&gt;.
     * @param value Value to set for the conditionDescriptorHelpText property.
     */
    public void setConditionDescriptorHelpText(@jakarta.annotation.Nullable final String value) {
        this.conditionDescriptorHelpText = value;
    }
    /**
     * Sets the conditionDescriptorId property value. The unique identification number of a condition descriptor associated with with a &lt;b&gt;conditionDescriptorName&lt;/b&gt;. &lt;br&gt;&lt;br&gt;For example, &lt;code&gt;40001&lt;/code&gt; is the ID for &lt;code&gt;Card Condition&lt;/code&gt;.&lt;br&gt;&lt;br&gt;These IDs are used in the addItem family of calls of the &lt;b&gt;Trading API&lt;/b&gt; to provide condition descriptor names for the item. These IDs are used by the inventoryItem family of calls of the &lt;b&gt;Inventory API&lt;/b&gt; to provide condition descriptor names for the item.
     * @param value Value to set for the conditionDescriptorId property.
     */
    public void setConditionDescriptorId(@jakarta.annotation.Nullable final String value) {
        this.conditionDescriptorId = value;
    }
    /**
     * Sets the conditionDescriptorName property value. The human-readable label for the condition descriptor associated with the &lt;b&gt;conditionDescriptorID&lt;/b&gt;. &lt;br&gt;&lt;br&gt;For example, &lt;code&gt;Card Condition&lt;/code&gt; is the condition descriptor name for ID &lt;code&gt;40001&lt;/code&gt;
     * @param value Value to set for the conditionDescriptorName property.
     */
    public void setConditionDescriptorName(@jakarta.annotation.Nullable final String value) {
        this.conditionDescriptorName = value;
    }
    /**
     * Sets the conditionDescriptorValues property value. This array shows the possible values that map to the corresponding &lt;b&gt;conditionDescriptorName&lt;/b&gt; values. Constraint information and help text are also shown for each value. &lt;br&gt;&lt;br&gt;For example, The ID &lt;code&gt;40001&lt;/code&gt; is ID for the condition descriptor &lt;code&gt;card condition&lt;/code&gt;. The ID &lt;code&gt;400012&lt;/code&gt; is the ID for the &lt;code&gt;Very Good&lt;/code&gt; card condition value.
     * @param value Value to set for the conditionDescriptorValues property.
     */
    public void setConditionDescriptorValues(@jakarta.annotation.Nullable final java.util.List<ItemConditionDescriptorValue> value) {
        this.conditionDescriptorValues = value;
    }
}

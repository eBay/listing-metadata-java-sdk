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
 * &lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note: &lt;/b&gt;In all eBay marketplaces, Condition ID 2000 now maps to an item condition of &apos;Certified Refurbished&apos;, and not &apos;Manufacturer Refurbished&apos;. To list an item as &apos;Certified Refurbished&apos;, a seller must be pre-qualified by eBay for this feature. Any seller who is not eligible for this feature will be blocked if they try to create a new listing or revise an existing listing with this item condition. Any active listings on any eBay marketplace that had &apos;Manufacturer Refurbished&apos; as the item condition should have been automatically updated by eBay to the &apos;Seller Refurbished&apos; item condition (Condition ID 2500). &lt;br&gt;&lt;br&gt; Any seller that is interested in eligibility requirements to list with &apos;Certified Refurbished&apos; should see the &lt;a href=&quot;https://pages.ebay.com/seller-center/listing-and-marketing/certified-refurbished-program.html &quot; target=&quot;_blank&quot;&gt;Certified refurbished program&lt;/a&gt; page in Seller Center. &lt;/span&gt;
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ItemCondition implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The human-readable label for the condition (e.g., &quot;New&quot;). This value is typically localized for each site.  &lt;br&gt;&lt;br&gt;Note that the display name can vary by category. For example, the description for condition ID &lt;code&gt;1000&lt;/code&gt; could be called &quot;New: with Tags&quot; in one category and &quot;Brand New&quot; in another. For details on condition IDs and descriptions, see &lt;a href=&apos;/api-docs/sell/static/metadata/condition-id-values.html&apos; target=&apos;_blank&apos;&gt;Item condition ID and name values&lt;/a&gt;.
     */
    private String conditionDescription;
    /**
     * This array contains the possible condition descriptors and condition descriptor values applicable for the specified category. It also returns usage requirements, maximum length, cardinality, and help text.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This array is only returned for categories that support condition descriptors.&lt;/span&gt;
     */
    private java.util.List<ItemConditionDescriptor> conditionDescriptors;
    /**
     * A detailed description of the condition denoted by the &lt;b&gt;conditionID&lt;/b&gt; and &lt;b&gt;conditionDescription&lt;/b&gt;. 
     */
    private String conditionHelpText;
    /**
     * The ID value of the selected item condition. For information on the supported condition ID values, see &lt;a href=&apos;/api-docs/sell/static/metadata/condition-id-values.html&apos; target=&apos;_blank&apos;&gt;Item condition ID and name values&lt;/a&gt;.
     */
    private String conditionId;
    /**
     * The value returned in this field indicates if there are any usage restrictions or requirements for the corresponding item condition in the corresponding category.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Currently, the only supported value is &apos;RESTRICTED&apos;, and this field will only be returned for the following conditions: 2000, 2010, 2020, 2030. Sellers must be pre-approved to use any of these item conditions.&lt;/span&gt;
     */
    private UsageEnum usage;
    /**
     * Instantiates a new {@link ItemCondition} and sets the default values.
     */
    public ItemCondition() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ItemCondition}
     */
    @jakarta.annotation.Nonnull
    public static ItemCondition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ItemCondition();
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
     * Gets the conditionDescription property value. The human-readable label for the condition (e.g., &quot;New&quot;). This value is typically localized for each site.  &lt;br&gt;&lt;br&gt;Note that the display name can vary by category. For example, the description for condition ID &lt;code&gt;1000&lt;/code&gt; could be called &quot;New: with Tags&quot; in one category and &quot;Brand New&quot; in another. For details on condition IDs and descriptions, see &lt;a href=&apos;/api-docs/sell/static/metadata/condition-id-values.html&apos; target=&apos;_blank&apos;&gt;Item condition ID and name values&lt;/a&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getConditionDescription() {
        return this.conditionDescription;
    }
    /**
     * Gets the conditionDescriptors property value. This array contains the possible condition descriptors and condition descriptor values applicable for the specified category. It also returns usage requirements, maximum length, cardinality, and help text.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This array is only returned for categories that support condition descriptors.&lt;/span&gt;
     * @return a {@link java.util.List<ItemConditionDescriptor>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ItemConditionDescriptor> getConditionDescriptors() {
        return this.conditionDescriptors;
    }
    /**
     * Gets the conditionHelpText property value. A detailed description of the condition denoted by the &lt;b&gt;conditionID&lt;/b&gt; and &lt;b&gt;conditionDescription&lt;/b&gt;. 
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getConditionHelpText() {
        return this.conditionHelpText;
    }
    /**
     * Gets the conditionId property value. The ID value of the selected item condition. For information on the supported condition ID values, see &lt;a href=&apos;/api-docs/sell/static/metadata/condition-id-values.html&apos; target=&apos;_blank&apos;&gt;Item condition ID and name values&lt;/a&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getConditionId() {
        return this.conditionId;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("conditionDescription", (n) -> { this.setConditionDescription(n.getStringValue()); });
        deserializerMap.put("conditionDescriptors", (n) -> { this.setConditionDescriptors(n.getCollectionOfObjectValues(ItemConditionDescriptor::createFromDiscriminatorValue)); });
        deserializerMap.put("conditionHelpText", (n) -> { this.setConditionHelpText(n.getStringValue()); });
        deserializerMap.put("conditionId", (n) -> { this.setConditionId(n.getStringValue()); });
        deserializerMap.put("usage", (n) -> { this.setUsage(n.getEnumValue(UsageEnum::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the usage property value. The value returned in this field indicates if there are any usage restrictions or requirements for the corresponding item condition in the corresponding category.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Currently, the only supported value is &apos;RESTRICTED&apos;, and this field will only be returned for the following conditions: 2000, 2010, 2020, 2030. Sellers must be pre-approved to use any of these item conditions.&lt;/span&gt;
     * @return a {@link UsageEnum}
     */
    @jakarta.annotation.Nullable
    public UsageEnum getUsage() {
        return this.usage;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("conditionDescription", this.getConditionDescription());
        writer.writeCollectionOfObjectValues("conditionDescriptors", this.getConditionDescriptors());
        writer.writeStringValue("conditionHelpText", this.getConditionHelpText());
        writer.writeStringValue("conditionId", this.getConditionId());
        writer.writeEnumValue("usage", this.getUsage());
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
     * Sets the conditionDescription property value. The human-readable label for the condition (e.g., &quot;New&quot;). This value is typically localized for each site.  &lt;br&gt;&lt;br&gt;Note that the display name can vary by category. For example, the description for condition ID &lt;code&gt;1000&lt;/code&gt; could be called &quot;New: with Tags&quot; in one category and &quot;Brand New&quot; in another. For details on condition IDs and descriptions, see &lt;a href=&apos;/api-docs/sell/static/metadata/condition-id-values.html&apos; target=&apos;_blank&apos;&gt;Item condition ID and name values&lt;/a&gt;.
     * @param value Value to set for the conditionDescription property.
     */
    public void setConditionDescription(@jakarta.annotation.Nullable final String value) {
        this.conditionDescription = value;
    }
    /**
     * Sets the conditionDescriptors property value. This array contains the possible condition descriptors and condition descriptor values applicable for the specified category. It also returns usage requirements, maximum length, cardinality, and help text.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This array is only returned for categories that support condition descriptors.&lt;/span&gt;
     * @param value Value to set for the conditionDescriptors property.
     */
    public void setConditionDescriptors(@jakarta.annotation.Nullable final java.util.List<ItemConditionDescriptor> value) {
        this.conditionDescriptors = value;
    }
    /**
     * Sets the conditionHelpText property value. A detailed description of the condition denoted by the &lt;b&gt;conditionID&lt;/b&gt; and &lt;b&gt;conditionDescription&lt;/b&gt;. 
     * @param value Value to set for the conditionHelpText property.
     */
    public void setConditionHelpText(@jakarta.annotation.Nullable final String value) {
        this.conditionHelpText = value;
    }
    /**
     * Sets the conditionId property value. The ID value of the selected item condition. For information on the supported condition ID values, see &lt;a href=&apos;/api-docs/sell/static/metadata/condition-id-values.html&apos; target=&apos;_blank&apos;&gt;Item condition ID and name values&lt;/a&gt;.
     * @param value Value to set for the conditionId property.
     */
    public void setConditionId(@jakarta.annotation.Nullable final String value) {
        this.conditionId = value;
    }
    /**
     * Sets the usage property value. The value returned in this field indicates if there are any usage restrictions or requirements for the corresponding item condition in the corresponding category.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Currently, the only supported value is &apos;RESTRICTED&apos;, and this field will only be returned for the following conditions: 2000, 2010, 2020, 2030. Sellers must be pre-approved to use any of these item conditions.&lt;/span&gt;
     * @param value Value to set for the usage property.
     */
    public void setUsage(@jakarta.annotation.Nullable final UsageEnum value) {
        this.usage = value;
    }
}

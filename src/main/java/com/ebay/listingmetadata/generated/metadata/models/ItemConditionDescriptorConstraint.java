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
 * This type specifies the constraints on a condition descriptor, such as the maximum length, default condition descriptor value ID, cardinality, mode, usage, and applicable descriptor IDs.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ItemConditionDescriptorConstraint implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This array is returned if the corresponding condition descriptor requires that one or more other associated condition descriptors must also be specified in a listing. The condition descriptor IDs for the associated condition descriptors are returned here.&lt;br&gt;&lt;br&gt;For example, the &lt;code&gt;Grade&lt;/code&gt; and &lt;code&gt;Grader&lt;/code&gt; condition descriptors must always be specified together in a listing for Graded cards.
     */
    private java.util.List<String> applicableToConditionDescriptorIds;
    /**
     * The value returned in this field indicates whether a condition descriptor can have a single value or multiple values. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:CardinalityEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String cardinality;
    /**
     * The default condition descriptor value that will be set if there are multiple values.
     */
    private String defaultConditionDescriptorValueId;
    /**
     * The maximum characters allowed for a condition descriptor. This field is only returned/applicable for condition descriptors that allow free text for condition descriptor values. 
     */
    private Integer maxLength;
    /**
     * The value returned in this field indicates whether the supported values for a condition descriptor are predefined or if the seller manually specified the value.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; &lt;code&gt;FREE_TEXT&lt;/code&gt; is currently only applicable to the Certification Number condition descriptor.&lt;/span&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:ModeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String mode;
    /**
     * This value indicates whether or not the condition descriptor is required for the item condition. Currently, this field is only returned if the condition descriptor is required for the item condition. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:DescriptorUsageEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String usage;
    /**
     * Instantiates a new {@link ItemConditionDescriptorConstraint} and sets the default values.
     */
    public ItemConditionDescriptorConstraint() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ItemConditionDescriptorConstraint}
     */
    @jakarta.annotation.Nonnull
    public static ItemConditionDescriptorConstraint createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ItemConditionDescriptorConstraint();
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
     * Gets the applicableToConditionDescriptorIds property value. This array is returned if the corresponding condition descriptor requires that one or more other associated condition descriptors must also be specified in a listing. The condition descriptor IDs for the associated condition descriptors are returned here.&lt;br&gt;&lt;br&gt;For example, the &lt;code&gt;Grade&lt;/code&gt; and &lt;code&gt;Grader&lt;/code&gt; condition descriptors must always be specified together in a listing for Graded cards.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getApplicableToConditionDescriptorIds() {
        return this.applicableToConditionDescriptorIds;
    }
    /**
     * Gets the cardinality property value. The value returned in this field indicates whether a condition descriptor can have a single value or multiple values. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:CardinalityEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCardinality() {
        return this.cardinality;
    }
    /**
     * Gets the defaultConditionDescriptorValueId property value. The default condition descriptor value that will be set if there are multiple values.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDefaultConditionDescriptorValueId() {
        return this.defaultConditionDescriptorValueId;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("applicableToConditionDescriptorIds", (n) -> { this.setApplicableToConditionDescriptorIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("cardinality", (n) -> { this.setCardinality(n.getStringValue()); });
        deserializerMap.put("defaultConditionDescriptorValueId", (n) -> { this.setDefaultConditionDescriptorValueId(n.getStringValue()); });
        deserializerMap.put("maxLength", (n) -> { this.setMaxLength(n.getIntegerValue()); });
        deserializerMap.put("mode", (n) -> { this.setMode(n.getStringValue()); });
        deserializerMap.put("usage", (n) -> { this.setUsage(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the maxLength property value. The maximum characters allowed for a condition descriptor. This field is only returned/applicable for condition descriptors that allow free text for condition descriptor values. 
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMaxLength() {
        return this.maxLength;
    }
    /**
     * Gets the mode property value. The value returned in this field indicates whether the supported values for a condition descriptor are predefined or if the seller manually specified the value.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; &lt;code&gt;FREE_TEXT&lt;/code&gt; is currently only applicable to the Certification Number condition descriptor.&lt;/span&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:ModeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMode() {
        return this.mode;
    }
    /**
     * Gets the usage property value. This value indicates whether or not the condition descriptor is required for the item condition. Currently, this field is only returned if the condition descriptor is required for the item condition. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:DescriptorUsageEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUsage() {
        return this.usage;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("applicableToConditionDescriptorIds", this.getApplicableToConditionDescriptorIds());
        writer.writeStringValue("cardinality", this.getCardinality());
        writer.writeStringValue("defaultConditionDescriptorValueId", this.getDefaultConditionDescriptorValueId());
        writer.writeIntegerValue("maxLength", this.getMaxLength());
        writer.writeStringValue("mode", this.getMode());
        writer.writeStringValue("usage", this.getUsage());
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
     * Sets the applicableToConditionDescriptorIds property value. This array is returned if the corresponding condition descriptor requires that one or more other associated condition descriptors must also be specified in a listing. The condition descriptor IDs for the associated condition descriptors are returned here.&lt;br&gt;&lt;br&gt;For example, the &lt;code&gt;Grade&lt;/code&gt; and &lt;code&gt;Grader&lt;/code&gt; condition descriptors must always be specified together in a listing for Graded cards.
     * @param value Value to set for the applicableToConditionDescriptorIds property.
     */
    public void setApplicableToConditionDescriptorIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.applicableToConditionDescriptorIds = value;
    }
    /**
     * Sets the cardinality property value. The value returned in this field indicates whether a condition descriptor can have a single value or multiple values. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:CardinalityEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the cardinality property.
     */
    public void setCardinality(@jakarta.annotation.Nullable final String value) {
        this.cardinality = value;
    }
    /**
     * Sets the defaultConditionDescriptorValueId property value. The default condition descriptor value that will be set if there are multiple values.
     * @param value Value to set for the defaultConditionDescriptorValueId property.
     */
    public void setDefaultConditionDescriptorValueId(@jakarta.annotation.Nullable final String value) {
        this.defaultConditionDescriptorValueId = value;
    }
    /**
     * Sets the maxLength property value. The maximum characters allowed for a condition descriptor. This field is only returned/applicable for condition descriptors that allow free text for condition descriptor values. 
     * @param value Value to set for the maxLength property.
     */
    public void setMaxLength(@jakarta.annotation.Nullable final Integer value) {
        this.maxLength = value;
    }
    /**
     * Sets the mode property value. The value returned in this field indicates whether the supported values for a condition descriptor are predefined or if the seller manually specified the value.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; &lt;code&gt;FREE_TEXT&lt;/code&gt; is currently only applicable to the Certification Number condition descriptor.&lt;/span&gt; For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:ModeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the mode property.
     */
    public void setMode(@jakarta.annotation.Nullable final String value) {
        this.mode = value;
    }
    /**
     * Sets the usage property value. This value indicates whether or not the condition descriptor is required for the item condition. Currently, this field is only returned if the condition descriptor is required for the item condition. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:DescriptorUsageEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the usage property.
     */
    public void setUsage(@jakarta.annotation.Nullable final String value) {
        this.usage = value;
    }
}

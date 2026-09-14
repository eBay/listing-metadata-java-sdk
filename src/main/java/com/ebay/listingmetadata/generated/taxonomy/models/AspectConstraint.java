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

package com.ebay.listingmetadata.generated.taxonomy.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type contains information about the formatting, occurrence, and support of an aspect.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AspectConstraint implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Indicates additional data type requirements for the aspect. For example, &lt;code&gt;NUMERIC_RANGE&lt;/code&gt; indicates that the aspect value must be in numeric range format.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; Currently only &lt;code&gt;NUMERIC_RANGE&lt;/code&gt; is supported.&lt;/span&gt;
     */
    private AspectAdvancedDataTypeEnum aspectAdvancedDataType;
    /**
     * This value indicates if the aspect identified by the &lt;b&gt;aspects.localizedAspectName&lt;/b&gt; field is a product aspect (relevant to catalog products in the category) or an item/instance aspect, which is an aspect whose value will vary based on a particular instance of the product.
     */
    private java.util.List<AspectApplicableToEnum> aspectApplicableTo;
    /**
     * The data type of this aspect.
     */
    private AspectDataTypeEnum aspectDataType;
    /**
     * A value of &lt;code&gt;true&lt;/code&gt; indicates that this aspect can be used to help identify item variations.
     */
    private Boolean aspectEnabledForVariations;
    /**
     * &lt;i&gt;Returned only if&lt;/i&gt; the value of &lt;b&gt;aspectDataType&lt;/b&gt; identifies a data type that requires specific formatting. Currently, this field provides formatting hints as follows: &lt;ul&gt; &lt;li&gt;&lt;b&gt;DATE&lt;/b&gt;: &lt;code&gt;YYYY&lt;/code&gt;, &lt;code&gt;YYYYMM&lt;/code&gt;, &lt;code&gt;YYYYMMDD&lt;/code&gt;&lt;/li&gt; &lt;li&gt;&lt;b&gt;NUMBER&lt;/b&gt;: &lt;code&gt;int32&lt;/code&gt;, &lt;code&gt;double&lt;/code&gt;&lt;/li&gt; &lt;/ul&gt;
     */
    private String aspectFormat;
    /**
     * The maximum length of the item/instance aspect&apos;s value. The seller must make sure not to exceed this length when specifying the instance aspect&apos;s value for a product. This field is only returned for instance aspects.
     */
    private Integer aspectMaxLength;
    /**
     * The manner in which values of this aspect must be specified by the seller (as free text or by selecting from available options). 
     */
    private AspectModeEnum aspectMode;
    /**
     * A value of &lt;code&gt;true&lt;/code&gt; indicates that this aspect is required when offering items in the specified category.
     */
    private Boolean aspectRequired;
    /**
     * The enumeration value returned in this field will indicate if the corresponding aspect is recommended or optional.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; This field is always returned, even for hard-mandated/required aspects (where &lt;strong&gt;aspectRequired&lt;/strong&gt;: &lt;code&gt;true&lt;/code&gt;). The value returned for required aspects will be &lt;code&gt;RECOMMENDED&lt;/code&gt;, but they are actually required and a seller will be blocked from listing or revising an item without these aspects. &lt;/span&gt;
     */
    private AspectUsageEnum aspectUsage;
    /**
     * The expected date after which the aspect will be required.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; The value returned in this field specifies only an approximate date, which may not reflect the actual date after which the aspect is required.&lt;/span&gt;
     */
    private String expectedRequiredByDate;
    /**
     * Indicates whether this aspect can accept single or multiple values for items in the specified category.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; Up to 30 values can be supplied for aspects that accept multiple values.&lt;/span&gt;
     */
    private ItemToAspectCardinalityEnum itemToAspectCardinality;
    /**
     * Instantiates a new {@link AspectConstraint} and sets the default values.
     */
    public AspectConstraint() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AspectConstraint}
     */
    @jakarta.annotation.Nonnull
    public static AspectConstraint createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AspectConstraint();
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
     * Gets the aspectAdvancedDataType property value. Indicates additional data type requirements for the aspect. For example, &lt;code&gt;NUMERIC_RANGE&lt;/code&gt; indicates that the aspect value must be in numeric range format.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; Currently only &lt;code&gt;NUMERIC_RANGE&lt;/code&gt; is supported.&lt;/span&gt;
     * @return a {@link AspectAdvancedDataTypeEnum}
     */
    @jakarta.annotation.Nullable
    public AspectAdvancedDataTypeEnum getAspectAdvancedDataType() {
        return this.aspectAdvancedDataType;
    }
    /**
     * Gets the aspectApplicableTo property value. This value indicates if the aspect identified by the &lt;b&gt;aspects.localizedAspectName&lt;/b&gt; field is a product aspect (relevant to catalog products in the category) or an item/instance aspect, which is an aspect whose value will vary based on a particular instance of the product.
     * @return a {@link java.util.List<AspectApplicableToEnum>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AspectApplicableToEnum> getAspectApplicableTo() {
        return this.aspectApplicableTo;
    }
    /**
     * Gets the aspectDataType property value. The data type of this aspect.
     * @return a {@link AspectDataTypeEnum}
     */
    @jakarta.annotation.Nullable
    public AspectDataTypeEnum getAspectDataType() {
        return this.aspectDataType;
    }
    /**
     * Gets the aspectEnabledForVariations property value. A value of &lt;code&gt;true&lt;/code&gt; indicates that this aspect can be used to help identify item variations.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAspectEnabledForVariations() {
        return this.aspectEnabledForVariations;
    }
    /**
     * Gets the aspectFormat property value. &lt;i&gt;Returned only if&lt;/i&gt; the value of &lt;b&gt;aspectDataType&lt;/b&gt; identifies a data type that requires specific formatting. Currently, this field provides formatting hints as follows: &lt;ul&gt; &lt;li&gt;&lt;b&gt;DATE&lt;/b&gt;: &lt;code&gt;YYYY&lt;/code&gt;, &lt;code&gt;YYYYMM&lt;/code&gt;, &lt;code&gt;YYYYMMDD&lt;/code&gt;&lt;/li&gt; &lt;li&gt;&lt;b&gt;NUMBER&lt;/b&gt;: &lt;code&gt;int32&lt;/code&gt;, &lt;code&gt;double&lt;/code&gt;&lt;/li&gt; &lt;/ul&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAspectFormat() {
        return this.aspectFormat;
    }
    /**
     * Gets the aspectMaxLength property value. The maximum length of the item/instance aspect&apos;s value. The seller must make sure not to exceed this length when specifying the instance aspect&apos;s value for a product. This field is only returned for instance aspects.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getAspectMaxLength() {
        return this.aspectMaxLength;
    }
    /**
     * Gets the aspectMode property value. The manner in which values of this aspect must be specified by the seller (as free text or by selecting from available options). 
     * @return a {@link AspectModeEnum}
     */
    @jakarta.annotation.Nullable
    public AspectModeEnum getAspectMode() {
        return this.aspectMode;
    }
    /**
     * Gets the aspectRequired property value. A value of &lt;code&gt;true&lt;/code&gt; indicates that this aspect is required when offering items in the specified category.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAspectRequired() {
        return this.aspectRequired;
    }
    /**
     * Gets the aspectUsage property value. The enumeration value returned in this field will indicate if the corresponding aspect is recommended or optional.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; This field is always returned, even for hard-mandated/required aspects (where &lt;strong&gt;aspectRequired&lt;/strong&gt;: &lt;code&gt;true&lt;/code&gt;). The value returned for required aspects will be &lt;code&gt;RECOMMENDED&lt;/code&gt;, but they are actually required and a seller will be blocked from listing or revising an item without these aspects. &lt;/span&gt;
     * @return a {@link AspectUsageEnum}
     */
    @jakarta.annotation.Nullable
    public AspectUsageEnum getAspectUsage() {
        return this.aspectUsage;
    }
    /**
     * Gets the expectedRequiredByDate property value. The expected date after which the aspect will be required.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; The value returned in this field specifies only an approximate date, which may not reflect the actual date after which the aspect is required.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExpectedRequiredByDate() {
        return this.expectedRequiredByDate;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(11);
        deserializerMap.put("aspectAdvancedDataType", (n) -> { this.setAspectAdvancedDataType(n.getEnumValue(AspectAdvancedDataTypeEnum::forValue)); });
        deserializerMap.put("aspectApplicableTo", (n) -> { this.setAspectApplicableTo(n.getCollectionOfEnumValues(AspectApplicableToEnum::forValue)); });
        deserializerMap.put("aspectDataType", (n) -> { this.setAspectDataType(n.getEnumValue(AspectDataTypeEnum::forValue)); });
        deserializerMap.put("aspectEnabledForVariations", (n) -> { this.setAspectEnabledForVariations(n.getBooleanValue()); });
        deserializerMap.put("aspectFormat", (n) -> { this.setAspectFormat(n.getStringValue()); });
        deserializerMap.put("aspectMaxLength", (n) -> { this.setAspectMaxLength(n.getIntegerValue()); });
        deserializerMap.put("aspectMode", (n) -> { this.setAspectMode(n.getEnumValue(AspectModeEnum::forValue)); });
        deserializerMap.put("aspectRequired", (n) -> { this.setAspectRequired(n.getBooleanValue()); });
        deserializerMap.put("aspectUsage", (n) -> { this.setAspectUsage(n.getEnumValue(AspectUsageEnum::forValue)); });
        deserializerMap.put("expectedRequiredByDate", (n) -> { this.setExpectedRequiredByDate(n.getStringValue()); });
        deserializerMap.put("itemToAspectCardinality", (n) -> { this.setItemToAspectCardinality(n.getEnumValue(ItemToAspectCardinalityEnum::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the itemToAspectCardinality property value. Indicates whether this aspect can accept single or multiple values for items in the specified category.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; Up to 30 values can be supplied for aspects that accept multiple values.&lt;/span&gt;
     * @return a {@link ItemToAspectCardinalityEnum}
     */
    @jakarta.annotation.Nullable
    public ItemToAspectCardinalityEnum getItemToAspectCardinality() {
        return this.itemToAspectCardinality;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("aspectAdvancedDataType", this.getAspectAdvancedDataType());
        writer.writeCollectionOfEnumValues("aspectApplicableTo", this.getAspectApplicableTo());
        writer.writeEnumValue("aspectDataType", this.getAspectDataType());
        writer.writeBooleanValue("aspectEnabledForVariations", this.getAspectEnabledForVariations());
        writer.writeStringValue("aspectFormat", this.getAspectFormat());
        writer.writeIntegerValue("aspectMaxLength", this.getAspectMaxLength());
        writer.writeEnumValue("aspectMode", this.getAspectMode());
        writer.writeBooleanValue("aspectRequired", this.getAspectRequired());
        writer.writeEnumValue("aspectUsage", this.getAspectUsage());
        writer.writeStringValue("expectedRequiredByDate", this.getExpectedRequiredByDate());
        writer.writeEnumValue("itemToAspectCardinality", this.getItemToAspectCardinality());
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
     * Sets the aspectAdvancedDataType property value. Indicates additional data type requirements for the aspect. For example, &lt;code&gt;NUMERIC_RANGE&lt;/code&gt; indicates that the aspect value must be in numeric range format.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; Currently only &lt;code&gt;NUMERIC_RANGE&lt;/code&gt; is supported.&lt;/span&gt;
     * @param value Value to set for the aspectAdvancedDataType property.
     */
    public void setAspectAdvancedDataType(@jakarta.annotation.Nullable final AspectAdvancedDataTypeEnum value) {
        this.aspectAdvancedDataType = value;
    }
    /**
     * Sets the aspectApplicableTo property value. This value indicates if the aspect identified by the &lt;b&gt;aspects.localizedAspectName&lt;/b&gt; field is a product aspect (relevant to catalog products in the category) or an item/instance aspect, which is an aspect whose value will vary based on a particular instance of the product.
     * @param value Value to set for the aspectApplicableTo property.
     */
    public void setAspectApplicableTo(@jakarta.annotation.Nullable final java.util.List<AspectApplicableToEnum> value) {
        this.aspectApplicableTo = value;
    }
    /**
     * Sets the aspectDataType property value. The data type of this aspect.
     * @param value Value to set for the aspectDataType property.
     */
    public void setAspectDataType(@jakarta.annotation.Nullable final AspectDataTypeEnum value) {
        this.aspectDataType = value;
    }
    /**
     * Sets the aspectEnabledForVariations property value. A value of &lt;code&gt;true&lt;/code&gt; indicates that this aspect can be used to help identify item variations.
     * @param value Value to set for the aspectEnabledForVariations property.
     */
    public void setAspectEnabledForVariations(@jakarta.annotation.Nullable final Boolean value) {
        this.aspectEnabledForVariations = value;
    }
    /**
     * Sets the aspectFormat property value. &lt;i&gt;Returned only if&lt;/i&gt; the value of &lt;b&gt;aspectDataType&lt;/b&gt; identifies a data type that requires specific formatting. Currently, this field provides formatting hints as follows: &lt;ul&gt; &lt;li&gt;&lt;b&gt;DATE&lt;/b&gt;: &lt;code&gt;YYYY&lt;/code&gt;, &lt;code&gt;YYYYMM&lt;/code&gt;, &lt;code&gt;YYYYMMDD&lt;/code&gt;&lt;/li&gt; &lt;li&gt;&lt;b&gt;NUMBER&lt;/b&gt;: &lt;code&gt;int32&lt;/code&gt;, &lt;code&gt;double&lt;/code&gt;&lt;/li&gt; &lt;/ul&gt;
     * @param value Value to set for the aspectFormat property.
     */
    public void setAspectFormat(@jakarta.annotation.Nullable final String value) {
        this.aspectFormat = value;
    }
    /**
     * Sets the aspectMaxLength property value. The maximum length of the item/instance aspect&apos;s value. The seller must make sure not to exceed this length when specifying the instance aspect&apos;s value for a product. This field is only returned for instance aspects.
     * @param value Value to set for the aspectMaxLength property.
     */
    public void setAspectMaxLength(@jakarta.annotation.Nullable final Integer value) {
        this.aspectMaxLength = value;
    }
    /**
     * Sets the aspectMode property value. The manner in which values of this aspect must be specified by the seller (as free text or by selecting from available options). 
     * @param value Value to set for the aspectMode property.
     */
    public void setAspectMode(@jakarta.annotation.Nullable final AspectModeEnum value) {
        this.aspectMode = value;
    }
    /**
     * Sets the aspectRequired property value. A value of &lt;code&gt;true&lt;/code&gt; indicates that this aspect is required when offering items in the specified category.
     * @param value Value to set for the aspectRequired property.
     */
    public void setAspectRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.aspectRequired = value;
    }
    /**
     * Sets the aspectUsage property value. The enumeration value returned in this field will indicate if the corresponding aspect is recommended or optional.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; This field is always returned, even for hard-mandated/required aspects (where &lt;strong&gt;aspectRequired&lt;/strong&gt;: &lt;code&gt;true&lt;/code&gt;). The value returned for required aspects will be &lt;code&gt;RECOMMENDED&lt;/code&gt;, but they are actually required and a seller will be blocked from listing or revising an item without these aspects. &lt;/span&gt;
     * @param value Value to set for the aspectUsage property.
     */
    public void setAspectUsage(@jakarta.annotation.Nullable final AspectUsageEnum value) {
        this.aspectUsage = value;
    }
    /**
     * Sets the expectedRequiredByDate property value. The expected date after which the aspect will be required.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; The value returned in this field specifies only an approximate date, which may not reflect the actual date after which the aspect is required.&lt;/span&gt;
     * @param value Value to set for the expectedRequiredByDate property.
     */
    public void setExpectedRequiredByDate(@jakarta.annotation.Nullable final String value) {
        this.expectedRequiredByDate = value;
    }
    /**
     * Sets the itemToAspectCardinality property value. Indicates whether this aspect can accept single or multiple values for items in the specified category.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; Up to 30 values can be supplied for aspects that accept multiple values.&lt;/span&gt;
     * @param value Value to set for the itemToAspectCardinality property.
     */
    public void setItemToAspectCardinality(@jakarta.annotation.Nullable final ItemToAspectCardinalityEnum value) {
        this.itemToAspectCardinality = value;
    }
}

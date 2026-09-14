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
 * This type contains a valid value for an aspect, along with any constraints on the occurrence of that value.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AspectValue implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The localized value of this aspect.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; This value is always localized for the specified marketplace. &lt;/span&gt;
     */
    private String localizedValue;
    /**
     * &lt;i&gt;Not returned if&lt;/i&gt; the value of the &lt;b&gt;localizedValue&lt;/b&gt; field can always be selected for this aspect of the specified category.&lt;br&gt;&lt;br&gt;Contains a list of the dependencies that identify when the value of the &lt;b&gt;localizedValue&lt;/b&gt; field is available for the current aspect. Each dependency specifies the values of another aspect of the same category (a &lt;i&gt;control&lt;/i&gt; aspect), for which the current value of the current aspect can also be selected by the seller. &lt;br&gt;&lt;br&gt;          &lt;b&gt;Example:&lt;/b&gt; A shirt is available in three sizes and three colors, but only the Small and Medium sizes come in Green. Thus for the Color aspect, the value Green is constrained by its dependency on Size (the control aspect). Only when the Size aspect value is Small or Medium, can the Color aspect value of Green be selected by the seller.
     */
    private java.util.List<ValueConstraint> valueConstraints;
    /**
     * Instantiates a new {@link AspectValue} and sets the default values.
     */
    public AspectValue() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AspectValue}
     */
    @jakarta.annotation.Nonnull
    public static AspectValue createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AspectValue();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("localizedValue", (n) -> { this.setLocalizedValue(n.getStringValue()); });
        deserializerMap.put("valueConstraints", (n) -> { this.setValueConstraints(n.getCollectionOfObjectValues(ValueConstraint::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the localizedValue property value. The localized value of this aspect.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; This value is always localized for the specified marketplace. &lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLocalizedValue() {
        return this.localizedValue;
    }
    /**
     * Gets the valueConstraints property value. &lt;i&gt;Not returned if&lt;/i&gt; the value of the &lt;b&gt;localizedValue&lt;/b&gt; field can always be selected for this aspect of the specified category.&lt;br&gt;&lt;br&gt;Contains a list of the dependencies that identify when the value of the &lt;b&gt;localizedValue&lt;/b&gt; field is available for the current aspect. Each dependency specifies the values of another aspect of the same category (a &lt;i&gt;control&lt;/i&gt; aspect), for which the current value of the current aspect can also be selected by the seller. &lt;br&gt;&lt;br&gt;          &lt;b&gt;Example:&lt;/b&gt; A shirt is available in three sizes and three colors, but only the Small and Medium sizes come in Green. Thus for the Color aspect, the value Green is constrained by its dependency on Size (the control aspect). Only when the Size aspect value is Small or Medium, can the Color aspect value of Green be selected by the seller.
     * @return a {@link java.util.List<ValueConstraint>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ValueConstraint> getValueConstraints() {
        return this.valueConstraints;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("localizedValue", this.getLocalizedValue());
        writer.writeCollectionOfObjectValues("valueConstraints", this.getValueConstraints());
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
     * Sets the localizedValue property value. The localized value of this aspect.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; This value is always localized for the specified marketplace. &lt;/span&gt;
     * @param value Value to set for the localizedValue property.
     */
    public void setLocalizedValue(@jakarta.annotation.Nullable final String value) {
        this.localizedValue = value;
    }
    /**
     * Sets the valueConstraints property value. &lt;i&gt;Not returned if&lt;/i&gt; the value of the &lt;b&gt;localizedValue&lt;/b&gt; field can always be selected for this aspect of the specified category.&lt;br&gt;&lt;br&gt;Contains a list of the dependencies that identify when the value of the &lt;b&gt;localizedValue&lt;/b&gt; field is available for the current aspect. Each dependency specifies the values of another aspect of the same category (a &lt;i&gt;control&lt;/i&gt; aspect), for which the current value of the current aspect can also be selected by the seller. &lt;br&gt;&lt;br&gt;          &lt;b&gt;Example:&lt;/b&gt; A shirt is available in three sizes and three colors, but only the Small and Medium sizes come in Green. Thus for the Color aspect, the value Green is constrained by its dependency on Size (the control aspect). Only when the Size aspect value is Small or Medium, can the Color aspect value of Green be selected by the seller.
     * @param value Value to set for the valueConstraints property.
     */
    public void setValueConstraints(@jakarta.annotation.Nullable final java.util.List<ValueConstraint> value) {
        this.valueConstraints = value;
    }
}

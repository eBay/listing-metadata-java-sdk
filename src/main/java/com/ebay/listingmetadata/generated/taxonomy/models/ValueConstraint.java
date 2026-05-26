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
 * This type contains a list of the dependencies that identify when a particular value is available for a given aspect of a given category. Each dependency specifies the values of another aspect of the same category (the &lt;i&gt;control&lt;/i&gt; aspect), for which the given value of the given aspect can also be selected by the seller. This container consists of constraint information for the corresponding product aspect value.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ValueConstraint implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The name of the control aspect on which the current aspect value depends.
     */
    private String applicableForLocalizedAspectName;
    /**
     * Contains a list of the values of the control aspect on which this aspect&apos;s value depends. When the control aspect has any of the specified values, the current value of the current aspect will also be available.
     */
    private java.util.List<String> applicableForLocalizedAspectValues;
    /**
     * Instantiates a new {@link ValueConstraint} and sets the default values.
     */
    public ValueConstraint() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ValueConstraint}
     */
    @jakarta.annotation.Nonnull
    public static ValueConstraint createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ValueConstraint();
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
     * Gets the applicableForLocalizedAspectName property value. The name of the control aspect on which the current aspect value depends.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getApplicableForLocalizedAspectName() {
        return this.applicableForLocalizedAspectName;
    }
    /**
     * Gets the applicableForLocalizedAspectValues property value. Contains a list of the values of the control aspect on which this aspect&apos;s value depends. When the control aspect has any of the specified values, the current value of the current aspect will also be available.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getApplicableForLocalizedAspectValues() {
        return this.applicableForLocalizedAspectValues;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("applicableForLocalizedAspectName", (n) -> { this.setApplicableForLocalizedAspectName(n.getStringValue()); });
        deserializerMap.put("applicableForLocalizedAspectValues", (n) -> { this.setApplicableForLocalizedAspectValues(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("applicableForLocalizedAspectName", this.getApplicableForLocalizedAspectName());
        writer.writeCollectionOfPrimitiveValues("applicableForLocalizedAspectValues", this.getApplicableForLocalizedAspectValues());
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
     * Sets the applicableForLocalizedAspectName property value. The name of the control aspect on which the current aspect value depends.
     * @param value Value to set for the applicableForLocalizedAspectName property.
     */
    public void setApplicableForLocalizedAspectName(@jakarta.annotation.Nullable final String value) {
        this.applicableForLocalizedAspectName = value;
    }
    /**
     * Sets the applicableForLocalizedAspectValues property value. Contains a list of the values of the control aspect on which this aspect&apos;s value depends. When the control aspect has any of the specified values, the current value of the current aspect will also be available.
     * @param value Value to set for the applicableForLocalizedAspectValues property.
     */
    public void setApplicableForLocalizedAspectValues(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.applicableForLocalizedAspectValues = value;
    }
}

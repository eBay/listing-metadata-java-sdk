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
 * This type is used by the &lt;strong&gt;compatibilityProperties&lt;/strong&gt; array that is returned in the &lt;strong&gt;getCompatibilityProperties&lt;/strong&gt; call. The &lt;strong&gt;compatibilityProperties&lt;/strong&gt; container consists of an array of all compatible vehicle properties applicable to the specified eBay marketplace and eBay category ID.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CompatibilityProperty implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This is the localized name of the compatible vehicle property. The language that is used will depend on the user making the call, or based on the language specified if the &lt;strong&gt;Content-Language&lt;/strong&gt; HTTP header is used.&lt;br&gt;&lt;br&gt;In some instances, the string value in this field may be the same as the string in the corresponding &lt;strong&gt;name&lt;/strong&gt; field.
     */
    private String localizedName;
    /**
     * This is the actual name of the compatible vehicle property as it is known on the specified eBay marketplace and in the eBay category. This is the string value that should be used in the &lt;strong&gt;compatibility_property&lt;/strong&gt; and &lt;strong&gt;filter&lt;/strong&gt; query parameters of a &lt;strong&gt;getCompatibilityPropertyValues&lt;/strong&gt; request URI. &lt;br&gt;&lt;br&gt; Typical vehicle properties are &apos;Make&apos;, &apos;Model&apos;, &apos;Year&apos;, &apos;Engine&apos;, and &apos;Trim&apos;, but will vary based on the eBay marketplace and the eBay category.
     */
    private String name;
    /**
     * Instantiates a new {@link CompatibilityProperty} and sets the default values.
     */
    public CompatibilityProperty() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CompatibilityProperty}
     */
    @jakarta.annotation.Nonnull
    public static CompatibilityProperty createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CompatibilityProperty();
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
        deserializerMap.put("localizedName", (n) -> { this.setLocalizedName(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the localizedName property value. This is the localized name of the compatible vehicle property. The language that is used will depend on the user making the call, or based on the language specified if the &lt;strong&gt;Content-Language&lt;/strong&gt; HTTP header is used.&lt;br&gt;&lt;br&gt;In some instances, the string value in this field may be the same as the string in the corresponding &lt;strong&gt;name&lt;/strong&gt; field.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLocalizedName() {
        return this.localizedName;
    }
    /**
     * Gets the name property value. This is the actual name of the compatible vehicle property as it is known on the specified eBay marketplace and in the eBay category. This is the string value that should be used in the &lt;strong&gt;compatibility_property&lt;/strong&gt; and &lt;strong&gt;filter&lt;/strong&gt; query parameters of a &lt;strong&gt;getCompatibilityPropertyValues&lt;/strong&gt; request URI. &lt;br&gt;&lt;br&gt; Typical vehicle properties are &apos;Make&apos;, &apos;Model&apos;, &apos;Year&apos;, &apos;Engine&apos;, and &apos;Trim&apos;, but will vary based on the eBay marketplace and the eBay category.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("localizedName", this.getLocalizedName());
        writer.writeStringValue("name", this.getName());
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
     * Sets the localizedName property value. This is the localized name of the compatible vehicle property. The language that is used will depend on the user making the call, or based on the language specified if the &lt;strong&gt;Content-Language&lt;/strong&gt; HTTP header is used.&lt;br&gt;&lt;br&gt;In some instances, the string value in this field may be the same as the string in the corresponding &lt;strong&gt;name&lt;/strong&gt; field.
     * @param value Value to set for the localizedName property.
     */
    public void setLocalizedName(@jakarta.annotation.Nullable final String value) {
        this.localizedName = value;
    }
    /**
     * Sets the name property value. This is the actual name of the compatible vehicle property as it is known on the specified eBay marketplace and in the eBay category. This is the string value that should be used in the &lt;strong&gt;compatibility_property&lt;/strong&gt; and &lt;strong&gt;filter&lt;/strong&gt; query parameters of a &lt;strong&gt;getCompatibilityPropertyValues&lt;/strong&gt; request URI. &lt;br&gt;&lt;br&gt; Typical vehicle properties are &apos;Make&apos;, &apos;Model&apos;, &apos;Year&apos;, &apos;Engine&apos;, and &apos;Trim&apos;, but will vary based on the eBay marketplace and the eBay category.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
}

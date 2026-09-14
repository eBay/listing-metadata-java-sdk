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
 * This field specifies the default currency used by the marketplace.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Currency implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The three-letter &lt;a href=&quot;https://www.iso.org/iso-4217-currency-codes.html &quot; target=&quot;_blank&quot;&gt;ISO 4217&lt;/a&gt; code returned.  &lt;br /&gt;&lt;br /&gt;&lt;b&gt;Restriction: &lt;/b&gt; Only the currency of the marketplace is supported. Examples: on the US marketplace, the only currency supported is the United States dollar, &lt;code&gt;USD&lt;/code&gt;; on the Canadian marketplace, the only currency supported is the Canadian dollar, &lt;code&gt;CAD&lt;/code&gt;.
     */
    private CurrencyCodeEnum code;
    /**
     * The description of the returned three-letter code. For example, if the code is &lt;code&gt;USD&lt;/code&gt;, the description returned would be &lt;code&gt;US Dollar&lt;/code&gt;.
     */
    private String description;
    /**
     * Instantiates a new {@link Currency} and sets the default values.
     */
    public Currency() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Currency}
     */
    @jakarta.annotation.Nonnull
    public static Currency createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Currency();
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
     * Gets the code property value. The three-letter &lt;a href=&quot;https://www.iso.org/iso-4217-currency-codes.html &quot; target=&quot;_blank&quot;&gt;ISO 4217&lt;/a&gt; code returned.  &lt;br /&gt;&lt;br /&gt;&lt;b&gt;Restriction: &lt;/b&gt; Only the currency of the marketplace is supported. Examples: on the US marketplace, the only currency supported is the United States dollar, &lt;code&gt;USD&lt;/code&gt;; on the Canadian marketplace, the only currency supported is the Canadian dollar, &lt;code&gt;CAD&lt;/code&gt;.
     * @return a {@link CurrencyCodeEnum}
     */
    @jakarta.annotation.Nullable
    public CurrencyCodeEnum getCode() {
        return this.code;
    }
    /**
     * Gets the description property value. The description of the returned three-letter code. For example, if the code is &lt;code&gt;USD&lt;/code&gt;, the description returned would be &lt;code&gt;US Dollar&lt;/code&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("code", (n) -> { this.setCode(n.getEnumValue(CurrencyCodeEnum::forValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("code", this.getCode());
        writer.writeStringValue("description", this.getDescription());
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
     * Sets the code property value. The three-letter &lt;a href=&quot;https://www.iso.org/iso-4217-currency-codes.html &quot; target=&quot;_blank&quot;&gt;ISO 4217&lt;/a&gt; code returned.  &lt;br /&gt;&lt;br /&gt;&lt;b&gt;Restriction: &lt;/b&gt; Only the currency of the marketplace is supported. Examples: on the US marketplace, the only currency supported is the United States dollar, &lt;code&gt;USD&lt;/code&gt;; on the Canadian marketplace, the only currency supported is the Canadian dollar, &lt;code&gt;CAD&lt;/code&gt;.
     * @param value Value to set for the code property.
     */
    public void setCode(@jakarta.annotation.Nullable final CurrencyCodeEnum value) {
        this.code = value;
    }
    /**
     * Sets the description property value. The description of the returned three-letter code. For example, if the code is &lt;code&gt;USD&lt;/code&gt;, the description returned would be &lt;code&gt;US Dollar&lt;/code&gt;.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
}

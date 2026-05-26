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
 * A type that defines the attributes of an Extended Producer Responsibility policy.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExtendedProducerResponsibility implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * An indication of whether the attribute can be enabled for listing variations.&lt;br&gt;&lt;br&gt;If the value is &lt;code&gt;true&lt;/code&gt;, the attribute may be specified at the variation level.
     */
    private Boolean enabledForVariations;
    /**
     * The name of the attribute included in the policy. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:ExtendedProducerResponsibilityEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String name;
    /**
     * The usage guidelines for the attribute, in the specified marketplace. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:GenericUsageEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String usage;
    /**
     * Instantiates a new {@link ExtendedProducerResponsibility} and sets the default values.
     */
    public ExtendedProducerResponsibility() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ExtendedProducerResponsibility}
     */
    @jakarta.annotation.Nonnull
    public static ExtendedProducerResponsibility createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExtendedProducerResponsibility();
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
     * Gets the enabledForVariations property value. An indication of whether the attribute can be enabled for listing variations.&lt;br&gt;&lt;br&gt;If the value is &lt;code&gt;true&lt;/code&gt;, the attribute may be specified at the variation level.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEnabledForVariations() {
        return this.enabledForVariations;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("enabledForVariations", (n) -> { this.setEnabledForVariations(n.getBooleanValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("usage", (n) -> { this.setUsage(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. The name of the attribute included in the policy. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:ExtendedProducerResponsibilityEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the usage property value. The usage guidelines for the attribute, in the specified marketplace. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:GenericUsageEnum&apos;&gt;eBay API documentation&lt;/a&gt;
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
        writer.writeBooleanValue("enabledForVariations", this.getEnabledForVariations());
        writer.writeStringValue("name", this.getName());
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
     * Sets the enabledForVariations property value. An indication of whether the attribute can be enabled for listing variations.&lt;br&gt;&lt;br&gt;If the value is &lt;code&gt;true&lt;/code&gt;, the attribute may be specified at the variation level.
     * @param value Value to set for the enabledForVariations property.
     */
    public void setEnabledForVariations(@jakarta.annotation.Nullable final Boolean value) {
        this.enabledForVariations = value;
    }
    /**
     * Sets the name property value. The name of the attribute included in the policy. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:ExtendedProducerResponsibilityEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the usage property value. The usage guidelines for the attribute, in the specified marketplace. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/sel:GenericUsageEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the usage property.
     */
    public void setUsage(@jakarta.annotation.Nullable final String value) {
        this.usage = value;
    }
}

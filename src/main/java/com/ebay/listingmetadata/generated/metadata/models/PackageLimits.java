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
 * The packageLimits field is used to specify the physical constraints and measurement units of packages, ensuring compliance with various shipping requirements.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PackageLimits implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Unit of dimensional measurement, for example &lt;code&gt;INCH&lt;/code&gt; or &lt;code&gt;CENTIMETER&lt;/code&gt;. 
     */
    private String dimensionUnit;
    /**
     * The maximum girth allowed for a package shipped through the corresponding shipping service, as measured in units of &lt;a href=&quot;/api-docs/sell/metadata/resources/shipping:marketplace/methods/getShippingServices#response.shippingServices.packageLimits.dimensionUnit&quot;&gt;dimensionUnit&lt;/a&gt;.
     */
    private Double maxGirth;
    /**
     * The maximum height allowed for a package shipped through the corresponding shipping service, as measured in units of &lt;a href=&quot;/api-docs/sell/metadata/resources/shipping:marketplace/methods/getShippingServices#response.shippingServices.packageLimits.dimensionUnit&quot;&gt;dimensionUnit&lt;/a&gt;.
     */
    private Double maxHeight;
    /**
     * The maximum length allowed for a package shipped through the corresponding shipping service, as measured in units of &lt;a href=&quot;/api-docs/sell/metadata/resources/shipping:marketplace/methods/getShippingServices#response.shippingServices.packageLimits.dimensionUnit&quot;&gt;dimensionUnit&lt;/a&gt;.
     */
    private Double maxLength;
    /**
     * The maximum weight allowed for a package shipped through the corresponding shipping service, as measured in units of &lt;a href=&quot;/api-docs/sell/metadata/resources/shipping:marketplace/methods/getShippingServices#response.shippingServices.packageLimits.weightUnit&quot;&gt;weightUnit&lt;/a&gt;.
     */
    private Double maxWeight;
    /**
     * The maximum width allowed for a package shipped through the corresponding shipping service, as measured in units of &lt;a href=&quot;/api-docs/sell/metadata/resources/shipping:marketplace/methods/getShippingServices#response.shippingServices.packageLimits.dimensionUnit&quot;&gt;dimensionUnit&lt;/a&gt;.
     */
    private Double maxWidth;
    /**
     * The minimum girth allowed for a package shipped through the corresponding shipping service, as measured in units of &lt;a href=&quot;/api-docs/sell/metadata/resources/shipping:marketplace/methods/getShippingServices#response.shippingServices.packageLimits.dimensionUnit&quot;&gt;dimensionUnit&lt;/a&gt;.
     */
    private Double minGirth;
    /**
     * The minimum height allowed for a package shipped through the corresponding shipping service, as measured in units of &lt;a href=&quot;/api-docs/sell/metadata/resources/shipping:marketplace/methods/getShippingServices#response.shippingServices.packageLimits.dimensionUnit&quot;&gt;dimensionUnit&lt;/a&gt;.
     */
    private Double minHeight;
    /**
     * The minimum length allowed for a package shipped through the corresponding shipping service, as measured in units of &lt;a href=&quot;/api-docs/sell/metadata/resources/shipping:marketplace/methods/getShippingServices#response.shippingServices.packageLimits.dimensionUnit&quot;&gt;dimensionUnit&lt;/a&gt;.
     */
    private Double minLength;
    /**
     * The minimum weight allowed for a package shipped through the corresponding shipping service, as measured in units of &lt;a href=&quot;/api-docs/sell/metadata/resources/shipping:marketplace/methods/getShippingServices#response.shippingServices.packageLimits.weightUnit&quot;&gt;weightUnit&lt;/a&gt;.
     */
    private Double minWeight;
    /**
     * The minimum width allowed for a package shipped through the corresponding shipping service, as measured in units of &lt;a href=&quot;/api-docs/sell/metadata/resources/shipping:marketplace/methods/getShippingServices#response.shippingServices.packageLimits.dimensionUnit&quot;&gt;dimensionUnit&lt;/a&gt;.
     */
    private Double minWidth;
    /**
     * Unit of weight measurement, for example &lt;code&gt;KILOGRAM&lt;/code&gt; or &lt;code&gt;OUNCE&lt;/code&gt;. 
     */
    private String weightUnit;
    /**
     * Instantiates a new {@link PackageLimits} and sets the default values.
     */
    public PackageLimits() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PackageLimits}
     */
    @jakarta.annotation.Nonnull
    public static PackageLimits createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PackageLimits();
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
     * Gets the dimensionUnit property value. Unit of dimensional measurement, for example &lt;code&gt;INCH&lt;/code&gt; or &lt;code&gt;CENTIMETER&lt;/code&gt;. 
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDimensionUnit() {
        return this.dimensionUnit;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(12);
        deserializerMap.put("dimensionUnit", (n) -> { this.setDimensionUnit(n.getStringValue()); });
        deserializerMap.put("maxGirth", (n) -> { this.setMaxGirth(n.getDoubleValue()); });
        deserializerMap.put("maxHeight", (n) -> { this.setMaxHeight(n.getDoubleValue()); });
        deserializerMap.put("maxLength", (n) -> { this.setMaxLength(n.getDoubleValue()); });
        deserializerMap.put("maxWeight", (n) -> { this.setMaxWeight(n.getDoubleValue()); });
        deserializerMap.put("maxWidth", (n) -> { this.setMaxWidth(n.getDoubleValue()); });
        deserializerMap.put("minGirth", (n) -> { this.setMinGirth(n.getDoubleValue()); });
        deserializerMap.put("minHeight", (n) -> { this.setMinHeight(n.getDoubleValue()); });
        deserializerMap.put("minLength", (n) -> { this.setMinLength(n.getDoubleValue()); });
        deserializerMap.put("minWeight", (n) -> { this.setMinWeight(n.getDoubleValue()); });
        deserializerMap.put("minWidth", (n) -> { this.setMinWidth(n.getDoubleValue()); });
        deserializerMap.put("weightUnit", (n) -> { this.setWeightUnit(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the maxGirth property value. The maximum girth allowed for a package shipped through the corresponding shipping service, as measured in units of &lt;a href=&quot;/api-docs/sell/metadata/resources/shipping:marketplace/methods/getShippingServices#response.shippingServices.packageLimits.dimensionUnit&quot;&gt;dimensionUnit&lt;/a&gt;.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getMaxGirth() {
        return this.maxGirth;
    }
    /**
     * Gets the maxHeight property value. The maximum height allowed for a package shipped through the corresponding shipping service, as measured in units of &lt;a href=&quot;/api-docs/sell/metadata/resources/shipping:marketplace/methods/getShippingServices#response.shippingServices.packageLimits.dimensionUnit&quot;&gt;dimensionUnit&lt;/a&gt;.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getMaxHeight() {
        return this.maxHeight;
    }
    /**
     * Gets the maxLength property value. The maximum length allowed for a package shipped through the corresponding shipping service, as measured in units of &lt;a href=&quot;/api-docs/sell/metadata/resources/shipping:marketplace/methods/getShippingServices#response.shippingServices.packageLimits.dimensionUnit&quot;&gt;dimensionUnit&lt;/a&gt;.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getMaxLength() {
        return this.maxLength;
    }
    /**
     * Gets the maxWeight property value. The maximum weight allowed for a package shipped through the corresponding shipping service, as measured in units of &lt;a href=&quot;/api-docs/sell/metadata/resources/shipping:marketplace/methods/getShippingServices#response.shippingServices.packageLimits.weightUnit&quot;&gt;weightUnit&lt;/a&gt;.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getMaxWeight() {
        return this.maxWeight;
    }
    /**
     * Gets the maxWidth property value. The maximum width allowed for a package shipped through the corresponding shipping service, as measured in units of &lt;a href=&quot;/api-docs/sell/metadata/resources/shipping:marketplace/methods/getShippingServices#response.shippingServices.packageLimits.dimensionUnit&quot;&gt;dimensionUnit&lt;/a&gt;.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getMaxWidth() {
        return this.maxWidth;
    }
    /**
     * Gets the minGirth property value. The minimum girth allowed for a package shipped through the corresponding shipping service, as measured in units of &lt;a href=&quot;/api-docs/sell/metadata/resources/shipping:marketplace/methods/getShippingServices#response.shippingServices.packageLimits.dimensionUnit&quot;&gt;dimensionUnit&lt;/a&gt;.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getMinGirth() {
        return this.minGirth;
    }
    /**
     * Gets the minHeight property value. The minimum height allowed for a package shipped through the corresponding shipping service, as measured in units of &lt;a href=&quot;/api-docs/sell/metadata/resources/shipping:marketplace/methods/getShippingServices#response.shippingServices.packageLimits.dimensionUnit&quot;&gt;dimensionUnit&lt;/a&gt;.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getMinHeight() {
        return this.minHeight;
    }
    /**
     * Gets the minLength property value. The minimum length allowed for a package shipped through the corresponding shipping service, as measured in units of &lt;a href=&quot;/api-docs/sell/metadata/resources/shipping:marketplace/methods/getShippingServices#response.shippingServices.packageLimits.dimensionUnit&quot;&gt;dimensionUnit&lt;/a&gt;.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getMinLength() {
        return this.minLength;
    }
    /**
     * Gets the minWeight property value. The minimum weight allowed for a package shipped through the corresponding shipping service, as measured in units of &lt;a href=&quot;/api-docs/sell/metadata/resources/shipping:marketplace/methods/getShippingServices#response.shippingServices.packageLimits.weightUnit&quot;&gt;weightUnit&lt;/a&gt;.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getMinWeight() {
        return this.minWeight;
    }
    /**
     * Gets the minWidth property value. The minimum width allowed for a package shipped through the corresponding shipping service, as measured in units of &lt;a href=&quot;/api-docs/sell/metadata/resources/shipping:marketplace/methods/getShippingServices#response.shippingServices.packageLimits.dimensionUnit&quot;&gt;dimensionUnit&lt;/a&gt;.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getMinWidth() {
        return this.minWidth;
    }
    /**
     * Gets the weightUnit property value. Unit of weight measurement, for example &lt;code&gt;KILOGRAM&lt;/code&gt; or &lt;code&gt;OUNCE&lt;/code&gt;. 
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getWeightUnit() {
        return this.weightUnit;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("dimensionUnit", this.getDimensionUnit());
        writer.writeDoubleValue("maxGirth", this.getMaxGirth());
        writer.writeDoubleValue("maxHeight", this.getMaxHeight());
        writer.writeDoubleValue("maxLength", this.getMaxLength());
        writer.writeDoubleValue("maxWeight", this.getMaxWeight());
        writer.writeDoubleValue("maxWidth", this.getMaxWidth());
        writer.writeDoubleValue("minGirth", this.getMinGirth());
        writer.writeDoubleValue("minHeight", this.getMinHeight());
        writer.writeDoubleValue("minLength", this.getMinLength());
        writer.writeDoubleValue("minWeight", this.getMinWeight());
        writer.writeDoubleValue("minWidth", this.getMinWidth());
        writer.writeStringValue("weightUnit", this.getWeightUnit());
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
     * Sets the dimensionUnit property value. Unit of dimensional measurement, for example &lt;code&gt;INCH&lt;/code&gt; or &lt;code&gt;CENTIMETER&lt;/code&gt;. 
     * @param value Value to set for the dimensionUnit property.
     */
    public void setDimensionUnit(@jakarta.annotation.Nullable final String value) {
        this.dimensionUnit = value;
    }
    /**
     * Sets the maxGirth property value. The maximum girth allowed for a package shipped through the corresponding shipping service, as measured in units of &lt;a href=&quot;/api-docs/sell/metadata/resources/shipping:marketplace/methods/getShippingServices#response.shippingServices.packageLimits.dimensionUnit&quot;&gt;dimensionUnit&lt;/a&gt;.
     * @param value Value to set for the maxGirth property.
     */
    public void setMaxGirth(@jakarta.annotation.Nullable final Double value) {
        this.maxGirth = value;
    }
    /**
     * Sets the maxHeight property value. The maximum height allowed for a package shipped through the corresponding shipping service, as measured in units of &lt;a href=&quot;/api-docs/sell/metadata/resources/shipping:marketplace/methods/getShippingServices#response.shippingServices.packageLimits.dimensionUnit&quot;&gt;dimensionUnit&lt;/a&gt;.
     * @param value Value to set for the maxHeight property.
     */
    public void setMaxHeight(@jakarta.annotation.Nullable final Double value) {
        this.maxHeight = value;
    }
    /**
     * Sets the maxLength property value. The maximum length allowed for a package shipped through the corresponding shipping service, as measured in units of &lt;a href=&quot;/api-docs/sell/metadata/resources/shipping:marketplace/methods/getShippingServices#response.shippingServices.packageLimits.dimensionUnit&quot;&gt;dimensionUnit&lt;/a&gt;.
     * @param value Value to set for the maxLength property.
     */
    public void setMaxLength(@jakarta.annotation.Nullable final Double value) {
        this.maxLength = value;
    }
    /**
     * Sets the maxWeight property value. The maximum weight allowed for a package shipped through the corresponding shipping service, as measured in units of &lt;a href=&quot;/api-docs/sell/metadata/resources/shipping:marketplace/methods/getShippingServices#response.shippingServices.packageLimits.weightUnit&quot;&gt;weightUnit&lt;/a&gt;.
     * @param value Value to set for the maxWeight property.
     */
    public void setMaxWeight(@jakarta.annotation.Nullable final Double value) {
        this.maxWeight = value;
    }
    /**
     * Sets the maxWidth property value. The maximum width allowed for a package shipped through the corresponding shipping service, as measured in units of &lt;a href=&quot;/api-docs/sell/metadata/resources/shipping:marketplace/methods/getShippingServices#response.shippingServices.packageLimits.dimensionUnit&quot;&gt;dimensionUnit&lt;/a&gt;.
     * @param value Value to set for the maxWidth property.
     */
    public void setMaxWidth(@jakarta.annotation.Nullable final Double value) {
        this.maxWidth = value;
    }
    /**
     * Sets the minGirth property value. The minimum girth allowed for a package shipped through the corresponding shipping service, as measured in units of &lt;a href=&quot;/api-docs/sell/metadata/resources/shipping:marketplace/methods/getShippingServices#response.shippingServices.packageLimits.dimensionUnit&quot;&gt;dimensionUnit&lt;/a&gt;.
     * @param value Value to set for the minGirth property.
     */
    public void setMinGirth(@jakarta.annotation.Nullable final Double value) {
        this.minGirth = value;
    }
    /**
     * Sets the minHeight property value. The minimum height allowed for a package shipped through the corresponding shipping service, as measured in units of &lt;a href=&quot;/api-docs/sell/metadata/resources/shipping:marketplace/methods/getShippingServices#response.shippingServices.packageLimits.dimensionUnit&quot;&gt;dimensionUnit&lt;/a&gt;.
     * @param value Value to set for the minHeight property.
     */
    public void setMinHeight(@jakarta.annotation.Nullable final Double value) {
        this.minHeight = value;
    }
    /**
     * Sets the minLength property value. The minimum length allowed for a package shipped through the corresponding shipping service, as measured in units of &lt;a href=&quot;/api-docs/sell/metadata/resources/shipping:marketplace/methods/getShippingServices#response.shippingServices.packageLimits.dimensionUnit&quot;&gt;dimensionUnit&lt;/a&gt;.
     * @param value Value to set for the minLength property.
     */
    public void setMinLength(@jakarta.annotation.Nullable final Double value) {
        this.minLength = value;
    }
    /**
     * Sets the minWeight property value. The minimum weight allowed for a package shipped through the corresponding shipping service, as measured in units of &lt;a href=&quot;/api-docs/sell/metadata/resources/shipping:marketplace/methods/getShippingServices#response.shippingServices.packageLimits.weightUnit&quot;&gt;weightUnit&lt;/a&gt;.
     * @param value Value to set for the minWeight property.
     */
    public void setMinWeight(@jakarta.annotation.Nullable final Double value) {
        this.minWeight = value;
    }
    /**
     * Sets the minWidth property value. The minimum width allowed for a package shipped through the corresponding shipping service, as measured in units of &lt;a href=&quot;/api-docs/sell/metadata/resources/shipping:marketplace/methods/getShippingServices#response.shippingServices.packageLimits.dimensionUnit&quot;&gt;dimensionUnit&lt;/a&gt;.
     * @param value Value to set for the minWidth property.
     */
    public void setMinWidth(@jakarta.annotation.Nullable final Double value) {
        this.minWidth = value;
    }
    /**
     * Sets the weightUnit property value. Unit of weight measurement, for example &lt;code&gt;KILOGRAM&lt;/code&gt; or &lt;code&gt;OUNCE&lt;/code&gt;. 
     * @param value Value to set for the weightUnit property.
     */
    public void setWeightUnit(@jakarta.annotation.Nullable final String value) {
        this.weightUnit = value;
    }
}

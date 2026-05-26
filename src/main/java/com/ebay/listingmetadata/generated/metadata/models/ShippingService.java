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
 * This type provides applicable shipping service metadata.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ShippingService implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This field returns the localized name of the shipping service.
     */
    private String description;
    /**
     * A value of &lt;code&gt;true&lt;/code&gt; indicates that the shipping service is international. An international shipping service option is required if an item is being shipped from one country (origin) to another (destination).
     */
    private Boolean internationalService;
    /**
     * This value indicates the maximum number of business days that it takes the &lt;b&gt;shippingCarrier&lt;/b&gt; to ship an item using the corresponding &lt;b&gt;shippingService&lt;/b&gt;. 
     */
    private Integer maxShippingTime;
    /**
     * This value indicates the minimum number of business days that it takes the &lt;b&gt;shippingCarrier&lt;/b&gt; to ship an item using the corresponding &lt;b&gt;shippingService&lt;/b&gt;. 
     */
    private Integer minShippingTime;
    /**
     * The packageLimits field is used to specify the physical constraints and measurement units of packages, ensuring compliance with various shipping requirements.
     */
    private PackageLimits packageLimits;
    /**
     * The code for the shipping carrier returned, for example, &lt;code&gt;UPS&lt;/code&gt;, &lt;code&gt;FedEx&lt;/code&gt;, and &lt;code&gt;USPS&lt;/code&gt;.
     */
    private String shippingCarrier;
    /**
     * The shipping category of the shipping service including:  &lt;code&gt;ECONOMY&lt;/code&gt;, &lt;code&gt;STANDARD&lt;/code&gt;, &lt;code&gt;EXPEDITED&lt;/code&gt;, &lt;code&gt;ONE_DAY&lt;/code&gt;, &lt;code&gt;PICKUP&lt;/code&gt;, and other similar categories.
     */
    private String shippingCategory;
    /**
     * A list of shipping cost types that this shipping service option supports. For example, &lt;code&gt;FLAT_RATE&lt;/code&gt;, &lt;code&gt;CALCULATED&lt;/code&gt;, and &lt;code&gt;FREIGHT&lt;/code&gt;.
     */
    private java.util.List<String> shippingCostTypes;
    /**
     * The name of the shipping service. The shipping service named here can only be used in listings or in business policies if &lt;b&gt;validForSellingFlow&lt;/b&gt; is &lt;code&gt;true&lt;/code&gt;. The value returned in this field is used in listing APIs and business policies to set the shipping service.
     */
    private String shippingService;
    /**
     * A value of &lt;code&gt;true&lt;/code&gt; indicates that the &lt;b&gt;shippingService&lt;/b&gt; can be set as an available shipping service in the listing or through the fulfillment business policy.
     */
    private Boolean validForSellingFlow;
    /**
     * Instantiates a new {@link ShippingService} and sets the default values.
     */
    public ShippingService() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ShippingService}
     */
    @jakarta.annotation.Nonnull
    public static ShippingService createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ShippingService();
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
     * Gets the description property value. This field returns the localized name of the shipping service.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("internationalService", (n) -> { this.setInternationalService(n.getBooleanValue()); });
        deserializerMap.put("maxShippingTime", (n) -> { this.setMaxShippingTime(n.getIntegerValue()); });
        deserializerMap.put("minShippingTime", (n) -> { this.setMinShippingTime(n.getIntegerValue()); });
        deserializerMap.put("packageLimits", (n) -> { this.setPackageLimits(n.getObjectValue(PackageLimits::createFromDiscriminatorValue)); });
        deserializerMap.put("shippingCarrier", (n) -> { this.setShippingCarrier(n.getStringValue()); });
        deserializerMap.put("shippingCategory", (n) -> { this.setShippingCategory(n.getStringValue()); });
        deserializerMap.put("shippingCostTypes", (n) -> { this.setShippingCostTypes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("shippingService", (n) -> { this.setShippingService(n.getStringValue()); });
        deserializerMap.put("validForSellingFlow", (n) -> { this.setValidForSellingFlow(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the internationalService property value. A value of &lt;code&gt;true&lt;/code&gt; indicates that the shipping service is international. An international shipping service option is required if an item is being shipped from one country (origin) to another (destination).
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getInternationalService() {
        return this.internationalService;
    }
    /**
     * Gets the maxShippingTime property value. This value indicates the maximum number of business days that it takes the &lt;b&gt;shippingCarrier&lt;/b&gt; to ship an item using the corresponding &lt;b&gt;shippingService&lt;/b&gt;. 
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMaxShippingTime() {
        return this.maxShippingTime;
    }
    /**
     * Gets the minShippingTime property value. This value indicates the minimum number of business days that it takes the &lt;b&gt;shippingCarrier&lt;/b&gt; to ship an item using the corresponding &lt;b&gt;shippingService&lt;/b&gt;. 
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMinShippingTime() {
        return this.minShippingTime;
    }
    /**
     * Gets the packageLimits property value. The packageLimits field is used to specify the physical constraints and measurement units of packages, ensuring compliance with various shipping requirements.
     * @return a {@link PackageLimits}
     */
    @jakarta.annotation.Nullable
    public PackageLimits getPackageLimits() {
        return this.packageLimits;
    }
    /**
     * Gets the shippingCarrier property value. The code for the shipping carrier returned, for example, &lt;code&gt;UPS&lt;/code&gt;, &lt;code&gt;FedEx&lt;/code&gt;, and &lt;code&gt;USPS&lt;/code&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getShippingCarrier() {
        return this.shippingCarrier;
    }
    /**
     * Gets the shippingCategory property value. The shipping category of the shipping service including:  &lt;code&gt;ECONOMY&lt;/code&gt;, &lt;code&gt;STANDARD&lt;/code&gt;, &lt;code&gt;EXPEDITED&lt;/code&gt;, &lt;code&gt;ONE_DAY&lt;/code&gt;, &lt;code&gt;PICKUP&lt;/code&gt;, and other similar categories.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getShippingCategory() {
        return this.shippingCategory;
    }
    /**
     * Gets the shippingCostTypes property value. A list of shipping cost types that this shipping service option supports. For example, &lt;code&gt;FLAT_RATE&lt;/code&gt;, &lt;code&gt;CALCULATED&lt;/code&gt;, and &lt;code&gt;FREIGHT&lt;/code&gt;.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getShippingCostTypes() {
        return this.shippingCostTypes;
    }
    /**
     * Gets the shippingService property value. The name of the shipping service. The shipping service named here can only be used in listings or in business policies if &lt;b&gt;validForSellingFlow&lt;/b&gt; is &lt;code&gt;true&lt;/code&gt;. The value returned in this field is used in listing APIs and business policies to set the shipping service.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getShippingService() {
        return this.shippingService;
    }
    /**
     * Gets the validForSellingFlow property value. A value of &lt;code&gt;true&lt;/code&gt; indicates that the &lt;b&gt;shippingService&lt;/b&gt; can be set as an available shipping service in the listing or through the fulfillment business policy.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getValidForSellingFlow() {
        return this.validForSellingFlow;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeBooleanValue("internationalService", this.getInternationalService());
        writer.writeIntegerValue("maxShippingTime", this.getMaxShippingTime());
        writer.writeIntegerValue("minShippingTime", this.getMinShippingTime());
        writer.writeObjectValue("packageLimits", this.getPackageLimits());
        writer.writeStringValue("shippingCarrier", this.getShippingCarrier());
        writer.writeStringValue("shippingCategory", this.getShippingCategory());
        writer.writeCollectionOfPrimitiveValues("shippingCostTypes", this.getShippingCostTypes());
        writer.writeStringValue("shippingService", this.getShippingService());
        writer.writeBooleanValue("validForSellingFlow", this.getValidForSellingFlow());
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
     * Sets the description property value. This field returns the localized name of the shipping service.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the internationalService property value. A value of &lt;code&gt;true&lt;/code&gt; indicates that the shipping service is international. An international shipping service option is required if an item is being shipped from one country (origin) to another (destination).
     * @param value Value to set for the internationalService property.
     */
    public void setInternationalService(@jakarta.annotation.Nullable final Boolean value) {
        this.internationalService = value;
    }
    /**
     * Sets the maxShippingTime property value. This value indicates the maximum number of business days that it takes the &lt;b&gt;shippingCarrier&lt;/b&gt; to ship an item using the corresponding &lt;b&gt;shippingService&lt;/b&gt;. 
     * @param value Value to set for the maxShippingTime property.
     */
    public void setMaxShippingTime(@jakarta.annotation.Nullable final Integer value) {
        this.maxShippingTime = value;
    }
    /**
     * Sets the minShippingTime property value. This value indicates the minimum number of business days that it takes the &lt;b&gt;shippingCarrier&lt;/b&gt; to ship an item using the corresponding &lt;b&gt;shippingService&lt;/b&gt;. 
     * @param value Value to set for the minShippingTime property.
     */
    public void setMinShippingTime(@jakarta.annotation.Nullable final Integer value) {
        this.minShippingTime = value;
    }
    /**
     * Sets the packageLimits property value. The packageLimits field is used to specify the physical constraints and measurement units of packages, ensuring compliance with various shipping requirements.
     * @param value Value to set for the packageLimits property.
     */
    public void setPackageLimits(@jakarta.annotation.Nullable final PackageLimits value) {
        this.packageLimits = value;
    }
    /**
     * Sets the shippingCarrier property value. The code for the shipping carrier returned, for example, &lt;code&gt;UPS&lt;/code&gt;, &lt;code&gt;FedEx&lt;/code&gt;, and &lt;code&gt;USPS&lt;/code&gt;.
     * @param value Value to set for the shippingCarrier property.
     */
    public void setShippingCarrier(@jakarta.annotation.Nullable final String value) {
        this.shippingCarrier = value;
    }
    /**
     * Sets the shippingCategory property value. The shipping category of the shipping service including:  &lt;code&gt;ECONOMY&lt;/code&gt;, &lt;code&gt;STANDARD&lt;/code&gt;, &lt;code&gt;EXPEDITED&lt;/code&gt;, &lt;code&gt;ONE_DAY&lt;/code&gt;, &lt;code&gt;PICKUP&lt;/code&gt;, and other similar categories.
     * @param value Value to set for the shippingCategory property.
     */
    public void setShippingCategory(@jakarta.annotation.Nullable final String value) {
        this.shippingCategory = value;
    }
    /**
     * Sets the shippingCostTypes property value. A list of shipping cost types that this shipping service option supports. For example, &lt;code&gt;FLAT_RATE&lt;/code&gt;, &lt;code&gt;CALCULATED&lt;/code&gt;, and &lt;code&gt;FREIGHT&lt;/code&gt;.
     * @param value Value to set for the shippingCostTypes property.
     */
    public void setShippingCostTypes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.shippingCostTypes = value;
    }
    /**
     * Sets the shippingService property value. The name of the shipping service. The shipping service named here can only be used in listings or in business policies if &lt;b&gt;validForSellingFlow&lt;/b&gt; is &lt;code&gt;true&lt;/code&gt;. The value returned in this field is used in listing APIs and business policies to set the shipping service.
     * @param value Value to set for the shippingService property.
     */
    public void setShippingService(@jakarta.annotation.Nullable final String value) {
        this.shippingService = value;
    }
    /**
     * Sets the validForSellingFlow property value. A value of &lt;code&gt;true&lt;/code&gt; indicates that the &lt;b&gt;shippingService&lt;/b&gt; can be set as an available shipping service in the listing or through the fulfillment business policy.
     * @param value Value to set for the validForSellingFlow property.
     */
    public void setValidForSellingFlow(@jakarta.annotation.Nullable final Boolean value) {
        this.validForSellingFlow = value;
    }
}

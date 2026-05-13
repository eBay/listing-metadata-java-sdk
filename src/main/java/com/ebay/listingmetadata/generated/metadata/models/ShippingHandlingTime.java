package com.ebay.listingmetadata.generated.metadata.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type provides applicable shipping handling time metadata.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ShippingHandlingTime implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The localized description of the maximum handling time.
     */
    private String description;
    /**
     * This field is only returned if its value is &lt;code&gt;true&lt;/code&gt;. If returned, it indicates that the corresponding handling time is considered extended handling for the marketplace. Extended handling times may be used for freight shipping, but should generally be avoided if possible, as they might adversely affect the buying decisions of potential customers.
     */
    private Boolean extendedHandling;
    /**
     * The integer value returned in this field indicates the maximum number of business days that the eBay site allows as a seller&apos;s handling time measured from when the buyer pays for the order. For example,  if the &lt;b&gt;maxHandlingTime&lt;/b&gt; value is set to 1 and  a buyer pays for the order on a Wednesday, the seller would have to ship the item by the next day (Thursday). &lt;br&gt;&lt;br&gt;A &lt;b&gt;maxHandlingTime&lt;/b&gt; value of &lt;code&gt;0&lt;/code&gt; indicates same day handling for an item. In this case, the seller&apos;s handling time commitment depends on the order cut off time set in the seller&apos;s user preferences. This defaults to 2:00 PM local time on most eBay sites. For orders placed (and cleared payment received) before the local order cut off time, the item must be shipped by the end of the current day. For orders completed on or after the order cut off time, the item must be shipped by the end of the following day (excluding weekends and local holidays).
     */
    private Integer maxHandlingTime;
    /**
     * Instantiates a new {@link ShippingHandlingTime} and sets the default values.
     */
    public ShippingHandlingTime() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ShippingHandlingTime}
     */
    @jakarta.annotation.Nonnull
    public static ShippingHandlingTime createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ShippingHandlingTime();
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
     * Gets the description property value. The localized description of the maximum handling time.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the extendedHandling property value. This field is only returned if its value is &lt;code&gt;true&lt;/code&gt;. If returned, it indicates that the corresponding handling time is considered extended handling for the marketplace. Extended handling times may be used for freight shipping, but should generally be avoided if possible, as they might adversely affect the buying decisions of potential customers.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getExtendedHandling() {
        return this.extendedHandling;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("extendedHandling", (n) -> { this.setExtendedHandling(n.getBooleanValue()); });
        deserializerMap.put("maxHandlingTime", (n) -> { this.setMaxHandlingTime(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the maxHandlingTime property value. The integer value returned in this field indicates the maximum number of business days that the eBay site allows as a seller&apos;s handling time measured from when the buyer pays for the order. For example,  if the &lt;b&gt;maxHandlingTime&lt;/b&gt; value is set to 1 and  a buyer pays for the order on a Wednesday, the seller would have to ship the item by the next day (Thursday). &lt;br&gt;&lt;br&gt;A &lt;b&gt;maxHandlingTime&lt;/b&gt; value of &lt;code&gt;0&lt;/code&gt; indicates same day handling for an item. In this case, the seller&apos;s handling time commitment depends on the order cut off time set in the seller&apos;s user preferences. This defaults to 2:00 PM local time on most eBay sites. For orders placed (and cleared payment received) before the local order cut off time, the item must be shipped by the end of the current day. For orders completed on or after the order cut off time, the item must be shipped by the end of the following day (excluding weekends and local holidays).
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMaxHandlingTime() {
        return this.maxHandlingTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeBooleanValue("extendedHandling", this.getExtendedHandling());
        writer.writeIntegerValue("maxHandlingTime", this.getMaxHandlingTime());
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
     * Sets the description property value. The localized description of the maximum handling time.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the extendedHandling property value. This field is only returned if its value is &lt;code&gt;true&lt;/code&gt;. If returned, it indicates that the corresponding handling time is considered extended handling for the marketplace. Extended handling times may be used for freight shipping, but should generally be avoided if possible, as they might adversely affect the buying decisions of potential customers.
     * @param value Value to set for the extendedHandling property.
     */
    public void setExtendedHandling(@jakarta.annotation.Nullable final Boolean value) {
        this.extendedHandling = value;
    }
    /**
     * Sets the maxHandlingTime property value. The integer value returned in this field indicates the maximum number of business days that the eBay site allows as a seller&apos;s handling time measured from when the buyer pays for the order. For example,  if the &lt;b&gt;maxHandlingTime&lt;/b&gt; value is set to 1 and  a buyer pays for the order on a Wednesday, the seller would have to ship the item by the next day (Thursday). &lt;br&gt;&lt;br&gt;A &lt;b&gt;maxHandlingTime&lt;/b&gt; value of &lt;code&gt;0&lt;/code&gt; indicates same day handling for an item. In this case, the seller&apos;s handling time commitment depends on the order cut off time set in the seller&apos;s user preferences. This defaults to 2:00 PM local time on most eBay sites. For orders placed (and cleared payment received) before the local order cut off time, the item must be shipped by the end of the current day. For orders completed on or after the order cut off time, the item must be shipped by the end of the following day (excluding weekends and local holidays).
     * @param value Value to set for the maxHandlingTime property.
     */
    public void setMaxHandlingTime(@jakarta.annotation.Nullable final Integer value) {
        this.maxHandlingTime = value;
    }
}

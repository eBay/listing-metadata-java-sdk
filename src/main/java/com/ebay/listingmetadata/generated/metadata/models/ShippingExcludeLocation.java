package com.ebay.listingmetadata.generated.metadata.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type provides applicable locations or region codes to be excluded set by the seller.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ShippingExcludeLocation implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The localized location name.
     */
    private String description;
    /**
     *  The location or region to be excluded. Countries are returned through &lt;a href=&quot;https://www.iso.org/iso-3166-country-codes.html&quot; target=&quot;_blank&quot;&gt;ISO 3166 codes&lt;/a&gt;. This field may also include continents and other larger geographical regions (for example, the Middle East, Southeast Asia), as well as domestic/special locations (like APO/FPO, PO Box, Alaska/Hawaii). The values returned in this field are used in fulfillment business policies (such as in &lt;a href=&quot;/api-docs/sell/account/resources/fulfillment_policy/methods/createFulfillmentPolicy#request.shippingOptions.shippingServices.shipToLocations.regionExcluded.regionName&quot; target=&quot;_blank&quot;&gt;regionName&lt;/a&gt;) or through the &lt;a href=&quot;/Devzone/XML/docs/Reference/eBay/AddItem.html#Request.Item.ShippingDetails.ExcludeShipToLocation&quot; target=&quot;_blank&quot;&gt;ExcludeShipToLocation&lt;/a&gt; field in an &lt;b&gt;AddItem&lt;/b&gt; call.
     */
    private String location;
    /**
     * The region of the excluded shipping area specified, such as:&lt;br&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;Africa&lt;/code&gt; &lt;/li&gt; &lt;li&gt;&lt;code&gt;Americas&lt;/code&gt; &lt;/li&gt; &lt;li&gt;&lt;code&gt;Asia&lt;/code&gt; &lt;/li&gt;  &lt;li&gt;&lt;code&gt;Central America and Caribbean&lt;/code&gt; &lt;/li&gt; &lt;li&gt;&lt;code&gt;Europe&lt;/code&gt; &lt;/li&gt; &lt;li&gt;&lt;code&gt;Middle East&lt;/code&gt; &lt;/li&gt; &lt;li&gt;&lt;code&gt;North America&lt;/code&gt; &lt;/li&gt; &lt;li&gt;&lt;code&gt;Oceania&lt;/code&gt; &lt;/li&gt;  &lt;li&gt;&lt;code&gt;South America&lt;/code&gt; &lt;/li&gt; &lt;li&gt;&lt;code&gt;Southeast Asia&lt;/code&gt; &lt;/li&gt;&lt;/ul&gt;
     */
    private String region;
    /**
     * Instantiates a new {@link ShippingExcludeLocation} and sets the default values.
     */
    public ShippingExcludeLocation() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ShippingExcludeLocation}
     */
    @jakarta.annotation.Nonnull
    public static ShippingExcludeLocation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ShippingExcludeLocation();
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
     * Gets the description property value. The localized location name.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("location", (n) -> { this.setLocation(n.getStringValue()); });
        deserializerMap.put("region", (n) -> { this.setRegion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the location property value.  The location or region to be excluded. Countries are returned through &lt;a href=&quot;https://www.iso.org/iso-3166-country-codes.html&quot; target=&quot;_blank&quot;&gt;ISO 3166 codes&lt;/a&gt;. This field may also include continents and other larger geographical regions (for example, the Middle East, Southeast Asia), as well as domestic/special locations (like APO/FPO, PO Box, Alaska/Hawaii). The values returned in this field are used in fulfillment business policies (such as in &lt;a href=&quot;/api-docs/sell/account/resources/fulfillment_policy/methods/createFulfillmentPolicy#request.shippingOptions.shippingServices.shipToLocations.regionExcluded.regionName&quot; target=&quot;_blank&quot;&gt;regionName&lt;/a&gt;) or through the &lt;a href=&quot;/Devzone/XML/docs/Reference/eBay/AddItem.html#Request.Item.ShippingDetails.ExcludeShipToLocation&quot; target=&quot;_blank&quot;&gt;ExcludeShipToLocation&lt;/a&gt; field in an &lt;b&gt;AddItem&lt;/b&gt; call.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLocation() {
        return this.location;
    }
    /**
     * Gets the region property value. The region of the excluded shipping area specified, such as:&lt;br&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;Africa&lt;/code&gt; &lt;/li&gt; &lt;li&gt;&lt;code&gt;Americas&lt;/code&gt; &lt;/li&gt; &lt;li&gt;&lt;code&gt;Asia&lt;/code&gt; &lt;/li&gt;  &lt;li&gt;&lt;code&gt;Central America and Caribbean&lt;/code&gt; &lt;/li&gt; &lt;li&gt;&lt;code&gt;Europe&lt;/code&gt; &lt;/li&gt; &lt;li&gt;&lt;code&gt;Middle East&lt;/code&gt; &lt;/li&gt; &lt;li&gt;&lt;code&gt;North America&lt;/code&gt; &lt;/li&gt; &lt;li&gt;&lt;code&gt;Oceania&lt;/code&gt; &lt;/li&gt;  &lt;li&gt;&lt;code&gt;South America&lt;/code&gt; &lt;/li&gt; &lt;li&gt;&lt;code&gt;Southeast Asia&lt;/code&gt; &lt;/li&gt;&lt;/ul&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRegion() {
        return this.region;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("location", this.getLocation());
        writer.writeStringValue("region", this.getRegion());
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
     * Sets the description property value. The localized location name.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the location property value.  The location or region to be excluded. Countries are returned through &lt;a href=&quot;https://www.iso.org/iso-3166-country-codes.html&quot; target=&quot;_blank&quot;&gt;ISO 3166 codes&lt;/a&gt;. This field may also include continents and other larger geographical regions (for example, the Middle East, Southeast Asia), as well as domestic/special locations (like APO/FPO, PO Box, Alaska/Hawaii). The values returned in this field are used in fulfillment business policies (such as in &lt;a href=&quot;/api-docs/sell/account/resources/fulfillment_policy/methods/createFulfillmentPolicy#request.shippingOptions.shippingServices.shipToLocations.regionExcluded.regionName&quot; target=&quot;_blank&quot;&gt;regionName&lt;/a&gt;) or through the &lt;a href=&quot;/Devzone/XML/docs/Reference/eBay/AddItem.html#Request.Item.ShippingDetails.ExcludeShipToLocation&quot; target=&quot;_blank&quot;&gt;ExcludeShipToLocation&lt;/a&gt; field in an &lt;b&gt;AddItem&lt;/b&gt; call.
     * @param value Value to set for the location property.
     */
    public void setLocation(@jakarta.annotation.Nullable final String value) {
        this.location = value;
    }
    /**
     * Sets the region property value. The region of the excluded shipping area specified, such as:&lt;br&gt;&lt;ul&gt;&lt;li&gt;&lt;code&gt;Africa&lt;/code&gt; &lt;/li&gt; &lt;li&gt;&lt;code&gt;Americas&lt;/code&gt; &lt;/li&gt; &lt;li&gt;&lt;code&gt;Asia&lt;/code&gt; &lt;/li&gt;  &lt;li&gt;&lt;code&gt;Central America and Caribbean&lt;/code&gt; &lt;/li&gt; &lt;li&gt;&lt;code&gt;Europe&lt;/code&gt; &lt;/li&gt; &lt;li&gt;&lt;code&gt;Middle East&lt;/code&gt; &lt;/li&gt; &lt;li&gt;&lt;code&gt;North America&lt;/code&gt; &lt;/li&gt; &lt;li&gt;&lt;code&gt;Oceania&lt;/code&gt; &lt;/li&gt;  &lt;li&gt;&lt;code&gt;South America&lt;/code&gt; &lt;/li&gt; &lt;li&gt;&lt;code&gt;Southeast Asia&lt;/code&gt; &lt;/li&gt;&lt;/ul&gt;
     * @param value Value to set for the region property.
     */
    public void setRegion(@jakarta.annotation.Nullable final String value) {
        this.region = value;
    }
}

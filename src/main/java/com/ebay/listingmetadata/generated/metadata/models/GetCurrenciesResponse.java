package com.ebay.listingmetadata.generated.metadata.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines the response fields specifying the default currency for the marketplace.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetCurrenciesResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The type defining valid currencies for the marketplace.
     */
    private Currency defaultCurrency;
    /**
     * The ID of the eBay marketplace to which the default currency applies. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/bas:MarketplaceIdEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String marketplaceId;
    /**
     * Instantiates a new {@link GetCurrenciesResponse} and sets the default values.
     */
    public GetCurrenciesResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GetCurrenciesResponse}
     */
    @jakarta.annotation.Nonnull
    public static GetCurrenciesResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetCurrenciesResponse();
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
     * Gets the defaultCurrency property value. The type defining valid currencies for the marketplace.
     * @return a {@link Currency}
     */
    @jakarta.annotation.Nullable
    public Currency getDefaultCurrency() {
        return this.defaultCurrency;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("defaultCurrency", (n) -> { this.setDefaultCurrency(n.getObjectValue(Currency::createFromDiscriminatorValue)); });
        deserializerMap.put("marketplaceId", (n) -> { this.setMarketplaceId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the marketplaceId property value. The ID of the eBay marketplace to which the default currency applies. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/bas:MarketplaceIdEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMarketplaceId() {
        return this.marketplaceId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("defaultCurrency", this.getDefaultCurrency());
        writer.writeStringValue("marketplaceId", this.getMarketplaceId());
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
     * Sets the defaultCurrency property value. The type defining valid currencies for the marketplace.
     * @param value Value to set for the defaultCurrency property.
     */
    public void setDefaultCurrency(@jakarta.annotation.Nullable final Currency value) {
        this.defaultCurrency = value;
    }
    /**
     * Sets the marketplaceId property value. The ID of the eBay marketplace to which the default currency applies. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/metadata/types/bas:MarketplaceIdEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the marketplaceId property.
     */
    public void setMarketplaceId(@jakarta.annotation.Nullable final String value) {
        this.marketplaceId = value;
    }
}

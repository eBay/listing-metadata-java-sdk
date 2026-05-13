package com.ebay.listingmetadata.generated.metadata.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A unique ID for a sales tax jurisdiction.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SalesTaxJurisdiction implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The unique ID for a sales-tax jurisdiction.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; When &lt;code&gt;countryCode&lt;/code&gt; is set to &lt;code&gt;US&lt;/code&gt;, IDs for all 50 states, Washington, DC, and all US territories will be returned. However, the only &lt;code&gt;salesTaxJurisdictionId&lt;/code&gt; values currently supported are:&lt;ul&gt;&lt;li&gt;&lt;code&gt;AS&lt;/code&gt; (American Samoa)&lt;/li&gt;&lt;li&gt;&lt;code&gt;GU&lt;/code&gt; (Guam&lt;/li&gt;&lt;li&gt;&lt;code&gt;MP&lt;/code&gt; Northern Mariana Islands&lt;/li&gt;&lt;li&gt;&lt;code&gt;PW (Palau)&lt;/li&gt;&lt;li&gt;&lt;code&gt;VI&lt;/code&gt; (US Virgin Islands)&lt;/li&gt;&lt;/ul&gt;&lt;/p&gt;&lt;/div&gt;
     */
    private String salesTaxJurisdictionId;
    /**
     * Instantiates a new {@link SalesTaxJurisdiction} and sets the default values.
     */
    public SalesTaxJurisdiction() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SalesTaxJurisdiction}
     */
    @jakarta.annotation.Nonnull
    public static SalesTaxJurisdiction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SalesTaxJurisdiction();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("salesTaxJurisdictionId", (n) -> { this.setSalesTaxJurisdictionId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the salesTaxJurisdictionId property value. The unique ID for a sales-tax jurisdiction.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; When &lt;code&gt;countryCode&lt;/code&gt; is set to &lt;code&gt;US&lt;/code&gt;, IDs for all 50 states, Washington, DC, and all US territories will be returned. However, the only &lt;code&gt;salesTaxJurisdictionId&lt;/code&gt; values currently supported are:&lt;ul&gt;&lt;li&gt;&lt;code&gt;AS&lt;/code&gt; (American Samoa)&lt;/li&gt;&lt;li&gt;&lt;code&gt;GU&lt;/code&gt; (Guam&lt;/li&gt;&lt;li&gt;&lt;code&gt;MP&lt;/code&gt; Northern Mariana Islands&lt;/li&gt;&lt;li&gt;&lt;code&gt;PW (Palau)&lt;/li&gt;&lt;li&gt;&lt;code&gt;VI&lt;/code&gt; (US Virgin Islands)&lt;/li&gt;&lt;/ul&gt;&lt;/p&gt;&lt;/div&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSalesTaxJurisdictionId() {
        return this.salesTaxJurisdictionId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("salesTaxJurisdictionId", this.getSalesTaxJurisdictionId());
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
     * Sets the salesTaxJurisdictionId property value. The unique ID for a sales-tax jurisdiction.&lt;br&gt;&lt;br&gt;&lt;div class=&quot;msgbox_important&quot;&gt;&lt;p class=&quot;msgbox_importantInDiv&quot; data-mc-autonum=&quot;&amp;lt;b&amp;gt;&amp;lt;span style=&amp;quot;color: #dd1e31;&amp;quot; class=&amp;quot;mcFormatColor&amp;quot;&amp;gt;Important! &amp;lt;/span&amp;gt;&amp;lt;/b&amp;gt;&quot;&gt;&lt;span class=&quot;autonumber&quot;&gt;&lt;span&gt;&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important!&lt;/span&gt;&lt;/b&gt;&lt;/span&gt;&lt;/span&gt; When &lt;code&gt;countryCode&lt;/code&gt; is set to &lt;code&gt;US&lt;/code&gt;, IDs for all 50 states, Washington, DC, and all US territories will be returned. However, the only &lt;code&gt;salesTaxJurisdictionId&lt;/code&gt; values currently supported are:&lt;ul&gt;&lt;li&gt;&lt;code&gt;AS&lt;/code&gt; (American Samoa)&lt;/li&gt;&lt;li&gt;&lt;code&gt;GU&lt;/code&gt; (Guam&lt;/li&gt;&lt;li&gt;&lt;code&gt;MP&lt;/code&gt; Northern Mariana Islands&lt;/li&gt;&lt;li&gt;&lt;code&gt;PW (Palau)&lt;/li&gt;&lt;li&gt;&lt;code&gt;VI&lt;/code&gt; (US Virgin Islands)&lt;/li&gt;&lt;/ul&gt;&lt;/p&gt;&lt;/div&gt;
     * @param value Value to set for the salesTaxJurisdictionId property.
     */
    public void setSalesTaxJurisdictionId(@jakarta.annotation.Nullable final String value) {
        this.salesTaxJurisdictionId = value;
    }
}

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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class NegotiatedPricePolicy implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This flag denotes whether or not the category supports the setting of a price at which best offers are automatically accepted. If set to &lt;code&gt;true&lt;/code&gt;, the category does support the setting of an automatic price for best-offers.
     */
    private Boolean bestOfferAutoAcceptEnabled;
    /**
     * This flag denotes whether or not the category supports the setting of an auto-decline price for best offers. If set to &lt;code&gt;true&lt;/code&gt;, the category does support the setting of an automatic-decline price for best-offers.
     */
    private Boolean bestOfferAutoDeclineEnabled;
    /**
     * This flag denotes whether or not the category supports the setting for an automatic counter-offer on best offers. If set to &lt;code&gt;true&lt;/code&gt;, the category does support the setting of an automatic counter-offer price for best-offers.
     */
    private Boolean bestOfferCounterEnabled;
    /**
     * The category ID to which the negotiated-price policies apply.
     */
    private String categoryId;
    /**
     * A value that indicates the root node of the category tree used for the response set. Each marketplace is based on a category tree whose root node is indicated by this unique category ID value. All category policy information returned by this call pertains to the categories included below this root node of the tree.    &lt;br&gt;&lt;br&gt;A &lt;i&gt;category tree&lt;/i&gt; is a hierarchical framework of eBay categories that begins at the root node of the tree and extends to include all the child nodes in the tree. Each child node in the tree is an eBay category that is represented by a unique &lt;b&gt;categoryId&lt;/b&gt; value. Within a category tree, the root node has no parent node and &lt;i&gt;leaf nodes&lt;/i&gt; are nodes that have no child nodes.
     */
    private String categoryTreeId;
    /**
     * Instantiates a new {@link NegotiatedPricePolicy} and sets the default values.
     */
    public NegotiatedPricePolicy() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link NegotiatedPricePolicy}
     */
    @jakarta.annotation.Nonnull
    public static NegotiatedPricePolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new NegotiatedPricePolicy();
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
     * Gets the bestOfferAutoAcceptEnabled property value. This flag denotes whether or not the category supports the setting of a price at which best offers are automatically accepted. If set to &lt;code&gt;true&lt;/code&gt;, the category does support the setting of an automatic price for best-offers.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getBestOfferAutoAcceptEnabled() {
        return this.bestOfferAutoAcceptEnabled;
    }
    /**
     * Gets the bestOfferAutoDeclineEnabled property value. This flag denotes whether or not the category supports the setting of an auto-decline price for best offers. If set to &lt;code&gt;true&lt;/code&gt;, the category does support the setting of an automatic-decline price for best-offers.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getBestOfferAutoDeclineEnabled() {
        return this.bestOfferAutoDeclineEnabled;
    }
    /**
     * Gets the bestOfferCounterEnabled property value. This flag denotes whether or not the category supports the setting for an automatic counter-offer on best offers. If set to &lt;code&gt;true&lt;/code&gt;, the category does support the setting of an automatic counter-offer price for best-offers.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getBestOfferCounterEnabled() {
        return this.bestOfferCounterEnabled;
    }
    /**
     * Gets the categoryId property value. The category ID to which the negotiated-price policies apply.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCategoryId() {
        return this.categoryId;
    }
    /**
     * Gets the categoryTreeId property value. A value that indicates the root node of the category tree used for the response set. Each marketplace is based on a category tree whose root node is indicated by this unique category ID value. All category policy information returned by this call pertains to the categories included below this root node of the tree.    &lt;br&gt;&lt;br&gt;A &lt;i&gt;category tree&lt;/i&gt; is a hierarchical framework of eBay categories that begins at the root node of the tree and extends to include all the child nodes in the tree. Each child node in the tree is an eBay category that is represented by a unique &lt;b&gt;categoryId&lt;/b&gt; value. Within a category tree, the root node has no parent node and &lt;i&gt;leaf nodes&lt;/i&gt; are nodes that have no child nodes.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCategoryTreeId() {
        return this.categoryTreeId;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("bestOfferAutoAcceptEnabled", (n) -> { this.setBestOfferAutoAcceptEnabled(n.getBooleanValue()); });
        deserializerMap.put("bestOfferAutoDeclineEnabled", (n) -> { this.setBestOfferAutoDeclineEnabled(n.getBooleanValue()); });
        deserializerMap.put("bestOfferCounterEnabled", (n) -> { this.setBestOfferCounterEnabled(n.getBooleanValue()); });
        deserializerMap.put("categoryId", (n) -> { this.setCategoryId(n.getStringValue()); });
        deserializerMap.put("categoryTreeId", (n) -> { this.setCategoryTreeId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("bestOfferAutoAcceptEnabled", this.getBestOfferAutoAcceptEnabled());
        writer.writeBooleanValue("bestOfferAutoDeclineEnabled", this.getBestOfferAutoDeclineEnabled());
        writer.writeBooleanValue("bestOfferCounterEnabled", this.getBestOfferCounterEnabled());
        writer.writeStringValue("categoryId", this.getCategoryId());
        writer.writeStringValue("categoryTreeId", this.getCategoryTreeId());
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
     * Sets the bestOfferAutoAcceptEnabled property value. This flag denotes whether or not the category supports the setting of a price at which best offers are automatically accepted. If set to &lt;code&gt;true&lt;/code&gt;, the category does support the setting of an automatic price for best-offers.
     * @param value Value to set for the bestOfferAutoAcceptEnabled property.
     */
    public void setBestOfferAutoAcceptEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.bestOfferAutoAcceptEnabled = value;
    }
    /**
     * Sets the bestOfferAutoDeclineEnabled property value. This flag denotes whether or not the category supports the setting of an auto-decline price for best offers. If set to &lt;code&gt;true&lt;/code&gt;, the category does support the setting of an automatic-decline price for best-offers.
     * @param value Value to set for the bestOfferAutoDeclineEnabled property.
     */
    public void setBestOfferAutoDeclineEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.bestOfferAutoDeclineEnabled = value;
    }
    /**
     * Sets the bestOfferCounterEnabled property value. This flag denotes whether or not the category supports the setting for an automatic counter-offer on best offers. If set to &lt;code&gt;true&lt;/code&gt;, the category does support the setting of an automatic counter-offer price for best-offers.
     * @param value Value to set for the bestOfferCounterEnabled property.
     */
    public void setBestOfferCounterEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.bestOfferCounterEnabled = value;
    }
    /**
     * Sets the categoryId property value. The category ID to which the negotiated-price policies apply.
     * @param value Value to set for the categoryId property.
     */
    public void setCategoryId(@jakarta.annotation.Nullable final String value) {
        this.categoryId = value;
    }
    /**
     * Sets the categoryTreeId property value. A value that indicates the root node of the category tree used for the response set. Each marketplace is based on a category tree whose root node is indicated by this unique category ID value. All category policy information returned by this call pertains to the categories included below this root node of the tree.    &lt;br&gt;&lt;br&gt;A &lt;i&gt;category tree&lt;/i&gt; is a hierarchical framework of eBay categories that begins at the root node of the tree and extends to include all the child nodes in the tree. Each child node in the tree is an eBay category that is represented by a unique &lt;b&gt;categoryId&lt;/b&gt; value. Within a category tree, the root node has no parent node and &lt;i&gt;leaf nodes&lt;/i&gt; are nodes that have no child nodes.
     * @param value Value to set for the categoryTreeId property.
     */
    public void setCategoryTreeId(@jakarta.annotation.Nullable final String value) {
        this.categoryTreeId = value;
    }
}

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
 * The relevance of this aspect. This field is returned if eBay has data on how many searches have been performed for listings in the category using this item aspect.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; This container is restricted to applications that have been granted permission to access this feature. You must submit an &lt;a href=&quot;https://developer.ebay.com/my/support/tickets?tab=app-check &quot;&gt;App Check ticket&lt;/a&gt; to request this access. In the App Check form, add a note to the &lt;b&gt;Application Title/Summary&lt;/b&gt; and/or &lt;b&gt;Application Details&lt;/b&gt; fields that you want access to &apos;Buyer Demand Data&apos; in the Taxonomy API.&lt;/span&gt;
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RelevanceIndicator implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The number of recent searches (based on 30 days of data) for the aspect.
     */
    private Integer searchCount;
    /**
     * Instantiates a new {@link RelevanceIndicator} and sets the default values.
     */
    public RelevanceIndicator() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RelevanceIndicator}
     */
    @jakarta.annotation.Nonnull
    public static RelevanceIndicator createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RelevanceIndicator();
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
        deserializerMap.put("searchCount", (n) -> { this.setSearchCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the searchCount property value. The number of recent searches (based on 30 days of data) for the aspect.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSearchCount() {
        return this.searchCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("searchCount", this.getSearchCount());
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
     * Sets the searchCount property value. The number of recent searches (based on 30 days of data) for the aspect.
     * @param value Value to set for the searchCount property.
     */
    public void setSearchCount(@jakarta.annotation.Nullable final Integer value) {
        this.searchCount = value;
    }
}

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
 * This type is used by the &lt;b&gt;getExpiredCategories&lt;/b&gt; response to indicate any eBay leaf categories in the specified category tree that have expired and the currently active leaf categories that have replaced them.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExpiredCategories implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * An array of expired category ID(s) for the requested category tree, and the currently active category ID(s) that have replaced them.
     */
    private java.util.List<ExpiredCategory> expiredCategories;
    /**
     * Instantiates a new {@link ExpiredCategories} and sets the default values.
     */
    public ExpiredCategories() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ExpiredCategories}
     */
    @jakarta.annotation.Nonnull
    public static ExpiredCategories createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExpiredCategories();
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
     * Gets the expiredCategories property value. An array of expired category ID(s) for the requested category tree, and the currently active category ID(s) that have replaced them.
     * @return a {@link java.util.List<ExpiredCategory>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ExpiredCategory> getExpiredCategories() {
        return this.expiredCategories;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("expiredCategories", (n) -> { this.setExpiredCategories(n.getCollectionOfObjectValues(ExpiredCategory::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("expiredCategories", this.getExpiredCategories());
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
     * Sets the expiredCategories property value. An array of expired category ID(s) for the requested category tree, and the currently active category ID(s) that have replaced them.
     * @param value Value to set for the expiredCategories property.
     */
    public void setExpiredCategories(@jakarta.annotation.Nullable final java.util.List<ExpiredCategory> value) {
        this.expiredCategories = value;
    }
}

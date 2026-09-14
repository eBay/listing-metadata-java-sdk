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
 * This type defines information about a category and the aspects used to describe items in that category.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CategoryAspect implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A list of aspect metadata that is used to describe the items in a particular leaf category.
     */
    private java.util.List<Aspect> aspects;
    /**
     * The details that are appropriate or necessary to accurately define the category.
     */
    private Category category;
    /**
     * Instantiates a new {@link CategoryAspect} and sets the default values.
     */
    public CategoryAspect() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CategoryAspect}
     */
    @jakarta.annotation.Nonnull
    public static CategoryAspect createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CategoryAspect();
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
     * Gets the aspects property value. A list of aspect metadata that is used to describe the items in a particular leaf category.
     * @return a {@link java.util.List<Aspect>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Aspect> getAspects() {
        return this.aspects;
    }
    /**
     * Gets the category property value. The details that are appropriate or necessary to accurately define the category.
     * @return a {@link Category}
     */
    @jakarta.annotation.Nullable
    public Category getCategory() {
        return this.category;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("aspects", (n) -> { this.setAspects(n.getCollectionOfObjectValues(Aspect::createFromDiscriminatorValue)); });
        deserializerMap.put("category", (n) -> { this.setCategory(n.getObjectValue(Category::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("aspects", this.getAspects());
        writer.writeObjectValue("category", this.getCategory());
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
     * Sets the aspects property value. A list of aspect metadata that is used to describe the items in a particular leaf category.
     * @param value Value to set for the aspects property.
     */
    public void setAspects(@jakarta.annotation.Nullable final java.util.List<Aspect> value) {
        this.aspects = value;
    }
    /**
     * Sets the category property value. The details that are appropriate or necessary to accurately define the category.
     * @param value Value to set for the category property.
     */
    public void setCategory(@jakarta.annotation.Nullable final Category value) {
        this.category = value;
    }
}

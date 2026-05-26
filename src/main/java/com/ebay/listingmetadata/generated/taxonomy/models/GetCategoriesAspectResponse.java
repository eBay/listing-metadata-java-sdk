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
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetCategoriesAspectResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * An array of aspects that are appropriate or necessary for accurately describing items in a particular leaf category.
     */
    private java.util.List<CategoryAspect> categoryAspects;
    /**
     * The unique identifier of the eBay category tree being requested.
     */
    private String categoryTreeId;
    /**
     * The version of the category tree that is returned in the &lt;b&gt;categoryTreeId&lt;/b&gt; field.
     */
    private String categoryTreeVersion;
    /**
     * Instantiates a new {@link GetCategoriesAspectResponse} and sets the default values.
     */
    public GetCategoriesAspectResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GetCategoriesAspectResponse}
     */
    @jakarta.annotation.Nonnull
    public static GetCategoriesAspectResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetCategoriesAspectResponse();
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
     * Gets the categoryAspects property value. An array of aspects that are appropriate or necessary for accurately describing items in a particular leaf category.
     * @return a {@link java.util.List<CategoryAspect>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CategoryAspect> getCategoryAspects() {
        return this.categoryAspects;
    }
    /**
     * Gets the categoryTreeId property value. The unique identifier of the eBay category tree being requested.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCategoryTreeId() {
        return this.categoryTreeId;
    }
    /**
     * Gets the categoryTreeVersion property value. The version of the category tree that is returned in the &lt;b&gt;categoryTreeId&lt;/b&gt; field.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCategoryTreeVersion() {
        return this.categoryTreeVersion;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("categoryAspects", (n) -> { this.setCategoryAspects(n.getCollectionOfObjectValues(CategoryAspect::createFromDiscriminatorValue)); });
        deserializerMap.put("categoryTreeId", (n) -> { this.setCategoryTreeId(n.getStringValue()); });
        deserializerMap.put("categoryTreeVersion", (n) -> { this.setCategoryTreeVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("categoryAspects", this.getCategoryAspects());
        writer.writeStringValue("categoryTreeId", this.getCategoryTreeId());
        writer.writeStringValue("categoryTreeVersion", this.getCategoryTreeVersion());
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
     * Sets the categoryAspects property value. An array of aspects that are appropriate or necessary for accurately describing items in a particular leaf category.
     * @param value Value to set for the categoryAspects property.
     */
    public void setCategoryAspects(@jakarta.annotation.Nullable final java.util.List<CategoryAspect> value) {
        this.categoryAspects = value;
    }
    /**
     * Sets the categoryTreeId property value. The unique identifier of the eBay category tree being requested.
     * @param value Value to set for the categoryTreeId property.
     */
    public void setCategoryTreeId(@jakarta.annotation.Nullable final String value) {
        this.categoryTreeId = value;
    }
    /**
     * Sets the categoryTreeVersion property value. The version of the category tree that is returned in the &lt;b&gt;categoryTreeId&lt;/b&gt; field.
     * @param value Value to set for the categoryTreeVersion property.
     */
    public void setCategoryTreeVersion(@jakarta.annotation.Nullable final String value) {
        this.categoryTreeVersion = value;
    }
}

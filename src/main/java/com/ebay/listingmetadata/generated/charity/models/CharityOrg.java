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

package com.ebay.listingmetadata.generated.charity.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The full location, ID, logo and other details of the charity organization.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CharityOrg implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The ID of the charitable organization.
     */
    private String charityOrgId;
    /**
     * The description of the charitable organization.
     */
    private String description;
    /**
     * The location details of the charitable organization.
     */
    private Location location;
    /**
     * The logo of the charitable organization.
     */
    private Image logoImage;
    /**
     * The mission statement of the charitable organization.
     */
    private String missionStatement;
    /**
     * The name of the charitable organization.
     */
    private String name;
    /**
     * The registration ID for the charitable organization.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; For the US marketplace, this is the EIN.&lt;/span&gt;
     */
    private String registrationId;
    /**
     * The link to the website for the charitable organization.
     */
    private String website;
    /**
     * Instantiates a new {@link CharityOrg} and sets the default values.
     */
    public CharityOrg() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CharityOrg}
     */
    @jakarta.annotation.Nonnull
    public static CharityOrg createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CharityOrg();
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
     * Gets the charityOrgId property value. The ID of the charitable organization.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCharityOrgId() {
        return this.charityOrgId;
    }
    /**
     * Gets the description property value. The description of the charitable organization.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("charityOrgId", (n) -> { this.setCharityOrgId(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("location", (n) -> { this.setLocation(n.getObjectValue(Location::createFromDiscriminatorValue)); });
        deserializerMap.put("logoImage", (n) -> { this.setLogoImage(n.getObjectValue(Image::createFromDiscriminatorValue)); });
        deserializerMap.put("missionStatement", (n) -> { this.setMissionStatement(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("registrationId", (n) -> { this.setRegistrationId(n.getStringValue()); });
        deserializerMap.put("website", (n) -> { this.setWebsite(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the location property value. The location details of the charitable organization.
     * @return a {@link Location}
     */
    @jakarta.annotation.Nullable
    public Location getLocation() {
        return this.location;
    }
    /**
     * Gets the logoImage property value. The logo of the charitable organization.
     * @return a {@link Image}
     */
    @jakarta.annotation.Nullable
    public Image getLogoImage() {
        return this.logoImage;
    }
    /**
     * Gets the missionStatement property value. The mission statement of the charitable organization.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMissionStatement() {
        return this.missionStatement;
    }
    /**
     * Gets the name property value. The name of the charitable organization.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the registrationId property value. The registration ID for the charitable organization.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; For the US marketplace, this is the EIN.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRegistrationId() {
        return this.registrationId;
    }
    /**
     * Gets the website property value. The link to the website for the charitable organization.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getWebsite() {
        return this.website;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("charityOrgId", this.getCharityOrgId());
        writer.writeStringValue("description", this.getDescription());
        writer.writeObjectValue("location", this.getLocation());
        writer.writeObjectValue("logoImage", this.getLogoImage());
        writer.writeStringValue("missionStatement", this.getMissionStatement());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("registrationId", this.getRegistrationId());
        writer.writeStringValue("website", this.getWebsite());
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
     * Sets the charityOrgId property value. The ID of the charitable organization.
     * @param value Value to set for the charityOrgId property.
     */
    public void setCharityOrgId(@jakarta.annotation.Nullable final String value) {
        this.charityOrgId = value;
    }
    /**
     * Sets the description property value. The description of the charitable organization.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the location property value. The location details of the charitable organization.
     * @param value Value to set for the location property.
     */
    public void setLocation(@jakarta.annotation.Nullable final Location value) {
        this.location = value;
    }
    /**
     * Sets the logoImage property value. The logo of the charitable organization.
     * @param value Value to set for the logoImage property.
     */
    public void setLogoImage(@jakarta.annotation.Nullable final Image value) {
        this.logoImage = value;
    }
    /**
     * Sets the missionStatement property value. The mission statement of the charitable organization.
     * @param value Value to set for the missionStatement property.
     */
    public void setMissionStatement(@jakarta.annotation.Nullable final String value) {
        this.missionStatement = value;
    }
    /**
     * Sets the name property value. The name of the charitable organization.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the registrationId property value. The registration ID for the charitable organization.&lt;br /&gt;&lt;br /&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt;&lt;/span&gt; For the US marketplace, this is the EIN.&lt;/span&gt;
     * @param value Value to set for the registrationId property.
     */
    public void setRegistrationId(@jakarta.annotation.Nullable final String value) {
        this.registrationId = value;
    }
    /**
     * Sets the website property value. The link to the website for the charitable organization.
     * @param value Value to set for the website property.
     */
    public void setWebsite(@jakarta.annotation.Nullable final String value) {
        this.website = value;
    }
}

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

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * This type contains enumerated values defining different motor vehicle groups across eBay marketplaces. | - **US_CARS_AND_TRUCKS**: This value indicates that the corresponding leaf category contains Cars &amp; Trucks listings on the US Motors marketplace. - **US_MOTORCYCLES**: This value indicates that the corresponding leaf category contains Motorcycles on the United States marketplace. - **DE_CARS_AND_TRUCKS**: This value indicates that the corresponding leaf category contains Cars &amp; Trucks listings on the on the Germany marketplace. - **UK_CARS_AND_TRUCKS**: This value indicates that the corresponding leaf category contains Cars &amp; Trucks listings on the on the Great Britain marketplace. - **US_ATV**: This value indicates that the corresponding leaf category contains ATVs on the United States marketplace. - **AU_CARS_AND_TRUCKS**: This value indicates that the corresponding leaf category contains Cars &amp; Trucks listings on the on the Australia marketplace. - **US_BOATS**: This value indicates that the corresponding leaf category contains Boats on the United States marketplace. - **US_ATV_UTV**: This value indicates that the corresponding leaf category contains ATVs and UTVs on the United States marketplace. - **US_SNOWMOBILES**: This value indicates that the corresponding leaf category contains Snowmobiles on the United States marketplace. - **US_POWERSPORTS**: This value indicates that the corresponding leaf category contains Powersports vehicles on the United States marketplace. - **US_SCOOTERS**: This value indicates that the corresponding leaf category contains Scooters on the United States marketplace. - **US_GOLF_CARTS**: This value indicates that the corresponding leaf category contains Golf Carts on the United States marketplace. - **US_WATERCRAFTS**: This value indicates that the corresponding leaf category contains Watercraft vehicles on the United States marketplace. - **DE_MOTORCYCLES**: This value indicates that the corresponding leaf category contains Motorcycles on the Germany marketplace. - **DE_SCOOTERS**: This value indicates that the corresponding leaf category contains Scooters on the Germany marketplace. - **UK_MOTORCYCLES**: This value indicates that the corresponding leaf category contains Motorcycles on the Great Britain marketplace. - **UK_SCOOTERS**: This value indicates that the corresponding leaf category contains Scooters on the Great Britain marketplace. - **IT_CARS_AND_TRUCKS**: This value indicates that the corresponding leaf category contains Cars &amp; Trucks listings on the on the Italy marketplace. - **FR_CARS_AND_TRUCKS**: This value indicates that the corresponding leaf category contains Cars &amp; Trucks listings on the on the France marketplace. - **ES_CARS_AND_TRUCKS**: This value indicates that the corresponding leaf category contains Cars &amp; Trucks listings on the on the Spain marketplace. - **CA_CARS_AND_TRUCKS**: This value indicates that the corresponding leaf category contains Cars &amp; Trucks listings on the on the Canada marketplace. - **DEFAULT_VALUE**: This enumeration value may be returned if the vehicle group cannot be determined.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CompatibleVehicleTypeEnum implements ValuedEnum {
    US_CARS_AND_TRUCKS("US_CARS_AND_TRUCKS"),
    US_MOTORCYCLES("US_MOTORCYCLES"),
    DE_CARS_AND_TRUCKS("DE_CARS_AND_TRUCKS"),
    UK_CARS_AND_TRUCKS("UK_CARS_AND_TRUCKS"),
    US_ATV("US_ATV"),
    AU_CARS_AND_TRUCKS("AU_CARS_AND_TRUCKS"),
    US_BOATS("US_BOATS"),
    US_ATV_UTV("US_ATV_UTV"),
    US_SNOWMOBILES("US_SNOWMOBILES"),
    US_POWERSPORTS("US_POWERSPORTS"),
    US_SCOOTERS("US_SCOOTERS"),
    US_GOLF_CARTS("US_GOLF_CARTS"),
    US_WATERCRAFTS("US_WATERCRAFTS"),
    DE_MOTORCYCLES("DE_MOTORCYCLES"),
    DE_SCOOTERS("DE_SCOOTERS"),
    UK_MOTORCYCLES("UK_MOTORCYCLES"),
    UK_SCOOTERS("UK_SCOOTERS"),
    IT_CARS_AND_TRUCKS("IT_CARS_AND_TRUCKS"),
    FR_CARS_AND_TRUCKS("FR_CARS_AND_TRUCKS"),
    ES_CARS_AND_TRUCKS("ES_CARS_AND_TRUCKS"),
    CA_CARS_AND_TRUCKS("CA_CARS_AND_TRUCKS"),
    DEFAULT_VALUE("DEFAULT_VALUE");
    public final String value;
    CompatibleVehicleTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CompatibleVehicleTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "US_CARS_AND_TRUCKS": return US_CARS_AND_TRUCKS;
            case "US_MOTORCYCLES": return US_MOTORCYCLES;
            case "DE_CARS_AND_TRUCKS": return DE_CARS_AND_TRUCKS;
            case "UK_CARS_AND_TRUCKS": return UK_CARS_AND_TRUCKS;
            case "US_ATV": return US_ATV;
            case "AU_CARS_AND_TRUCKS": return AU_CARS_AND_TRUCKS;
            case "US_BOATS": return US_BOATS;
            case "US_ATV_UTV": return US_ATV_UTV;
            case "US_SNOWMOBILES": return US_SNOWMOBILES;
            case "US_POWERSPORTS": return US_POWERSPORTS;
            case "US_SCOOTERS": return US_SCOOTERS;
            case "US_GOLF_CARTS": return US_GOLF_CARTS;
            case "US_WATERCRAFTS": return US_WATERCRAFTS;
            case "DE_MOTORCYCLES": return DE_MOTORCYCLES;
            case "DE_SCOOTERS": return DE_SCOOTERS;
            case "UK_MOTORCYCLES": return UK_MOTORCYCLES;
            case "UK_SCOOTERS": return UK_SCOOTERS;
            case "IT_CARS_AND_TRUCKS": return IT_CARS_AND_TRUCKS;
            case "FR_CARS_AND_TRUCKS": return FR_CARS_AND_TRUCKS;
            case "ES_CARS_AND_TRUCKS": return ES_CARS_AND_TRUCKS;
            case "CA_CARS_AND_TRUCKS": return CA_CARS_AND_TRUCKS;
            case "DEFAULT_VALUE": return DEFAULT_VALUE;
            default: return null;
        }
    }
}

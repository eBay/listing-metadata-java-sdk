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
 * This enumerated value indicates the type of local listing distances, such as non-subscription or regular, for items listed by sellers.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DistanceType implements ValuedEnum {
    LOCAL_LISTING_DISTANCES_REGULAR("LOCAL_LISTING_DISTANCES_REGULAR"),
    LOCAL_LISTING_DISTANCES_SPECIALTY("LOCAL_LISTING_DISTANCES_SPECIALTY"),
    LOCAL_LISTING_DISTANCES_NON_SUBSCRIPTION("LOCAL_LISTING_DISTANCES_NON_SUBSCRIPTION");
    public final String value;
    DistanceType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DistanceType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "LOCAL_LISTING_DISTANCES_REGULAR": return LOCAL_LISTING_DISTANCES_REGULAR;
            case "LOCAL_LISTING_DISTANCES_SPECIALTY": return LOCAL_LISTING_DISTANCES_SPECIALTY;
            case "LOCAL_LISTING_DISTANCES_NON_SUBSCRIPTION": return LOCAL_LISTING_DISTANCES_NON_SUBSCRIPTION;
            default: return null;
        }
    }
}

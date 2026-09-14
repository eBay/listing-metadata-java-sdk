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
 * This enumerated value indicates if Best Offer is enabled, disabled, or required for Classified Ad listings in this category.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ClassifiedAdBestOfferEnabledEnum implements ValuedEnum {
    DISABLED("DISABLED"),
    ENABLED("ENABLED"),
    REQUIRED("REQUIRED");
    public final String value;
    ClassifiedAdBestOfferEnabledEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ClassifiedAdBestOfferEnabledEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "DISABLED": return DISABLED;
            case "ENABLED": return ENABLED;
            case "REQUIRED": return REQUIRED;
            default: return null;
        }
    }
}

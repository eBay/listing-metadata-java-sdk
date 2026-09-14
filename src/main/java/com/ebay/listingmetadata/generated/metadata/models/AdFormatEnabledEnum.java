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
 * This enumerated value indicates the type or status of available Classified Ad formats for this category.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AdFormatEnabledEnum implements ValuedEnum {
    DISABLED("DISABLED"),
    ENABLED("ENABLED"),
    ONLY("ONLY"),
    CLASSIFIED_AD_ENABLED("CLASSIFIED_AD_ENABLED"),
    CLASSIFIED_AD_ONLY("CLASSIFIED_AD_ONLY"),
    LOCAL_MARKET_BEST_OFFER_ONLY("LOCAL_MARKET_BEST_OFFER_ONLY");
    public final String value;
    AdFormatEnabledEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AdFormatEnabledEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "DISABLED": return DISABLED;
            case "ENABLED": return ENABLED;
            case "ONLY": return ONLY;
            case "CLASSIFIED_AD_ENABLED": return CLASSIFIED_AD_ENABLED;
            case "CLASSIFIED_AD_ONLY": return CLASSIFIED_AD_ONLY;
            case "LOCAL_MARKET_BEST_OFFER_ONLY": return LOCAL_MARKET_BEST_OFFER_ONLY;
            default: return null;
        }
    }
}

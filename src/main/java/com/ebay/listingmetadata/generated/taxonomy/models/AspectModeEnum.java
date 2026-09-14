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

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The manner in which values of this aspect must be specified by the seller (as free text or by selecting from available options). 
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AspectModeEnum implements ValuedEnum {
    FREE_TEXT("FREE_TEXT"),
    SELECTION_ONLY("SELECTION_ONLY");
    public final String value;
    AspectModeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AspectModeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "FREE_TEXT": return FREE_TEXT;
            case "SELECTION_ONLY": return SELECTION_ONLY;
            default: return null;
        }
    }
}

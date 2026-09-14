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
 * The usage guidelines for the attribute, in the specified marketplace.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum GenericUsageEnum implements ValuedEnum {
    REQUIRED("REQUIRED"),
    OPTIONAL("OPTIONAL"),
    RECOMMENDED("RECOMMENDED");
    public final String value;
    GenericUsageEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static GenericUsageEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "REQUIRED": return REQUIRED;
            case "OPTIONAL": return OPTIONAL;
            case "RECOMMENDED": return RECOMMENDED;
            default: return null;
        }
    }
}

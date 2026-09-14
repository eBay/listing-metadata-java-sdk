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
 * An enum list that defines the values you can supply for specifying a return. | - **REPLACEMENT**: This value indicates that the buy may request a replacement instead of a monetary refund if they return an item. This value is valid only within the US marketplace.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ReturnMethodEnum implements ValuedEnum {
    REPLACEMENT("REPLACEMENT");
    public final String value;
    ReturnMethodEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ReturnMethodEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "REPLACEMENT": return REPLACEMENT;
            default: return null;
        }
    }
}

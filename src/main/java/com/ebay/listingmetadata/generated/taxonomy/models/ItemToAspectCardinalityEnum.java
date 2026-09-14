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
 * Indicates whether this aspect can accept single or multiple values for items in the specified category.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; Up to 30 values can be supplied for aspects that accept multiple values.&lt;/span&gt;
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ItemToAspectCardinalityEnum implements ValuedEnum {
    MULTI("MULTI"),
    SINGLE("SINGLE");
    public final String value;
    ItemToAspectCardinalityEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ItemToAspectCardinalityEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "MULTI": return MULTI;
            case "SINGLE": return SINGLE;
            default: return null;
        }
    }
}

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
 * The data type of this aspect.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AspectDataTypeEnum implements ValuedEnum {
    DATE("DATE"),
    NUMBER("NUMBER"),
    STRING("STRING"),
    STRING_ARRAY("STRING_ARRAY");
    public final String value;
    AspectDataTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AspectDataTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "DATE": return DATE;
            case "NUMBER": return NUMBER;
            case "STRING": return STRING;
            case "STRING_ARRAY": return STRING_ARRAY;
            default: return null;
        }
    }
}

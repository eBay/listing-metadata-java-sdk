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
 * Indicates additional data type requirements for the aspect. For example, &lt;code&gt;NUMERIC_RANGE&lt;/code&gt; indicates that the aspect value must be in numeric range format.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; Currently only &lt;code&gt;NUMERIC_RANGE&lt;/code&gt; is supported.&lt;/span&gt;
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AspectAdvancedDataTypeEnum implements ValuedEnum {
    NUMERIC_RANGE("NUMERIC_RANGE");
    public final String value;
    AspectAdvancedDataTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AspectAdvancedDataTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "NUMERIC_RANGE": return NUMERIC_RANGE;
            default: return null;
        }
    }
}

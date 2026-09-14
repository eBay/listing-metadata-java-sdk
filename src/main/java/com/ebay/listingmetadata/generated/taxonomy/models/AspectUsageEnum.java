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
 * The enumeration value returned in this field will indicate if the corresponding aspect is recommended or optional.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt;Note:&lt;/strong&gt; This field is always returned, even for hard-mandated/required aspects (where &lt;strong&gt;aspectRequired&lt;/strong&gt;: &lt;code&gt;true&lt;/code&gt;). The value returned for required aspects will be &lt;code&gt;RECOMMENDED&lt;/code&gt;, but they are actually required and a seller will be blocked from listing or revising an item without these aspects. &lt;/span&gt;
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AspectUsageEnum implements ValuedEnum {
    RECOMMENDED("RECOMMENDED"),
    OPTIONAL("OPTIONAL");
    public final String value;
    AspectUsageEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AspectUsageEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "RECOMMENDED": return RECOMMENDED;
            case "OPTIONAL": return OPTIONAL;
            default: return null;
        }
    }
}

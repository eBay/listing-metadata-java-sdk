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
 * Indicates whether the category supports parts compatibility by either &lt;code&gt;ASSEMBLY&lt;/code&gt; or by &lt;code&gt;SPECIFICATION&lt;/code&gt;.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Only categories returning the &lt;b&gt;compatibilityBasedOn&lt;/b&gt; field support compatibility. Categories where all compatibility fields are missing, or where only &lt;b&gt;compatibilityBasedOn&lt;/b&gt; is missing, should be considered as not supporting compatibility.&lt;/span&gt;
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CompatibilityTypeEnum implements ValuedEnum {
    SPECIFICATIONS("SPECIFICATIONS"),
    ASSEMBLY("ASSEMBLY");
    public final String value;
    CompatibilityTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CompatibilityTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "SPECIFICATIONS": return SPECIFICATIONS;
            case "ASSEMBLY": return ASSEMBLY;
            default: return null;
        }
    }
}

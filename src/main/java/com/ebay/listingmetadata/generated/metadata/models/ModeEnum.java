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
 * The value returned in this field indicates whether the supported values for a condition descriptor are predefined or if the seller manually specified the value.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; &lt;code&gt;FREE_TEXT&lt;/code&gt; is currently only applicable to the Certification Number condition descriptor.&lt;/span&gt;
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ModeEnum implements ValuedEnum {
    SELECTION_ONLY("SELECTION_ONLY"),
    FREE_TEXT("FREE_TEXT");
    public final String value;
    ModeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ModeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "SELECTION_ONLY": return SELECTION_ONLY;
            case "FREE_TEXT": return FREE_TEXT;
            default: return null;
        }
    }
}

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
 * The name of the attribute included in the policy.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ExtendedProducerResponsibilityEnum implements ValuedEnum {
    ECO_PARTICIPATION_FEE("ECO_PARTICIPATION_FEE"),
    TAKE_BACK_POLICY("TAKE_BACK_POLICY"),
    REPAIR_SCORE("REPAIR_SCORE");
    public final String value;
    ExtendedProducerResponsibilityEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ExtendedProducerResponsibilityEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "ECO_PARTICIPATION_FEE": return ECO_PARTICIPATION_FEE;
            case "TAKE_BACK_POLICY": return TAKE_BACK_POLICY;
            case "REPAIR_SCORE": return REPAIR_SCORE;
            default: return null;
        }
    }
}

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
 * An enum list that defines the values you can supply for who pays for the return shipping cost. | - **BUYER**: Indicates the buyer pays for the return shipping cost.&lt;br&gt;&lt;br&gt;Note that the seller is responsible for the return shipping cost for all SNAD-related returns. - **SELLER**: Indicates the seller pays for the return shipping cost.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ReturnShippingCostPayerEnum implements ValuedEnum {
    BUYER("BUYER"),
    SELLER("SELLER");
    public final String value;
    ReturnShippingCostPayerEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ReturnShippingCostPayerEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "BUYER": return BUYER;
            case "SELLER": return SELLER;
            default: return null;
        }
    }
}

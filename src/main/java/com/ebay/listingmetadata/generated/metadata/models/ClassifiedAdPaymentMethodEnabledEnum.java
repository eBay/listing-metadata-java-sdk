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
 * This enumerated value indicates support for the payment method being displayed to the user for the category. Even if enabled, checkout may or may not be enabled.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ClassifiedAdPaymentMethodEnabledEnum implements ValuedEnum {
    ENABLED_WITH_CHECKOUT("ENABLED_WITH_CHECKOUT"),
    ENABLED_WITHOUT_CHECKOUT("ENABLED_WITHOUT_CHECKOUT"),
    NOT_SUPPORTED("NOT_SUPPORTED");
    public final String value;
    ClassifiedAdPaymentMethodEnabledEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ClassifiedAdPaymentMethodEnabledEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "ENABLED_WITH_CHECKOUT": return ENABLED_WITH_CHECKOUT;
            case "ENABLED_WITHOUT_CHECKOUT": return ENABLED_WITHOUT_CHECKOUT;
            case "NOT_SUPPORTED": return NOT_SUPPORTED;
            default: return null;
        }
    }
}

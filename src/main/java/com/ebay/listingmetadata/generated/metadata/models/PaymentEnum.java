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
 * An enumerated type that defines the different payment methods that can be used by buyers to pay sellers for purchases.&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;This value is only applicable for offline payments.&lt;/span&gt;&lt;/p&gt; | - **CASH_ON_PICKUP**: This enumeration value indicates that cash on pickup is accepted for payment. This value is only applicable for offline payments. - **PAYMENT_SEE_DESCRIPTION**: This enumeration value indicates that payment format is described in the listing description. This value is only applicable for offline payments and is not supported on all marketplaces. - **MOCC**: This enumeration value indicates that a money order or cashiers check is accepted for payment. This value is only applicable for offline payments and is not supported on all marketplaces. - **PERSONAL_CHECK**: This enumeration value indicates that a personal check is accepted for payment. This value is only applicable for offline payments and is not supported on all marketplaces. - **OTHER**: This enumeration value indicates that the payment format accepted for payment is not described by any of the other payment methods. This value is only applicable for offline payments.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PaymentEnum implements ValuedEnum {
    CASH_ON_PICKUP("CASH_ON_PICKUP"),
    PAYMENT_SEE_DESCRIPTION("PAYMENT_SEE_DESCRIPTION"),
    MOCC("MOCC"),
    PERSONAL_CHECK("PERSONAL_CHECK"),
    OTHER("OTHER");
    public final String value;
    PaymentEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PaymentEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "CASH_ON_PICKUP": return CASH_ON_PICKUP;
            case "PAYMENT_SEE_DESCRIPTION": return PAYMENT_SEE_DESCRIPTION;
            case "MOCC": return MOCC;
            case "PERSONAL_CHECK": return PERSONAL_CHECK;
            case "OTHER": return OTHER;
            default: return null;
        }
    }
}

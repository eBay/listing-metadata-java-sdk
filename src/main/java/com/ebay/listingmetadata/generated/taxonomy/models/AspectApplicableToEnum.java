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
 * This enumeration type contains values that indicate if an product aspect is applicable to an eBay catalog product within a category or applicable to a particular instance of an item/product. | - **ITEM**: This enum value indicates that the aspect identified by the &lt;b&gt;aspects.localizedAspectName&lt;/b&gt; field is an item/instance aspect, the value of which can vary for each item/product in the specified category. Sellers can set this aspect to a different value for each listing as appropriate. For item/instance aspects, the seller should also pay attention to the &lt;b&gt;aspectMaxLength&lt;/b&gt; field (if returned), as the value for this field will be the maximum number of characters that the seller can use for the corresponding value for the instance aspect. - **PRODUCT**: The aspect in the &lt;b&gt;aspects.localizedAspectName&lt;/b&gt; field is a catalog product aspect, the value of which can vary for each eBay catalog product in the specified category, but cannot vary for eBay listings based on the same catalog product. Sellers cannot change the value of aspects that are based on a catalog product.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AspectApplicableToEnum implements ValuedEnum {
    ITEM("ITEM"),
    PRODUCT("PRODUCT");
    public final String value;
    AspectApplicableToEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AspectApplicableToEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "ITEM": return ITEM;
            case "PRODUCT": return PRODUCT;
            default: return null;
        }
    }
}

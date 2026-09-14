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
 * This enumerated type contains a list of the standard codes that represent each of the eBay marketplaces. | - **EBAY_AT**: This enumeration value indicates that the eBay Marketplace is the Austria site (ebay.at). - **EBAY_AU**: This enumeration value indicates that the eBay Marketplace is the Australia site (ebay.com.au). - **EBAY_BE**: This enumeration value indicates that the eBay marketplace is the Belgium (Dutch) site (www.ebay.be). - **EBAY_CA**: This enumeration value indicates that the eBay Marketplace is the Canada (English) site (ebay.ca). - **EBAY_CH**: This enumeration value indicates that the eBay Marketplace is the Switzerland site (ebay.ch). - **EBAY_DE**: This enumeration value indicates that the eBay Marketplace is the Germany site (ebay.de). - **EBAY_ES**: This enumeration value indicates that the eBay Marketplace is the Spain site (ebay.es). - **EBAY_FR**: This enumeration value indicates that the eBay Marketplace is the France site (ebay.fr). - **EBAY_GB**: This enumeration value indicates that the eBay Marketplace is the UK site (ebay.co.uk). - **EBAY_HK**: This enumeration value indicates that the eBay Marketplace is the Hong Kong site (ebay.com.hk). - **EBAY_IE**: This enumeration value indicates that the eBay Marketplace is the Ireland site (ebay.ie). - **EBAY_IN**: This enumeration value indicates that the eBay Marketplace is the India site (ebay.in). Note: eBay India is no longer a functioning eBay marketplace. - **EBAY_IT**: This enumeration value indicates that the eBay Marketplace is the Italy site (ebay.it). - **EBAY_MOTORS_US**: This enumeration value indicates that the eBay Marketplace is the US eBay Motors site (ebay.com/motors). - **EBAY_MY**: This enumeration value indicates that the eBay Marketplace is the Malaysia site (ebay.com/my). - **EBAY_NL**: This enumeration value indicates that the eBay Marketplace is the Netherlands site (ebay.nl). - **EBAY_PH**: This enumeration value indicates that the eBay Marketplace is the Philippines site (ebay.ph). - **EBAY_PL**: This enumeration value indicates that the eBay Marketplace is the Poland site (ebay.pl). - **EBAY_RU**: This enumeration value indicates that the eBay Marketplace is the Russia site (ebay.com/sch/Russia). - **EBAY_SG**: This enumeration value indicates that the eBay Marketplace is the Singapore site (ebay.com/sg). - **EBAY_US**: This enumeration value indicates that the eBay Marketplace is the US site (ebay.com).
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MarketplaceIdEnum implements ValuedEnum {
    EBAY_AT("EBAY_AT"),
    EBAY_AU("EBAY_AU"),
    EBAY_BE("EBAY_BE"),
    EBAY_CA("EBAY_CA"),
    EBAY_CH("EBAY_CH"),
    EBAY_DE("EBAY_DE"),
    EBAY_ES("EBAY_ES"),
    EBAY_FR("EBAY_FR"),
    EBAY_GB("EBAY_GB"),
    EBAY_HK("EBAY_HK"),
    EBAY_IE("EBAY_IE"),
    EBAY_IN("EBAY_IN"),
    EBAY_IT("EBAY_IT"),
    EBAY_MOTORS_US("EBAY_MOTORS_US"),
    EBAY_MY("EBAY_MY"),
    EBAY_NL("EBAY_NL"),
    EBAY_PH("EBAY_PH"),
    EBAY_PL("EBAY_PL"),
    EBAY_RU("EBAY_RU"),
    EBAY_SG("EBAY_SG"),
    EBAY_US("EBAY_US");
    public final String value;
    MarketplaceIdEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MarketplaceIdEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "EBAY_AT": return EBAY_AT;
            case "EBAY_AU": return EBAY_AU;
            case "EBAY_BE": return EBAY_BE;
            case "EBAY_CA": return EBAY_CA;
            case "EBAY_CH": return EBAY_CH;
            case "EBAY_DE": return EBAY_DE;
            case "EBAY_ES": return EBAY_ES;
            case "EBAY_FR": return EBAY_FR;
            case "EBAY_GB": return EBAY_GB;
            case "EBAY_HK": return EBAY_HK;
            case "EBAY_IE": return EBAY_IE;
            case "EBAY_IN": return EBAY_IN;
            case "EBAY_IT": return EBAY_IT;
            case "EBAY_MOTORS_US": return EBAY_MOTORS_US;
            case "EBAY_MY": return EBAY_MY;
            case "EBAY_NL": return EBAY_NL;
            case "EBAY_PH": return EBAY_PH;
            case "EBAY_PL": return EBAY_PL;
            case "EBAY_RU": return EBAY_RU;
            case "EBAY_SG": return EBAY_SG;
            case "EBAY_US": return EBAY_US;
            default: return null;
        }
    }
}

package com.ebay.listingmetadata.generated.metadata.country;

import com.ebay.listingmetadata.generated.metadata.country.item.WithCountryCodeItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /country
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CountryRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the com.ebay.listingmetadata.generated.metadata.country.item collection
     * @param countryCode This path parameter specifies the two-letter &lt;a href=&quot;https://www.iso.org/iso-3166-country-codes.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 3166&lt;/a&gt; country code for the country whose jurisdictions you want to retrieve.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Sales-tax tables are available only for the US and Canada marketplaces. Therefore, the only supported values are:&lt;ul&gt;&lt;li&gt;&lt;code&gt;US&lt;/code&gt;&lt;/li&gt;&lt;li&gt;&lt;code&gt;CA&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;&lt;/span&gt;
     * @return a {@link WithCountryCodeItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithCountryCodeItemRequestBuilder byCountryCode(@jakarta.annotation.Nonnull final String countryCode) {
        Objects.requireNonNull(countryCode);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("countryCode", countryCode);
        return new WithCountryCodeItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link CountryRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CountryRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/country", pathParameters);
    }
    /**
     * Instantiates a new {@link CountryRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CountryRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/country", rawUrl);
    }
}

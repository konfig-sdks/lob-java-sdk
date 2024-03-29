/*
 * Lob
 * The Lob API is organized around REST. Our API is designed to have predictable, resource-oriented URLs and uses HTTP response codes to indicate any API errors. <p> 
 *
 * The version of the OpenAPI document: 1.19.28
 * Contact: lob-openapi@lob.com
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.CountryExtended;
import com.konfigthis.client.model.Error;
import com.konfigthis.client.model.IntlAutocompletions;
import com.konfigthis.client.model.IntlAutocompletionsWritable;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IntlAutocompletionsApi
 */
@Disabled
public class IntlAutocompletionsApiTest {

    private static IntlAutocompletionsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new IntlAutocompletionsApi(apiClient);
    }

    /**
     * Autocomplete
     *
     * Given an address prefix consisting of a partial primary line and country, as well as optional input of city, state, and zip code, this functionality returns up to 10 full International address suggestions. Not all of them will turn out to be valid addresses; they&#39;ll need to be [verified](#operation/intl_verification).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void autocompletionsTest() throws ApiException {
        String addressPrefix = null;
        CountryExtended country = null;
        String city = null;
        String state = null;
        String zipCode = null;
        Boolean geoIpSort = null;
        String xLangOutput = null;
        IntlAutocompletions response = api.autocompletions(addressPrefix, country)
                .city(city)
                .state(state)
                .zipCode(zipCode)
                .geoIpSort(geoIpSort)
                .xLangOutput(xLangOutput)
                .execute();
        // TODO: test validations
    }

}

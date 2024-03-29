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
import com.konfigthis.client.model.Error;
import com.konfigthis.client.model.MultipleComponents;
import com.konfigthis.client.model.MultipleComponentsList;
import com.konfigthis.client.model.UsVerification;
import com.konfigthis.client.model.UsVerifications;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsVerificationsApi
 */
@Disabled
public class UsVerificationsApiTest {

    private static UsVerificationsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new UsVerificationsApi(apiClient);
    }

    /**
     * Bulk Verify
     *
     * Verify a list of US or US territory addresses _with a live API key_. Requests to this endpoint with a test API key will return a dummy response based on the primary line you input.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void bulkVerifyAddressesTest() throws ApiException {
        List<MultipleComponents> addresses = null;
        String _case = null;
        UsVerifications response = api.bulkVerifyAddresses(addresses)
                ._case(_case)
                .execute();
        // TODO: test validations
    }

    /**
     * Single Verify
     *
     * Verify a US or US territory address _with a live API key_. The address can be in components (e.g. &#x60;primary_line&#x60; is \&quot;210 King Street\&quot;, &#x60;zip_code&#x60; is \&quot;94107\&quot;) or as a single string (e.g. \&quot;210 King Street 94107\&quot;), but not as both. Requests using a test API key validate required fields but return empty values unless specific &#x60;primary_line&#x60; values are provided. See the [US Verifications Test Environment](#section/US-Verifications-Test-Env) for details.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void verificationTest() throws ApiException {
        String _case = null;
        UsVerification response = api.verification()
                ._case(_case)
                .execute();
        // TODO: test validations
    }

}

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
import com.konfigthis.client.model.BuckslipOrder;
import com.konfigthis.client.model.BuckslipOrderEditable;
import com.konfigthis.client.model.BuckslipOrdersGetByBuckslipIdResponse;
import com.konfigthis.client.model.Error;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BuckslipOrdersApi
 */
@Disabled
public class BuckslipOrdersApiTest {

    private static BuckslipOrdersApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new BuckslipOrdersApi(apiClient);
    }

    /**
     * Create
     *
     * Creates a new buckslip order given information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNewOrderTest() throws ApiException {
        Integer quantity = null;
        String buckslipId = null;
        BuckslipOrder response = api.createNewOrder(quantity, buckslipId)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve
     *
     * Retrieves the buckslip orders associated with the given buckslip id.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByBuckslipIdTest() throws ApiException {
        String buckslipId = null;
        Integer limit = null;
        Integer offset = null;
        BuckslipOrdersGetByBuckslipIdResponse response = api.getByBuckslipId(buckslipId)
                .limit(limit)
                .offset(offset)
                .execute();
        // TODO: test validations
    }

}

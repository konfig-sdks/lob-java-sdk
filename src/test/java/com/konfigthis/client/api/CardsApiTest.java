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
import com.konfigthis.client.model.AddressesListBeforeAfterParameterAllOf;
import com.konfigthis.client.model.Card;
import com.konfigthis.client.model.CardDeletion;
import com.konfigthis.client.model.CardEditable;
import com.konfigthis.client.model.CardUpdatable;
import com.konfigthis.client.model.CardsListResponse;
import com.konfigthis.client.model.Error;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CardsApi
 */
@Disabled
public class CardsApiTest {

    private static CardsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new CardsApi(apiClient);
    }

    /**
     * Create
     *
     * Creates a new card given information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createTest() throws ApiException {
        String description = null;
        String size = null;
        Object front = null;
        Object back = null;
        Card response = api.create()
                .description(description)
                .size(size)
                .front(front)
                .back(back)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete
     *
     * Delete an existing card. You need only supply the unique identifier that was returned upon card creation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteTest() throws ApiException {
        String cardId = null;
        CardDeletion response = api.delete(cardId)
                .execute();
        // TODO: test validations
    }

    /**
     * List
     *
     * Returns a list of your cards. The cards are returned sorted by creation date, with the most recently created addresses appearing first.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listTest() throws ApiException {
        Integer limit = null;
        AddressesListBeforeAfterParameter beforeAfter = null;
        List<String> include = null;
        CardsListResponse response = api.list()
                .limit(limit)
                .beforeAfter(beforeAfter)
                .include(include)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve
     *
     * Retrieves the details of an existing card. You need only supply the unique customer identifier that was returned upon card creation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void retrieveTest() throws ApiException {
        String cardId = null;
        Card response = api.retrieve(cardId)
                .execute();
        // TODO: test validations
    }

    /**
     * Update
     *
     * Update the details of an existing card. You need only supply the unique identifier that was returned upon card creation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateTest() throws ApiException {
        String cardId = null;
        String description = null;
        Boolean autoReorder = null;
        Double reorderQuantity = null;
        Card response = api.update(cardId)
                .description(description)
                .autoReorder(autoReorder)
                .reorderQuantity(reorderQuantity)
                .execute();
        // TODO: test validations
    }

}
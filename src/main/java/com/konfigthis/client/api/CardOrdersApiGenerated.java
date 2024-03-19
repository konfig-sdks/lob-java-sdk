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

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.CardOrder;
import com.konfigthis.client.model.CardOrderEditable;
import com.konfigthis.client.model.CardOrdersGetResponse;
import com.konfigthis.client.model.Error;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class CardOrdersApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CardOrdersApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public CardOrdersApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call createNewOrderCall(String cardId, CardOrderEditable cardOrderEditable, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = cardOrderEditable;

        // create path and map variables
        String localVarPath = "/cards/{card_id}/orders"
            .replace("{" + "card_id" + "}", localVarApiClient.escapeString(cardId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json",
            "application/x-www-form-urlencoded",
            "multipart/form-data"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createNewOrderValidateBeforeCall(String cardId, CardOrderEditable cardOrderEditable, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'cardId' is set
        if (cardId == null) {
            throw new ApiException("Missing the required parameter 'cardId' when calling createNewOrder(Async)");
        }

        // verify the required parameter 'cardOrderEditable' is set
        if (cardOrderEditable == null) {
            throw new ApiException("Missing the required parameter 'cardOrderEditable' when calling createNewOrder(Async)");
        }

        return createNewOrderCall(cardId, cardOrderEditable, _callback);

    }


    private ApiResponse<CardOrder> createNewOrderWithHttpInfo(String cardId, CardOrderEditable cardOrderEditable) throws ApiException {
        okhttp3.Call localVarCall = createNewOrderValidateBeforeCall(cardId, cardOrderEditable, null);
        Type localVarReturnType = new TypeToken<CardOrder>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call createNewOrderAsync(String cardId, CardOrderEditable cardOrderEditable, final ApiCallback<CardOrder> _callback) throws ApiException {

        okhttp3.Call localVarCall = createNewOrderValidateBeforeCall(cardId, cardOrderEditable, _callback);
        Type localVarReturnType = new TypeToken<CardOrder>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class CreateNewOrderRequestBuilder {
        private final Integer quantity;
        private final String cardId;

        private CreateNewOrderRequestBuilder(Integer quantity, String cardId) {
            this.quantity = quantity;
            this.cardId = cardId;
        }

        /**
         * Build call for createNewOrder
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Card order created successfully </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            CardOrderEditable cardOrderEditable = buildBodyParams();
            return createNewOrderCall(cardId, cardOrderEditable, _callback);
        }

        private CardOrderEditable buildBodyParams() {
            CardOrderEditable cardOrderEditable = new CardOrderEditable();
            cardOrderEditable.quantity(this.quantity);
            return cardOrderEditable;
        }

        /**
         * Execute createNewOrder request
         * @return CardOrder
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Card order created successfully </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
         </table>
         */
        public CardOrder execute() throws ApiException {
            CardOrderEditable cardOrderEditable = buildBodyParams();
            ApiResponse<CardOrder> localVarResp = createNewOrderWithHttpInfo(cardId, cardOrderEditable);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute createNewOrder request with HTTP info returned
         * @return ApiResponse&lt;CardOrder&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Card order created successfully </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<CardOrder> executeWithHttpInfo() throws ApiException {
            CardOrderEditable cardOrderEditable = buildBodyParams();
            return createNewOrderWithHttpInfo(cardId, cardOrderEditable);
        }

        /**
         * Execute createNewOrder request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Card order created successfully </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<CardOrder> _callback) throws ApiException {
            CardOrderEditable cardOrderEditable = buildBodyParams();
            return createNewOrderAsync(cardId, cardOrderEditable, _callback);
        }
    }

    /**
     * Create
     * Creates a new card order given information
     * @param cardId The ID of the card to which the card orders belong. (required)
     * @param cardOrderEditable  (required)
     * @return CreateNewOrderRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Card order created successfully </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public CreateNewOrderRequestBuilder createNewOrder(Integer quantity, String cardId) throws IllegalArgumentException {
        if (quantity == null) throw new IllegalArgumentException("\"quantity\" is required but got null");
        if (cardId == null) throw new IllegalArgumentException("\"cardId\" is required but got null");
            

        return new CreateNewOrderRequestBuilder(quantity, cardId);
    }
    private okhttp3.Call getCall(String cardId, Integer limit, Integer offset, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/cards/{card_id}/orders"
            .replace("{" + "card_id" + "}", localVarApiClient.escapeString(cardId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getValidateBeforeCall(String cardId, Integer limit, Integer offset, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'cardId' is set
        if (cardId == null) {
            throw new ApiException("Missing the required parameter 'cardId' when calling get(Async)");
        }

        return getCall(cardId, limit, offset, _callback);

    }


    private ApiResponse<CardOrdersGetResponse> getWithHttpInfo(String cardId, Integer limit, Integer offset) throws ApiException {
        okhttp3.Call localVarCall = getValidateBeforeCall(cardId, limit, offset, null);
        Type localVarReturnType = new TypeToken<CardOrdersGetResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getAsync(String cardId, Integer limit, Integer offset, final ApiCallback<CardOrdersGetResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getValidateBeforeCall(cardId, limit, offset, _callback);
        Type localVarReturnType = new TypeToken<CardOrdersGetResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetRequestBuilder {
        private final String cardId;
        private Integer limit;
        private Integer offset;

        private GetRequestBuilder(String cardId) {
            this.cardId = cardId;
        }

        /**
         * Set limit
         * @param limit How many results to return. (optional, default to 10)
         * @return GetRequestBuilder
         */
        public GetRequestBuilder limit(Integer limit) {
            this.limit = limit;
            return this;
        }
        
        /**
         * Set offset
         * @param offset An integer that designates the offset at which to begin returning results. Defaults to 0. (optional, default to 0)
         * @return GetRequestBuilder
         */
        public GetRequestBuilder offset(Integer offset) {
            this.offset = offset;
            return this;
        }
        
        /**
         * Build call for get
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returns the card orders associated with the given card id </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getCall(cardId, limit, offset, _callback);
        }


        /**
         * Execute get request
         * @return CardOrdersGetResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returns the card orders associated with the given card id </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
         </table>
         */
        public CardOrdersGetResponse execute() throws ApiException {
            ApiResponse<CardOrdersGetResponse> localVarResp = getWithHttpInfo(cardId, limit, offset);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute get request with HTTP info returned
         * @return ApiResponse&lt;CardOrdersGetResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returns the card orders associated with the given card id </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<CardOrdersGetResponse> executeWithHttpInfo() throws ApiException {
            return getWithHttpInfo(cardId, limit, offset);
        }

        /**
         * Execute get request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returns the card orders associated with the given card id </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<CardOrdersGetResponse> _callback) throws ApiException {
            return getAsync(cardId, limit, offset, _callback);
        }
    }

    /**
     * Retrieve
     * Retrieves the card orders associated with the given card id.
     * @param cardId The ID of the card to which the card orders belong. (required)
     * @return GetRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the card orders associated with the given card id </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public GetRequestBuilder get(String cardId) throws IllegalArgumentException {
        if (cardId == null) throw new IllegalArgumentException("\"cardId\" is required but got null");
            

        return new GetRequestBuilder(cardId);
    }
}

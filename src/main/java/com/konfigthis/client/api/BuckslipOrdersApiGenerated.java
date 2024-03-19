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


import com.konfigthis.client.model.BuckslipOrder;
import com.konfigthis.client.model.BuckslipOrderEditable;
import com.konfigthis.client.model.BuckslipOrdersGetByBuckslipIdResponse;
import com.konfigthis.client.model.Error;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class BuckslipOrdersApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public BuckslipOrdersApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public BuckslipOrdersApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call createNewOrderCall(String buckslipId, BuckslipOrderEditable buckslipOrderEditable, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = buckslipOrderEditable;

        // create path and map variables
        String localVarPath = "/buckslips/{buckslip_id}/orders"
            .replace("{" + "buckslip_id" + "}", localVarApiClient.escapeString(buckslipId.toString()));

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
    private okhttp3.Call createNewOrderValidateBeforeCall(String buckslipId, BuckslipOrderEditable buckslipOrderEditable, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'buckslipId' is set
        if (buckslipId == null) {
            throw new ApiException("Missing the required parameter 'buckslipId' when calling createNewOrder(Async)");
        }

        // verify the required parameter 'buckslipOrderEditable' is set
        if (buckslipOrderEditable == null) {
            throw new ApiException("Missing the required parameter 'buckslipOrderEditable' when calling createNewOrder(Async)");
        }

        return createNewOrderCall(buckslipId, buckslipOrderEditable, _callback);

    }


    private ApiResponse<BuckslipOrder> createNewOrderWithHttpInfo(String buckslipId, BuckslipOrderEditable buckslipOrderEditable) throws ApiException {
        okhttp3.Call localVarCall = createNewOrderValidateBeforeCall(buckslipId, buckslipOrderEditable, null);
        Type localVarReturnType = new TypeToken<BuckslipOrder>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call createNewOrderAsync(String buckslipId, BuckslipOrderEditable buckslipOrderEditable, final ApiCallback<BuckslipOrder> _callback) throws ApiException {

        okhttp3.Call localVarCall = createNewOrderValidateBeforeCall(buckslipId, buckslipOrderEditable, _callback);
        Type localVarReturnType = new TypeToken<BuckslipOrder>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class CreateNewOrderRequestBuilder {
        private final Integer quantity;
        private final String buckslipId;

        private CreateNewOrderRequestBuilder(Integer quantity, String buckslipId) {
            this.quantity = quantity;
            this.buckslipId = buckslipId;
        }

        /**
         * Build call for createNewOrder
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Buckslip order created successfully </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            BuckslipOrderEditable buckslipOrderEditable = buildBodyParams();
            return createNewOrderCall(buckslipId, buckslipOrderEditable, _callback);
        }

        private BuckslipOrderEditable buildBodyParams() {
            BuckslipOrderEditable buckslipOrderEditable = new BuckslipOrderEditable();
            buckslipOrderEditable.quantity(this.quantity);
            return buckslipOrderEditable;
        }

        /**
         * Execute createNewOrder request
         * @return BuckslipOrder
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Buckslip order created successfully </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
         </table>
         */
        public BuckslipOrder execute() throws ApiException {
            BuckslipOrderEditable buckslipOrderEditable = buildBodyParams();
            ApiResponse<BuckslipOrder> localVarResp = createNewOrderWithHttpInfo(buckslipId, buckslipOrderEditable);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute createNewOrder request with HTTP info returned
         * @return ApiResponse&lt;BuckslipOrder&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Buckslip order created successfully </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<BuckslipOrder> executeWithHttpInfo() throws ApiException {
            BuckslipOrderEditable buckslipOrderEditable = buildBodyParams();
            return createNewOrderWithHttpInfo(buckslipId, buckslipOrderEditable);
        }

        /**
         * Execute createNewOrder request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Buckslip order created successfully </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<BuckslipOrder> _callback) throws ApiException {
            BuckslipOrderEditable buckslipOrderEditable = buildBodyParams();
            return createNewOrderAsync(buckslipId, buckslipOrderEditable, _callback);
        }
    }

    /**
     * Create
     * Creates a new buckslip order given information
     * @param buckslipId The ID of the buckslip to which the buckslip orders belong. (required)
     * @param buckslipOrderEditable  (required)
     * @return CreateNewOrderRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Buckslip order created successfully </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public CreateNewOrderRequestBuilder createNewOrder(Integer quantity, String buckslipId) throws IllegalArgumentException {
        if (quantity == null) throw new IllegalArgumentException("\"quantity\" is required but got null");
        if (buckslipId == null) throw new IllegalArgumentException("\"buckslipId\" is required but got null");
            

        return new CreateNewOrderRequestBuilder(quantity, buckslipId);
    }
    private okhttp3.Call getByBuckslipIdCall(String buckslipId, Integer limit, Integer offset, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/buckslips/{buckslip_id}/orders"
            .replace("{" + "buckslip_id" + "}", localVarApiClient.escapeString(buckslipId.toString()));

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
    private okhttp3.Call getByBuckslipIdValidateBeforeCall(String buckslipId, Integer limit, Integer offset, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'buckslipId' is set
        if (buckslipId == null) {
            throw new ApiException("Missing the required parameter 'buckslipId' when calling getByBuckslipId(Async)");
        }

        return getByBuckslipIdCall(buckslipId, limit, offset, _callback);

    }


    private ApiResponse<BuckslipOrdersGetByBuckslipIdResponse> getByBuckslipIdWithHttpInfo(String buckslipId, Integer limit, Integer offset) throws ApiException {
        okhttp3.Call localVarCall = getByBuckslipIdValidateBeforeCall(buckslipId, limit, offset, null);
        Type localVarReturnType = new TypeToken<BuckslipOrdersGetByBuckslipIdResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getByBuckslipIdAsync(String buckslipId, Integer limit, Integer offset, final ApiCallback<BuckslipOrdersGetByBuckslipIdResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getByBuckslipIdValidateBeforeCall(buckslipId, limit, offset, _callback);
        Type localVarReturnType = new TypeToken<BuckslipOrdersGetByBuckslipIdResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetByBuckslipIdRequestBuilder {
        private final String buckslipId;
        private Integer limit;
        private Integer offset;

        private GetByBuckslipIdRequestBuilder(String buckslipId) {
            this.buckslipId = buckslipId;
        }

        /**
         * Set limit
         * @param limit How many results to return. (optional, default to 10)
         * @return GetByBuckslipIdRequestBuilder
         */
        public GetByBuckslipIdRequestBuilder limit(Integer limit) {
            this.limit = limit;
            return this;
        }
        
        /**
         * Set offset
         * @param offset An integer that designates the offset at which to begin returning results. Defaults to 0. (optional, default to 0)
         * @return GetByBuckslipIdRequestBuilder
         */
        public GetByBuckslipIdRequestBuilder offset(Integer offset) {
            this.offset = offset;
            return this;
        }
        
        /**
         * Build call for getByBuckslipId
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returns the buckslip orders associated with the given buckslip id </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getByBuckslipIdCall(buckslipId, limit, offset, _callback);
        }


        /**
         * Execute getByBuckslipId request
         * @return BuckslipOrdersGetByBuckslipIdResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returns the buckslip orders associated with the given buckslip id </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
         </table>
         */
        public BuckslipOrdersGetByBuckslipIdResponse execute() throws ApiException {
            ApiResponse<BuckslipOrdersGetByBuckslipIdResponse> localVarResp = getByBuckslipIdWithHttpInfo(buckslipId, limit, offset);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getByBuckslipId request with HTTP info returned
         * @return ApiResponse&lt;BuckslipOrdersGetByBuckslipIdResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returns the buckslip orders associated with the given buckslip id </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<BuckslipOrdersGetByBuckslipIdResponse> executeWithHttpInfo() throws ApiException {
            return getByBuckslipIdWithHttpInfo(buckslipId, limit, offset);
        }

        /**
         * Execute getByBuckslipId request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returns the buckslip orders associated with the given buckslip id </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<BuckslipOrdersGetByBuckslipIdResponse> _callback) throws ApiException {
            return getByBuckslipIdAsync(buckslipId, limit, offset, _callback);
        }
    }

    /**
     * Retrieve
     * Retrieves the buckslip orders associated with the given buckslip id.
     * @param buckslipId The ID of the buckslip to which the buckslip orders belong. (required)
     * @return GetByBuckslipIdRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns the buckslip orders associated with the given buckslip id </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public GetByBuckslipIdRequestBuilder getByBuckslipId(String buckslipId) throws IllegalArgumentException {
        if (buckslipId == null) throw new IllegalArgumentException("\"buckslipId\" is required but got null");
            

        return new GetByBuckslipIdRequestBuilder(buckslipId);
    }
}

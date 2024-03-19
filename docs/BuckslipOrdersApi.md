# BuckslipOrdersApi

All URIs are relative to *https://api.lob.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewOrder**](BuckslipOrdersApi.md#createNewOrder) | **POST** /buckslips/{buckslip_id}/orders | Create |
| [**getByBuckslipId**](BuckslipOrdersApi.md#getByBuckslipId) | **GET** /buckslips/{buckslip_id}/orders | Retrieve |


<a name="createNewOrder"></a>
# **createNewOrder**
> BuckslipOrder createNewOrder(buckslipId, buckslipOrderEditable).execute();

Create

Creates a new buckslip order given information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BuckslipOrdersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.lob.com/v1";
    
    // Configure HTTP basic authorization: basicAuth
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    Lob client = new Lob(configuration);
    Integer quantity = 56; // The quantity of buckslips in the order (minimum 5,000).
    String buckslipId = "buckslipId_example"; // The ID of the buckslip to which the buckslip orders belong.
    try {
      BuckslipOrder result = client
              .buckslipOrders
              .createNewOrder(quantity, buckslipId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDateCreated());
      System.out.println(result.getDateModified());
      System.out.println(result.getDeleted());
      System.out.println(result.getObject());
      System.out.println(result.getId());
      System.out.println(result.getBuckslipId());
      System.out.println(result.getStatus());
      System.out.println(result.getQuantityOrdered());
      System.out.println(result.getUnitPrice());
      System.out.println(result.getInventory());
      System.out.println(result.getCancelledReason());
      System.out.println(result.getAvailabilityDate());
      System.out.println(result.getExpectedAvailabilityDate());
    } catch (ApiException e) {
      System.err.println("Exception when calling BuckslipOrdersApi#createNewOrder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BuckslipOrder> response = client
              .buckslipOrders
              .createNewOrder(quantity, buckslipId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BuckslipOrdersApi#createNewOrder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **buckslipId** | **String**| The ID of the buckslip to which the buckslip orders belong. | |
| **buckslipOrderEditable** | [**BuckslipOrderEditable**](BuckslipOrderEditable.md)|  | |

### Return type

[**BuckslipOrder**](BuckslipOrder.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Buckslip order created successfully |  -  |
| **0** | Error |  -  |

<a name="getByBuckslipId"></a>
# **getByBuckslipId**
> BuckslipOrdersGetByBuckslipIdResponse getByBuckslipId(buckslipId).limit(limit).offset(offset).execute();

Retrieve

Retrieves the buckslip orders associated with the given buckslip id.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BuckslipOrdersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.lob.com/v1";
    
    // Configure HTTP basic authorization: basicAuth
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    Lob client = new Lob(configuration);
    String buckslipId = "buckslipId_example"; // The ID of the buckslip to which the buckslip orders belong.
    Integer limit = 10; // How many results to return.
    Integer offset = 0; // An integer that designates the offset at which to begin returning results. Defaults to 0.
    try {
      BuckslipOrdersGetByBuckslipIdResponse result = client
              .buckslipOrders
              .getByBuckslipId(buckslipId)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getNextUrl());
      System.out.println(result.getPreviousUrl());
      System.out.println(result.getCount());
      System.out.println(result.getTotalCount());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling BuckslipOrdersApi#getByBuckslipId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BuckslipOrdersGetByBuckslipIdResponse> response = client
              .buckslipOrders
              .getByBuckslipId(buckslipId)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BuckslipOrdersApi#getByBuckslipId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **buckslipId** | **String**| The ID of the buckslip to which the buckslip orders belong. | |
| **limit** | **Integer**| How many results to return. | [optional] [default to 10] |
| **offset** | **Integer**| An integer that designates the offset at which to begin returning results. Defaults to 0. | [optional] [default to 0] |

### Return type

[**BuckslipOrdersGetByBuckslipIdResponse**](BuckslipOrdersGetByBuckslipIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the buckslip orders associated with the given buckslip id |  -  |
| **0** | Error |  -  |


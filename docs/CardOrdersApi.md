# CardOrdersApi

All URIs are relative to *https://api.lob.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewOrder**](CardOrdersApi.md#createNewOrder) | **POST** /cards/{card_id}/orders | Create |
| [**get**](CardOrdersApi.md#get) | **GET** /cards/{card_id}/orders | Retrieve |


<a name="createNewOrder"></a>
# **createNewOrder**
> CardOrder createNewOrder(cardId, cardOrderEditable).execute();

Create

Creates a new card order given information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardOrdersApi;
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
    Integer quantity = 56; // The quantity of cards in the order (minimum 10,000).
    String cardId = "cardId_example"; // The ID of the card to which the card orders belong.
    try {
      CardOrder result = client
              .cardOrders
              .createNewOrder(quantity, cardId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDateCreated());
      System.out.println(result.getDateModified());
      System.out.println(result.getDeleted());
      System.out.println(result.getObject());
      System.out.println(result.getId());
      System.out.println(result.getCardId());
      System.out.println(result.getStatus());
      System.out.println(result.getInventory());
      System.out.println(result.getQuantityOrdered());
      System.out.println(result.getUnitPrice());
      System.out.println(result.getCancelledReason());
      System.out.println(result.getAvailabilityDate());
      System.out.println(result.getExpectedAvailabilityDate());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardOrdersApi#createNewOrder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CardOrder> response = client
              .cardOrders
              .createNewOrder(quantity, cardId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardOrdersApi#createNewOrder");
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
| **cardId** | **String**| The ID of the card to which the card orders belong. | |
| **cardOrderEditable** | [**CardOrderEditable**](CardOrderEditable.md)|  | |

### Return type

[**CardOrder**](CardOrder.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Card order created successfully |  -  |
| **0** | Error |  -  |

<a name="get"></a>
# **get**
> CardOrdersGetResponse get(cardId).limit(limit).offset(offset).execute();

Retrieve

Retrieves the card orders associated with the given card id.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardOrdersApi;
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
    String cardId = "cardId_example"; // The ID of the card to which the card orders belong.
    Integer limit = 10; // How many results to return.
    Integer offset = 0; // An integer that designates the offset at which to begin returning results. Defaults to 0.
    try {
      CardOrdersGetResponse result = client
              .cardOrders
              .get(cardId)
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
      System.err.println("Exception when calling CardOrdersApi#get");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CardOrdersGetResponse> response = client
              .cardOrders
              .get(cardId)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardOrdersApi#get");
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
| **cardId** | **String**| The ID of the card to which the card orders belong. | |
| **limit** | **Integer**| How many results to return. | [optional] [default to 10] |
| **offset** | **Integer**| An integer that designates the offset at which to begin returning results. Defaults to 0. | [optional] [default to 0] |

### Return type

[**CardOrdersGetResponse**](CardOrdersGetResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the card orders associated with the given card id |  -  |
| **0** | Error |  -  |


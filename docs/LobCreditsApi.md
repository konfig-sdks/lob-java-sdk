# LobCreditsApi

All URIs are relative to *https://api.lob.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCreditsBalance**](LobCreditsApi.md#getCreditsBalance) | **GET** /accounts | Get Lob Credits Balance |


<a name="getCreditsBalance"></a>
# **getCreditsBalance**
> LobCreditsBalance getCreditsBalance().execute();

Get Lob Credits Balance

Returns the account&#39;s current balance of Lob Credits.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LobCreditsApi;
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
    try {
      LobCreditsBalance result = client
              .lobCredits
              .getCreditsBalance()
              .execute();
      System.out.println(result);
      System.out.println(result.getBalance());
    } catch (ApiException e) {
      System.err.println("Exception when calling LobCreditsApi#getCreditsBalance");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LobCreditsBalance> response = client
              .lobCredits
              .getCreditsBalance()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LobCreditsApi#getCreditsBalance");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**LobCreditsBalance**](LobCreditsBalance.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a lob_credits_balance object. |  -  |


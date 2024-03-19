# IntlVerificationsApi

All URIs are relative to *https://api.lob.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**verification**](IntlVerificationsApi.md#verification) | **POST** /intl_verifications | Single Verify |
| [**verifyBulkAddresses**](IntlVerificationsApi.md#verifyBulkAddresses) | **POST** /bulk/intl_verifications | Bulk Verify |


<a name="verification"></a>
# **verification**
> IntlVerification verification(body).xLangOutput(xLangOutput).execute();

Single Verify

Verify an international (except US or US territories) address _with a live API key_. Requests to this endpoint with a test API key will return a dummy response based on the primary line you input.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IntlVerificationsApi;
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
    String xLangOutput = "native"; // * `native` - Translate response to the native language of the country in the request * `match` - match the response to the language in the request  Default response is in English. 
    try {
      IntlVerification result = client
              .intlVerifications
              .verification()
              .xLangOutput(xLangOutput)
              .execute();
      System.out.println(result);
      System.out.println(result.getRecipient());
      System.out.println(result.getPrimaryLine());
      System.out.println(result.getSecondaryLine());
      System.out.println(result.getComponents());
      System.out.println(result.getId());
      System.out.println(result.getLastLine());
      System.out.println(result.getCountry());
      System.out.println(result.getCoverage());
      System.out.println(result.getDeliverability());
      System.out.println(result.getStatus());
      System.out.println(result.getObject());
    } catch (ApiException e) {
      System.err.println("Exception when calling IntlVerificationsApi#verification");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IntlVerification> response = client
              .intlVerifications
              .verification()
              .xLangOutput(xLangOutput)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IntlVerificationsApi#verification");
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
| **body** | **Object**|  | |
| **xLangOutput** | **String**| * &#x60;native&#x60; - Translate response to the native language of the country in the request * &#x60;match&#x60; - match the response to the language in the request  Default response is in English.  | [optional] [enum: native, match] |

### Return type

[**IntlVerification**](IntlVerification.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an international verification object. |  * ratelimit-limit -  <br>  * ratelimit-remaining -  <br>  * ratelimit-reset -  <br>  |
| **0** | Error |  -  |

<a name="verifyBulkAddresses"></a>
# **verifyBulkAddresses**
> IntlVerifications verifyBulkAddresses(intlVerificationsPayload).execute();

Bulk Verify

Verify a list of international (except US or US territories) address _with a live API key_. Requests to this endpoint with a test API key will return a dummy response based on the primary line you input.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IntlVerificationsApi;
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
    List<MultipleComponentsIntl> addresses = Arrays.asList();
    try {
      IntlVerifications result = client
              .intlVerifications
              .verifyBulkAddresses(addresses)
              .execute();
      System.out.println(result);
      System.out.println(result.getAddresses());
      System.out.println(result.getErrors());
    } catch (ApiException e) {
      System.err.println("Exception when calling IntlVerificationsApi#verifyBulkAddresses");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IntlVerifications> response = client
              .intlVerifications
              .verifyBulkAddresses(addresses)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IntlVerificationsApi#verifyBulkAddresses");
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
| **intlVerificationsPayload** | [**IntlVerificationsPayload**](IntlVerificationsPayload.md)|  | |

### Return type

[**IntlVerifications**](IntlVerifications.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an array of international verification objects. |  * ratelimit-limit -  <br>  * ratelimit-remaining -  <br>  * ratelimit-reset -  <br>  |
| **0** | Error |  -  |


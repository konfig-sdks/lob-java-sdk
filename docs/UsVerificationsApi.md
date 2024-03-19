# UsVerificationsApi

All URIs are relative to *https://api.lob.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**bulkVerifyAddresses**](UsVerificationsApi.md#bulkVerifyAddresses) | **POST** /bulk/us_verifications | Bulk Verify |
| [**verification**](UsVerificationsApi.md#verification) | **POST** /us_verifications | Single Verify |


<a name="bulkVerifyAddresses"></a>
# **bulkVerifyAddresses**
> UsVerifications bulkVerifyAddresses(multipleComponentsList)._case(_case).execute();

Bulk Verify

Verify a list of US or US territory addresses _with a live API key_. Requests to this endpoint with a test API key will return a dummy response based on the primary line you input.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsVerificationsApi;
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
    List<MultipleComponents> addresses = Arrays.asList();
    String _case = "upper"; // Casing of the verified address. Possible values are `upper` and `proper` for uppercased (e.g. \"PO BOX\") and proper-cased (e.g. \"PO Box\"), respectively. Only affects `recipient`, `primary_line`, `secondary_line`, `urbanization`, and `last_line`. Default casing is `upper`.
    try {
      UsVerifications result = client
              .usVerifications
              .bulkVerifyAddresses(addresses)
              ._case(_case)
              .execute();
      System.out.println(result);
      System.out.println(result.getAddresses());
      System.out.println(result.getErrors());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsVerificationsApi#bulkVerifyAddresses");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsVerifications> response = client
              .usVerifications
              .bulkVerifyAddresses(addresses)
              ._case(_case)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsVerificationsApi#bulkVerifyAddresses");
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
| **multipleComponentsList** | [**MultipleComponentsList**](MultipleComponentsList.md)|  | |
| **_case** | **String**| Casing of the verified address. Possible values are &#x60;upper&#x60; and &#x60;proper&#x60; for uppercased (e.g. \&quot;PO BOX\&quot;) and proper-cased (e.g. \&quot;PO Box\&quot;), respectively. Only affects &#x60;recipient&#x60;, &#x60;primary_line&#x60;, &#x60;secondary_line&#x60;, &#x60;urbanization&#x60;, and &#x60;last_line&#x60;. Default casing is &#x60;upper&#x60;. | [optional] [default to upper] [enum: upper, proper] |

### Return type

[**UsVerifications**](UsVerifications.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of US verification objects. |  * ratelimit-limit -  <br>  * ratelimit-remaining -  <br>  * ratelimit-reset -  <br>  |
| **0** | Error |  -  |

<a name="verification"></a>
# **verification**
> UsVerification verification(body)._case(_case).execute();

Single Verify

Verify a US or US territory address _with a live API key_. The address can be in components (e.g. &#x60;primary_line&#x60; is \&quot;210 King Street\&quot;, &#x60;zip_code&#x60; is \&quot;94107\&quot;) or as a single string (e.g. \&quot;210 King Street 94107\&quot;), but not as both. Requests using a test API key validate required fields but return empty values unless specific &#x60;primary_line&#x60; values are provided. See the [US Verifications Test Environment](#section/US-Verifications-Test-Env) for details.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsVerificationsApi;
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
    String _case = "upper"; // Casing of the verified address. Possible values are `upper` and `proper` for uppercased (e.g. \"PO BOX\") and proper-cased (e.g. \"PO Box\"), respectively. Only affects `recipient`, `primary_line`, `secondary_line`, `urbanization`, and `last_line`. Default casing is `upper`.
    try {
      UsVerification result = client
              .usVerifications
              .verification()
              ._case(_case)
              .execute();
      System.out.println(result);
      System.out.println(result.getComponents());
      System.out.println(result.getId());
      System.out.println(result.getRecipient());
      System.out.println(result.getPrimaryLine());
      System.out.println(result.getSecondaryLine());
      System.out.println(result.getUrbanization());
      System.out.println(result.getLastLine());
      System.out.println(result.getDeliverability());
      System.out.println(result.getValidAddress());
      System.out.println(result.getDeliverabilityAnalysis());
      System.out.println(result.getLobConfidenceScore());
      System.out.println(result.getObject());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsVerificationsApi#verification");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsVerification> response = client
              .usVerifications
              .verification()
              ._case(_case)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsVerificationsApi#verification");
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
| **_case** | **String**| Casing of the verified address. Possible values are &#x60;upper&#x60; and &#x60;proper&#x60; for uppercased (e.g. \&quot;PO BOX\&quot;) and proper-cased (e.g. \&quot;PO Box\&quot;), respectively. Only affects &#x60;recipient&#x60;, &#x60;primary_line&#x60;, &#x60;secondary_line&#x60;, &#x60;urbanization&#x60;, and &#x60;last_line&#x60;. Default casing is &#x60;upper&#x60;. | [optional] [default to upper] [enum: upper, proper] |

### Return type

[**UsVerification**](UsVerification.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a US verification object. |  * ratelimit-limit -  <br>  * ratelimit-remaining -  <br>  * ratelimit-reset -  <br>  |
| **0** | Error |  -  |


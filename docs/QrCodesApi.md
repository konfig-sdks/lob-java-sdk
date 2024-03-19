# QrCodesApi

All URIs are relative to *https://api.lob.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSortedQrCodes**](QrCodesApi.md#getSortedQrCodes) | **GET** /qr_code_analytics | List |


<a name="getSortedQrCodes"></a>
# **getSortedQrCodes**
> QrCodesGetSortedQrCodesResponse getSortedQrCodes().limit(limit).offset(offset).include(include).dateCreated(dateCreated).scanned(scanned).resourceIds(resourceIds).execute();

List

Returns a list of your QR codes. The QR codes are returned sorted by scan date, with the most recently scanned QR codes appearing first.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.QrCodesApi;
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
    Integer limit = 10; // How many results to return.
    Integer offset = 0; // An integer that designates the offset at which to begin returning results. Defaults to 0.
    List<String> include = Arrays.asList(); // Request that the response include the total count by specifying `include=[\"total_count\"]`. 
    Map<String, String> dateCreated = new HashMap(); // Filter by date created. Accepted formats are ISO-8601 date or datetime, e.g. `{ \"gt\": \"2012-01-01\", \"lt\": \"2012-01-31T12:34:56Z\" }` where `gt` is >, `lt` is <, `gte` is ≥, and `lte` is ≤.
    Boolean scanned = true; // Filter list of responses to only include QR codes with at least one scan event.
    List resourceIds = new List(); // Filter by the resource ID.
    try {
      QrCodesGetSortedQrCodesResponse result = client
              .qrCodes
              .getSortedQrCodes()
              .limit(limit)
              .offset(offset)
              .include(include)
              .dateCreated(dateCreated)
              .scanned(scanned)
              .resourceIds(resourceIds)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getCount());
      System.out.println(result.getTotalCount());
      System.out.println(result.getScannedCount());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling QrCodesApi#getSortedQrCodes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<QrCodesGetSortedQrCodesResponse> response = client
              .qrCodes
              .getSortedQrCodes()
              .limit(limit)
              .offset(offset)
              .include(include)
              .dateCreated(dateCreated)
              .scanned(scanned)
              .resourceIds(resourceIds)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling QrCodesApi#getSortedQrCodes");
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
| **limit** | **Integer**| How many results to return. | [optional] [default to 10] |
| **offset** | **Integer**| An integer that designates the offset at which to begin returning results. Defaults to 0. | [optional] [default to 0] |
| **include** | [**List&lt;String&gt;**](String.md)| Request that the response include the total count by specifying &#x60;include&#x3D;[\&quot;total_count\&quot;]&#x60;.  | [optional] |
| **dateCreated** | [**Map&lt;String, String&gt;**](String.md)| Filter by date created. Accepted formats are ISO-8601 date or datetime, e.g. &#x60;{ \&quot;gt\&quot;: \&quot;2012-01-01\&quot;, \&quot;lt\&quot;: \&quot;2012-01-31T12:34:56Z\&quot; }&#x60; where &#x60;gt&#x60; is &gt;, &#x60;lt&#x60; is &lt;, &#x60;gte&#x60; is ≥, and &#x60;lte&#x60; is ≤. | [optional] |
| **scanned** | **Boolean**| Filter list of responses to only include QR codes with at least one scan event. | [optional] |
| **resourceIds** | [**List**](.md)| Filter by the resource ID. | [optional] [default to []] |

### Return type

[**QrCodesGetSortedQrCodesResponse**](QrCodesGetSortedQrCodesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of QR Codes and their analytics. |  -  |


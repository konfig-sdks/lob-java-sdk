# UsAutocompletionsApi

All URIs are relative to *https://api.lob.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSuggestions**](UsAutocompletionsApi.md#getSuggestions) | **POST** /us_autocompletions | Autocomplete |


<a name="getSuggestions"></a>
# **getSuggestions**
> UsAutocompletions getSuggestions(usAutocompletionsWritable)._case(_case).validAddresses(validAddresses).execute();

Autocomplete

Given an address prefix consisting of a partial primary line, as well as optional input of city, state, and zip code, this functionality returns up to 10 full US address suggestions. Not all of them will turn out to be valid addresses; they&#39;ll need to be [verified](#operation/verification_us).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsAutocompletionsApi;
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
    String addressPrefix = "addressPrefix_example"; // Only accepts numbers and street names in an alphanumeric format. 
    String city = "city_example"; // An optional city input used to filter suggestions. Case insensitive and does not match partial abbreviations. 
    String state = "state_example"; // An optional state input used to filter suggestions. Case insensitive and does not match partial abbreviations. 
    String zipCode = "zipCode_example"; // An optional ZIP Code input used to filter suggestions. Matches partial entries. 
    Boolean geoIpSort = true; // If `true`, sort suggestions by proximity to the IP set in the `X-Forwarded-For` header. 
    String _case = "upper"; // Casing of the verified address. Possible values are `upper` and `proper` for uppercased (e.g. \"PO BOX\") and proper-cased (e.g. \"PO Box\"), respectively. Only affects `primary_line`, `city`, and `state`. Default casing is `upper`.
    Boolean validAddresses = true; // Possible values are `true` and `false`. If false, not all of the suggestions in the response will be valid addresses; they'll need to be verified in order to determine the deliverability. The valid_addresses flag will greatly reduce the number of keystrokes needed before reaching an intended address.
    try {
      UsAutocompletions result = client
              .usAutocompletions
              .getSuggestions(addressPrefix)
              .city(city)
              .state(state)
              .zipCode(zipCode)
              .geoIpSort(geoIpSort)
              ._case(_case)
              .validAddresses(validAddresses)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getSuggestions());
      System.out.println(result.getObject());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsAutocompletionsApi#getSuggestions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsAutocompletions> response = client
              .usAutocompletions
              .getSuggestions(addressPrefix)
              .city(city)
              .state(state)
              .zipCode(zipCode)
              .geoIpSort(geoIpSort)
              ._case(_case)
              .validAddresses(validAddresses)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsAutocompletionsApi#getSuggestions");
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
| **usAutocompletionsWritable** | [**UsAutocompletionsWritable**](UsAutocompletionsWritable.md)|  | |
| **_case** | **String**| Casing of the verified address. Possible values are &#x60;upper&#x60; and &#x60;proper&#x60; for uppercased (e.g. \&quot;PO BOX\&quot;) and proper-cased (e.g. \&quot;PO Box\&quot;), respectively. Only affects &#x60;primary_line&#x60;, &#x60;city&#x60;, and &#x60;state&#x60;. Default casing is &#x60;upper&#x60;. | [optional] [default to upper] [enum: upper, proper] |
| **validAddresses** | **Boolean**| Possible values are &#x60;true&#x60; and &#x60;false&#x60;. If false, not all of the suggestions in the response will be valid addresses; they&#39;ll need to be verified in order to determine the deliverability. The valid_addresses flag will greatly reduce the number of keystrokes needed before reaching an intended address. | [optional] [default to false] [enum: true, false] |

### Return type

[**UsAutocompletions**](UsAutocompletions.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a US autocompletion object. |  * ratelimit-limit -  <br>  * ratelimit-remaining -  <br>  * ratelimit-reset -  <br>  |
| **0** | Error |  -  |


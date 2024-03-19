# IntlAutocompletionsApi

All URIs are relative to *https://api.lob.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**autocompletions**](IntlAutocompletionsApi.md#autocompletions) | **POST** /intl_autocompletions | Autocomplete |


<a name="autocompletions"></a>
# **autocompletions**
> IntlAutocompletions autocompletions(intlAutocompletionsWritable).xLangOutput(xLangOutput).execute();

Autocomplete

Given an address prefix consisting of a partial primary line and country, as well as optional input of city, state, and zip code, this functionality returns up to 10 full International address suggestions. Not all of them will turn out to be valid addresses; they&#39;ll need to be [verified](#operation/intl_verification).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.IntlAutocompletionsApi;
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
    CountryExtended country = CountryExtended.fromValue("AD");
    String city = "city_example"; // An optional city input used to filter suggestions. Case insensitive and does not match partial abbreviations. 
    String state = "state_example"; // An optional state input used to filter suggestions. Case insensitive and does not match partial abbreviations. 
    String zipCode = "zipCode_example"; // An optional Zip Code input used to filter suggestions. Matches partial entries. 
    Boolean geoIpSort = true; // If `true`, sort suggestions by proximity to the IP set in the `X-Forwarded-For` header. 
    String xLangOutput = "native"; // * `native` - Translate response to the native language of the country in the request * `match` - match the response to the language in the request  Default response is in English. 
    try {
      IntlAutocompletions result = client
              .intlAutocompletions
              .autocompletions(addressPrefix, country)
              .city(city)
              .state(state)
              .zipCode(zipCode)
              .geoIpSort(geoIpSort)
              .xLangOutput(xLangOutput)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getSuggestions());
    } catch (ApiException e) {
      System.err.println("Exception when calling IntlAutocompletionsApi#autocompletions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<IntlAutocompletions> response = client
              .intlAutocompletions
              .autocompletions(addressPrefix, country)
              .city(city)
              .state(state)
              .zipCode(zipCode)
              .geoIpSort(geoIpSort)
              .xLangOutput(xLangOutput)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling IntlAutocompletionsApi#autocompletions");
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
| **intlAutocompletionsWritable** | [**IntlAutocompletionsWritable**](IntlAutocompletionsWritable.md)|  | |
| **xLangOutput** | **String**| * &#x60;native&#x60; - Translate response to the native language of the country in the request * &#x60;match&#x60; - match the response to the language in the request  Default response is in English.  | [optional] [enum: native, match] |

### Return type

[**IntlAutocompletions**](IntlAutocompletions.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an international autocompletions object. |  * ratelimit-limit -  <br>  * ratelimit-remaining -  <br>  * ratelimit-reset -  <br>  |
| **0** | Error |  -  |


# ReverseGeocodeLookupsApi

All URIs are relative to *https://api.lob.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**usLocationWithLiveApiKey**](ReverseGeocodeLookupsApi.md#usLocationWithLiveApiKey) | **POST** /us_reverse_geocode_lookups | Reverse Geocode Lookup |


<a name="usLocationWithLiveApiKey"></a>
# **usLocationWithLiveApiKey**
> ReverseGeocode usLocationWithLiveApiKey(location).size(size).execute();

Reverse Geocode Lookup

Reverse geocode a valid US location with a live API key.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReverseGeocodeLookupsApi;
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
    Float latitude = 3.4F; // A positive or negative decimal indicating the geographic latitude of the address, specifying the north-to-south position of a location. This should be input with `longitude` to pinpoint locations on a map. 
    Float longitude = 3.4F; // A positive or negative decimal indicating the geographic longitude of the address, specifying the north-to-south position of a location. This should be input with `latitude` to pinpoint locations on a map. 
    Integer size = 5; // Determines the number of locations returned. Possible values are between 1 and 50 and any number higher will be rounded down to 50. Default size is a list of 5 reverse geocoded locations.
    try {
      ReverseGeocode result = client
              .reverseGeocodeLookups
              .usLocationWithLiveApiKey(latitude, longitude)
              .size(size)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getAddresses());
      System.out.println(result.getObject());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReverseGeocodeLookupsApi#usLocationWithLiveApiKey");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReverseGeocode> response = client
              .reverseGeocodeLookups
              .usLocationWithLiveApiKey(latitude, longitude)
              .size(size)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReverseGeocodeLookupsApi#usLocationWithLiveApiKey");
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
| **location** | [**Location**](Location.md)|  | |
| **size** | **Integer**| Determines the number of locations returned. Possible values are between 1 and 50 and any number higher will be rounded down to 50. Default size is a list of 5 reverse geocoded locations. | [optional] [default to 5] |

### Return type

[**ReverseGeocode**](ReverseGeocode.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a zip lookup object if a valid zip was provided. |  * ratelimit-limit -  <br>  * ratelimit-remaining -  <br>  * ratelimit-reset -  <br>  |
| **0** | Error |  -  |


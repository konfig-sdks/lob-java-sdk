# BuckslipsApi

All URIs are relative to *https://api.lob.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](BuckslipsApi.md#create) | **POST** /buckslips | Create |
| [**delete**](BuckslipsApi.md#delete) | **DELETE** /buckslips/{buckslip_id} | Delete |
| [**list**](BuckslipsApi.md#list) | **GET** /buckslips | List |
| [**retrieve**](BuckslipsApi.md#retrieve) | **GET** /buckslips/{buckslip_id} | Retrieve |
| [**update**](BuckslipsApi.md#update) | **PATCH** /buckslips/{buckslip_id} | Update |


<a name="create"></a>
# **create**
> Buckslip create(buckslipEditable).execute();

Create

Creates a new buckslip given information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BuckslipsApi;
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
    String description = "description_example"; // Description of the buckslip.
    String size = "8.75x3.75"; // The size of the buckslip
    Object front = null;
    Object back = null;
    try {
      Buckslip result = client
              .buckslips
              .create()
              .description(description)
              .size(size)
              .front(front)
              .back(back)
              .execute();
      System.out.println(result);
      System.out.println(result.getDateCreated());
      System.out.println(result.getDateModified());
      System.out.println(result.getDeleted());
      System.out.println(result.getObject());
      System.out.println(result.getDescription());
      System.out.println(result.getSize());
      System.out.println(result.getId());
      System.out.println(result.getAutoReorder());
      System.out.println(result.getReorderQuantity());
      System.out.println(result.getThresholdAmount());
      System.out.println(result.getUrl());
      System.out.println(result.getRawUrl());
      System.out.println(result.getFrontOriginalUrl());
      System.out.println(result.getBackOriginalUrl());
      System.out.println(result.getThumbnails());
      System.out.println(result.getAvailableQuantity());
      System.out.println(result.getAllocatedQuantity());
      System.out.println(result.getOnhandQuantity());
      System.out.println(result.getPendingQuantity());
      System.out.println(result.getProjectedQuantity());
      System.out.println(result.getBuckslipOrders());
      System.out.println(result.getStock());
      System.out.println(result.getWeight());
      System.out.println(result.getFinish());
      System.out.println(result.getStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling BuckslipsApi#create");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Buckslip> response = client
              .buckslips
              .create()
              .description(description)
              .size(size)
              .front(front)
              .back(back)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BuckslipsApi#create");
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
| **buckslipEditable** | [**BuckslipEditable**](BuckslipEditable.md)|  | |

### Return type

[**Buckslip**](Buckslip.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Buckslip created successfully |  -  |
| **0** | Error |  -  |

<a name="delete"></a>
# **delete**
> BuckslipDeletion delete(buckslipId).execute();

Delete

Delete an existing buckslip. You need only supply the unique identifier that was returned upon buckslip creation.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BuckslipsApi;
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
    String buckslipId = "buckslipId_example"; // id of the buckslip
    try {
      BuckslipDeletion result = client
              .buckslips
              .delete(buckslipId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDeleted());
    } catch (ApiException e) {
      System.err.println("Exception when calling BuckslipsApi#delete");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BuckslipDeletion> response = client
              .buckslips
              .delete(buckslipId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BuckslipsApi#delete");
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
| **buckslipId** | **String**| id of the buckslip | |

### Return type

[**BuckslipDeletion**](BuckslipDeletion.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Deleted the buckslip |  -  |
| **0** | Error |  -  |

<a name="list"></a>
# **list**
> BuckslipsListResponse list().limit(limit).beforeAfter(beforeAfter).include(include).execute();

List

Returns a list of your buckslips. The buckslips are returned sorted by creation date, with the most recently created buckslips appearing first.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BuckslipsApi;
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
    AddressesListBeforeAfterParameter beforeAfter = new AddressesListBeforeAfterParameter(); // `before` and `after` are both optional but only one of them can be in the query at a time. 
    List<String> include = Arrays.asList(); // Request that the response include the total count by specifying `include=[\"total_count\"]`. 
    try {
      BuckslipsListResponse result = client
              .buckslips
              .list()
              .limit(limit)
              .beforeAfter(beforeAfter)
              .include(include)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getNextUrl());
      System.out.println(result.getPreviousUrl());
      System.out.println(result.getCount());
      System.out.println(result.getTotalCount());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling BuckslipsApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BuckslipsListResponse> response = client
              .buckslips
              .list()
              .limit(limit)
              .beforeAfter(beforeAfter)
              .include(include)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BuckslipsApi#list");
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
| **beforeAfter** | [**AddressesListBeforeAfterParameter**](.md)| &#x60;before&#x60; and &#x60;after&#x60; are both optional but only one of them can be in the query at a time.  | [optional] |
| **include** | [**List&lt;String&gt;**](String.md)| Request that the response include the total count by specifying &#x60;include&#x3D;[\&quot;total_count\&quot;]&#x60;.  | [optional] |

### Return type

[**BuckslipsListResponse**](BuckslipsListResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of buckslip objects |  -  |
| **0** | Error |  -  |

<a name="retrieve"></a>
# **retrieve**
> Buckslip retrieve(buckslipId).execute();

Retrieve

Retrieves the details of an existing buckslip. You need only supply the unique customer identifier that was returned upon buckslip creation.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BuckslipsApi;
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
    String buckslipId = "buckslipId_example"; // id of the buckslip
    try {
      Buckslip result = client
              .buckslips
              .retrieve(buckslipId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDateCreated());
      System.out.println(result.getDateModified());
      System.out.println(result.getDeleted());
      System.out.println(result.getObject());
      System.out.println(result.getDescription());
      System.out.println(result.getSize());
      System.out.println(result.getId());
      System.out.println(result.getAutoReorder());
      System.out.println(result.getReorderQuantity());
      System.out.println(result.getThresholdAmount());
      System.out.println(result.getUrl());
      System.out.println(result.getRawUrl());
      System.out.println(result.getFrontOriginalUrl());
      System.out.println(result.getBackOriginalUrl());
      System.out.println(result.getThumbnails());
      System.out.println(result.getAvailableQuantity());
      System.out.println(result.getAllocatedQuantity());
      System.out.println(result.getOnhandQuantity());
      System.out.println(result.getPendingQuantity());
      System.out.println(result.getProjectedQuantity());
      System.out.println(result.getBuckslipOrders());
      System.out.println(result.getStock());
      System.out.println(result.getWeight());
      System.out.println(result.getFinish());
      System.out.println(result.getStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling BuckslipsApi#retrieve");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Buckslip> response = client
              .buckslips
              .retrieve(buckslipId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BuckslipsApi#retrieve");
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
| **buckslipId** | **String**| id of the buckslip | |

### Return type

[**Buckslip**](Buckslip.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a buckslip object |  -  |
| **0** | Error |  -  |

<a name="update"></a>
# **update**
> Buckslip update(buckslipId, buckslipUpdatable).execute();

Update

Update the details of an existing buckslip. You need only supply the unique identifier that was returned upon buckslip creation.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BuckslipsApi;
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
    String buckslipId = "buckslipId_example"; // id of the buckslip
    String description = "description_example"; // Description of the buckslip.
    Boolean autoReorder = true; // Allows for auto reordering
    Double reorderQuantity = 3.4D; // The quantity of items to be reordered (only required when auto_reorder is true).
    try {
      Buckslip result = client
              .buckslips
              .update(buckslipId)
              .description(description)
              .autoReorder(autoReorder)
              .reorderQuantity(reorderQuantity)
              .execute();
      System.out.println(result);
      System.out.println(result.getDateCreated());
      System.out.println(result.getDateModified());
      System.out.println(result.getDeleted());
      System.out.println(result.getObject());
      System.out.println(result.getDescription());
      System.out.println(result.getSize());
      System.out.println(result.getId());
      System.out.println(result.getAutoReorder());
      System.out.println(result.getReorderQuantity());
      System.out.println(result.getThresholdAmount());
      System.out.println(result.getUrl());
      System.out.println(result.getRawUrl());
      System.out.println(result.getFrontOriginalUrl());
      System.out.println(result.getBackOriginalUrl());
      System.out.println(result.getThumbnails());
      System.out.println(result.getAvailableQuantity());
      System.out.println(result.getAllocatedQuantity());
      System.out.println(result.getOnhandQuantity());
      System.out.println(result.getPendingQuantity());
      System.out.println(result.getProjectedQuantity());
      System.out.println(result.getBuckslipOrders());
      System.out.println(result.getStock());
      System.out.println(result.getWeight());
      System.out.println(result.getFinish());
      System.out.println(result.getStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling BuckslipsApi#update");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Buckslip> response = client
              .buckslips
              .update(buckslipId)
              .description(description)
              .autoReorder(autoReorder)
              .reorderQuantity(reorderQuantity)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BuckslipsApi#update");
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
| **buckslipId** | **String**| id of the buckslip | |
| **buckslipUpdatable** | [**BuckslipUpdatable**](BuckslipUpdatable.md)|  | |

### Return type

[**Buckslip**](Buckslip.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a buckslip object |  -  |
| **0** | Error |  -  |


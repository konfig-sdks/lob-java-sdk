# CardsApi

All URIs are relative to *https://api.lob.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](CardsApi.md#create) | **POST** /cards | Create |
| [**delete**](CardsApi.md#delete) | **DELETE** /cards/{card_id} | Delete |
| [**list**](CardsApi.md#list) | **GET** /cards | List |
| [**retrieve**](CardsApi.md#retrieve) | **GET** /cards/{card_id} | Retrieve |
| [**update**](CardsApi.md#update) | **POST** /cards/{card_id} | Update |


<a name="create"></a>
# **create**
> Card create(cardEditable).execute();

Create

Creates a new card given information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardsApi;
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
    String description = "description_example"; // Description of the card.
    String size = "3.375x2.125"; // The size of the card
    Object front = null;
    Object back = null;
    try {
      Card result = client
              .cards
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
      System.out.println(result.getUrl());
      System.out.println(result.getAutoReorder());
      System.out.println(result.getReorderQuantity());
      System.out.println(result.getRawUrl());
      System.out.println(result.getFrontOriginalUrl());
      System.out.println(result.getBackOriginalUrl());
      System.out.println(result.getThumbnails());
      System.out.println(result.getAvailableQuantity());
      System.out.println(result.getPendingQuantity());
      System.out.println(result.getStatus());
      System.out.println(result.getOrientation());
      System.out.println(result.getThresholdAmount());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardsApi#create");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Card> response = client
              .cards
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
      System.err.println("Exception when calling CardsApi#create");
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
| **cardEditable** | [**CardEditable**](CardEditable.md)|  | |

### Return type

[**Card**](Card.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Card created successfully |  -  |
| **0** | Error |  -  |

<a name="delete"></a>
# **delete**
> CardDeletion delete(cardId).execute();

Delete

Delete an existing card. You need only supply the unique identifier that was returned upon card creation.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardsApi;
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
    String cardId = "cardId_example"; // id of the card
    try {
      CardDeletion result = client
              .cards
              .delete(cardId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDeleted());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardsApi#delete");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CardDeletion> response = client
              .cards
              .delete(cardId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardsApi#delete");
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
| **cardId** | **String**| id of the card | |

### Return type

[**CardDeletion**](CardDeletion.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Deleted the card |  -  |
| **0** | Error |  -  |

<a name="list"></a>
# **list**
> CardsListResponse list().limit(limit).beforeAfter(beforeAfter).include(include).execute();

List

Returns a list of your cards. The cards are returned sorted by creation date, with the most recently created addresses appearing first.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardsApi;
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
      CardsListResponse result = client
              .cards
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
      System.err.println("Exception when calling CardsApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CardsListResponse> response = client
              .cards
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
      System.err.println("Exception when calling CardsApi#list");
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

[**CardsListResponse**](CardsListResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of card objects |  -  |
| **0** | Error |  -  |

<a name="retrieve"></a>
# **retrieve**
> Card retrieve(cardId).execute();

Retrieve

Retrieves the details of an existing card. You need only supply the unique customer identifier that was returned upon card creation.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardsApi;
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
    String cardId = "cardId_example"; // id of the card
    try {
      Card result = client
              .cards
              .retrieve(cardId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDateCreated());
      System.out.println(result.getDateModified());
      System.out.println(result.getDeleted());
      System.out.println(result.getObject());
      System.out.println(result.getDescription());
      System.out.println(result.getSize());
      System.out.println(result.getId());
      System.out.println(result.getUrl());
      System.out.println(result.getAutoReorder());
      System.out.println(result.getReorderQuantity());
      System.out.println(result.getRawUrl());
      System.out.println(result.getFrontOriginalUrl());
      System.out.println(result.getBackOriginalUrl());
      System.out.println(result.getThumbnails());
      System.out.println(result.getAvailableQuantity());
      System.out.println(result.getPendingQuantity());
      System.out.println(result.getStatus());
      System.out.println(result.getOrientation());
      System.out.println(result.getThresholdAmount());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardsApi#retrieve");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Card> response = client
              .cards
              .retrieve(cardId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardsApi#retrieve");
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
| **cardId** | **String**| id of the card | |

### Return type

[**Card**](Card.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a card object |  -  |
| **0** | Error |  -  |

<a name="update"></a>
# **update**
> Card update(cardId, cardUpdatable).execute();

Update

Update the details of an existing card. You need only supply the unique identifier that was returned upon card creation.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardsApi;
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
    String cardId = "cardId_example"; // id of the card
    String description = "description_example"; // Description of the card.
    Boolean autoReorder = true; // Allows for auto reordering
    Double reorderQuantity = 3.4D; // The quantity of items to be reordered (only required when auto_reorder is true).
    try {
      Card result = client
              .cards
              .update(cardId)
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
      System.out.println(result.getUrl());
      System.out.println(result.getAutoReorder());
      System.out.println(result.getReorderQuantity());
      System.out.println(result.getRawUrl());
      System.out.println(result.getFrontOriginalUrl());
      System.out.println(result.getBackOriginalUrl());
      System.out.println(result.getThumbnails());
      System.out.println(result.getAvailableQuantity());
      System.out.println(result.getPendingQuantity());
      System.out.println(result.getStatus());
      System.out.println(result.getOrientation());
      System.out.println(result.getThresholdAmount());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardsApi#update");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Card> response = client
              .cards
              .update(cardId)
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
      System.err.println("Exception when calling CardsApi#update");
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
| **cardId** | **String**| id of the card | |
| **cardUpdatable** | [**CardUpdatable**](CardUpdatable.md)|  | |

### Return type

[**Card**](Card.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a card object |  -  |
| **0** | Error |  -  |


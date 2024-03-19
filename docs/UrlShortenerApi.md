# UrlShortenerApi

All URIs are relative to *https://api.lob.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**bulkShortenLinks**](UrlShortenerApi.md#bulkShortenLinks) | **POST** /links/shorten/bulk | Bulk Create Links |
| [**create**](UrlShortenerApi.md#create) | **POST** /domains | Create Domain |
| [**create_0**](UrlShortenerApi.md#create_0) | **POST** /links/shorten | Create Link |
| [**delete**](UrlShortenerApi.md#delete) | **DELETE** /domains/{domain_id} | Delete a Domain |
| [**deleteAllLinksForDomain**](UrlShortenerApi.md#deleteAllLinksForDomain) | **DELETE** /domains/{domain_id}/links | Delete all links for a domain |
| [**delete_0**](UrlShortenerApi.md#delete_0) | **DELETE** /links/{link_id} | Delete Link |
| [**get**](UrlShortenerApi.md#get) | **GET** /domains/{domain_id} | Retrieve a domain |
| [**get_0**](UrlShortenerApi.md#get_0) | **GET** /links/{link_id} | Retrieve a link |
| [**list**](UrlShortenerApi.md#list) | **GET** /domains | List all domains |
| [**list_0**](UrlShortenerApi.md#list_0) | **GET** /links | Retrieve all shortened links |
| [**update**](UrlShortenerApi.md#update) | **PATCH** /links/{link_id} | Update a Link |


<a name="bulkShortenLinks"></a>
# **bulkShortenLinks**
> LinksResponse bulkShortenLinks(linkSingle).execute();

Bulk Create Links

Shortens a list of links in a single request.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UrlShortenerApi;
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
      LinksResponse result = client
              .urlShortener
              .bulkShortenLinks()
              .execute();
      System.out.println(result);
      System.out.println(result.getCount());
      System.out.println(result.getLimit());
      System.out.println(result.getOffset());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling UrlShortenerApi#bulkShortenLinks");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LinksResponse> response = client
              .urlShortener
              .bulkShortenLinks()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UrlShortenerApi#bulkShortenLinks");
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
| **linkSingle** | [**List&lt;LinkSingle&gt;**](LinkSingle.md)|  | |

### Return type

[**LinksResponse**](LinksResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns all successfully created links |  -  |
| **0** | Error |  -  |

<a name="create"></a>
# **create**
> DomainResponse create(domains).execute();

Create Domain

Add a new custom domain that can be used to create custom links.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UrlShortenerApi;
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
    String domain = "domain_example"; // The registered domain/hostname.
    try {
      DomainResponse result = client
              .urlShortener
              .create(domain)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDomain());
      System.out.println(result.getAccountId());
    } catch (ApiException e) {
      System.err.println("Exception when calling UrlShortenerApi#create");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DomainResponse> response = client
              .urlShortener
              .create(domain)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UrlShortenerApi#create");
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
| **domains** | [**Domains**](Domains.md)|  | |

### Return type

[**DomainResponse**](DomainResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a domain object with details. |  -  |
| **0** | Error |  -  |

<a name="create_0"></a>
# **create_0**
> LinkResponse create_0(linkSingle).execute();

Create Link

Given a long URL, shorten your URL either by using a custom domain or Lob&#39;s own short domain.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UrlShortenerApi;
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
    String redirectLink = "redirectLink_example"; // The original target URL.
    String domain = "domain_example"; // The registered domain to be used for the short URL.
    String slug = "slug_example"; // The unique path for the shortened URL, if empty a unique path will be used.
    Map<String, String> metadataTag = new HashMap(); // Use metadata to store custom information for tagging and labeling back to your internal systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters and values must be at most 500 characters. Neither can contain the characters `\\\"` and `\\\\`. i.e. '{\\\"customer_id\\\" : \\\"NEWYORK2015\\\"}' Nested objects are not supported.  See [Metadata](#section/Metadata) for more information.
    String billingGroupId = "billingGroupId_example"; // An optional string with the billing group ID to tag your usage with. Is used for billing purposes. Requires special activation to use. See <a href=\\\"#tag/Billing-Groups\\\">Billing Group API</a> for more information.
    try {
      LinkResponse result = client
              .urlShortener
              .create_0(redirectLink)
              .domain(domain)
              .slug(slug)
              .metadataTag(metadataTag)
              .billingGroupId(billingGroupId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCampaignId());
      System.out.println(result.getDomainId());
      System.out.println(result.getResourceId());
      System.out.println(result.getRedirectLink());
      System.out.println(result.getShortLink());
      System.out.println(result.getMetadataTag());
      System.out.println(result.getBillingGroupId());
    } catch (ApiException e) {
      System.err.println("Exception when calling UrlShortenerApi#create_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LinkResponse> response = client
              .urlShortener
              .create_0(redirectLink)
              .domain(domain)
              .slug(slug)
              .metadataTag(metadataTag)
              .billingGroupId(billingGroupId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UrlShortenerApi#create_0");
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
| **linkSingle** | [**LinkSingle**](LinkSingle.md)|  | |

### Return type

[**LinkResponse**](LinkResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a successfully created link. |  -  |
| **0** | Error |  -  |

<a name="delete"></a>
# **delete**
> DomainResponse delete(domainId).execute();

Delete a Domain

Delete a registered domain. This operation can only be performed if all associated links with the domain are deleted.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UrlShortenerApi;
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
    String domainId = "domainId_example"; // Unique identifier for a domain.
    try {
      DomainResponse result = client
              .urlShortener
              .delete(domainId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDomain());
      System.out.println(result.getAccountId());
    } catch (ApiException e) {
      System.err.println("Exception when calling UrlShortenerApi#delete");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DomainResponse> response = client
              .urlShortener
              .delete(domainId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UrlShortenerApi#delete");
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
| **domainId** | **String**| Unique identifier for a domain. | |

### Return type

[**DomainResponse**](DomainResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the deleted link object. |  -  |
| **0** | Error |  -  |

<a name="deleteAllLinksForDomain"></a>
# **deleteAllLinksForDomain**
> DomainsResponse deleteAllLinksForDomain(domainId).execute();

Delete all links for a domain

Delete all associated links for a domain

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UrlShortenerApi;
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
    String domainId = "domainId_example"; // Unique identifier for a domain.
    try {
      DomainsResponse result = client
              .urlShortener
              .deleteAllLinksForDomain(domainId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling UrlShortenerApi#deleteAllLinksForDomain");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DomainsResponse> response = client
              .urlShortener
              .deleteAllLinksForDomain(domainId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UrlShortenerApi#deleteAllLinksForDomain");
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
| **domainId** | **String**| Unique identifier for a domain. | |

### Return type

[**DomainsResponse**](DomainsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the deleted objects. |  -  |
| **0** | Error |  -  |

<a name="delete_0"></a>
# **delete_0**
> LinkResponse delete_0(linkId).execute();

Delete Link

Delete the shortened link.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UrlShortenerApi;
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
    String linkId = "linkId_example"; // Unique identifier for a link.
    try {
      LinkResponse result = client
              .urlShortener
              .delete_0(linkId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCampaignId());
      System.out.println(result.getDomainId());
      System.out.println(result.getResourceId());
      System.out.println(result.getRedirectLink());
      System.out.println(result.getShortLink());
      System.out.println(result.getMetadataTag());
      System.out.println(result.getBillingGroupId());
    } catch (ApiException e) {
      System.err.println("Exception when calling UrlShortenerApi#delete_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LinkResponse> response = client
              .urlShortener
              .delete_0(linkId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UrlShortenerApi#delete_0");
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
| **linkId** | **String**| Unique identifier for a link. | |

### Return type

[**LinkResponse**](LinkResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the deleted short link object |  -  |
| **0** | Error |  -  |

<a name="get"></a>
# **get**
> DomainResponse get(domainId).execute();

Retrieve a domain

Retrieve details for a single domain.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UrlShortenerApi;
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
    String domainId = "domainId_example"; // Unique identifier for a domain.
    try {
      DomainResponse result = client
              .urlShortener
              .get(domainId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDomain());
      System.out.println(result.getAccountId());
    } catch (ApiException e) {
      System.err.println("Exception when calling UrlShortenerApi#get");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DomainResponse> response = client
              .urlShortener
              .get(domainId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UrlShortenerApi#get");
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
| **domainId** | **String**| Unique identifier for a domain. | |

### Return type

[**DomainResponse**](DomainResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns domain related details. |  -  |
| **0** | Error |  -  |

<a name="get_0"></a>
# **get_0**
> LinkResponse get_0(linkId).execute();

Retrieve a link

Retrievs a single shortened link.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UrlShortenerApi;
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
    String linkId = "linkId_example"; // Unique identifier for a link.
    try {
      LinkResponse result = client
              .urlShortener
              .get_0(linkId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCampaignId());
      System.out.println(result.getDomainId());
      System.out.println(result.getResourceId());
      System.out.println(result.getRedirectLink());
      System.out.println(result.getShortLink());
      System.out.println(result.getMetadataTag());
      System.out.println(result.getBillingGroupId());
    } catch (ApiException e) {
      System.err.println("Exception when calling UrlShortenerApi#get_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LinkResponse> response = client
              .urlShortener
              .get_0(linkId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UrlShortenerApi#get_0");
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
| **linkId** | **String**| Unique identifier for a link. | |

### Return type

[**LinkResponse**](LinkResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single link. |  -  |
| **0** | Error |  -  |

<a name="list"></a>
# **list**
> DomainsResponse list().execute();

List all domains

Retrieve a list of all created domains.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UrlShortenerApi;
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
      DomainsResponse result = client
              .urlShortener
              .list()
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling UrlShortenerApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DomainsResponse> response = client
              .urlShortener
              .list()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UrlShortenerApi#list");
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

[**DomainsResponse**](DomainsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of all domains. |  -  |
| **0** | Error |  -  |

<a name="list_0"></a>
# **list_0**
> LinksResponse list_0().limit(limit).offset(offset).include(include).dateCreated(dateCreated).metadata(metadata).campaignId(campaignId).clicked(clicked).billingGroupId(billingGroupId).execute();

Retrieve all shortened links

Retrieves a list of shortened links. The list is sorted by  creation date, with the most recently created appearing first.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UrlShortenerApi;
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
    Map<String, String> metadata = new HashMap(); // Filter by metadata key-value pair`.
    String campaignId = "campaignId_example"; // Filter the links generated for a particular campaign using its campaign id.
    Boolean clicked = true; // Retrieve the list of links that have been opened.
    String billingGroupId = "billingGroupId_example"; // Filter the links generated for a particular billing group id.
    try {
      LinksResponse result = client
              .urlShortener
              .list_0()
              .limit(limit)
              .offset(offset)
              .include(include)
              .dateCreated(dateCreated)
              .metadata(metadata)
              .campaignId(campaignId)
              .clicked(clicked)
              .billingGroupId(billingGroupId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCount());
      System.out.println(result.getLimit());
      System.out.println(result.getOffset());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling UrlShortenerApi#list_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LinksResponse> response = client
              .urlShortener
              .list_0()
              .limit(limit)
              .offset(offset)
              .include(include)
              .dateCreated(dateCreated)
              .metadata(metadata)
              .campaignId(campaignId)
              .clicked(clicked)
              .billingGroupId(billingGroupId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UrlShortenerApi#list_0");
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
| **metadata** | [**Map&lt;String, String&gt;**](String.md)| Filter by metadata key-value pair&#x60;. | [optional] |
| **campaignId** | **String**| Filter the links generated for a particular campaign using its campaign id. | [optional] |
| **clicked** | **Boolean**| Retrieve the list of links that have been opened. | [optional] |
| **billingGroupId** | **String**| Filter the links generated for a particular billing group id. | [optional] |

### Return type

[**LinksResponse**](LinksResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the deleted link object. |  -  |
| **0** | Error |  -  |

<a name="update"></a>
# **update**
> LinkResponse update(linkId, linkSingle).execute();

Update a Link

Update any of the properties of a shortened link.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UrlShortenerApi;
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
    String redirectLink = "redirectLink_example"; // The original target URL.
    String linkId = "linkId_example"; // Unique identifier for a link.
    String domain = "domain_example"; // The registered domain to be used for the short URL.
    String slug = "slug_example"; // The unique path for the shortened URL, if empty a unique path will be used.
    Map<String, String> metadataTag = new HashMap(); // Use metadata to store custom information for tagging and labeling back to your internal systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters and values must be at most 500 characters. Neither can contain the characters `\\\"` and `\\\\`. i.e. '{\\\"customer_id\\\" : \\\"NEWYORK2015\\\"}' Nested objects are not supported.  See [Metadata](#section/Metadata) for more information.
    String billingGroupId = "billingGroupId_example"; // An optional string with the billing group ID to tag your usage with. Is used for billing purposes. Requires special activation to use. See <a href=\\\"#tag/Billing-Groups\\\">Billing Group API</a> for more information.
    try {
      LinkResponse result = client
              .urlShortener
              .update(redirectLink, linkId)
              .domain(domain)
              .slug(slug)
              .metadataTag(metadataTag)
              .billingGroupId(billingGroupId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCampaignId());
      System.out.println(result.getDomainId());
      System.out.println(result.getResourceId());
      System.out.println(result.getRedirectLink());
      System.out.println(result.getShortLink());
      System.out.println(result.getMetadataTag());
      System.out.println(result.getBillingGroupId());
    } catch (ApiException e) {
      System.err.println("Exception when calling UrlShortenerApi#update");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LinkResponse> response = client
              .urlShortener
              .update(redirectLink, linkId)
              .domain(domain)
              .slug(slug)
              .metadataTag(metadataTag)
              .billingGroupId(billingGroupId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UrlShortenerApi#update");
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
| **linkId** | **String**| Unique identifier for a link. | |
| **linkSingle** | [**LinkSingle**](LinkSingle.md)|  | |

### Return type

[**LinkResponse**](LinkResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the updated link. |  -  |
| **0** | Error |  -  |


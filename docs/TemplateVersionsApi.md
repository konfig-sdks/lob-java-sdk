# TemplateVersionsApi

All URIs are relative to *https://api.lob.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewVersion**](TemplateVersionsApi.md#createNewVersion) | **POST** /templates/{tmpl_id}/versions | Create |
| [**deleteVersion**](TemplateVersionsApi.md#deleteVersion) | **DELETE** /templates/{tmpl_id}/versions/{vrsn_id} | Delete |
| [**get**](TemplateVersionsApi.md#get) | **GET** /templates/{tmpl_id}/versions/{vrsn_id} | Retrieve |
| [**getList**](TemplateVersionsApi.md#getList) | **GET** /templates/{tmpl_id}/versions | List |
| [**updateTemplateVersion**](TemplateVersionsApi.md#updateTemplateVersion) | **POST** /templates/{tmpl_id}/versions/{vrsn_id} | Update |


<a name="createNewVersion"></a>
# **createNewVersion**
> TemplateVersion createNewVersion(tmplId, templateVersionWritable).execute();

Create

Creates a new template version attached to the specified template.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TemplateVersionsApi;
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
    String html = "html_example"; // An HTML string of less than 100,000 characters to be used as the `published_version` of this template. See [here](#section/HTML-Examples) for guidance on designing HTML templates. Please see endpoint specific documentation for any other product-specific HTML details: - [Postcards](#operation/postcard_create) - `front` and `back` - [Self Mailers](#operation/self_mailer_create) - `inside` and `outside` - [Letters](#operation/letter_create) - `file` - [Checks](#operation/check_create) - `check_bottom` and `attachment` - [Cards](#operation/card_create) - `front` and `back`  If there is a syntax error with your variable names within your HTML, then an error will be thrown, e.g. using a `{{#users}}` opening tag without the corresponding closing tag `{{/users}}`. 
    String tmplId = "tmplId_example"; // The ID of the template the new version will be attached to
    String description = "description_example"; // An internal description that identifies this resource. Must be no longer than 255 characters. 
    Engine engine = Engine.fromValue("legacy");
    List<String> requiredVars = Arrays.asList(); // An array of required variables to be used in a template. Only available for `handlebars` templates. 
    try {
      TemplateVersion result = client
              .templateVersions
              .createNewVersion(html, tmplId)
              .description(description)
              .engine(engine)
              .requiredVars(requiredVars)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getHtml());
      System.out.println(result.getEngine());
      System.out.println(result.getRequiredVars());
      System.out.println(result.getDateCreated());
      System.out.println(result.getDateModified());
      System.out.println(result.getDeleted());
      System.out.println(result.getObject());
      System.out.println(result.getId());
      System.out.println(result.getSuggestJsonEditor());
      System.out.println(result.getMergeVariables());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateVersionsApi#createNewVersion");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TemplateVersion> response = client
              .templateVersions
              .createNewVersion(html, tmplId)
              .description(description)
              .engine(engine)
              .requiredVars(requiredVars)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateVersionsApi#createNewVersion");
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
| **tmplId** | **String**| The ID of the template the new version will be attached to | |
| **templateVersionWritable** | [**TemplateVersionWritable**](TemplateVersionWritable.md)|  | |

### Return type

[**TemplateVersion**](TemplateVersion.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the template version with the given template and version ids. |  * ratelimit-limit -  <br>  * ratelimit-remaining -  <br>  * ratelimit-reset -  <br>  |
| **0** | Error |  -  |

<a name="deleteVersion"></a>
# **deleteVersion**
> TemplateVersionDeletion deleteVersion(tmplId, vrsnId).execute();

Delete

Permanently deletes a template version. A template&#39;s &#x60;published_version&#x60; can not be deleted.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TemplateVersionsApi;
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
    String tmplId = "tmplId_example"; // The ID of the template to which the version belongs.
    String vrsnId = "vrsnId_example"; // id of the template_version
    try {
      TemplateVersionDeletion result = client
              .templateVersions
              .deleteVersion(tmplId, vrsnId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDeleted());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateVersionsApi#deleteVersion");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TemplateVersionDeletion> response = client
              .templateVersions
              .deleteVersion(tmplId, vrsnId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateVersionsApi#deleteVersion");
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
| **tmplId** | **String**| The ID of the template to which the version belongs. | |
| **vrsnId** | **String**| id of the template_version | |

### Return type

[**TemplateVersionDeletion**](TemplateVersionDeletion.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Deleted |  -  |
| **0** | Error |  -  |

<a name="get"></a>
# **get**
> TemplateVersion get(tmplId, vrsnId).execute();

Retrieve

Retrieves the template version with the given template and version ids.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TemplateVersionsApi;
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
    String tmplId = "tmplId_example"; // The ID of the template to which the version belongs.
    String vrsnId = "vrsnId_example"; // id of the template_version
    try {
      TemplateVersion result = client
              .templateVersions
              .get(tmplId, vrsnId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getHtml());
      System.out.println(result.getEngine());
      System.out.println(result.getRequiredVars());
      System.out.println(result.getDateCreated());
      System.out.println(result.getDateModified());
      System.out.println(result.getDeleted());
      System.out.println(result.getObject());
      System.out.println(result.getId());
      System.out.println(result.getSuggestJsonEditor());
      System.out.println(result.getMergeVariables());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateVersionsApi#get");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TemplateVersion> response = client
              .templateVersions
              .get(tmplId, vrsnId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateVersionsApi#get");
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
| **tmplId** | **String**| The ID of the template to which the version belongs. | |
| **vrsnId** | **String**| id of the template_version | |

### Return type

[**TemplateVersion**](TemplateVersion.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the template version with the given template and version ids. |  -  |
| **0** | Error |  -  |

<a name="getList"></a>
# **getList**
> TemplateVersionsGetListResponse getList(tmplId).limit(limit).beforeAfter(beforeAfter).include(include).dateCreated(dateCreated).execute();

List

Returns a list of template versions for the given template ID. The template versions are sorted by creation date, with the most recently created appearing first. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TemplateVersionsApi;
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
    String tmplId = "tmplId_example"; // The ID of the template associated with the retrieved versions
    Integer limit = 10; // How many results to return.
    AddressesListBeforeAfterParameter beforeAfter = new AddressesListBeforeAfterParameter(); // `before` and `after` are both optional but only one of them can be in the query at a time. 
    List<String> include = Arrays.asList(); // Request that the response include the total count by specifying `include=[\"total_count\"]`. 
    Map<String, String> dateCreated = new HashMap(); // Filter by date created. Accepted formats are ISO-8601 date or datetime, e.g. `{ \"gt\": \"2012-01-01\", \"lt\": \"2012-01-31T12:34:56Z\" }` where `gt` is >, `lt` is <, `gte` is ≥, and `lte` is ≤.
    try {
      TemplateVersionsGetListResponse result = client
              .templateVersions
              .getList(tmplId)
              .limit(limit)
              .beforeAfter(beforeAfter)
              .include(include)
              .dateCreated(dateCreated)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getNextUrl());
      System.out.println(result.getPreviousUrl());
      System.out.println(result.getCount());
      System.out.println(result.getTotalCount());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateVersionsApi#getList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TemplateVersionsGetListResponse> response = client
              .templateVersions
              .getList(tmplId)
              .limit(limit)
              .beforeAfter(beforeAfter)
              .include(include)
              .dateCreated(dateCreated)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateVersionsApi#getList");
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
| **tmplId** | **String**| The ID of the template associated with the retrieved versions | |
| **limit** | **Integer**| How many results to return. | [optional] [default to 10] |
| **beforeAfter** | [**AddressesListBeforeAfterParameter**](.md)| &#x60;before&#x60; and &#x60;after&#x60; are both optional but only one of them can be in the query at a time.  | [optional] |
| **include** | [**List&lt;String&gt;**](String.md)| Request that the response include the total count by specifying &#x60;include&#x3D;[\&quot;total_count\&quot;]&#x60;.  | [optional] |
| **dateCreated** | [**Map&lt;String, String&gt;**](String.md)| Filter by date created. Accepted formats are ISO-8601 date or datetime, e.g. &#x60;{ \&quot;gt\&quot;: \&quot;2012-01-01\&quot;, \&quot;lt\&quot;: \&quot;2012-01-31T12:34:56Z\&quot; }&#x60; where &#x60;gt&#x60; is &gt;, &#x60;lt&#x60; is &lt;, &#x60;gte&#x60; is ≥, and &#x60;lte&#x60; is ≤. | [optional] |

### Return type

[**TemplateVersionsGetListResponse**](TemplateVersionsGetListResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A dictionary with a data property that contains an array of up to &#x60;limit&#x60; template versions. Each entry in the array is a separate template version object. The previous and next page of template versions can be retrieved by calling the endpoint contained in the &#x60;previous_url&#x60; and &#x60;next_url&#x60; fields in the API response respectively.&lt;br&gt;If no more template versions are available beyond the current set of returned results, the &#x60;next_url&#x60; field will be empty. |  -  |
| **0** | Error |  -  |

<a name="updateTemplateVersion"></a>
# **updateTemplateVersion**
> TemplateVersion updateTemplateVersion(tmplId, vrsnId, templateVersionUpdatable).execute();

Update

Updates the template version with the given template and version ids.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TemplateVersionsApi;
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
    String tmplId = "tmplId_example"; // The ID of the template to which the version belongs.
    String vrsnId = "vrsnId_example"; // id of the template_version
    String description = "description_example"; // An internal description that identifies this resource. Must be no longer than 255 characters. 
    Engine engine = Engine.fromValue("legacy");
    List<String> requiredVars = Arrays.asList(); // An array of required variables to be used in a template. Only available for `handlebars` templates. 
    try {
      TemplateVersion result = client
              .templateVersions
              .updateTemplateVersion(tmplId, vrsnId)
              .description(description)
              .engine(engine)
              .requiredVars(requiredVars)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getHtml());
      System.out.println(result.getEngine());
      System.out.println(result.getRequiredVars());
      System.out.println(result.getDateCreated());
      System.out.println(result.getDateModified());
      System.out.println(result.getDeleted());
      System.out.println(result.getObject());
      System.out.println(result.getId());
      System.out.println(result.getSuggestJsonEditor());
      System.out.println(result.getMergeVariables());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateVersionsApi#updateTemplateVersion");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TemplateVersion> response = client
              .templateVersions
              .updateTemplateVersion(tmplId, vrsnId)
              .description(description)
              .engine(engine)
              .requiredVars(requiredVars)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateVersionsApi#updateTemplateVersion");
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
| **tmplId** | **String**| The ID of the template to which the version belongs. | |
| **vrsnId** | **String**| id of the template_version | |
| **templateVersionUpdatable** | [**TemplateVersionUpdatable**](TemplateVersionUpdatable.md)|  | |

### Return type

[**TemplateVersion**](TemplateVersion.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the template version with the given template and version ids. |  * ratelimit-limit -  <br>  * ratelimit-remaining -  <br>  * ratelimit-reset -  <br>  |
| **0** | Error |  -  |


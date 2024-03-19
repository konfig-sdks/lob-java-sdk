# ChecksApi

All URIs are relative to *https://api.lob.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancel**](ChecksApi.md#cancel) | **DELETE** /checks/{chk_id} | Cancel |
| [**create**](ChecksApi.md#create) | **POST** /checks | Create |
| [**list**](ChecksApi.md#list) | **GET** /checks | List |
| [**retrieve**](ChecksApi.md#retrieve) | **GET** /checks/{chk_id} | Retrieve |


<a name="cancel"></a>
# **cancel**
> CheckDeletion cancel(chkId).execute();

Cancel

Completely removes a check from production. This can only be done if the check has a &#x60;send_date&#x60; and the &#x60;send_date&#x60; has not yet passed. If the check is successfully canceled, you will not be charged for it. Read more on [cancellation windows](#section/Cancellation-Windows) and [scheduling](#section/Scheduled-Mailings). Scheduling and cancellation is a premium feature. Upgrade to the appropriate &lt;a href&#x3D;\&quot;https://dashboard.lob.com/#/settings/editions\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Print &amp; Mail Edition&lt;/a&gt; to gain access.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChecksApi;
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
    String chkId = "chkId_example"; // id of the check
    try {
      CheckDeletion result = client
              .checks
              .cancel(chkId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDeleted());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChecksApi#cancel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CheckDeletion> response = client
              .checks
              .cancel(chkId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChecksApi#cancel");
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
| **chkId** | **String**| id of the check | |

### Return type

[**CheckDeletion**](CheckDeletion.md)

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

<a name="create"></a>
# **create**
> Check create(body).idempotencyKey(idempotencyKey).idempotencyKey2(idempotencyKey2).execute();

Create

Creates a new check with the provided properties.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChecksApi;
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
    String idempotencyKey = "026e7634-24d7-486c-a0bb-4a17fd0eebc5"; // A string of no longer than 256 characters that uniquely identifies this resource. For more help integrating idempotency keys, refer to our <a href=\"https://help.lob.com/print-and-mail/building-a-mail-strategy/managing-mail-settings#idempotent-requests-12\" target=\"_blank\">implementation guide</a>. 
    String idempotencyKey2 = "026e7634-24d7-486c-a0bb-4a17fd0eebc5"; // A string of no longer than 256 characters that uniquely identifies this resource. For more help integrating idempotency keys, refer to our <a href=\"https://help.lob.com/print-and-mail/building-a-mail-strategy/managing-mail-settings#idempotent-requests-12\" target=\"_blank\">implementation guide</a>. 
    try {
      Check result = client
              .checks
              .create()
              .idempotencyKey(idempotencyKey)
              .idempotencyKey2(idempotencyKey2)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getMetadata());
      System.out.println(result.getMergeVariables());
      System.out.println(result.getSendDate());
      System.out.println(result.getMailType());
      System.out.println(result.getMemo());
      System.out.println(result.getCheckNumber());
      System.out.println(result.getMessage());
      System.out.println(result.getUseType());
      System.out.println(result.getFrom());
      System.out.println(result.getId());
      System.out.println(result.getAmount());
      System.out.println(result.getBankAccount());
      System.out.println(result.getCheckBottomTemplateId());
      System.out.println(result.getAttachmentTemplateId());
      System.out.println(result.getCheckBottomTemplateVersionId());
      System.out.println(result.getAttachmentTemplateVersionId());
      System.out.println(result.getUrl());
      System.out.println(result.getTo());
      System.out.println(result.getCarrier());
      System.out.println(result.getThumbnails());
      System.out.println(result.getExpectedDeliveryDate());
      System.out.println(result.getTrackingEvents());
      System.out.println(result.getStatus());
      System.out.println(result.getFailureReason());
      System.out.println(result.getObject());
      System.out.println(result.getDateCreated());
      System.out.println(result.getDateModified());
      System.out.println(result.getDeleted());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChecksApi#create");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Check> response = client
              .checks
              .create()
              .idempotencyKey(idempotencyKey)
              .idempotencyKey2(idempotencyKey2)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChecksApi#create");
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
| **idempotencyKey** | **String**| A string of no longer than 256 characters that uniquely identifies this resource. For more help integrating idempotency keys, refer to our &lt;a href&#x3D;\&quot;https://help.lob.com/print-and-mail/building-a-mail-strategy/managing-mail-settings#idempotent-requests-12\&quot; target&#x3D;\&quot;_blank\&quot;&gt;implementation guide&lt;/a&gt;.  | [optional] |
| **idempotencyKey2** | **String**| A string of no longer than 256 characters that uniquely identifies this resource. For more help integrating idempotency keys, refer to our &lt;a href&#x3D;\&quot;https://help.lob.com/print-and-mail/building-a-mail-strategy/managing-mail-settings#idempotent-requests-12\&quot; target&#x3D;\&quot;_blank\&quot;&gt;implementation guide&lt;/a&gt;.  | [optional] |

### Return type

[**Check**](Check.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a check object |  * ratelimit-limit -  <br>  * ratelimit-remaining -  <br>  * ratelimit-reset -  <br>  |
| **0** | Error |  -  |

<a name="list"></a>
# **list**
> ChecksListResponse list().limit(limit).beforeAfter(beforeAfter).include(include).dateCreated(dateCreated).metadata(metadata).scheduled(scheduled).sendDate(sendDate).mailType(mailType).sortBy(sortBy).status(status).execute();

List

Returns a list of your checks. The checks are returned sorted by creation date, with the most recently created checks appearing first.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChecksApi;
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
    Map<String, String> dateCreated = new HashMap(); // Filter by date created. Accepted formats are ISO-8601 date or datetime, e.g. `{ \"gt\": \"2012-01-01\", \"lt\": \"2012-01-31T12:34:56Z\" }` where `gt` is >, `lt` is <, `gte` is ≥, and `lte` is ≤.
    Map<String, String> metadata = new HashMap(); // Filter by metadata key-value pair`.
    Boolean scheduled = true; // * `true` - only return orders (past or future) where `send_date` is greater than `date_created` * `false` - only return orders where `send_date` is equal to `date_created` 
    Object sendDate = null; // Filter by ISO-8601 date or datetime, e.g. `{ \"gt\": \"2012-01-01\", \"lt\": \"2012-01-31T12:34:56Z\" }` where `gt` is >, `lt` is <, `gte` is ≥, and `lte` is ≤. 
    MailType mailType = MailType.fromValue("usps_first_class"); // A string designating the mail postage type: * `usps_first_class` - (default) * `usps_standard` - a <a href=\"https://lob.com/pricing/print-mail#compare\" target=\"_blank\">cheaper option</a> which is less predictable and takes longer to deliver. `usps_standard` cannot be used with `4x6` postcards or for any postcards sent outside of the United States. 
    ChecksListSortByParameter sortBy = new ChecksListSortByParameter(); // Sorts items by ascending or descending dates. Use either `date_created` or `send_date`, not both. 
    Status status = Status.fromValue("processed"); // A string describing the render status: * `processed` - the rendering process is currently underway. * `rendered` - the rendering process has completed successfully. * `failed` - the rendering process has failed. 
    try {
      ChecksListResponse result = client
              .checks
              .list()
              .limit(limit)
              .beforeAfter(beforeAfter)
              .include(include)
              .dateCreated(dateCreated)
              .metadata(metadata)
              .scheduled(scheduled)
              .sendDate(sendDate)
              .mailType(mailType)
              .sortBy(sortBy)
              .status(status)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getNextUrl());
      System.out.println(result.getPreviousUrl());
      System.out.println(result.getCount());
      System.out.println(result.getTotalCount());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChecksApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ChecksListResponse> response = client
              .checks
              .list()
              .limit(limit)
              .beforeAfter(beforeAfter)
              .include(include)
              .dateCreated(dateCreated)
              .metadata(metadata)
              .scheduled(scheduled)
              .sendDate(sendDate)
              .mailType(mailType)
              .sortBy(sortBy)
              .status(status)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChecksApi#list");
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
| **dateCreated** | [**Map&lt;String, String&gt;**](String.md)| Filter by date created. Accepted formats are ISO-8601 date or datetime, e.g. &#x60;{ \&quot;gt\&quot;: \&quot;2012-01-01\&quot;, \&quot;lt\&quot;: \&quot;2012-01-31T12:34:56Z\&quot; }&#x60; where &#x60;gt&#x60; is &gt;, &#x60;lt&#x60; is &lt;, &#x60;gte&#x60; is ≥, and &#x60;lte&#x60; is ≤. | [optional] |
| **metadata** | [**Map&lt;String, String&gt;**](String.md)| Filter by metadata key-value pair&#x60;. | [optional] |
| **scheduled** | **Boolean**| * &#x60;true&#x60; - only return orders (past or future) where &#x60;send_date&#x60; is greater than &#x60;date_created&#x60; * &#x60;false&#x60; - only return orders where &#x60;send_date&#x60; is equal to &#x60;date_created&#x60;  | [optional] |
| **sendDate** | [**Object**](.md)| Filter by ISO-8601 date or datetime, e.g. &#x60;{ \&quot;gt\&quot;: \&quot;2012-01-01\&quot;, \&quot;lt\&quot;: \&quot;2012-01-31T12:34:56Z\&quot; }&#x60; where &#x60;gt&#x60; is &gt;, &#x60;lt&#x60; is &lt;, &#x60;gte&#x60; is ≥, and &#x60;lte&#x60; is ≤.  | [optional] |
| **mailType** | [**MailType**](.md)| A string designating the mail postage type: * &#x60;usps_first_class&#x60; - (default) * &#x60;usps_standard&#x60; - a &lt;a href&#x3D;\&quot;https://lob.com/pricing/print-mail#compare\&quot; target&#x3D;\&quot;_blank\&quot;&gt;cheaper option&lt;/a&gt; which is less predictable and takes longer to deliver. &#x60;usps_standard&#x60; cannot be used with &#x60;4x6&#x60; postcards or for any postcards sent outside of the United States.  | [optional] [default to usps_first_class] [enum: usps_first_class, usps_standard] |
| **sortBy** | [**ChecksListSortByParameter**](.md)| Sorts items by ascending or descending dates. Use either &#x60;date_created&#x60; or &#x60;send_date&#x60;, not both.  | [optional] |
| **status** | [**Status**](.md)| A string describing the render status: * &#x60;processed&#x60; - the rendering process is currently underway. * &#x60;rendered&#x60; - the rendering process has completed successfully. * &#x60;failed&#x60; - the rendering process has failed.  | [optional] [enum: processed, rendered, failed] |

### Return type

[**ChecksListResponse**](ChecksListResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A dictionary with a data property that contains an array of up to &#x60;limit&#x60; checks. Each entry in the array is a separate check. The previous and next page of checks can be retrieved by calling the endpoint contained in the &#x60;previous_url&#x60; and &#x60;next_url&#x60; fields in the API response respectively.&lt;br&gt;If no more checks are available beyond the current set of returned results, the &#x60;next_url&#x60; field will be empty. |  -  |
| **0** | Error |  -  |

<a name="retrieve"></a>
# **retrieve**
> Check retrieve(chkId).execute();

Retrieve

Retrieves the details of an existing check. You need only supply the unique check identifier that was returned upon check creation.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChecksApi;
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
    String chkId = "chkId_example"; // id of the check
    try {
      Check result = client
              .checks
              .retrieve(chkId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getMetadata());
      System.out.println(result.getMergeVariables());
      System.out.println(result.getSendDate());
      System.out.println(result.getMailType());
      System.out.println(result.getMemo());
      System.out.println(result.getCheckNumber());
      System.out.println(result.getMessage());
      System.out.println(result.getUseType());
      System.out.println(result.getFrom());
      System.out.println(result.getId());
      System.out.println(result.getAmount());
      System.out.println(result.getBankAccount());
      System.out.println(result.getCheckBottomTemplateId());
      System.out.println(result.getAttachmentTemplateId());
      System.out.println(result.getCheckBottomTemplateVersionId());
      System.out.println(result.getAttachmentTemplateVersionId());
      System.out.println(result.getUrl());
      System.out.println(result.getTo());
      System.out.println(result.getCarrier());
      System.out.println(result.getThumbnails());
      System.out.println(result.getExpectedDeliveryDate());
      System.out.println(result.getTrackingEvents());
      System.out.println(result.getStatus());
      System.out.println(result.getFailureReason());
      System.out.println(result.getObject());
      System.out.println(result.getDateCreated());
      System.out.println(result.getDateModified());
      System.out.println(result.getDeleted());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChecksApi#retrieve");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Check> response = client
              .checks
              .retrieve(chkId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChecksApi#retrieve");
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
| **chkId** | **String**| id of the check | |

### Return type

[**Check**](Check.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a check object |  -  |
| **0** | Error |  -  |


# SelfMailersApi

All URIs are relative to *https://api.lob.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewSelfMailer**](SelfMailersApi.md#createNewSelfMailer) | **POST** /self_mailers | Create |
| [**getDetails**](SelfMailersApi.md#getDetails) | **GET** /self_mailers/{sfm_id} | Retrieve |
| [**getList**](SelfMailersApi.md#getList) | **GET** /self_mailers | List |
| [**removeSelfMailer**](SelfMailersApi.md#removeSelfMailer) | **DELETE** /self_mailers/{sfm_id} | Delete |


<a name="createNewSelfMailer"></a>
# **createNewSelfMailer**
> SelfMailer createNewSelfMailer(selfMailerEditable).idempotencyKey(idempotencyKey).idempotencyKey2(idempotencyKey2).execute();

Create

Creates a new self_mailer given information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SelfMailersApi;
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
    String description = "description_example"; // An internal description that identifies this resource. Must be no longer than 255 characters. 
    Map<String, String> metadata = new HashMap(); // Use metadata to store custom information for tagging and labeling back to your internal systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters and values must be at most 500 characters. Neither can contain the characters `\\\"` and `\\\\`. i.e. '{\\\"customer_id\\\" : \\\"NEWYORK2015\\\"}' Nested objects are not supported.  See [Metadata](#section/Metadata) for more information.
    MailType mailType = MailType.fromValue("usps_first_class");
    String mergeVariables = new HashMap(); // You can input a merge variable payload object to your template to render dynamic content. For example, if you have a template like: `{{variable_name}}`, pass in `{\\\"variable_name\\\": \\\"Harry\\\"}` to render `Harry`. `merge_variables` must be an object. Any type of value is accepted as long as the object is valid JSON; you can use `strings`, `numbers`, `booleans`, `arrays`, `objects`, or `null`. The max length of the object is 25,000 characters. If you call `JSON.stringify` on your object, it can be no longer than 25,000 characters. Your variable names cannot contain any whitespace or any of the following special characters: `!`, `\\\"`, `#`, `%`, `&`, `'`, `(`, `)`, `*`, `+`, `,`, `/`, `;`, `<`, `=`, `>`, `@`, `[`, `\\\\`, `]`, `^`, `` ` ``, `{`, `|`, `}`, `~`. More instructions can be found in <a href=\\\"https://help.lob.com/print-and-mail/designing-mail-creatives/dynamic-personalization#using-html-and-merge-variables-10\\\" target=\\\"_blank\\\">our guide to using html and merge variables</a>. Depending on your <a href=\\\"https://dashboard.lob.com/#/settings/account\\\" target=\\\"_blank\\\">Merge Variable strictness</a> setting, if you define variables in your HTML but do not pass them here, you will either receive an error or the variable will render as an empty string.
    Object sendDate = null;
    SelfMailerSize size = SelfMailerSize.fromValue("6x18_bifold");
    Object to = null;
    Object from = null;
    Object inside = null;
    Object outside = null;
    String billingGroupId = "billingGroupId_example"; // An optional string with the billing group ID to tag your usage with. Is used for billing purposes. Requires special activation to use. See <a href=\\\"#tag/Billing-Groups\\\">Billing Group API</a> for more information.
    QrCode qrCode = new QrCode();
    SfmUseType useType = SfmUseType.fromValue("marketing");
    Boolean fsc = false; // This is in beta. Contact support@lob.com or your account contact to learn more. Not available for `11x9_bifold` self-mailer size.
    String idempotencyKey = "026e7634-24d7-486c-a0bb-4a17fd0eebc5"; // A string of no longer than 256 characters that uniquely identifies this resource. For more help integrating idempotency keys, refer to our <a href=\"https://help.lob.com/print-and-mail/building-a-mail-strategy/managing-mail-settings#idempotent-requests-12\" target=\"_blank\">implementation guide</a>. 
    String idempotencyKey2 = "026e7634-24d7-486c-a0bb-4a17fd0eebc5"; // A string of no longer than 256 characters that uniquely identifies this resource. For more help integrating idempotency keys, refer to our <a href=\"https://help.lob.com/print-and-mail/building-a-mail-strategy/managing-mail-settings#idempotent-requests-12\" target=\"_blank\">implementation guide</a>. 
    try {
      SelfMailer result = client
              .selfMailers
              .createNewSelfMailer()
              .description(description)
              .metadata(metadata)
              .mailType(mailType)
              .mergeVariables(mergeVariables)
              .sendDate(sendDate)
              .size(size)
              .to(to)
              .from(from)
              .inside(inside)
              .outside(outside)
              .billingGroupId(billingGroupId)
              .qrCode(qrCode)
              .useType(useType)
              .fsc(fsc)
              .idempotencyKey(idempotencyKey)
              .idempotencyKey2(idempotencyKey2)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getMetadata());
      System.out.println(result.getMailType());
      System.out.println(result.getMergeVariables());
      System.out.println(result.getSendDate());
      System.out.println(result.getSize());
      System.out.println(result.getTo());
      System.out.println(result.getCarrier());
      System.out.println(result.getThumbnails());
      System.out.println(result.getExpectedDeliveryDate());
      System.out.println(result.getDateCreated());
      System.out.println(result.getDateModified());
      System.out.println(result.getDeleted());
      System.out.println(result.getFrom());
      System.out.println(result.getId());
      System.out.println(result.getOutsideTemplateId());
      System.out.println(result.getInsideTemplateId());
      System.out.println(result.getOutsideTemplateVersionId());
      System.out.println(result.getInsideTemplateVersionId());
      System.out.println(result.getObject());
      System.out.println(result.getTrackingEvents());
      System.out.println(result.getUseType());
      System.out.println(result.getUrl());
      System.out.println(result.getFsc());
      System.out.println(result.getStatus());
      System.out.println(result.getCampaignId());
      System.out.println(result.getFailureReason());
    } catch (ApiException e) {
      System.err.println("Exception when calling SelfMailersApi#createNewSelfMailer");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SelfMailer> response = client
              .selfMailers
              .createNewSelfMailer()
              .description(description)
              .metadata(metadata)
              .mailType(mailType)
              .mergeVariables(mergeVariables)
              .sendDate(sendDate)
              .size(size)
              .to(to)
              .from(from)
              .inside(inside)
              .outside(outside)
              .billingGroupId(billingGroupId)
              .qrCode(qrCode)
              .useType(useType)
              .fsc(fsc)
              .idempotencyKey(idempotencyKey)
              .idempotencyKey2(idempotencyKey2)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SelfMailersApi#createNewSelfMailer");
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
| **selfMailerEditable** | [**SelfMailerEditable**](SelfMailerEditable.md)|  | |
| **idempotencyKey** | **String**| A string of no longer than 256 characters that uniquely identifies this resource. For more help integrating idempotency keys, refer to our &lt;a href&#x3D;\&quot;https://help.lob.com/print-and-mail/building-a-mail-strategy/managing-mail-settings#idempotent-requests-12\&quot; target&#x3D;\&quot;_blank\&quot;&gt;implementation guide&lt;/a&gt;.  | [optional] |
| **idempotencyKey2** | **String**| A string of no longer than 256 characters that uniquely identifies this resource. For more help integrating idempotency keys, refer to our &lt;a href&#x3D;\&quot;https://help.lob.com/print-and-mail/building-a-mail-strategy/managing-mail-settings#idempotent-requests-12\&quot; target&#x3D;\&quot;_blank\&quot;&gt;implementation guide&lt;/a&gt;.  | [optional] |

### Return type

[**SelfMailer**](SelfMailer.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a self_mailer object |  * ratelimit-limit -  <br>  * ratelimit-remaining -  <br>  * ratelimit-reset -  <br>  |
| **0** | Error |  -  |

<a name="getDetails"></a>
# **getDetails**
> SelfMailer getDetails(sfmId).execute();

Retrieve

Retrieves the details of an existing self_mailer. You need only supply the unique self_mailer identifier that was returned upon self_mailer creation.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SelfMailersApi;
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
    String sfmId = "sfmId_example"; // id of the self_mailer
    try {
      SelfMailer result = client
              .selfMailers
              .getDetails(sfmId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getMetadata());
      System.out.println(result.getMailType());
      System.out.println(result.getMergeVariables());
      System.out.println(result.getSendDate());
      System.out.println(result.getSize());
      System.out.println(result.getTo());
      System.out.println(result.getCarrier());
      System.out.println(result.getThumbnails());
      System.out.println(result.getExpectedDeliveryDate());
      System.out.println(result.getDateCreated());
      System.out.println(result.getDateModified());
      System.out.println(result.getDeleted());
      System.out.println(result.getFrom());
      System.out.println(result.getId());
      System.out.println(result.getOutsideTemplateId());
      System.out.println(result.getInsideTemplateId());
      System.out.println(result.getOutsideTemplateVersionId());
      System.out.println(result.getInsideTemplateVersionId());
      System.out.println(result.getObject());
      System.out.println(result.getTrackingEvents());
      System.out.println(result.getUseType());
      System.out.println(result.getUrl());
      System.out.println(result.getFsc());
      System.out.println(result.getStatus());
      System.out.println(result.getCampaignId());
      System.out.println(result.getFailureReason());
    } catch (ApiException e) {
      System.err.println("Exception when calling SelfMailersApi#getDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SelfMailer> response = client
              .selfMailers
              .getDetails(sfmId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SelfMailersApi#getDetails");
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
| **sfmId** | **String**| id of the self_mailer | |

### Return type

[**SelfMailer**](SelfMailer.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a self_mailer object |  -  |
| **0** | Error |  -  |

<a name="getList"></a>
# **getList**
> SelfMailersGetListResponse getList().limit(limit).beforeAfter(beforeAfter).include(include).dateCreated(dateCreated).metadata(metadata).size(size).scheduled(scheduled).sendDate(sendDate).mailType(mailType).sortBy(sortBy).campaignId(campaignId).status(status).execute();

List

Returns a list of your self_mailers. The self_mailers are returned sorted by creation date, with the most recently created self_mailers appearing first.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SelfMailersApi;
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
    List<SelfMailerSize> size = Arrays.asList(6x18_bifold); // The self mailer sizes to be returned.
    Boolean scheduled = true; // * `true` - only return orders (past or future) where `send_date` is greater than `date_created` * `false` - only return orders where `send_date` is equal to `date_created` 
    Object sendDate = null; // Filter by ISO-8601 date or datetime, e.g. `{ \"gt\": \"2012-01-01\", \"lt\": \"2012-01-31T12:34:56Z\" }` where `gt` is >, `lt` is <, `gte` is ≥, and `lte` is ≤. 
    MailType mailType = MailType.fromValue("usps_first_class"); // A string designating the mail postage type: * `usps_first_class` - (default) * `usps_standard` - a <a href=\"https://lob.com/pricing/print-mail#compare\" target=\"_blank\">cheaper option</a> which is less predictable and takes longer to deliver. `usps_standard` cannot be used with `4x6` postcards or for any postcards sent outside of the United States. 
    ChecksListSortByParameter sortBy = new ChecksListSortByParameter(); // Sorts items by ascending or descending dates. Use either `date_created` or `send_date`, not both. 
    String campaignId = "campaignId_example"; // Filters resources created by the provided campaign id, prefixed with `cmp_`.
    Status status = Status.fromValue("processed"); // A string describing the render status: * `processed` - the rendering process is currently underway. * `rendered` - the rendering process has completed successfully. * `failed` - the rendering process has failed. 
    try {
      SelfMailersGetListResponse result = client
              .selfMailers
              .getList()
              .limit(limit)
              .beforeAfter(beforeAfter)
              .include(include)
              .dateCreated(dateCreated)
              .metadata(metadata)
              .size(size)
              .scheduled(scheduled)
              .sendDate(sendDate)
              .mailType(mailType)
              .sortBy(sortBy)
              .campaignId(campaignId)
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
      System.err.println("Exception when calling SelfMailersApi#getList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SelfMailersGetListResponse> response = client
              .selfMailers
              .getList()
              .limit(limit)
              .beforeAfter(beforeAfter)
              .include(include)
              .dateCreated(dateCreated)
              .metadata(metadata)
              .size(size)
              .scheduled(scheduled)
              .sendDate(sendDate)
              .mailType(mailType)
              .sortBy(sortBy)
              .campaignId(campaignId)
              .status(status)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SelfMailersApi#getList");
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
| **size** | [**List&lt;SelfMailerSize&gt;**](SelfMailerSize.md)| The self mailer sizes to be returned. | [optional] |
| **scheduled** | **Boolean**| * &#x60;true&#x60; - only return orders (past or future) where &#x60;send_date&#x60; is greater than &#x60;date_created&#x60; * &#x60;false&#x60; - only return orders where &#x60;send_date&#x60; is equal to &#x60;date_created&#x60;  | [optional] |
| **sendDate** | [**Object**](.md)| Filter by ISO-8601 date or datetime, e.g. &#x60;{ \&quot;gt\&quot;: \&quot;2012-01-01\&quot;, \&quot;lt\&quot;: \&quot;2012-01-31T12:34:56Z\&quot; }&#x60; where &#x60;gt&#x60; is &gt;, &#x60;lt&#x60; is &lt;, &#x60;gte&#x60; is ≥, and &#x60;lte&#x60; is ≤.  | [optional] |
| **mailType** | [**MailType**](.md)| A string designating the mail postage type: * &#x60;usps_first_class&#x60; - (default) * &#x60;usps_standard&#x60; - a &lt;a href&#x3D;\&quot;https://lob.com/pricing/print-mail#compare\&quot; target&#x3D;\&quot;_blank\&quot;&gt;cheaper option&lt;/a&gt; which is less predictable and takes longer to deliver. &#x60;usps_standard&#x60; cannot be used with &#x60;4x6&#x60; postcards or for any postcards sent outside of the United States.  | [optional] [default to usps_first_class] [enum: usps_first_class, usps_standard] |
| **sortBy** | [**ChecksListSortByParameter**](.md)| Sorts items by ascending or descending dates. Use either &#x60;date_created&#x60; or &#x60;send_date&#x60;, not both.  | [optional] |
| **campaignId** | **String**| Filters resources created by the provided campaign id, prefixed with &#x60;cmp_&#x60;. | [optional] |
| **status** | [**Status**](.md)| A string describing the render status: * &#x60;processed&#x60; - the rendering process is currently underway. * &#x60;rendered&#x60; - the rendering process has completed successfully. * &#x60;failed&#x60; - the rendering process has failed.  | [optional] [enum: processed, rendered, failed] |

### Return type

[**SelfMailersGetListResponse**](SelfMailersGetListResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A dictionary with a data property that contains an array of up to &#x60;limit&#x60; self_mailers. Each entry in the array is a separate self_mailer. The previous and next page of self_mailers can be retrieved by calling the endpoint contained in the &#x60;previous_url&#x60; and &#x60;next_url&#x60; fields in the API response respectively.&lt;br&gt;If no more self_mailers are available beyond the current set of returned results, the &#x60;next_url&#x60; field will be empty. |  -  |
| **0** | Error |  -  |

<a name="removeSelfMailer"></a>
# **removeSelfMailer**
> SelfMailerDeletion removeSelfMailer(sfmId).execute();

Delete

Completely removes a self mailer from production. This can only be done if the self mailer&#39;s &#x60;send_date&#x60; has not yet passed. If the self mailer is successfully canceled, you will not be charged for it. This feature is exclusive to certain customers. Upgrade to the appropriate &lt;a href&#x3D;\&quot;https://dashboard.lob.com/#/settings/editions\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Print &amp; Mail Edition&lt;/a&gt; to gain access.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SelfMailersApi;
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
    String sfmId = "sfmId_example"; // id of the self_mailer
    try {
      SelfMailerDeletion result = client
              .selfMailers
              .removeSelfMailer(sfmId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDeleted());
    } catch (ApiException e) {
      System.err.println("Exception when calling SelfMailersApi#removeSelfMailer");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SelfMailerDeletion> response = client
              .selfMailers
              .removeSelfMailer(sfmId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SelfMailersApi#removeSelfMailer");
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
| **sfmId** | **String**| id of the self_mailer | |

### Return type

[**SelfMailerDeletion**](SelfMailerDeletion.md)

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


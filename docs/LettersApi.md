# LettersApi

All URIs are relative to *https://api.lob.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancel**](LettersApi.md#cancel) | **DELETE** /letters/{ltr_id} | Cancel |
| [**create**](LettersApi.md#create) | **POST** /letters | Create |
| [**list**](LettersApi.md#list) | **GET** /letters | List |
| [**retrieve**](LettersApi.md#retrieve) | **GET** /letters/{ltr_id} | Retrieve |


<a name="cancel"></a>
# **cancel**
> LetterDeletion cancel(ltrId).execute();

Cancel

Completely removes a letter from production. This can only be done if the letter has a &#x60;send_date&#x60; and the &#x60;send_date&#x60; has not yet passed. If the letter is successfully canceled, you will not be charged for it. Read more on [cancellation windows](#section/Cancellation-Windows) and [scheduling](#section/Scheduled-Mailings). Scheduling and cancellation is a premium feature. Upgrade to the appropriate &lt;a href&#x3D;\&quot;https://dashboard.lob.com/#/settings/editions\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Print &amp; Mail Edition&lt;/a&gt; to gain access.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LettersApi;
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
    String ltrId = "ltrId_example"; // id of the letter
    try {
      LetterDeletion result = client
              .letters
              .cancel(ltrId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDeleted());
    } catch (ApiException e) {
      System.err.println("Exception when calling LettersApi#cancel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LetterDeletion> response = client
              .letters
              .cancel(ltrId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LettersApi#cancel");
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
| **ltrId** | **String**| id of the letter | |

### Return type

[**LetterDeletion**](LetterDeletion.md)

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
> Object create(letterEditable).idempotencyKey(idempotencyKey).idempotencyKey2(idempotencyKey2).lobVersion(lobVersion).execute();

Create

Creates a new letter given information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LettersApi;
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
    Object to = null;
    Object from = null;
    String description = "description_example"; // An internal description that identifies this resource. Must be no longer than 255 characters. 
    Map<String, String> metadata = new HashMap(); // Use metadata to store custom information for tagging and labeling back to your internal systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters and values must be at most 500 characters. Neither can contain the characters `\\\"` and `\\\\`. i.e. '{\\\"customer_id\\\" : \\\"NEWYORK2015\\\"}' Nested objects are not supported.  See [Metadata](#section/Metadata) for more information.
    MailType mailType = MailType.fromValue("usps_first_class");
    String mergeVariables = new HashMap(); // You can input a merge variable payload object to your template to render dynamic content. For example, if you have a template like: `{{variable_name}}`, pass in `{\\\"variable_name\\\": \\\"Harry\\\"}` to render `Harry`. `merge_variables` must be an object. Any type of value is accepted as long as the object is valid JSON; you can use `strings`, `numbers`, `booleans`, `arrays`, `objects`, or `null`. The max length of the object is 25,000 characters. If you call `JSON.stringify` on your object, it can be no longer than 25,000 characters. Your variable names cannot contain any whitespace or any of the following special characters: `!`, `\\\"`, `#`, `%`, `&`, `'`, `(`, `)`, `*`, `+`, `,`, `/`, `;`, `<`, `=`, `>`, `@`, `[`, `\\\\`, `]`, `^`, `` ` ``, `{`, `|`, `}`, `~`. More instructions can be found in <a href=\\\"https://help.lob.com/print-and-mail/designing-mail-creatives/dynamic-personalization#using-html-and-merge-variables-10\\\" target=\\\"_blank\\\">our guide to using html and merge variables</a>. Depending on your <a href=\\\"https://dashboard.lob.com/#/settings/account\\\" target=\\\"_blank\\\">Merge Variable strictness</a> setting, if you define variables in your HTML but do not pass them here, you will either receive an error or the variable will render as an empty string.
    Object sendDate = null;
    Object _file = null;
    ExtraService extraService = ExtraService.fromValue("certified");
    List<String> cards = Arrays.asList(); // A single-element array containing an existing card id in a string format. See [cards](#tag/Cards) for more information. Not available for `us_legal` letter size.
    Boolean color = true;
    Boolean doubleSided = true; // Set this attribute to `true` for double sided printing, or `false` for for single sided printing. Defaults to `true`.
    AddressPlacement addressPlacement = AddressPlacement.fromValue("top_first_page");
    Object returnEnvelope = null;
    Integer perforatedPage = 56; // Required if `return_envelope` is `true`. The number of the page that should be perforated for use with the return envelope. Must be greater than or equal to `1`. The blank page added by `address_placement=insert_blank_page` will be ignored when considering the perforated page number. To see how perforation will impact your letter design, view our <a href=\\\"https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/letter_perf_template.pdf\\\" target=\\\"_blank\\\">perforation guide</a>.
    String customEnvelope = "customEnvelope_example"; // Accepts an envelope ID for any customized envelope with available inventory. If no inventory is available for the specified ID, the letter will not be sent, and an error will be returned. If the letter has more than 6 sheets, it will be sent in a blank flat envelope. Custom envelopes may be created and ordered from the dashboard. This feature is exclusive to certain customers. Upgrade to the appropriate <a href=\\\"https://dashboard.lob.com/#/settings/editions\\\" target=\\\"_blank\\\">Print & Mail Edition</a> to gain access.
    String billingGroupId = "billingGroupId_example"; // An optional string with the billing group ID to tag your usage with. Is used for billing purposes. Requires special activation to use. See <a href=\\\"#tag/Billing-Groups\\\">Billing Group API</a> for more information.
    QrCode qrCode = new QrCode();
    LtrUseType useType = LtrUseType.fromValue("marketing");
    Boolean fsc = false; // This is in beta. Contact support@lob.com or your account contact to learn more. Not available for `A4` and `us_legal` letter size.
    LtrSize size = LtrSize.fromValue("us_letter");
    String idempotencyKey = "026e7634-24d7-486c-a0bb-4a17fd0eebc5"; // A string of no longer than 256 characters that uniquely identifies this resource. For more help integrating idempotency keys, refer to our <a href=\"https://help.lob.com/print-and-mail/building-a-mail-strategy/managing-mail-settings#idempotent-requests-12\" target=\"_blank\">implementation guide</a>. 
    String idempotencyKey2 = "026e7634-24d7-486c-a0bb-4a17fd0eebc5"; // A string of no longer than 256 characters that uniquely identifies this resource. For more help integrating idempotency keys, refer to our <a href=\"https://help.lob.com/print-and-mail/building-a-mail-strategy/managing-mail-settings#idempotent-requests-12\" target=\"_blank\">implementation guide</a>. 
    String lobVersion = "2024-01-01"; // A string representing the version of the API being used. For more information on versioning, refer to our [Versioning and Changelog](https://docs.lob.com/#tag/Versioning-and-Changelog) documentation. 
    try {
      Object result = client
              .letters
              .create()
              .to(to)
              .from(from)
              .description(description)
              .metadata(metadata)
              .mailType(mailType)
              .mergeVariables(mergeVariables)
              .sendDate(sendDate)
              ._file(_file)
              .extraService(extraService)
              .cards(cards)
              .color(color)
              .doubleSided(doubleSided)
              .addressPlacement(addressPlacement)
              .returnEnvelope(returnEnvelope)
              .perforatedPage(perforatedPage)
              .customEnvelope(customEnvelope)
              .billingGroupId(billingGroupId)
              .qrCode(qrCode)
              .useType(useType)
              .fsc(fsc)
              .size(size)
              .idempotencyKey(idempotencyKey)
              .idempotencyKey2(idempotencyKey2)
              .lobVersion(lobVersion)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LettersApi#create");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .letters
              .create()
              .to(to)
              .from(from)
              .description(description)
              .metadata(metadata)
              .mailType(mailType)
              .mergeVariables(mergeVariables)
              .sendDate(sendDate)
              ._file(_file)
              .extraService(extraService)
              .cards(cards)
              .color(color)
              .doubleSided(doubleSided)
              .addressPlacement(addressPlacement)
              .returnEnvelope(returnEnvelope)
              .perforatedPage(perforatedPage)
              .customEnvelope(customEnvelope)
              .billingGroupId(billingGroupId)
              .qrCode(qrCode)
              .useType(useType)
              .fsc(fsc)
              .size(size)
              .idempotencyKey(idempotencyKey)
              .idempotencyKey2(idempotencyKey2)
              .lobVersion(lobVersion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LettersApi#create");
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
| **letterEditable** | [**LetterEditable**](LetterEditable.md)|  | |
| **idempotencyKey** | **String**| A string of no longer than 256 characters that uniquely identifies this resource. For more help integrating idempotency keys, refer to our &lt;a href&#x3D;\&quot;https://help.lob.com/print-and-mail/building-a-mail-strategy/managing-mail-settings#idempotent-requests-12\&quot; target&#x3D;\&quot;_blank\&quot;&gt;implementation guide&lt;/a&gt;.  | [optional] |
| **idempotencyKey2** | **String**| A string of no longer than 256 characters that uniquely identifies this resource. For more help integrating idempotency keys, refer to our &lt;a href&#x3D;\&quot;https://help.lob.com/print-and-mail/building-a-mail-strategy/managing-mail-settings#idempotent-requests-12\&quot; target&#x3D;\&quot;_blank\&quot;&gt;implementation guide&lt;/a&gt;.  | [optional] |
| **lobVersion** | **String**| A string representing the version of the API being used. For more information on versioning, refer to our [Versioning and Changelog](https://docs.lob.com/#tag/Versioning-and-Changelog) documentation.  | [optional] |

### Return type

**Object**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a letter object |  * ratelimit-limit -  <br>  * ratelimit-remaining -  <br>  * ratelimit-reset -  <br>  |
| **0** | Error |  -  |

<a name="list"></a>
# **list**
> LettersListResponse list().limit(limit).beforeAfter(beforeAfter).include(include).dateCreated(dateCreated).metadata(metadata).campaignId(campaignId).status(status).color(color).scheduled(scheduled).sendDate(sendDate).mailType(mailType).sortBy(sortBy).execute();

List

Returns a list of your letters. The letters are returned sorted by creation date, with the most recently created letters appearing first.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LettersApi;
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
    String campaignId = "campaignId_example"; // Filters resources created by the provided campaign id, prefixed with `cmp_`.
    Status status = Status.fromValue("processed"); // A string describing the render status: * `processed` - the rendering process is currently underway. * `rendered` - the rendering process has completed successfully. * `failed` - the rendering process has failed. 
    Boolean color = true; // Set to `true` to return only color letters. Set to `false` to return only black & white letters.
    Boolean scheduled = true; // * `true` - only return orders (past or future) where `send_date` is greater than `date_created` * `false` - only return orders where `send_date` is equal to `date_created` 
    Object sendDate = null; // Filter by ISO-8601 date or datetime, e.g. `{ \"gt\": \"2012-01-01\", \"lt\": \"2012-01-31T12:34:56Z\" }` where `gt` is >, `lt` is <, `gte` is ≥, and `lte` is ≤. 
    MailType mailType = MailType.fromValue("usps_first_class"); // A string designating the mail postage type: * `usps_first_class` - (default) * `usps_standard` - a <a href=\"https://lob.com/pricing/print-mail#compare\" target=\"_blank\">cheaper option</a> which is less predictable and takes longer to deliver. `usps_standard` cannot be used with `4x6` postcards or for any postcards sent outside of the United States. 
    ChecksListSortByParameter sortBy = new ChecksListSortByParameter(); // Sorts items by ascending or descending dates. Use either `date_created` or `send_date`, not both. 
    try {
      LettersListResponse result = client
              .letters
              .list()
              .limit(limit)
              .beforeAfter(beforeAfter)
              .include(include)
              .dateCreated(dateCreated)
              .metadata(metadata)
              .campaignId(campaignId)
              .status(status)
              .color(color)
              .scheduled(scheduled)
              .sendDate(sendDate)
              .mailType(mailType)
              .sortBy(sortBy)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getNextUrl());
      System.out.println(result.getPreviousUrl());
      System.out.println(result.getCount());
      System.out.println(result.getTotalCount());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling LettersApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LettersListResponse> response = client
              .letters
              .list()
              .limit(limit)
              .beforeAfter(beforeAfter)
              .include(include)
              .dateCreated(dateCreated)
              .metadata(metadata)
              .campaignId(campaignId)
              .status(status)
              .color(color)
              .scheduled(scheduled)
              .sendDate(sendDate)
              .mailType(mailType)
              .sortBy(sortBy)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LettersApi#list");
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
| **campaignId** | **String**| Filters resources created by the provided campaign id, prefixed with &#x60;cmp_&#x60;. | [optional] |
| **status** | [**Status**](.md)| A string describing the render status: * &#x60;processed&#x60; - the rendering process is currently underway. * &#x60;rendered&#x60; - the rendering process has completed successfully. * &#x60;failed&#x60; - the rendering process has failed.  | [optional] [enum: processed, rendered, failed] |
| **color** | **Boolean**| Set to &#x60;true&#x60; to return only color letters. Set to &#x60;false&#x60; to return only black &amp; white letters. | [optional] |
| **scheduled** | **Boolean**| * &#x60;true&#x60; - only return orders (past or future) where &#x60;send_date&#x60; is greater than &#x60;date_created&#x60; * &#x60;false&#x60; - only return orders where &#x60;send_date&#x60; is equal to &#x60;date_created&#x60;  | [optional] |
| **sendDate** | [**Object**](.md)| Filter by ISO-8601 date or datetime, e.g. &#x60;{ \&quot;gt\&quot;: \&quot;2012-01-01\&quot;, \&quot;lt\&quot;: \&quot;2012-01-31T12:34:56Z\&quot; }&#x60; where &#x60;gt&#x60; is &gt;, &#x60;lt&#x60; is &lt;, &#x60;gte&#x60; is ≥, and &#x60;lte&#x60; is ≤.  | [optional] |
| **mailType** | [**MailType**](.md)| A string designating the mail postage type: * &#x60;usps_first_class&#x60; - (default) * &#x60;usps_standard&#x60; - a &lt;a href&#x3D;\&quot;https://lob.com/pricing/print-mail#compare\&quot; target&#x3D;\&quot;_blank\&quot;&gt;cheaper option&lt;/a&gt; which is less predictable and takes longer to deliver. &#x60;usps_standard&#x60; cannot be used with &#x60;4x6&#x60; postcards or for any postcards sent outside of the United States.  | [optional] [default to usps_first_class] [enum: usps_first_class, usps_standard] |
| **sortBy** | [**ChecksListSortByParameter**](.md)| Sorts items by ascending or descending dates. Use either &#x60;date_created&#x60; or &#x60;send_date&#x60;, not both.  | [optional] |

### Return type

[**LettersListResponse**](LettersListResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A dictionary with a data property that contains an array of up to &#x60;limit&#x60; letters. Each entry in the array is a separate letter. The previous and next page of letters can be retrieved by calling the endpoint contained in the &#x60;previous_url&#x60; and &#x60;next_url&#x60; fields in the API response respectively. If no more letters are available beyond the current set of returned results, the &#x60;next_url&#x60; field will be empty. |  -  |
| **0** | Error |  -  |

<a name="retrieve"></a>
# **retrieve**
> Object retrieve(ltrId).execute();

Retrieve

Retrieves the details of an existing letter. You need only supply the unique letter identifier that was returned upon letter creation.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LettersApi;
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
    String ltrId = "ltrId_example"; // id of the letter
    try {
      Object result = client
              .letters
              .retrieve(ltrId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LettersApi#retrieve");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .letters
              .retrieve(ltrId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LettersApi#retrieve");
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
| **ltrId** | **String**| id of the letter | |

### Return type

**Object**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a letter object |  -  |
| **0** | Error |  -  |


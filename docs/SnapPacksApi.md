# SnapPacksApi

All URIs are relative to *https://api.lob.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewSnapPack**](SnapPacksApi.md#createNewSnapPack) | **POST** /snap_packs | Create |


<a name="createNewSnapPack"></a>
# **createNewSnapPack**
> SnapPack createNewSnapPack(snapPackEditable).idempotencyKey(idempotencyKey).idempotencyKey2(idempotencyKey2).execute();

Create

Creates a new snap_pack given information

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SnapPacksApi;
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
    SnapPackSize size = SnapPackSize.fromValue("8.5x11");
    Object to = null;
    Object from = null;
    Object inside = null;
    Object outside = null;
    String billingGroupId = "billingGroupId_example"; // An optional string with the billing group ID to tag your usage with. Is used for billing purposes. Requires special activation to use. See <a href=\\\"#tag/Billing-Groups\\\">Billing Group API</a> for more information.
    SnapPackUseType useType = SnapPackUseType.fromValue("marketing");
    Boolean color = true;
    String idempotencyKey = "026e7634-24d7-486c-a0bb-4a17fd0eebc5"; // A string of no longer than 256 characters that uniquely identifies this resource. For more help integrating idempotency keys, refer to our <a href=\"https://help.lob.com/print-and-mail/building-a-mail-strategy/managing-mail-settings#idempotent-requests-12\" target=\"_blank\">implementation guide</a>. 
    String idempotencyKey2 = "026e7634-24d7-486c-a0bb-4a17fd0eebc5"; // A string of no longer than 256 characters that uniquely identifies this resource. For more help integrating idempotency keys, refer to our <a href=\"https://help.lob.com/print-and-mail/building-a-mail-strategy/managing-mail-settings#idempotent-requests-12\" target=\"_blank\">implementation guide</a>. 
    try {
      SnapPack result = client
              .snapPacks
              .createNewSnapPack()
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
              .useType(useType)
              .color(color)
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
      System.out.println(result.getColor());
    } catch (ApiException e) {
      System.err.println("Exception when calling SnapPacksApi#createNewSnapPack");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SnapPack> response = client
              .snapPacks
              .createNewSnapPack()
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
              .useType(useType)
              .color(color)
              .idempotencyKey(idempotencyKey)
              .idempotencyKey2(idempotencyKey2)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SnapPacksApi#createNewSnapPack");
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
| **snapPackEditable** | [**SnapPackEditable**](SnapPackEditable.md)|  | |
| **idempotencyKey** | **String**| A string of no longer than 256 characters that uniquely identifies this resource. For more help integrating idempotency keys, refer to our &lt;a href&#x3D;\&quot;https://help.lob.com/print-and-mail/building-a-mail-strategy/managing-mail-settings#idempotent-requests-12\&quot; target&#x3D;\&quot;_blank\&quot;&gt;implementation guide&lt;/a&gt;.  | [optional] |
| **idempotencyKey2** | **String**| A string of no longer than 256 characters that uniquely identifies this resource. For more help integrating idempotency keys, refer to our &lt;a href&#x3D;\&quot;https://help.lob.com/print-and-mail/building-a-mail-strategy/managing-mail-settings#idempotent-requests-12\&quot; target&#x3D;\&quot;_blank\&quot;&gt;implementation guide&lt;/a&gt;.  | [optional] |

### Return type

[**SnapPack**](SnapPack.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a snap_pack object |  * ratelimit-limit -  <br>  * ratelimit-remaining -  <br>  * ratelimit-reset -  <br>  |
| **0** | Error |  -  |


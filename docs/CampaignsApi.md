# CampaignsApi

All URIs are relative to *https://api.lob.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](CampaignsApi.md#create) | **POST** /campaigns | Create |
| [**delete**](CampaignsApi.md#delete) | **DELETE** /campaigns/{cmp_id} | Delete |
| [**list**](CampaignsApi.md#list) | **GET** /campaigns | List |
| [**retrieve**](CampaignsApi.md#retrieve) | **GET** /campaigns/{cmp_id} | Retrieve |
| [**send**](CampaignsApi.md#send) | **POST** /campaigns/{cmp_id}/send | Send Campaign |
| [**update**](CampaignsApi.md#update) | **PATCH** /campaigns/{cmp_id} | Update |


<a name="create"></a>
# **create**
> Campaign create(campaignWritable).xLangOutput(xLangOutput).execute();

Create

Creates a new campaign with the provided properties. See how to launch your first campaign [here](https://help.lob.com/print-and-mail/building-a-mail-strategy/campaign-or-triggered-sends/launch-your-first-campaign).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CampaignsApi;
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
    String name = "name_example"; // Name of the campaign.
    CmpScheduleType scheduleType = CmpScheduleType.fromValue("immediate");
    CmpUseType useType = CmpUseType.fromValue("marketing");
    String description = "description_example"; // An internal description that identifies this resource. Must be no longer than 255 characters. 
    String billingGroupId = "billingGroupId_example"; // Unique identifier prefixed with `bg_`.
    OffsetDateTime targetDeliveryDate = OffsetDateTime.now(); // If `schedule_type` is `target_delivery_date`, provide a targeted delivery date for mail pieces in this campaign.
    OffsetDateTime sendDate = OffsetDateTime.now(); // If `schedule_type` is `scheduled_send_date`, provide a date to send this campaign.
    Integer cancelWindowCampaignMinutes = 56; // A window, in minutes, within which the campaign can be canceled.
    Map<String, String> metadata = new HashMap(); // Use metadata to store custom information for tagging and labeling back to your internal systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters and values must be at most 500 characters. Neither can contain the characters `\\\"` and `\\\\`. i.e. '{\\\"customer_id\\\" : \\\"NEWYORK2015\\\"}' Nested objects are not supported.  See [Metadata](#section/Metadata) for more information.
    Boolean autoCancelIfNcoa = true; // Whether or not a mail piece should be automatically canceled and not sent if the address is updated via NCOA.
    String xLangOutput = "native"; // * `native` - Translate response to the native language of the country in the request * `match` - match the response to the language in the request  Default response is in English. 
    try {
      Campaign result = client
              .campaigns
              .create(name, scheduleType, useType)
              .description(description)
              .billingGroupId(billingGroupId)
              .targetDeliveryDate(targetDeliveryDate)
              .sendDate(sendDate)
              .cancelWindowCampaignMinutes(cancelWindowCampaignMinutes)
              .metadata(metadata)
              .autoCancelIfNcoa(autoCancelIfNcoa)
              .xLangOutput(xLangOutput)
              .execute();
      System.out.println(result);
      System.out.println(result.getDateCreated());
      System.out.println(result.getDateModified());
      System.out.println(result.getDeleted());
      System.out.println(result.getObject());
      System.out.println(result.getDescription());
      System.out.println(result.getBillingGroupId());
      System.out.println(result.getName());
      System.out.println(result.getScheduleType());
      System.out.println(result.getTargetDeliveryDate());
      System.out.println(result.getSendDate());
      System.out.println(result.getCancelWindowCampaignMinutes());
      System.out.println(result.getMetadata());
      System.out.println(result.getUseType());
      System.out.println(result.getAutoCancelIfNcoa());
      System.out.println(result.getId());
      System.out.println(result.getIsDraft());
      System.out.println(result.getCreatives());
      System.out.println(result.getUploads());
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#create");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Campaign> response = client
              .campaigns
              .create(name, scheduleType, useType)
              .description(description)
              .billingGroupId(billingGroupId)
              .targetDeliveryDate(targetDeliveryDate)
              .sendDate(sendDate)
              .cancelWindowCampaignMinutes(cancelWindowCampaignMinutes)
              .metadata(metadata)
              .autoCancelIfNcoa(autoCancelIfNcoa)
              .xLangOutput(xLangOutput)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#create");
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
| **campaignWritable** | [**CampaignWritable**](CampaignWritable.md)|  | |
| **xLangOutput** | **String**| * &#x60;native&#x60; - Translate response to the native language of the country in the request * &#x60;match&#x60; - match the response to the language in the request  Default response is in English.  | [optional] [enum: native, match] |

### Return type

[**Campaign**](Campaign.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Campaign created successfully |  -  |
| **0** | Error |  -  |

<a name="delete"></a>
# **delete**
> CampaignDeleteResponse delete(cmpId).execute();

Delete

Delete an existing campaign. You need only supply the unique identifier that was returned upon campaign creation. Deleting a campaign also deletes any associated mail pieces that have been created but not sent. A campaign&#39;s &#x60;send_date&#x60; matches its associated mail pieces&#39; &#x60;send_date&#x60;s.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CampaignsApi;
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
    String cmpId = "cmpId_example"; // id of the campaign
    try {
      CampaignDeleteResponse result = client
              .campaigns
              .delete(cmpId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDeleted());
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#delete");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CampaignDeleteResponse> response = client
              .campaigns
              .delete(cmpId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#delete");
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
| **cmpId** | **String**| id of the campaign | |

### Return type

[**CampaignDeleteResponse**](CampaignDeleteResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Deleted the campaign. |  -  |
| **0** | Error |  -  |

<a name="list"></a>
# **list**
> CampaignsListResponse list().limit(limit).include(include).beforeAfter(beforeAfter).execute();

List

Returns a list of your campaigns. The campaigns are returned sorted by creation date, with the most recently created campaigns appearing first.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CampaignsApi;
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
    List<String> include = Arrays.asList(); // Request that the response include the total count by specifying `include=[\"total_count\"]`. 
    AddressesListBeforeAfterParameter beforeAfter = new AddressesListBeforeAfterParameter(); // `before` and `after` are both optional but only one of them can be in the query at a time. 
    try {
      CampaignsListResponse result = client
              .campaigns
              .list()
              .limit(limit)
              .include(include)
              .beforeAfter(beforeAfter)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getNextUrl());
      System.out.println(result.getPreviousUrl());
      System.out.println(result.getCount());
      System.out.println(result.getTotalCount());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CampaignsListResponse> response = client
              .campaigns
              .list()
              .limit(limit)
              .include(include)
              .beforeAfter(beforeAfter)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#list");
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
| **include** | [**List&lt;String&gt;**](String.md)| Request that the response include the total count by specifying &#x60;include&#x3D;[\&quot;total_count\&quot;]&#x60;.  | [optional] |
| **beforeAfter** | [**AddressesListBeforeAfterParameter**](.md)| &#x60;before&#x60; and &#x60;after&#x60; are both optional but only one of them can be in the query at a time.  | [optional] |

### Return type

[**CampaignsListResponse**](CampaignsListResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A dictionary with a data property that contains an array of up to &#x60;limit&#x60; campaigns. Each entry in the array is a separate campaign. The previous and next page of campaigns can be retrieved by calling the endpoint contained in the &#x60;previous_url&#x60; and &#x60;next_url&#x60; fields in the API response respectively.&lt;br&gt;If no more campaigns are available beyond the current set of returned results, the &#x60;next_url&#x60; field will be empty. |  -  |

<a name="retrieve"></a>
# **retrieve**
> Campaign retrieve(cmpId).execute();

Retrieve

Retrieves the details of an existing campaign. You need only supply the unique campaign identifier that was returned upon campaign creation.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CampaignsApi;
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
    String cmpId = "cmpId_example"; // id of the campaign
    try {
      Campaign result = client
              .campaigns
              .retrieve(cmpId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDateCreated());
      System.out.println(result.getDateModified());
      System.out.println(result.getDeleted());
      System.out.println(result.getObject());
      System.out.println(result.getDescription());
      System.out.println(result.getBillingGroupId());
      System.out.println(result.getName());
      System.out.println(result.getScheduleType());
      System.out.println(result.getTargetDeliveryDate());
      System.out.println(result.getSendDate());
      System.out.println(result.getCancelWindowCampaignMinutes());
      System.out.println(result.getMetadata());
      System.out.println(result.getUseType());
      System.out.println(result.getAutoCancelIfNcoa());
      System.out.println(result.getId());
      System.out.println(result.getIsDraft());
      System.out.println(result.getCreatives());
      System.out.println(result.getUploads());
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#retrieve");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Campaign> response = client
              .campaigns
              .retrieve(cmpId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#retrieve");
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
| **cmpId** | **String**| id of the campaign | |

### Return type

[**Campaign**](Campaign.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a campaign object |  -  |
| **0** | Error |  -  |

<a name="send"></a>
# **send**
> Campaign send(cmpId).execute();

Send Campaign

Sends a campaign. You need only supply the unique campaign identifier that was returned upon campaign creation.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CampaignsApi;
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
    String cmpId = "cmpId_example"; // id of the campaign
    try {
      Campaign result = client
              .campaigns
              .send(cmpId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDateCreated());
      System.out.println(result.getDateModified());
      System.out.println(result.getDeleted());
      System.out.println(result.getObject());
      System.out.println(result.getDescription());
      System.out.println(result.getBillingGroupId());
      System.out.println(result.getName());
      System.out.println(result.getScheduleType());
      System.out.println(result.getTargetDeliveryDate());
      System.out.println(result.getSendDate());
      System.out.println(result.getCancelWindowCampaignMinutes());
      System.out.println(result.getMetadata());
      System.out.println(result.getUseType());
      System.out.println(result.getAutoCancelIfNcoa());
      System.out.println(result.getId());
      System.out.println(result.getIsDraft());
      System.out.println(result.getCreatives());
      System.out.println(result.getUploads());
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#send");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Campaign> response = client
              .campaigns
              .send(cmpId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#send");
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
| **cmpId** | **String**| id of the campaign | |

### Return type

[**Campaign**](Campaign.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a campaign object |  -  |
| **0** | Error |  -  |

<a name="update"></a>
# **update**
> Campaign update(cmpId, campaignUpdatable).execute();

Update

Update the details of an existing campaign. You need only supply the unique identifier that was returned upon campaign creation.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CampaignsApi;
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
    String cmpId = "cmpId_example"; // id of the campaign
    String description = "description_example"; // An internal description that identifies this resource. Must be no longer than 255 characters. 
    String name = "name_example";
    CmpScheduleType scheduleType = CmpScheduleType.fromValue("immediate");
    OffsetDateTime targetDeliveryDate = OffsetDateTime.now(); // If `schedule_type` is `target_delivery_date`, provide a targeted delivery date for mail pieces in this campaign.
    OffsetDateTime sendDate = OffsetDateTime.now(); // If `schedule_type` is `scheduled_send_date`, provide a date to send this campaign.
    Integer cancelWindowCampaignMinutes = 56; // A window, in minutes, within which the campaign can be canceled.
    Map<String, String> metadata = new HashMap(); // Use metadata to store custom information for tagging and labeling back to your internal systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters and values must be at most 500 characters. Neither can contain the characters `\\\"` and `\\\\`. i.e. '{\\\"customer_id\\\" : \\\"NEWYORK2015\\\"}' Nested objects are not supported.  See [Metadata](#section/Metadata) for more information.
    Boolean isDraft = true; // Whether or not the campaign is still a draft. Can either be excluded or `false`.
    CmpUseType useType = CmpUseType.fromValue("marketing");
    Boolean autoCancelIfNcoa = true; // Whether or not a mail piece should be automatically canceled and not sent if the address is updated via NCOA.
    try {
      Campaign result = client
              .campaigns
              .update(cmpId)
              .description(description)
              .name(name)
              .scheduleType(scheduleType)
              .targetDeliveryDate(targetDeliveryDate)
              .sendDate(sendDate)
              .cancelWindowCampaignMinutes(cancelWindowCampaignMinutes)
              .metadata(metadata)
              .isDraft(isDraft)
              .useType(useType)
              .autoCancelIfNcoa(autoCancelIfNcoa)
              .execute();
      System.out.println(result);
      System.out.println(result.getDateCreated());
      System.out.println(result.getDateModified());
      System.out.println(result.getDeleted());
      System.out.println(result.getObject());
      System.out.println(result.getDescription());
      System.out.println(result.getBillingGroupId());
      System.out.println(result.getName());
      System.out.println(result.getScheduleType());
      System.out.println(result.getTargetDeliveryDate());
      System.out.println(result.getSendDate());
      System.out.println(result.getCancelWindowCampaignMinutes());
      System.out.println(result.getMetadata());
      System.out.println(result.getUseType());
      System.out.println(result.getAutoCancelIfNcoa());
      System.out.println(result.getId());
      System.out.println(result.getIsDraft());
      System.out.println(result.getCreatives());
      System.out.println(result.getUploads());
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#update");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Campaign> response = client
              .campaigns
              .update(cmpId)
              .description(description)
              .name(name)
              .scheduleType(scheduleType)
              .targetDeliveryDate(targetDeliveryDate)
              .sendDate(sendDate)
              .cancelWindowCampaignMinutes(cancelWindowCampaignMinutes)
              .metadata(metadata)
              .isDraft(isDraft)
              .useType(useType)
              .autoCancelIfNcoa(autoCancelIfNcoa)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#update");
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
| **cmpId** | **String**| id of the campaign | |
| **campaignUpdatable** | [**CampaignUpdatable**](CampaignUpdatable.md)|  | |

### Return type

[**Campaign**](Campaign.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a campaign object |  -  |
| **0** | Error |  -  |


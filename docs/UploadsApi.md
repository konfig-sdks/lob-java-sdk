# UploadsApi

All URIs are relative to *https://api.lob.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**callFile**](UploadsApi.md#callFile) | **POST** /uploads/{upl_id}/file | Upload file |
| [**create**](UploadsApi.md#create) | **POST** /uploads | Create |
| [**createExportFile**](UploadsApi.md#createExportFile) | **POST** /uploads/{upl_id}/exports | Create Export |
| [**delete**](UploadsApi.md#delete) | **DELETE** /uploads/{upl_id} | Delete |
| [**list**](UploadsApi.md#list) | **GET** /uploads | List |
| [**retrieve**](UploadsApi.md#retrieve) | **GET** /uploads/{upl_id} | Retrieve |
| [**retrieve_0**](UploadsApi.md#retrieve_0) | **GET** /uploads/{upl_id}/report | Retrieve Line Item Report |
| [**retrieve_1**](UploadsApi.md#retrieve_1) | **GET** /uploads/{upl_id}/exports/{ex_id} | Retrieve Export |
| [**update**](UploadsApi.md#update) | **PATCH** /uploads/{upl_id} | Update |


<a name="callFile"></a>
# **callFile**
> UploadFile callFile(uplId, uploadFileRequest)._file(_file).execute();

Upload file

Upload an [audience file](https://help.lob.com/print-and-mail/building-a-mail-strategy/campaign-or-triggered-sends/campaign-audience-guide) and associate it with an upload.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UploadsApi;
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
    String uplId = "uplId_example"; // ID of the upload
    File _file = new File("/path/to/file");
    try {
      UploadFile result = client
              .uploads
              .callFile(uplId)
              ._file(_file)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
      System.out.println(result.getFilename());
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsApi#callFile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UploadFile> response = client
              .uploads
              .callFile(uplId)
              ._file(_file)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsApi#callFile");
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
| **uplId** | **String**| ID of the upload | |
| **uploadFileRequest** | [**UploadFileRequest**](UploadFileRequest.md)|  | |
| **_file** | **File**|  | [optional] |

### Return type

[**UploadFile**](UploadFile.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful Response |  -  |

<a name="create"></a>
# **create**
> Upload create(uploadWritable).execute();

Create

Creates a new upload with the provided properties.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UploadsApi;
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
    String campaignId = "campaignId_example";
    RequiredAddressColumnMapping requiredAddressColumnMapping = new RequiredAddressColumnMapping();
    OptionalAddressColumnMapping optionalAddressColumnMapping = new OptionalAddressColumnMapping();
    UploadsMetadata metadata = new UploadsMetadata();
    String mergeVariableColumnMapping = new HashMap(); // The mapping of column headers in your file to the merge variables present in your creative. See our <a href=\\\"https://help.lob.com/print-and-mail/building-a-mail-strategy/campaign-or-triggered-sends/campaign-audience-guide#step-3-map-merge-variable-data-if-applicable-7\\\" target=\\\"_blank\\\">Campaign Audience Guide</a> for additional details. <br />If a merge variable has the same \\\"name\\\" as a \\\"key\\\" in the `requiredAddressColumnMapping` or `optionalAddressColumnMapping` objects, then they **CANNOT** have a different value in this object. If a different value is provided, then when the campaign is processing it will get overwritten with the mapped value present in the `requiredAddressColumnMapping` or `optionalAddressColumnMapping` objects. If using customized QR code redirect from the Audience file, then a `qr_code_redirect_url` must be mapped to the column header as used in the CSV.
    try {
      Upload result = client
              .uploads
              .create(campaignId)
              .requiredAddressColumnMapping(requiredAddressColumnMapping)
              .optionalAddressColumnMapping(optionalAddressColumnMapping)
              .metadata(metadata)
              .mergeVariableColumnMapping(mergeVariableColumnMapping)
              .execute();
      System.out.println(result);
      System.out.println(result.getCampaignId());
      System.out.println(result.getRequiredAddressColumnMapping());
      System.out.println(result.getOptionalAddressColumnMapping());
      System.out.println(result.getMetadata());
      System.out.println(result.getMergeVariableColumnMapping());
      System.out.println(result.getId());
      System.out.println(result.getAccountId());
      System.out.println(result.getMode());
      System.out.println(result.getFailuresUrl());
      System.out.println(result.getOriginalFilename());
      System.out.println(result.getState());
      System.out.println(result.getTotalMailpieces());
      System.out.println(result.getFailedMailpieces());
      System.out.println(result.getValidatedMailpieces());
      System.out.println(result.getBytesProcessed());
      System.out.println(result.getDateCreated());
      System.out.println(result.getDateModified());
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsApi#create");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Upload> response = client
              .uploads
              .create(campaignId)
              .requiredAddressColumnMapping(requiredAddressColumnMapping)
              .optionalAddressColumnMapping(optionalAddressColumnMapping)
              .metadata(metadata)
              .mergeVariableColumnMapping(mergeVariableColumnMapping)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsApi#create");
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
| **uploadWritable** | [**UploadWritable**](UploadWritable.md)|  | |

### Return type

[**Upload**](Upload.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Upload created successfully |  -  |

<a name="createExportFile"></a>
# **createExportFile**
> UploadCreateExport createExportFile(uplId, uploadsCreateExportFileRequest).execute();

Create Export

Campaign Exports can help you understand exactly which records in a campaign could not be created. By initiating and retrieving an export, you will get row-by-row errors for your campaign. For a step-by-step walkthrough of creating a campaign and exporting failures, see our [Campaigns Guide](https://help.lob.com/print-and-mail/building-a-mail-strategy/campaign-or-triggered-sends/launch-your-first-campaign).  Create an export file associated with an upload.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UploadsApi;
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
    String uplId = "uplId_example"; // ID of the upload
    String type = "all";
    try {
      UploadCreateExport result = client
              .uploads
              .createExportFile(uplId)
              .type(type)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
      System.out.println(result.getExportId());
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsApi#createExportFile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UploadCreateExport> response = client
              .uploads
              .createExportFile(uplId)
              .type(type)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsApi#createExportFile");
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
| **uplId** | **String**| ID of the upload | |
| **uploadsCreateExportFileRequest** | [**UploadsCreateExportFileRequest**](UploadsCreateExportFileRequest.md)|  | |

### Return type

[**UploadCreateExport**](UploadCreateExport.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="delete"></a>
# **delete**
> delete(uplId).execute();

Delete

Delete an existing upload. You need only supply the unique identifier that was returned upon upload creation.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UploadsApi;
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
    String uplId = "uplId_example"; // id of the upload
    try {
      client
              .uploads
              .delete(uplId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsApi#delete");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .uploads
              .delete(uplId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsApi#delete");
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
| **uplId** | **String**| id of the upload | |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successful Response |  -  |

<a name="list"></a>
# **list**
> List&lt;Upload&gt; list().campaignId(campaignId).execute();

List

Returns a list of your uploads. Optionally, filter uploads by campaign.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UploadsApi;
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
    String campaignId = "campaignId_example"; // id of the campaign
    try {
      List<Upload> result = client
              .uploads
              .list()
              .campaignId(campaignId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Upload>> response = client
              .uploads
              .list()
              .campaignId(campaignId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsApi#list");
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
| **campaignId** | **String**| id of the campaign | [optional] |

### Return type

[**List&lt;Upload&gt;**](Upload.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An array of matching uploads. Each entry in the array is a separate upload. |  -  |

<a name="retrieve"></a>
# **retrieve**
> Upload retrieve(uplId).execute();

Retrieve

Retrieves the details of an existing upload. You need only supply the unique upload identifier that was returned upon upload creation.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UploadsApi;
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
    String uplId = "uplId_example"; // id of the upload
    try {
      Upload result = client
              .uploads
              .retrieve(uplId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCampaignId());
      System.out.println(result.getRequiredAddressColumnMapping());
      System.out.println(result.getOptionalAddressColumnMapping());
      System.out.println(result.getMetadata());
      System.out.println(result.getMergeVariableColumnMapping());
      System.out.println(result.getId());
      System.out.println(result.getAccountId());
      System.out.println(result.getMode());
      System.out.println(result.getFailuresUrl());
      System.out.println(result.getOriginalFilename());
      System.out.println(result.getState());
      System.out.println(result.getTotalMailpieces());
      System.out.println(result.getFailedMailpieces());
      System.out.println(result.getValidatedMailpieces());
      System.out.println(result.getBytesProcessed());
      System.out.println(result.getDateCreated());
      System.out.println(result.getDateModified());
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsApi#retrieve");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Upload> response = client
              .uploads
              .retrieve(uplId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsApi#retrieve");
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
| **uplId** | **String**| id of the upload | |

### Return type

[**Upload**](Upload.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an upload object |  -  |

<a name="retrieve_0"></a>
# **retrieve_0**
> ReportRetrieveResponse retrieve_0(uplId).status(status).limit(limit).offset(offset).execute();

Retrieve Line Item Report

Retrieves the line item data for each row from the csv file associated with the upload id record. NOTE: This endpoint is currently feature flagged. Please reach out to Lob&#39;s support team if you  would like access to this API endpoint.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UploadsApi;
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
    String uplId = "uplId_example"; // ID of the upload
    String status = "Validated"; // The status of line items to filter and retrieve. By default all line items are returned.
    Integer limit = 100; // How many results to return.
    Integer offset = 0; // An integer that designates the offset at which to begin returning results. Defaults to 0.
    try {
      ReportRetrieveResponse result = client
              .uploads
              .retrieve_0(uplId)
              .status(status)
              .limit(limit)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getNextUrl());
      System.out.println(result.getPrevUrl());
      System.out.println(result.getCount());
      System.out.println(result.getTotalCount());
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsApi#retrieve_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReportRetrieveResponse> response = client
              .uploads
              .retrieve_0(uplId)
              .status(status)
              .limit(limit)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsApi#retrieve_0");
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
| **uplId** | **String**| ID of the upload | |
| **status** | **String**| The status of line items to filter and retrieve. By default all line items are returned. | [optional] [enum: Validated, Failed, Processing] |
| **limit** | **Integer**| How many results to return. | [optional] [default to 100] |
| **offset** | **Integer**| An integer that designates the offset at which to begin returning results. Defaults to 0. | [optional] [default to 0] |

### Return type

[**ReportRetrieveResponse**](ReportRetrieveResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an report object |  -  |

<a name="retrieve_1"></a>
# **retrieve_1**
> ExportRetrieveResponse retrieve_1(uplId, exId).execute();

Retrieve Export

Retrieves the details of an existing export. You need only supply the unique export identifier that was returned upon export creation. If you try retrieving an export immediately after creating one (i.e., before we&#39;re done processing the export), you will get back an export object with &#x60;state &#x3D; in_progress&#x60;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UploadsApi;
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
    String uplId = "uplId_example"; // ID of the upload
    String exId = "exId_example"; // ID of the export
    try {
      ExportRetrieveResponse result = client
              .uploads
              .retrieve_1(uplId, exId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDateCreated());
      System.out.println(result.getDateModified());
      System.out.println(result.getDeleted());
      System.out.println(result.getS3Url());
      System.out.println(result.getState());
      System.out.println(result.getType());
      System.out.println(result.getUploadId());
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsApi#retrieve_1");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ExportRetrieveResponse> response = client
              .uploads
              .retrieve_1(uplId, exId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsApi#retrieve_1");
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
| **uplId** | **String**| ID of the upload | |
| **exId** | **String**| ID of the export | |

### Return type

[**ExportRetrieveResponse**](ExportRetrieveResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an export object |  -  |

<a name="update"></a>
# **update**
> Upload update(uplId, uploadUpdatable).execute();

Update

Update the details of an existing upload. You need only supply the unique identifier that was returned upon upload creation.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UploadsApi;
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
    String uplId = "uplId_example"; // id of the upload
    String originalFilename = "originalFilename_example"; // Original filename provided when the upload is created.
    RequiredAddressColumnMapping requiredAddressColumnMapping = new RequiredAddressColumnMapping();
    OptionalAddressColumnMapping optionalAddressColumnMapping = new OptionalAddressColumnMapping();
    UploadsMetadata metadata = new UploadsMetadata();
    String mergeVariableColumnMapping = new HashMap(); // The mapping of column headers in your file to the merge variables present in your creative. See our <a href=\\\"https://help.lob.com/print-and-mail/building-a-mail-strategy/campaign-or-triggered-sends/campaign-audience-guide#step-3-map-merge-variable-data-if-applicable-7\\\" target=\\\"_blank\\\">Campaign Audience Guide</a> for additional details. <br />If a merge variable has the same \\\"name\\\" as a \\\"key\\\" in the `requiredAddressColumnMapping` or `optionalAddressColumnMapping` objects, then they **CANNOT** have a different value in this object. If a different value is provided, then when the campaign is processing it will get overwritten with the mapped value present in the `requiredAddressColumnMapping` or `optionalAddressColumnMapping` objects. If using customized QR code redirect from the Audience file, then a `qr_code_redirect_url` must be mapped to the column header as used in the CSV.
    try {
      Upload result = client
              .uploads
              .update(uplId)
              .originalFilename(originalFilename)
              .requiredAddressColumnMapping(requiredAddressColumnMapping)
              .optionalAddressColumnMapping(optionalAddressColumnMapping)
              .metadata(metadata)
              .mergeVariableColumnMapping(mergeVariableColumnMapping)
              .execute();
      System.out.println(result);
      System.out.println(result.getCampaignId());
      System.out.println(result.getRequiredAddressColumnMapping());
      System.out.println(result.getOptionalAddressColumnMapping());
      System.out.println(result.getMetadata());
      System.out.println(result.getMergeVariableColumnMapping());
      System.out.println(result.getId());
      System.out.println(result.getAccountId());
      System.out.println(result.getMode());
      System.out.println(result.getFailuresUrl());
      System.out.println(result.getOriginalFilename());
      System.out.println(result.getState());
      System.out.println(result.getTotalMailpieces());
      System.out.println(result.getFailedMailpieces());
      System.out.println(result.getValidatedMailpieces());
      System.out.println(result.getBytesProcessed());
      System.out.println(result.getDateCreated());
      System.out.println(result.getDateModified());
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsApi#update");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Upload> response = client
              .uploads
              .update(uplId)
              .originalFilename(originalFilename)
              .requiredAddressColumnMapping(requiredAddressColumnMapping)
              .optionalAddressColumnMapping(optionalAddressColumnMapping)
              .metadata(metadata)
              .mergeVariableColumnMapping(mergeVariableColumnMapping)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsApi#update");
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
| **uplId** | **String**| id of the upload | |
| **uploadUpdatable** | [**UploadUpdatable**](UploadUpdatable.md)|  | |

### Return type

[**Upload**](Upload.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an upload object |  -  |


# BankAccountsApi

All URIs are relative to *https://api.lob.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewBankAccount**](BankAccountsApi.md#createNewBankAccount) | **POST** /bank_accounts | Create |
| [**deleteBankAccount**](BankAccountsApi.md#deleteBankAccount) | **DELETE** /bank_accounts/{bank_id} | Delete |
| [**getDetails**](BankAccountsApi.md#getDetails) | **GET** /bank_accounts/{bank_id} | Retrieve |
| [**getList**](BankAccountsApi.md#getList) | **GET** /bank_accounts | List |
| [**verifyBankAccount**](BankAccountsApi.md#verifyBankAccount) | **POST** /bank_accounts/{bank_id}/verify | Verify |


<a name="createNewBankAccount"></a>
# **createNewBankAccount**
> BankAccount createNewBankAccount(bankAccountBase).execute();

Create

Creates a new bank account with the provided properties. Bank accounts created in live mode will need to be verified via micro deposits before being able to send live checks. The deposits will appear in the bank account in 2-3 business days and have the description \&quot;VERIFICATION\&quot;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BankAccountsApi;
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
    String routingNumber = "routingNumber_example"; // Must be a <a href=\\\"https://www.frbservices.org/index.html\\\" target=\\\"_blank\\\">valid US routing number</a>.
    String accountNumber = "accountNumber_example";
    String accountType = "company"; // The type of entity that holds the account.
    String signatory = "signatory_example"; // The signatory associated with your account. This name will be printed on checks created with this bank account. If you prefer to use a custom signature image on your checks instead, please create your bank account from the <a href=\\\"https://dashboard.lob.com/#/login\\\" target=\\\"_blank\\\">Dashboard</a>.
    String description = "description_example"; // An internal description that identifies this resource. Must be no longer than 255 characters. 
    String checkTemplate = "common"; // The check template used for printing. The defualt value is `common`. If you bank with JP Morgan Chase and wish to use Positive Pay use the `jpm` template. `jpm` requires additional information to be provided.
    String fractionalRoutingNumber = "fractionalRoutingNumber_example"; // The fractional routing number for your home bank account. Required for the `jpm` check template only. Please contact a bank representative if you do not know the fractional routing number associated with your home bank institution.
    String city = "city_example"; // The city associated with your home bank account. Required for the `jpm` check template only. Please contact a bank representative if you do not know the city associated with your home bank institution.
    String state = "state_example"; // The state associated with your home bank account. Required for the `jpm` check template only. Please contact a bank representative if you do not know the state associated with your home bank institution.
    String zipcode = "zipcode_example"; // The zipcode associated with your home bank account. Required for the `jpm` check template only. Please contact a bank representative if you do not know the zipcode associated with your home bank institution.
    Map<String, String> metadata = new HashMap(); // Use metadata to store custom information for tagging and labeling back to your internal systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters and values must be at most 500 characters. Neither can contain the characters `\\\"` and `\\\\`. i.e. '{\\\"customer_id\\\" : \\\"NEWYORK2015\\\"}' Nested objects are not supported.  See [Metadata](#section/Metadata) for more information.
    try {
      BankAccount result = client
              .bankAccounts
              .createNewBankAccount(routingNumber, accountNumber, accountType, signatory)
              .description(description)
              .checkTemplate(checkTemplate)
              .fractionalRoutingNumber(fractionalRoutingNumber)
              .city(city)
              .state(state)
              .zipcode(zipcode)
              .metadata(metadata)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getRoutingNumber());
      System.out.println(result.getAccountNumber());
      System.out.println(result.getAccountType());
      System.out.println(result.getSignatory());
      System.out.println(result.getCheckTemplate());
      System.out.println(result.getFractionalRoutingNumber());
      System.out.println(result.getCity());
      System.out.println(result.getState());
      System.out.println(result.getZipcode());
      System.out.println(result.getMetadata());
      System.out.println(result.getDateCreated());
      System.out.println(result.getDateModified());
      System.out.println(result.getDeleted());
      System.out.println(result.getObject());
      System.out.println(result.getId());
      System.out.println(result.getSignatureUrl());
      System.out.println(result.getBankName());
      System.out.println(result.getVerified());
    } catch (ApiException e) {
      System.err.println("Exception when calling BankAccountsApi#createNewBankAccount");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BankAccount> response = client
              .bankAccounts
              .createNewBankAccount(routingNumber, accountNumber, accountType, signatory)
              .description(description)
              .checkTemplate(checkTemplate)
              .fractionalRoutingNumber(fractionalRoutingNumber)
              .city(city)
              .state(state)
              .zipcode(zipcode)
              .metadata(metadata)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BankAccountsApi#createNewBankAccount");
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
| **bankAccountBase** | [**BankAccountBase**](BankAccountBase.md)|  | |

### Return type

[**BankAccount**](BankAccount.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a bank_account object |  * ratelimit-limit -  <br>  * ratelimit-remaining -  <br>  * ratelimit-reset -  <br>  |
| **0** | Error |  -  |

<a name="deleteBankAccount"></a>
# **deleteBankAccount**
> BankDeletion deleteBankAccount(bankId).execute();

Delete

Permanently deletes a bank account. It cannot be undone.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BankAccountsApi;
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
    BankId bankId = new BankId(); // id of the bank account
    try {
      BankDeletion result = client
              .bankAccounts
              .deleteBankAccount(bankId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getDeleted());
    } catch (ApiException e) {
      System.err.println("Exception when calling BankAccountsApi#deleteBankAccount");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BankDeletion> response = client
              .bankAccounts
              .deleteBankAccount(bankId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BankAccountsApi#deleteBankAccount");
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
| **bankId** | [**BankId**](.md)| id of the bank account | |

### Return type

[**BankDeletion**](BankDeletion.md)

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

<a name="getDetails"></a>
# **getDetails**
> BankAccount getDetails(bankId).execute();

Retrieve

Retrieves the details of an existing bank account. You need only supply the unique bank account identifier that was returned upon bank account creation.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BankAccountsApi;
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
    BankId bankId = new BankId(); // id of the bank account
    try {
      BankAccount result = client
              .bankAccounts
              .getDetails(bankId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getRoutingNumber());
      System.out.println(result.getAccountNumber());
      System.out.println(result.getAccountType());
      System.out.println(result.getSignatory());
      System.out.println(result.getCheckTemplate());
      System.out.println(result.getFractionalRoutingNumber());
      System.out.println(result.getCity());
      System.out.println(result.getState());
      System.out.println(result.getZipcode());
      System.out.println(result.getMetadata());
      System.out.println(result.getDateCreated());
      System.out.println(result.getDateModified());
      System.out.println(result.getDeleted());
      System.out.println(result.getObject());
      System.out.println(result.getId());
      System.out.println(result.getSignatureUrl());
      System.out.println(result.getBankName());
      System.out.println(result.getVerified());
    } catch (ApiException e) {
      System.err.println("Exception when calling BankAccountsApi#getDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BankAccount> response = client
              .bankAccounts
              .getDetails(bankId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BankAccountsApi#getDetails");
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
| **bankId** | [**BankId**](.md)| id of the bank account | |

### Return type

[**BankAccount**](BankAccount.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a bank account object |  -  |
| **0** | Error |  -  |

<a name="getList"></a>
# **getList**
> BankAccountsGetListResponse getList().limit(limit).beforeAfter(beforeAfter).include(include).dateCreated(dateCreated).metadata(metadata).execute();

List

Returns a list of your bank accounts. The bank accounts are returned sorted by creation date, with the most recently created bank accounts appearing first.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BankAccountsApi;
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
    try {
      BankAccountsGetListResponse result = client
              .bankAccounts
              .getList()
              .limit(limit)
              .beforeAfter(beforeAfter)
              .include(include)
              .dateCreated(dateCreated)
              .metadata(metadata)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getNextUrl());
      System.out.println(result.getPreviousUrl());
      System.out.println(result.getCount());
      System.out.println(result.getTotalCount());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling BankAccountsApi#getList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BankAccountsGetListResponse> response = client
              .bankAccounts
              .getList()
              .limit(limit)
              .beforeAfter(beforeAfter)
              .include(include)
              .dateCreated(dateCreated)
              .metadata(metadata)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BankAccountsApi#getList");
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

### Return type

[**BankAccountsGetListResponse**](BankAccountsGetListResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A dictionary with a data property that contains an array of up to &#x60;limit&#x60; bank_accounts. Each entry in the array is a separate bank_account. The previous and next page of bank_accounts can be retrieved by calling the endpoint contained in the &#x60;previous_url&#x60; and &#x60;next_url&#x60; fields in the API response respectively.&lt;br&gt;If no more bank_accounts are available beyond the current set of returned results, the &#x60;next_url&#x60; field will be empty. |  -  |
| **0** | Error |  -  |

<a name="verifyBankAccount"></a>
# **verifyBankAccount**
> BankAccount verifyBankAccount(bankId, bankAccountVerify).execute();

Verify

Verify a bank account in order to create a check.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BankAccountsApi;
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
    List<Integer> amounts = Arrays.asList(); // In live mode, an array containing the two micro deposits (in cents) placed in the bank account. In test mode, no micro deposits will be placed, so any two integers between `1` and `100` will work.
    BankId bankId = new BankId(); // id of the bank account to be verified
    try {
      BankAccount result = client
              .bankAccounts
              .verifyBankAccount(amounts, bankId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getRoutingNumber());
      System.out.println(result.getAccountNumber());
      System.out.println(result.getAccountType());
      System.out.println(result.getSignatory());
      System.out.println(result.getCheckTemplate());
      System.out.println(result.getFractionalRoutingNumber());
      System.out.println(result.getCity());
      System.out.println(result.getState());
      System.out.println(result.getZipcode());
      System.out.println(result.getMetadata());
      System.out.println(result.getDateCreated());
      System.out.println(result.getDateModified());
      System.out.println(result.getDeleted());
      System.out.println(result.getObject());
      System.out.println(result.getId());
      System.out.println(result.getSignatureUrl());
      System.out.println(result.getBankName());
      System.out.println(result.getVerified());
    } catch (ApiException e) {
      System.err.println("Exception when calling BankAccountsApi#verifyBankAccount");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BankAccount> response = client
              .bankAccounts
              .verifyBankAccount(amounts, bankId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BankAccountsApi#verifyBankAccount");
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
| **bankId** | [**BankId**](.md)| id of the bank account to be verified | |
| **bankAccountVerify** | [**BankAccountVerify**](BankAccountVerify.md)|  | |

### Return type

[**BankAccount**](BankAccount.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a bank_account object |  * ratelimit-limit -  <br>  * ratelimit-remaining -  <br>  * ratelimit-reset -  <br>  |
| **0** | Error |  -  |


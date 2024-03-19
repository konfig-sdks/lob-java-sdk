<div align="left">

[![Visit Lob](./header.png)](https://lob.com)

# [Lob](https://lob.com)

The Lob API is organized around REST. Our API is designed to have predictable, resource-oriented URLs and uses HTTP response codes to indicate any API errors. <p>


</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Lob&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>lob-java-sdk</artifactId>
  <version>1.19.28</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:lob-java-sdk:1.19.28"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/lob-java-sdk-1.19.28.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Lob;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountsApi;
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
      LobCreditsBalance result = client
              .accounts
              .getCreditsBalance()
              .execute();
      System.out.println(result);
      System.out.println(result.getBalance());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#getCreditsBalance");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LobCreditsBalance> response = client
              .accounts
              .getCreditsBalance()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#getCreditsBalance");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.lob.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountsApi* | [**getCreditsBalance**](docs/AccountsApi.md#getCreditsBalance) | **GET** /accounts | Get Lob Credits Balance
*AddressesApi* | [**create**](docs/AddressesApi.md#create) | **POST** /addresses | Create
*AddressesApi* | [**delete**](docs/AddressesApi.md#delete) | **DELETE** /addresses/{adr_id} | Delete
*AddressesApi* | [**list**](docs/AddressesApi.md#list) | **GET** /addresses | List
*AddressesApi* | [**retrieve**](docs/AddressesApi.md#retrieve) | **GET** /addresses/{adr_id} | Retrieve
*BankAccountsApi* | [**createNewBankAccount**](docs/BankAccountsApi.md#createNewBankAccount) | **POST** /bank_accounts | Create
*BankAccountsApi* | [**deleteBankAccount**](docs/BankAccountsApi.md#deleteBankAccount) | **DELETE** /bank_accounts/{bank_id} | Delete
*BankAccountsApi* | [**getDetails**](docs/BankAccountsApi.md#getDetails) | **GET** /bank_accounts/{bank_id} | Retrieve
*BankAccountsApi* | [**getList**](docs/BankAccountsApi.md#getList) | **GET** /bank_accounts | List
*BankAccountsApi* | [**verifyBankAccount**](docs/BankAccountsApi.md#verifyBankAccount) | **POST** /bank_accounts/{bank_id}/verify | Verify
*BillingGroupsApi* | [**createNewGroup**](docs/BillingGroupsApi.md#createNewGroup) | **POST** /billing_groups | Create
*BillingGroupsApi* | [**getDetails**](docs/BillingGroupsApi.md#getDetails) | **GET** /billing_groups/{bg_id} | Retrieve
*BillingGroupsApi* | [**list**](docs/BillingGroupsApi.md#list) | **GET** /billing_groups | List
*BillingGroupsApi* | [**updateAttributes**](docs/BillingGroupsApi.md#updateAttributes) | **POST** /billing_groups/{bg_id} | Update
*BuckslipOrdersApi* | [**createNewOrder**](docs/BuckslipOrdersApi.md#createNewOrder) | **POST** /buckslips/{buckslip_id}/orders | Create
*BuckslipOrdersApi* | [**getByBuckslipId**](docs/BuckslipOrdersApi.md#getByBuckslipId) | **GET** /buckslips/{buckslip_id}/orders | Retrieve
*BuckslipsApi* | [**create**](docs/BuckslipsApi.md#create) | **POST** /buckslips | Create
*BuckslipsApi* | [**delete**](docs/BuckslipsApi.md#delete) | **DELETE** /buckslips/{buckslip_id} | Delete
*BuckslipsApi* | [**list**](docs/BuckslipsApi.md#list) | **GET** /buckslips | List
*BuckslipsApi* | [**retrieve**](docs/BuckslipsApi.md#retrieve) | **GET** /buckslips/{buckslip_id} | Retrieve
*BuckslipsApi* | [**update**](docs/BuckslipsApi.md#update) | **PATCH** /buckslips/{buckslip_id} | Update
*CampaignsApi* | [**create**](docs/CampaignsApi.md#create) | **POST** /campaigns | Create
*CampaignsApi* | [**delete**](docs/CampaignsApi.md#delete) | **DELETE** /campaigns/{cmp_id} | Delete
*CampaignsApi* | [**list**](docs/CampaignsApi.md#list) | **GET** /campaigns | List
*CampaignsApi* | [**retrieve**](docs/CampaignsApi.md#retrieve) | **GET** /campaigns/{cmp_id} | Retrieve
*CampaignsApi* | [**send**](docs/CampaignsApi.md#send) | **POST** /campaigns/{cmp_id}/send | Send Campaign
*CampaignsApi* | [**update**](docs/CampaignsApi.md#update) | **PATCH** /campaigns/{cmp_id} | Update
*CardOrdersApi* | [**createNewOrder**](docs/CardOrdersApi.md#createNewOrder) | **POST** /cards/{card_id}/orders | Create
*CardOrdersApi* | [**get**](docs/CardOrdersApi.md#get) | **GET** /cards/{card_id}/orders | Retrieve
*CardsApi* | [**create**](docs/CardsApi.md#create) | **POST** /cards | Create
*CardsApi* | [**delete**](docs/CardsApi.md#delete) | **DELETE** /cards/{card_id} | Delete
*CardsApi* | [**list**](docs/CardsApi.md#list) | **GET** /cards | List
*CardsApi* | [**retrieve**](docs/CardsApi.md#retrieve) | **GET** /cards/{card_id} | Retrieve
*CardsApi* | [**update**](docs/CardsApi.md#update) | **POST** /cards/{card_id} | Update
*ChecksApi* | [**cancel**](docs/ChecksApi.md#cancel) | **DELETE** /checks/{chk_id} | Cancel
*ChecksApi* | [**create**](docs/ChecksApi.md#create) | **POST** /checks | Create
*ChecksApi* | [**list**](docs/ChecksApi.md#list) | **GET** /checks | List
*ChecksApi* | [**retrieve**](docs/ChecksApi.md#retrieve) | **GET** /checks/{chk_id} | Retrieve
*CreativesApi* | [**create**](docs/CreativesApi.md#create) | **POST** /creatives | Create
*CreativesApi* | [**retrieve**](docs/CreativesApi.md#retrieve) | **GET** /creatives/{crv_id} | Retrieve
*CreativesApi* | [**update**](docs/CreativesApi.md#update) | **PATCH** /creatives/{crv_id} | Update
*IdentityValidationApi* | [**validation**](docs/IdentityValidationApi.md#validation) | **POST** /identity_validation | Identity Validation
*IntlAutocompletionsApi* | [**autocompletions**](docs/IntlAutocompletionsApi.md#autocompletions) | **POST** /intl_autocompletions | Autocomplete
*IntlVerificationsApi* | [**verification**](docs/IntlVerificationsApi.md#verification) | **POST** /intl_verifications | Single Verify
*IntlVerificationsApi* | [**verifyBulkAddresses**](docs/IntlVerificationsApi.md#verifyBulkAddresses) | **POST** /bulk/intl_verifications | Bulk Verify
*LettersApi* | [**cancel**](docs/LettersApi.md#cancel) | **DELETE** /letters/{ltr_id} | Cancel
*LettersApi* | [**create**](docs/LettersApi.md#create) | **POST** /letters | Create
*LettersApi* | [**list**](docs/LettersApi.md#list) | **GET** /letters | List
*LettersApi* | [**retrieve**](docs/LettersApi.md#retrieve) | **GET** /letters/{ltr_id} | Retrieve
*LobCreditsApi* | [**getCreditsBalance**](docs/LobCreditsApi.md#getCreditsBalance) | **GET** /accounts | Get Lob Credits Balance
*PostcardsApi* | [**create**](docs/PostcardsApi.md#create) | **POST** /postcards | Create
*PostcardsApi* | [**delete**](docs/PostcardsApi.md#delete) | **DELETE** /postcards/{psc_id} | Cancel
*PostcardsApi* | [**list**](docs/PostcardsApi.md#list) | **GET** /postcards | List
*PostcardsApi* | [**retrieve**](docs/PostcardsApi.md#retrieve) | **GET** /postcards/{psc_id} | Retrieve
*QrCodesApi* | [**getSortedQrCodes**](docs/QrCodesApi.md#getSortedQrCodes) | **GET** /qr_code_analytics | List
*ReverseGeocodeLookupsApi* | [**usLocationWithLiveApiKey**](docs/ReverseGeocodeLookupsApi.md#usLocationWithLiveApiKey) | **POST** /us_reverse_geocode_lookups | Reverse Geocode Lookup
*SelfMailersApi* | [**createNewSelfMailer**](docs/SelfMailersApi.md#createNewSelfMailer) | **POST** /self_mailers | Create
*SelfMailersApi* | [**getDetails**](docs/SelfMailersApi.md#getDetails) | **GET** /self_mailers/{sfm_id} | Retrieve
*SelfMailersApi* | [**getList**](docs/SelfMailersApi.md#getList) | **GET** /self_mailers | List
*SelfMailersApi* | [**removeSelfMailer**](docs/SelfMailersApi.md#removeSelfMailer) | **DELETE** /self_mailers/{sfm_id} | Delete
*SnapPacksApi* | [**createNewSnapPack**](docs/SnapPacksApi.md#createNewSnapPack) | **POST** /snap_packs | Create
*TemplateVersionsApi* | [**createNewVersion**](docs/TemplateVersionsApi.md#createNewVersion) | **POST** /templates/{tmpl_id}/versions | Create
*TemplateVersionsApi* | [**deleteVersion**](docs/TemplateVersionsApi.md#deleteVersion) | **DELETE** /templates/{tmpl_id}/versions/{vrsn_id} | Delete
*TemplateVersionsApi* | [**get**](docs/TemplateVersionsApi.md#get) | **GET** /templates/{tmpl_id}/versions/{vrsn_id} | Retrieve
*TemplateVersionsApi* | [**getList**](docs/TemplateVersionsApi.md#getList) | **GET** /templates/{tmpl_id}/versions | List
*TemplateVersionsApi* | [**updateTemplateVersion**](docs/TemplateVersionsApi.md#updateTemplateVersion) | **POST** /templates/{tmpl_id}/versions/{vrsn_id} | Update
*TemplatesApi* | [**delete**](docs/TemplatesApi.md#delete) | **DELETE** /templates/{tmpl_id} | Delete
*TemplatesApi* | [**list**](docs/TemplatesApi.md#list) | **GET** /templates | List
*TemplatesApi* | [**retrieve**](docs/TemplatesApi.md#retrieve) | **GET** /templates/{tmpl_id} | Retrieve
*TemplatesApi* | [**template**](docs/TemplatesApi.md#template) | **POST** /templates | Create
*TemplatesApi* | [**update**](docs/TemplatesApi.md#update) | **POST** /templates/{tmpl_id} | Update
*UrlShortenerApi* | [**bulkShortenLinks**](docs/UrlShortenerApi.md#bulkShortenLinks) | **POST** /links/shorten/bulk | Bulk Create Links
*UrlShortenerApi* | [**create**](docs/UrlShortenerApi.md#create) | **POST** /domains | Create Domain
*UrlShortenerApi* | [**create_0**](docs/UrlShortenerApi.md#create_0) | **POST** /links/shorten | Create Link
*UrlShortenerApi* | [**delete**](docs/UrlShortenerApi.md#delete) | **DELETE** /domains/{domain_id} | Delete a Domain
*UrlShortenerApi* | [**deleteAllLinksForDomain**](docs/UrlShortenerApi.md#deleteAllLinksForDomain) | **DELETE** /domains/{domain_id}/links | Delete all links for a domain
*UrlShortenerApi* | [**delete_0**](docs/UrlShortenerApi.md#delete_0) | **DELETE** /links/{link_id} | Delete Link
*UrlShortenerApi* | [**get**](docs/UrlShortenerApi.md#get) | **GET** /domains/{domain_id} | Retrieve a domain
*UrlShortenerApi* | [**get_0**](docs/UrlShortenerApi.md#get_0) | **GET** /links/{link_id} | Retrieve a link
*UrlShortenerApi* | [**list**](docs/UrlShortenerApi.md#list) | **GET** /domains | List all domains
*UrlShortenerApi* | [**list_0**](docs/UrlShortenerApi.md#list_0) | **GET** /links | Retrieve all shortened links
*UrlShortenerApi* | [**update**](docs/UrlShortenerApi.md#update) | **PATCH** /links/{link_id} | Update a Link
*UsAutocompletionsApi* | [**getSuggestions**](docs/UsAutocompletionsApi.md#getSuggestions) | **POST** /us_autocompletions | Autocomplete
*UsVerificationsApi* | [**bulkVerifyAddresses**](docs/UsVerificationsApi.md#bulkVerifyAddresses) | **POST** /bulk/us_verifications | Bulk Verify
*UsVerificationsApi* | [**verification**](docs/UsVerificationsApi.md#verification) | **POST** /us_verifications | Single Verify
*UploadsApi* | [**callFile**](docs/UploadsApi.md#callFile) | **POST** /uploads/{upl_id}/file | Upload file
*UploadsApi* | [**create**](docs/UploadsApi.md#create) | **POST** /uploads | Create
*UploadsApi* | [**createExportFile**](docs/UploadsApi.md#createExportFile) | **POST** /uploads/{upl_id}/exports | Create Export
*UploadsApi* | [**delete**](docs/UploadsApi.md#delete) | **DELETE** /uploads/{upl_id} | Delete
*UploadsApi* | [**list**](docs/UploadsApi.md#list) | **GET** /uploads | List
*UploadsApi* | [**retrieve**](docs/UploadsApi.md#retrieve) | **GET** /uploads/{upl_id} | Retrieve
*UploadsApi* | [**retrieve_0**](docs/UploadsApi.md#retrieve_0) | **GET** /uploads/{upl_id}/report | Retrieve Line Item Report
*UploadsApi* | [**retrieve_1**](docs/UploadsApi.md#retrieve_1) | **GET** /uploads/{upl_id}/exports/{ex_id} | Retrieve Export
*UploadsApi* | [**update**](docs/UploadsApi.md#update) | **PATCH** /uploads/{upl_id} | Update
*ZipLookupsApi* | [**lookup**](docs/ZipLookupsApi.md#lookup) | **POST** /us_zip_lookups | Lookups


## Documentation for Models

 - [AddressDeletion](docs/AddressDeletion.md)
 - [AddressEditableIntl](docs/AddressEditableIntl.md)
 - [AddressEditableUs](docs/AddressEditableUs.md)
 - [AddressFieldsIntl](docs/AddressFieldsIntl.md)
 - [AddressFieldsUs](docs/AddressFieldsUs.md)
 - [AddressIntl](docs/AddressIntl.md)
 - [AddressPlacement](docs/AddressPlacement.md)
 - [AddressTypes](docs/AddressTypes.md)
 - [AddressUs](docs/AddressUs.md)
 - [Addresses](docs/Addresses.md)
 - [AddressesListBeforeAfterParameter](docs/AddressesListBeforeAfterParameter.md)
 - [AddressesListBeforeAfterParameterAllOf](docs/AddressesListBeforeAfterParameterAllOf.md)
 - [AddressesListBeforeAfterParameterAllOf1](docs/AddressesListBeforeAfterParameterAllOf1.md)
 - [AddressesListResponse](docs/AddressesListResponse.md)
 - [AddressesListResponseAllOf](docs/AddressesListResponseAllOf.md)
 - [BankAccount](docs/BankAccount.md)
 - [BankAccountAllOf](docs/BankAccountAllOf.md)
 - [BankAccountBase](docs/BankAccountBase.md)
 - [BankAccountTypes](docs/BankAccountTypes.md)
 - [BankAccountVerify](docs/BankAccountVerify.md)
 - [BankAccountsGetListResponse](docs/BankAccountsGetListResponse.md)
 - [BankAccountsGetListResponseAllOf](docs/BankAccountsGetListResponseAllOf.md)
 - [BankDeletion](docs/BankDeletion.md)
 - [BankId](docs/BankId.md)
 - [BillingGroup](docs/BillingGroup.md)
 - [BillingGroupAllOf](docs/BillingGroupAllOf.md)
 - [BillingGroupBase](docs/BillingGroupBase.md)
 - [BillingGroupEditable](docs/BillingGroupEditable.md)
 - [BillingGroupsListResponse](docs/BillingGroupsListResponse.md)
 - [BillingGroupsListResponseAllOf](docs/BillingGroupsListResponseAllOf.md)
 - [BillingGroupsListSortByParameter](docs/BillingGroupsListSortByParameter.md)
 - [BillingGroupsListSortByParameterAllOf](docs/BillingGroupsListSortByParameterAllOf.md)
 - [BillingGroupsListSortByParameterAllOf1](docs/BillingGroupsListSortByParameterAllOf1.md)
 - [Buckslip](docs/Buckslip.md)
 - [BuckslipAllOf](docs/BuckslipAllOf.md)
 - [BuckslipBase](docs/BuckslipBase.md)
 - [BuckslipDeletion](docs/BuckslipDeletion.md)
 - [BuckslipEditable](docs/BuckslipEditable.md)
 - [BuckslipEditableAllOf](docs/BuckslipEditableAllOf.md)
 - [BuckslipOrder](docs/BuckslipOrder.md)
 - [BuckslipOrderAllOf](docs/BuckslipOrderAllOf.md)
 - [BuckslipOrderEditable](docs/BuckslipOrderEditable.md)
 - [BuckslipOrdersGetByBuckslipIdResponse](docs/BuckslipOrdersGetByBuckslipIdResponse.md)
 - [BuckslipOrdersGetByBuckslipIdResponseAllOf](docs/BuckslipOrdersGetByBuckslipIdResponseAllOf.md)
 - [BuckslipUpdatable](docs/BuckslipUpdatable.md)
 - [BuckslipsListResponse](docs/BuckslipsListResponse.md)
 - [BuckslipsListResponseAllOf](docs/BuckslipsListResponseAllOf.md)
 - [Campaign](docs/Campaign.md)
 - [CampaignAllOf](docs/CampaignAllOf.md)
 - [CampaignDeleteResponse](docs/CampaignDeleteResponse.md)
 - [CampaignItem](docs/CampaignItem.md)
 - [CampaignItemAllOf](docs/CampaignItemAllOf.md)
 - [CampaignUpdatable](docs/CampaignUpdatable.md)
 - [CampaignWritable](docs/CampaignWritable.md)
 - [CampaignsListResponse](docs/CampaignsListResponse.md)
 - [CampaignsListResponseAllOf](docs/CampaignsListResponseAllOf.md)
 - [Card](docs/Card.md)
 - [CardAllOf](docs/CardAllOf.md)
 - [CardBase](docs/CardBase.md)
 - [CardDeletion](docs/CardDeletion.md)
 - [CardEditable](docs/CardEditable.md)
 - [CardOrder](docs/CardOrder.md)
 - [CardOrderAllOf](docs/CardOrderAllOf.md)
 - [CardOrderEditable](docs/CardOrderEditable.md)
 - [CardOrdersGetResponse](docs/CardOrdersGetResponse.md)
 - [CardOrdersGetResponseAllOf](docs/CardOrdersGetResponseAllOf.md)
 - [CardUpdatable](docs/CardUpdatable.md)
 - [CardsListResponse](docs/CardsListResponse.md)
 - [CardsListResponseAllOf](docs/CardsListResponseAllOf.md)
 - [Certified](docs/Certified.md)
 - [CertifiedAllOf](docs/CertifiedAllOf.md)
 - [Check](docs/Check.md)
 - [CheckAllOf](docs/CheckAllOf.md)
 - [CheckBase](docs/CheckBase.md)
 - [CheckBaseAllOf](docs/CheckBaseAllOf.md)
 - [CheckDeletion](docs/CheckDeletion.md)
 - [CheckEditableProps](docs/CheckEditableProps.md)
 - [CheckEditablePropsAllOf](docs/CheckEditablePropsAllOf.md)
 - [CheckInputTo](docs/CheckInputTo.md)
 - [CheckTypes](docs/CheckTypes.md)
 - [ChecksListResponse](docs/ChecksListResponse.md)
 - [ChecksListResponseAllOf](docs/ChecksListResponseAllOf.md)
 - [ChecksListSortByParameter](docs/ChecksListSortByParameter.md)
 - [ChecksListSortByParameterAllOf](docs/ChecksListSortByParameterAllOf.md)
 - [ChecksListSortByParameterAllOf1](docs/ChecksListSortByParameterAllOf1.md)
 - [ChkUseType](docs/ChkUseType.md)
 - [City](docs/City.md)
 - [CmpScheduleType](docs/CmpScheduleType.md)
 - [CmpUseType](docs/CmpUseType.md)
 - [CompanyInput](docs/CompanyInput.md)
 - [CompanyInputAllOf](docs/CompanyInputAllOf.md)
 - [CompanyValidation](docs/CompanyValidation.md)
 - [Components](docs/Components.md)
 - [CountryExtended](docs/CountryExtended.md)
 - [Creative](docs/Creative.md)
 - [CreativeAllOf](docs/CreativeAllOf.md)
 - [CreativeBase](docs/CreativeBase.md)
 - [CustomEnvelopeReturned](docs/CustomEnvelopeReturned.md)
 - [DeliverabilityAnalysis](docs/DeliverabilityAnalysis.md)
 - [DomainResponse](docs/DomainResponse.md)
 - [Domains](docs/Domains.md)
 - [DomainsResponse](docs/DomainsResponse.md)
 - [DpvFootnote](docs/DpvFootnote.md)
 - [Editable](docs/Editable.md)
 - [EditableNoMailtype](docs/EditableNoMailtype.md)
 - [Engine](docs/Engine.md)
 - [Error](docs/Error.md)
 - [ErrorError](docs/ErrorError.md)
 - [EventType](docs/EventType.md)
 - [Events](docs/Events.md)
 - [ExportRetrieveResponse](docs/ExportRetrieveResponse.md)
 - [ExtraService](docs/ExtraService.md)
 - [FailureReason](docs/FailureReason.md)
 - [FailureReasonError](docs/FailureReasonError.md)
 - [FailureStatusCode](docs/FailureStatusCode.md)
 - [From](docs/From.md)
 - [FromUs](docs/FromUs.md)
 - [Generated](docs/Generated.md)
 - [InlineAddressIntl](docs/InlineAddressIntl.md)
 - [InlineAddressUs](docs/InlineAddressUs.md)
 - [InlineAddressUsChk](docs/InlineAddressUsChk.md)
 - [InputFrom](docs/InputFrom.md)
 - [InputFromUs](docs/InputFromUs.md)
 - [InputTo](docs/InputTo.md)
 - [IntlAutocompletions](docs/IntlAutocompletions.md)
 - [IntlAutocompletionsWritable](docs/IntlAutocompletionsWritable.md)
 - [IntlComponents](docs/IntlComponents.md)
 - [IntlSuggestions](docs/IntlSuggestions.md)
 - [IntlVerification](docs/IntlVerification.md)
 - [IntlVerificationAllOf](docs/IntlVerificationAllOf.md)
 - [IntlVerificationBase](docs/IntlVerificationBase.md)
 - [IntlVerifications](docs/IntlVerifications.md)
 - [IntlVerificationsPayload](docs/IntlVerificationsPayload.md)
 - [LetterAddOnTypes](docs/LetterAddOnTypes.md)
 - [LetterDeletion](docs/LetterDeletion.md)
 - [LetterDetailsReturned](docs/LetterDetailsReturned.md)
 - [LetterDetailsWritable](docs/LetterDetailsWritable.md)
 - [LetterEditable](docs/LetterEditable.md)
 - [LetterEditableAllOf](docs/LetterEditableAllOf.md)
 - [LetterGeneratedBase](docs/LetterGeneratedBase.md)
 - [LetterGeneratedBaseAllOf](docs/LetterGeneratedBaseAllOf.md)
 - [LetterTypes](docs/LetterTypes.md)
 - [LettersListResponse](docs/LettersListResponse.md)
 - [LettersListResponseAllOf](docs/LettersListResponseAllOf.md)
 - [LinkResponse](docs/LinkResponse.md)
 - [LinkSingle](docs/LinkSingle.md)
 - [LinksResponse](docs/LinksResponse.md)
 - [List](docs/List.md)
 - [LobBase](docs/LobBase.md)
 - [LobConfidenceScore](docs/LobConfidenceScore.md)
 - [LobCreditsBalance](docs/LobCreditsBalance.md)
 - [Location](docs/Location.md)
 - [LocationAnalysis](docs/LocationAnalysis.md)
 - [LtrSize](docs/LtrSize.md)
 - [LtrUseType](docs/LtrUseType.md)
 - [MailType](docs/MailType.md)
 - [MultipleComponents](docs/MultipleComponents.md)
 - [MultipleComponentsAllOf](docs/MultipleComponentsAllOf.md)
 - [MultipleComponentsIntl](docs/MultipleComponentsIntl.md)
 - [MultipleComponentsIntlAllOf](docs/MultipleComponentsIntlAllOf.md)
 - [MultipleComponentsList](docs/MultipleComponentsList.md)
 - [NoExtraService](docs/NoExtraService.md)
 - [NoExtraServiceAllOf](docs/NoExtraServiceAllOf.md)
 - [OptionalAddressColumnMapping](docs/OptionalAddressColumnMapping.md)
 - [Postcard](docs/Postcard.md)
 - [PostcardAllOf](docs/PostcardAllOf.md)
 - [PostcardBase](docs/PostcardBase.md)
 - [PostcardBaseAllOf](docs/PostcardBaseAllOf.md)
 - [PostcardDeletion](docs/PostcardDeletion.md)
 - [PostcardEditable](docs/PostcardEditable.md)
 - [PostcardEditableAllOf](docs/PostcardEditableAllOf.md)
 - [PostcardSize](docs/PostcardSize.md)
 - [PostcardTypes](docs/PostcardTypes.md)
 - [PostcardsListResponse](docs/PostcardsListResponse.md)
 - [PostcardsListResponseAllOf](docs/PostcardsListResponseAllOf.md)
 - [PscUseType](docs/PscUseType.md)
 - [QrCode](docs/QrCode.md)
 - [QrCodeCampaigns](docs/QrCodeCampaigns.md)
 - [QrCodeScans](docs/QrCodeScans.md)
 - [QrCodeScansAllOf](docs/QrCodeScansAllOf.md)
 - [QrCodesGetSortedQrCodesResponse](docs/QrCodesGetSortedQrCodesResponse.md)
 - [QrCodesGetSortedQrCodesResponseAllOf](docs/QrCodesGetSortedQrCodesResponseAllOf.md)
 - [RecipientInput](docs/RecipientInput.md)
 - [RecipientInputAllOf](docs/RecipientInputAllOf.md)
 - [RecipientValidation](docs/RecipientValidation.md)
 - [Registered](docs/Registered.md)
 - [RegisteredAllOf](docs/RegisteredAllOf.md)
 - [ReportRetrieveResponse](docs/ReportRetrieveResponse.md)
 - [ReportRetrieveResponseDataInner](docs/ReportRetrieveResponseDataInner.md)
 - [RequiredAddressColumnMapping](docs/RequiredAddressColumnMapping.md)
 - [Returned](docs/Returned.md)
 - [ReverseGeocode](docs/ReverseGeocode.md)
 - [Scans](docs/Scans.md)
 - [SelfMailer](docs/SelfMailer.md)
 - [SelfMailerAllOf](docs/SelfMailerAllOf.md)
 - [SelfMailerBase](docs/SelfMailerBase.md)
 - [SelfMailerBaseAllOf](docs/SelfMailerBaseAllOf.md)
 - [SelfMailerDeletion](docs/SelfMailerDeletion.md)
 - [SelfMailerDetailsReturned](docs/SelfMailerDetailsReturned.md)
 - [SelfMailerDetailsWritable](docs/SelfMailerDetailsWritable.md)
 - [SelfMailerEditable](docs/SelfMailerEditable.md)
 - [SelfMailerEditableAllOf](docs/SelfMailerEditableAllOf.md)
 - [SelfMailerSize](docs/SelfMailerSize.md)
 - [SelfMailerTypes](docs/SelfMailerTypes.md)
 - [SelfMailersGetListResponse](docs/SelfMailersGetListResponse.md)
 - [SelfMailersGetListResponseAllOf](docs/SelfMailersGetListResponseAllOf.md)
 - [SfmUseType](docs/SfmUseType.md)
 - [SingleLineAddress](docs/SingleLineAddress.md)
 - [SingleLineAddressIntl](docs/SingleLineAddressIntl.md)
 - [SnapPack](docs/SnapPack.md)
 - [SnapPackAllOf](docs/SnapPackAllOf.md)
 - [SnapPackBase](docs/SnapPackBase.md)
 - [SnapPackBaseAllOf](docs/SnapPackBaseAllOf.md)
 - [SnapPackEditable](docs/SnapPackEditable.md)
 - [SnapPackEditableAllOf](docs/SnapPackEditableAllOf.md)
 - [SnapPackSize](docs/SnapPackSize.md)
 - [SnapPackUseType](docs/SnapPackUseType.md)
 - [Status](docs/Status.md)
 - [Suggestions](docs/Suggestions.md)
 - [Template](docs/Template.md)
 - [TemplateDeletion](docs/TemplateDeletion.md)
 - [TemplatePublishedVersion](docs/TemplatePublishedVersion.md)
 - [TemplateUpdate](docs/TemplateUpdate.md)
 - [TemplateVersion](docs/TemplateVersion.md)
 - [TemplateVersionAllOf](docs/TemplateVersionAllOf.md)
 - [TemplateVersionDeletion](docs/TemplateVersionDeletion.md)
 - [TemplateVersionUpdatable](docs/TemplateVersionUpdatable.md)
 - [TemplateVersionWritable](docs/TemplateVersionWritable.md)
 - [TemplateVersionsGetListResponse](docs/TemplateVersionsGetListResponse.md)
 - [TemplateVersionsGetListResponseAllOf](docs/TemplateVersionsGetListResponseAllOf.md)
 - [TemplateWritable](docs/TemplateWritable.md)
 - [TemplatesListResponse](docs/TemplatesListResponse.md)
 - [TemplatesListResponseAllOf](docs/TemplatesListResponseAllOf.md)
 - [Thumbnail](docs/Thumbnail.md)
 - [ToAddressUsChk](docs/ToAddressUsChk.md)
 - [TrackingEventBase](docs/TrackingEventBase.md)
 - [TrackingEventCertified](docs/TrackingEventCertified.md)
 - [TrackingEventCertifiedAllOf](docs/TrackingEventCertifiedAllOf.md)
 - [TrackingEventDetails](docs/TrackingEventDetails.md)
 - [TrackingEventNormal](docs/TrackingEventNormal.md)
 - [TrackingEventNormalAllOf](docs/TrackingEventNormalAllOf.md)
 - [Upload](docs/Upload.md)
 - [UploadAllOf](docs/UploadAllOf.md)
 - [UploadCreateExport](docs/UploadCreateExport.md)
 - [UploadFile](docs/UploadFile.md)
 - [UploadFileRequest](docs/UploadFileRequest.md)
 - [UploadState](docs/UploadState.md)
 - [UploadUpdatable](docs/UploadUpdatable.md)
 - [UploadWritable](docs/UploadWritable.md)
 - [UploadsCreateExportFileRequest](docs/UploadsCreateExportFileRequest.md)
 - [UploadsMetadata](docs/UploadsMetadata.md)
 - [UsAutocompletions](docs/UsAutocompletions.md)
 - [UsAutocompletionsWritable](docs/UsAutocompletionsWritable.md)
 - [UsComponents](docs/UsComponents.md)
 - [UsVerification](docs/UsVerification.md)
 - [UsVerifications](docs/UsVerifications.md)
 - [Writable](docs/Writable.md)
 - [Zip](docs/Zip.md)
 - [Zip5](docs/Zip5.md)
 - [ZipAllOf](docs/ZipAllOf.md)
 - [ZipCodeType](docs/ZipCodeType.md)
 - [ZipLookupCity](docs/ZipLookupCity.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)

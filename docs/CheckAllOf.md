

# CheckAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier prefixed with &#x60;chk_&#x60;. |  |
|**amount** | **Float** | The payment amount to be sent in US dollars. |  |
|**bankAccount** | [**BankAccount**](BankAccount.md) |  |  |
|**checkBottomTemplateId** | [**Object**](Object.md) |  |  [optional] |
|**attachmentTemplateId** | [**Object**](Object.md) |  |  [optional] |
|**checkBottomTemplateVersionId** | [**String**](String.md) |  |  [optional] |
|**attachmentTemplateVersionId** | [**String**](String.md) |  |  [optional] |
|**url** | **String** | A [signed link](#section/Asset-URLs) served over HTTPS. The link returned will expire in 30 days to prevent mis-sharing. Each time a GET request is initiated, a new signed URL will be generated. |  |
|**to** | [**ToAddressUsChk**](ToAddressUsChk.md) |  |  |
|**carrier** | [**CarrierEnum**](#CarrierEnum) |  |  |
|**thumbnails** | [**List&lt;Thumbnail&gt;**](Thumbnail.md) |  |  [optional] |
|**expectedDeliveryDate** | **LocalDate** | A date in YYYY-MM-DD format of the mailpiece&#39;s expected delivery date based on its &#x60;send_date&#x60;. |  [optional] |
|**trackingEvents** | [**List&lt;TrackingEventNormal&gt;**](TrackingEventNormal.md) | An array of tracking_event objects ordered by ascending &#x60;time&#x60;. Will not be populated for checks created in test mode. |  [optional] |
|**useType** | **ChkUseType** |  |  |
|**status** | **Status** |  |  [optional] |
|**failureReason** | [**FailureReason**](FailureReason.md) |  |  [optional] |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Value is resource type. |  [optional] |
|**dateCreated** | **OffsetDateTime** | A timestamp in ISO 8601 format of the date the resource was created. |  |
|**dateModified** | **OffsetDateTime** | A timestamp in ISO 8601 format of the date the resource was last modified. |  |
|**deleted** | **Boolean** | Only returned if the resource has been successfully deleted. |  [optional] |



## Enum: CarrierEnum

| Name | Value |
|---- | -----|
| USPS | &quot;USPS&quot; |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| CHECK | &quot;check&quot; |






# LetterGeneratedBaseAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**url** | **String** | A [signed link](#section/Asset-URLs) served over HTTPS. The link returned will expire in 30 days to prevent mis-sharing. Each time a GET request is initiated, a new signed URL will be generated. |  [optional] |
|**id** | **String** | Unique identifier prefixed with &#x60;ltr_&#x60;. |  |
|**templateId** | [**Object**](Object.md) |  |  [optional] |
|**templateVersionId** | [**String**](String.md) |  |  [optional] |
|**campaignId** | **String** | Denotes resources created by the provided campaign id, prefixed with &#x60;cmp_&#x60;. In the case of snap packs and letters with size &#x60;us_legal&#x60;, the campaign id is prefixed with &#x60;camp_&#x60; instead of &#x60;cmp_&#x60;. |  [optional] |
|**useType** | **LtrUseType** |  |  |
|**fsc** | **Boolean** | This is in beta. Contact support@lob.com or your account contact to learn more. Not available for &#x60;A4&#x60; letter size. |  [optional] |
|**status** | **Status** |  |  [optional] |
|**failureReason** | [**FailureReason**](FailureReason.md) |  |  [optional] |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Value is resource type. |  [optional] |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| LETTER | &quot;letter&quot; |




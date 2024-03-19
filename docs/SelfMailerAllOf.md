

# SelfMailerAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier prefixed with &#x60;sfm_&#x60;. |  |
|**outsideTemplateId** | [**String**](String.md) | The unique ID of the HTML template used for the outside of the self mailer. |  [optional] |
|**insideTemplateId** | [**String**](String.md) | The unique ID of the HTML template used for the inside of the self mailer. |  [optional] |
|**outsideTemplateVersionId** | [**String**](String.md) | The unique ID of the specific version of the HTML template used for the outside of the self mailer. |  [optional] |
|**insideTemplateVersionId** | [**String**](String.md) | The unique ID of the specific version of the HTML template used for the inside of the self mailer. |  [optional] |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Value is resource type. |  [optional] |
|**trackingEvents** | [**List&lt;TrackingEventCertified&gt;**](TrackingEventCertified.md) | An array of certified tracking events ordered by ascending &#x60;time&#x60;. Not populated in test mode. |  [optional] |
|**useType** | **SfmUseType** |  |  |
|**url** | **String** | A [signed link](#section/Asset-URLs) served over HTTPS. The link returned will expire in 30 days to prevent mis-sharing. Each time a GET request is initiated, a new signed URL will be generated. |  |
|**fsc** | **Boolean** | This is in beta. Contact support@lob.com or your account contact to learn more. Not available for &#x60;11x9_bifold&#x60; self-mailer size. |  [optional] |
|**status** | **Status** |  |  [optional] |
|**campaignId** | **String** | Denotes resources created by the provided campaign id, prefixed with &#x60;cmp_&#x60;. In the case of snap packs and letters with size &#x60;us_legal&#x60;, the campaign id is prefixed with &#x60;camp_&#x60; instead of &#x60;cmp_&#x60;. |  [optional] |
|**failureReason** | [**FailureReason**](FailureReason.md) |  |  [optional] |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| SELF_MAILER | &quot;self_mailer&quot; |




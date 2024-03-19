

# PostcardAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier prefixed with &#x60;psc_&#x60;. |  |
|**frontTemplateId** | **String** | The unique ID of the HTML template used for the front of the postcard. Only filled out when the request contains a valid postcard template ID. |  |
|**backTemplateId** | **String** | The unique ID of the HTML template used for the back of the postcard. Only filled out when the request contains a valid postcard template ID. |  |
|**frontTemplateVersionId** | **String** | The unique ID of the specific version of the HTML template used for the front of the postcard. Only filled out when the request contains a valid postcard template ID. |  [optional] |
|**backTemplateVersionId** | **String** | The unique ID of the specific version of the HTML template used for the back of the postcard. Only filled out when the request contains a valid postcard template ID. |  [optional] |
|**trackingEvents** | [**List&lt;TrackingEventNormal&gt;**](TrackingEventNormal.md) | An array of tracking_event objects ordered by ascending &#x60;time&#x60;. Will not be populated for postcards created in test mode. |  [optional] |
|**url** | **String** | A [signed link](#section/Asset-URLs) served over HTTPS. The link returned will expire in 30 days to prevent mis-sharing. Each time a GET request is initiated, a new signed URL will be generated. |  |
|**campaignId** | **String** | Denotes resources created by the provided campaign id, prefixed with &#x60;cmp_&#x60;. In the case of snap packs and letters with size &#x60;us_legal&#x60;, the campaign id is prefixed with &#x60;camp_&#x60; instead of &#x60;cmp_&#x60;. |  [optional] |
|**useType** | **PscUseType** |  |  [optional] |
|**fsc** | **Boolean** | This is in beta. Contact support@lob.com or your account contact to learn more. Not available for &#x60;4x6&#x60; or &#x60;A5&#x60; postcard sizes. |  [optional] |
|**status** | **Status** |  |  [optional] |
|**failureReason** | [**FailureReason**](FailureReason.md) |  |  [optional] |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Value is resource type. |  [optional] |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| POSTCARD | &quot;postcard&quot; |




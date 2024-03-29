

# Postcard


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | An internal description that identifies this resource. Must be no longer than 255 characters.  |  [optional] |
|**metadata** | **Map&lt;String, String&gt;** | Use metadata to store custom information for tagging and labeling back to your internal systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters and values must be at most 500 characters. Neither can contain the characters &#x60;\&quot;&#x60; and &#x60;\\&#x60;. i.e. &#39;{\&quot;customer_id\&quot; : \&quot;NEWYORK2015\&quot;}&#39; Nested objects are not supported.  See [Metadata](#section/Metadata) for more information. |  [optional] |
|**mailType** | **MailType** |  |  [optional] |
|**mergeVariables** | **String** | You can input a merge variable payload object to your template to render dynamic content. For example, if you have a template like: &#x60;{{variable_name}}&#x60;, pass in &#x60;{\&quot;variable_name\&quot;: \&quot;Harry\&quot;}&#x60; to render &#x60;Harry&#x60;. &#x60;merge_variables&#x60; must be an object. Any type of value is accepted as long as the object is valid JSON; you can use &#x60;strings&#x60;, &#x60;numbers&#x60;, &#x60;booleans&#x60;, &#x60;arrays&#x60;, &#x60;objects&#x60;, or &#x60;null&#x60;. The max length of the object is 25,000 characters. If you call &#x60;JSON.stringify&#x60; on your object, it can be no longer than 25,000 characters. Your variable names cannot contain any whitespace or any of the following special characters: &#x60;!&#x60;, &#x60;\&quot;&#x60;, &#x60;#&#x60;, &#x60;%&#x60;, &#x60;&amp;&#x60;, &#x60;&#39;&#x60;, &#x60;(&#x60;, &#x60;)&#x60;, &#x60;*&#x60;, &#x60;+&#x60;, &#x60;,&#x60;, &#x60;/&#x60;, &#x60;;&#x60;, &#x60;&lt;&#x60;, &#x60;&#x3D;&#x60;, &#x60;&gt;&#x60;, &#x60;@&#x60;, &#x60;[&#x60;, &#x60;\\&#x60;, &#x60;]&#x60;, &#x60;^&#x60;, &#x60;&#x60; &#x60; &#x60;&#x60;, &#x60;{&#x60;, &#x60;|&#x60;, &#x60;}&#x60;, &#x60;~&#x60;. More instructions can be found in &lt;a href&#x3D;\&quot;https://help.lob.com/print-and-mail/designing-mail-creatives/dynamic-personalization#using-html-and-merge-variables-10\&quot; target&#x3D;\&quot;_blank\&quot;&gt;our guide to using html and merge variables&lt;/a&gt;. Depending on your &lt;a href&#x3D;\&quot;https://dashboard.lob.com/#/settings/account\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Merge Variable strictness&lt;/a&gt; setting, if you define variables in your HTML but do not pass them here, you will either receive an error or the variable will render as an empty string. |  [optional] |
|**sendDate** | **Object** |  |  [optional] |
|**size** | **PostcardSize** |  |  [optional] |
|**to** | **Object** |  |  |
|**carrier** | [**CarrierEnum**](#CarrierEnum) |  |  |
|**thumbnails** | [**List&lt;Thumbnail&gt;**](Thumbnail.md) |  |  [optional] |
|**expectedDeliveryDate** | **LocalDate** | A date in YYYY-MM-DD format of the mailpiece&#39;s expected delivery date based on its &#x60;send_date&#x60;. |  [optional] |
|**dateCreated** | **OffsetDateTime** | A timestamp in ISO 8601 format of the date the resource was created. |  [optional] |
|**dateModified** | **OffsetDateTime** | A timestamp in ISO 8601 format of the date the resource was last modified. |  [optional] |
|**deleted** | **Boolean** | Only returned if the resource has been successfully deleted. |  [optional] |
|**from** | [**AddressUs**](AddressUs.md) |  |  [optional] |
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



## Enum: CarrierEnum

| Name | Value |
|---- | -----|
| USPS | &quot;USPS&quot; |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| POSTCARD | &quot;postcard&quot; |




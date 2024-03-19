

# CreativeAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**deleted** | **Boolean** | Whether the resource has been deleted. |  |
|**id** | **String** | Unique identifier prefixed with &#x60;crv_&#x60;. |  |
|**templatePreviewUrls** | **String** | Preview URLs associated with a creative&#39;s artwork asset(s) if the creative uses HTML templates as assets. An empty object will be returned if no &#x60;template_preview&#x60;s have been generated. |  |
|**templatePreviews** | **List&lt;String&gt;** | A list of template preview objects if the creative uses HTML template(s) as artwork asset(s). An empty array will be returned if no &#x60;template_preview&#x60;s have been generated for the creative. |  |
|**campaigns** | [**List&lt;CampaignItem&gt;**](CampaignItem.md) | Array of campaigns associated with the creative ID |  |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Value is resource type. |  |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| CREATIVE | &quot;creative&quot; |




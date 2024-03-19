

# CampaignItemAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier prefixed with &#x60;cmp_&#x60;. |  |
|**isDraft** | **Boolean** | Whether or not the campaign is still a draft. |  |
|**creatives** | **List** | An array of creatives that have been associated with this campaign. |  |
|**uploads** | **List** | A single-element array containing the upload object that is assocated with this campaign. |  |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Value is resource type. |  |
|**dateCreated** | **OffsetDateTime** | A timestamp in ISO 8601 format of the date the resource was created. |  |
|**dateModified** | **OffsetDateTime** | A timestamp in ISO 8601 format of the date the resource was last modified. |  |
|**deleted** | **Boolean** | Only returned if the resource has been successfully deleted. |  [optional] |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| CAMPAIGN | &quot;campaign&quot; |




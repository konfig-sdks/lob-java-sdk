

# UploadAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier prefixed with &#x60;upl_&#x60;. |  |
|**accountId** | **String** | Account ID that made the request |  |
|**mode** | [**ModeEnum**](#ModeEnum) | The environment in which the mailpieces were created. Today, will only be &#x60;live&#x60;. |  |
|**failuresUrl** | **String** | Url where your campaign mailpiece failures can be retrieved |  [optional] |
|**originalFilename** | **String** | Filename of the upload |  [optional] |
|**state** | **UploadState** |  |  |
|**totalMailpieces** | **Integer** | Total number of recipients for the campaign |  |
|**failedMailpieces** | **Integer** | Number of mailpieces that failed to create |  |
|**validatedMailpieces** | **Integer** | Number of mailpieces that were successfully created |  |
|**bytesProcessed** | **Integer** | Number of bytes processed in your CSV |  |
|**dateCreated** | **OffsetDateTime** | A timestamp in ISO 8601 format of the date the upload was created |  |
|**dateModified** | **OffsetDateTime** | A timestamp in ISO 8601 format of the date the upload was last modified |  |



## Enum: ModeEnum

| Name | Value |
|---- | -----|
| TEST | &quot;test&quot; |
| LIVE | &quot;live&quot; |






# CardAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier prefixed with &#x60;card_&#x60;. |  |
|**url** | **URI** | The signed link for the card. |  |
|**autoReorder** | **Boolean** | True if the cards should be auto-reordered. |  |
|**reorderQuantity** | **Integer** | The number of cards to be reordered. |  |
|**rawUrl** | **URI** | The raw URL of the card. |  |
|**frontOriginalUrl** | **URI** | The original URL of the front template. |  |
|**backOriginalUrl** | **URI** | The original URL of the back template. |  |
|**thumbnails** | [**List&lt;Thumbnail&gt;**](Thumbnail.md) |  |  |
|**availableQuantity** | **Integer** | The available quantity of cards. |  |
|**pendingQuantity** | **Integer** | The pending quantity of cards. |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**orientation** | [**OrientationEnum**](#OrientationEnum) | The orientation of the card. |  |
|**thresholdAmount** | **Integer** | The threshold amount of the card |  |
|**_object** | [**ObjectEnum**](#ObjectEnum) | object |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PROCESSED | &quot;processed&quot; |
| RENDERED | &quot;rendered&quot; |



## Enum: OrientationEnum

| Name | Value |
|---- | -----|
| HORIZONTAL | &quot;horizontal&quot; |
| VERTICAL | &quot;vertical&quot; |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| CARD | &quot;card&quot; |




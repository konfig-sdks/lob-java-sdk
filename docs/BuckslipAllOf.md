

# BuckslipAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier prefixed with &#x60;bck_&#x60;. |  |
|**autoReorder** | **Boolean** | True if the buckslips should be auto-reordered. |  |
|**reorderQuantity** | **Integer** | The number of buckslips to be reordered. |  |
|**thresholdAmount** | **Integer** | The threshold amount of the buckslip |  |
|**url** | **URI** | The signed link for the buckslip. |  |
|**rawUrl** | **URI** | The raw URL of the buckslip. |  |
|**frontOriginalUrl** | **URI** | The original URL of the front template. |  |
|**backOriginalUrl** | **URI** | The original URL of the back template. |  |
|**thumbnails** | [**List&lt;Thumbnail&gt;**](Thumbnail.md) |  |  |
|**availableQuantity** | **Double** | The available quantity of buckslips. |  |
|**allocatedQuantity** | **Double** | The allocated quantity of buckslips. |  |
|**onhandQuantity** | **Double** | The onhand quantity of buckslips. |  |
|**pendingQuantity** | **Double** | The pending quantity of buckslips. |  |
|**projectedQuantity** | **Double** | The sum of pending and onhand quantities of buckslips. |  |
|**buckslipOrders** | [**List&lt;BuckslipOrder&gt;**](BuckslipOrder.md) | An array of buckslip orders that are associated with the buckslip. |  |
|**stock** | [**StockEnum**](#StockEnum) |  |  |
|**weight** | [**WeightEnum**](#WeightEnum) |  |  |
|**finish** | [**FinishEnum**](#FinishEnum) |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**_object** | [**ObjectEnum**](#ObjectEnum) | object |  |



## Enum: StockEnum

| Name | Value |
|---- | -----|
| TEXT | &quot;text&quot; |
| COVER | &quot;cover&quot; |



## Enum: WeightEnum

| Name | Value |
|---- | -----|
| _80_ | &quot;80#&quot; |



## Enum: FinishEnum

| Name | Value |
|---- | -----|
| GLOSS | &quot;gloss&quot; |
| MATTE | &quot;matte&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PROCESSED | &quot;processed&quot; |
| RENDERED | &quot;rendered&quot; |
| FAILED | &quot;failed&quot; |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| BUCKSLIP | &quot;buckslip&quot; |




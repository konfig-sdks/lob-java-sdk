

# CardOrderAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier prefixed with &#x60;co_&#x60;. |  [optional] |
|**cardId** | **String** | Unique identifier prefixed with &#x60;card_&#x60;. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the card order. |  [optional] |
|**inventory** | **Double** | The inventory of the card order. |  [optional] |
|**quantityOrdered** | **Double** | The quantity of cards ordered |  [optional] |
|**unitPrice** | **Double** | The unit price for the card order. |  [optional] |
|**cancelledReason** | **String** | The reason for cancellation. |  [optional] |
|**availabilityDate** | **OffsetDateTime** | A timestamp in ISO 8601 format of the date the resource was created. |  [optional] |
|**expectedAvailabilityDate** | **OffsetDateTime** | The fixed deadline for the cards to be printed. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| PRINTING | &quot;printing&quot; |
| AVAILABLE | &quot;available&quot; |
| CANCELLED | &quot;cancelled&quot; |
| DEPLETED | &quot;depleted&quot; |




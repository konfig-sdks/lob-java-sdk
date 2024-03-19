

# BankAccountAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**BankId**](BankId.md) |  |  |
|**signatureUrl** | [**String**](String.md) |  |  [optional] |
|**bankName** | **String** | The name of the bank based on the provided routing number, e.g. &#x60;JPMORGAN CHASE BANK&#x60;. |  [optional] |
|**verified** | **Boolean** | A bank account must be verified before a check can be created. More info [here](#operation/bank_account_verify). |  [optional] |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Value is resource type. |  [optional] |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| BANK_ACCOUNT | &quot;bank_account&quot; |






# CheckBaseAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mailType** | [**MailTypeEnum**](#MailTypeEnum) | Checks must be sent &#x60;usps_first_class&#x60; |  [optional] |
|**memo** | **String** | Text to include on the memo line of the check. |  [optional] |
|**checkNumber** | **Integer** | An integer that designates the check number. If &#x60;check_number&#x60; is not provided, checks created from a new &#x60;bank_account&#x60; will start at &#x60;10000&#x60; and increment with each check created with the &#x60;bank_account&#x60;. A provided &#x60;check_number&#x60; overrides the defaults. Subsequent checks created with the same &#x60;bank_account&#x60; will increment from the provided check number. |  [optional] |
|**message** | **String** | Max of 400 characters to be included at the bottom of the check page. |  [optional] |
|**useType** | **ChkUseType** |  |  [optional] |



## Enum: MailTypeEnum

| Name | Value |
|---- | -----|
| USPS_FIRST_CLASS | &quot;usps_first_class&quot; |






# UploadUpdatable


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**originalFilename** | **String** | Original filename provided when the upload is created. |  [optional] |
|**requiredAddressColumnMapping** | [**RequiredAddressColumnMapping**](RequiredAddressColumnMapping.md) |  |  [optional] |
|**optionalAddressColumnMapping** | [**OptionalAddressColumnMapping**](OptionalAddressColumnMapping.md) |  |  [optional] |
|**metadata** | [**UploadsMetadata**](UploadsMetadata.md) |  |  [optional] |
|**mergeVariableColumnMapping** | **String** | The mapping of column headers in your file to the merge variables present in your creative. See our &lt;a href&#x3D;\&quot;https://help.lob.com/print-and-mail/building-a-mail-strategy/campaign-or-triggered-sends/campaign-audience-guide#step-3-map-merge-variable-data-if-applicable-7\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Campaign Audience Guide&lt;/a&gt; for additional details. &lt;br /&gt;If a merge variable has the same \&quot;name\&quot; as a \&quot;key\&quot; in the &#x60;requiredAddressColumnMapping&#x60; or &#x60;optionalAddressColumnMapping&#x60; objects, then they **CANNOT** have a different value in this object. If a different value is provided, then when the campaign is processing it will get overwritten with the mapped value present in the &#x60;requiredAddressColumnMapping&#x60; or &#x60;optionalAddressColumnMapping&#x60; objects. If using customized QR code redirect from the Audience file, then a &#x60;qr_code_redirect_url&#x60; must be mapped to the column header as used in the CSV. |  [optional] |



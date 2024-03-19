

# LetterEditableAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**_file** | **Object** |  |  |
|**extraService** | **ExtraService** |  |  [optional] |
|**cards** | **List&lt;String&gt;** | A single-element array containing an existing card id in a string format. See [cards](#tag/Cards) for more information. Not available for &#x60;us_legal&#x60; letter size. |  [optional] |
|**mailType** | **MailType** |  |  [optional] |
|**color** | [**Boolean**](Boolean.md) |  |  |
|**doubleSided** | **Boolean** | Set this attribute to &#x60;true&#x60; for double sided printing, or &#x60;false&#x60; for for single sided printing. Defaults to &#x60;true&#x60;. |  [optional] |
|**addressPlacement** | **AddressPlacement** |  |  [optional] |
|**returnEnvelope** | **Object** |  |  [optional] |
|**perforatedPage** | **Integer** | Required if &#x60;return_envelope&#x60; is &#x60;true&#x60;. The number of the page that should be perforated for use with the return envelope. Must be greater than or equal to &#x60;1&#x60;. The blank page added by &#x60;address_placement&#x3D;insert_blank_page&#x60; will be ignored when considering the perforated page number. To see how perforation will impact your letter design, view our &lt;a href&#x3D;\&quot;https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/letter_perf_template.pdf\&quot; target&#x3D;\&quot;_blank\&quot;&gt;perforation guide&lt;/a&gt;. |  [optional] |
|**customEnvelope** | **String** | Accepts an envelope ID for any customized envelope with available inventory. If no inventory is available for the specified ID, the letter will not be sent, and an error will be returned. If the letter has more than 6 sheets, it will be sent in a blank flat envelope. Custom envelopes may be created and ordered from the dashboard. This feature is exclusive to certain customers. Upgrade to the appropriate &lt;a href&#x3D;\&quot;https://dashboard.lob.com/#/settings/editions\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Print &amp; Mail Edition&lt;/a&gt; to gain access. |  [optional] |
|**billingGroupId** | **String** | An optional string with the billing group ID to tag your usage with. Is used for billing purposes. Requires special activation to use. See &lt;a href&#x3D;\&quot;#tag/Billing-Groups\&quot;&gt;Billing Group API&lt;/a&gt; for more information. |  [optional] |
|**qrCode** | [**QrCode**](QrCode.md) |  |  [optional] |
|**useType** | **LtrUseType** |  |  |
|**fsc** | **Boolean** | This is in beta. Contact support@lob.com or your account contact to learn more. Not available for &#x60;A4&#x60; and &#x60;us_legal&#x60; letter size. |  [optional] |
|**size** | **LtrSize** |  |  [optional] |




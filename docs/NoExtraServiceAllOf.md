

# NoExtraServiceAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | An internal description that identifies this resource. Must be no longer than 255 characters.  |  [optional] |
|**trackingEvents** | [**List&lt;TrackingEventNormal&gt;**](TrackingEventNormal.md) | An array of tracking events ordered by ascending &#x60;time&#x60;. |  [optional] |
|**cards** | [**List&lt;Card&gt;**](Card.md) | An array of cards associated with a specific letter |  [optional] |
|**buckslips** | [**List&lt;Buckslip&gt;**](Buckslip.md) | An array of buckslip(s) associated with a specific letter |  [optional] |
|**returnAddress** | **Object** |  |  [optional] |
|**metadata** | **Map&lt;String, String&gt;** | Use metadata to store custom information for tagging and labeling back to your internal systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters and values must be at most 500 characters. Neither can contain the characters &#x60;\&quot;&#x60; and &#x60;\\&#x60;. i.e. &#39;{\&quot;customer_id\&quot; : \&quot;NEWYORK2015\&quot;}&#39; Nested objects are not supported.  See [Metadata](#section/Metadata) for more information. |  [optional] |
|**mergeVariables** | **String** | You can input a merge variable payload object to your template to render dynamic content. For example, if you have a template like: &#x60;{{variable_name}}&#x60;, pass in &#x60;{\&quot;variable_name\&quot;: \&quot;Harry\&quot;}&#x60; to render &#x60;Harry&#x60;. &#x60;merge_variables&#x60; must be an object. Any type of value is accepted as long as the object is valid JSON; you can use &#x60;strings&#x60;, &#x60;numbers&#x60;, &#x60;booleans&#x60;, &#x60;arrays&#x60;, &#x60;objects&#x60;, or &#x60;null&#x60;. The max length of the object is 25,000 characters. If you call &#x60;JSON.stringify&#x60; on your object, it can be no longer than 25,000 characters. Your variable names cannot contain any whitespace or any of the following special characters: &#x60;!&#x60;, &#x60;\&quot;&#x60;, &#x60;#&#x60;, &#x60;%&#x60;, &#x60;&amp;&#x60;, &#x60;&#39;&#x60;, &#x60;(&#x60;, &#x60;)&#x60;, &#x60;*&#x60;, &#x60;+&#x60;, &#x60;,&#x60;, &#x60;/&#x60;, &#x60;;&#x60;, &#x60;&lt;&#x60;, &#x60;&#x3D;&#x60;, &#x60;&gt;&#x60;, &#x60;@&#x60;, &#x60;[&#x60;, &#x60;\\&#x60;, &#x60;]&#x60;, &#x60;^&#x60;, &#x60;&#x60; &#x60; &#x60;&#x60;, &#x60;{&#x60;, &#x60;|&#x60;, &#x60;}&#x60;, &#x60;~&#x60;. More instructions can be found in &lt;a href&#x3D;\&quot;https://help.lob.com/print-and-mail/designing-mail-creatives/dynamic-personalization#using-html-and-merge-variables-10\&quot; target&#x3D;\&quot;_blank\&quot;&gt;our guide to using html and merge variables&lt;/a&gt;. Depending on your &lt;a href&#x3D;\&quot;https://dashboard.lob.com/#/settings/account\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Merge Variable strictness&lt;/a&gt; setting, if you define variables in your HTML but do not pass them here, you will either receive an error or the variable will render as an empty string. |  [optional] |
|**sendDate** | **Object** |  |  [optional] |
|**mailType** | **MailType** |  |  [optional] |
|**color** | **Boolean** | Set this key to &#x60;true&#x60; if you would like to print in color. Set to &#x60;false&#x60; if you would like to print in black and white. |  |
|**doubleSided** | **Boolean** | Set this attribute to &#x60;true&#x60; for double sided printing, or &#x60;false&#x60; for for single sided printing. Defaults to &#x60;true&#x60;. |  [optional] |
|**addressPlacement** | **AddressPlacement** |  |  [optional] |
|**returnEnvelope** | **Object** |  |  [optional] |
|**perforatedPage** | **Integer** | Required if &#x60;return_envelope&#x60; is &#x60;true&#x60;. The number of the page that should be perforated for use with the return envelope. Must be greater than or equal to &#x60;1&#x60;. The blank page added by &#x60;address_placement&#x3D;insert_blank_page&#x60; will be ignored when considering the perforated page number. To see how perforation will impact your letter design, view our &lt;a href&#x3D;\&quot;https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/letter_perf_template.pdf\&quot; target&#x3D;\&quot;_blank\&quot;&gt;perforation guide&lt;/a&gt;. |  [optional] |
|**customEnvelope** | [**CustomEnvelopeReturned**](CustomEnvelopeReturned.md) |  |  [optional] |




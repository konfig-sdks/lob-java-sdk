

# QrCode

Customize and place a QR code on the creative at the required position. Not available for `us_legal` letter size and snap packs.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**position** | [**PositionEnum**](#PositionEnum) | Sets how a QR code is being positioned in the document. Together with this, you should provide one of &#39;top&#39; or &#39;bottom&#39;, and one of &#39;left&#39; or &#39;right&#39;. |  |
|**top** | **String** | Vertical distance (in inches) to place QR code from the top. Only allowed if \&quot;bottom\&quot; isn&#39;t provided. |  [optional] |
|**right** | **String** | Horizontal distance (in inches) to place QR code from the right. Only allowed if \&quot;left\&quot; isn&#39;t provided. |  [optional] |
|**left** | **String** | Horizontal distance (in inches) to place QR code from the left. Only allowed if \&quot;right\&quot; isn&#39;t provided. |  [optional] |
|**bottom** | **String** | Vertical distance (in inches) to place QR code from the bottom. Only allowed if \&quot;top\&quot; isn&#39;t provided. |  [optional] |
|**redirectUrl** | **String** | The url to redirect the user when a QR code is scanned. The url must start with &#x60;https://&#x60; |  |
|**width** | **String** | The size (in inches) of the QR code with a minimum of 1 inch. All QR codes are generated as a square. |  |
|**pages** | **String** | Specify the pages where the QR code should be stamped in a comma separated format. Your QR code can be printed in the same position on multiple pages. For postcards, the values should either be \&quot;front\&quot;, \&quot;back\&quot; (for either front or back) or \&quot;front,back\&quot; (for the QR code to be printed on both sides). For self-mailers, the values should either be \&quot;inside\&quot;, \&quot;outside\&quot; (for either inside or outside) or \&quot;inside,outside\&quot; (for the QR code to be printed on both sides). For letters, the values can be specific page numbers (\&quot;1\&quot;, \&quot;3\&quot;), page number ranges such as \&quot;1-3\&quot;, or a comma separated combination of both (\&quot;1,3,5-7\&quot;). |  [optional] |



## Enum: PositionEnum

| Name | Value |
|---- | -----|
| RELATIVE | &quot;relative&quot; |




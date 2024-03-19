/*
 * Lob
 * The Lob API is organized around REST. Our API is designed to have predictable, resource-oriented URLs and uses HTTP response codes to indicate any API errors. <p> 
 *
 * The version of the OpenAPI document: 1.19.28
 * Contact: lob-openapi@lob.com
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.ChkUseType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * CheckEditableProps
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CheckEditableProps {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = null;

  public static final String SERIALIZED_NAME_MERGE_VARIABLES = "merge_variables";
  @SerializedName(SERIALIZED_NAME_MERGE_VARIABLES)
  private String mergeVariables;

  public static final String SERIALIZED_NAME_SEND_DATE = "send_date";
  @SerializedName(SERIALIZED_NAME_SEND_DATE)
  private Object sendDate = null;

  /**
   * Checks must be sent &#x60;usps_first_class&#x60;
   */
  @JsonAdapter(MailTypeEnum.Adapter.class)
 public enum MailTypeEnum {
    USPS_FIRST_CLASS("usps_first_class");

    private String value;

    MailTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MailTypeEnum fromValue(String value) {
      for (MailTypeEnum b : MailTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MailTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MailTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MailTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MailTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MAIL_TYPE = "mail_type";
  @SerializedName(SERIALIZED_NAME_MAIL_TYPE)
  private MailTypeEnum mailType = MailTypeEnum.USPS_FIRST_CLASS;

  public static final String SERIALIZED_NAME_MEMO = "memo";
  @SerializedName(SERIALIZED_NAME_MEMO)
  private String memo;

  public static final String SERIALIZED_NAME_CHECK_NUMBER = "check_number";
  @SerializedName(SERIALIZED_NAME_CHECK_NUMBER)
  private Integer checkNumber;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_USE_TYPE = "use_type";
  @SerializedName(SERIALIZED_NAME_USE_TYPE)
  private ChkUseType useType;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private Object to = null;

  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private Object from = null;

  public static final String SERIALIZED_NAME_BANK_ACCOUNT = "bank_account";
  @SerializedName(SERIALIZED_NAME_BANK_ACCOUNT)
  private String bankAccount;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Float amount;

  public static final String SERIALIZED_NAME_LOGO = "logo";
  @SerializedName(SERIALIZED_NAME_LOGO)
  private Object logo = null;

  public static final String SERIALIZED_NAME_CHECK_BOTTOM = "check_bottom";
  @SerializedName(SERIALIZED_NAME_CHECK_BOTTOM)
  private Object checkBottom = null;

  public static final String SERIALIZED_NAME_ATTACHMENT = "attachment";
  @SerializedName(SERIALIZED_NAME_ATTACHMENT)
  private Object attachment = null;

  public static final String SERIALIZED_NAME_BILLING_GROUP_ID = "billing_group_id";
  @SerializedName(SERIALIZED_NAME_BILLING_GROUP_ID)
  private String billingGroupId;

  public CheckEditableProps() {
  }

  public CheckEditableProps description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * An internal description that identifies this resource. Must be no longer than 255 characters. 
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Harry - Office", value = "An internal description that identifies this resource. Must be no longer than 255 characters. ")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public CheckEditableProps metadata(Map<String, String> metadata) {
    
    
    
    
    this.metadata = metadata;
    return this;
  }

  public CheckEditableProps putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Use metadata to store custom information for tagging and labeling back to your internal systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters and values must be at most 500 characters. Neither can contain the characters &#x60;\&quot;&#x60; and &#x60;\\&#x60;. i.e. &#39;{\&quot;customer_id\&quot; : \&quot;NEWYORK2015\&quot;}&#39; Nested objects are not supported.  See [Metadata](#section/Metadata) for more information.
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Use metadata to store custom information for tagging and labeling back to your internal systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters and values must be at most 500 characters. Neither can contain the characters `\"` and `\\`. i.e. '{\"customer_id\" : \"NEWYORK2015\"}' Nested objects are not supported.  See [Metadata](#section/Metadata) for more information.")

  public Map<String, String> getMetadata() {
    return metadata;
  }


  public void setMetadata(Map<String, String> metadata) {
    
    
    
    this.metadata = metadata;
  }


  public CheckEditableProps mergeVariables(String mergeVariables) {
    
    
    
    
    this.mergeVariables = mergeVariables;
    return this;
  }

   /**
   * You can input a merge variable payload object to your template to render dynamic content. For example, if you have a template like: &#x60;{{variable_name}}&#x60;, pass in &#x60;{\&quot;variable_name\&quot;: \&quot;Harry\&quot;}&#x60; to render &#x60;Harry&#x60;. &#x60;merge_variables&#x60; must be an object. Any type of value is accepted as long as the object is valid JSON; you can use &#x60;strings&#x60;, &#x60;numbers&#x60;, &#x60;booleans&#x60;, &#x60;arrays&#x60;, &#x60;objects&#x60;, or &#x60;null&#x60;. The max length of the object is 25,000 characters. If you call &#x60;JSON.stringify&#x60; on your object, it can be no longer than 25,000 characters. Your variable names cannot contain any whitespace or any of the following special characters: &#x60;!&#x60;, &#x60;\&quot;&#x60;, &#x60;#&#x60;, &#x60;%&#x60;, &#x60;&amp;&#x60;, &#x60;&#39;&#x60;, &#x60;(&#x60;, &#x60;)&#x60;, &#x60;*&#x60;, &#x60;+&#x60;, &#x60;,&#x60;, &#x60;/&#x60;, &#x60;;&#x60;, &#x60;&lt;&#x60;, &#x60;&#x3D;&#x60;, &#x60;&gt;&#x60;, &#x60;@&#x60;, &#x60;[&#x60;, &#x60;\\&#x60;, &#x60;]&#x60;, &#x60;^&#x60;, &#x60;&#x60; &#x60; &#x60;&#x60;, &#x60;{&#x60;, &#x60;|&#x60;, &#x60;}&#x60;, &#x60;~&#x60;. More instructions can be found in &lt;a href&#x3D;\&quot;https://help.lob.com/print-and-mail/designing-mail-creatives/dynamic-personalization#using-html-and-merge-variables-10\&quot; target&#x3D;\&quot;_blank\&quot;&gt;our guide to using html and merge variables&lt;/a&gt;. Depending on your &lt;a href&#x3D;\&quot;https://dashboard.lob.com/#/settings/account\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Merge Variable strictness&lt;/a&gt; setting, if you define variables in your HTML but do not pass them here, you will either receive an error or the variable will render as an empty string.
   * @return mergeVariables
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "You can input a merge variable payload object to your template to render dynamic content. For example, if you have a template like: `{{variable_name}}`, pass in `{\"variable_name\": \"Harry\"}` to render `Harry`. `merge_variables` must be an object. Any type of value is accepted as long as the object is valid JSON; you can use `strings`, `numbers`, `booleans`, `arrays`, `objects`, or `null`. The max length of the object is 25,000 characters. If you call `JSON.stringify` on your object, it can be no longer than 25,000 characters. Your variable names cannot contain any whitespace or any of the following special characters: `!`, `\"`, `#`, `%`, `&`, `'`, `(`, `)`, `*`, `+`, `,`, `/`, `;`, `<`, `=`, `>`, `@`, `[`, `\\`, `]`, `^`, `` ` ``, `{`, `|`, `}`, `~`. More instructions can be found in <a href=\"https://help.lob.com/print-and-mail/designing-mail-creatives/dynamic-personalization#using-html-and-merge-variables-10\" target=\"_blank\">our guide to using html and merge variables</a>. Depending on your <a href=\"https://dashboard.lob.com/#/settings/account\" target=\"_blank\">Merge Variable strictness</a> setting, if you define variables in your HTML but do not pass them here, you will either receive an error or the variable will render as an empty string.")

  public String getMergeVariables() {
    return mergeVariables;
  }


  public void setMergeVariables(String mergeVariables) {
    
    
    
    this.mergeVariables = mergeVariables;
  }


  public CheckEditableProps sendDate(Object sendDate) {
    
    
    
    
    this.sendDate = sendDate;
    return this;
  }

   /**
   * Get sendDate
   * @return sendDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getSendDate() {
    return sendDate;
  }


  public void setSendDate(Object sendDate) {
    
    
    
    this.sendDate = sendDate;
  }


  public CheckEditableProps mailType(MailTypeEnum mailType) {
    
    
    
    
    this.mailType = mailType;
    return this;
  }

   /**
   * Checks must be sent &#x60;usps_first_class&#x60;
   * @return mailType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USPS_FIRST_CLASS", value = "Checks must be sent `usps_first_class`")

  public MailTypeEnum getMailType() {
    return mailType;
  }


  public void setMailType(MailTypeEnum mailType) {
    
    
    
    this.mailType = mailType;
  }


  public CheckEditableProps memo(String memo) {
    
    
    
    
    this.memo = memo;
    return this;
  }

   /**
   * Text to include on the memo line of the check.
   * @return memo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text to include on the memo line of the check.")

  public String getMemo() {
    return memo;
  }


  public void setMemo(String memo) {
    
    
    
    this.memo = memo;
  }


  public CheckEditableProps checkNumber(Integer checkNumber) {
    if (checkNumber != null && checkNumber < 1) {
      throw new IllegalArgumentException("Invalid value for checkNumber. Must be greater than or equal to 1.");
    }
    if (checkNumber != null && checkNumber > 500000000) {
      throw new IllegalArgumentException("Invalid value for checkNumber. Must be less than or equal to 500000000.");
    }
    
    
    this.checkNumber = checkNumber;
    return this;
  }

   /**
   * An integer that designates the check number. If &#x60;check_number&#x60; is not provided, checks created from a new &#x60;bank_account&#x60; will start at &#x60;10000&#x60; and increment with each check created with the &#x60;bank_account&#x60;. A provided &#x60;check_number&#x60; overrides the defaults. Subsequent checks created with the same &#x60;bank_account&#x60; will increment from the provided check number.
   * minimum: 1
   * maximum: 500000000
   * @return checkNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An integer that designates the check number. If `check_number` is not provided, checks created from a new `bank_account` will start at `10000` and increment with each check created with the `bank_account`. A provided `check_number` overrides the defaults. Subsequent checks created with the same `bank_account` will increment from the provided check number.")

  public Integer getCheckNumber() {
    return checkNumber;
  }


  public void setCheckNumber(Integer checkNumber) {
    if (checkNumber != null && checkNumber < 1) {
      throw new IllegalArgumentException("Invalid value for checkNumber. Must be greater than or equal to 1.");
    }
    if (checkNumber != null && checkNumber > 500000000) {
      throw new IllegalArgumentException("Invalid value for checkNumber. Must be less than or equal to 500000000.");
    }
    
    this.checkNumber = checkNumber;
  }


  public CheckEditableProps message(String message) {
    
    
    
    
    this.message = message;
    return this;
  }

   /**
   * Max of 400 characters to be included at the bottom of the check page.
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Max of 400 characters to be included at the bottom of the check page.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    
    
    
    this.message = message;
  }


  public CheckEditableProps useType(ChkUseType useType) {
    
    
    
    
    this.useType = useType;
    return this;
  }

   /**
   * Get useType
   * @return useType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public ChkUseType getUseType() {
    return useType;
  }


  public void setUseType(ChkUseType useType) {
    
    
    
    this.useType = useType;
  }


  public CheckEditableProps to(Object to) {
    
    
    
    
    this.to = to;
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public Object getTo() {
    return to;
  }


  public void setTo(Object to) {
    
    
    
    this.to = to;
  }


  public CheckEditableProps from(Object from) {
    
    
    
    
    this.from = from;
    return this;
  }

   /**
   * Get from
   * @return from
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public Object getFrom() {
    return from;
  }


  public void setFrom(Object from) {
    
    
    
    this.from = from;
  }


  public CheckEditableProps bankAccount(String bankAccount) {
    
    
    
    
    this.bankAccount = bankAccount;
    return this;
  }

   /**
   * Get bankAccount
   * @return bankAccount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getBankAccount() {
    return bankAccount;
  }


  public void setBankAccount(String bankAccount) {
    
    
    
    this.bankAccount = bankAccount;
  }


  public CheckEditableProps amount(Float amount) {
    
    if (amount != null && amount > 999999.99) {
      throw new IllegalArgumentException("Invalid value for amount. Must be less than or equal to 999999.99.");
    }
    
    
    this.amount = amount;
    return this;
  }

   /**
   * The payment amount to be sent in US dollars. Amounts will be rounded to two decimal places.
   * maximum: 999999.99
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The payment amount to be sent in US dollars. Amounts will be rounded to two decimal places.")

  public Float getAmount() {
    return amount;
  }


  public void setAmount(Float amount) {
    
    if (amount != null && amount > 999999.99) {
      throw new IllegalArgumentException("Invalid value for amount. Must be less than or equal to 999999.99.");
    }
    
    this.amount = amount;
  }


  public CheckEditableProps logo(Object logo) {
    
    
    
    
    this.logo = logo;
    return this;
  }

   /**
   * Get logo
   * @return logo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getLogo() {
    return logo;
  }


  public void setLogo(Object logo) {
    
    
    
    this.logo = logo;
  }


  public CheckEditableProps checkBottom(Object checkBottom) {
    
    
    
    
    this.checkBottom = checkBottom;
    return this;
  }

   /**
   * Get checkBottom
   * @return checkBottom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getCheckBottom() {
    return checkBottom;
  }


  public void setCheckBottom(Object checkBottom) {
    
    
    
    this.checkBottom = checkBottom;
  }


  public CheckEditableProps attachment(Object attachment) {
    
    
    
    
    this.attachment = attachment;
    return this;
  }

   /**
   * Get attachment
   * @return attachment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getAttachment() {
    return attachment;
  }


  public void setAttachment(Object attachment) {
    
    
    
    this.attachment = attachment;
  }


  public CheckEditableProps billingGroupId(String billingGroupId) {
    
    
    
    
    this.billingGroupId = billingGroupId;
    return this;
  }

   /**
   * An optional string with the billing group ID to tag your usage with. Is used for billing purposes. Requires special activation to use. See &lt;a href&#x3D;\&quot;#tag/Billing-Groups\&quot;&gt;Billing Group API&lt;/a&gt; for more information.
   * @return billingGroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An optional string with the billing group ID to tag your usage with. Is used for billing purposes. Requires special activation to use. See <a href=\"#tag/Billing-Groups\">Billing Group API</a> for more information.")

  public String getBillingGroupId() {
    return billingGroupId;
  }


  public void setBillingGroupId(String billingGroupId) {
    
    
    
    this.billingGroupId = billingGroupId;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the CheckEditableProps instance itself
   */
  public CheckEditableProps putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckEditableProps checkEditableProps = (CheckEditableProps) o;
    return Objects.equals(this.description, checkEditableProps.description) &&
        Objects.equals(this.metadata, checkEditableProps.metadata) &&
        Objects.equals(this.mergeVariables, checkEditableProps.mergeVariables) &&
        Objects.equals(this.sendDate, checkEditableProps.sendDate) &&
        Objects.equals(this.mailType, checkEditableProps.mailType) &&
        Objects.equals(this.memo, checkEditableProps.memo) &&
        Objects.equals(this.checkNumber, checkEditableProps.checkNumber) &&
        Objects.equals(this.message, checkEditableProps.message) &&
        Objects.equals(this.useType, checkEditableProps.useType) &&
        Objects.equals(this.to, checkEditableProps.to) &&
        Objects.equals(this.from, checkEditableProps.from) &&
        Objects.equals(this.bankAccount, checkEditableProps.bankAccount) &&
        Objects.equals(this.amount, checkEditableProps.amount) &&
        Objects.equals(this.logo, checkEditableProps.logo) &&
        Objects.equals(this.checkBottom, checkEditableProps.checkBottom) &&
        Objects.equals(this.attachment, checkEditableProps.attachment) &&
        Objects.equals(this.billingGroupId, checkEditableProps.billingGroupId)&&
        Objects.equals(this.additionalProperties, checkEditableProps.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, metadata, mergeVariables, sendDate, mailType, memo, checkNumber, message, useType, to, from, bankAccount, amount, logo, checkBottom, attachment, billingGroupId, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckEditableProps {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    mergeVariables: ").append(toIndentedString(mergeVariables)).append("\n");
    sb.append("    sendDate: ").append(toIndentedString(sendDate)).append("\n");
    sb.append("    mailType: ").append(toIndentedString(mailType)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    checkNumber: ").append(toIndentedString(checkNumber)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    useType: ").append(toIndentedString(useType)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    bankAccount: ").append(toIndentedString(bankAccount)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    checkBottom: ").append(toIndentedString(checkBottom)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
    sb.append("    billingGroupId: ").append(toIndentedString(billingGroupId)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("description");
    openapiFields.add("metadata");
    openapiFields.add("merge_variables");
    openapiFields.add("send_date");
    openapiFields.add("mail_type");
    openapiFields.add("memo");
    openapiFields.add("check_number");
    openapiFields.add("message");
    openapiFields.add("use_type");
    openapiFields.add("to");
    openapiFields.add("from");
    openapiFields.add("bank_account");
    openapiFields.add("amount");
    openapiFields.add("logo");
    openapiFields.add("check_bottom");
    openapiFields.add("attachment");
    openapiFields.add("billing_group_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("use_type");
    openapiRequiredFields.add("to");
    openapiRequiredFields.add("from");
    openapiRequiredFields.add("bank_account");
    openapiRequiredFields.add("amount");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CheckEditableProps
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CheckEditableProps.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CheckEditableProps is not found in the empty JSON string", CheckEditableProps.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CheckEditableProps.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("description").isJsonNull() && (jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("mail_type") != null && !jsonObj.get("mail_type").isJsonNull()) && !jsonObj.get("mail_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mail_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mail_type").toString()));
      }
      if (!jsonObj.get("memo").isJsonNull() && (jsonObj.get("memo") != null && !jsonObj.get("memo").isJsonNull()) && !jsonObj.get("memo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `memo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("memo").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      // validate the required field `bank_account`
      String.validateJsonObject(jsonObj.getAsJsonObject("bank_account"));
      if ((jsonObj.get("billing_group_id") != null && !jsonObj.get("billing_group_id").isJsonNull()) && !jsonObj.get("billing_group_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `billing_group_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("billing_group_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CheckEditableProps.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CheckEditableProps' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CheckEditableProps> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CheckEditableProps.class));

       return (TypeAdapter<T>) new TypeAdapter<CheckEditableProps>() {
           @Override
           public void write(JsonWriter out, CheckEditableProps value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public CheckEditableProps read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CheckEditableProps instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CheckEditableProps given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CheckEditableProps
  * @throws IOException if the JSON string is invalid with respect to CheckEditableProps
  */
  public static CheckEditableProps fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CheckEditableProps.class);
  }

 /**
  * Convert an instance of CheckEditableProps to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

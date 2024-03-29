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
import com.konfigthis.client.model.MailType;
import com.konfigthis.client.model.PostcardSize;
import com.konfigthis.client.model.PscUseType;
import com.konfigthis.client.model.QrCode;
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
 * PostcardEditable
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PostcardEditable {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = null;

  public static final String SERIALIZED_NAME_MAIL_TYPE = "mail_type";
  @SerializedName(SERIALIZED_NAME_MAIL_TYPE)
  private MailType mailType = MailType.FIRST_CLASS;

  public static final String SERIALIZED_NAME_MERGE_VARIABLES = "merge_variables";
  @SerializedName(SERIALIZED_NAME_MERGE_VARIABLES)
  private String mergeVariables;

  public static final String SERIALIZED_NAME_SEND_DATE = "send_date";
  @SerializedName(SERIALIZED_NAME_SEND_DATE)
  private Object sendDate = null;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private PostcardSize size = PostcardSize._4X6;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private Object to = null;

  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private Object from = null;

  public static final String SERIALIZED_NAME_FRONT = "front";
  @SerializedName(SERIALIZED_NAME_FRONT)
  private Object front = null;

  public static final String SERIALIZED_NAME_BACK = "back";
  @SerializedName(SERIALIZED_NAME_BACK)
  private Object back = null;

  public static final String SERIALIZED_NAME_BILLING_GROUP_ID = "billing_group_id";
  @SerializedName(SERIALIZED_NAME_BILLING_GROUP_ID)
  private String billingGroupId;

  public static final String SERIALIZED_NAME_QR_CODE = "qr_code";
  @SerializedName(SERIALIZED_NAME_QR_CODE)
  private QrCode qrCode;

  public static final String SERIALIZED_NAME_USE_TYPE = "use_type";
  @SerializedName(SERIALIZED_NAME_USE_TYPE)
  private PscUseType useType;

  public static final String SERIALIZED_NAME_FSC = "fsc";
  @SerializedName(SERIALIZED_NAME_FSC)
  private Boolean fsc = false;

  public PostcardEditable() {
  }

  public PostcardEditable description(String description) {
    
    
    
    
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


  public PostcardEditable metadata(Map<String, String> metadata) {
    
    
    
    
    this.metadata = metadata;
    return this;
  }

  public PostcardEditable putMetadataItem(String key, String metadataItem) {
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


  public PostcardEditable mailType(MailType mailType) {
    
    
    
    
    this.mailType = mailType;
    return this;
  }

   /**
   * Get mailType
   * @return mailType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MailType getMailType() {
    return mailType;
  }


  public void setMailType(MailType mailType) {
    
    
    
    this.mailType = mailType;
  }


  public PostcardEditable mergeVariables(String mergeVariables) {
    
    
    
    
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


  public PostcardEditable sendDate(Object sendDate) {
    
    
    
    
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


  public PostcardEditable size(PostcardSize size) {
    
    
    
    
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PostcardSize getSize() {
    return size;
  }


  public void setSize(PostcardSize size) {
    
    
    
    this.size = size;
  }


  public PostcardEditable to(Object to) {
    
    
    
    
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


  public PostcardEditable from(Object from) {
    
    
    
    
    this.from = from;
    return this;
  }

   /**
   * Get from
   * @return from
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getFrom() {
    return from;
  }


  public void setFrom(Object from) {
    
    
    
    this.from = from;
  }


  public PostcardEditable front(Object front) {
    
    
    
    
    this.front = front;
    return this;
  }

   /**
   * Get front
   * @return front
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public Object getFront() {
    return front;
  }


  public void setFront(Object front) {
    
    
    
    this.front = front;
  }


  public PostcardEditable back(Object back) {
    
    
    
    
    this.back = back;
    return this;
  }

   /**
   * Get back
   * @return back
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public Object getBack() {
    return back;
  }


  public void setBack(Object back) {
    
    
    
    this.back = back;
  }


  public PostcardEditable billingGroupId(String billingGroupId) {
    
    
    
    
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


  public PostcardEditable qrCode(QrCode qrCode) {
    
    
    
    
    this.qrCode = qrCode;
    return this;
  }

   /**
   * Get qrCode
   * @return qrCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public QrCode getQrCode() {
    return qrCode;
  }


  public void setQrCode(QrCode qrCode) {
    
    
    
    this.qrCode = qrCode;
  }


  public PostcardEditable useType(PscUseType useType) {
    
    
    
    
    this.useType = useType;
    return this;
  }

   /**
   * Get useType
   * @return useType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public PscUseType getUseType() {
    return useType;
  }


  public void setUseType(PscUseType useType) {
    
    
    
    this.useType = useType;
  }


  public PostcardEditable fsc(Boolean fsc) {
    
    
    
    
    this.fsc = fsc;
    return this;
  }

   /**
   * This is in beta. Contact support@lob.com or your account contact to learn more. Not available for &#x60;4x6&#x60; or &#x60;A5&#x60; postcard sizes.
   * @return fsc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "This is in beta. Contact support@lob.com or your account contact to learn more. Not available for `4x6` or `A5` postcard sizes.")

  public Boolean getFsc() {
    return fsc;
  }


  public void setFsc(Boolean fsc) {
    
    
    
    this.fsc = fsc;
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
   * @return the PostcardEditable instance itself
   */
  public PostcardEditable putAdditionalProperty(String key, Object value) {
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
    PostcardEditable postcardEditable = (PostcardEditable) o;
    return Objects.equals(this.description, postcardEditable.description) &&
        Objects.equals(this.metadata, postcardEditable.metadata) &&
        Objects.equals(this.mailType, postcardEditable.mailType) &&
        Objects.equals(this.mergeVariables, postcardEditable.mergeVariables) &&
        Objects.equals(this.sendDate, postcardEditable.sendDate) &&
        Objects.equals(this.size, postcardEditable.size) &&
        Objects.equals(this.to, postcardEditable.to) &&
        Objects.equals(this.from, postcardEditable.from) &&
        Objects.equals(this.front, postcardEditable.front) &&
        Objects.equals(this.back, postcardEditable.back) &&
        Objects.equals(this.billingGroupId, postcardEditable.billingGroupId) &&
        Objects.equals(this.qrCode, postcardEditable.qrCode) &&
        Objects.equals(this.useType, postcardEditable.useType) &&
        Objects.equals(this.fsc, postcardEditable.fsc)&&
        Objects.equals(this.additionalProperties, postcardEditable.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, metadata, mailType, mergeVariables, sendDate, size, to, from, front, back, billingGroupId, qrCode, useType, fsc, additionalProperties);
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
    sb.append("class PostcardEditable {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    mailType: ").append(toIndentedString(mailType)).append("\n");
    sb.append("    mergeVariables: ").append(toIndentedString(mergeVariables)).append("\n");
    sb.append("    sendDate: ").append(toIndentedString(sendDate)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    front: ").append(toIndentedString(front)).append("\n");
    sb.append("    back: ").append(toIndentedString(back)).append("\n");
    sb.append("    billingGroupId: ").append(toIndentedString(billingGroupId)).append("\n");
    sb.append("    qrCode: ").append(toIndentedString(qrCode)).append("\n");
    sb.append("    useType: ").append(toIndentedString(useType)).append("\n");
    sb.append("    fsc: ").append(toIndentedString(fsc)).append("\n");
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
    openapiFields.add("mail_type");
    openapiFields.add("merge_variables");
    openapiFields.add("send_date");
    openapiFields.add("size");
    openapiFields.add("to");
    openapiFields.add("from");
    openapiFields.add("front");
    openapiFields.add("back");
    openapiFields.add("billing_group_id");
    openapiFields.add("qr_code");
    openapiFields.add("use_type");
    openapiFields.add("fsc");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("to");
    openapiRequiredFields.add("front");
    openapiRequiredFields.add("back");
    openapiRequiredFields.add("use_type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PostcardEditable
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PostcardEditable.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PostcardEditable is not found in the empty JSON string", PostcardEditable.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PostcardEditable.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("description").isJsonNull() && (jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("billing_group_id") != null && !jsonObj.get("billing_group_id").isJsonNull()) && !jsonObj.get("billing_group_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `billing_group_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("billing_group_id").toString()));
      }
      // validate the optional field `qr_code`
      if (jsonObj.get("qr_code") != null && !jsonObj.get("qr_code").isJsonNull()) {
        QrCode.validateJsonObject(jsonObj.getAsJsonObject("qr_code"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PostcardEditable.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PostcardEditable' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PostcardEditable> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PostcardEditable.class));

       return (TypeAdapter<T>) new TypeAdapter<PostcardEditable>() {
           @Override
           public void write(JsonWriter out, PostcardEditable value) throws IOException {
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
           public PostcardEditable read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PostcardEditable instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PostcardEditable given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PostcardEditable
  * @throws IOException if the JSON string is invalid with respect to PostcardEditable
  */
  public static PostcardEditable fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PostcardEditable.class);
  }

 /**
  * Convert an instance of PostcardEditable to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
 * CheckBaseAllOf
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CheckBaseAllOf {
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

  public CheckBaseAllOf() {
  }

  public CheckBaseAllOf mailType(MailTypeEnum mailType) {
    
    
    
    
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


  public CheckBaseAllOf memo(String memo) {
    
    
    
    
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


  public CheckBaseAllOf checkNumber(Integer checkNumber) {
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


  public CheckBaseAllOf message(String message) {
    
    
    
    
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


  public CheckBaseAllOf useType(ChkUseType useType) {
    
    
    
    
    this.useType = useType;
    return this;
  }

   /**
   * Get useType
   * @return useType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ChkUseType getUseType() {
    return useType;
  }


  public void setUseType(ChkUseType useType) {
    
    
    
    this.useType = useType;
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
   * @return the CheckBaseAllOf instance itself
   */
  public CheckBaseAllOf putAdditionalProperty(String key, Object value) {
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
    CheckBaseAllOf checkBaseAllOf = (CheckBaseAllOf) o;
    return Objects.equals(this.mailType, checkBaseAllOf.mailType) &&
        Objects.equals(this.memo, checkBaseAllOf.memo) &&
        Objects.equals(this.checkNumber, checkBaseAllOf.checkNumber) &&
        Objects.equals(this.message, checkBaseAllOf.message) &&
        Objects.equals(this.useType, checkBaseAllOf.useType)&&
        Objects.equals(this.additionalProperties, checkBaseAllOf.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(mailType, memo, checkNumber, message, useType, additionalProperties);
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
    sb.append("class CheckBaseAllOf {\n");
    sb.append("    mailType: ").append(toIndentedString(mailType)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    checkNumber: ").append(toIndentedString(checkNumber)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    useType: ").append(toIndentedString(useType)).append("\n");
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
    openapiFields.add("mail_type");
    openapiFields.add("memo");
    openapiFields.add("check_number");
    openapiFields.add("message");
    openapiFields.add("use_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CheckBaseAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CheckBaseAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CheckBaseAllOf is not found in the empty JSON string", CheckBaseAllOf.openapiRequiredFields.toString()));
        }
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CheckBaseAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CheckBaseAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CheckBaseAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CheckBaseAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<CheckBaseAllOf>() {
           @Override
           public void write(JsonWriter out, CheckBaseAllOf value) throws IOException {
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
           public CheckBaseAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CheckBaseAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CheckBaseAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CheckBaseAllOf
  * @throws IOException if the JSON string is invalid with respect to CheckBaseAllOf
  */
  public static CheckBaseAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CheckBaseAllOf.class);
  }

 /**
  * Convert an instance of CheckBaseAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

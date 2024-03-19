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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * ChecksListSortByParameterAllOf
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ChecksListSortByParameterAllOf {
  /**
   * Gets or Sets dateCreated
   */
  @JsonAdapter(DateCreatedEnum.Adapter.class)
 public enum DateCreatedEnum {
    ASC("asc"),
    
    DESC("desc");

    private String value;

    DateCreatedEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DateCreatedEnum fromValue(String value) {
      for (DateCreatedEnum b : DateCreatedEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DateCreatedEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DateCreatedEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DateCreatedEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DateCreatedEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DATE_CREATED = "date_created";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  private DateCreatedEnum dateCreated;

  /**
   * Gets or Sets sendDate
   */
  @JsonAdapter(SendDateEnum.Adapter.class)
 public enum SendDateEnum {
    ASC("asc"),
    
    DESC("desc");

    private String value;

    SendDateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SendDateEnum fromValue(String value) {
      for (SendDateEnum b : SendDateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SendDateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SendDateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SendDateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SendDateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SEND_DATE = "send_date";
  @SerializedName(SERIALIZED_NAME_SEND_DATE)
  private SendDateEnum sendDate;

  public ChecksListSortByParameterAllOf() {
  }

  public ChecksListSortByParameterAllOf dateCreated(DateCreatedEnum dateCreated) {
    
    
    
    
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Get dateCreated
   * @return dateCreated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DateCreatedEnum getDateCreated() {
    return dateCreated;
  }


  public void setDateCreated(DateCreatedEnum dateCreated) {
    
    
    
    this.dateCreated = dateCreated;
  }


  public ChecksListSortByParameterAllOf sendDate(SendDateEnum sendDate) {
    
    
    
    
    this.sendDate = sendDate;
    return this;
  }

   /**
   * Get sendDate
   * @return sendDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SendDateEnum getSendDate() {
    return sendDate;
  }


  public void setSendDate(SendDateEnum sendDate) {
    
    
    
    this.sendDate = sendDate;
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
   * @return the ChecksListSortByParameterAllOf instance itself
   */
  public ChecksListSortByParameterAllOf putAdditionalProperty(String key, Object value) {
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
    ChecksListSortByParameterAllOf checksListSortByParameterAllOf = (ChecksListSortByParameterAllOf) o;
    return Objects.equals(this.dateCreated, checksListSortByParameterAllOf.dateCreated) &&
        Objects.equals(this.sendDate, checksListSortByParameterAllOf.sendDate)&&
        Objects.equals(this.additionalProperties, checksListSortByParameterAllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateCreated, sendDate, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChecksListSortByParameterAllOf {\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    sendDate: ").append(toIndentedString(sendDate)).append("\n");
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
    openapiFields.add("date_created");
    openapiFields.add("send_date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ChecksListSortByParameterAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ChecksListSortByParameterAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChecksListSortByParameterAllOf is not found in the empty JSON string", ChecksListSortByParameterAllOf.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("date_created") != null && !jsonObj.get("date_created").isJsonNull()) && !jsonObj.get("date_created").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date_created` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date_created").toString()));
      }
      if ((jsonObj.get("send_date") != null && !jsonObj.get("send_date").isJsonNull()) && !jsonObj.get("send_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `send_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("send_date").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChecksListSortByParameterAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChecksListSortByParameterAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChecksListSortByParameterAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChecksListSortByParameterAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<ChecksListSortByParameterAllOf>() {
           @Override
           public void write(JsonWriter out, ChecksListSortByParameterAllOf value) throws IOException {
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
           public ChecksListSortByParameterAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ChecksListSortByParameterAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ChecksListSortByParameterAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChecksListSortByParameterAllOf
  * @throws IOException if the JSON string is invalid with respect to ChecksListSortByParameterAllOf
  */
  public static ChecksListSortByParameterAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChecksListSortByParameterAllOf.class);
  }

 /**
  * Convert an instance of ChecksListSortByParameterAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
 * IntlVerificationBase
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class IntlVerificationBase {
  public static final String SERIALIZED_NAME_RECIPIENT = "recipient";
  @SerializedName(SERIALIZED_NAME_RECIPIENT)
  private String recipient;

  public static final String SERIALIZED_NAME_PRIMARY_LINE = "primary_line";
  @SerializedName(SERIALIZED_NAME_PRIMARY_LINE)
  private String primaryLine;

  public static final String SERIALIZED_NAME_SECONDARY_LINE = "secondary_line";
  @SerializedName(SERIALIZED_NAME_SECONDARY_LINE)
  private String secondaryLine;

  public IntlVerificationBase() {
  }

  public IntlVerificationBase recipient(String recipient) {
    
    
    
    
    this.recipient = recipient;
    return this;
  }

   /**
   * The intended recipient, typically a person&#39;s or firm&#39;s name.
   * @return recipient
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The intended recipient, typically a person's or firm's name.")

  public String getRecipient() {
    return recipient;
  }


  public void setRecipient(String recipient) {
    
    
    
    this.recipient = recipient;
  }


  public IntlVerificationBase primaryLine(String primaryLine) {
    
    
    
    
    this.primaryLine = primaryLine;
    return this;
  }

   /**
   * The primary delivery line (usually the street address) of the address. 
   * @return primaryLine
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The primary delivery line (usually the street address) of the address. ")

  public String getPrimaryLine() {
    return primaryLine;
  }


  public void setPrimaryLine(String primaryLine) {
    
    
    
    this.primaryLine = primaryLine;
  }


  public IntlVerificationBase secondaryLine(String secondaryLine) {
    
    
    
    
    this.secondaryLine = secondaryLine;
    return this;
  }

   /**
   * The secondary delivery line of the address. This field is typically empty but may contain information if &#x60;primary_line&#x60; is too long. 
   * @return secondaryLine
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The secondary delivery line of the address. This field is typically empty but may contain information if `primary_line` is too long. ")

  public String getSecondaryLine() {
    return secondaryLine;
  }


  public void setSecondaryLine(String secondaryLine) {
    
    
    
    this.secondaryLine = secondaryLine;
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
   * @return the IntlVerificationBase instance itself
   */
  public IntlVerificationBase putAdditionalProperty(String key, Object value) {
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
    IntlVerificationBase intlVerificationBase = (IntlVerificationBase) o;
    return Objects.equals(this.recipient, intlVerificationBase.recipient) &&
        Objects.equals(this.primaryLine, intlVerificationBase.primaryLine) &&
        Objects.equals(this.secondaryLine, intlVerificationBase.secondaryLine)&&
        Objects.equals(this.additionalProperties, intlVerificationBase.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(recipient, primaryLine, secondaryLine, additionalProperties);
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
    sb.append("class IntlVerificationBase {\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    primaryLine: ").append(toIndentedString(primaryLine)).append("\n");
    sb.append("    secondaryLine: ").append(toIndentedString(secondaryLine)).append("\n");
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
    openapiFields.add("recipient");
    openapiFields.add("primary_line");
    openapiFields.add("secondary_line");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IntlVerificationBase
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!IntlVerificationBase.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IntlVerificationBase is not found in the empty JSON string", IntlVerificationBase.openapiRequiredFields.toString()));
        }
      }
      if (!jsonObj.get("recipient").isJsonNull() && (jsonObj.get("recipient") != null && !jsonObj.get("recipient").isJsonNull()) && !jsonObj.get("recipient").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recipient` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recipient").toString()));
      }
      if ((jsonObj.get("primary_line") != null && !jsonObj.get("primary_line").isJsonNull()) && !jsonObj.get("primary_line").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `primary_line` to be a primitive type in the JSON string but got `%s`", jsonObj.get("primary_line").toString()));
      }
      if ((jsonObj.get("secondary_line") != null && !jsonObj.get("secondary_line").isJsonNull()) && !jsonObj.get("secondary_line").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secondary_line` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secondary_line").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IntlVerificationBase.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IntlVerificationBase' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IntlVerificationBase> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IntlVerificationBase.class));

       return (TypeAdapter<T>) new TypeAdapter<IntlVerificationBase>() {
           @Override
           public void write(JsonWriter out, IntlVerificationBase value) throws IOException {
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
           public IntlVerificationBase read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             IntlVerificationBase instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of IntlVerificationBase given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IntlVerificationBase
  * @throws IOException if the JSON string is invalid with respect to IntlVerificationBase
  */
  public static IntlVerificationBase fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IntlVerificationBase.class);
  }

 /**
  * Convert an instance of IntlVerificationBase to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


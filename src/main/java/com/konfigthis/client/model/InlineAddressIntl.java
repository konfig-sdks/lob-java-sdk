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
 * InlineAddressIntl
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class InlineAddressIntl {
  public static final String SERIALIZED_NAME_ADDRESS_LINE1 = "address_line1";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE1)
  private String addressLine1;

  public static final String SERIALIZED_NAME_ADDRESS_LINE2 = "address_line2";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE2)
  private String addressLine2;

  public static final String SERIALIZED_NAME_ADDRESS_CITY = "address_city";
  @SerializedName(SERIALIZED_NAME_ADDRESS_CITY)
  private String addressCity;

  public static final String SERIALIZED_NAME_ADDRESS_STATE = "address_state";
  @SerializedName(SERIALIZED_NAME_ADDRESS_STATE)
  private String addressState;

  public static final String SERIALIZED_NAME_ADDRESS_ZIP = "address_zip";
  @SerializedName(SERIALIZED_NAME_ADDRESS_ZIP)
  private String addressZip;

  public InlineAddressIntl() {
  }

  public InlineAddressIntl addressLine1(String addressLine1) {
    
    
    
    
    this.addressLine1 = addressLine1;
    return this;
  }

   /**
   * The primary number, street name, and directional information.
   * @return addressLine1
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The primary number, street name, and directional information.")

  public String getAddressLine1() {
    return addressLine1;
  }


  public void setAddressLine1(String addressLine1) {
    
    
    
    this.addressLine1 = addressLine1;
  }


  public InlineAddressIntl addressLine2(String addressLine2) {
    
    
    
    
    this.addressLine2 = addressLine2;
    return this;
  }

   /**
   * An optional field containing any information which can&#39;t fit into line 1.
   * @return addressLine2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An optional field containing any information which can't fit into line 1.")

  public String getAddressLine2() {
    return addressLine2;
  }


  public void setAddressLine2(String addressLine2) {
    
    
    
    this.addressLine2 = addressLine2;
  }


  public InlineAddressIntl addressCity(String addressCity) {
    
    
    
    
    this.addressCity = addressCity;
    return this;
  }

   /**
   * Get addressCity
   * @return addressCity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAddressCity() {
    return addressCity;
  }


  public void setAddressCity(String addressCity) {
    
    
    
    this.addressCity = addressCity;
  }


  public InlineAddressIntl addressState(String addressState) {
    
    
    
    
    this.addressState = addressState;
    return this;
  }

   /**
   * Get addressState
   * @return addressState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAddressState() {
    return addressState;
  }


  public void setAddressState(String addressState) {
    
    
    
    this.addressState = addressState;
  }


  public InlineAddressIntl addressZip(String addressZip) {
    
    
    
    
    this.addressZip = addressZip;
    return this;
  }

   /**
   * Optional postal code.
   * @return addressZip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional postal code.")

  public String getAddressZip() {
    return addressZip;
  }


  public void setAddressZip(String addressZip) {
    
    
    
    this.addressZip = addressZip;
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
   * @return the InlineAddressIntl instance itself
   */
  public InlineAddressIntl putAdditionalProperty(String key, Object value) {
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
    InlineAddressIntl inlineAddressIntl = (InlineAddressIntl) o;
    return Objects.equals(this.addressLine1, inlineAddressIntl.addressLine1) &&
        Objects.equals(this.addressLine2, inlineAddressIntl.addressLine2) &&
        Objects.equals(this.addressCity, inlineAddressIntl.addressCity) &&
        Objects.equals(this.addressState, inlineAddressIntl.addressState) &&
        Objects.equals(this.addressZip, inlineAddressIntl.addressZip)&&
        Objects.equals(this.additionalProperties, inlineAddressIntl.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressLine1, addressLine2, addressCity, addressState, addressZip, additionalProperties);
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
    sb.append("class InlineAddressIntl {\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    addressCity: ").append(toIndentedString(addressCity)).append("\n");
    sb.append("    addressState: ").append(toIndentedString(addressState)).append("\n");
    sb.append("    addressZip: ").append(toIndentedString(addressZip)).append("\n");
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
    openapiFields.add("address_line1");
    openapiFields.add("address_line2");
    openapiFields.add("address_city");
    openapiFields.add("address_state");
    openapiFields.add("address_zip");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("address_line1");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InlineAddressIntl
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!InlineAddressIntl.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InlineAddressIntl is not found in the empty JSON string", InlineAddressIntl.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InlineAddressIntl.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("address_line1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address_line1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address_line1").toString()));
      }
      if (!jsonObj.get("address_line2").isJsonNull() && (jsonObj.get("address_line2") != null && !jsonObj.get("address_line2").isJsonNull()) && !jsonObj.get("address_line2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address_line2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address_line2").toString()));
      }
      if (!jsonObj.get("address_city").isJsonNull() && (jsonObj.get("address_city") != null && !jsonObj.get("address_city").isJsonNull()) && !jsonObj.get("address_city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address_city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address_city").toString()));
      }
      if (!jsonObj.get("address_state").isJsonNull() && (jsonObj.get("address_state") != null && !jsonObj.get("address_state").isJsonNull()) && !jsonObj.get("address_state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address_state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address_state").toString()));
      }
      if (!jsonObj.get("address_zip").isJsonNull() && (jsonObj.get("address_zip") != null && !jsonObj.get("address_zip").isJsonNull()) && !jsonObj.get("address_zip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address_zip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address_zip").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InlineAddressIntl.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InlineAddressIntl' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InlineAddressIntl> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InlineAddressIntl.class));

       return (TypeAdapter<T>) new TypeAdapter<InlineAddressIntl>() {
           @Override
           public void write(JsonWriter out, InlineAddressIntl value) throws IOException {
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
           public InlineAddressIntl read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             InlineAddressIntl instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of InlineAddressIntl given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InlineAddressIntl
  * @throws IOException if the JSON string is invalid with respect to InlineAddressIntl
  */
  public static InlineAddressIntl fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InlineAddressIntl.class);
  }

 /**
  * Convert an instance of InlineAddressIntl to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


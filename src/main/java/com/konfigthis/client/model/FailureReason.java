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
import com.konfigthis.client.model.FailureReasonError;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * An object describing the reason for failure if the resource failed to render.
 */
@ApiModel(description = "An object describing the reason for failure if the resource failed to render.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class FailureReason {
  public static final String SERIALIZED_NAME_REMEDIATION = "remediation";
  @SerializedName(SERIALIZED_NAME_REMEDIATION)
  private String remediation;

  public static final String SERIALIZED_NAME_FAILURE_REASON = "failure_reason";
  @SerializedName(SERIALIZED_NAME_FAILURE_REASON)
  private String failureReason;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<FailureReasonError> errors = null;

  public FailureReason() {
  }

  public FailureReason remediation(String remediation) {
    
    
    
    
    this.remediation = remediation;
    return this;
  }

   /**
   * Instructions on how to resolve the error
   * @return remediation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Instructions on how to resolve the error")

  public String getRemediation() {
    return remediation;
  }


  public void setRemediation(String remediation) {
    
    
    
    this.remediation = remediation;
  }


  public FailureReason failureReason(String failureReason) {
    
    
    
    
    this.failureReason = failureReason;
    return this;
  }

   /**
   * Reason failure occurred
   * @return failureReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reason failure occurred")

  public String getFailureReason() {
    return failureReason;
  }


  public void setFailureReason(String failureReason) {
    
    
    
    this.failureReason = failureReason;
  }


  public FailureReason errors(List<FailureReasonError> errors) {
    
    
    
    
    this.errors = errors;
    return this;
  }

  public FailureReason addErrorsItem(FailureReasonError errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<FailureReasonError> getErrors() {
    return errors;
  }


  public void setErrors(List<FailureReasonError> errors) {
    
    
    
    this.errors = errors;
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
   * @return the FailureReason instance itself
   */
  public FailureReason putAdditionalProperty(String key, Object value) {
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
    FailureReason failureReason = (FailureReason) o;
    return Objects.equals(this.remediation, failureReason.remediation) &&
        Objects.equals(this.failureReason, failureReason.failureReason) &&
        Objects.equals(this.errors, failureReason.errors)&&
        Objects.equals(this.additionalProperties, failureReason.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(remediation, failureReason, errors, additionalProperties);
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
    sb.append("class FailureReason {\n");
    sb.append("    remediation: ").append(toIndentedString(remediation)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
    openapiFields.add("remediation");
    openapiFields.add("failure_reason");
    openapiFields.add("errors");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FailureReason
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FailureReason.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FailureReason is not found in the empty JSON string", FailureReason.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("remediation") != null && !jsonObj.get("remediation").isJsonNull()) && !jsonObj.get("remediation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `remediation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("remediation").toString()));
      }
      if ((jsonObj.get("failure_reason") != null && !jsonObj.get("failure_reason").isJsonNull()) && !jsonObj.get("failure_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `failure_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("failure_reason").toString()));
      }
      if (jsonObj.get("errors") != null && !jsonObj.get("errors").isJsonNull()) {
        JsonArray jsonArrayerrors = jsonObj.getAsJsonArray("errors");
        if (jsonArrayerrors != null) {
          // ensure the json data is an array
          if (!jsonObj.get("errors").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `errors` to be an array in the JSON string but got `%s`", jsonObj.get("errors").toString()));
          }

          // validate the optional field `errors` (array)
          for (int i = 0; i < jsonArrayerrors.size(); i++) {
            FailureReasonError.validateJsonObject(jsonArrayerrors.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FailureReason.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FailureReason' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FailureReason> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FailureReason.class));

       return (TypeAdapter<T>) new TypeAdapter<FailureReason>() {
           @Override
           public void write(JsonWriter out, FailureReason value) throws IOException {
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
           public FailureReason read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             FailureReason instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of FailureReason given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FailureReason
  * @throws IOException if the JSON string is invalid with respect to FailureReason
  */
  public static FailureReason fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FailureReason.class);
  }

 /**
  * Convert an instance of FailureReason to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


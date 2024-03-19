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
import com.konfigthis.client.model.QrCodeCampaigns;
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
 * Properties that the postcards in your Creative should have. Check within in order to add a QR code to your creative.
 */
@ApiModel(description = "Properties that the postcards in your Creative should have. Check within in order to add a QR code to your creative.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Writable {
  public static final String SERIALIZED_NAME_MAIL_TYPE = "mail_type";
  @SerializedName(SERIALIZED_NAME_MAIL_TYPE)
  private MailType mailType = MailType.FIRST_CLASS;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private PostcardSize size = PostcardSize._4X6;

  public static final String SERIALIZED_NAME_QR_CODE = "qr_code";
  @SerializedName(SERIALIZED_NAME_QR_CODE)
  private QrCodeCampaigns qrCode;

  public Writable() {
  }

  public Writable mailType(MailType mailType) {
    
    
    
    
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


  public Writable size(PostcardSize size) {
    
    
    
    
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


  public Writable qrCode(QrCodeCampaigns qrCode) {
    
    
    
    
    this.qrCode = qrCode;
    return this;
  }

   /**
   * Get qrCode
   * @return qrCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public QrCodeCampaigns getQrCode() {
    return qrCode;
  }


  public void setQrCode(QrCodeCampaigns qrCode) {
    
    
    
    this.qrCode = qrCode;
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
   * @return the Writable instance itself
   */
  public Writable putAdditionalProperty(String key, Object value) {
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
    Writable writable = (Writable) o;
    return Objects.equals(this.mailType, writable.mailType) &&
        Objects.equals(this.size, writable.size) &&
        Objects.equals(this.qrCode, writable.qrCode)&&
        Objects.equals(this.additionalProperties, writable.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mailType, size, qrCode, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Writable {\n");
    sb.append("    mailType: ").append(toIndentedString(mailType)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    qrCode: ").append(toIndentedString(qrCode)).append("\n");
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
    openapiFields.add("size");
    openapiFields.add("qr_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Writable
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Writable.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Writable is not found in the empty JSON string", Writable.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `qr_code`
      if (jsonObj.get("qr_code") != null && !jsonObj.get("qr_code").isJsonNull()) {
        QrCodeCampaigns.validateJsonObject(jsonObj.getAsJsonObject("qr_code"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Writable.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Writable' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Writable> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Writable.class));

       return (TypeAdapter<T>) new TypeAdapter<Writable>() {
           @Override
           public void write(JsonWriter out, Writable value) throws IOException {
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
           public Writable read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Writable instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Writable given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Writable
  * @throws IOException if the JSON string is invalid with respect to Writable
  */
  public static Writable fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Writable.class);
  }

 /**
  * Convert an instance of Writable to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


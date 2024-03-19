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
import java.time.OffsetDateTime;

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
 * ExportRetrieveResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ExportRetrieveResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DATE_CREATED = "dateCreated";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  private OffsetDateTime dateCreated;

  public static final String SERIALIZED_NAME_DATE_MODIFIED = "dateModified";
  @SerializedName(SERIALIZED_NAME_DATE_MODIFIED)
  private OffsetDateTime dateModified;

  public static final String SERIALIZED_NAME_DELETED = "deleted";
  @SerializedName(SERIALIZED_NAME_DELETED)
  private Boolean deleted;

  public static final String SERIALIZED_NAME_S3_URL = "s3Url";
  @SerializedName(SERIALIZED_NAME_S3_URL)
  private String s3Url;

  /**
   * The state of the export file, which can be &#x60;in_progress&#x60;, &#x60;failed&#x60; or &#x60;succeeded&#x60;.
   */
  @JsonAdapter(StateEnum.Adapter.class)
 public enum StateEnum {
    IN_PROGRESS("in_progress"),
    
    FAILED("failed"),
    
    SUCCEEDED("succeeded");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private StateEnum state;

  /**
   * The export file type, which can be &#x60;all&#x60;, &#x60;failures&#x60; or &#x60;successes&#x60;.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    ALL("all"),
    
    FAILURES("failures"),
    
    SUCCESSES("successes");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_UPLOAD_ID = "uploadId";
  @SerializedName(SERIALIZED_NAME_UPLOAD_ID)
  private String uploadId;

  public ExportRetrieveResponse() {
  }

  public ExportRetrieveResponse id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier prefixed with &#x60;ex_&#x60;.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unique identifier prefixed with `ex_`.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public ExportRetrieveResponse dateCreated(OffsetDateTime dateCreated) {
    
    
    
    
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * A timestamp in ISO 8601 format of the date the export was created
   * @return dateCreated
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A timestamp in ISO 8601 format of the date the export was created")

  public OffsetDateTime getDateCreated() {
    return dateCreated;
  }


  public void setDateCreated(OffsetDateTime dateCreated) {
    
    
    
    this.dateCreated = dateCreated;
  }


  public ExportRetrieveResponse dateModified(OffsetDateTime dateModified) {
    
    
    
    
    this.dateModified = dateModified;
    return this;
  }

   /**
   * A timestamp in ISO 8601 format of the date the export was last modified
   * @return dateModified
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A timestamp in ISO 8601 format of the date the export was last modified")

  public OffsetDateTime getDateModified() {
    return dateModified;
  }


  public void setDateModified(OffsetDateTime dateModified) {
    
    
    
    this.dateModified = dateModified;
  }


  public ExportRetrieveResponse deleted(Boolean deleted) {
    
    
    
    
    this.deleted = deleted;
    return this;
  }

   /**
   * Returns as &#x60;true&#x60; if the resource has been successfully deleted.
   * @return deleted
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Returns as `true` if the resource has been successfully deleted.")

  public Boolean getDeleted() {
    return deleted;
  }


  public void setDeleted(Boolean deleted) {
    
    
    
    this.deleted = deleted;
  }


  public ExportRetrieveResponse s3Url(String s3Url) {
    
    
    
    
    this.s3Url = s3Url;
    return this;
  }

   /**
   * The URL for the generated export file.
   * @return s3Url
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The URL for the generated export file.")

  public String getS3Url() {
    return s3Url;
  }


  public void setS3Url(String s3Url) {
    
    
    
    this.s3Url = s3Url;
  }


  public ExportRetrieveResponse state(StateEnum state) {
    
    
    
    
    this.state = state;
    return this;
  }

   /**
   * The state of the export file, which can be &#x60;in_progress&#x60;, &#x60;failed&#x60; or &#x60;succeeded&#x60;.
   * @return state
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The state of the export file, which can be `in_progress`, `failed` or `succeeded`.")

  public StateEnum getState() {
    return state;
  }


  public void setState(StateEnum state) {
    
    
    
    this.state = state;
  }


  public ExportRetrieveResponse type(TypeEnum type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * The export file type, which can be &#x60;all&#x60;, &#x60;failures&#x60; or &#x60;successes&#x60;.
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The export file type, which can be `all`, `failures` or `successes`.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    
    
    
    this.type = type;
  }


  public ExportRetrieveResponse uploadId(String uploadId) {
    
    
    
    
    this.uploadId = uploadId;
    return this;
  }

   /**
   * Unique identifier prefixed with &#x60;upl_&#x60;.
   * @return uploadId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unique identifier prefixed with `upl_`.")

  public String getUploadId() {
    return uploadId;
  }


  public void setUploadId(String uploadId) {
    
    
    
    this.uploadId = uploadId;
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
   * @return the ExportRetrieveResponse instance itself
   */
  public ExportRetrieveResponse putAdditionalProperty(String key, Object value) {
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
    ExportRetrieveResponse exportRetrieveResponse = (ExportRetrieveResponse) o;
    return Objects.equals(this.id, exportRetrieveResponse.id) &&
        Objects.equals(this.dateCreated, exportRetrieveResponse.dateCreated) &&
        Objects.equals(this.dateModified, exportRetrieveResponse.dateModified) &&
        Objects.equals(this.deleted, exportRetrieveResponse.deleted) &&
        Objects.equals(this.s3Url, exportRetrieveResponse.s3Url) &&
        Objects.equals(this.state, exportRetrieveResponse.state) &&
        Objects.equals(this.type, exportRetrieveResponse.type) &&
        Objects.equals(this.uploadId, exportRetrieveResponse.uploadId)&&
        Objects.equals(this.additionalProperties, exportRetrieveResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dateCreated, dateModified, deleted, s3Url, state, type, uploadId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportRetrieveResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    s3Url: ").append(toIndentedString(s3Url)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uploadId: ").append(toIndentedString(uploadId)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("dateCreated");
    openapiFields.add("dateModified");
    openapiFields.add("deleted");
    openapiFields.add("s3Url");
    openapiFields.add("state");
    openapiFields.add("type");
    openapiFields.add("uploadId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("dateCreated");
    openapiRequiredFields.add("dateModified");
    openapiRequiredFields.add("deleted");
    openapiRequiredFields.add("s3Url");
    openapiRequiredFields.add("state");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("uploadId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExportRetrieveResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ExportRetrieveResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExportRetrieveResponse is not found in the empty JSON string", ExportRetrieveResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ExportRetrieveResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("s3Url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `s3Url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("s3Url").toString()));
      }
      if (!jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (!jsonObj.get("uploadId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uploadId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uploadId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExportRetrieveResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExportRetrieveResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExportRetrieveResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExportRetrieveResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ExportRetrieveResponse>() {
           @Override
           public void write(JsonWriter out, ExportRetrieveResponse value) throws IOException {
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
           public ExportRetrieveResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ExportRetrieveResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ExportRetrieveResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExportRetrieveResponse
  * @throws IOException if the JSON string is invalid with respect to ExportRetrieveResponse
  */
  public static ExportRetrieveResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExportRetrieveResponse.class);
  }

 /**
  * Convert an instance of ExportRetrieveResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

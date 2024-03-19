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
import com.konfigthis.client.model.CampaignItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

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
 * Creative
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Creative {
  public static final String SERIALIZED_NAME_DATE_CREATED = "date_created";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  private OffsetDateTime dateCreated;

  public static final String SERIALIZED_NAME_DATE_MODIFIED = "date_modified";
  @SerializedName(SERIALIZED_NAME_DATE_MODIFIED)
  private OffsetDateTime dateModified;

  public static final String SERIALIZED_NAME_DELETED = "deleted";
  @SerializedName(SERIALIZED_NAME_DELETED)
  private Boolean deleted;

  /**
   * Value is resource type.
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
 public enum ObjectEnum {
    CREATIVE("creative");

    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ObjectEnum fromValue(String value) {
      for (ObjectEnum b : ObjectEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ObjectEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ObjectEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ObjectEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ObjectEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private ObjectEnum _object = ObjectEnum.CREATIVE;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TEMPLATE_PREVIEW_URLS = "template_preview_urls";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_PREVIEW_URLS)
  private String templatePreviewUrls;

  public static final String SERIALIZED_NAME_TEMPLATE_PREVIEWS = "template_previews";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_PREVIEWS)
  private List<String> templatePreviews = new ArrayList<>();

  public static final String SERIALIZED_NAME_CAMPAIGNS = "campaigns";
  @SerializedName(SERIALIZED_NAME_CAMPAIGNS)
  private List<CampaignItem> campaigns = new ArrayList<>();

  public Creative() {
  }

  public Creative dateCreated(OffsetDateTime dateCreated) {
    
    
    
    
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * A timestamp in ISO 8601 format of the date the resource was created.
   * @return dateCreated
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A timestamp in ISO 8601 format of the date the resource was created.")

  public OffsetDateTime getDateCreated() {
    return dateCreated;
  }


  public void setDateCreated(OffsetDateTime dateCreated) {
    
    
    
    this.dateCreated = dateCreated;
  }


  public Creative dateModified(OffsetDateTime dateModified) {
    
    
    
    
    this.dateModified = dateModified;
    return this;
  }

   /**
   * A timestamp in ISO 8601 format of the date the resource was last modified.
   * @return dateModified
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A timestamp in ISO 8601 format of the date the resource was last modified.")

  public OffsetDateTime getDateModified() {
    return dateModified;
  }


  public void setDateModified(OffsetDateTime dateModified) {
    
    
    
    this.dateModified = dateModified;
  }


  public Creative deleted(Boolean deleted) {
    
    
    
    
    this.deleted = deleted;
    return this;
  }

   /**
   * Whether the resource has been deleted.
   * @return deleted
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Whether the resource has been deleted.")

  public Boolean getDeleted() {
    return deleted;
  }


  public void setDeleted(Boolean deleted) {
    
    
    
    this.deleted = deleted;
  }


  public Creative _object(ObjectEnum _object) {
    
    
    
    
    this._object = _object;
    return this;
  }

   /**
   * Value is resource type.
   * @return _object
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "CREATIVE", required = true, value = "Value is resource type.")

  public ObjectEnum getObject() {
    return _object;
  }


  public void setObject(ObjectEnum _object) {
    
    
    
    this._object = _object;
  }


  public Creative id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier prefixed with &#x60;crv_&#x60;.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "crv_2a3b096c409b32c", required = true, value = "Unique identifier prefixed with `crv_`.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public Creative templatePreviewUrls(String templatePreviewUrls) {
    
    
    
    
    this.templatePreviewUrls = templatePreviewUrls;
    return this;
  }

   /**
   * Preview URLs associated with a creative&#39;s artwork asset(s) if the creative uses HTML templates as assets. An empty object will be returned if no &#x60;template_preview&#x60;s have been generated.
   * @return templatePreviewUrls
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Preview URLs associated with a creative's artwork asset(s) if the creative uses HTML templates as assets. An empty object will be returned if no `template_preview`s have been generated.")

  public String getTemplatePreviewUrls() {
    return templatePreviewUrls;
  }


  public void setTemplatePreviewUrls(String templatePreviewUrls) {
    
    
    
    this.templatePreviewUrls = templatePreviewUrls;
  }


  public Creative templatePreviews(List<String> templatePreviews) {
    
    
    
    
    this.templatePreviews = templatePreviews;
    return this;
  }

  public Creative addTemplatePreviewsItem(String templatePreviewsItem) {
    this.templatePreviews.add(templatePreviewsItem);
    return this;
  }

   /**
   * A list of template preview objects if the creative uses HTML template(s) as artwork asset(s). An empty array will be returned if no &#x60;template_preview&#x60;s have been generated for the creative.
   * @return templatePreviews
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A list of template preview objects if the creative uses HTML template(s) as artwork asset(s). An empty array will be returned if no `template_preview`s have been generated for the creative.")

  public List<String> getTemplatePreviews() {
    return templatePreviews;
  }


  public void setTemplatePreviews(List<String> templatePreviews) {
    
    
    
    this.templatePreviews = templatePreviews;
  }


  public Creative campaigns(List<CampaignItem> campaigns) {
    
    
    
    
    this.campaigns = campaigns;
    return this;
  }

  public Creative addCampaignsItem(CampaignItem campaignsItem) {
    this.campaigns.add(campaignsItem);
    return this;
  }

   /**
   * Array of campaigns associated with the creative ID
   * @return campaigns
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "[{\"description\":\"Created via postman again\",\"id\":\"cmp_ed76e33e7ac4d0bd\",\"name\":\"My postman Campaign 2\",\"schedule_type\":\"immediate\",\"send_date\":null,\"target_delivery_date\":null,\"cancel_window_campaign_minutes\":null,\"metadata\":{},\"use_type\":null,\"is_draft\":true,\"deleted\":false,\"creatives\":[],\"uploads\":[],\"auto_cancel_if_ncoa\":false,\"date_created\":\"2022-07-26T20:20:25.016Z\",\"date_modified\":\"2022-07-26T20:20:25.016Z\",\"object\":\"campaign\"}]", required = true, value = "Array of campaigns associated with the creative ID")

  public List<CampaignItem> getCampaigns() {
    return campaigns;
  }


  public void setCampaigns(List<CampaignItem> campaigns) {
    
    
    
    this.campaigns = campaigns;
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
   * @return the Creative instance itself
   */
  public Creative putAdditionalProperty(String key, Object value) {
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
    Creative creative = (Creative) o;
    return Objects.equals(this.dateCreated, creative.dateCreated) &&
        Objects.equals(this.dateModified, creative.dateModified) &&
        Objects.equals(this.deleted, creative.deleted) &&
        Objects.equals(this._object, creative._object) &&
        Objects.equals(this.id, creative.id) &&
        Objects.equals(this.templatePreviewUrls, creative.templatePreviewUrls) &&
        Objects.equals(this.templatePreviews, creative.templatePreviews) &&
        Objects.equals(this.campaigns, creative.campaigns)&&
        Objects.equals(this.additionalProperties, creative.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateCreated, dateModified, deleted, _object, id, templatePreviewUrls, templatePreviews, campaigns, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Creative {\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    templatePreviewUrls: ").append(toIndentedString(templatePreviewUrls)).append("\n");
    sb.append("    templatePreviews: ").append(toIndentedString(templatePreviews)).append("\n");
    sb.append("    campaigns: ").append(toIndentedString(campaigns)).append("\n");
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
    openapiFields.add("date_modified");
    openapiFields.add("deleted");
    openapiFields.add("object");
    openapiFields.add("id");
    openapiFields.add("template_preview_urls");
    openapiFields.add("template_previews");
    openapiFields.add("campaigns");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("date_created");
    openapiRequiredFields.add("date_modified");
    openapiRequiredFields.add("deleted");
    openapiRequiredFields.add("object");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("template_preview_urls");
    openapiRequiredFields.add("template_previews");
    openapiRequiredFields.add("campaigns");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Creative
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Creative.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Creative is not found in the empty JSON string", Creative.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Creative.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("template_previews") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("template_previews").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `template_previews` to be an array in the JSON string but got `%s`", jsonObj.get("template_previews").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("campaigns").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `campaigns` to be an array in the JSON string but got `%s`", jsonObj.get("campaigns").toString()));
      }

      JsonArray jsonArraycampaigns = jsonObj.getAsJsonArray("campaigns");
      // validate the required field `campaigns` (array)
      for (int i = 0; i < jsonArraycampaigns.size(); i++) {
        CampaignItem.validateJsonObject(jsonArraycampaigns.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Creative.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Creative' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Creative> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Creative.class));

       return (TypeAdapter<T>) new TypeAdapter<Creative>() {
           @Override
           public void write(JsonWriter out, Creative value) throws IOException {
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
           public Creative read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Creative instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Creative given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Creative
  * @throws IOException if the JSON string is invalid with respect to Creative
  */
  public static Creative fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Creative.class);
  }

 /**
  * Convert an instance of Creative to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

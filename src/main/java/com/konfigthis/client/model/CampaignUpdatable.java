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
import com.konfigthis.client.model.CmpScheduleType;
import com.konfigthis.client.model.CmpUseType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * CampaignUpdatable
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CampaignUpdatable {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SCHEDULE_TYPE = "schedule_type";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_TYPE)
  private CmpScheduleType scheduleType;

  public static final String SERIALIZED_NAME_TARGET_DELIVERY_DATE = "target_delivery_date";
  @SerializedName(SERIALIZED_NAME_TARGET_DELIVERY_DATE)
  private OffsetDateTime targetDeliveryDate;

  public static final String SERIALIZED_NAME_SEND_DATE = "send_date";
  @SerializedName(SERIALIZED_NAME_SEND_DATE)
  private OffsetDateTime sendDate;

  public static final String SERIALIZED_NAME_CANCEL_WINDOW_CAMPAIGN_MINUTES = "cancel_window_campaign_minutes";
  @SerializedName(SERIALIZED_NAME_CANCEL_WINDOW_CAMPAIGN_MINUTES)
  private Integer cancelWindowCampaignMinutes;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = null;

  public static final String SERIALIZED_NAME_IS_DRAFT = "is_draft";
  @SerializedName(SERIALIZED_NAME_IS_DRAFT)
  private Boolean isDraft;

  public static final String SERIALIZED_NAME_USE_TYPE = "use_type";
  @SerializedName(SERIALIZED_NAME_USE_TYPE)
  private CmpUseType useType;

  public static final String SERIALIZED_NAME_AUTO_CANCEL_IF_NCOA = "auto_cancel_if_ncoa";
  @SerializedName(SERIALIZED_NAME_AUTO_CANCEL_IF_NCOA)
  private Boolean autoCancelIfNcoa;

  public CampaignUpdatable() {
  }

  public CampaignUpdatable description(String description) {
    
    
    
    
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


  public CampaignUpdatable name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public CampaignUpdatable scheduleType(CmpScheduleType scheduleType) {
    
    
    
    
    this.scheduleType = scheduleType;
    return this;
  }

   /**
   * Get scheduleType
   * @return scheduleType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CmpScheduleType getScheduleType() {
    return scheduleType;
  }


  public void setScheduleType(CmpScheduleType scheduleType) {
    
    
    
    this.scheduleType = scheduleType;
  }


  public CampaignUpdatable targetDeliveryDate(OffsetDateTime targetDeliveryDate) {
    
    
    
    
    this.targetDeliveryDate = targetDeliveryDate;
    return this;
  }

   /**
   * If &#x60;schedule_type&#x60; is &#x60;target_delivery_date&#x60;, provide a targeted delivery date for mail pieces in this campaign.
   * @return targetDeliveryDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If `schedule_type` is `target_delivery_date`, provide a targeted delivery date for mail pieces in this campaign.")

  public OffsetDateTime getTargetDeliveryDate() {
    return targetDeliveryDate;
  }


  public void setTargetDeliveryDate(OffsetDateTime targetDeliveryDate) {
    
    
    
    this.targetDeliveryDate = targetDeliveryDate;
  }


  public CampaignUpdatable sendDate(OffsetDateTime sendDate) {
    
    
    
    
    this.sendDate = sendDate;
    return this;
  }

   /**
   * If &#x60;schedule_type&#x60; is &#x60;scheduled_send_date&#x60;, provide a date to send this campaign.
   * @return sendDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If `schedule_type` is `scheduled_send_date`, provide a date to send this campaign.")

  public OffsetDateTime getSendDate() {
    return sendDate;
  }


  public void setSendDate(OffsetDateTime sendDate) {
    
    
    
    this.sendDate = sendDate;
  }


  public CampaignUpdatable cancelWindowCampaignMinutes(Integer cancelWindowCampaignMinutes) {
    
    
    
    
    this.cancelWindowCampaignMinutes = cancelWindowCampaignMinutes;
    return this;
  }

   /**
   * A window, in minutes, within which the campaign can be canceled.
   * @return cancelWindowCampaignMinutes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A window, in minutes, within which the campaign can be canceled.")

  public Integer getCancelWindowCampaignMinutes() {
    return cancelWindowCampaignMinutes;
  }


  public void setCancelWindowCampaignMinutes(Integer cancelWindowCampaignMinutes) {
    
    
    
    this.cancelWindowCampaignMinutes = cancelWindowCampaignMinutes;
  }


  public CampaignUpdatable metadata(Map<String, String> metadata) {
    
    
    
    
    this.metadata = metadata;
    return this;
  }

  public CampaignUpdatable putMetadataItem(String key, String metadataItem) {
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


  public CampaignUpdatable isDraft(Boolean isDraft) {
    
    
    
    
    this.isDraft = isDraft;
    return this;
  }

   /**
   * Whether or not the campaign is still a draft. Can either be excluded or &#x60;false&#x60;.
   * @return isDraft
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not the campaign is still a draft. Can either be excluded or `false`.")

  public Boolean getIsDraft() {
    return isDraft;
  }


  public void setIsDraft(Boolean isDraft) {
    
    
    
    this.isDraft = isDraft;
  }


  public CampaignUpdatable useType(CmpUseType useType) {
    
    
    
    
    this.useType = useType;
    return this;
  }

   /**
   * Get useType
   * @return useType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CmpUseType getUseType() {
    return useType;
  }


  public void setUseType(CmpUseType useType) {
    
    
    
    this.useType = useType;
  }


  public CampaignUpdatable autoCancelIfNcoa(Boolean autoCancelIfNcoa) {
    
    
    
    
    this.autoCancelIfNcoa = autoCancelIfNcoa;
    return this;
  }

   /**
   * Whether or not a mail piece should be automatically canceled and not sent if the address is updated via NCOA.
   * @return autoCancelIfNcoa
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not a mail piece should be automatically canceled and not sent if the address is updated via NCOA.")

  public Boolean getAutoCancelIfNcoa() {
    return autoCancelIfNcoa;
  }


  public void setAutoCancelIfNcoa(Boolean autoCancelIfNcoa) {
    
    
    
    this.autoCancelIfNcoa = autoCancelIfNcoa;
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
   * @return the CampaignUpdatable instance itself
   */
  public CampaignUpdatable putAdditionalProperty(String key, Object value) {
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
    CampaignUpdatable campaignUpdatable = (CampaignUpdatable) o;
    return Objects.equals(this.description, campaignUpdatable.description) &&
        Objects.equals(this.name, campaignUpdatable.name) &&
        Objects.equals(this.scheduleType, campaignUpdatable.scheduleType) &&
        Objects.equals(this.targetDeliveryDate, campaignUpdatable.targetDeliveryDate) &&
        Objects.equals(this.sendDate, campaignUpdatable.sendDate) &&
        Objects.equals(this.cancelWindowCampaignMinutes, campaignUpdatable.cancelWindowCampaignMinutes) &&
        Objects.equals(this.metadata, campaignUpdatable.metadata) &&
        Objects.equals(this.isDraft, campaignUpdatable.isDraft) &&
        Objects.equals(this.useType, campaignUpdatable.useType) &&
        Objects.equals(this.autoCancelIfNcoa, campaignUpdatable.autoCancelIfNcoa)&&
        Objects.equals(this.additionalProperties, campaignUpdatable.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, scheduleType, targetDeliveryDate, sendDate, cancelWindowCampaignMinutes, metadata, isDraft, useType, autoCancelIfNcoa, additionalProperties);
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
    sb.append("class CampaignUpdatable {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scheduleType: ").append(toIndentedString(scheduleType)).append("\n");
    sb.append("    targetDeliveryDate: ").append(toIndentedString(targetDeliveryDate)).append("\n");
    sb.append("    sendDate: ").append(toIndentedString(sendDate)).append("\n");
    sb.append("    cancelWindowCampaignMinutes: ").append(toIndentedString(cancelWindowCampaignMinutes)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    isDraft: ").append(toIndentedString(isDraft)).append("\n");
    sb.append("    useType: ").append(toIndentedString(useType)).append("\n");
    sb.append("    autoCancelIfNcoa: ").append(toIndentedString(autoCancelIfNcoa)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("schedule_type");
    openapiFields.add("target_delivery_date");
    openapiFields.add("send_date");
    openapiFields.add("cancel_window_campaign_minutes");
    openapiFields.add("metadata");
    openapiFields.add("is_draft");
    openapiFields.add("use_type");
    openapiFields.add("auto_cancel_if_ncoa");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CampaignUpdatable
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CampaignUpdatable.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CampaignUpdatable is not found in the empty JSON string", CampaignUpdatable.openapiRequiredFields.toString()));
        }
      }
      if (!jsonObj.get("description").isJsonNull() && (jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CampaignUpdatable.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CampaignUpdatable' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CampaignUpdatable> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CampaignUpdatable.class));

       return (TypeAdapter<T>) new TypeAdapter<CampaignUpdatable>() {
           @Override
           public void write(JsonWriter out, CampaignUpdatable value) throws IOException {
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
           public CampaignUpdatable read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CampaignUpdatable instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CampaignUpdatable given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CampaignUpdatable
  * @throws IOException if the JSON string is invalid with respect to CampaignUpdatable
  */
  public static CampaignUpdatable fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CampaignUpdatable.class);
  }

 /**
  * Convert an instance of CampaignUpdatable to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


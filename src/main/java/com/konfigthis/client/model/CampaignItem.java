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
import java.util.List;
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
 * CampaignItem
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CampaignItem {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_BILLING_GROUP_ID = "billing_group_id";
  @SerializedName(SERIALIZED_NAME_BILLING_GROUP_ID)
  private String billingGroupId;

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

  public static final String SERIALIZED_NAME_USE_TYPE = "use_type";
  @SerializedName(SERIALIZED_NAME_USE_TYPE)
  private CmpUseType useType;

  public static final String SERIALIZED_NAME_AUTO_CANCEL_IF_NCOA = "auto_cancel_if_ncoa";
  @SerializedName(SERIALIZED_NAME_AUTO_CANCEL_IF_NCOA)
  private Boolean autoCancelIfNcoa;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IS_DRAFT = "is_draft";
  @SerializedName(SERIALIZED_NAME_IS_DRAFT)
  private Boolean isDraft = true;

  public static final String SERIALIZED_NAME_CREATIVES = "creatives";
  @SerializedName(SERIALIZED_NAME_CREATIVES)
  private List creatives = null;

  public static final String SERIALIZED_NAME_UPLOADS = "uploads";
  @SerializedName(SERIALIZED_NAME_UPLOADS)
  private List uploads = null;

  /**
   * Value is resource type.
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
 public enum ObjectEnum {
    CAMPAIGN("campaign");

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
  private ObjectEnum _object = ObjectEnum.CAMPAIGN;

  public static final String SERIALIZED_NAME_DATE_CREATED = "date_created";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  private OffsetDateTime dateCreated;

  public static final String SERIALIZED_NAME_DATE_MODIFIED = "date_modified";
  @SerializedName(SERIALIZED_NAME_DATE_MODIFIED)
  private OffsetDateTime dateModified;

  public static final String SERIALIZED_NAME_DELETED = "deleted";
  @SerializedName(SERIALIZED_NAME_DELETED)
  private Boolean deleted;

  public CampaignItem() {
  }

  public CampaignItem description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * An internal description that identifies this resource. Must be no longer than 255 characters. 
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Harry - Office", required = true, value = "An internal description that identifies this resource. Must be no longer than 255 characters. ")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public CampaignItem billingGroupId(String billingGroupId) {
    
    
    
    
    this.billingGroupId = billingGroupId;
    return this;
  }

   /**
   * Unique identifier prefixed with &#x60;bg_&#x60;.
   * @return billingGroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier prefixed with `bg_`.")

  public String getBillingGroupId() {
    return billingGroupId;
  }


  public void setBillingGroupId(String billingGroupId) {
    
    
    
    this.billingGroupId = billingGroupId;
  }


  public CampaignItem name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Name of the campaign.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the campaign.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public CampaignItem scheduleType(CmpScheduleType scheduleType) {
    
    
    
    
    this.scheduleType = scheduleType;
    return this;
  }

   /**
   * Get scheduleType
   * @return scheduleType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public CmpScheduleType getScheduleType() {
    return scheduleType;
  }


  public void setScheduleType(CmpScheduleType scheduleType) {
    
    
    
    this.scheduleType = scheduleType;
  }


  public CampaignItem targetDeliveryDate(OffsetDateTime targetDeliveryDate) {
    
    
    
    
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


  public CampaignItem sendDate(OffsetDateTime sendDate) {
    
    
    
    
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


  public CampaignItem cancelWindowCampaignMinutes(Integer cancelWindowCampaignMinutes) {
    
    
    
    
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


  public CampaignItem metadata(Map<String, String> metadata) {
    
    
    
    
    this.metadata = metadata;
    return this;
  }

  public CampaignItem putMetadataItem(String key, String metadataItem) {
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


  public CampaignItem useType(CmpUseType useType) {
    
    
    
    
    this.useType = useType;
    return this;
  }

   /**
   * Get useType
   * @return useType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public CmpUseType getUseType() {
    return useType;
  }


  public void setUseType(CmpUseType useType) {
    
    
    
    this.useType = useType;
  }


  public CampaignItem autoCancelIfNcoa(Boolean autoCancelIfNcoa) {
    
    
    
    
    this.autoCancelIfNcoa = autoCancelIfNcoa;
    return this;
  }

   /**
   * Whether or not a mail piece should be automatically canceled and not sent if the address is updated via NCOA.
   * @return autoCancelIfNcoa
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Whether or not a mail piece should be automatically canceled and not sent if the address is updated via NCOA.")

  public Boolean getAutoCancelIfNcoa() {
    return autoCancelIfNcoa;
  }


  public void setAutoCancelIfNcoa(Boolean autoCancelIfNcoa) {
    
    
    
    this.autoCancelIfNcoa = autoCancelIfNcoa;
  }


  public CampaignItem id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier prefixed with &#x60;cmp_&#x60;.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unique identifier prefixed with `cmp_`.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public CampaignItem isDraft(Boolean isDraft) {
    
    
    
    
    this.isDraft = isDraft;
    return this;
  }

   /**
   * Whether or not the campaign is still a draft.
   * @return isDraft
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "Whether or not the campaign is still a draft.")

  public Boolean getIsDraft() {
    return isDraft;
  }


  public void setIsDraft(Boolean isDraft) {
    
    
    
    this.isDraft = isDraft;
  }


  public CampaignItem creatives(List creatives) {
    
    
    
    
    this.creatives = creatives;
    return this;
  }

   /**
   * An array of creatives that have been associated with this campaign.
   * @return creatives
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "An array of creatives that have been associated with this campaign.")

  public List getCreatives() {
    return creatives;
  }


  public void setCreatives(List creatives) {
    
    
    
    this.creatives = creatives;
  }


  public CampaignItem uploads(List uploads) {
    
    
    
    
    this.uploads = uploads;
    return this;
  }

   /**
   * A single-element array containing the upload object that is assocated with this campaign.
   * @return uploads
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A single-element array containing the upload object that is assocated with this campaign.")

  public List getUploads() {
    return uploads;
  }


  public void setUploads(List uploads) {
    
    
    
    this.uploads = uploads;
  }


  public CampaignItem _object(ObjectEnum _object) {
    
    
    
    
    this._object = _object;
    return this;
  }

   /**
   * Value is resource type.
   * @return _object
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "CAMPAIGN", required = true, value = "Value is resource type.")

  public ObjectEnum getObject() {
    return _object;
  }


  public void setObject(ObjectEnum _object) {
    
    
    
    this._object = _object;
  }


  public CampaignItem dateCreated(OffsetDateTime dateCreated) {
    
    
    
    
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


  public CampaignItem dateModified(OffsetDateTime dateModified) {
    
    
    
    
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


  public CampaignItem deleted(Boolean deleted) {
    
    
    
    
    this.deleted = deleted;
    return this;
  }

   /**
   * Only returned if the resource has been successfully deleted.
   * @return deleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only returned if the resource has been successfully deleted.")

  public Boolean getDeleted() {
    return deleted;
  }


  public void setDeleted(Boolean deleted) {
    
    
    
    this.deleted = deleted;
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
   * @return the CampaignItem instance itself
   */
  public CampaignItem putAdditionalProperty(String key, Object value) {
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
    CampaignItem campaignItem = (CampaignItem) o;
    return Objects.equals(this.description, campaignItem.description) &&
        Objects.equals(this.billingGroupId, campaignItem.billingGroupId) &&
        Objects.equals(this.name, campaignItem.name) &&
        Objects.equals(this.scheduleType, campaignItem.scheduleType) &&
        Objects.equals(this.targetDeliveryDate, campaignItem.targetDeliveryDate) &&
        Objects.equals(this.sendDate, campaignItem.sendDate) &&
        Objects.equals(this.cancelWindowCampaignMinutes, campaignItem.cancelWindowCampaignMinutes) &&
        Objects.equals(this.metadata, campaignItem.metadata) &&
        Objects.equals(this.useType, campaignItem.useType) &&
        Objects.equals(this.autoCancelIfNcoa, campaignItem.autoCancelIfNcoa) &&
        Objects.equals(this.id, campaignItem.id) &&
        Objects.equals(this.isDraft, campaignItem.isDraft) &&
        Objects.equals(this.creatives, campaignItem.creatives) &&
        Objects.equals(this.uploads, campaignItem.uploads) &&
        Objects.equals(this._object, campaignItem._object) &&
        Objects.equals(this.dateCreated, campaignItem.dateCreated) &&
        Objects.equals(this.dateModified, campaignItem.dateModified) &&
        Objects.equals(this.deleted, campaignItem.deleted)&&
        Objects.equals(this.additionalProperties, campaignItem.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, billingGroupId, name, scheduleType, targetDeliveryDate, sendDate, cancelWindowCampaignMinutes, metadata, useType, autoCancelIfNcoa, id, isDraft, creatives, uploads, _object, dateCreated, dateModified, deleted, additionalProperties);
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
    sb.append("class CampaignItem {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    billingGroupId: ").append(toIndentedString(billingGroupId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scheduleType: ").append(toIndentedString(scheduleType)).append("\n");
    sb.append("    targetDeliveryDate: ").append(toIndentedString(targetDeliveryDate)).append("\n");
    sb.append("    sendDate: ").append(toIndentedString(sendDate)).append("\n");
    sb.append("    cancelWindowCampaignMinutes: ").append(toIndentedString(cancelWindowCampaignMinutes)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    useType: ").append(toIndentedString(useType)).append("\n");
    sb.append("    autoCancelIfNcoa: ").append(toIndentedString(autoCancelIfNcoa)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isDraft: ").append(toIndentedString(isDraft)).append("\n");
    sb.append("    creatives: ").append(toIndentedString(creatives)).append("\n");
    sb.append("    uploads: ").append(toIndentedString(uploads)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
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
    openapiFields.add("billing_group_id");
    openapiFields.add("name");
    openapiFields.add("schedule_type");
    openapiFields.add("target_delivery_date");
    openapiFields.add("send_date");
    openapiFields.add("cancel_window_campaign_minutes");
    openapiFields.add("metadata");
    openapiFields.add("use_type");
    openapiFields.add("auto_cancel_if_ncoa");
    openapiFields.add("id");
    openapiFields.add("is_draft");
    openapiFields.add("creatives");
    openapiFields.add("uploads");
    openapiFields.add("object");
    openapiFields.add("date_created");
    openapiFields.add("date_modified");
    openapiFields.add("deleted");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("schedule_type");
    openapiRequiredFields.add("use_type");
    openapiRequiredFields.add("auto_cancel_if_ncoa");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("is_draft");
    openapiRequiredFields.add("creatives");
    openapiRequiredFields.add("uploads");
    openapiRequiredFields.add("object");
    openapiRequiredFields.add("date_created");
    openapiRequiredFields.add("date_modified");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CampaignItem
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CampaignItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CampaignItem is not found in the empty JSON string", CampaignItem.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CampaignItem.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("description").isJsonNull() && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("billing_group_id").isJsonNull() && (jsonObj.get("billing_group_id") != null && !jsonObj.get("billing_group_id").isJsonNull()) && !jsonObj.get("billing_group_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `billing_group_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("billing_group_id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CampaignItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CampaignItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CampaignItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CampaignItem.class));

       return (TypeAdapter<T>) new TypeAdapter<CampaignItem>() {
           @Override
           public void write(JsonWriter out, CampaignItem value) throws IOException {
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
           public CampaignItem read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CampaignItem instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CampaignItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CampaignItem
  * @throws IOException if the JSON string is invalid with respect to CampaignItem
  */
  public static CampaignItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CampaignItem.class);
  }

 /**
  * Convert an instance of CampaignItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


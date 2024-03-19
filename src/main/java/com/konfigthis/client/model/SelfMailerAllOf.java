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
import com.konfigthis.client.model.FailureReason;
import com.konfigthis.client.model.SfmUseType;
import com.konfigthis.client.model.Status;
import com.konfigthis.client.model.TrackingEventCertified;
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
 * SelfMailerAllOf
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SelfMailerAllOf {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_OUTSIDE_TEMPLATE_ID = "outside_template_id";
  @SerializedName(SERIALIZED_NAME_OUTSIDE_TEMPLATE_ID)
  private String outsideTemplateId;

  public static final String SERIALIZED_NAME_INSIDE_TEMPLATE_ID = "inside_template_id";
  @SerializedName(SERIALIZED_NAME_INSIDE_TEMPLATE_ID)
  private String insideTemplateId;

  public static final String SERIALIZED_NAME_OUTSIDE_TEMPLATE_VERSION_ID = "outside_template_version_id";
  @SerializedName(SERIALIZED_NAME_OUTSIDE_TEMPLATE_VERSION_ID)
  private String outsideTemplateVersionId;

  public static final String SERIALIZED_NAME_INSIDE_TEMPLATE_VERSION_ID = "inside_template_version_id";
  @SerializedName(SERIALIZED_NAME_INSIDE_TEMPLATE_VERSION_ID)
  private String insideTemplateVersionId;

  /**
   * Value is resource type.
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
 public enum ObjectEnum {
    SELF_MAILER("self_mailer");

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
  private ObjectEnum _object = ObjectEnum.SELF_MAILER;

  public static final String SERIALIZED_NAME_TRACKING_EVENTS = "tracking_events";
  @SerializedName(SERIALIZED_NAME_TRACKING_EVENTS)
  private List<TrackingEventCertified> trackingEvents = null;

  public static final String SERIALIZED_NAME_USE_TYPE = "use_type";
  @SerializedName(SERIALIZED_NAME_USE_TYPE)
  private SfmUseType useType;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_FSC = "fsc";
  @SerializedName(SERIALIZED_NAME_FSC)
  private Boolean fsc = false;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Status status;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaign_id";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private String campaignId;

  public static final String SERIALIZED_NAME_FAILURE_REASON = "failure_reason";
  @SerializedName(SERIALIZED_NAME_FAILURE_REASON)
  private FailureReason failureReason;

  public SelfMailerAllOf() {
  }

  public SelfMailerAllOf id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier prefixed with &#x60;sfm_&#x60;.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unique identifier prefixed with `sfm_`.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public SelfMailerAllOf outsideTemplateId(String outsideTemplateId) {
    
    
    
    
    this.outsideTemplateId = outsideTemplateId;
    return this;
  }

   /**
   * The unique ID of the HTML template used for the outside of the self mailer.
   * @return outsideTemplateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique ID of the HTML template used for the outside of the self mailer.")

  public String getOutsideTemplateId() {
    return outsideTemplateId;
  }


  public void setOutsideTemplateId(String outsideTemplateId) {
    
    
    
    this.outsideTemplateId = outsideTemplateId;
  }


  public SelfMailerAllOf insideTemplateId(String insideTemplateId) {
    
    
    
    
    this.insideTemplateId = insideTemplateId;
    return this;
  }

   /**
   * The unique ID of the HTML template used for the inside of the self mailer.
   * @return insideTemplateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique ID of the HTML template used for the inside of the self mailer.")

  public String getInsideTemplateId() {
    return insideTemplateId;
  }


  public void setInsideTemplateId(String insideTemplateId) {
    
    
    
    this.insideTemplateId = insideTemplateId;
  }


  public SelfMailerAllOf outsideTemplateVersionId(String outsideTemplateVersionId) {
    
    
    
    
    this.outsideTemplateVersionId = outsideTemplateVersionId;
    return this;
  }

   /**
   * The unique ID of the specific version of the HTML template used for the outside of the self mailer.
   * @return outsideTemplateVersionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique ID of the specific version of the HTML template used for the outside of the self mailer.")

  public String getOutsideTemplateVersionId() {
    return outsideTemplateVersionId;
  }


  public void setOutsideTemplateVersionId(String outsideTemplateVersionId) {
    
    
    
    this.outsideTemplateVersionId = outsideTemplateVersionId;
  }


  public SelfMailerAllOf insideTemplateVersionId(String insideTemplateVersionId) {
    
    
    
    
    this.insideTemplateVersionId = insideTemplateVersionId;
    return this;
  }

   /**
   * The unique ID of the specific version of the HTML template used for the inside of the self mailer.
   * @return insideTemplateVersionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique ID of the specific version of the HTML template used for the inside of the self mailer.")

  public String getInsideTemplateVersionId() {
    return insideTemplateVersionId;
  }


  public void setInsideTemplateVersionId(String insideTemplateVersionId) {
    
    
    
    this.insideTemplateVersionId = insideTemplateVersionId;
  }


  public SelfMailerAllOf _object(ObjectEnum _object) {
    
    
    
    
    this._object = _object;
    return this;
  }

   /**
   * Value is resource type.
   * @return _object
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SELF_MAILER", value = "Value is resource type.")

  public ObjectEnum getObject() {
    return _object;
  }


  public void setObject(ObjectEnum _object) {
    
    
    
    this._object = _object;
  }


  public SelfMailerAllOf trackingEvents(List<TrackingEventCertified> trackingEvents) {
    
    
    
    
    this.trackingEvents = trackingEvents;
    return this;
  }

  public SelfMailerAllOf addTrackingEventsItem(TrackingEventCertified trackingEventsItem) {
    if (this.trackingEvents == null) {
      this.trackingEvents = new ArrayList<>();
    }
    this.trackingEvents.add(trackingEventsItem);
    return this;
  }

   /**
   * An array of certified tracking events ordered by ascending &#x60;time&#x60;. Not populated in test mode.
   * @return trackingEvents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of certified tracking events ordered by ascending `time`. Not populated in test mode.")

  public List<TrackingEventCertified> getTrackingEvents() {
    return trackingEvents;
  }


  public void setTrackingEvents(List<TrackingEventCertified> trackingEvents) {
    
    
    
    this.trackingEvents = trackingEvents;
  }


  public SelfMailerAllOf useType(SfmUseType useType) {
    
    
    
    
    this.useType = useType;
    return this;
  }

   /**
   * Get useType
   * @return useType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public SfmUseType getUseType() {
    return useType;
  }


  public void setUseType(SfmUseType useType) {
    
    
    
    this.useType = useType;
  }


  public SelfMailerAllOf url(String url) {
    
    
    
    
    this.url = url;
    return this;
  }

   /**
   * A [signed link](#section/Asset-URLs) served over HTTPS. The link returned will expire in 30 days to prevent mis-sharing. Each time a GET request is initiated, a new signed URL will be generated.
   * @return url
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A [signed link](#section/Asset-URLs) served over HTTPS. The link returned will expire in 30 days to prevent mis-sharing. Each time a GET request is initiated, a new signed URL will be generated.")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    
    
    
    this.url = url;
  }


  public SelfMailerAllOf fsc(Boolean fsc) {
    
    
    
    
    this.fsc = fsc;
    return this;
  }

   /**
   * This is in beta. Contact support@lob.com or your account contact to learn more. Not available for &#x60;11x9_bifold&#x60; self-mailer size.
   * @return fsc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "This is in beta. Contact support@lob.com or your account contact to learn more. Not available for `11x9_bifold` self-mailer size.")

  public Boolean getFsc() {
    return fsc;
  }


  public void setFsc(Boolean fsc) {
    
    
    
    this.fsc = fsc;
  }


  public SelfMailerAllOf status(Status status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Status getStatus() {
    return status;
  }


  public void setStatus(Status status) {
    
    
    
    this.status = status;
  }


  public SelfMailerAllOf campaignId(String campaignId) {
    
    
    
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * Denotes resources created by the provided campaign id, prefixed with &#x60;cmp_&#x60;. In the case of snap packs and letters with size &#x60;us_legal&#x60;, the campaign id is prefixed with &#x60;camp_&#x60; instead of &#x60;cmp_&#x60;.
   * @return campaignId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Denotes resources created by the provided campaign id, prefixed with `cmp_`. In the case of snap packs and letters with size `us_legal`, the campaign id is prefixed with `camp_` instead of `cmp_`.")

  public String getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(String campaignId) {
    
    
    
    this.campaignId = campaignId;
  }


  public SelfMailerAllOf failureReason(FailureReason failureReason) {
    
    
    
    
    this.failureReason = failureReason;
    return this;
  }

   /**
   * Get failureReason
   * @return failureReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FailureReason getFailureReason() {
    return failureReason;
  }


  public void setFailureReason(FailureReason failureReason) {
    
    
    
    this.failureReason = failureReason;
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
   * @return the SelfMailerAllOf instance itself
   */
  public SelfMailerAllOf putAdditionalProperty(String key, Object value) {
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
    SelfMailerAllOf selfMailerAllOf = (SelfMailerAllOf) o;
    return Objects.equals(this.id, selfMailerAllOf.id) &&
        Objects.equals(this.outsideTemplateId, selfMailerAllOf.outsideTemplateId) &&
        Objects.equals(this.insideTemplateId, selfMailerAllOf.insideTemplateId) &&
        Objects.equals(this.outsideTemplateVersionId, selfMailerAllOf.outsideTemplateVersionId) &&
        Objects.equals(this.insideTemplateVersionId, selfMailerAllOf.insideTemplateVersionId) &&
        Objects.equals(this._object, selfMailerAllOf._object) &&
        Objects.equals(this.trackingEvents, selfMailerAllOf.trackingEvents) &&
        Objects.equals(this.useType, selfMailerAllOf.useType) &&
        Objects.equals(this.url, selfMailerAllOf.url) &&
        Objects.equals(this.fsc, selfMailerAllOf.fsc) &&
        Objects.equals(this.status, selfMailerAllOf.status) &&
        Objects.equals(this.campaignId, selfMailerAllOf.campaignId) &&
        Objects.equals(this.failureReason, selfMailerAllOf.failureReason)&&
        Objects.equals(this.additionalProperties, selfMailerAllOf.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, outsideTemplateId, insideTemplateId, outsideTemplateVersionId, insideTemplateVersionId, _object, trackingEvents, useType, url, fsc, status, campaignId, failureReason, additionalProperties);
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
    sb.append("class SelfMailerAllOf {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    outsideTemplateId: ").append(toIndentedString(outsideTemplateId)).append("\n");
    sb.append("    insideTemplateId: ").append(toIndentedString(insideTemplateId)).append("\n");
    sb.append("    outsideTemplateVersionId: ").append(toIndentedString(outsideTemplateVersionId)).append("\n");
    sb.append("    insideTemplateVersionId: ").append(toIndentedString(insideTemplateVersionId)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    trackingEvents: ").append(toIndentedString(trackingEvents)).append("\n");
    sb.append("    useType: ").append(toIndentedString(useType)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    fsc: ").append(toIndentedString(fsc)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
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
    openapiFields.add("outside_template_id");
    openapiFields.add("inside_template_id");
    openapiFields.add("outside_template_version_id");
    openapiFields.add("inside_template_version_id");
    openapiFields.add("object");
    openapiFields.add("tracking_events");
    openapiFields.add("use_type");
    openapiFields.add("url");
    openapiFields.add("fsc");
    openapiFields.add("status");
    openapiFields.add("campaign_id");
    openapiFields.add("failure_reason");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("use_type");
    openapiRequiredFields.add("url");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SelfMailerAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SelfMailerAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SelfMailerAllOf is not found in the empty JSON string", SelfMailerAllOf.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SelfMailerAllOf.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `outside_template_id`
      if (jsonObj.get("outside_template_id") != null && !jsonObj.get("outside_template_id").isJsonNull()) {
        String.validateJsonObject(jsonObj.getAsJsonObject("outside_template_id"));
      }
      // validate the optional field `inside_template_id`
      if (jsonObj.get("inside_template_id") != null && !jsonObj.get("inside_template_id").isJsonNull()) {
        String.validateJsonObject(jsonObj.getAsJsonObject("inside_template_id"));
      }
      // validate the optional field `outside_template_version_id`
      if (jsonObj.get("outside_template_version_id") != null && !jsonObj.get("outside_template_version_id").isJsonNull()) {
        String.validateJsonObject(jsonObj.getAsJsonObject("outside_template_version_id"));
      }
      // validate the optional field `inside_template_version_id`
      if (jsonObj.get("inside_template_version_id") != null && !jsonObj.get("inside_template_version_id").isJsonNull()) {
        String.validateJsonObject(jsonObj.getAsJsonObject("inside_template_version_id"));
      }
      if ((jsonObj.get("object") != null && !jsonObj.get("object").isJsonNull()) && !jsonObj.get("object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object").toString()));
      }
      if (jsonObj.get("tracking_events") != null && !jsonObj.get("tracking_events").isJsonNull()) {
        JsonArray jsonArraytrackingEvents = jsonObj.getAsJsonArray("tracking_events");
        if (jsonArraytrackingEvents != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tracking_events").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tracking_events` to be an array in the JSON string but got `%s`", jsonObj.get("tracking_events").toString()));
          }

          // validate the optional field `tracking_events` (array)
          for (int i = 0; i < jsonArraytrackingEvents.size(); i++) {
            TrackingEventCertified.validateJsonObject(jsonArraytrackingEvents.get(i).getAsJsonObject());
          };
        }
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if (!jsonObj.get("campaign_id").isJsonNull() && (jsonObj.get("campaign_id") != null && !jsonObj.get("campaign_id").isJsonNull()) && !jsonObj.get("campaign_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `campaign_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("campaign_id").toString()));
      }
      // validate the optional field `failure_reason`
      if (jsonObj.get("failure_reason") != null && !jsonObj.get("failure_reason").isJsonNull()) {
        FailureReason.validateJsonObject(jsonObj.getAsJsonObject("failure_reason"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SelfMailerAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SelfMailerAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SelfMailerAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SelfMailerAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<SelfMailerAllOf>() {
           @Override
           public void write(JsonWriter out, SelfMailerAllOf value) throws IOException {
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
           public SelfMailerAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SelfMailerAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SelfMailerAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SelfMailerAllOf
  * @throws IOException if the JSON string is invalid with respect to SelfMailerAllOf
  */
  public static SelfMailerAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SelfMailerAllOf.class);
  }

 /**
  * Convert an instance of SelfMailerAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

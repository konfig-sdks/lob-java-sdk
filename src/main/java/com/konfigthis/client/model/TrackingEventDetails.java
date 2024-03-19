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
 * TrackingEventDetails
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TrackingEventDetails {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  /**
   * Find the full table [here](#tag/Tracking-Events). A detailed substatus about the event: * &#x60;package_accepted&#x60; - Package has been accepted into the carrier network for delivery. * &#x60;package_arrived&#x60; - Package has arrived at an intermediate location in the carrier network. * &#x60;package_departed&#x60; - Package has departed from an intermediate location in the carrier network. * &#x60;package_processing&#x60; - Package is processing at an intermediate location in the carrier network. * &#x60;package_processed&#x60; - Package has been processed at an intermediate location. * &#x60;package_in_local_area&#x60; - Package is at a location near the end destination. * &#x60;delivery_scheduled&#x60; - Package is scheduled for delivery. * &#x60;out_for_delivery&#x60; - Package is out for delivery. * &#x60;pickup_available&#x60; - Package is available for pickup at carrier location. * &#x60;delivered&#x60; - Package has been delivered. * &#x60;package_forwarded&#x60; - Package has been forwarded. * &#x60;returned_to_sender&#x60; - Package is to be returned to sender. * &#x60;address_issue&#x60; - Address information is incorrect. Contact carrier to ensure delivery. * &#x60;contact_carrier&#x60; - Contact the carrier for more information. * &#x60;delayed&#x60; - Delivery of package is delayed. * &#x60;delivery_attempted&#x60; - Delivery of package has been attempted. Contact carrier to ensure delivery. * &#x60;delivery_rescheduled&#x60; - Delivery of package has been rescheduled. * &#x60;location_inaccessible&#x60; - Delivery location inaccessible to carrier. Contact carrier to ensure delivery. * &#x60;notice_left&#x60; - Carrier left notice during attempted delivery. Follow carrier instructions on notice. * &#x60;package_damaged&#x60; - Package has been damaged. Contact carrier for more details. * &#x60;package_disposed&#x60; - Package has been disposed. * &#x60;package_held&#x60; - Package held at carrier location. Contact carrier for more details. * &#x60;package_lost&#x60; - Package has been lost. Contact carrier for more details. * &#x60;package_unclaimed&#x60; - Package is unclaimed. * &#x60;package_undeliverable&#x60; - Package is not able to be delivered. * &#x60;reschedule_delivery&#x60; - Contact carrier to reschedule delivery. * &#x60;other&#x60; - Unrecognized carrier status. 
   */
  @JsonAdapter(EventEnum.Adapter.class)
 public enum EventEnum {
    PACKAGE_ACCEPTED("package_accepted"),
    
    PACKAGE_ARRIVED("package_arrived"),
    
    PACKAGE_DEPARTED("package_departed"),
    
    PACKAGE_PROCESSING("package_processing"),
    
    PACKAGE_PROCESSED("package_processed"),
    
    PACKAGE_IN_LOCAL_AREA("package_in_local_area"),
    
    DELIVERY_SCHEDULED("delivery_scheduled"),
    
    OUT_FOR_DELIVERY("out_for_delivery"),
    
    PICKUP_AVAILABLE("pickup_available"),
    
    DELIVERED("delivered"),
    
    PACKAGE_FORWARDED("package_forwarded"),
    
    RETURNED_TO_SENDER("returned_to_sender"),
    
    ADDRESS_ISSUE("address_issue"),
    
    CONTACT_CARRIER("contact_carrier"),
    
    DELAYED("delayed"),
    
    DELIVERY_ATTEMPTED("delivery_attempted"),
    
    DELIVERY_RESCHEDULED("delivery_rescheduled"),
    
    LOCATION_INACCESSIBLE("location_inaccessible"),
    
    NOTICE_LEFT("notice_left"),
    
    PACKAGE_DAMAGED("package_damaged"),
    
    PACKAGE_DISPOSED("package_disposed"),
    
    PACKAGE_HELD("package_held"),
    
    PACKAGE_LOST("package_lost"),
    
    PACKAGE_UNCLAIMED("package_unclaimed"),
    
    PACKAGE_UNDELIVERABLE("package_undeliverable"),
    
    RESCHEDULE_DELIVERY("reschedule_delivery"),
    
    OTHER("other");

    private String value;

    EventEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EventEnum fromValue(String value) {
      for (EventEnum b : EventEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EventEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EventEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EventEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EventEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_EVENT = "event";
  @SerializedName(SERIALIZED_NAME_EVENT)
  private EventEnum event;

  public static final String SERIALIZED_NAME_NOTES = "notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private String notes;

  public static final String SERIALIZED_NAME_ACTION_REQUIRED = "action_required";
  @SerializedName(SERIALIZED_NAME_ACTION_REQUIRED)
  private Boolean actionRequired;

  public TrackingEventDetails() {
  }

  public TrackingEventDetails description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * The description as listed in the description for event.
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The description as listed in the description for event.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public TrackingEventDetails event(EventEnum event) {
    
    
    
    
    this.event = event;
    return this;
  }

   /**
   * Find the full table [here](#tag/Tracking-Events). A detailed substatus about the event: * &#x60;package_accepted&#x60; - Package has been accepted into the carrier network for delivery. * &#x60;package_arrived&#x60; - Package has arrived at an intermediate location in the carrier network. * &#x60;package_departed&#x60; - Package has departed from an intermediate location in the carrier network. * &#x60;package_processing&#x60; - Package is processing at an intermediate location in the carrier network. * &#x60;package_processed&#x60; - Package has been processed at an intermediate location. * &#x60;package_in_local_area&#x60; - Package is at a location near the end destination. * &#x60;delivery_scheduled&#x60; - Package is scheduled for delivery. * &#x60;out_for_delivery&#x60; - Package is out for delivery. * &#x60;pickup_available&#x60; - Package is available for pickup at carrier location. * &#x60;delivered&#x60; - Package has been delivered. * &#x60;package_forwarded&#x60; - Package has been forwarded. * &#x60;returned_to_sender&#x60; - Package is to be returned to sender. * &#x60;address_issue&#x60; - Address information is incorrect. Contact carrier to ensure delivery. * &#x60;contact_carrier&#x60; - Contact the carrier for more information. * &#x60;delayed&#x60; - Delivery of package is delayed. * &#x60;delivery_attempted&#x60; - Delivery of package has been attempted. Contact carrier to ensure delivery. * &#x60;delivery_rescheduled&#x60; - Delivery of package has been rescheduled. * &#x60;location_inaccessible&#x60; - Delivery location inaccessible to carrier. Contact carrier to ensure delivery. * &#x60;notice_left&#x60; - Carrier left notice during attempted delivery. Follow carrier instructions on notice. * &#x60;package_damaged&#x60; - Package has been damaged. Contact carrier for more details. * &#x60;package_disposed&#x60; - Package has been disposed. * &#x60;package_held&#x60; - Package held at carrier location. Contact carrier for more details. * &#x60;package_lost&#x60; - Package has been lost. Contact carrier for more details. * &#x60;package_unclaimed&#x60; - Package is unclaimed. * &#x60;package_undeliverable&#x60; - Package is not able to be delivered. * &#x60;reschedule_delivery&#x60; - Contact carrier to reschedule delivery. * &#x60;other&#x60; - Unrecognized carrier status. 
   * @return event
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Find the full table [here](#tag/Tracking-Events). A detailed substatus about the event: * `package_accepted` - Package has been accepted into the carrier network for delivery. * `package_arrived` - Package has arrived at an intermediate location in the carrier network. * `package_departed` - Package has departed from an intermediate location in the carrier network. * `package_processing` - Package is processing at an intermediate location in the carrier network. * `package_processed` - Package has been processed at an intermediate location. * `package_in_local_area` - Package is at a location near the end destination. * `delivery_scheduled` - Package is scheduled for delivery. * `out_for_delivery` - Package is out for delivery. * `pickup_available` - Package is available for pickup at carrier location. * `delivered` - Package has been delivered. * `package_forwarded` - Package has been forwarded. * `returned_to_sender` - Package is to be returned to sender. * `address_issue` - Address information is incorrect. Contact carrier to ensure delivery. * `contact_carrier` - Contact the carrier for more information. * `delayed` - Delivery of package is delayed. * `delivery_attempted` - Delivery of package has been attempted. Contact carrier to ensure delivery. * `delivery_rescheduled` - Delivery of package has been rescheduled. * `location_inaccessible` - Delivery location inaccessible to carrier. Contact carrier to ensure delivery. * `notice_left` - Carrier left notice during attempted delivery. Follow carrier instructions on notice. * `package_damaged` - Package has been damaged. Contact carrier for more details. * `package_disposed` - Package has been disposed. * `package_held` - Package held at carrier location. Contact carrier for more details. * `package_lost` - Package has been lost. Contact carrier for more details. * `package_unclaimed` - Package is unclaimed. * `package_undeliverable` - Package is not able to be delivered. * `reschedule_delivery` - Contact carrier to reschedule delivery. * `other` - Unrecognized carrier status. ")

  public EventEnum getEvent() {
    return event;
  }


  public void setEvent(EventEnum event) {
    
    
    
    this.event = event;
  }


  public TrackingEventDetails notes(String notes) {
    
    
    
    
    this.notes = notes;
    return this;
  }

   /**
   * Event-specific notes from USPS about the tracking event.
   * @return notes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Event-specific notes from USPS about the tracking event.")

  public String getNotes() {
    return notes;
  }


  public void setNotes(String notes) {
    
    
    
    this.notes = notes;
  }


  public TrackingEventDetails actionRequired(Boolean actionRequired) {
    
    
    
    
    this.actionRequired = actionRequired;
    return this;
  }

   /**
   * &#x60;true&#x60; if action is required by the end recipient, &#x60;false&#x60; otherwise. 
   * @return actionRequired
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "`true` if action is required by the end recipient, `false` otherwise. ")

  public Boolean getActionRequired() {
    return actionRequired;
  }


  public void setActionRequired(Boolean actionRequired) {
    
    
    
    this.actionRequired = actionRequired;
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
   * @return the TrackingEventDetails instance itself
   */
  public TrackingEventDetails putAdditionalProperty(String key, Object value) {
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
    TrackingEventDetails trackingEventDetails = (TrackingEventDetails) o;
    return Objects.equals(this.description, trackingEventDetails.description) &&
        Objects.equals(this.event, trackingEventDetails.event) &&
        Objects.equals(this.notes, trackingEventDetails.notes) &&
        Objects.equals(this.actionRequired, trackingEventDetails.actionRequired)&&
        Objects.equals(this.additionalProperties, trackingEventDetails.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, event, notes, actionRequired, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackingEventDetails {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    actionRequired: ").append(toIndentedString(actionRequired)).append("\n");
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
    openapiFields.add("event");
    openapiFields.add("notes");
    openapiFields.add("action_required");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("event");
    openapiRequiredFields.add("action_required");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TrackingEventDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TrackingEventDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TrackingEventDetails is not found in the empty JSON string", TrackingEventDetails.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TrackingEventDetails.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("event").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `event` to be a primitive type in the JSON string but got `%s`", jsonObj.get("event").toString()));
      }
      if ((jsonObj.get("notes") != null && !jsonObj.get("notes").isJsonNull()) && !jsonObj.get("notes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TrackingEventDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TrackingEventDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TrackingEventDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TrackingEventDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<TrackingEventDetails>() {
           @Override
           public void write(JsonWriter out, TrackingEventDetails value) throws IOException {
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
           public TrackingEventDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TrackingEventDetails instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TrackingEventDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TrackingEventDetails
  * @throws IOException if the JSON string is invalid with respect to TrackingEventDetails
  */
  public static TrackingEventDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TrackingEventDetails.class);
  }

 /**
  * Convert an instance of TrackingEventDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


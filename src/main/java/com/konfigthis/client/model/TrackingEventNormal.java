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
 * TrackingEventNormal
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TrackingEventNormal {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TIME = "time";
  @SerializedName(SERIALIZED_NAME_TIME)
  private OffsetDateTime time;

  public static final String SERIALIZED_NAME_DATE_CREATED = "date_created";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  private OffsetDateTime dateCreated;

  public static final String SERIALIZED_NAME_DATE_MODIFIED = "date_modified";
  @SerializedName(SERIALIZED_NAME_DATE_MODIFIED)
  private OffsetDateTime dateModified;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private String _object;

  /**
   * non-Certified postcards, self mailers, letters, checks and snap packs
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    NORMAL("normal");

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

  /**
   * Name of tracking event (for normal postcards, self mailers, letters, checks and snap packs):    * &#x60;Mailed&#x60; - The mailpiece has been handed off to and accepted by USPS     and is en route. &lt;a href&#x3D;\&quot;https://help.lob.com/print-and-mail/getting-data-and-results/tracking-your-mail#mailed-tracking-events-4\&quot; target&#x3D;\&quot;_blank\&quot;&gt;More about     Mailed.&lt;/a&gt;     Note this data is only available in Enterprise editions of     Lob. &lt;a href&#x3D;\&quot;https://lob.com/support/contact#contact\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Contact Sales&lt;/a&gt; if     you want access to this feature.    * &#x60;In Transit&#x60; - The mailpiece is being processed at the entry/origin facility.    * &#x60;In Local Area&#x60; - The mailpiece is being processed at the destination facility.    * &#x60;Processed for Delivery&#x60; - The mailpiece has been greenlit for     delivery at the recipient&#39;s nearest postal facility. The mailpiece     should reach the mailbox within 1 business day of this tracking     event.    * &#x60;Delivered&#x60; - The mail piece has been delivered to      the recipient’s address. The final scan is generated when the mail      carrier&#39;s GPS unit leaves the delivery area.    * &#x60;Re-Routed&#x60; - The mailpiece is re-routed due to recipient change of     address, address errors, or USPS relabeling of barcode/ID tag     area.    * &#x60;Returned to Sender&#x60; - The mailpiece is being returned to sender due     to barcode, ID tag area, or address errors.      * &#x60;International Exit&#x60; - The mail piece has been processed to      ship to a destination abroad. This is typically the last      scan a US-originated international mail piece will receive      from the USPS.  &lt;a href&#x3D;\&quot;https://help.lob.com/print-and-mail/getting-data-and-results/tracking-your-mail#mailed-tracking-events-4\&quot; target&#x3D;\&quot;_blank\&quot;&gt;More about tracking&lt;/a&gt; 
   */
  @JsonAdapter(NameEnum.Adapter.class)
 public enum NameEnum {
    MAILED("Mailed"),
    
    IN_TRANSIT("In Transit"),
    
    IN_LOCAL_AREA("In Local Area"),
    
    PROCESSED_FOR_DELIVERY("Processed for Delivery"),
    
    DELIVERED("Delivered"),
    
    RE_ROUTED("Re-Routed"),
    
    RETURNED_TO_SENDER("Returned to Sender"),
    
    INTERNATIONAL_EXIT("International Exit");

    private String value;

    NameEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NameEnum fromValue(String value) {
      for (NameEnum b : NameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<NameEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NameEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NameEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return NameEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private NameEnum name;

  /**
   * Will be &#x60;null&#x60; for &#x60;type&#x3D;normal&#x60; events
   */
  @JsonAdapter(DetailsEnum.Adapter.class)
 public enum DetailsEnum {
    NULL("null");

    private String value;

    DetailsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DetailsEnum fromValue(String value) {
      for (DetailsEnum b : DetailsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DetailsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DetailsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DetailsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DetailsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private DetailsEnum details;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public TrackingEventNormal() {
  }

  public TrackingEventNormal id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier prefixed with &#x60;evnt_&#x60;.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unique identifier prefixed with `evnt_`.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public TrackingEventNormal time(OffsetDateTime time) {
    
    
    
    
    this.time = time;
    return this;
  }

   /**
   * A timestamp in ISO 8601 format of the date USPS registered the event.
   * @return time
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A timestamp in ISO 8601 format of the date USPS registered the event.")

  public OffsetDateTime getTime() {
    return time;
  }


  public void setTime(OffsetDateTime time) {
    
    
    
    this.time = time;
  }


  public TrackingEventNormal dateCreated(OffsetDateTime dateCreated) {
    
    
    
    
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


  public TrackingEventNormal dateModified(OffsetDateTime dateModified) {
    
    
    
    
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


  public TrackingEventNormal _object(String _object) {
    
    
    
    
    this._object = _object;
    return this;
  }

   /**
   * Get _object
   * @return _object
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getObject() {
    return _object;
  }


  public void setObject(String _object) {
    
    
    
    this._object = _object;
  }


  public TrackingEventNormal type(TypeEnum type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * non-Certified postcards, self mailers, letters, checks and snap packs
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "non-Certified postcards, self mailers, letters, checks and snap packs")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    
    
    
    this.type = type;
  }


  public TrackingEventNormal name(NameEnum name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Name of tracking event (for normal postcards, self mailers, letters, checks and snap packs):    * &#x60;Mailed&#x60; - The mailpiece has been handed off to and accepted by USPS     and is en route. &lt;a href&#x3D;\&quot;https://help.lob.com/print-and-mail/getting-data-and-results/tracking-your-mail#mailed-tracking-events-4\&quot; target&#x3D;\&quot;_blank\&quot;&gt;More about     Mailed.&lt;/a&gt;     Note this data is only available in Enterprise editions of     Lob. &lt;a href&#x3D;\&quot;https://lob.com/support/contact#contact\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Contact Sales&lt;/a&gt; if     you want access to this feature.    * &#x60;In Transit&#x60; - The mailpiece is being processed at the entry/origin facility.    * &#x60;In Local Area&#x60; - The mailpiece is being processed at the destination facility.    * &#x60;Processed for Delivery&#x60; - The mailpiece has been greenlit for     delivery at the recipient&#39;s nearest postal facility. The mailpiece     should reach the mailbox within 1 business day of this tracking     event.    * &#x60;Delivered&#x60; - The mail piece has been delivered to      the recipient’s address. The final scan is generated when the mail      carrier&#39;s GPS unit leaves the delivery area.    * &#x60;Re-Routed&#x60; - The mailpiece is re-routed due to recipient change of     address, address errors, or USPS relabeling of barcode/ID tag     area.    * &#x60;Returned to Sender&#x60; - The mailpiece is being returned to sender due     to barcode, ID tag area, or address errors.      * &#x60;International Exit&#x60; - The mail piece has been processed to      ship to a destination abroad. This is typically the last      scan a US-originated international mail piece will receive      from the USPS.  &lt;a href&#x3D;\&quot;https://help.lob.com/print-and-mail/getting-data-and-results/tracking-your-mail#mailed-tracking-events-4\&quot; target&#x3D;\&quot;_blank\&quot;&gt;More about tracking&lt;/a&gt; 
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of tracking event (for normal postcards, self mailers, letters, checks and snap packs):    * `Mailed` - The mailpiece has been handed off to and accepted by USPS     and is en route. <a href=\"https://help.lob.com/print-and-mail/getting-data-and-results/tracking-your-mail#mailed-tracking-events-4\" target=\"_blank\">More about     Mailed.</a>     Note this data is only available in Enterprise editions of     Lob. <a href=\"https://lob.com/support/contact#contact\" target=\"_blank\">Contact Sales</a> if     you want access to this feature.    * `In Transit` - The mailpiece is being processed at the entry/origin facility.    * `In Local Area` - The mailpiece is being processed at the destination facility.    * `Processed for Delivery` - The mailpiece has been greenlit for     delivery at the recipient's nearest postal facility. The mailpiece     should reach the mailbox within 1 business day of this tracking     event.    * `Delivered` - The mail piece has been delivered to      the recipient’s address. The final scan is generated when the mail      carrier's GPS unit leaves the delivery area.    * `Re-Routed` - The mailpiece is re-routed due to recipient change of     address, address errors, or USPS relabeling of barcode/ID tag     area.    * `Returned to Sender` - The mailpiece is being returned to sender due     to barcode, ID tag area, or address errors.      * `International Exit` - The mail piece has been processed to      ship to a destination abroad. This is typically the last      scan a US-originated international mail piece will receive      from the USPS.  <a href=\"https://help.lob.com/print-and-mail/getting-data-and-results/tracking-your-mail#mailed-tracking-events-4\" target=\"_blank\">More about tracking</a> ")

  public NameEnum getName() {
    return name;
  }


  public void setName(NameEnum name) {
    
    
    
    this.name = name;
  }


  public TrackingEventNormal details(DetailsEnum details) {
    
    
    
    
    this.details = details;
    return this;
  }

   /**
   * Will be &#x60;null&#x60; for &#x60;type&#x3D;normal&#x60; events
   * @return details
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Will be `null` for `type=normal` events")

  public DetailsEnum getDetails() {
    return details;
  }


  public void setDetails(DetailsEnum details) {
    
    
    
    this.details = details;
  }


  public TrackingEventNormal location(String location) {
    
    
    
    
    this.location = location;
    return this;
  }

   /**
   * The zip code in which the scan event occurred. Null for &#x60;Mailed&#x60; events. 
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The zip code in which the scan event occurred. Null for `Mailed` events. ")

  public String getLocation() {
    return location;
  }


  public void setLocation(String location) {
    
    
    
    this.location = location;
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
   * @return the TrackingEventNormal instance itself
   */
  public TrackingEventNormal putAdditionalProperty(String key, Object value) {
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
    TrackingEventNormal trackingEventNormal = (TrackingEventNormal) o;
    return Objects.equals(this.id, trackingEventNormal.id) &&
        Objects.equals(this.time, trackingEventNormal.time) &&
        Objects.equals(this.dateCreated, trackingEventNormal.dateCreated) &&
        Objects.equals(this.dateModified, trackingEventNormal.dateModified) &&
        Objects.equals(this._object, trackingEventNormal._object) &&
        Objects.equals(this.type, trackingEventNormal.type) &&
        Objects.equals(this.name, trackingEventNormal.name) &&
        Objects.equals(this.details, trackingEventNormal.details) &&
        Objects.equals(this.location, trackingEventNormal.location)&&
        Objects.equals(this.additionalProperties, trackingEventNormal.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, time, dateCreated, dateModified, _object, type, name, details, location, additionalProperties);
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
    sb.append("class TrackingEventNormal {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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
    openapiFields.add("time");
    openapiFields.add("date_created");
    openapiFields.add("date_modified");
    openapiFields.add("object");
    openapiFields.add("type");
    openapiFields.add("name");
    openapiFields.add("details");
    openapiFields.add("location");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("date_created");
    openapiRequiredFields.add("date_modified");
    openapiRequiredFields.add("object");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TrackingEventNormal
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TrackingEventNormal.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TrackingEventNormal is not found in the empty JSON string", TrackingEventNormal.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TrackingEventNormal.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the required field `object`
      String.validateJsonObject(jsonObj.getAsJsonObject("object"));
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("location").isJsonNull() && (jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) && !jsonObj.get("location").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `location` to be a primitive type in the JSON string but got `%s`", jsonObj.get("location").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TrackingEventNormal.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TrackingEventNormal' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TrackingEventNormal> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TrackingEventNormal.class));

       return (TypeAdapter<T>) new TypeAdapter<TrackingEventNormal>() {
           @Override
           public void write(JsonWriter out, TrackingEventNormal value) throws IOException {
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
           public TrackingEventNormal read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TrackingEventNormal instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TrackingEventNormal given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TrackingEventNormal
  * @throws IOException if the JSON string is invalid with respect to TrackingEventNormal
  */
  public static TrackingEventNormal fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TrackingEventNormal.class);
  }

 /**
  * Convert an instance of TrackingEventNormal to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


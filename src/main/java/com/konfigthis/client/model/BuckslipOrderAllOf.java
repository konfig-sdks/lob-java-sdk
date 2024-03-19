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
 * BuckslipOrderAllOf
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class BuckslipOrderAllOf {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_BUCKSLIP_ID = "buckslip_id";
  @SerializedName(SERIALIZED_NAME_BUCKSLIP_ID)
  private String buckslipId;

  /**
   * The status of the buckslip order.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
 public enum StatusEnum {
    PENDING("pending"),
    
    PRINTING("printing"),
    
    AVAILABLE("available"),
    
    CANCELLED("cancelled"),
    
    DEPLETED("depleted");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_QUANTITY_ORDERED = "quantity_ordered";
  @SerializedName(SERIALIZED_NAME_QUANTITY_ORDERED)
  private Double quantityOrdered = 0d;

  public static final String SERIALIZED_NAME_UNIT_PRICE = "unit_price";
  @SerializedName(SERIALIZED_NAME_UNIT_PRICE)
  private Double unitPrice = 0d;

  public static final String SERIALIZED_NAME_INVENTORY = "inventory";
  @SerializedName(SERIALIZED_NAME_INVENTORY)
  private Double inventory = 0d;

  public static final String SERIALIZED_NAME_CANCELLED_REASON = "cancelled_reason";
  @SerializedName(SERIALIZED_NAME_CANCELLED_REASON)
  private String cancelledReason;

  public static final String SERIALIZED_NAME_AVAILABILITY_DATE = "availability_date";
  @SerializedName(SERIALIZED_NAME_AVAILABILITY_DATE)
  private OffsetDateTime availabilityDate;

  public static final String SERIALIZED_NAME_EXPECTED_AVAILABILITY_DATE = "expected_availability_date";
  @SerializedName(SERIALIZED_NAME_EXPECTED_AVAILABILITY_DATE)
  private OffsetDateTime expectedAvailabilityDate;

  public BuckslipOrderAllOf() {
  }

  public BuckslipOrderAllOf id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier prefixed with &#x60;bo_&#x60;.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier prefixed with `bo_`.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public BuckslipOrderAllOf buckslipId(String buckslipId) {
    
    
    
    
    this.buckslipId = buckslipId;
    return this;
  }

   /**
   * Unique identifier prefixed with &#x60;bck_&#x60;.
   * @return buckslipId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier prefixed with `bck_`.")

  public String getBuckslipId() {
    return buckslipId;
  }


  public void setBuckslipId(String buckslipId) {
    
    
    
    this.buckslipId = buckslipId;
  }


  public BuckslipOrderAllOf status(StatusEnum status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * The status of the buckslip order.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The status of the buckslip order.")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    
    
    
    this.status = status;
  }


  public BuckslipOrderAllOf quantityOrdered(Double quantityOrdered) {
    
    
    
    
    this.quantityOrdered = quantityOrdered;
    return this;
  }

  public BuckslipOrderAllOf quantityOrdered(Integer quantityOrdered) {
    
    
    
    
    this.quantityOrdered = quantityOrdered.doubleValue();
    return this;
  }

   /**
   * The quantity of buckslips ordered.
   * @return quantityOrdered
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "The quantity of buckslips ordered.")

  public Double getQuantityOrdered() {
    return quantityOrdered;
  }


  public void setQuantityOrdered(Double quantityOrdered) {
    
    
    
    this.quantityOrdered = quantityOrdered;
  }


  public BuckslipOrderAllOf unitPrice(Double unitPrice) {
    
    
    
    
    this.unitPrice = unitPrice;
    return this;
  }

  public BuckslipOrderAllOf unitPrice(Integer unitPrice) {
    
    
    
    
    this.unitPrice = unitPrice.doubleValue();
    return this;
  }

   /**
   * The unit price for the buckslip order.
   * @return unitPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "The unit price for the buckslip order.")

  public Double getUnitPrice() {
    return unitPrice;
  }


  public void setUnitPrice(Double unitPrice) {
    
    
    
    this.unitPrice = unitPrice;
  }


  public BuckslipOrderAllOf inventory(Double inventory) {
    
    
    
    
    this.inventory = inventory;
    return this;
  }

  public BuckslipOrderAllOf inventory(Integer inventory) {
    
    
    
    
    this.inventory = inventory.doubleValue();
    return this;
  }

   /**
   * The inventory of the buckslip order.
   * @return inventory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "The inventory of the buckslip order.")

  public Double getInventory() {
    return inventory;
  }


  public void setInventory(Double inventory) {
    
    
    
    this.inventory = inventory;
  }


  public BuckslipOrderAllOf cancelledReason(String cancelledReason) {
    
    
    
    
    this.cancelledReason = cancelledReason;
    return this;
  }

   /**
   * The reason for cancellation.
   * @return cancelledReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The reason for cancellation.")

  public String getCancelledReason() {
    return cancelledReason;
  }


  public void setCancelledReason(String cancelledReason) {
    
    
    
    this.cancelledReason = cancelledReason;
  }


  public BuckslipOrderAllOf availabilityDate(OffsetDateTime availabilityDate) {
    
    
    
    
    this.availabilityDate = availabilityDate;
    return this;
  }

   /**
   * A timestamp in ISO 8601 format of the date the resource was created.
   * @return availabilityDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A timestamp in ISO 8601 format of the date the resource was created.")

  public OffsetDateTime getAvailabilityDate() {
    return availabilityDate;
  }


  public void setAvailabilityDate(OffsetDateTime availabilityDate) {
    
    
    
    this.availabilityDate = availabilityDate;
  }


  public BuckslipOrderAllOf expectedAvailabilityDate(OffsetDateTime expectedAvailabilityDate) {
    
    
    
    
    this.expectedAvailabilityDate = expectedAvailabilityDate;
    return this;
  }

   /**
   * The fixed deadline for the buckslips to be printed.
   * @return expectedAvailabilityDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The fixed deadline for the buckslips to be printed.")

  public OffsetDateTime getExpectedAvailabilityDate() {
    return expectedAvailabilityDate;
  }


  public void setExpectedAvailabilityDate(OffsetDateTime expectedAvailabilityDate) {
    
    
    
    this.expectedAvailabilityDate = expectedAvailabilityDate;
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
   * @return the BuckslipOrderAllOf instance itself
   */
  public BuckslipOrderAllOf putAdditionalProperty(String key, Object value) {
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
    BuckslipOrderAllOf buckslipOrderAllOf = (BuckslipOrderAllOf) o;
    return Objects.equals(this.id, buckslipOrderAllOf.id) &&
        Objects.equals(this.buckslipId, buckslipOrderAllOf.buckslipId) &&
        Objects.equals(this.status, buckslipOrderAllOf.status) &&
        Objects.equals(this.quantityOrdered, buckslipOrderAllOf.quantityOrdered) &&
        Objects.equals(this.unitPrice, buckslipOrderAllOf.unitPrice) &&
        Objects.equals(this.inventory, buckslipOrderAllOf.inventory) &&
        Objects.equals(this.cancelledReason, buckslipOrderAllOf.cancelledReason) &&
        Objects.equals(this.availabilityDate, buckslipOrderAllOf.availabilityDate) &&
        Objects.equals(this.expectedAvailabilityDate, buckslipOrderAllOf.expectedAvailabilityDate)&&
        Objects.equals(this.additionalProperties, buckslipOrderAllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, buckslipId, status, quantityOrdered, unitPrice, inventory, cancelledReason, availabilityDate, expectedAvailabilityDate, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuckslipOrderAllOf {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    buckslipId: ").append(toIndentedString(buckslipId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    quantityOrdered: ").append(toIndentedString(quantityOrdered)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    inventory: ").append(toIndentedString(inventory)).append("\n");
    sb.append("    cancelledReason: ").append(toIndentedString(cancelledReason)).append("\n");
    sb.append("    availabilityDate: ").append(toIndentedString(availabilityDate)).append("\n");
    sb.append("    expectedAvailabilityDate: ").append(toIndentedString(expectedAvailabilityDate)).append("\n");
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
    openapiFields.add("buckslip_id");
    openapiFields.add("status");
    openapiFields.add("quantity_ordered");
    openapiFields.add("unit_price");
    openapiFields.add("inventory");
    openapiFields.add("cancelled_reason");
    openapiFields.add("availability_date");
    openapiFields.add("expected_availability_date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BuckslipOrderAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BuckslipOrderAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BuckslipOrderAllOf is not found in the empty JSON string", BuckslipOrderAllOf.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("buckslip_id") != null && !jsonObj.get("buckslip_id").isJsonNull()) && !jsonObj.get("buckslip_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `buckslip_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("buckslip_id").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("cancelled_reason") != null && !jsonObj.get("cancelled_reason").isJsonNull()) && !jsonObj.get("cancelled_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cancelled_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cancelled_reason").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BuckslipOrderAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BuckslipOrderAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BuckslipOrderAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BuckslipOrderAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<BuckslipOrderAllOf>() {
           @Override
           public void write(JsonWriter out, BuckslipOrderAllOf value) throws IOException {
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
           public BuckslipOrderAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             BuckslipOrderAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of BuckslipOrderAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BuckslipOrderAllOf
  * @throws IOException if the JSON string is invalid with respect to BuckslipOrderAllOf
  */
  public static BuckslipOrderAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BuckslipOrderAllOf.class);
  }

 /**
  * Convert an instance of BuckslipOrderAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


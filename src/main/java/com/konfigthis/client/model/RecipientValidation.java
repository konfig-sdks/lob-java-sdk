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
 * RecipientValidation
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class RecipientValidation {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_RECIPIENT = "recipient";
  @SerializedName(SERIALIZED_NAME_RECIPIENT)
  private String recipient;

  public static final String SERIALIZED_NAME_PRIMARY_LINE = "primary_line";
  @SerializedName(SERIALIZED_NAME_PRIMARY_LINE)
  private String primaryLine;

  public static final String SERIALIZED_NAME_SECONDARY_LINE = "secondary_line";
  @SerializedName(SERIALIZED_NAME_SECONDARY_LINE)
  private String secondaryLine;

  public static final String SERIALIZED_NAME_URBANIZATION = "urbanization";
  @SerializedName(SERIALIZED_NAME_URBANIZATION)
  private String urbanization;

  public static final String SERIALIZED_NAME_LAST_LINE = "last_line";
  @SerializedName(SERIALIZED_NAME_LAST_LINE)
  private String lastLine;

  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private Float score;

  /**
   * Indicates the likelihood the recipient name and address match based on our custom internal calculation. Possible values are: - &#x60;high&#x60; — Has a Lob confidence score greater than 70. - &#x60;medium&#x60; — Has a Lob confidence score between 40 and 70. - &#x60;low&#x60; — Has a Lob confidence score less than 40. - &#x60;\&quot;\&quot;&#x60; — No tracking data exists for this address. 
   */
  @JsonAdapter(ConfidenceEnum.Adapter.class)
 public enum ConfidenceEnum {
    HIGH("high"),
    
    MEDIUM("medium"),
    
    LOW("low"),
    
    EMPTY("");

    private String value;

    ConfidenceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ConfidenceEnum fromValue(String value) {
      for (ConfidenceEnum b : ConfidenceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ConfidenceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ConfidenceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ConfidenceEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ConfidenceEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CONFIDENCE = "confidence";
  @SerializedName(SERIALIZED_NAME_CONFIDENCE)
  private ConfidenceEnum confidence;

  /**
   * Value is resource type.
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
 public enum ObjectEnum {
    ID_VALIDATION("id_validation");

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
  private ObjectEnum _object = ObjectEnum.ID_VALIDATION;

  public RecipientValidation() {
  }

  public RecipientValidation id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier prefixed with &#x60;id_validation_&#x60;.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier prefixed with `id_validation_`.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public RecipientValidation recipient(String recipient) {
    
    
    
    
    this.recipient = recipient;
    return this;
  }

   /**
   * The name of the person whose identity is being validated.
   * @return recipient
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the person whose identity is being validated.")

  public String getRecipient() {
    return recipient;
  }


  public void setRecipient(String recipient) {
    
    
    
    this.recipient = recipient;
  }


  public RecipientValidation primaryLine(String primaryLine) {
    
    
    
    
    this.primaryLine = primaryLine;
    return this;
  }

   /**
   * The primary delivery line (usually the street address) of the address. Combination of the following applicable &#x60;components&#x60;: * &#x60;primary_number&#x60; * &#x60;street_predirection&#x60; * &#x60;street_name&#x60; * &#x60;street_suffix&#x60; * &#x60;street_postdirection&#x60; * &#x60;secondary_designator&#x60; * &#x60;secondary_number&#x60; * &#x60;pmb_designator&#x60; * &#x60;pmb_number&#x60; 
   * @return primaryLine
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The primary delivery line (usually the street address) of the address. Combination of the following applicable `components`: * `primary_number` * `street_predirection` * `street_name` * `street_suffix` * `street_postdirection` * `secondary_designator` * `secondary_number` * `pmb_designator` * `pmb_number` ")

  public String getPrimaryLine() {
    return primaryLine;
  }


  public void setPrimaryLine(String primaryLine) {
    
    
    
    this.primaryLine = primaryLine;
  }


  public RecipientValidation secondaryLine(String secondaryLine) {
    
    
    
    
    this.secondaryLine = secondaryLine;
    return this;
  }

   /**
   * The secondary delivery line of the address. This field is typically empty but may contain information if &#x60;primary_line&#x60; is too long. 
   * @return secondaryLine
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The secondary delivery line of the address. This field is typically empty but may contain information if `primary_line` is too long. ")

  public String getSecondaryLine() {
    return secondaryLine;
  }


  public void setSecondaryLine(String secondaryLine) {
    
    
    
    this.secondaryLine = secondaryLine;
  }


  public RecipientValidation urbanization(String urbanization) {
    
    
    
    
    this.urbanization = urbanization;
    return this;
  }

   /**
   * Only present for addresses in Puerto Rico. An urbanization refers to an area, sector, or development within a city. See &lt;a href&#x3D;\&quot;https://pe.usps.com/text/pub28/28api_008.htm#:~:text&#x3D;I51.,-4%20Urbanizations&amp;text&#x3D;In%20Puerto%20Rico%2C%20identical%20street,placed%20before%20the%20urbanization%20name.\&quot; target&#x3D;\&quot;_blank\&quot;&gt;USPS documentation&lt;/a&gt; for clarification. 
   * @return urbanization
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only present for addresses in Puerto Rico. An urbanization refers to an area, sector, or development within a city. See <a href=\"https://pe.usps.com/text/pub28/28api_008.htm#:~:text=I51.,-4%20Urbanizations&text=In%20Puerto%20Rico%2C%20identical%20street,placed%20before%20the%20urbanization%20name.\" target=\"_blank\">USPS documentation</a> for clarification. ")

  public String getUrbanization() {
    return urbanization;
  }


  public void setUrbanization(String urbanization) {
    
    
    
    this.urbanization = urbanization;
  }


  public RecipientValidation lastLine(String lastLine) {
    
    
    
    
    this.lastLine = lastLine;
    return this;
  }

   /**
   * Combination of the following applicable &#x60;components&#x60;: * City (&#x60;city&#x60;) * State (&#x60;state&#x60;) * ZIP code (&#x60;zip_code&#x60;) * ZIP+4 (&#x60;zip_code_plus_4&#x60;) 
   * @return lastLine
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Combination of the following applicable `components`: * City (`city`) * State (`state`) * ZIP code (`zip_code`) * ZIP+4 (`zip_code_plus_4`) ")

  public String getLastLine() {
    return lastLine;
  }


  public void setLastLine(String lastLine) {
    
    
    
    this.lastLine = lastLine;
  }


  public RecipientValidation score(Float score) {
    if (score != null && score < 0) {
      throw new IllegalArgumentException("Invalid value for score. Must be greater than or equal to 0.");
    }
    if (score != null && score > 100) {
      throw new IllegalArgumentException("Invalid value for score. Must be less than or equal to 100.");
    }
    
    
    this.score = score;
    return this;
  }

   /**
   * A numerical score between 0 and 100 that represents the likelihood the provided name is associated with a physical address. 
   * minimum: 0
   * maximum: 100
   * @return score
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A numerical score between 0 and 100 that represents the likelihood the provided name is associated with a physical address. ")

  public Float getScore() {
    return score;
  }


  public void setScore(Float score) {
    if (score != null && score < 0) {
      throw new IllegalArgumentException("Invalid value for score. Must be greater than or equal to 0.");
    }
    if (score != null && score > 100) {
      throw new IllegalArgumentException("Invalid value for score. Must be less than or equal to 100.");
    }
    
    this.score = score;
  }


  public RecipientValidation confidence(ConfidenceEnum confidence) {
    
    
    
    
    this.confidence = confidence;
    return this;
  }

   /**
   * Indicates the likelihood the recipient name and address match based on our custom internal calculation. Possible values are: - &#x60;high&#x60; — Has a Lob confidence score greater than 70. - &#x60;medium&#x60; — Has a Lob confidence score between 40 and 70. - &#x60;low&#x60; — Has a Lob confidence score less than 40. - &#x60;\&quot;\&quot;&#x60; — No tracking data exists for this address. 
   * @return confidence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates the likelihood the recipient name and address match based on our custom internal calculation. Possible values are: - `high` — Has a Lob confidence score greater than 70. - `medium` — Has a Lob confidence score between 40 and 70. - `low` — Has a Lob confidence score less than 40. - `\"\"` — No tracking data exists for this address. ")

  public ConfidenceEnum getConfidence() {
    return confidence;
  }


  public void setConfidence(ConfidenceEnum confidence) {
    
    
    
    this.confidence = confidence;
  }


  public RecipientValidation _object(ObjectEnum _object) {
    
    
    
    
    this._object = _object;
    return this;
  }

   /**
   * Value is resource type.
   * @return _object
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ID_VALIDATION", value = "Value is resource type.")

  public ObjectEnum getObject() {
    return _object;
  }


  public void setObject(ObjectEnum _object) {
    
    
    
    this._object = _object;
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
   * @return the RecipientValidation instance itself
   */
  public RecipientValidation putAdditionalProperty(String key, Object value) {
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
    RecipientValidation recipientValidation = (RecipientValidation) o;
    return Objects.equals(this.id, recipientValidation.id) &&
        Objects.equals(this.recipient, recipientValidation.recipient) &&
        Objects.equals(this.primaryLine, recipientValidation.primaryLine) &&
        Objects.equals(this.secondaryLine, recipientValidation.secondaryLine) &&
        Objects.equals(this.urbanization, recipientValidation.urbanization) &&
        Objects.equals(this.lastLine, recipientValidation.lastLine) &&
        Objects.equals(this.score, recipientValidation.score) &&
        Objects.equals(this.confidence, recipientValidation.confidence) &&
        Objects.equals(this._object, recipientValidation._object)&&
        Objects.equals(this.additionalProperties, recipientValidation.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, recipient, primaryLine, secondaryLine, urbanization, lastLine, score, confidence, _object, additionalProperties);
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
    sb.append("class RecipientValidation {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    primaryLine: ").append(toIndentedString(primaryLine)).append("\n");
    sb.append("    secondaryLine: ").append(toIndentedString(secondaryLine)).append("\n");
    sb.append("    urbanization: ").append(toIndentedString(urbanization)).append("\n");
    sb.append("    lastLine: ").append(toIndentedString(lastLine)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
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
    openapiFields.add("recipient");
    openapiFields.add("primary_line");
    openapiFields.add("secondary_line");
    openapiFields.add("urbanization");
    openapiFields.add("last_line");
    openapiFields.add("score");
    openapiFields.add("confidence");
    openapiFields.add("object");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RecipientValidation
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RecipientValidation.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RecipientValidation is not found in the empty JSON string", RecipientValidation.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("recipient").isJsonNull() && (jsonObj.get("recipient") != null && !jsonObj.get("recipient").isJsonNull()) && !jsonObj.get("recipient").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recipient` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recipient").toString()));
      }
      if ((jsonObj.get("primary_line") != null && !jsonObj.get("primary_line").isJsonNull()) && !jsonObj.get("primary_line").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `primary_line` to be a primitive type in the JSON string but got `%s`", jsonObj.get("primary_line").toString()));
      }
      if ((jsonObj.get("secondary_line") != null && !jsonObj.get("secondary_line").isJsonNull()) && !jsonObj.get("secondary_line").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secondary_line` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secondary_line").toString()));
      }
      if ((jsonObj.get("urbanization") != null && !jsonObj.get("urbanization").isJsonNull()) && !jsonObj.get("urbanization").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `urbanization` to be a primitive type in the JSON string but got `%s`", jsonObj.get("urbanization").toString()));
      }
      if ((jsonObj.get("last_line") != null && !jsonObj.get("last_line").isJsonNull()) && !jsonObj.get("last_line").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_line` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_line").toString()));
      }
      if ((jsonObj.get("confidence") != null && !jsonObj.get("confidence").isJsonNull()) && !jsonObj.get("confidence").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `confidence` to be a primitive type in the JSON string but got `%s`", jsonObj.get("confidence").toString()));
      }
      if ((jsonObj.get("object") != null && !jsonObj.get("object").isJsonNull()) && !jsonObj.get("object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RecipientValidation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RecipientValidation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RecipientValidation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RecipientValidation.class));

       return (TypeAdapter<T>) new TypeAdapter<RecipientValidation>() {
           @Override
           public void write(JsonWriter out, RecipientValidation value) throws IOException {
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
           public RecipientValidation read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             RecipientValidation instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of RecipientValidation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RecipientValidation
  * @throws IOException if the JSON string is invalid with respect to RecipientValidation
  */
  public static RecipientValidation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RecipientValidation.class);
  }

 /**
  * Convert an instance of RecipientValidation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


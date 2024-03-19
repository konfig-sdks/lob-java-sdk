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
import com.konfigthis.client.model.OptionalAddressColumnMapping;
import com.konfigthis.client.model.RequiredAddressColumnMapping;
import com.konfigthis.client.model.UploadState;
import com.konfigthis.client.model.UploadsMetadata;
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
 * Upload
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Upload {
  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaignId";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private String campaignId;

  public static final String SERIALIZED_NAME_REQUIRED_ADDRESS_COLUMN_MAPPING = "requiredAddressColumnMapping";
  @SerializedName(SERIALIZED_NAME_REQUIRED_ADDRESS_COLUMN_MAPPING)
  private RequiredAddressColumnMapping requiredAddressColumnMapping;

  public static final String SERIALIZED_NAME_OPTIONAL_ADDRESS_COLUMN_MAPPING = "optionalAddressColumnMapping";
  @SerializedName(SERIALIZED_NAME_OPTIONAL_ADDRESS_COLUMN_MAPPING)
  private OptionalAddressColumnMapping optionalAddressColumnMapping;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private UploadsMetadata metadata = {"columns":[]};

  public static final String SERIALIZED_NAME_MERGE_VARIABLE_COLUMN_MAPPING = "mergeVariableColumnMapping";
  @SerializedName(SERIALIZED_NAME_MERGE_VARIABLE_COLUMN_MAPPING)
  private String mergeVariableColumnMapping;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  /**
   * The environment in which the mailpieces were created. Today, will only be &#x60;live&#x60;.
   */
  @JsonAdapter(ModeEnum.Adapter.class)
 public enum ModeEnum {
    TEST("test"),
    
    LIVE("live");

    private String value;

    ModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ModeEnum fromValue(String value) {
      for (ModeEnum b : ModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ModeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ModeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private ModeEnum mode;

  public static final String SERIALIZED_NAME_FAILURES_URL = "failuresUrl";
  @SerializedName(SERIALIZED_NAME_FAILURES_URL)
  private String failuresUrl;

  public static final String SERIALIZED_NAME_ORIGINAL_FILENAME = "originalFilename";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_FILENAME)
  private String originalFilename;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private UploadState state = UploadState.DRAFT;

  public static final String SERIALIZED_NAME_TOTAL_MAILPIECES = "totalMailpieces";
  @SerializedName(SERIALIZED_NAME_TOTAL_MAILPIECES)
  private Integer totalMailpieces;

  public static final String SERIALIZED_NAME_FAILED_MAILPIECES = "failedMailpieces";
  @SerializedName(SERIALIZED_NAME_FAILED_MAILPIECES)
  private Integer failedMailpieces;

  public static final String SERIALIZED_NAME_VALIDATED_MAILPIECES = "validatedMailpieces";
  @SerializedName(SERIALIZED_NAME_VALIDATED_MAILPIECES)
  private Integer validatedMailpieces;

  public static final String SERIALIZED_NAME_BYTES_PROCESSED = "bytesProcessed";
  @SerializedName(SERIALIZED_NAME_BYTES_PROCESSED)
  private Integer bytesProcessed;

  public static final String SERIALIZED_NAME_DATE_CREATED = "dateCreated";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  private OffsetDateTime dateCreated;

  public static final String SERIALIZED_NAME_DATE_MODIFIED = "dateModified";
  @SerializedName(SERIALIZED_NAME_DATE_MODIFIED)
  private OffsetDateTime dateModified;

  public Upload() {
  }

  public Upload campaignId(String campaignId) {
    
    
    
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * Get campaignId
   * @return campaignId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(String campaignId) {
    
    
    
    this.campaignId = campaignId;
  }


  public Upload requiredAddressColumnMapping(RequiredAddressColumnMapping requiredAddressColumnMapping) {
    
    
    
    
    this.requiredAddressColumnMapping = requiredAddressColumnMapping;
    return this;
  }

   /**
   * Get requiredAddressColumnMapping
   * @return requiredAddressColumnMapping
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public RequiredAddressColumnMapping getRequiredAddressColumnMapping() {
    return requiredAddressColumnMapping;
  }


  public void setRequiredAddressColumnMapping(RequiredAddressColumnMapping requiredAddressColumnMapping) {
    
    
    
    this.requiredAddressColumnMapping = requiredAddressColumnMapping;
  }


  public Upload optionalAddressColumnMapping(OptionalAddressColumnMapping optionalAddressColumnMapping) {
    
    
    
    
    this.optionalAddressColumnMapping = optionalAddressColumnMapping;
    return this;
  }

   /**
   * Get optionalAddressColumnMapping
   * @return optionalAddressColumnMapping
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OptionalAddressColumnMapping getOptionalAddressColumnMapping() {
    return optionalAddressColumnMapping;
  }


  public void setOptionalAddressColumnMapping(OptionalAddressColumnMapping optionalAddressColumnMapping) {
    
    
    
    this.optionalAddressColumnMapping = optionalAddressColumnMapping;
  }


  public Upload metadata(UploadsMetadata metadata) {
    
    
    
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UploadsMetadata getMetadata() {
    return metadata;
  }


  public void setMetadata(UploadsMetadata metadata) {
    
    
    
    this.metadata = metadata;
  }


  public Upload mergeVariableColumnMapping(String mergeVariableColumnMapping) {
    
    
    
    
    this.mergeVariableColumnMapping = mergeVariableColumnMapping;
    return this;
  }

   /**
   * The mapping of column headers in your file to the merge variables present in your creative. See our &lt;a href&#x3D;\&quot;https://help.lob.com/print-and-mail/building-a-mail-strategy/campaign-or-triggered-sends/campaign-audience-guide#step-3-map-merge-variable-data-if-applicable-7\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Campaign Audience Guide&lt;/a&gt; for additional details. &lt;br /&gt;If a merge variable has the same \&quot;name\&quot; as a \&quot;key\&quot; in the &#x60;requiredAddressColumnMapping&#x60; or &#x60;optionalAddressColumnMapping&#x60; objects, then they **CANNOT** have a different value in this object. If a different value is provided, then when the campaign is processing it will get overwritten with the mapped value present in the &#x60;requiredAddressColumnMapping&#x60; or &#x60;optionalAddressColumnMapping&#x60; objects. If using customized QR code redirect from the Audience file, then a &#x60;qr_code_redirect_url&#x60; must be mapped to the column header as used in the CSV.
   * @return mergeVariableColumnMapping
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"name\":\"recipient_name\",\"gift_code\":\"code\"}", required = true, value = "The mapping of column headers in your file to the merge variables present in your creative. See our <a href=\"https://help.lob.com/print-and-mail/building-a-mail-strategy/campaign-or-triggered-sends/campaign-audience-guide#step-3-map-merge-variable-data-if-applicable-7\" target=\"_blank\">Campaign Audience Guide</a> for additional details. <br />If a merge variable has the same \"name\" as a \"key\" in the `requiredAddressColumnMapping` or `optionalAddressColumnMapping` objects, then they **CANNOT** have a different value in this object. If a different value is provided, then when the campaign is processing it will get overwritten with the mapped value present in the `requiredAddressColumnMapping` or `optionalAddressColumnMapping` objects. If using customized QR code redirect from the Audience file, then a `qr_code_redirect_url` must be mapped to the column header as used in the CSV.")

  public String getMergeVariableColumnMapping() {
    return mergeVariableColumnMapping;
  }


  public void setMergeVariableColumnMapping(String mergeVariableColumnMapping) {
    
    
    
    this.mergeVariableColumnMapping = mergeVariableColumnMapping;
  }


  public Upload id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier prefixed with &#x60;upl_&#x60;.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unique identifier prefixed with `upl_`.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public Upload accountId(String accountId) {
    
    
    
    
    this.accountId = accountId;
    return this;
  }

   /**
   * Account ID that made the request
   * @return accountId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "fa9ea650fc7b31a89f92", required = true, value = "Account ID that made the request")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    
    
    
    this.accountId = accountId;
  }


  public Upload mode(ModeEnum mode) {
    
    
    
    
    this.mode = mode;
    return this;
  }

   /**
   * The environment in which the mailpieces were created. Today, will only be &#x60;live&#x60;.
   * @return mode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The environment in which the mailpieces were created. Today, will only be `live`.")

  public ModeEnum getMode() {
    return mode;
  }


  public void setMode(ModeEnum mode) {
    
    
    
    this.mode = mode;
  }


  public Upload failuresUrl(String failuresUrl) {
    
    
    
    
    this.failuresUrl = failuresUrl;
    return this;
  }

   /**
   * Url where your campaign mailpiece failures can be retrieved
   * @return failuresUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://www.example.com", value = "Url where your campaign mailpiece failures can be retrieved")

  public String getFailuresUrl() {
    return failuresUrl;
  }


  public void setFailuresUrl(String failuresUrl) {
    
    
    
    this.failuresUrl = failuresUrl;
  }


  public Upload originalFilename(String originalFilename) {
    
    
    
    
    this.originalFilename = originalFilename;
    return this;
  }

   /**
   * Filename of the upload
   * @return originalFilename
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "my_audience.csv", value = "Filename of the upload")

  public String getOriginalFilename() {
    return originalFilename;
  }


  public void setOriginalFilename(String originalFilename) {
    
    
    
    this.originalFilename = originalFilename;
  }


  public Upload state(UploadState state) {
    
    
    
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UploadState getState() {
    return state;
  }


  public void setState(UploadState state) {
    
    
    
    this.state = state;
  }


  public Upload totalMailpieces(Integer totalMailpieces) {
    
    
    
    
    this.totalMailpieces = totalMailpieces;
    return this;
  }

   /**
   * Total number of recipients for the campaign
   * @return totalMailpieces
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "100", required = true, value = "Total number of recipients for the campaign")

  public Integer getTotalMailpieces() {
    return totalMailpieces;
  }


  public void setTotalMailpieces(Integer totalMailpieces) {
    
    
    
    this.totalMailpieces = totalMailpieces;
  }


  public Upload failedMailpieces(Integer failedMailpieces) {
    
    
    
    
    this.failedMailpieces = failedMailpieces;
    return this;
  }

   /**
   * Number of mailpieces that failed to create
   * @return failedMailpieces
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "5", required = true, value = "Number of mailpieces that failed to create")

  public Integer getFailedMailpieces() {
    return failedMailpieces;
  }


  public void setFailedMailpieces(Integer failedMailpieces) {
    
    
    
    this.failedMailpieces = failedMailpieces;
  }


  public Upload validatedMailpieces(Integer validatedMailpieces) {
    
    
    
    
    this.validatedMailpieces = validatedMailpieces;
    return this;
  }

   /**
   * Number of mailpieces that were successfully created
   * @return validatedMailpieces
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "95", required = true, value = "Number of mailpieces that were successfully created")

  public Integer getValidatedMailpieces() {
    return validatedMailpieces;
  }


  public void setValidatedMailpieces(Integer validatedMailpieces) {
    
    
    
    this.validatedMailpieces = validatedMailpieces;
  }


  public Upload bytesProcessed(Integer bytesProcessed) {
    
    
    
    
    this.bytesProcessed = bytesProcessed;
    return this;
  }

   /**
   * Number of bytes processed in your CSV
   * @return bytesProcessed
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "17268", required = true, value = "Number of bytes processed in your CSV")

  public Integer getBytesProcessed() {
    return bytesProcessed;
  }


  public void setBytesProcessed(Integer bytesProcessed) {
    
    
    
    this.bytesProcessed = bytesProcessed;
  }


  public Upload dateCreated(OffsetDateTime dateCreated) {
    
    
    
    
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * A timestamp in ISO 8601 format of the date the upload was created
   * @return dateCreated
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A timestamp in ISO 8601 format of the date the upload was created")

  public OffsetDateTime getDateCreated() {
    return dateCreated;
  }


  public void setDateCreated(OffsetDateTime dateCreated) {
    
    
    
    this.dateCreated = dateCreated;
  }


  public Upload dateModified(OffsetDateTime dateModified) {
    
    
    
    
    this.dateModified = dateModified;
    return this;
  }

   /**
   * A timestamp in ISO 8601 format of the date the upload was last modified
   * @return dateModified
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A timestamp in ISO 8601 format of the date the upload was last modified")

  public OffsetDateTime getDateModified() {
    return dateModified;
  }


  public void setDateModified(OffsetDateTime dateModified) {
    
    
    
    this.dateModified = dateModified;
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
   * @return the Upload instance itself
   */
  public Upload putAdditionalProperty(String key, Object value) {
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
    Upload upload = (Upload) o;
    return Objects.equals(this.campaignId, upload.campaignId) &&
        Objects.equals(this.requiredAddressColumnMapping, upload.requiredAddressColumnMapping) &&
        Objects.equals(this.optionalAddressColumnMapping, upload.optionalAddressColumnMapping) &&
        Objects.equals(this.metadata, upload.metadata) &&
        Objects.equals(this.mergeVariableColumnMapping, upload.mergeVariableColumnMapping) &&
        Objects.equals(this.id, upload.id) &&
        Objects.equals(this.accountId, upload.accountId) &&
        Objects.equals(this.mode, upload.mode) &&
        Objects.equals(this.failuresUrl, upload.failuresUrl) &&
        Objects.equals(this.originalFilename, upload.originalFilename) &&
        Objects.equals(this.state, upload.state) &&
        Objects.equals(this.totalMailpieces, upload.totalMailpieces) &&
        Objects.equals(this.failedMailpieces, upload.failedMailpieces) &&
        Objects.equals(this.validatedMailpieces, upload.validatedMailpieces) &&
        Objects.equals(this.bytesProcessed, upload.bytesProcessed) &&
        Objects.equals(this.dateCreated, upload.dateCreated) &&
        Objects.equals(this.dateModified, upload.dateModified)&&
        Objects.equals(this.additionalProperties, upload.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignId, requiredAddressColumnMapping, optionalAddressColumnMapping, metadata, mergeVariableColumnMapping, id, accountId, mode, failuresUrl, originalFilename, state, totalMailpieces, failedMailpieces, validatedMailpieces, bytesProcessed, dateCreated, dateModified, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Upload {\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    requiredAddressColumnMapping: ").append(toIndentedString(requiredAddressColumnMapping)).append("\n");
    sb.append("    optionalAddressColumnMapping: ").append(toIndentedString(optionalAddressColumnMapping)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    mergeVariableColumnMapping: ").append(toIndentedString(mergeVariableColumnMapping)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    failuresUrl: ").append(toIndentedString(failuresUrl)).append("\n");
    sb.append("    originalFilename: ").append(toIndentedString(originalFilename)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    totalMailpieces: ").append(toIndentedString(totalMailpieces)).append("\n");
    sb.append("    failedMailpieces: ").append(toIndentedString(failedMailpieces)).append("\n");
    sb.append("    validatedMailpieces: ").append(toIndentedString(validatedMailpieces)).append("\n");
    sb.append("    bytesProcessed: ").append(toIndentedString(bytesProcessed)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
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
    openapiFields.add("campaignId");
    openapiFields.add("requiredAddressColumnMapping");
    openapiFields.add("optionalAddressColumnMapping");
    openapiFields.add("metadata");
    openapiFields.add("mergeVariableColumnMapping");
    openapiFields.add("id");
    openapiFields.add("accountId");
    openapiFields.add("mode");
    openapiFields.add("failuresUrl");
    openapiFields.add("originalFilename");
    openapiFields.add("state");
    openapiFields.add("totalMailpieces");
    openapiFields.add("failedMailpieces");
    openapiFields.add("validatedMailpieces");
    openapiFields.add("bytesProcessed");
    openapiFields.add("dateCreated");
    openapiFields.add("dateModified");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("campaignId");
    openapiRequiredFields.add("requiredAddressColumnMapping");
    openapiRequiredFields.add("optionalAddressColumnMapping");
    openapiRequiredFields.add("metadata");
    openapiRequiredFields.add("mergeVariableColumnMapping");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("accountId");
    openapiRequiredFields.add("mode");
    openapiRequiredFields.add("state");
    openapiRequiredFields.add("totalMailpieces");
    openapiRequiredFields.add("failedMailpieces");
    openapiRequiredFields.add("validatedMailpieces");
    openapiRequiredFields.add("bytesProcessed");
    openapiRequiredFields.add("dateCreated");
    openapiRequiredFields.add("dateModified");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Upload
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Upload.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Upload is not found in the empty JSON string", Upload.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Upload.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `campaignId`
      String.validateJsonObject(jsonObj.getAsJsonObject("campaignId"));
      // validate the required field `requiredAddressColumnMapping`
      RequiredAddressColumnMapping.validateJsonObject(jsonObj.getAsJsonObject("requiredAddressColumnMapping"));
      // validate the required field `optionalAddressColumnMapping`
      OptionalAddressColumnMapping.validateJsonObject(jsonObj.getAsJsonObject("optionalAddressColumnMapping"));
      // validate the required field `metadata`
      UploadsMetadata.validateJsonObject(jsonObj.getAsJsonObject("metadata"));
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("accountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountId").toString()));
      }
      if (!jsonObj.get("mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mode").toString()));
      }
      if ((jsonObj.get("failuresUrl") != null && !jsonObj.get("failuresUrl").isJsonNull()) && !jsonObj.get("failuresUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `failuresUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("failuresUrl").toString()));
      }
      if ((jsonObj.get("originalFilename") != null && !jsonObj.get("originalFilename").isJsonNull()) && !jsonObj.get("originalFilename").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `originalFilename` to be a primitive type in the JSON string but got `%s`", jsonObj.get("originalFilename").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Upload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Upload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Upload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Upload.class));

       return (TypeAdapter<T>) new TypeAdapter<Upload>() {
           @Override
           public void write(JsonWriter out, Upload value) throws IOException {
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
           public Upload read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Upload instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Upload given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Upload
  * @throws IOException if the JSON string is invalid with respect to Upload
  */
  public static Upload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Upload.class);
  }

 /**
  * Convert an instance of Upload to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The &#x60;state&#x60; property on the &#x60;upload&#x60; object. As the file is processed, the &#x60;state&#x60; will change from &#x60;Ready for Validation&#x60; to &#x60;Validating&#x60; and then will be either &#x60;Scheduled&#x60; (successfully processed) or &#x60;Errored&#x60; (Unsuccessfully processed).
 */
@JsonAdapter(UploadState.Adapter.class)public enum UploadState {
  
  PREPROCESSING("Preprocessing"),
  
  DRAFT("Draft"),
  
  READY_FOR_VALIDATION("Ready for Validation"),
  
  VALIDATING("Validating"),
  
  SCHEDULED("Scheduled"),
  
  CANCELLED("Cancelled"),
  
  ERRORED("Errored");

  private String value;

  UploadState(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static UploadState fromValue(String value) {
    for (UploadState b : UploadState.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<UploadState> {
    @Override
    public void write(final JsonWriter jsonWriter, final UploadState enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public UploadState read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return UploadState.fromValue(value);
    }
  }
}


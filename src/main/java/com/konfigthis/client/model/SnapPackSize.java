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
 * Specifies the size of the snap pack.
 */
@JsonAdapter(SnapPackSize.Adapter.class)public enum SnapPackSize {
  
  _8_5X11("8.5x11");

  private String value;

  SnapPackSize(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SnapPackSize fromValue(String value) {
    for (SnapPackSize b : SnapPackSize.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<SnapPackSize> {
    @Override
    public void write(final JsonWriter jsonWriter, final SnapPackSize enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SnapPackSize read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SnapPackSize.fromValue(value);
    }
  }
}


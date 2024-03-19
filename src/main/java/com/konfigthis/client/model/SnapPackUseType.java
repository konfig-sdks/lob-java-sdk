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
 * The use type for each mailpiece. Can be one of marketing, operational, or null. Null use_type is only allowed if an account default use_type is selected in Account Settings. For more information on use_type, see our  [Help Center article](https://help.lob.com/print-and-mail/building-a-mail-strategy/managing-mail-settings/declaring-mail-use-type).
 */
@JsonAdapter(SnapPackUseType.Adapter.class)public enum SnapPackUseType {
  
  MARKETING("marketing"),
  
  OPERATIONAL("operational"),
  
  NULL("null");

  private String value;

  SnapPackUseType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SnapPackUseType fromValue(String value) {
    for (SnapPackUseType b : SnapPackUseType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<SnapPackUseType> {
    @Override
    public void write(final JsonWriter jsonWriter, final SnapPackUseType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SnapPackUseType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SnapPackUseType.fromValue(value);
    }
  }
}


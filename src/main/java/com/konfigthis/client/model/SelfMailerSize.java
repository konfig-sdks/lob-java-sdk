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
 * Specifies the size of the self mailer. The &#x60;17.75x9_trifold&#x60; size is in beta. Contact support@lob.com or your account contact to learn more.
 */
@JsonAdapter(SelfMailerSize.Adapter.class)public enum SelfMailerSize {
  
  _6X18_BIFOLD("6x18_bifold"),
  
  _11X9_BIFOLD("11x9_bifold"),
  
  _12X9_BIFOLD("12x9_bifold"),
  
  _17_75X9_TRIFOLD("17.75x9_trifold");

  private String value;

  SelfMailerSize(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SelfMailerSize fromValue(String value) {
    for (SelfMailerSize b : SelfMailerSize.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<SelfMailerSize> {
    @Override
    public void write(final JsonWriter jsonWriter, final SelfMailerSize enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SelfMailerSize read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SelfMailerSize.fromValue(value);
    }
  }
}


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
 * Specifies the location of the address information that will show through the double-window envelope. To see how this will impact your letter design, view our letter template. Some values are exclusive to certain customers. Upgrade to the appropriate &lt;a href&#x3D;\&quot;https://dashboard.lob.com/#/settings/editions\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Print &amp; Mail Edition&lt;/a&gt; to gain access.   * &#x60;top_first_page&#x60; - (default) print address information at the top of your provided first page   * &#x60;insert_blank_page&#x60; - insert a blank address page at the beginning of your file (you will be charged for the extra page)   * &#x60;bottom_first_page_center&#x60; - **(exclusive, deprecation planned within a few months)** print address information at the bottom center of your provided first page   * &#x60;bottom_first_page&#x60; - **(exclusive)** print address information at the bottom of your provided first page 
 */
@JsonAdapter(AddressPlacement.Adapter.class)public enum AddressPlacement {
  
  TOP_FIRST_PAGE("top_first_page"),
  
  INSERT_BLANK_PAGE("insert_blank_page"),
  
  BOTTOM_FIRST_PAGE_CENTER("bottom_first_page_center"),
  
  BOTTOM_FIRST_PAGE("bottom_first_page");

  private String value;

  AddressPlacement(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AddressPlacement fromValue(String value) {
    for (AddressPlacement b : AddressPlacement.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AddressPlacement> {
    @Override
    public void write(final JsonWriter jsonWriter, final AddressPlacement enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AddressPlacement read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AddressPlacement.fromValue(value);
    }
  }
}


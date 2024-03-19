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
 * Unique identifier referring to status of letter
 */
@JsonAdapter(LetterTypes.Adapter.class)public enum LetterTypes {
  
  CREATED("letter.created"),
  
  RENDERED_PDF("letter.rendered_pdf"),
  
  RENDERED_THUMBNAILS("letter.rendered_thumbnails"),
  
  DELETED("letter.deleted"),
  
  DELIVERED("letter.delivered"),
  
  FAILED("letter.failed"),
  
  MAILED("letter.mailed"),
  
  IN_TRANSIT("letter.in_transit"),
  
  IN_LOCAL_AREA("letter.in_local_area"),
  
  INTERNATIONAL_EXIT("letter.international_exit"),
  
  PROCESSED_FOR_DELIVERY("letter.processed_for_delivery"),
  
  RE_ROUTED("letter.re-routed"),
  
  RETURNED_TO_SENDER("letter.returned_to_sender"),
  
  CERTIFIED_MAILED("letter.certified.mailed"),
  
  CERTIFIED_IN_TRANSIT("letter.certified.in_transit"),
  
  CERTIFIED_IN_LOCAL_AREA("letter.certified.in_local_area"),
  
  CERTIFIED_PROCESSED_FOR_DELIVERY("letter.certified.processed_for_delivery"),
  
  CERTIFIED_RE_ROUTED("letter.certified.re-routed"),
  
  CERTIFIED_RETURNED_TO_SENDER("letter.certified.returned_to_sender"),
  
  CERTIFIED_DELIVERED("letter.certified.delivered"),
  
  CERTIFIED_PICKUP_AVAILABLE("letter.certified.pickup_available"),
  
  CERTIFIED_ISSUE("letter.certified.issue"),
  
  RETURN_ENVELOPE_CREATED("letter.return_envelope.created"),
  
  RETURN_ENVELOPE_DELIVERED("letter.return_envelope.delivered"),
  
  RETURN_ENVELOPE_IN_TRANSIT("letter.return_envelope.in_transit"),
  
  RETURN_ENVELOPE_IN_LOCAL_AREA("letter.return_envelope.in_local_area"),
  
  RETURN_ENVELOPE_INTERNATIONAL_EXIT("letter.return_envelope.international_exit"),
  
  RETURN_ENVELOPE_PROCESSED_FOR_DELIVERY("letter.return_envelope.processed_for_delivery"),
  
  RETURN_ENVELOPE_RE_ROUTED("letter.return_envelope.re_routed"),
  
  RETURN_ENVELOPE_RETURNED_TO_SENDER("letter.return_envelope.returned_to_sender"),
  
  VIEWED("letter.viewed");

  private String value;

  LetterTypes(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LetterTypes fromValue(String value) {
    for (LetterTypes b : LetterTypes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<LetterTypes> {
    @Override
    public void write(final JsonWriter jsonWriter, final LetterTypes enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LetterTypes read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LetterTypes.fromValue(value);
    }
  }
}


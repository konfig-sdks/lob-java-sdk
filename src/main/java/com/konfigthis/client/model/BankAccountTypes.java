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
 * Unique identifier referring to status of bank account
 */
@JsonAdapter(BankAccountTypes.Adapter.class)public enum BankAccountTypes {
  
  CREATED("bank_account.created"),
  
  DELETED("bank_account.deleted"),
  
  VERIFIED("bank_account.verified");

  private String value;

  BankAccountTypes(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BankAccountTypes fromValue(String value) {
    for (BankAccountTypes b : BankAccountTypes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<BankAccountTypes> {
    @Override
    public void write(final JsonWriter jsonWriter, final BankAccountTypes enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BankAccountTypes read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BankAccountTypes.fromValue(value);
    }
  }
}


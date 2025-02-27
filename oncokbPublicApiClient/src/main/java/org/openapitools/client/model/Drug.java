/*
 * OncoKB APIs
 * OncoKB, a comprehensive and curated precision oncology knowledge base, offers oncologists detailed, evidence-based information about individual somatic mutations and structural alterations present in patient tumors with the goal of supporting optimal treatment decisions.
 *
 * The version of the OpenAPI document: v1.5.0
 * Contact: contact@oncokb.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

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
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * Drug
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:00:42.192711-05:00[America/New_York]", comments = "Generator version: 7.11.0")
public class Drug {
  public static final String SERIALIZED_NAME_DRUG_NAME = "drugName";
  @SerializedName(SERIALIZED_NAME_DRUG_NAME)
  @javax.annotation.Nullable
  private String drugName;

  public static final String SERIALIZED_NAME_NCIT_CODE = "ncitCode";
  @SerializedName(SERIALIZED_NAME_NCIT_CODE)
  @javax.annotation.Nullable
  private String ncitCode;

  public Drug() {
  }

  public Drug drugName(@javax.annotation.Nullable String drugName) {
    this.drugName = drugName;
    return this;
  }

  /**
   * Get drugName
   * @return drugName
   */
  @javax.annotation.Nullable
  public String getDrugName() {
    return drugName;
  }

  public void setDrugName(@javax.annotation.Nullable String drugName) {
    this.drugName = drugName;
  }


  public Drug ncitCode(@javax.annotation.Nullable String ncitCode) {
    this.ncitCode = ncitCode;
    return this;
  }

  /**
   * Get ncitCode
   * @return ncitCode
   */
  @javax.annotation.Nullable
  public String getNcitCode() {
    return ncitCode;
  }

  public void setNcitCode(@javax.annotation.Nullable String ncitCode) {
    this.ncitCode = ncitCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Drug drug = (Drug) o;
    return Objects.equals(this.drugName, drug.drugName) &&
        Objects.equals(this.ncitCode, drug.ncitCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(drugName, ncitCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Drug {\n");
    sb.append("    drugName: ").append(toIndentedString(drugName)).append("\n");
    sb.append("    ncitCode: ").append(toIndentedString(ncitCode)).append("\n");
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
    openapiFields.add("drugName");
    openapiFields.add("ncitCode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Drug
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Drug.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Drug is not found in the empty JSON string", Drug.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Drug.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Drug` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("drugName") != null && !jsonObj.get("drugName").isJsonNull()) && !jsonObj.get("drugName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `drugName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("drugName").toString()));
      }
      if ((jsonObj.get("ncitCode") != null && !jsonObj.get("ncitCode").isJsonNull()) && !jsonObj.get("ncitCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ncitCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ncitCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Drug.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Drug' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Drug> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Drug.class));

       return (TypeAdapter<T>) new TypeAdapter<Drug>() {
           @Override
           public void write(JsonWriter out, Drug value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Drug read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Drug given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Drug
   * @throws IOException if the JSON string is invalid with respect to Drug
   */
  public static Drug fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Drug.class);
  }

  /**
   * Convert an instance of Drug to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


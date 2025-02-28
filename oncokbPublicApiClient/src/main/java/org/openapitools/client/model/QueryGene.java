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
 * QueryGene
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:13:52.565252-05:00[America/New_York]", comments = "Generator version: 7.11.0")
public class QueryGene {
  public static final String SERIALIZED_NAME_ENTREZ_GENE_ID = "entrezGeneId";
  @SerializedName(SERIALIZED_NAME_ENTREZ_GENE_ID)
  @javax.annotation.Nullable
  private Integer entrezGeneId;

  public static final String SERIALIZED_NAME_HUGO_SYMBOL = "hugoSymbol";
  @SerializedName(SERIALIZED_NAME_HUGO_SYMBOL)
  @javax.annotation.Nullable
  private String hugoSymbol;

  public QueryGene() {
  }

  public QueryGene entrezGeneId(@javax.annotation.Nullable Integer entrezGeneId) {
    this.entrezGeneId = entrezGeneId;
    return this;
  }

  /**
   * Get entrezGeneId
   * @return entrezGeneId
   */
  @javax.annotation.Nullable
  public Integer getEntrezGeneId() {
    return entrezGeneId;
  }

  public void setEntrezGeneId(@javax.annotation.Nullable Integer entrezGeneId) {
    this.entrezGeneId = entrezGeneId;
  }


  public QueryGene hugoSymbol(@javax.annotation.Nullable String hugoSymbol) {
    this.hugoSymbol = hugoSymbol;
    return this;
  }

  /**
   * Get hugoSymbol
   * @return hugoSymbol
   */
  @javax.annotation.Nullable
  public String getHugoSymbol() {
    return hugoSymbol;
  }

  public void setHugoSymbol(@javax.annotation.Nullable String hugoSymbol) {
    this.hugoSymbol = hugoSymbol;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryGene queryGene = (QueryGene) o;
    return Objects.equals(this.entrezGeneId, queryGene.entrezGeneId) &&
        Objects.equals(this.hugoSymbol, queryGene.hugoSymbol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entrezGeneId, hugoSymbol);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryGene {\n");
    sb.append("    entrezGeneId: ").append(toIndentedString(entrezGeneId)).append("\n");
    sb.append("    hugoSymbol: ").append(toIndentedString(hugoSymbol)).append("\n");
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
    openapiFields.add("entrezGeneId");
    openapiFields.add("hugoSymbol");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to QueryGene
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!QueryGene.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in QueryGene is not found in the empty JSON string", QueryGene.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!QueryGene.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QueryGene` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("hugoSymbol") != null && !jsonObj.get("hugoSymbol").isJsonNull()) && !jsonObj.get("hugoSymbol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hugoSymbol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hugoSymbol").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QueryGene.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QueryGene' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QueryGene> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QueryGene.class));

       return (TypeAdapter<T>) new TypeAdapter<QueryGene>() {
           @Override
           public void write(JsonWriter out, QueryGene value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QueryGene read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of QueryGene given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of QueryGene
   * @throws IOException if the JSON string is invalid with respect to QueryGene
   */
  public static QueryGene fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QueryGene.class);
  }

  /**
   * Convert an instance of QueryGene to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * AnnotateMutationByGenomicChangeQuery
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-27T16:00:42.192711-05:00[America/New_York]", comments = "Generator version: 7.11.0")
public class AnnotateMutationByGenomicChangeQuery {
  /**
   * Gets or Sets evidenceTypes
   */
  @JsonAdapter(EvidenceTypesEnum.Adapter.class)
  public enum EvidenceTypesEnum {
    GENE_SUMMARY("GENE_SUMMARY"),
    
    MUTATION_SUMMARY("MUTATION_SUMMARY"),
    
    TUMOR_TYPE_SUMMARY("TUMOR_TYPE_SUMMARY"),
    
    GENE_TUMOR_TYPE_SUMMARY("GENE_TUMOR_TYPE_SUMMARY"),
    
    PROGNOSTIC_SUMMARY("PROGNOSTIC_SUMMARY"),
    
    DIAGNOSTIC_SUMMARY("DIAGNOSTIC_SUMMARY"),
    
    GENE_BACKGROUND("GENE_BACKGROUND"),
    
    ONCOGENIC("ONCOGENIC"),
    
    MUTATION_EFFECT("MUTATION_EFFECT"),
    
    VUS("VUS"),
    
    PROGNOSTIC_IMPLICATION("PROGNOSTIC_IMPLICATION"),
    
    DIAGNOSTIC_IMPLICATION("DIAGNOSTIC_IMPLICATION"),
    
    STANDARD_THERAPEUTIC_IMPLICATIONS_FOR_DRUG_SENSITIVITY("STANDARD_THERAPEUTIC_IMPLICATIONS_FOR_DRUG_SENSITIVITY"),
    
    STANDARD_THERAPEUTIC_IMPLICATIONS_FOR_DRUG_RESISTANCE("STANDARD_THERAPEUTIC_IMPLICATIONS_FOR_DRUG_RESISTANCE"),
    
    INVESTIGATIONAL_THERAPEUTIC_IMPLICATIONS_DRUG_SENSITIVITY("INVESTIGATIONAL_THERAPEUTIC_IMPLICATIONS_DRUG_SENSITIVITY"),
    
    INVESTIGATIONAL_THERAPEUTIC_IMPLICATIONS_DRUG_RESISTANCE("INVESTIGATIONAL_THERAPEUTIC_IMPLICATIONS_DRUG_RESISTANCE");

    private String value;

    EvidenceTypesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EvidenceTypesEnum fromValue(String value) {
      for (EvidenceTypesEnum b : EvidenceTypesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EvidenceTypesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EvidenceTypesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EvidenceTypesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EvidenceTypesEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      EvidenceTypesEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_EVIDENCE_TYPES = "evidenceTypes";
  @SerializedName(SERIALIZED_NAME_EVIDENCE_TYPES)
  @javax.annotation.Nullable
  private List<EvidenceTypesEnum> evidenceTypes = new ArrayList<>();

  public static final String SERIALIZED_NAME_GENOMIC_LOCATION = "genomicLocation";
  @SerializedName(SERIALIZED_NAME_GENOMIC_LOCATION)
  @javax.annotation.Nullable
  private String genomicLocation;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private String id;

  /**
   * Gets or Sets referenceGenome
   */
  @JsonAdapter(ReferenceGenomeEnum.Adapter.class)
  public enum ReferenceGenomeEnum {
    GRCH37("GRCh37"),
    
    GRCH38("GRCh38");

    private String value;

    ReferenceGenomeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ReferenceGenomeEnum fromValue(String value) {
      for (ReferenceGenomeEnum b : ReferenceGenomeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ReferenceGenomeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReferenceGenomeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReferenceGenomeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ReferenceGenomeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ReferenceGenomeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_REFERENCE_GENOME = "referenceGenome";
  @SerializedName(SERIALIZED_NAME_REFERENCE_GENOME)
  @javax.annotation.Nullable
  private ReferenceGenomeEnum referenceGenome;

  public static final String SERIALIZED_NAME_TUMOR_TYPE = "tumorType";
  @SerializedName(SERIALIZED_NAME_TUMOR_TYPE)
  @javax.annotation.Nullable
  private String tumorType;

  public AnnotateMutationByGenomicChangeQuery() {
  }

  public AnnotateMutationByGenomicChangeQuery evidenceTypes(@javax.annotation.Nullable List<EvidenceTypesEnum> evidenceTypes) {
    this.evidenceTypes = evidenceTypes;
    return this;
  }

  public AnnotateMutationByGenomicChangeQuery addEvidenceTypesItem(EvidenceTypesEnum evidenceTypesItem) {
    if (this.evidenceTypes == null) {
      this.evidenceTypes = new ArrayList<>();
    }
    this.evidenceTypes.add(evidenceTypesItem);
    return this;
  }

  /**
   * Get evidenceTypes
   * @return evidenceTypes
   */
  @javax.annotation.Nullable
  public List<EvidenceTypesEnum> getEvidenceTypes() {
    return evidenceTypes;
  }

  public void setEvidenceTypes(@javax.annotation.Nullable List<EvidenceTypesEnum> evidenceTypes) {
    this.evidenceTypes = evidenceTypes;
  }


  public AnnotateMutationByGenomicChangeQuery genomicLocation(@javax.annotation.Nullable String genomicLocation) {
    this.genomicLocation = genomicLocation;
    return this;
  }

  /**
   * Get genomicLocation
   * @return genomicLocation
   */
  @javax.annotation.Nullable
  public String getGenomicLocation() {
    return genomicLocation;
  }

  public void setGenomicLocation(@javax.annotation.Nullable String genomicLocation) {
    this.genomicLocation = genomicLocation;
  }


  public AnnotateMutationByGenomicChangeQuery id(@javax.annotation.Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }


  public AnnotateMutationByGenomicChangeQuery referenceGenome(@javax.annotation.Nullable ReferenceGenomeEnum referenceGenome) {
    this.referenceGenome = referenceGenome;
    return this;
  }

  /**
   * Get referenceGenome
   * @return referenceGenome
   */
  @javax.annotation.Nullable
  public ReferenceGenomeEnum getReferenceGenome() {
    return referenceGenome;
  }

  public void setReferenceGenome(@javax.annotation.Nullable ReferenceGenomeEnum referenceGenome) {
    this.referenceGenome = referenceGenome;
  }


  public AnnotateMutationByGenomicChangeQuery tumorType(@javax.annotation.Nullable String tumorType) {
    this.tumorType = tumorType;
    return this;
  }

  /**
   * Get tumorType
   * @return tumorType
   */
  @javax.annotation.Nullable
  public String getTumorType() {
    return tumorType;
  }

  public void setTumorType(@javax.annotation.Nullable String tumorType) {
    this.tumorType = tumorType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnnotateMutationByGenomicChangeQuery annotateMutationByGenomicChangeQuery = (AnnotateMutationByGenomicChangeQuery) o;
    return Objects.equals(this.evidenceTypes, annotateMutationByGenomicChangeQuery.evidenceTypes) &&
        Objects.equals(this.genomicLocation, annotateMutationByGenomicChangeQuery.genomicLocation) &&
        Objects.equals(this.id, annotateMutationByGenomicChangeQuery.id) &&
        Objects.equals(this.referenceGenome, annotateMutationByGenomicChangeQuery.referenceGenome) &&
        Objects.equals(this.tumorType, annotateMutationByGenomicChangeQuery.tumorType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evidenceTypes, genomicLocation, id, referenceGenome, tumorType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnnotateMutationByGenomicChangeQuery {\n");
    sb.append("    evidenceTypes: ").append(toIndentedString(evidenceTypes)).append("\n");
    sb.append("    genomicLocation: ").append(toIndentedString(genomicLocation)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    referenceGenome: ").append(toIndentedString(referenceGenome)).append("\n");
    sb.append("    tumorType: ").append(toIndentedString(tumorType)).append("\n");
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
    openapiFields.add("evidenceTypes");
    openapiFields.add("genomicLocation");
    openapiFields.add("id");
    openapiFields.add("referenceGenome");
    openapiFields.add("tumorType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AnnotateMutationByGenomicChangeQuery
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AnnotateMutationByGenomicChangeQuery.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AnnotateMutationByGenomicChangeQuery is not found in the empty JSON string", AnnotateMutationByGenomicChangeQuery.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AnnotateMutationByGenomicChangeQuery.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AnnotateMutationByGenomicChangeQuery` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("evidenceTypes") != null && !jsonObj.get("evidenceTypes").isJsonNull() && !jsonObj.get("evidenceTypes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `evidenceTypes` to be an array in the JSON string but got `%s`", jsonObj.get("evidenceTypes").toString()));
      }
      if ((jsonObj.get("genomicLocation") != null && !jsonObj.get("genomicLocation").isJsonNull()) && !jsonObj.get("genomicLocation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `genomicLocation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("genomicLocation").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("referenceGenome") != null && !jsonObj.get("referenceGenome").isJsonNull()) && !jsonObj.get("referenceGenome").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `referenceGenome` to be a primitive type in the JSON string but got `%s`", jsonObj.get("referenceGenome").toString()));
      }
      // validate the optional field `referenceGenome`
      if (jsonObj.get("referenceGenome") != null && !jsonObj.get("referenceGenome").isJsonNull()) {
        ReferenceGenomeEnum.validateJsonElement(jsonObj.get("referenceGenome"));
      }
      if ((jsonObj.get("tumorType") != null && !jsonObj.get("tumorType").isJsonNull()) && !jsonObj.get("tumorType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tumorType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tumorType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AnnotateMutationByGenomicChangeQuery.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AnnotateMutationByGenomicChangeQuery' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AnnotateMutationByGenomicChangeQuery> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AnnotateMutationByGenomicChangeQuery.class));

       return (TypeAdapter<T>) new TypeAdapter<AnnotateMutationByGenomicChangeQuery>() {
           @Override
           public void write(JsonWriter out, AnnotateMutationByGenomicChangeQuery value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AnnotateMutationByGenomicChangeQuery read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AnnotateMutationByGenomicChangeQuery given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AnnotateMutationByGenomicChangeQuery
   * @throws IOException if the JSON string is invalid with respect to AnnotateMutationByGenomicChangeQuery
   */
  public static AnnotateMutationByGenomicChangeQuery fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AnnotateMutationByGenomicChangeQuery.class);
  }

  /**
   * Convert an instance of AnnotateMutationByGenomicChangeQuery to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


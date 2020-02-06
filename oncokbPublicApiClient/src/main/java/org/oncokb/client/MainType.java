/*
 * OncoKB APIs
 * OncoKB, a comprehensive and curated precision oncology knowledge base, offers oncologists detailed, evidence-based information about individual somatic mutations and structural alterations present in patient tumors with the goal of supporting optimal treatment decisions.
 *
 * OpenAPI spec version: v1.0.0
 * Contact: contact@oncokb.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.oncokb.client;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * OncoTree Cancer Type
 */
@ApiModel(description = "OncoTree Cancer Type")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-06T11:50:02.938-05:00")
public class MainType {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  /**
   * Gets or Sets tumorForm
   */
  @JsonAdapter(TumorFormEnum.Adapter.class)
  public enum TumorFormEnum {
    SOLID("SOLID"),
    
    LIQUID("LIQUID");

    private String value;

    TumorFormEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TumorFormEnum fromValue(String text) {
      for (TumorFormEnum b : TumorFormEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TumorFormEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TumorFormEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TumorFormEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TumorFormEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("tumorForm")
  private TumorFormEnum tumorForm = null;

  public MainType id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public MainType name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MainType tumorForm(TumorFormEnum tumorForm) {
    this.tumorForm = tumorForm;
    return this;
  }

   /**
   * Get tumorForm
   * @return tumorForm
  **/
  @ApiModelProperty(value = "")
  public TumorFormEnum getTumorForm() {
    return tumorForm;
  }

  public void setTumorForm(TumorFormEnum tumorForm) {
    this.tumorForm = tumorForm;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MainType mainType = (MainType) o;
    return Objects.equals(this.id, mainType.id) &&
        Objects.equals(this.name, mainType.name) &&
        Objects.equals(this.tumorForm, mainType.tumorForm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, tumorForm);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MainType {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tumorForm: ").append(toIndentedString(tumorForm)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


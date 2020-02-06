/*
 * OncoKB APIs for Premium Users
 * These endpoints are designed for premium users. Please contact OncoKB team(contact@oncokb.org) if you want to be upgraded.
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.oncokb.client.MainType;
import org.oncokb.client.TumorType;

/**
 * OncoTree Detailed Cancer Type
 */
@ApiModel(description = "OncoTree Detailed Cancer Type")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-06T11:50:04.572-05:00")
public class TumorType {
  @SerializedName("children")
  private Map<String, TumorType> children = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("color")
  private String color = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("level")
  private Integer level = null;

  @SerializedName("mainType")
  private MainType mainType = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("parent")
  private String parent = null;

  @SerializedName("tissue")
  private String tissue = null;

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

  public TumorType children(Map<String, TumorType> children) {
    this.children = children;
    return this;
  }

  public TumorType putChildrenItem(String key, TumorType childrenItem) {
    if (this.children == null) {
      this.children = new HashMap<String, TumorType>();
    }
    this.children.put(key, childrenItem);
    return this;
  }

   /**
   * Get children
   * @return children
  **/
  @ApiModelProperty(value = "")
  public Map<String, TumorType> getChildren() {
    return children;
  }

  public void setChildren(Map<String, TumorType> children) {
    this.children = children;
  }

  public TumorType code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(value = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public TumorType color(String color) {
    this.color = color;
    return this;
  }

   /**
   * Get color
   * @return color
  **/
  @ApiModelProperty(value = "")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public TumorType id(Integer id) {
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

  public TumorType level(Integer level) {
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @ApiModelProperty(value = "")
  public Integer getLevel() {
    return level;
  }

  public void setLevel(Integer level) {
    this.level = level;
  }

  public TumorType mainType(MainType mainType) {
    this.mainType = mainType;
    return this;
  }

   /**
   * Get mainType
   * @return mainType
  **/
  @ApiModelProperty(value = "")
  public MainType getMainType() {
    return mainType;
  }

  public void setMainType(MainType mainType) {
    this.mainType = mainType;
  }

  public TumorType name(String name) {
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

  public TumorType parent(String parent) {
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  @ApiModelProperty(value = "")
  public String getParent() {
    return parent;
  }

  public void setParent(String parent) {
    this.parent = parent;
  }

  public TumorType tissue(String tissue) {
    this.tissue = tissue;
    return this;
  }

   /**
   * Get tissue
   * @return tissue
  **/
  @ApiModelProperty(value = "")
  public String getTissue() {
    return tissue;
  }

  public void setTissue(String tissue) {
    this.tissue = tissue;
  }

  public TumorType tumorForm(TumorFormEnum tumorForm) {
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
    TumorType tumorType = (TumorType) o;
    return Objects.equals(this.children, tumorType.children) &&
        Objects.equals(this.code, tumorType.code) &&
        Objects.equals(this.color, tumorType.color) &&
        Objects.equals(this.id, tumorType.id) &&
        Objects.equals(this.level, tumorType.level) &&
        Objects.equals(this.mainType, tumorType.mainType) &&
        Objects.equals(this.name, tumorType.name) &&
        Objects.equals(this.parent, tumorType.parent) &&
        Objects.equals(this.tissue, tumorType.tissue) &&
        Objects.equals(this.tumorForm, tumorType.tumorForm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(children, code, color, id, level, mainType, name, parent, tissue, tumorForm);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TumorType {\n");
    
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    mainType: ").append(toIndentedString(mainType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    tissue: ").append(toIndentedString(tissue)).append("\n");
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


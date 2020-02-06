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

/**
 * AnnotateMutationByHGVSgQuery
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-06T11:50:04.572-05:00")
public class AnnotateMutationByHGVSgQuery {
  @SerializedName("hgvsg")
  private String hgvsg = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("tumorType")
  private String tumorType = null;

  public AnnotateMutationByHGVSgQuery hgvsg(String hgvsg) {
    this.hgvsg = hgvsg;
    return this;
  }

   /**
   * Get hgvsg
   * @return hgvsg
  **/
  @ApiModelProperty(value = "")
  public String getHgvsg() {
    return hgvsg;
  }

  public void setHgvsg(String hgvsg) {
    this.hgvsg = hgvsg;
  }

  public AnnotateMutationByHGVSgQuery id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AnnotateMutationByHGVSgQuery tumorType(String tumorType) {
    this.tumorType = tumorType;
    return this;
  }

   /**
   * Get tumorType
   * @return tumorType
  **/
  @ApiModelProperty(value = "")
  public String getTumorType() {
    return tumorType;
  }

  public void setTumorType(String tumorType) {
    this.tumorType = tumorType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnnotateMutationByHGVSgQuery annotateMutationByHGVSgQuery = (AnnotateMutationByHGVSgQuery) o;
    return Objects.equals(this.hgvsg, annotateMutationByHGVSgQuery.hgvsg) &&
        Objects.equals(this.id, annotateMutationByHGVSgQuery.id) &&
        Objects.equals(this.tumorType, annotateMutationByHGVSgQuery.tumorType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hgvsg, id, tumorType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnnotateMutationByHGVSgQuery {\n");
    
    sb.append("    hgvsg: ").append(toIndentedString(hgvsg)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tumorType: ").append(toIndentedString(tumorType)).append("\n");
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


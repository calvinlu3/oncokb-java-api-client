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
import java.util.ArrayList;
import java.util.List;
import org.oncokb.client.ArticleAbstract;

/**
 * Citations
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-06T11:50:04.572-05:00")
public class Citations {
  @SerializedName("abstracts")
  private List<ArticleAbstract> abstracts = null;

  @SerializedName("pmids")
  private List<String> pmids = null;

  public Citations abstracts(List<ArticleAbstract> abstracts) {
    this.abstracts = abstracts;
    return this;
  }

  public Citations addAbstractsItem(ArticleAbstract abstractsItem) {
    if (this.abstracts == null) {
      this.abstracts = new ArrayList<ArticleAbstract>();
    }
    this.abstracts.add(abstractsItem);
    return this;
  }

   /**
   * Get abstracts
   * @return abstracts
  **/
  @ApiModelProperty(value = "")
  public List<ArticleAbstract> getAbstracts() {
    return abstracts;
  }

  public void setAbstracts(List<ArticleAbstract> abstracts) {
    this.abstracts = abstracts;
  }

  public Citations pmids(List<String> pmids) {
    this.pmids = pmids;
    return this;
  }

  public Citations addPmidsItem(String pmidsItem) {
    if (this.pmids == null) {
      this.pmids = new ArrayList<String>();
    }
    this.pmids.add(pmidsItem);
    return this;
  }

   /**
   * Get pmids
   * @return pmids
  **/
  @ApiModelProperty(value = "")
  public List<String> getPmids() {
    return pmids;
  }

  public void setPmids(List<String> pmids) {
    this.pmids = pmids;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Citations citations = (Citations) o;
    return Objects.equals(this.abstracts, citations.abstracts) &&
        Objects.equals(this.pmids, citations.pmids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abstracts, pmids);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Citations {\n");
    
    sb.append("    abstracts: ").append(toIndentedString(abstracts)).append("\n");
    sb.append("    pmids: ").append(toIndentedString(pmids)).append("\n");
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


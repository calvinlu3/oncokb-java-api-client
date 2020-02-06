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
 * CancerGene
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-06T11:50:02.938-05:00")
public class CancerGene {
  @SerializedName("entrezGeneId")
  private Integer entrezGeneId = null;

  @SerializedName("foundation")
  private Boolean foundation = null;

  @SerializedName("foundationHeme")
  private Boolean foundationHeme = null;

  @SerializedName("hugoSymbol")
  private String hugoSymbol = null;

  @SerializedName("mSKHeme")
  private Boolean mSKHeme = null;

  @SerializedName("mSKImpact")
  private Boolean mSKImpact = null;

  @SerializedName("occurrenceCount")
  private Integer occurrenceCount = null;

  @SerializedName("oncogene")
  private Boolean oncogene = null;

  @SerializedName("oncokbAnnotated")
  private Boolean oncokbAnnotated = null;

  @SerializedName("sangerCGC")
  private Boolean sangerCGC = null;

  @SerializedName("tsg")
  private Boolean tsg = null;

  @SerializedName("vogelstein")
  private Boolean vogelstein = null;

  public CancerGene entrezGeneId(Integer entrezGeneId) {
    this.entrezGeneId = entrezGeneId;
    return this;
  }

   /**
   * Get entrezGeneId
   * @return entrezGeneId
  **/
  @ApiModelProperty(value = "")
  public Integer getEntrezGeneId() {
    return entrezGeneId;
  }

  public void setEntrezGeneId(Integer entrezGeneId) {
    this.entrezGeneId = entrezGeneId;
  }

  public CancerGene foundation(Boolean foundation) {
    this.foundation = foundation;
    return this;
  }

   /**
   * Get foundation
   * @return foundation
  **/
  @ApiModelProperty(value = "")
  public Boolean isFoundation() {
    return foundation;
  }

  public void setFoundation(Boolean foundation) {
    this.foundation = foundation;
  }

  public CancerGene foundationHeme(Boolean foundationHeme) {
    this.foundationHeme = foundationHeme;
    return this;
  }

   /**
   * Get foundationHeme
   * @return foundationHeme
  **/
  @ApiModelProperty(value = "")
  public Boolean isFoundationHeme() {
    return foundationHeme;
  }

  public void setFoundationHeme(Boolean foundationHeme) {
    this.foundationHeme = foundationHeme;
  }

  public CancerGene hugoSymbol(String hugoSymbol) {
    this.hugoSymbol = hugoSymbol;
    return this;
  }

   /**
   * Get hugoSymbol
   * @return hugoSymbol
  **/
  @ApiModelProperty(value = "")
  public String getHugoSymbol() {
    return hugoSymbol;
  }

  public void setHugoSymbol(String hugoSymbol) {
    this.hugoSymbol = hugoSymbol;
  }

  public CancerGene mSKHeme(Boolean mSKHeme) {
    this.mSKHeme = mSKHeme;
    return this;
  }

   /**
   * Get mSKHeme
   * @return mSKHeme
  **/
  @ApiModelProperty(value = "")
  public Boolean isMSKHeme() {
    return mSKHeme;
  }

  public void setMSKHeme(Boolean mSKHeme) {
    this.mSKHeme = mSKHeme;
  }

  public CancerGene mSKImpact(Boolean mSKImpact) {
    this.mSKImpact = mSKImpact;
    return this;
  }

   /**
   * Get mSKImpact
   * @return mSKImpact
  **/
  @ApiModelProperty(value = "")
  public Boolean isMSKImpact() {
    return mSKImpact;
  }

  public void setMSKImpact(Boolean mSKImpact) {
    this.mSKImpact = mSKImpact;
  }

  public CancerGene occurrenceCount(Integer occurrenceCount) {
    this.occurrenceCount = occurrenceCount;
    return this;
  }

   /**
   * Get occurrenceCount
   * @return occurrenceCount
  **/
  @ApiModelProperty(value = "")
  public Integer getOccurrenceCount() {
    return occurrenceCount;
  }

  public void setOccurrenceCount(Integer occurrenceCount) {
    this.occurrenceCount = occurrenceCount;
  }

  public CancerGene oncogene(Boolean oncogene) {
    this.oncogene = oncogene;
    return this;
  }

   /**
   * Get oncogene
   * @return oncogene
  **/
  @ApiModelProperty(value = "")
  public Boolean isOncogene() {
    return oncogene;
  }

  public void setOncogene(Boolean oncogene) {
    this.oncogene = oncogene;
  }

  public CancerGene oncokbAnnotated(Boolean oncokbAnnotated) {
    this.oncokbAnnotated = oncokbAnnotated;
    return this;
  }

   /**
   * Get oncokbAnnotated
   * @return oncokbAnnotated
  **/
  @ApiModelProperty(value = "")
  public Boolean isOncokbAnnotated() {
    return oncokbAnnotated;
  }

  public void setOncokbAnnotated(Boolean oncokbAnnotated) {
    this.oncokbAnnotated = oncokbAnnotated;
  }

  public CancerGene sangerCGC(Boolean sangerCGC) {
    this.sangerCGC = sangerCGC;
    return this;
  }

   /**
   * Get sangerCGC
   * @return sangerCGC
  **/
  @ApiModelProperty(value = "")
  public Boolean isSangerCGC() {
    return sangerCGC;
  }

  public void setSangerCGC(Boolean sangerCGC) {
    this.sangerCGC = sangerCGC;
  }

  public CancerGene tsg(Boolean tsg) {
    this.tsg = tsg;
    return this;
  }

   /**
   * Get tsg
   * @return tsg
  **/
  @ApiModelProperty(value = "")
  public Boolean isTsg() {
    return tsg;
  }

  public void setTsg(Boolean tsg) {
    this.tsg = tsg;
  }

  public CancerGene vogelstein(Boolean vogelstein) {
    this.vogelstein = vogelstein;
    return this;
  }

   /**
   * Get vogelstein
   * @return vogelstein
  **/
  @ApiModelProperty(value = "")
  public Boolean isVogelstein() {
    return vogelstein;
  }

  public void setVogelstein(Boolean vogelstein) {
    this.vogelstein = vogelstein;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancerGene cancerGene = (CancerGene) o;
    return Objects.equals(this.entrezGeneId, cancerGene.entrezGeneId) &&
        Objects.equals(this.foundation, cancerGene.foundation) &&
        Objects.equals(this.foundationHeme, cancerGene.foundationHeme) &&
        Objects.equals(this.hugoSymbol, cancerGene.hugoSymbol) &&
        Objects.equals(this.mSKHeme, cancerGene.mSKHeme) &&
        Objects.equals(this.mSKImpact, cancerGene.mSKImpact) &&
        Objects.equals(this.occurrenceCount, cancerGene.occurrenceCount) &&
        Objects.equals(this.oncogene, cancerGene.oncogene) &&
        Objects.equals(this.oncokbAnnotated, cancerGene.oncokbAnnotated) &&
        Objects.equals(this.sangerCGC, cancerGene.sangerCGC) &&
        Objects.equals(this.tsg, cancerGene.tsg) &&
        Objects.equals(this.vogelstein, cancerGene.vogelstein);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entrezGeneId, foundation, foundationHeme, hugoSymbol, mSKHeme, mSKImpact, occurrenceCount, oncogene, oncokbAnnotated, sangerCGC, tsg, vogelstein);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancerGene {\n");
    
    sb.append("    entrezGeneId: ").append(toIndentedString(entrezGeneId)).append("\n");
    sb.append("    foundation: ").append(toIndentedString(foundation)).append("\n");
    sb.append("    foundationHeme: ").append(toIndentedString(foundationHeme)).append("\n");
    sb.append("    hugoSymbol: ").append(toIndentedString(hugoSymbol)).append("\n");
    sb.append("    mSKHeme: ").append(toIndentedString(mSKHeme)).append("\n");
    sb.append("    mSKImpact: ").append(toIndentedString(mSKImpact)).append("\n");
    sb.append("    occurrenceCount: ").append(toIndentedString(occurrenceCount)).append("\n");
    sb.append("    oncogene: ").append(toIndentedString(oncogene)).append("\n");
    sb.append("    oncokbAnnotated: ").append(toIndentedString(oncokbAnnotated)).append("\n");
    sb.append("    sangerCGC: ").append(toIndentedString(sangerCGC)).append("\n");
    sb.append("    tsg: ").append(toIndentedString(tsg)).append("\n");
    sb.append("    vogelstein: ").append(toIndentedString(vogelstein)).append("\n");
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


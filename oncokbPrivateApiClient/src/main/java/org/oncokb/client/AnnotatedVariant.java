/*
 * OncoKB Private APIs
 * These endpoints are for private use only.
 *
 * OpenAPI spec version: v1.2.1
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
 * AnnotatedVariant
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-01-27T22:27:50.153-05:00")
public class AnnotatedVariant {
  @SerializedName("entrezGeneId")
  private Integer entrezGeneId = null;

  @SerializedName("gene")
  private String gene = null;

  @SerializedName("grch37Isoform")
  private String grch37Isoform = null;

  @SerializedName("grch37RefSeq")
  private String grch37RefSeq = null;

  @SerializedName("grch38Isoform")
  private String grch38Isoform = null;

  @SerializedName("grch38RefSeq")
  private String grch38RefSeq = null;

  @SerializedName("mutationEffect")
  private String mutationEffect = null;

  @SerializedName("mutationEffectAbstracts")
  private String mutationEffectAbstracts = null;

  @SerializedName("mutationEffectPmids")
  private String mutationEffectPmids = null;

  @SerializedName("oncogenicity")
  private String oncogenicity = null;

  @SerializedName("proteinChange")
  private String proteinChange = null;

  @SerializedName("referenceGenome")
  private String referenceGenome = null;

  @SerializedName("variant")
  private String variant = null;

  public AnnotatedVariant entrezGeneId(Integer entrezGeneId) {
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

  public AnnotatedVariant gene(String gene) {
    this.gene = gene;
    return this;
  }

   /**
   * Get gene
   * @return gene
  **/
  @ApiModelProperty(value = "")
  public String getGene() {
    return gene;
  }

  public void setGene(String gene) {
    this.gene = gene;
  }

  public AnnotatedVariant grch37Isoform(String grch37Isoform) {
    this.grch37Isoform = grch37Isoform;
    return this;
  }

   /**
   * Get grch37Isoform
   * @return grch37Isoform
  **/
  @ApiModelProperty(value = "")
  public String getGrch37Isoform() {
    return grch37Isoform;
  }

  public void setGrch37Isoform(String grch37Isoform) {
    this.grch37Isoform = grch37Isoform;
  }

  public AnnotatedVariant grch37RefSeq(String grch37RefSeq) {
    this.grch37RefSeq = grch37RefSeq;
    return this;
  }

   /**
   * Get grch37RefSeq
   * @return grch37RefSeq
  **/
  @ApiModelProperty(value = "")
  public String getGrch37RefSeq() {
    return grch37RefSeq;
  }

  public void setGrch37RefSeq(String grch37RefSeq) {
    this.grch37RefSeq = grch37RefSeq;
  }

  public AnnotatedVariant grch38Isoform(String grch38Isoform) {
    this.grch38Isoform = grch38Isoform;
    return this;
  }

   /**
   * Get grch38Isoform
   * @return grch38Isoform
  **/
  @ApiModelProperty(value = "")
  public String getGrch38Isoform() {
    return grch38Isoform;
  }

  public void setGrch38Isoform(String grch38Isoform) {
    this.grch38Isoform = grch38Isoform;
  }

  public AnnotatedVariant grch38RefSeq(String grch38RefSeq) {
    this.grch38RefSeq = grch38RefSeq;
    return this;
  }

   /**
   * Get grch38RefSeq
   * @return grch38RefSeq
  **/
  @ApiModelProperty(value = "")
  public String getGrch38RefSeq() {
    return grch38RefSeq;
  }

  public void setGrch38RefSeq(String grch38RefSeq) {
    this.grch38RefSeq = grch38RefSeq;
  }

  public AnnotatedVariant mutationEffect(String mutationEffect) {
    this.mutationEffect = mutationEffect;
    return this;
  }

   /**
   * Get mutationEffect
   * @return mutationEffect
  **/
  @ApiModelProperty(value = "")
  public String getMutationEffect() {
    return mutationEffect;
  }

  public void setMutationEffect(String mutationEffect) {
    this.mutationEffect = mutationEffect;
  }

  public AnnotatedVariant mutationEffectAbstracts(String mutationEffectAbstracts) {
    this.mutationEffectAbstracts = mutationEffectAbstracts;
    return this;
  }

   /**
   * Get mutationEffectAbstracts
   * @return mutationEffectAbstracts
  **/
  @ApiModelProperty(value = "")
  public String getMutationEffectAbstracts() {
    return mutationEffectAbstracts;
  }

  public void setMutationEffectAbstracts(String mutationEffectAbstracts) {
    this.mutationEffectAbstracts = mutationEffectAbstracts;
  }

  public AnnotatedVariant mutationEffectPmids(String mutationEffectPmids) {
    this.mutationEffectPmids = mutationEffectPmids;
    return this;
  }

   /**
   * Get mutationEffectPmids
   * @return mutationEffectPmids
  **/
  @ApiModelProperty(value = "")
  public String getMutationEffectPmids() {
    return mutationEffectPmids;
  }

  public void setMutationEffectPmids(String mutationEffectPmids) {
    this.mutationEffectPmids = mutationEffectPmids;
  }

  public AnnotatedVariant oncogenicity(String oncogenicity) {
    this.oncogenicity = oncogenicity;
    return this;
  }

   /**
   * Get oncogenicity
   * @return oncogenicity
  **/
  @ApiModelProperty(value = "")
  public String getOncogenicity() {
    return oncogenicity;
  }

  public void setOncogenicity(String oncogenicity) {
    this.oncogenicity = oncogenicity;
  }

  public AnnotatedVariant proteinChange(String proteinChange) {
    this.proteinChange = proteinChange;
    return this;
  }

   /**
   * Get proteinChange
   * @return proteinChange
  **/
  @ApiModelProperty(value = "")
  public String getProteinChange() {
    return proteinChange;
  }

  public void setProteinChange(String proteinChange) {
    this.proteinChange = proteinChange;
  }

  public AnnotatedVariant referenceGenome(String referenceGenome) {
    this.referenceGenome = referenceGenome;
    return this;
  }

   /**
   * Get referenceGenome
   * @return referenceGenome
  **/
  @ApiModelProperty(value = "")
  public String getReferenceGenome() {
    return referenceGenome;
  }

  public void setReferenceGenome(String referenceGenome) {
    this.referenceGenome = referenceGenome;
  }

  public AnnotatedVariant variant(String variant) {
    this.variant = variant;
    return this;
  }

   /**
   * Get variant
   * @return variant
  **/
  @ApiModelProperty(value = "")
  public String getVariant() {
    return variant;
  }

  public void setVariant(String variant) {
    this.variant = variant;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnnotatedVariant annotatedVariant = (AnnotatedVariant) o;
    return Objects.equals(this.entrezGeneId, annotatedVariant.entrezGeneId) &&
        Objects.equals(this.gene, annotatedVariant.gene) &&
        Objects.equals(this.grch37Isoform, annotatedVariant.grch37Isoform) &&
        Objects.equals(this.grch37RefSeq, annotatedVariant.grch37RefSeq) &&
        Objects.equals(this.grch38Isoform, annotatedVariant.grch38Isoform) &&
        Objects.equals(this.grch38RefSeq, annotatedVariant.grch38RefSeq) &&
        Objects.equals(this.mutationEffect, annotatedVariant.mutationEffect) &&
        Objects.equals(this.mutationEffectAbstracts, annotatedVariant.mutationEffectAbstracts) &&
        Objects.equals(this.mutationEffectPmids, annotatedVariant.mutationEffectPmids) &&
        Objects.equals(this.oncogenicity, annotatedVariant.oncogenicity) &&
        Objects.equals(this.proteinChange, annotatedVariant.proteinChange) &&
        Objects.equals(this.referenceGenome, annotatedVariant.referenceGenome) &&
        Objects.equals(this.variant, annotatedVariant.variant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entrezGeneId, gene, grch37Isoform, grch37RefSeq, grch38Isoform, grch38RefSeq, mutationEffect, mutationEffectAbstracts, mutationEffectPmids, oncogenicity, proteinChange, referenceGenome, variant);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnnotatedVariant {\n");
    
    sb.append("    entrezGeneId: ").append(toIndentedString(entrezGeneId)).append("\n");
    sb.append("    gene: ").append(toIndentedString(gene)).append("\n");
    sb.append("    grch37Isoform: ").append(toIndentedString(grch37Isoform)).append("\n");
    sb.append("    grch37RefSeq: ").append(toIndentedString(grch37RefSeq)).append("\n");
    sb.append("    grch38Isoform: ").append(toIndentedString(grch38Isoform)).append("\n");
    sb.append("    grch38RefSeq: ").append(toIndentedString(grch38RefSeq)).append("\n");
    sb.append("    mutationEffect: ").append(toIndentedString(mutationEffect)).append("\n");
    sb.append("    mutationEffectAbstracts: ").append(toIndentedString(mutationEffectAbstracts)).append("\n");
    sb.append("    mutationEffectPmids: ").append(toIndentedString(mutationEffectPmids)).append("\n");
    sb.append("    oncogenicity: ").append(toIndentedString(oncogenicity)).append("\n");
    sb.append("    proteinChange: ").append(toIndentedString(proteinChange)).append("\n");
    sb.append("    referenceGenome: ").append(toIndentedString(referenceGenome)).append("\n");
    sb.append("    variant: ").append(toIndentedString(variant)).append("\n");
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


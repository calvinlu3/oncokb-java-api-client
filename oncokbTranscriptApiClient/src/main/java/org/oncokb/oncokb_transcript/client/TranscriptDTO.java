/*
 * oncokb-transcript API
 * oncokb-transcript API documentation
 *
 * The version of the OpenAPI document: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.oncokb.oncokb_transcript.client;

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
import org.oncokb.oncokb_transcript.client.EnsemblGene;
import org.oncokb.oncokb_transcript.client.GenomeFragment;
import java.io.Serializable;

/**
 * TranscriptDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TranscriptDTO implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CANONICAL = "canonical";
  @SerializedName(SERIALIZED_NAME_CANONICAL)
  private Boolean canonical;

  public static final String SERIALIZED_NAME_CHROMOSOME = "chromosome";
  @SerializedName(SERIALIZED_NAME_CHROMOSOME)
  private String chromosome;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_END = "end";
  @SerializedName(SERIALIZED_NAME_END)
  private Integer end;

  public static final String SERIALIZED_NAME_ENSEMBL_GENE = "ensemblGene";
  @SerializedName(SERIALIZED_NAME_ENSEMBL_GENE)
  private EnsemblGene ensemblGene;

  public static final String SERIALIZED_NAME_ENSEMBL_PROTEIN_ID = "ensemblProteinId";
  @SerializedName(SERIALIZED_NAME_ENSEMBL_PROTEIN_ID)
  private String ensemblProteinId;

  public static final String SERIALIZED_NAME_ENSEMBL_TRANSCRIPT_ID = "ensemblTranscriptId";
  @SerializedName(SERIALIZED_NAME_ENSEMBL_TRANSCRIPT_ID)
  private String ensemblTranscriptId;

  public static final String SERIALIZED_NAME_EXONS = "exons";
  @SerializedName(SERIALIZED_NAME_EXONS)
  private List<GenomeFragment> exons = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_REFERENCE_SEQUENCE_ID = "referenceSequenceId";
  @SerializedName(SERIALIZED_NAME_REFERENCE_SEQUENCE_ID)
  private String referenceSequenceId;

  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  private Integer start;

  public static final String SERIALIZED_NAME_STRAND = "strand";
  @SerializedName(SERIALIZED_NAME_STRAND)
  private Integer strand;

  public static final String SERIALIZED_NAME_UTRS = "utrs";
  @SerializedName(SERIALIZED_NAME_UTRS)
  private List<GenomeFragment> utrs = null;

  public TranscriptDTO() { 
  }

  public TranscriptDTO canonical(Boolean canonical) {
    
    this.canonical = canonical;
    return this;
  }

   /**
   * Get canonical
   * @return canonical
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getCanonical() {
    return canonical;
  }


  public void setCanonical(Boolean canonical) {
    this.canonical = canonical;
  }


  public TranscriptDTO chromosome(String chromosome) {
    
    this.chromosome = chromosome;
    return this;
  }

   /**
   * Get chromosome
   * @return chromosome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChromosome() {
    return chromosome;
  }


  public void setChromosome(String chromosome) {
    this.chromosome = chromosome;
  }


  public TranscriptDTO description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public TranscriptDTO end(Integer end) {
    
    this.end = end;
    return this;
  }

   /**
   * Get end
   * @return end
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getEnd() {
    return end;
  }


  public void setEnd(Integer end) {
    this.end = end;
  }


  public TranscriptDTO ensemblGene(EnsemblGene ensemblGene) {
    
    this.ensemblGene = ensemblGene;
    return this;
  }

   /**
   * Get ensemblGene
   * @return ensemblGene
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnsemblGene getEnsemblGene() {
    return ensemblGene;
  }


  public void setEnsemblGene(EnsemblGene ensemblGene) {
    this.ensemblGene = ensemblGene;
  }


  public TranscriptDTO ensemblProteinId(String ensemblProteinId) {
    
    this.ensemblProteinId = ensemblProteinId;
    return this;
  }

   /**
   * Get ensemblProteinId
   * @return ensemblProteinId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEnsemblProteinId() {
    return ensemblProteinId;
  }


  public void setEnsemblProteinId(String ensemblProteinId) {
    this.ensemblProteinId = ensemblProteinId;
  }


  public TranscriptDTO ensemblTranscriptId(String ensemblTranscriptId) {
    
    this.ensemblTranscriptId = ensemblTranscriptId;
    return this;
  }

   /**
   * Get ensemblTranscriptId
   * @return ensemblTranscriptId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEnsemblTranscriptId() {
    return ensemblTranscriptId;
  }


  public void setEnsemblTranscriptId(String ensemblTranscriptId) {
    this.ensemblTranscriptId = ensemblTranscriptId;
  }


  public TranscriptDTO exons(List<GenomeFragment> exons) {
    
    this.exons = exons;
    return this;
  }

  public TranscriptDTO addExonsItem(GenomeFragment exonsItem) {
    if (this.exons == null) {
      this.exons = new ArrayList<GenomeFragment>();
    }
    this.exons.add(exonsItem);
    return this;
  }

   /**
   * Get exons
   * @return exons
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GenomeFragment> getExons() {
    return exons;
  }


  public void setExons(List<GenomeFragment> exons) {
    this.exons = exons;
  }


  public TranscriptDTO id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public TranscriptDTO referenceSequenceId(String referenceSequenceId) {
    
    this.referenceSequenceId = referenceSequenceId;
    return this;
  }

   /**
   * Get referenceSequenceId
   * @return referenceSequenceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReferenceSequenceId() {
    return referenceSequenceId;
  }


  public void setReferenceSequenceId(String referenceSequenceId) {
    this.referenceSequenceId = referenceSequenceId;
  }


  public TranscriptDTO start(Integer start) {
    
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getStart() {
    return start;
  }


  public void setStart(Integer start) {
    this.start = start;
  }


  public TranscriptDTO strand(Integer strand) {
    
    this.strand = strand;
    return this;
  }

   /**
   * Get strand
   * @return strand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getStrand() {
    return strand;
  }


  public void setStrand(Integer strand) {
    this.strand = strand;
  }


  public TranscriptDTO utrs(List<GenomeFragment> utrs) {
    
    this.utrs = utrs;
    return this;
  }

  public TranscriptDTO addUtrsItem(GenomeFragment utrsItem) {
    if (this.utrs == null) {
      this.utrs = new ArrayList<GenomeFragment>();
    }
    this.utrs.add(utrsItem);
    return this;
  }

   /**
   * Get utrs
   * @return utrs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GenomeFragment> getUtrs() {
    return utrs;
  }


  public void setUtrs(List<GenomeFragment> utrs) {
    this.utrs = utrs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranscriptDTO transcriptDTO = (TranscriptDTO) o;
    return Objects.equals(this.canonical, transcriptDTO.canonical) &&
        Objects.equals(this.chromosome, transcriptDTO.chromosome) &&
        Objects.equals(this.description, transcriptDTO.description) &&
        Objects.equals(this.end, transcriptDTO.end) &&
        Objects.equals(this.ensemblGene, transcriptDTO.ensemblGene) &&
        Objects.equals(this.ensemblProteinId, transcriptDTO.ensemblProteinId) &&
        Objects.equals(this.ensemblTranscriptId, transcriptDTO.ensemblTranscriptId) &&
        Objects.equals(this.exons, transcriptDTO.exons) &&
        Objects.equals(this.id, transcriptDTO.id) &&
        Objects.equals(this.referenceSequenceId, transcriptDTO.referenceSequenceId) &&
        Objects.equals(this.start, transcriptDTO.start) &&
        Objects.equals(this.strand, transcriptDTO.strand) &&
        Objects.equals(this.utrs, transcriptDTO.utrs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canonical, chromosome, description, end, ensemblGene, ensemblProteinId, ensemblTranscriptId, exons, id, referenceSequenceId, start, strand, utrs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranscriptDTO {\n");
    sb.append("    canonical: ").append(toIndentedString(canonical)).append("\n");
    sb.append("    chromosome: ").append(toIndentedString(chromosome)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    ensemblGene: ").append(toIndentedString(ensemblGene)).append("\n");
    sb.append("    ensemblProteinId: ").append(toIndentedString(ensemblProteinId)).append("\n");
    sb.append("    ensemblTranscriptId: ").append(toIndentedString(ensemblTranscriptId)).append("\n");
    sb.append("    exons: ").append(toIndentedString(exons)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    referenceSequenceId: ").append(toIndentedString(referenceSequenceId)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    strand: ").append(toIndentedString(strand)).append("\n");
    sb.append("    utrs: ").append(toIndentedString(utrs)).append("\n");
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

}


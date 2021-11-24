/*
 * oncokb-transcript API
 * oncokb-transcript API documentation
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.oncokb.oncokb_transcript.client.Transcript;
import java.io.Serializable;
/**
 * GenomeFragment
 */


public class GenomeFragment implements Serializable{
  private static final long serialVersionUID = 1L;
  @SerializedName("chromosome")
  private String chromosome = null;

  @SerializedName("end")
  private Integer end = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("start")
  private Integer start = null;

  @SerializedName("strand")
  private Integer strand = null;

  @SerializedName("transcript")
  private Transcript transcript = null;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    EXON("EXON"),
    FIVE_PRIME_UTR("FIVE_PRIME_UTR"),
    GENE("GENE"),
    THREE_PRIME_UTR("THREE_PRIME_UTR");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("type")
  private TypeEnum type = null;

  public GenomeFragment chromosome(String chromosome) {
    this.chromosome = chromosome;
    return this;
  }

   /**
   * Get chromosome
   * @return chromosome
  **/
  @Schema(description = "")
  public String getChromosome() {
    return chromosome;
  }

  public void setChromosome(String chromosome) {
    this.chromosome = chromosome;
  }

  public GenomeFragment end(Integer end) {
    this.end = end;
    return this;
  }

   /**
   * Get end
   * @return end
  **/
  @Schema(description = "")
  public Integer getEnd() {
    return end;
  }

  public void setEnd(Integer end) {
    this.end = end;
  }

  public GenomeFragment id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public GenomeFragment start(Integer start) {
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @Schema(description = "")
  public Integer getStart() {
    return start;
  }

  public void setStart(Integer start) {
    this.start = start;
  }

  public GenomeFragment strand(Integer strand) {
    this.strand = strand;
    return this;
  }

   /**
   * Get strand
   * @return strand
  **/
  @Schema(description = "")
  public Integer getStrand() {
    return strand;
  }

  public void setStrand(Integer strand) {
    this.strand = strand;
  }

  public GenomeFragment transcript(Transcript transcript) {
    this.transcript = transcript;
    return this;
  }

   /**
   * Get transcript
   * @return transcript
  **/
  @Schema(description = "")
  public Transcript getTranscript() {
    return transcript;
  }

  public void setTranscript(Transcript transcript) {
    this.transcript = transcript;
  }

  public GenomeFragment type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenomeFragment genomeFragment = (GenomeFragment) o;
    return Objects.equals(this.chromosome, genomeFragment.chromosome) &&
        Objects.equals(this.end, genomeFragment.end) &&
        Objects.equals(this.id, genomeFragment.id) &&
        Objects.equals(this.start, genomeFragment.start) &&
        Objects.equals(this.strand, genomeFragment.strand) &&
        Objects.equals(this.transcript, genomeFragment.transcript) &&
        Objects.equals(this.type, genomeFragment.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chromosome, end, id, start, strand, transcript, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenomeFragment {\n");
    
    sb.append("    chromosome: ").append(toIndentedString(chromosome)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    strand: ").append(toIndentedString(strand)).append("\n");
    sb.append("    transcript: ").append(toIndentedString(transcript)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

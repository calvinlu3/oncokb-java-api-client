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
import org.oncokb.oncokb_transcript.client.TranscriptPairVM;
import java.io.Serializable;
/**
 * TranscriptComparisonVM
 */


public class TranscriptComparisonVM implements Serializable{
  private static final long serialVersionUID = 1L;
  @SerializedName("align")
  private Boolean align = null;

  @SerializedName("transcriptA")
  private TranscriptPairVM transcriptA = null;

  @SerializedName("transcriptB")
  private TranscriptPairVM transcriptB = null;

  public TranscriptComparisonVM align(Boolean align) {
    this.align = align;
    return this;
  }

   /**
   * Get align
   * @return align
  **/
  @Schema(description = "")
  public Boolean isAlign() {
    return align;
  }

  public void setAlign(Boolean align) {
    this.align = align;
  }

  public TranscriptComparisonVM transcriptA(TranscriptPairVM transcriptA) {
    this.transcriptA = transcriptA;
    return this;
  }

   /**
   * Get transcriptA
   * @return transcriptA
  **/
  @Schema(description = "")
  public TranscriptPairVM getTranscriptA() {
    return transcriptA;
  }

  public void setTranscriptA(TranscriptPairVM transcriptA) {
    this.transcriptA = transcriptA;
  }

  public TranscriptComparisonVM transcriptB(TranscriptPairVM transcriptB) {
    this.transcriptB = transcriptB;
    return this;
  }

   /**
   * Get transcriptB
   * @return transcriptB
  **/
  @Schema(description = "")
  public TranscriptPairVM getTranscriptB() {
    return transcriptB;
  }

  public void setTranscriptB(TranscriptPairVM transcriptB) {
    this.transcriptB = transcriptB;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranscriptComparisonVM transcriptComparisonVM = (TranscriptComparisonVM) o;
    return Objects.equals(this.align, transcriptComparisonVM.align) &&
        Objects.equals(this.transcriptA, transcriptComparisonVM.transcriptA) &&
        Objects.equals(this.transcriptB, transcriptComparisonVM.transcriptB);
  }

  @Override
  public int hashCode() {
    return Objects.hash(align, transcriptA, transcriptB);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranscriptComparisonVM {\n");
    
    sb.append("    align: ").append(toIndentedString(align)).append("\n");
    sb.append("    transcriptA: ").append(toIndentedString(transcriptA)).append("\n");
    sb.append("    transcriptB: ").append(toIndentedString(transcriptB)).append("\n");
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

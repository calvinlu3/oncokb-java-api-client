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
import org.oncokb.oncokb_transcript.client.EnsemblTranscript;
import java.io.Serializable;
/**
 * TranscriptResultVM
 */


public class TranscriptResultVM implements Serializable{
  private static final long serialVersionUID = 1L;
  @SerializedName("grch37Transcript")
  private EnsemblTranscript grch37Transcript = null;

  @SerializedName("grch38Transcript")
  private EnsemblTranscript grch38Transcript = null;

  @SerializedName("note")
  private String note = null;

  public TranscriptResultVM grch37Transcript(EnsemblTranscript grch37Transcript) {
    this.grch37Transcript = grch37Transcript;
    return this;
  }

   /**
   * Get grch37Transcript
   * @return grch37Transcript
  **/
  @Schema(description = "")
  public EnsemblTranscript getGrch37Transcript() {
    return grch37Transcript;
  }

  public void setGrch37Transcript(EnsemblTranscript grch37Transcript) {
    this.grch37Transcript = grch37Transcript;
  }

  public TranscriptResultVM grch38Transcript(EnsemblTranscript grch38Transcript) {
    this.grch38Transcript = grch38Transcript;
    return this;
  }

   /**
   * Get grch38Transcript
   * @return grch38Transcript
  **/
  @Schema(description = "")
  public EnsemblTranscript getGrch38Transcript() {
    return grch38Transcript;
  }

  public void setGrch38Transcript(EnsemblTranscript grch38Transcript) {
    this.grch38Transcript = grch38Transcript;
  }

  public TranscriptResultVM note(String note) {
    this.note = note;
    return this;
  }

   /**
   * Get note
   * @return note
  **/
  @Schema(description = "")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranscriptResultVM transcriptResultVM = (TranscriptResultVM) o;
    return Objects.equals(this.grch37Transcript, transcriptResultVM.grch37Transcript) &&
        Objects.equals(this.grch38Transcript, transcriptResultVM.grch38Transcript) &&
        Objects.equals(this.note, transcriptResultVM.note);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grch37Transcript, grch38Transcript, note);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranscriptResultVM {\n");
    
    sb.append("    grch37Transcript: ").append(toIndentedString(grch37Transcript)).append("\n");
    sb.append("    grch38Transcript: ").append(toIndentedString(grch38Transcript)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
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

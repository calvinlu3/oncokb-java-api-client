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
import java.io.Serializable;
/**
 * PfamDomainRange
 */


public class PfamDomainRange implements Serializable{
  private static final long serialVersionUID = 1L;
  @SerializedName("pfamDomainEnd")
  private Integer pfamDomainEnd = null;

  @SerializedName("pfamDomainId")
  private String pfamDomainId = null;

  @SerializedName("pfamDomainStart")
  private Integer pfamDomainStart = null;

  public PfamDomainRange pfamDomainEnd(Integer pfamDomainEnd) {
    this.pfamDomainEnd = pfamDomainEnd;
    return this;
  }

   /**
   * Pfam domain end amino acid
   * @return pfamDomainEnd
  **/
  @Schema(required = true, description = "Pfam domain end amino acid")
  public Integer getPfamDomainEnd() {
    return pfamDomainEnd;
  }

  public void setPfamDomainEnd(Integer pfamDomainEnd) {
    this.pfamDomainEnd = pfamDomainEnd;
  }

  public PfamDomainRange pfamDomainId(String pfamDomainId) {
    this.pfamDomainId = pfamDomainId;
    return this;
  }

   /**
   * Pfam domain id
   * @return pfamDomainId
  **/
  @Schema(required = true, description = "Pfam domain id")
  public String getPfamDomainId() {
    return pfamDomainId;
  }

  public void setPfamDomainId(String pfamDomainId) {
    this.pfamDomainId = pfamDomainId;
  }

  public PfamDomainRange pfamDomainStart(Integer pfamDomainStart) {
    this.pfamDomainStart = pfamDomainStart;
    return this;
  }

   /**
   * Pfam domain start amino acid
   * @return pfamDomainStart
  **/
  @Schema(required = true, description = "Pfam domain start amino acid")
  public Integer getPfamDomainStart() {
    return pfamDomainStart;
  }

  public void setPfamDomainStart(Integer pfamDomainStart) {
    this.pfamDomainStart = pfamDomainStart;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PfamDomainRange pfamDomainRange = (PfamDomainRange) o;
    return Objects.equals(this.pfamDomainEnd, pfamDomainRange.pfamDomainEnd) &&
        Objects.equals(this.pfamDomainId, pfamDomainRange.pfamDomainId) &&
        Objects.equals(this.pfamDomainStart, pfamDomainRange.pfamDomainStart);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pfamDomainEnd, pfamDomainId, pfamDomainStart);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PfamDomainRange {\n");
    
    sb.append("    pfamDomainEnd: ").append(toIndentedString(pfamDomainEnd)).append("\n");
    sb.append("    pfamDomainId: ").append(toIndentedString(pfamDomainId)).append("\n");
    sb.append("    pfamDomainStart: ").append(toIndentedString(pfamDomainStart)).append("\n");
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

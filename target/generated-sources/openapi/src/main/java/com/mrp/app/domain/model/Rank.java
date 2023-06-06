package com.mrp.app.domain.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.mrp.app.domain.model.Person;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Rank
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-06-06T10:12:34.400926600+02:00[Europe/Berlin]")
public class Rank   {

  @JsonProperty("rank")
  private Integer rank;

  @JsonProperty("attendee")
  private Person attendee;

  @JsonProperty("points")
  private BigDecimal points;

  public Rank rank(Integer rank) {
    this.rank = rank;
    return this;
  }

  /**
   * Get rank
   * @return rank
  */
  
  @Schema(name = "rank", required = false)
  public Integer getRank() {
    return rank;
  }

  public void setRank(Integer rank) {
    this.rank = rank;
  }

  public Rank attendee(Person attendee) {
    this.attendee = attendee;
    return this;
  }

  /**
   * Get attendee
   * @return attendee
  */
  @Valid 
  @Schema(name = "attendee", required = false)
  public Person getAttendee() {
    return attendee;
  }

  public void setAttendee(Person attendee) {
    this.attendee = attendee;
  }

  public Rank points(BigDecimal points) {
    this.points = points;
    return this;
  }

  /**
   * Get points
   * @return points
  */
  @Valid 
  @Schema(name = "points", required = false)
  public BigDecimal getPoints() {
    return points;
  }

  public void setPoints(BigDecimal points) {
    this.points = points;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rank rank = (Rank) o;
    return Objects.equals(this.rank, rank.rank) &&
        Objects.equals(this.attendee, rank.attendee) &&
        Objects.equals(this.points, rank.points);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rank, attendee, points);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rank {\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    attendee: ").append(toIndentedString(attendee)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
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


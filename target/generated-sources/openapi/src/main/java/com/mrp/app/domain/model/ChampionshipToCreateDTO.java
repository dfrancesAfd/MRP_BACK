package com.mrp.app.domain.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ChampionshipToCreateDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-06-06T10:12:34.400926600+02:00[Europe/Berlin]")
public class ChampionshipToCreateDTO   {

  @JsonProperty("name")
  private String name;

  @JsonProperty("startDate")
  private String startDate;

  @JsonProperty("endDate")
  private String endDate;

  public ChampionshipToCreateDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", required = false)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ChampionshipToCreateDTO startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
  */
  
  @Schema(name = "startDate", required = false)
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public ChampionshipToCreateDTO endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
  */
  
  @Schema(name = "endDate", required = false)
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChampionshipToCreateDTO championshipToCreateDTO = (ChampionshipToCreateDTO) o;
    return Objects.equals(this.name, championshipToCreateDTO.name) &&
        Objects.equals(this.startDate, championshipToCreateDTO.startDate) &&
        Objects.equals(this.endDate, championshipToCreateDTO.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, startDate, endDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChampionshipToCreateDTO {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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


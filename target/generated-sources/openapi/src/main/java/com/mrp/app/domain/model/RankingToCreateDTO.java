package com.mrp.app.domain.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.mrp.app.domain.model.Rank;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RankingToCreateDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-06-06T10:12:34.400926600+02:00[Europe/Berlin]")
public class RankingToCreateDTO   {

  @JsonProperty("ranking")
  @Valid
  private List<Rank> ranking = null;

  public RankingToCreateDTO ranking(List<Rank> ranking) {
    this.ranking = ranking;
    return this;
  }

  public RankingToCreateDTO addRankingItem(Rank rankingItem) {
    if (this.ranking == null) {
      this.ranking = new ArrayList<>();
    }
    this.ranking.add(rankingItem);
    return this;
  }

  /**
   * Get ranking
   * @return ranking
  */
  @Valid 
  @Schema(name = "ranking", required = false)
  public List<Rank> getRanking() {
    return ranking;
  }

  public void setRanking(List<Rank> ranking) {
    this.ranking = ranking;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RankingToCreateDTO rankingToCreateDTO = (RankingToCreateDTO) o;
    return Objects.equals(this.ranking, rankingToCreateDTO.ranking);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ranking);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RankingToCreateDTO {\n");
    sb.append("    ranking: ").append(toIndentedString(ranking)).append("\n");
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


package com.mrp.app.domain.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.mrp.app.domain.model.ChampionshipState;
import com.mrp.app.domain.model.Rank;
import com.mrp.app.domain.model.Round;
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
 * ChampionshipDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-06-06T10:12:34.400926600+02:00[Europe/Berlin]")
public class ChampionshipDTO   {

  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("startDate")
  private String startDate;

  @JsonProperty("endDate")
  private String endDate;

  @JsonProperty("state")
  private ChampionshipState state;

  @JsonProperty("rounds")
  @Valid
  private List<Round> rounds = null;

  @JsonProperty("ranking")
  @Valid
  private List<Rank> ranking = null;

  public ChampionshipDTO id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", required = false)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ChampionshipDTO name(String name) {
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

  public ChampionshipDTO startDate(String startDate) {
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

  public ChampionshipDTO endDate(String endDate) {
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

  public ChampionshipDTO state(ChampionshipState state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  */
  @Valid 
  @Schema(name = "state", required = false)
  public ChampionshipState getState() {
    return state;
  }

  public void setState(ChampionshipState state) {
    this.state = state;
  }

  public ChampionshipDTO rounds(List<Round> rounds) {
    this.rounds = rounds;
    return this;
  }

  public ChampionshipDTO addRoundsItem(Round roundsItem) {
    if (this.rounds == null) {
      this.rounds = new ArrayList<>();
    }
    this.rounds.add(roundsItem);
    return this;
  }

  /**
   * Get rounds
   * @return rounds
  */
  @Valid 
  @Schema(name = "rounds", required = false)
  public List<Round> getRounds() {
    return rounds;
  }

  public void setRounds(List<Round> rounds) {
    this.rounds = rounds;
  }

  public ChampionshipDTO ranking(List<Rank> ranking) {
    this.ranking = ranking;
    return this;
  }

  public ChampionshipDTO addRankingItem(Rank rankingItem) {
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
    ChampionshipDTO championshipDTO = (ChampionshipDTO) o;
    return Objects.equals(this.id, championshipDTO.id) &&
        Objects.equals(this.name, championshipDTO.name) &&
        Objects.equals(this.startDate, championshipDTO.startDate) &&
        Objects.equals(this.endDate, championshipDTO.endDate) &&
        Objects.equals(this.state, championshipDTO.state) &&
        Objects.equals(this.rounds, championshipDTO.rounds) &&
        Objects.equals(this.ranking, championshipDTO.ranking);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, startDate, endDate, state, rounds, ranking);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChampionshipDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    rounds: ").append(toIndentedString(rounds)).append("\n");
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


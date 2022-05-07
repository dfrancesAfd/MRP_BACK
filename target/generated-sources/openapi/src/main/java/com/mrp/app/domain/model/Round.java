package com.mrp.app.domain.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.mrp.app.domain.model.Person;
import com.mrp.app.domain.model.Rank;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Round
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-07T23:29:09.273407+02:00[Europe/Paris]")
public class Round   {

  @JsonProperty("date")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime date;

  @JsonProperty("attendees")
  @Valid
  private List<Person> attendees = null;

  @JsonProperty("players")
  @Valid
  private List<Person> players = null;

  @JsonProperty("ranking")
  @Valid
  private List<Rank> ranking = null;

  public Round date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  */
  @Valid 
  @Schema(name = "date", required = false)
  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public Round attendees(List<Person> attendees) {
    this.attendees = attendees;
    return this;
  }

  public Round addAttendeesItem(Person attendeesItem) {
    if (this.attendees == null) {
      this.attendees = new ArrayList<>();
    }
    this.attendees.add(attendeesItem);
    return this;
  }

  /**
   * Get attendees
   * @return attendees
  */
  @Valid 
  @Schema(name = "attendees", required = false)
  public List<Person> getAttendees() {
    return attendees;
  }

  public void setAttendees(List<Person> attendees) {
    this.attendees = attendees;
  }

  public Round players(List<Person> players) {
    this.players = players;
    return this;
  }

  public Round addPlayersItem(Person playersItem) {
    if (this.players == null) {
      this.players = new ArrayList<>();
    }
    this.players.add(playersItem);
    return this;
  }

  /**
   * Get players
   * @return players
  */
  @Valid 
  @Schema(name = "players", required = false)
  public List<Person> getPlayers() {
    return players;
  }

  public void setPlayers(List<Person> players) {
    this.players = players;
  }

  public Round ranking(List<Rank> ranking) {
    this.ranking = ranking;
    return this;
  }

  public Round addRankingItem(Rank rankingItem) {
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
    Round round = (Round) o;
    return Objects.equals(this.date, round.date) &&
        Objects.equals(this.attendees, round.attendees) &&
        Objects.equals(this.players, round.players) &&
        Objects.equals(this.ranking, round.ranking);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, attendees, players, ranking);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Round {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    attendees: ").append(toIndentedString(attendees)).append("\n");
    sb.append("    players: ").append(toIndentedString(players)).append("\n");
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


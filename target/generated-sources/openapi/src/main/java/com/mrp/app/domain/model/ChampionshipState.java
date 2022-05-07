package com.mrp.app.domain.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ChampionshipState
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-07T23:29:09.273407+02:00[Europe/Paris]")
public enum ChampionshipState {
  
  PLANNED("PLANNED"),
  
  ONGOING("ONGOING"),
  
  FINISHED("FINISHED");

  private String value;

  ChampionshipState(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ChampionshipState fromValue(String value) {
    for (ChampionshipState b : ChampionshipState.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


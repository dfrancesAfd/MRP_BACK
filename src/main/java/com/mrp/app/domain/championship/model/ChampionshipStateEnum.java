package com.mrp.app.domain.championship.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mrp.app.domain.model.ChampionshipState;

public enum ChampionshipStateEnum {
    PLANNED("PLANNED"),

    ONGOING("ONGOING"),

    FINISHED("FINISHED");

    private String value;

    ChampionshipStateEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}

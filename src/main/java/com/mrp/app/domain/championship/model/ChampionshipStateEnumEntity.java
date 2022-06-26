package com.mrp.app.domain.championship.model;

public enum ChampionshipStateEnumEntity {
    PLANNED("PLANNED"),

    ONGOING("ONGOING"),

    FINISHED("FINISHED");

    private String value;

    ChampionshipStateEnumEntity(String value) {
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

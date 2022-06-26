package com.mrp.app.port.mongo.document;

public enum ChampionshipStateEnumDocument {
    PLANNED("PLANNED"),

    ONGOING("ONGOING"),

    FINISHED("FINISHED");

    private String value;

    ChampionshipStateEnumDocument(String value) {
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

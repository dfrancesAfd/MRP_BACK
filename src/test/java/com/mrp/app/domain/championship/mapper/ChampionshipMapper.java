package com.mrp.app.domain.championship.mapper;

import com.mrp.app.domain.championship.model.Championship;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ChampionshipMapper {

    public Championship map(List<Map<String, String>> maps) {
        Championship result = new Championship();
        result.setStartDate(maps.get(0).get("nameChampionship"));
        result.setStartDate(maps.get(0).get("startDateChampionship"));
        result.setStartDate(maps.get(0).get("endDateChampionship"));
        if(maps.get(0).get("stateChampionship") != null){
            result.setStartDate(maps.get(0).get("stateChampionship"));
        };

        return result;
    }

    public Integer parseIntOrNull(String value) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}

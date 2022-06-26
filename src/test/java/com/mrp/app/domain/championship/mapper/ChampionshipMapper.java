package com.mrp.app.domain.championship.mapper;

import com.mrp.app.domain.championship.model.ChampionshipEntity;
import com.mrp.app.domain.championship.model.ChampionshipStateEnumEntity;

import java.util.List;
import java.util.Map;

public class ChampionshipMapper {

    public ChampionshipEntity map(List<Map<String, String>> maps) {

        ChampionshipEntity result = new ChampionshipEntity();
        result.setName(maps.get(0).get("nameChampionship"));
        result.setStartDate(maps.get(0).get("startDateChampionship"));
        result.setEndDate(maps.get(0).get("endDateChampionship"));
        if(maps.get(0).get("stateChampionship") != null){
            result.setState(ChampionshipStateEnumEntity.valueOf(maps.get(0).get("stateChampionship")));
        };
        return result;
    }

//    public Integer parseIntOrNull(String value) {
//        try {
//            return Integer.parseInt(value);
//        } catch (NumberFormatException e) {
//            return 0;
//        }
//    }
}

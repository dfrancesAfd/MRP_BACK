package com.mrp.app.api.mapper;

import com.mrp.app.domain.championship.model.ChampionshipEntity;
import com.mrp.app.domain.model.ChampionshipToCreateDTO;

import java.time.OffsetDateTime;

public class ChampionshipDTOToChampionshipEntityMapper {

    public ChampionshipEntity championshipToCreateDTOToChampionshipEntity(ChampionshipToCreateDTO championshipToCreateDTO){
        ChampionshipEntity championshipEntity = new ChampionshipEntity();
        championshipEntity.setEndDate(OffsetDateTime.parse(championshipToCreateDTO.getEndDate()));
        championshipEntity.setStartDate(OffsetDateTime.parse(championshipToCreateDTO.getStartDate()));
        championshipEntity.setName(championshipToCreateDTO.getName());
        return championshipEntity;
    }
}

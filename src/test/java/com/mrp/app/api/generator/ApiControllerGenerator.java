package com.mrp.app.api.generator;

import com.mrp.app.domain.model.ChampionshipToCreateDTO;

public class ApiControllerGenerator {

    public ChampionshipToCreateDTO generateChampionshipToCreate(){
        ChampionshipToCreateDTO championshipToCreateDTO = new ChampionshipToCreateDTO();
        championshipToCreateDTO.name("Championnat #1 MRP");
        championshipToCreateDTO.startDate("2023-04-18T13:10:28Z");
        championshipToCreateDTO.endDate("2024-04-18T13:10:28Z");
        return championshipToCreateDTO;
    }
}

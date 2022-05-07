package com.mrp.app.domain.championship.steps;

import com.mrp.app.domain.championship.mapper.ChampionshipMapper;
import com.mrp.app.domain.championship.model.Championship;
import com.mrp.app.domain.championship.repository.mongo.ChampionshipRepository;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

public class ChampionshipSteps {

    @Autowired
    private ChampionshipRepository championshipRepository;

    Map<Integer, Championship> championships= new HashMap<>();

    @Given("Une base de donnée ne contenant aucun Championnat existe")
    public void uneBaseDeDonneeNeContenantAucunChampionnatExiste() {
        championshipRepository.deleteAll();
    }

    @And("Un Championnat{int} (.*) les informations suivantes existe")
    public void unChampionnatACreerAvecLesInformationsSuivantesExiste(int arg0,  DataTable table) {
        ChampionshipMapper championshipMapper = new ChampionshipMapper();
        Championship event=championshipMapper.map(table.asMaps(String.class, String.class));
        championships.put(arg0, event);
    }
}

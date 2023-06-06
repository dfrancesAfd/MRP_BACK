package com.mrp.app.domain.championship.steps;

import com.mrp.app.domain.championship.mapper.ChampionshipMapper;
import com.mrp.app.domain.championship.model.ChampionshipEntity;
import com.mrp.app.domain.championship.model.ChampionshipStateEnumEntity;
import com.mrp.app.domain.championship.model.RankEntity;
import com.mrp.app.domain.championship.model.RoundEntity;
import com.mrp.app.domain.championship.service.ChampionshipRepository;
import com.mrp.app.domain.championship.service.CreateChampionshipService;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.NotImplementedException;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertAll;

public class ChampionshipSteps {

    @Autowired
    private ChampionshipRepository championshipRepository;

    @Autowired
    private CreateChampionshipService createChampionshipService;

    //Stockage des championnats créés
    Map<Integer, ChampionshipEntity> championships= new HashMap<>();

    //Stockage des listes de manches créées
    Map<Integer, ArrayList<RoundEntity>> roundList =new HashMap<>();

    //Stockage de classements créés
    Map<Integer, ArrayList<RankEntity>> ranking =new HashMap<>();

    Mono<ChampionshipEntity> championshipEntityMono;

    @Given("Une base de donnee ne contenant aucun Championnat existe")
    public void uneBaseDeDonneeNeContenantAucunChampionnatExiste() {
        championshipRepository.deleteAll();
    }

    @And("Un Championnat{int} avec les informations suivantes existe")
    public void unChampionnatACreerAvecLesInformationsSuivantesExiste(int championshipNumber,  DataTable table) {
        ChampionshipMapper championshipMapper = new ChampionshipMapper();
        ChampionshipEntity championship = championshipMapper.map(table.asMaps(String.class, String.class));
        championships.put(championshipNumber, championship);
    }

    @And("Une liste{int} de Manche existe")
    public void uneListeDeMancheExiste(int roundListNumber) {
        roundList.put(roundListNumber, new ArrayList<>());
    }

    @And("La liste{int} de Manche existe dans Championnat{int}")
    public void laListeDeMancheExisteDansChampionnat(int roundListNumber, int championshipNumber) {
        championships.get(championshipNumber).setRounds(roundList.get(roundListNumber));
    }

    @And("Une liste{int} de Classement existe")
    public void uneListeDeClassementExiste(int rankingNumber) {
        ranking.put(rankingNumber, new ArrayList<>());
    }

    @And("La liste{int} de Classement existe dans Championnat{int}")
    public void laListeDeClassementExisteDansChampionnat(int rankingNumber, int championshipNumber) {
        championships.get(championshipNumber).setRanking(ranking.get(rankingNumber));
    }

    @When("Championnat{int} est cree")
    public void championnatEstCree(int championshipNumber) {
        championshipEntityMono = createChampionshipService.create(championships.get(championshipNumber));
    }

    @Then("Le Championnat renvoye possede les memes informations que Championnat{int} au delta de le identifiant renseigne")
    public void lechampionnatRenvoyePossedeLesMemesInformationsQueChampionnatAuDeltaDeLeIdentifiantRenseigne(int championshipNumber) {
        StepVerifier.create(championshipEntityMono).assertNext(
                c -> assertAll("Le championnat renvoyé ne possède pas les champs attendus",
                        () -> assertNotNull(c.getId()),
                        () -> assertEquals(championships.get(championshipNumber).getEndDate().toString(), c.getEndDate().toString()),
                        () -> assertEquals(championships.get(championshipNumber).getName(), c.getName()),
                        () -> assertEquals(championships.get(championshipNumber).getRanking(), c.getRanking()),
                        () -> assertEquals(championships.get(championshipNumber).getRounds(), c.getRounds()),
                        () -> assertEquals(championships.get(championshipNumber).getStartDate(), c.getStartDate()),
                        () -> assertEquals(ChampionshipStateEnumEntity.PLANNED, c.getState())
                )
        ).verifyComplete();
    }

    @Given("Une base de donnees ne contenant aucun Championnat existe")
    public void une_base_de_donnees_ne_contenant_aucun_championnat_existe() {
        // Write code here that turns the phrase above into concrete actions
        championshipRepository.deleteAll();;
    }
}

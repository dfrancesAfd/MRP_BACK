package com.mrp.app.api;

import com.mrp.app.api.generator.ApiControllerGenerator;
import com.mrp.app.domain.championship.generator.DomainChampionshipGenerator;
import com.mrp.app.domain.championship.model.ChampionshipEntity;
import com.mrp.app.domain.championship.model.PersonEntity;
import com.mrp.app.domain.championship.model.RankEntity;
import com.mrp.app.domain.championship.model.RoundEntity;
import com.mrp.app.domain.championship.service.ChampionshipRepository;
import com.mrp.app.domain.championship.service.CreateChampionshipService;
import com.mrp.app.domain.model.*;
import io.cucumber.messages.internal.com.google.gson.Gson;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;
import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@WebFluxTest
public class CreateChampionshipTest {

    @Autowired
    private WebTestClient client;

    @SpyBean
    private CreateChampionshipService createChampionshipService;

    @MockBean
    private ChampionshipRepository championshipRepository;

    private boolean checkRounds(ArrayList<RoundEntity> roundEntities, ArrayList<Round> rounds) {
        if (rounds.size() > 0) {
            for (int i = 0; i < rounds.size(); i++) {
                if (!rounds.get(i).getDate().equals(roundEntities.get(i).getDate().toString())) {
                    return false;
                }
                if(!checkPersons(roundEntities.get(i).getAttendees(), new ArrayList<>(rounds.get(i).getAttendees()))){
                    return false;
                }
                if(!checkPersons(roundEntities.get(i).getPlayers(), new ArrayList<>(rounds.get(i).getPlayers()))){
                    return false;
                }
                if(!checkRanking(roundEntities.get(i).getRanking(), new ArrayList<>(rounds.get(i).getRanking()))){
                    return false;
                }
            }

        } else {
            return roundEntities.size() <= 0;
        }
        return true;
    }

    private boolean checkRanking(ArrayList<RankEntity> rankEntities, ArrayList<Rank> ranks) {
        if (ranks.size() > 0) {
            for (int i = 0; i < ranks.size(); i++) {
                if (!Long.valueOf(ranks.get(i).getRank()).equals(rankEntities.get(i).getRank())) {
                    return false;
                }
                if (!ranks.get(i).getPoints().equals(rankEntities.get(i).getPoints())) {
                    return false;
                }
                if (!ranks.get(i).getAttendee().getPhoneNumber().equals(rankEntities.get(i).getAttendee().getPhoneNumber())) {
                    return false;
                }
                if (!ranks.get(i).getAttendee().getPseudo().equals(rankEntities.get(i).getAttendee().getPseudo())) {
                    return false;
                }
                if (!ranks.get(i).getAttendee().getEmail().equals(rankEntities.get(i).getAttendee().getEmail())) {
                    return false;
                }
                if (!ranks.get(i).getAttendee().getFirstName().equals(rankEntities.get(i).getAttendee().getFirstName())) {
                    return false;
                }
                if (!ranks.get(i).getAttendee().getLastName().equals(rankEntities.get(i).getAttendee().getLastName())) {
                    return false;
                }
            }

        } else {
            return rankEntities.size() <= 0;
        }
        return true;
    }

    private boolean checkPersons(ArrayList<PersonEntity> personEntities, ArrayList<Person> people) {
        if (people.size() > 0) {
            for (int i = 0; i < people.size(); i++) {
                if (!people.get(i).getEmail().equals(personEntities.get(i).getEmail())) {
                    return false;
                }
                if (!people.get(i).getFirstName().equals(personEntities.get(i).getFirstName())) {
                    return false;
                }
                if (!people.get(i).getLastName().equals(personEntities.get(i).getLastName())) {
                    return false;
                }
                if (!people.get(i).getPseudo().equals(personEntities.get(i).getPseudo())) {
                    return false;
                }
                if (!people.get(i).getPhoneNumber().equals(personEntities.get(i).getPhoneNumber())) {
                    return false;
                }
            }

        } else {
            return personEntities.size() <= 0;
        }
        return true;
    }

    @Test
    void create() {
        //Generate a DTO
        ApiControllerGenerator apiControllerGenerator = new ApiControllerGenerator();
        ChampionshipToCreateDTO championshipToCreateDTO = apiControllerGenerator.generateChampionshipToCreate();
        //Generate service return
        DomainChampionshipGenerator domainChampionshipGenerator = new DomainChampionshipGenerator();
        ChampionshipEntity championshipEntity = domainChampionshipGenerator.generateChampionship();
        //Mock service
        Mockito.doReturn(Mono.just(championshipEntity)).when(createChampionshipService).create(any(ChampionshipEntity.class));


        //Call API
        Gson jsonCreate = new Gson();
        WebTestClient.ResponseSpec clientResponse = client.post().uri("/v2/championships")
                .contentType(MediaType.APPLICATION_JSON)
                .bodyValue(jsonCreate.toJson(championshipToCreateDTO))
                .exchange();
        //Check service call
        verify(createChampionshipService, times(1)).create(any(ChampionshipEntity.class));
        //Check return code
        clientResponse.expectStatus().isCreated();
        //Check mapper to DTO
        clientResponse.expectBody(ChampionshipDTO.class).value(dto ->
                assertAll("L'évement renvoyé ne possède pas les champs attendus",
                        () -> assertEquals(championshipEntity.getState().toString(), dto.getState().toString()),
                        () -> assertEquals(championshipEntity.getStartDate().toString(), dto.getStartDate()),
                        () -> assertEquals(championshipEntity.getName(), dto.getName()),
                        () -> assertEquals(championshipEntity.getEndDate().toString(), dto.getEndDate()),
                        () -> assertEquals(championshipEntity.getId(), dto.getId()),
                        () -> assertThat("Rounds KO", checkRounds(championshipEntity.getRounds(), new ArrayList<>(dto.getRounds()))),
                        () -> assertThat("Ranking KO", checkRanking(championshipEntity.getRanking(), new ArrayList<>(dto.getRanking())))
                )
        );

    }
}

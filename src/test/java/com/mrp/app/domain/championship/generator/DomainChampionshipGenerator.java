package com.mrp.app.domain.championship.generator;

import com.mrp.app.domain.championship.model.*;
import com.mrp.app.domain.model.Person;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;

public class DomainChampionshipGenerator {

    public ChampionshipEntity generateChampionship() {
        ChampionshipEntity championshipEntity = new ChampionshipEntity();
        championshipEntity.setName("Championnat MRP #1");
        championshipEntity.setStartDate((LocalDateTime.of(2023, 06, 14, 8, 0, 0, 0).atOffset(ZoneOffset.UTC)));
        championshipEntity.setEndDate((LocalDateTime.of(2023, 06, 14, 8, 0, 0, 0).atOffset(ZoneOffset.UTC)));
        championshipEntity.setState(ChampionshipStateEnumEntity.FINISHED);

        RoundEntity roundEntity1 = generateRoundEntity();
        RoundEntity roundEntity2 = generateRoundEntity();
        roundEntity2.setDate((LocalDateTime.of(2024, 06, 14, 8, 0, 0, 0).atOffset(ZoneOffset.UTC)));
        ArrayList<RoundEntity> roundEntities = new ArrayList<>();
        roundEntities.add(roundEntity1);
        roundEntities.add(roundEntity2);
        championshipEntity.setRounds(roundEntities);

        ArrayList<RankEntity> rankEntities = new ArrayList<>();
        RankEntity rankEntity1 = generateRankEntity();
        RankEntity rankEntity2 = generateRankEntity();
        rankEntity2.setRank(Long.valueOf(2));
        rankEntities.add(rankEntity1);
        rankEntities.add(rankEntity2);
        championshipEntity.setRanking(rankEntities);
        return championshipEntity;
    }

    public RoundEntity generateRoundEntity(){
        RoundEntity roundEntity = new RoundEntity();
        roundEntity.setDate((LocalDateTime.of(2023, 06, 14, 8, 0, 0, 0).atOffset(ZoneOffset.UTC)));

        PersonEntity personEntity1 = generatePersonEntity();
        PersonEntity personEntity2 = generatePersonEntity();
        personEntity2.setPseudo("Segmentation");
        ArrayList<PersonEntity> personEntities = new ArrayList<>();
        personEntities.add(personEntity1);
        personEntities.add(personEntity2);
        roundEntity.setAttendees(personEntities);

        roundEntity.setPlayers(personEntities);

        ArrayList<RankEntity> rankEntities = new ArrayList<>();
        RankEntity rankEntity1 = generateRankEntity();
        RankEntity rankEntity2 = generateRankEntity();
        rankEntity2.setRank(Long.valueOf(2));
        rankEntities.add(rankEntity1);
        rankEntities.add(rankEntity2);
        roundEntity.setRanking(rankEntities);


        return roundEntity;
    }

    public PersonEntity generatePersonEntity(){
        PersonEntity personEntity = new PersonEntity();
        personEntity.setEmail("dfrances@afdtech.com");
        personEntity.setFirstName("Damien");
        personEntity.setLastName("Frances");
        personEntity.setPseudo("SegPro");
        personEntity.setPhoneNumber("0620543289");
        return personEntity;
    }

    public RankEntity generateRankEntity(){
        RankEntity rankEntity = new RankEntity();
        rankEntity.setRank(Long.valueOf(1));
        rankEntity.setPoints(BigDecimal.valueOf(55.3));

        PersonEntity personEntity1 = generatePersonEntity();
        rankEntity.setAttendee(personEntity1);

        return rankEntity;
    }
}

package com.mrp.app.port.mongo.mapper;

import com.mrp.app.domain.championship.model.ChampionshipEntity;
import com.mrp.app.domain.championship.model.PersonEntity;
import com.mrp.app.domain.championship.model.RankEntity;
import com.mrp.app.domain.championship.model.RoundEntity;
import com.mrp.app.port.mongo.document.ChampionshipDocument;
import com.mrp.app.port.mongo.document.PersonDocument;
import com.mrp.app.port.mongo.document.RankDocument;
import com.mrp.app.port.mongo.document.RoundDocument;

import java.util.ArrayList;

public class ChampionshipDocumentToChampionshipEntityMapper {

    public void championshipDocumentToChampionshipEntity(ChampionshipDocument championshipDocument, ChampionshipEntity championshipEntity){
        championshipEntity.setId(championshipDocument.getId());
        championshipEntity.setName(championshipDocument.getName());
        championshipEntity.setStartDate(championshipDocument.getStartDate());
        championshipEntity.setEndDate(championshipDocument.getEndDate());
        championshipEntity.setRanking(rankDocumentListToRankEntityList(championshipDocument.getRanking()));
        championshipEntity.setRounds(roundDocumentListToRoundEntityList(championshipDocument.getRounds()));
        championshipEntity.setState(championshipDocument.getState());
    }

    public RankEntity rankDocumentToRankEntity(RankDocument rankDocument){
        RankEntity rankEntity = new RankEntity();
        rankEntity.setRank(rankDocument.getRank());
        rankEntity.setAttendee(personDocumentToPersonEntity(rankDocument.getAttendee()));
        rankEntity.setPoints(rankDocument.getPoints());
        return rankEntity;
    }

    public ArrayList<RankEntity> rankDocumentListToRankEntityList(ArrayList<RankDocument> rankDocumentArrayList){
        ArrayList<RankEntity> rankEntityArrayList = new ArrayList<>();
        rankDocumentArrayList.forEach(rankDocument -> {
            rankEntityArrayList.add(rankDocumentToRankEntity(rankDocument));
        });
        return rankEntityArrayList;
    }

    public PersonEntity personDocumentToPersonEntity(PersonDocument personDocument){
        PersonEntity personEntity = new PersonEntity();
        personEntity.setEmail(personDocument.getEmail());
        personEntity.setFirstName(personDocument.getFirstName());
        personEntity.setLastName(personDocument.getLastName());
        personEntity.setPseudo(personDocument.getPseudo());
        personEntity.setPhoneNumber(personDocument.getPhoneNumber());
        return personEntity;
    }
    
    public ArrayList<PersonEntity> personDocumentListToPersonEntityList(ArrayList<PersonDocument> personDocumentArrayList){
        ArrayList<PersonEntity> personEntityArrayList = new ArrayList<>();
        personDocumentArrayList.forEach(personDocument -> {
            personEntityArrayList.add(personDocumentToPersonEntity(personDocument));
        });
        return personEntityArrayList;
    }
    
    public RoundEntity roundDocumentToRoundEntity(RoundDocument roundDocument){
        RoundEntity roundEntity = new RoundEntity();
        roundEntity.setRanking(rankDocumentListToRankEntityList(roundDocument.getRanking()));
        roundEntity.setAttendees(personDocumentListToPersonEntityList(roundDocument.getAttendees()));
        roundEntity.setDate(roundDocument.getDate());
        roundEntity.setPlayers(personDocumentListToPersonEntityList(roundDocument.getPlayers()));
        return roundEntity;
    }

    public ArrayList<RoundEntity> roundDocumentListToRoundEntityList(ArrayList<RoundDocument> roundDocumentArrayList){
        ArrayList<RoundEntity> roundEntityArrayList = new ArrayList<>();
        roundDocumentArrayList.forEach(roundDocument -> {
            roundEntityArrayList.add(roundDocumentToRoundEntity(roundDocument));
        });
        return roundEntityArrayList;
    }
}

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

public class ChampionshipEntityToChampionshipDocumentMapper {

    public ChampionshipDocument championshipEntityToChampionshipDocument(ChampionshipEntity championshipEntity){
        ChampionshipDocument championshipDocument = new ChampionshipDocument();
        if(championshipEntity.getId() != null)
            championshipDocument.setId(championshipEntity.getId());
        championshipDocument.setName(championshipEntity.getName());
        championshipDocument.setStartDate(championshipEntity.getStartDate());
        championshipDocument.setEndDate(championshipEntity.getEndDate());
        championshipDocument.setRanking(rankEntityListToRankDocumentList(championshipEntity.getRanking()));
        championshipDocument.setRounds(roundEntityListToRoundDocumentList(championshipEntity.getRounds()));
        championshipDocument.setState(championshipEntity.getState());
        return championshipDocument;
    }

    public RankDocument rankEntityToRankDocument(RankEntity rankEntity){
        RankDocument rankDocument = new RankDocument();
        rankDocument.setRank(rankEntity.getRank());
        rankDocument.setAttendee(personEntityToPersonDocument(rankEntity.getAttendee()));
        rankDocument.setPoints(rankEntity.getPoints());
        return rankDocument;
    }

    public ArrayList<RankDocument> rankEntityListToRankDocumentList(ArrayList<RankEntity> rankEntityArrayList){
        ArrayList<RankDocument> rankDocumentArrayList = new ArrayList<>();
        rankEntityArrayList.forEach(rankEntity -> {
            rankDocumentArrayList.add(rankEntityToRankDocument(rankEntity));
        });
        return rankDocumentArrayList;
    }

    public PersonDocument personEntityToPersonDocument(PersonEntity personEntity){
        PersonDocument personDocument = new PersonDocument();
        personDocument.setEmail(personEntity.getEmail());
        personDocument.setFirstName(personEntity.getFirstName());
        personDocument.setLastName(personEntity.getLastName());
        personDocument.setPseudo(personEntity.getPseudo());
        personDocument.setPhoneNumber(personEntity.getPhoneNumber());
        return personDocument;
    }

    public ArrayList<PersonDocument> personEntityListToPersonDocumentList(ArrayList<PersonEntity> personEntityArrayList){
        ArrayList<PersonDocument> personDocumentArrayList = new ArrayList<>();
        personEntityArrayList.forEach(personEntity -> {
            personDocumentArrayList.add(personEntityToPersonDocument(personEntity));
        });
        return personDocumentArrayList;
    }

    public RoundDocument roundEntityToRoundDocument(RoundEntity roundEntity){
        RoundDocument roundDocument = new RoundDocument();
        roundDocument.setRanking(rankEntityListToRankDocumentList(roundEntity.getRanking()));
        roundDocument.setAttendees(personEntityListToPersonDocumentList(roundEntity.getAttendees()));
        roundDocument.setDate(roundEntity.getDate());
        roundDocument.setPlayers(personEntityListToPersonDocumentList(roundEntity.getPlayers()));
        return roundDocument;
    }

    public ArrayList<RoundDocument> roundEntityListToRoundDocumentList(ArrayList<RoundEntity> roundEntityArrayList){
        ArrayList<RoundDocument> roundDocumentArrayList = new ArrayList<>();
        roundEntityArrayList.forEach(roundEntity -> {
            roundDocumentArrayList.add(roundEntityToRoundDocument(roundEntity));
        });
        return roundDocumentArrayList;
    }
}

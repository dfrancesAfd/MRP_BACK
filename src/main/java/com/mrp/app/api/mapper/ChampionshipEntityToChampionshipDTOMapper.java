package com.mrp.app.api.mapper;

import com.mrp.app.domain.championship.model.ChampionshipEntity;
import com.mrp.app.domain.championship.model.PersonEntity;
import com.mrp.app.domain.championship.model.RankEntity;
import com.mrp.app.domain.championship.model.RoundEntity;
import com.mrp.app.domain.model.*;


import java.time.OffsetDateTime;
import java.util.ArrayList;

public class ChampionshipEntityToChampionshipDTOMapper {

    public ChampionshipDTO championshipEntityToChampionshipDTO(ChampionshipEntity championshipEntity){
        ChampionshipDTO championshipDTO = new ChampionshipDTO();
        if(championshipEntity.getId() != null)
            championshipDTO.setId(championshipEntity.getId());
        championshipDTO.setName(championshipEntity.getName());
        championshipDTO.setStartDate(championshipEntity.getStartDate().toString());
        championshipDTO.setEndDate(championshipEntity.getEndDate().toString());
        championshipDTO.setRanking(rankEntityListToRankList(championshipEntity.getRanking()));
        championshipDTO.setRounds(roundEntityListToRoundList(championshipEntity.getRounds()));
        championshipDTO.setState(ChampionshipState.valueOf(championshipEntity.getState().toString()));
        return championshipDTO;
    }

    public Rank rankEntityToRank(RankEntity rankEntity){
        Rank rankDTO = new Rank();
        rankDTO.setRank(Math.toIntExact(rankEntity.getRank()));
        rankDTO.setAttendee(personEntityToPerson(rankEntity.getAttendee()));
        rankDTO.setPoints(rankEntity.getPoints());
        return rankDTO;
    }

    public ArrayList<Rank> rankEntityListToRankList(ArrayList<RankEntity> rankEntityArrayList){
        ArrayList<Rank> rankDTOArrayList = new ArrayList<>();
        rankEntityArrayList.forEach(rankEntity -> {
            rankDTOArrayList.add(rankEntityToRank(rankEntity));
        });
        return rankDTOArrayList;
    }

    public Person personEntityToPerson(PersonEntity personEntity){
        Person personDTO = new Person();
        personDTO.setEmail(personEntity.getEmail());
        personDTO.setFirstName(personEntity.getFirstName());
        personDTO.setLastName(personEntity.getLastName());
        personDTO.setPseudo(personEntity.getPseudo());
        personDTO.setPhoneNumber(personEntity.getPhoneNumber());
        return personDTO;
    }

    public ArrayList<Person> personEntityListToPersonList(ArrayList<PersonEntity> personEntityArrayList){
        ArrayList<Person> personDTOArrayList = new ArrayList<>();
        personEntityArrayList.forEach(personEntity -> {
            personDTOArrayList.add(personEntityToPerson(personEntity));
        });
        return personDTOArrayList;
    }

    public Round roundEntityToRound(RoundEntity roundEntity){
        Round roundDTO = new Round();
        roundDTO.setRanking(rankEntityListToRankList(roundEntity.getRanking()));
        roundDTO.setAttendees(personEntityListToPersonList(roundEntity.getAttendees()));
        roundDTO.setDate(roundEntity.getDate().toString());
        roundDTO.setPlayers(personEntityListToPersonList(roundEntity.getPlayers()));
        return roundDTO;
    }

    public ArrayList<Round> roundEntityListToRoundList(ArrayList<RoundEntity> roundEntityArrayList){
        ArrayList<Round> roundDTOArrayList = new ArrayList<>();
        roundEntityArrayList.forEach(roundEntity -> {
            roundDTOArrayList.add(roundEntityToRound(roundEntity));
        });
        return roundDTOArrayList;
    }
}

package com.mrp.app.domain.championship.service;

import com.mrp.app.domain.championship.model.ChampionshipEntity;
import com.mrp.app.domain.championship.model.ChampionshipStateEnumEntity;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.ArrayList;

@Service
public class CreateChampionshipService {
    private final ChampionshipRepository championshipRepository;

    public CreateChampionshipService(ChampionshipRepository championshipRepository) {
        this.championshipRepository = championshipRepository;
    }

    public Mono<ChampionshipEntity> create(ChampionshipEntity championship){
        championship.setState(ChampionshipStateEnumEntity.PLANNED);
        championship.setRanking(new ArrayList<>());
        championship.setRounds(new ArrayList<>());
        Mono<ChampionshipEntity> championshipEntityMono = championshipRepository.create(championship);
        return championshipEntityMono;
    }


}

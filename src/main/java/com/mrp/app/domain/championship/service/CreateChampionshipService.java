package com.mrp.app.domain.championship.service;

import com.mrp.app.domain.championship.repository.mongo.ChampionshipRepository;
import org.springframework.stereotype.Service;

@Service
public class CreateChampionshipService {
    private final ChampionshipRepository championshipRepository;

    public CreateChampionshipService(ChampionshipRepository championshipRepository) {
        this.championshipRepository = championshipRepository;
    }


}

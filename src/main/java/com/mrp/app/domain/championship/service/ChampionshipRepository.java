package com.mrp.app.domain.championship.service;

import com.mrp.app.domain.championship.model.ChampionshipEntity;
import reactor.core.publisher.Mono;

public interface ChampionshipRepository {

    Mono<Void> deleteAll();

    Mono<ChampionshipEntity> create(ChampionshipEntity championship);


}

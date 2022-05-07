package com.mrp.app.domain.championship.repository.mongo;

import com.mrp.app.domain.championship.model.Championship;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ChampionshipRepository {

    Mono<Void> deleteAll();


}

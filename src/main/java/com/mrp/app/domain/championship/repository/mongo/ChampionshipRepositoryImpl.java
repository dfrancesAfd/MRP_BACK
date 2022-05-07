package com.mrp.app.domain.championship.repository.mongo;

import com.mrp.app.domain.championship.repository.mongo.ChampionshipRepository;
import lombok.AllArgsConstructor;
import org.bson.types.ObjectId;
import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static java.util.stream.Collectors.toList;

@Component
@AllArgsConstructor
public class ChampionshipRepositoryImpl  implements ChampionshipRepository {

    private final ReactiveChampionshipMongoRepository reactiveEventMongoRepository;
    @Override
    public Mono<Void> deleteAll() {
        return reactiveEventMongoRepository.deleteAll();
    }
}
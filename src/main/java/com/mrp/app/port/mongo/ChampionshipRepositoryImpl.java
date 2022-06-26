package com.mrp.app.port.mongo;

import com.mrp.app.domain.championship.model.ChampionshipEntity;
import com.mrp.app.domain.championship.service.ChampionshipRepository;
import com.mrp.app.port.mongo.document.ChampionshipDocument;
import com.mrp.app.port.mongo.mapper.ChampionshipDocumentToChampionshipEntityMapper;
import com.mrp.app.port.mongo.mapper.ChampionshipEntityToChampionshipDocumentMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
@AllArgsConstructor
public class ChampionshipRepositoryImpl  implements ChampionshipRepository {

    private final ReactiveChampionshipMongoRepository reactiveEventMongoRepository;
    @Override
    public Mono<Void> deleteAll() {
        return reactiveEventMongoRepository.deleteAll();
    }

    @Override
    public Mono<ChampionshipEntity> create(ChampionshipEntity championshipEntity){
        ChampionshipEntityToChampionshipDocumentMapper championshipEntityToChampionshipDocumentMapper = new ChampionshipEntityToChampionshipDocumentMapper();
        Mono<ChampionshipDocument> championshipDocumentMono = reactiveEventMongoRepository.insert(championshipEntityToChampionshipDocumentMapper.championshipEntityToChampionshipDocument(championshipEntity));
        return convert(championshipDocumentMono);

    }

    private Mono<ChampionshipEntity> convert(Mono<ChampionshipDocument> championshipDocumentMono) {
        ChampionshipDocumentToChampionshipEntityMapper championshipDocumentToChampionshipEntityMapper = new ChampionshipDocumentToChampionshipEntityMapper();
        championshipDocumentMono.subscribe();
        return championshipDocumentMono.flatMap(championshipDocument -> {
            ChampionshipEntity championshipEntity = new ChampionshipEntity();
            championshipDocumentToChampionshipEntityMapper.championshipDocumentToChampionshipEntity(championshipDocument, championshipEntity);
            return Mono.just(championshipEntity);
        });
    }
}
package com.mrp.app.domain.championship.repository.mongo;


import com.mrp.app.domain.championship.repository.mongo.ChampionshipDocument;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface ReactiveChampionshipMongoRepository extends ReactiveMongoRepository<ChampionshipDocument, ObjectId> {


}
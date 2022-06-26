package com.mrp.app.port.mongo;


import com.mrp.app.port.mongo.document.ChampionshipDocument;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReactiveChampionshipMongoRepository extends ReactiveMongoRepository<ChampionshipDocument, ObjectId> {


}
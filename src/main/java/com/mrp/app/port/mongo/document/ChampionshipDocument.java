package com.mrp.app.port.mongo.document;

import com.mrp.app.domain.championship.model.ChampionshipStateEnumEntity;
import com.mrp.app.domain.championship.model.RoundEntity;
import com.mrp.app.domain.model.Rank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "championship")
public class ChampionshipDocument {
    @Id
    private String id;
    private String name;
    private String startDate;
    private String endDate;
    private ChampionshipStateEnumEntity state;
    private ArrayList<RoundDocument> rounds;
    private ArrayList<RankDocument> ranking;
}

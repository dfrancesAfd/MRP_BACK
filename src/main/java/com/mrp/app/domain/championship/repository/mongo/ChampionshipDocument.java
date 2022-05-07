package com.mrp.app.domain.championship.repository.mongo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "championship")
public class ChampionshipDocument {
    private String id;
    private String name;
    private String startDate;
    private String endDate;
}

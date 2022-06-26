package com.mrp.app.domain.championship.model;

import com.mrp.app.domain.model.Rank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChampionshipEntity {
    private String id;
    private String name;
    private OffsetDateTime startDate;
    private OffsetDateTime endDate;
    private ChampionshipStateEnumEntity state;
    private ArrayList<RoundEntity> rounds;
    private ArrayList<RankEntity> ranking;

}

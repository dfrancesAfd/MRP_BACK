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
public class RoundEntity {
    private OffsetDateTime date;
    private ArrayList<PersonEntity> attendees;
    private ArrayList<PersonEntity> players;
    private ArrayList<RankEntity> ranking;

}

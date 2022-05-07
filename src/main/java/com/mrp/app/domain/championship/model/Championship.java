package com.mrp.app.domain.championship.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Championship {
    private String id;
    private String name;
    private String startDate;
    private String endDate;
    private ChampionshipStateEnum state;

}

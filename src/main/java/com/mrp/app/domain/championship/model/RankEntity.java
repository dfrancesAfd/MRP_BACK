package com.mrp.app.domain.championship.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RankEntity {
    private Long rank;
    private Float points;
    private PersonEntity attendee;
}

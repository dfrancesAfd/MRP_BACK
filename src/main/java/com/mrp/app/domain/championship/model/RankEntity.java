package com.mrp.app.domain.championship.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RankEntity {
    private Long rank;
    private BigDecimal points;
    private PersonEntity attendee;
}

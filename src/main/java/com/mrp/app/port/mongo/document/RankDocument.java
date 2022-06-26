package com.mrp.app.port.mongo.document;

import com.mrp.app.domain.championship.model.PersonEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RankDocument {
    private Long rank;
    private BigDecimal points;
    private PersonDocument attendee;
}

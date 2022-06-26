package com.mrp.app.port.mongo.document;

import com.mrp.app.domain.championship.model.PersonEntity;
import com.mrp.app.domain.model.Rank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoundDocument {
    private OffsetDateTime date;
    private ArrayList<PersonDocument> attendees;
    private ArrayList<PersonDocument> players;
    private ArrayList<RankDocument> ranking;

}

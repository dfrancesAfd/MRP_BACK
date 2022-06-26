package com.mrp.app.api;

import com.mrp.app.api.mapper.ChampionshipDTOToChampionshipEntityMapper;
import com.mrp.app.api.mapper.ChampionshipEntityToChampionshipDTOMapper;
import com.mrp.app.domain.championship.model.ChampionshipEntity;
import com.mrp.app.domain.championship.service.CreateChampionshipService;
import com.mrp.app.domain.model.ChampionshipDTO;
import com.mrp.app.domain.model.ChampionshipToCreateDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@RestController
public class ChampionshipApiController implements ChampionshipsApiDelegate{

    private final ChampionshipDTOToChampionshipEntityMapper championshipDTOToChampionshipEntityMapper = new ChampionshipDTOToChampionshipEntityMapper();
    private final ChampionshipEntityToChampionshipDTOMapper championshipEntityToChampionshipDTOMapper = new ChampionshipEntityToChampionshipDTOMapper();

    @Autowired
    private CreateChampionshipService createChampionshipService;

    @Override
    public Mono<ResponseEntity<ChampionshipDTO>> championshipsPost(Mono<ChampionshipToCreateDTO> championshipToCreateDTO, ServerWebExchange exchange) {
        return championshipToCreateDTO.flatMap(dto -> {
            ChampionshipEntity championshipEntity = championshipDTOToChampionshipEntityMapper.championshipToCreateDTOToChampionshipEntity(dto);
            Mono<ChampionshipEntity> championshipEntityMono = createChampionshipService.create(championshipEntity);

            return championshipEntityMono.flatMap(entity -> {
                ChampionshipDTO championshipDTO = championshipEntityToChampionshipDTOMapper.championshipEntityToChampionshipDTO(entity);
                return Mono.just(new ResponseEntity<>(championshipDTO, HttpStatus.CREATED));
            });

        });
    }



}

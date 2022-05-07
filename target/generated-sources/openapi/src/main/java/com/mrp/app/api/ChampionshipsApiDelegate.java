package com.mrp.app.api;

import com.mrp.app.domain.model.ChampionshipDTO;
import com.mrp.app.domain.model.ChampionshipToCreateDTO;
import com.mrp.app.domain.model.RankingToCreateDTO;
import com.mrp.app.domain.model.RoundToCreateDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import org.springframework.http.codec.multipart.Part;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * A delegate to be called by the {@link ChampionshipsApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-07T23:29:09.273407+02:00[Europe/Paris]")
public interface ChampionshipsApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /championships : Get championship list
     *
     * @return successful operation (status code 200)
     * @see ChampionshipsApi#championshipsGet
     */
    default Mono<ResponseEntity<Flux<ChampionshipDTO>>> championshipsGet(ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        for (MediaType mediaType : exchange.getRequest().getHeaders().getAccept()) {
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"endDate\" : \"2000-01-23T04:56:07.000+00:00\", \"name\" : \"name\", \"ranking\" : [ { \"attendee\" : { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" }, \"rank\" : 0, \"points\" : 6 }, { \"attendee\" : { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" }, \"rank\" : 0, \"points\" : 6 } ], \"id\" : \"id\", \"startDate\" : \"2000-01-23T04:56:07.000+00:00\", \"rounds\" : [ { \"date\" : \"2000-01-23T04:56:07.000+00:00\", \"attendees\" : [ { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" }, { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" } ], \"players\" : [ { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" }, { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" } ], \"ranking\" : [ { \"attendee\" : { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" }, \"rank\" : 0, \"points\" : 6 }, { \"attendee\" : { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" }, \"rank\" : 0, \"points\" : 6 } ] }, { \"date\" : \"2000-01-23T04:56:07.000+00:00\", \"attendees\" : [ { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" }, { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" } ], \"players\" : [ { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" }, { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" } ], \"ranking\" : [ { \"attendee\" : { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" }, \"rank\" : 0, \"points\" : 6 }, { \"attendee\" : { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" }, \"rank\" : 0, \"points\" : 6 } ] } ] }";
                result = ApiUtil.getExampleResponse(exchange, mediaType, exampleString);
                break;
            }
        }
        return result.then(Mono.empty());

    }

    /**
     * GET /championships/{idChampionship} : Get championship by id
     *
     * @param idChampionship  (required)
     * @return successful operation (status code 200)
     * @see ChampionshipsApi#championshipsIdChampionshipGet
     */
    default Mono<ResponseEntity<ChampionshipDTO>> championshipsIdChampionshipGet(String idChampionship,
        ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        for (MediaType mediaType : exchange.getRequest().getHeaders().getAccept()) {
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"endDate\" : \"2000-01-23T04:56:07.000+00:00\", \"name\" : \"name\", \"ranking\" : [ { \"attendee\" : { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" }, \"rank\" : 0, \"points\" : 6 }, { \"attendee\" : { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" }, \"rank\" : 0, \"points\" : 6 } ], \"id\" : \"id\", \"startDate\" : \"2000-01-23T04:56:07.000+00:00\", \"rounds\" : [ { \"date\" : \"2000-01-23T04:56:07.000+00:00\", \"attendees\" : [ { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" }, { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" } ], \"players\" : [ { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" }, { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" } ], \"ranking\" : [ { \"attendee\" : { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" }, \"rank\" : 0, \"points\" : 6 }, { \"attendee\" : { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" }, \"rank\" : 0, \"points\" : 6 } ] }, { \"date\" : \"2000-01-23T04:56:07.000+00:00\", \"attendees\" : [ { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" }, { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" } ], \"players\" : [ { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" }, { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" } ], \"ranking\" : [ { \"attendee\" : { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" }, \"rank\" : 0, \"points\" : 6 }, { \"attendee\" : { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" }, \"rank\" : 0, \"points\" : 6 } ] } ] }";
                result = ApiUtil.getExampleResponse(exchange, mediaType, exampleString);
                break;
            }
        }
        return result.then(Mono.empty());

    }

    /**
     * POST /championships/{idChampionship}/rounds/{idRound}/rankings : Create a ranking
     *
     * @param idChampionship  (required)
     * @param idRound  (required)
     * @param rankingToCreateDTO  (optional)
     * @return successful operation (status code 201)
     * @see ChampionshipsApi#championshipsIdChampionshipRoundsIdRoundRankingsPost
     */
    default Mono<ResponseEntity<ChampionshipDTO>> championshipsIdChampionshipRoundsIdRoundRankingsPost(String idChampionship,
        String idRound,
        Mono<RankingToCreateDTO> rankingToCreateDTO,
        ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        for (MediaType mediaType : exchange.getRequest().getHeaders().getAccept()) {
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"endDate\" : \"2000-01-23T04:56:07.000+00:00\", \"name\" : \"name\", \"ranking\" : [ { \"attendee\" : { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" }, \"rank\" : 0, \"points\" : 6 }, { \"attendee\" : { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" }, \"rank\" : 0, \"points\" : 6 } ], \"id\" : \"id\", \"startDate\" : \"2000-01-23T04:56:07.000+00:00\", \"rounds\" : [ { \"date\" : \"2000-01-23T04:56:07.000+00:00\", \"attendees\" : [ { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" }, { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" } ], \"players\" : [ { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" }, { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" } ], \"ranking\" : [ { \"attendee\" : { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" }, \"rank\" : 0, \"points\" : 6 }, { \"attendee\" : { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" }, \"rank\" : 0, \"points\" : 6 } ] }, { \"date\" : \"2000-01-23T04:56:07.000+00:00\", \"attendees\" : [ { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" }, { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" } ], \"players\" : [ { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" }, { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" } ], \"ranking\" : [ { \"attendee\" : { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" }, \"rank\" : 0, \"points\" : 6 }, { \"attendee\" : { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" }, \"rank\" : 0, \"points\" : 6 } ] } ] }";
                result = ApiUtil.getExampleResponse(exchange, mediaType, exampleString);
                break;
            }
        }
        return result.then(Mono.empty());

    }

    /**
     * POST /championships/{idChampionship}/rounds : Create a round
     *
     * @param idChampionship  (required)
     * @param roundToCreateDTO  (optional)
     * @return successful operation (status code 201)
     * @see ChampionshipsApi#championshipsIdChampionshipRoundsPost
     */
    default Mono<ResponseEntity<ChampionshipDTO>> championshipsIdChampionshipRoundsPost(String idChampionship,
        Mono<RoundToCreateDTO> roundToCreateDTO,
        ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        for (MediaType mediaType : exchange.getRequest().getHeaders().getAccept()) {
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"endDate\" : \"2000-01-23T04:56:07.000+00:00\", \"name\" : \"name\", \"ranking\" : [ { \"attendee\" : { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" }, \"rank\" : 0, \"points\" : 6 }, { \"attendee\" : { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" }, \"rank\" : 0, \"points\" : 6 } ], \"id\" : \"id\", \"startDate\" : \"2000-01-23T04:56:07.000+00:00\", \"rounds\" : [ { \"date\" : \"2000-01-23T04:56:07.000+00:00\", \"attendees\" : [ { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" }, { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" } ], \"players\" : [ { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" }, { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" } ], \"ranking\" : [ { \"attendee\" : { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" }, \"rank\" : 0, \"points\" : 6 }, { \"attendee\" : { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" }, \"rank\" : 0, \"points\" : 6 } ] }, { \"date\" : \"2000-01-23T04:56:07.000+00:00\", \"attendees\" : [ { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" }, { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" } ], \"players\" : [ { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" }, { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" } ], \"ranking\" : [ { \"attendee\" : { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" }, \"rank\" : 0, \"points\" : 6 }, { \"attendee\" : { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" }, \"rank\" : 0, \"points\" : 6 } ] } ] }";
                result = ApiUtil.getExampleResponse(exchange, mediaType, exampleString);
                break;
            }
        }
        return result.then(Mono.empty());

    }

    /**
     * POST /championships : Create a championship
     *
     * @param championshipToCreateDTO  (optional)
     * @return successful operation (status code 201)
     * @see ChampionshipsApi#championshipsPost
     */
    default Mono<ResponseEntity<ChampionshipDTO>> championshipsPost(Mono<ChampionshipToCreateDTO> championshipToCreateDTO,
        ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        for (MediaType mediaType : exchange.getRequest().getHeaders().getAccept()) {
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"endDate\" : \"2000-01-23T04:56:07.000+00:00\", \"name\" : \"name\", \"ranking\" : [ { \"attendee\" : { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" }, \"rank\" : 0, \"points\" : 6 }, { \"attendee\" : { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" }, \"rank\" : 0, \"points\" : 6 } ], \"id\" : \"id\", \"startDate\" : \"2000-01-23T04:56:07.000+00:00\", \"rounds\" : [ { \"date\" : \"2000-01-23T04:56:07.000+00:00\", \"attendees\" : [ { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" }, { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" } ], \"players\" : [ { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" }, { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" } ], \"ranking\" : [ { \"attendee\" : { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" }, \"rank\" : 0, \"points\" : 6 }, { \"attendee\" : { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" }, \"rank\" : 0, \"points\" : 6 } ] }, { \"date\" : \"2000-01-23T04:56:07.000+00:00\", \"attendees\" : [ { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" }, { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" } ], \"players\" : [ { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" }, { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" } ], \"ranking\" : [ { \"attendee\" : { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" }, \"rank\" : 0, \"points\" : 6 }, { \"attendee\" : { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"phoneNumber\" : \"phoneNumber\", \"pseudo\" : \"pseudo\", \"email\" : \"email\" }, \"rank\" : 0, \"points\" : 6 } ] } ] }";
                result = ApiUtil.getExampleResponse(exchange, mediaType, exampleString);
                break;
            }
        }
        return result.then(Mono.empty());

    }

}

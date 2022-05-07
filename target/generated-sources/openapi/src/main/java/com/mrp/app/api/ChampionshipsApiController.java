package com.mrp.app.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-07T23:29:09.273407+02:00[Europe/Paris]")
@Controller
@RequestMapping("${openapi.championnat.base-path:/v2}")
public class ChampionshipsApiController implements ChampionshipsApi {

    private final ChampionshipsApiDelegate delegate;

    public ChampionshipsApiController(@Autowired(required = false) ChampionshipsApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new ChampionshipsApiDelegate() {});
    }

    @Override
    public ChampionshipsApiDelegate getDelegate() {
        return delegate;
    }

}

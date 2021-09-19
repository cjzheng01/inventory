package org.cjzheng01.inventory.handler;

import org.cjzheng01.inventory.pojo.Gift;
import org.cjzheng01.inventory.service.RedisGiftService;
import org.springframework.http.MediaType;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserter;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;


@Component
public class GiftHandler {

    private RedisGiftService redisGiftService;

    public Mono<ServerResponse> getGift(ServerRequest request) {
        String id = request.pathVariable("id");
        return ok().contentType(APPLICATION_JSON_UTF8)
                .body(Mono.just(redisGiftService.getGift(Integer.parseInt(id)).get()), Gift.class);
    }

//    public Mono<ServerResponse> listGift(ServerRequest request) {
//
//    }


    public GiftHandler(RedisGiftService redisGiftService) {
        super();
        this.redisGiftService = redisGiftService;
    }
}

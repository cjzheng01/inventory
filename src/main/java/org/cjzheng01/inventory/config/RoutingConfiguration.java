package org.cjzheng01.inventory.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

import org.cjzheng01.inventory.handler.GiftHandler;

@Configuration
public class RoutingConfiguration {

    private GiftHandler giftHandler;

    @Bean
    public RouterFunction<ServerResponse> giftRouter() {
        return route(GET("/gift/{id}"), giftHandler::getGift);
    }


    public RoutingConfiguration(GiftHandler giftHandler) {
        this.giftHandler = giftHandler;
    }
}

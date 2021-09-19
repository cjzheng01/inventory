package org.cjzheng01.inventory.dao;

import org.cjzheng01.inventory.pojo.Gift;
import org.cjzheng01.inventory.pojo.PageInfo;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ReactorGiftDao {

    Mono<Gift> get(int id);

    Mono<Integer> add(Gift gift);

    Mono<Integer> update(Gift gift);

    Flux<Gift> list();

    Flux<Gift> like(String name, int pageNo, int pageSize);

    Mono<Integer> delete(int id);

    Mono<Integer> updateInventory(int id, int num);

    Mono<PageInfo> getPageInfo(String name, int pageNo, int pageSize);
}

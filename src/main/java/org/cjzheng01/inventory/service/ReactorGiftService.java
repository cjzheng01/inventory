package org.cjzheng01.inventory.service;

import org.cjzheng01.inventory.pojo.Gift;
import org.cjzheng01.inventory.pojo.response.CommonResponse;
import org.cjzheng01.inventory.pojo.response.DataResponse;
import org.cjzheng01.inventory.pojo.response.PageResponse;

import reactor.core.publisher.Mono;


public interface ReactorGiftService {

    Mono<CommonResponse> add(Gift gift);

    Mono<CommonResponse> update(Gift gift);

    Mono<DataResponse<Gift>> get(int id);

    Mono<PageResponse<Gift>> list(String name, int pageNo, int pageSize);

    Mono<CommonResponse> delete(int id);

    Mono<CommonResponse> updateInventory(int id, int num);
}

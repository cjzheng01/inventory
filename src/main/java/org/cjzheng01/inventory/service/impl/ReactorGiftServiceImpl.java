package org.cjzheng01.inventory.service.impl;

import org.cjzheng01.inventory.dao.ReactorGiftDao;
import org.cjzheng01.inventory.pojo.Gift;
import org.cjzheng01.inventory.pojo.PageInfo;
import org.cjzheng01.inventory.pojo.response.CommonResponse;
import org.cjzheng01.inventory.pojo.response.DataResponse;
import org.cjzheng01.inventory.pojo.response.PageResponse;
import org.cjzheng01.inventory.service.ReactorGiftService;
import org.cjzheng01.inventory.service.RedisGiftService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class ReactorGiftServiceImpl implements ReactorGiftService {

    private ReactorGiftDao reactorGiftDao;
    private RedisGiftService redisGiftService;

    @Override
    public Mono<CommonResponse> add(Gift gift) {
        return reactorGiftDao.add(gift).map(integer -> new CommonResponse());
    }

    @Override
    public Mono<CommonResponse> update(Gift gift) {
        return reactorGiftDao.update(gift).map(integer -> new CommonResponse());
    }

    @Override
    public Mono<DataResponse<Gift>> get(int id) {
        return Mono.justOrEmpty(redisGiftService.getGift(id)).map(this::giftDataResponse);
    }

    private DataResponse<Gift> giftDataResponse(Gift gift) {
        return new DataResponse<Gift>().setData(gift);
    }

    @Override
    public Mono<PageResponse<Gift>> list(String name, int pageNo, int pageSize) {
        return reactorGiftDao.like(name, pageNo, pageSize).collect(toList()).map(this::giftPageResponse)
                .flatMap(value -> reactorGiftDao.getPageInfo(name, pageNo, pageSize).map(value::setPageInfo));

    }

    private PageResponse<Gift> giftPageResponse(PageInfo pageInfo) {
        PageResponse<Gift> pageResponse = new PageResponse<>();
        pageResponse.setPageInfo(pageInfo);
        return pageResponse;
    }

    private PageResponse<Gift> giftPageResponse(List<Gift> gifts) {
        PageResponse<Gift> pageResponse = new PageResponse<>();
        pageResponse.setData(gifts);
        return pageResponse;
    }

    @Override
    public Mono<CommonResponse> delete(int id) {
        return reactorGiftDao.delete(id).map(integer -> new CommonResponse());
    }

    @Override
    public Mono<CommonResponse> updateInventory(int id, int num) {
        return reactorGiftDao.updateInventory(id, num > 0 ? num : 0).map(integer -> new CommonResponse());
    }

    public ReactorGiftServiceImpl(ReactorGiftDao reactorGiftDao, RedisGiftService redisGiftService) {
        super();
        this.reactorGiftDao = reactorGiftDao;
        this.redisGiftService = redisGiftService;
    }
}

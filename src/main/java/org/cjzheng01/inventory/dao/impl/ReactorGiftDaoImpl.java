package org.cjzheng01.inventory.dao.impl;

import org.cjzheng01.inventory.dao.GiftDao;
import org.cjzheng01.inventory.dao.ReactorGiftDao;
import org.cjzheng01.inventory.pojo.Gift;
import org.cjzheng01.inventory.pojo.PageInfo;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public class ReactorGiftDaoImpl implements ReactorGiftDao {

    private GiftDao giftDao;

    @Override
    public Mono<Gift> get(int id) {
        return Mono.justOrEmpty(giftDao.get(id));
    }

    @Override
    public Mono<Integer> add(Gift gift) {
        return Mono.just(giftDao.create(gift)).map(b -> b ? 1 : 0);
    }

    @Override
    public Mono<Integer> update(Gift gift) {
        return Mono.just(giftDao.edit(gift)).map(b -> b ? 1 : 0);
    }

    @Override
    public Flux<Gift> list() {
        return Flux.fromIterable(giftDao.list());
    }

    @Override
    public Flux<Gift> like(String name, int pageNo, int pageSize) {
        return Flux.fromIterable(giftDao.like(name, pageNo, pageSize));
    }

    @Override
    public Mono<PageInfo> getPageInfo(String name, int pageNo, int pageSize) {
        return Mono.justOrEmpty(giftDao.likeCount(name)).switchIfEmpty(Mono.just(0)).map(integer -> new PageInfo()
                .setCurrentPage(pageNo)
                .setPageSize(pageSize)
                .setTotalResult(integer)
                .setTotalPage(integer % pageSize == 0 ? integer / pageSize : integer / pageSize + 1));
    }


    @Override
    public Mono<Integer> delete(int id) {
        return Mono.just(giftDao.delete(giftDao.delete(id)));
    }

    @Override
    public Mono<Integer> updateInventory(int id, int num) {
        return Mono.just(giftDao.updateInventory(id, num));
    }

    public ReactorGiftDaoImpl(GiftDao giftDao) {
        super();
        this.giftDao = giftDao;
    }
}

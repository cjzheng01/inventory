package org.cjzheng01.inventory.service;

import java.util.Optional;

import org.cjzheng01.inventory.pojo.Gift;
import org.cjzheng01.inventory.pojo.RedisGift;


public interface RedisGiftService {

    Optional<RedisGift> getGift(int id);

    Gift doGetGift(int id);

    void saveGift(RedisGift gift);
}

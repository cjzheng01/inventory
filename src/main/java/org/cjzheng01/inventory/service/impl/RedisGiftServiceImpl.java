package org.cjzheng01.inventory.service.impl;

import org.cjzheng01.inventory.constants.CommonConstants;
import org.cjzheng01.inventory.dao.GiftDao;
import org.cjzheng01.inventory.pojo.Gift;
import org.cjzheng01.inventory.pojo.RedisGift;
import org.cjzheng01.inventory.service.RedisGiftService;
import org.cjzheng01.inventory.service.RedisService;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Objects;
import java.util.Optional;

@Service
public class RedisGiftServiceImpl implements RedisGiftService {

    private RedisService redisService;
    private GiftDao giftDao;

    @Override
    public Optional<RedisGift> getGift(int id) {
        Object object = redisService.get(String.format(CommonConstants.KEY_GIFT, id));
        if (Objects.nonNull(object) && object instanceof  RedisGift) {
            return Optional.of((RedisGift)object);
        } else {
            Gift gift = giftDao.get(id);
            if (Objects.isNull(gift)) {
                return Optional.empty();
            }
            RedisGift redisGift = RedisGift.build(gift);
            redisGift.setNewFlag(true);
            saveGift(redisGift);
            return Optional.ofNullable(redisGift);
        }
    }

    public Gift doGetGift(int id) {
        Object object = redisService.get(String.format(CommonConstants.KEY_GIFT, id));
        if (Objects.nonNull(object) && object instanceof Gift) {
            return (Gift)object;
        } else {
            return null;
        }
    }

    @Override
    public void saveGift(RedisGift gift) {
        Assert.notNull(gift, "'gift' is required");
        redisService.set(String.format(CommonConstants.KEY_GIFT, gift.getId()), gift);
    }

    public RedisGiftServiceImpl(RedisService redisService, GiftDao giftDao) {
        super();
        this.redisService = redisService;
        this.giftDao = giftDao;
    }
}

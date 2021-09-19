package org.cjzheng01.inventory.service.impl;

import org.cjzheng01.inventory.dao.GiftDao;
import org.cjzheng01.inventory.pojo.Gift;
import org.cjzheng01.inventory.service.GiftService;
import org.cjzheng01.inventory.service.RedisGiftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GiftServiceImpl implements GiftService {

    @Autowired
    private RedisGiftService redisGiftService;
    @Autowired
    private GiftDao giftDao;

    @Override
    public List<Gift> like(String name, int pageNo, int pageSize) {
        return giftDao.like(name, pageNo, pageSize);
    }

    @Override
    public List<Gift> list() {
        return giftDao.list();
    }
}

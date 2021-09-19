package org.cjzheng01.inventory.service.impl;

import org.cjzheng01.inventory.service.RedisService;
import org.springframework.stereotype.Service;

@Service
public class LettuceAsyncService implements RedisService {

    @Override
    public Object get(String key) {
        return null;
    }

    @Override
    public void set(String key, Object value) {

    }

    @Override
    public void set(String key, Object value, long expireSeconds) {

    }

    @Override
    public void del(String key) {

    }

    @Override
    public void expire(String key, long seconds) {

    }

    @Override
    public void pexpire(String key, long millisSeconds) {

    }

    @Override
    public void lpush(String key, String value) {

    }
}

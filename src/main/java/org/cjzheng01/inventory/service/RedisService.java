package org.cjzheng01.inventory.service;

import java.util.List;


public interface RedisService {

    Object get(String key);

    void set(String key, Object value);

    void set(String key, Object value, long expireSeconds);

    void del(String key);

    void expire(String key, long seconds);

    void pexpire(String key, long millisSeconds);

    void lpush(String key, String value);

}

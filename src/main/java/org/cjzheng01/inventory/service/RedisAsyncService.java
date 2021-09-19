package org.cjzheng01.inventory.service;

public interface RedisAsyncService {

    Object getAsync(String key);

    void setAsync(String key, Object value);

    void setAsync(String key, Object value, long expireSeconds);

    void delAsync(String key);


}

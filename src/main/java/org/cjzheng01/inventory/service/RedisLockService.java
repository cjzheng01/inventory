package org.cjzheng01.inventory.service;


public interface RedisLockService {

    boolean acquireLock(String lockName, long acquireTimeout);

    boolean acquireLock(String lockName, long acquireTimeout, long expiresTime);

    void unlock(String lockName);
}

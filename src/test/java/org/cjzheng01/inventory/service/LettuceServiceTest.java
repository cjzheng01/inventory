package org.cjzheng01.inventory.service;

import org.cjzheng01.inventory.service.RedisService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class LettuceServiceTest {

    @Autowired
    private RedisService lettuceService;

    @Test
    public void testGet() {
        Object value = "cjzheng01";
        lettuceService.set("cjzheng01", value);
        Object newValue = lettuceService.get("cjzheng01");
        Assert.assertEquals(value, newValue);
    }
}

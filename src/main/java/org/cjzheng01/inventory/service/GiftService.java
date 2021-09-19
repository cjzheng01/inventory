package org.cjzheng01.inventory.service;

import java.util.List;

import org.cjzheng01.inventory.pojo.Gift;


public interface GiftService {

    List<Gift> like(String name, int pageNo, int pageSize);

    List<Gift> list();

}

package org.cjzheng01.inventory.dao;

import java.util.List;

import org.cjzheng01.inventory.pojo.Gift;

public interface GiftDao {

    Gift get(int id);

    boolean create(Gift gift);

    boolean edit(Gift gift);

    List<Gift> list();

    List<Gift> like(String name, int pageNo, int pageSize);

    int delete(int id);

    int updateInventory(int id, int num);

    int likeCount(String name);

}

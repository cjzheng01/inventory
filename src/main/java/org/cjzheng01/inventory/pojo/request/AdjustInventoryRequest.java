package org.cjzheng01.inventory.pojo.request;

import java.io.Serializable;


public class AdjustInventoryRequest implements Serializable {
    private static final long serialVersionUID = -8949403567931148189L;

    private int num;

    public int getNum() {
        return num;
    }

    public AdjustInventoryRequest setNum(int num) {
        this.num = num;
        return this;
    }
}

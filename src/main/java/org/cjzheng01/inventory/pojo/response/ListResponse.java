package org.cjzheng01.inventory.pojo.response;

import java.util.List;


public class ListResponse <T> extends CommonResponse {

    private static final long serialVersionUID = 1610792978872732678L;

    private List<T> data;

    public List<T> getData() {
        return data;
    }

    public ListResponse<T> setData(List<T> data) {
        this.data = data;
        return this;
    }
}

package org.cjzheng01.inventory.pojo.response;

public class DataResponse<T> extends CommonResponse {

    private static final long serialVersionUID = -7559823492525660398L;

    private T data;

    public T getData() {
        return data;
    }

    public DataResponse<T> setData(T data) {
        this.data = data;
        return this;
    }
}

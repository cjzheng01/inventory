package org.cjzheng01.inventory.pojo.response;

import java.io.Serializable;

public class CommonResponse implements Serializable {

    private static final long serialVersionUID = 1991084321459708044L;

    protected int statusCode = 200;

    public int getStatusCode() {
        return statusCode;
    }

    public CommonResponse setStatusCode(int statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    public CommonResponse() {
        super();
    }
}

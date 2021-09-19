package org.cjzheng01.inventory.pojo;

import java.io.Serializable;


public class Error implements Serializable {

    private static final long serialVersionUID = -11270386780055849L;

    private String code;

    private String message;

    public String getCode() {
        return code;
    }

    public Error setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public Error setMessage(String message) {
        this.message = message;
        return this;
    }
}

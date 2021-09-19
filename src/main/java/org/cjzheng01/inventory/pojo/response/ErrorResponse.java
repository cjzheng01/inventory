package org.cjzheng01.inventory.pojo.response;

import org.cjzheng01.inventory.pojo.Error;


public class ErrorResponse extends CommonResponse {

    private static final long serialVersionUID = -1648508864643362987L;

    private Error error;

    public Error getError() {
        return error;
    }

    public ErrorResponse setError(Error error) {
        this.error = error;
        return this;
    }

    public ErrorResponse() {
        super();
        super.setStatusCode(-1);
    }
}

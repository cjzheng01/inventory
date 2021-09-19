package org.cjzheng01.inventory.advice;

import org.cjzheng01.inventory.constants.ErrorCodeConstants;
import org.cjzheng01.inventory.pojo.Error;
import org.cjzheng01.inventory.pojo.response.ErrorResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class WebAdvice {

    @ExceptionHandler(Exception.class)
    public ErrorResponse expectionHandler(Exception ex) {
        return new ErrorResponse().setError(new Error().setCode(ErrorCodeConstants.ERR_SYSTEM).setMessage(ex.getMessage()));
    }
}

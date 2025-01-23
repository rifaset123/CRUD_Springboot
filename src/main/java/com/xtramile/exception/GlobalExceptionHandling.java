package com.xtramile.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandling {
    @ExceptionHandler(value = StudentNotFoundException.class)

    @ResponseStatus(HttpStatus.NOT_FOUND)
    public @ResponseBody CustomErrorResponse handleException(StudentNotFoundException ex) {
        return new CustomErrorResponse(HttpStatus.NOT_FOUND.value(), ex.getMessage());
    }
}

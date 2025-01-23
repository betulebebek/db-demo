package com.betus.dbdemo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.View;

import java.util.Date;

@ControllerAdvice
public class InvalidUserExceptionHandler {

    private final View error;

    public InvalidUserExceptionHandler(View error) {
        this.error = error;
    }
/*
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorMessage> exception(Exception ex) {
        ErrorMessage message = new ErrorMessage(
                ex.getMessage(), HttpStatus.ALREADY_REPORTED.value(), new Date()
        );
        return new ResponseEntity<>(message, HttpStatus.ALREADY_REPORTED);
    }
*/

}

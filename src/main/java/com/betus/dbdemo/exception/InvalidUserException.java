package com.betus.dbdemo.exception;

public class InvalidUserException extends RuntimeException{
    public InvalidUserException(String exception) {
        super(exception);
    }
}

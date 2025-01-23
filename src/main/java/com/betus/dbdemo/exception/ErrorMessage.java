package com.betus.dbdemo.exception;

import java.util.Date;

public class ErrorMessage {
    private String errorMessage;
    private int errorCode;
    private Date timestamp;

    public ErrorMessage(String errorMessage, int errorCode, Date timestamp) {
        this.errorMessage = errorMessage;
        this.errorCode = errorCode;
        this.timestamp = timestamp;
    }

    public int getErrorCode() {
        return errorCode;
    }



    public String getErrorMessage() {
        return errorMessage;
    }



    public Date getTimestamp() {
        return timestamp;
    }

    public ErrorMessage() {
    }


}

package com.hunter.continuouslydevelopedproject.tryCatchBlokInLoop;

public class ResponseException extends Exception{

    @Override
    public String getMessage() {
        return "this is a default exception message";
    }
}

package com.hunter.trycatchblockinloopproject;

public class ResponseException extends Exception{

    @Override
    public String getMessage() {
        return "this is a default exception message";
    }
}

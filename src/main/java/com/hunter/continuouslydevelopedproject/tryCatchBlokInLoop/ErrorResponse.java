package com.hunter.continuouslydevelopedproject.tryCatchBlokInLoop;

import com.google.gson.JsonObject;

public class ErrorResponse {
    int transactionId;
    boolean hasError;
    String errorMessage;

    public ErrorResponse(int value, boolean hasError, String errorMessage) {
        this.transactionId = value;
        this.hasError = hasError;
        this.errorMessage = errorMessage;
    }

    public JsonObject toJson() {
        JsonObject response = new JsonObject();
        response.addProperty("transactionId", transactionId);
        response.addProperty("hasError", hasError);
        response.addProperty("errorMessage", errorMessage);

        return response;
    }
}

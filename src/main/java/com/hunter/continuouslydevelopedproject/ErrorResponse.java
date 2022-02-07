package com.hunter.continuouslydevelopedproject;

import com.google.gson.JsonObject;

public class ErrorResponse {
    int transactionId;
    boolean hasError;
    String errorMessage;

    public ErrorResponse(int value, boolean hasError) {
        this.transactionId = value;
        this.hasError = hasError;
        errorMessage = "this is an error message!";
    }

    public JsonObject toJson() {
        JsonObject response = new JsonObject();
        response.addProperty("transactionId", transactionId);
        response.addProperty("hasError", hasError);
        response.addProperty("errorMessage", errorMessage);

        return response;
    }
}

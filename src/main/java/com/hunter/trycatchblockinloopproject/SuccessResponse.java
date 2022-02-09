package com.hunter.trycatchblockinloopproject;

import com.google.gson.JsonObject;

public class SuccessResponse {
    int transactionId;
    String responseData;

    public SuccessResponse(int transactionId, String responseData) {
        this.transactionId = transactionId;
        this.responseData = responseData;
    }

    public JsonObject toJson() {
        JsonObject response = new JsonObject();
        response.addProperty("transactionId", transactionId);
        response.addProperty("responseData", responseData);

        return response;
    }
}

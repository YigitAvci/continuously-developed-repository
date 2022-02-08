package com.hunter.continuouslydevelopedproject.tryCatchBlokInLoop;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.util.List;

public class TryCatchBlockInLoopProgram {

    public static void start() {
        List<Integer> transactions = List.of(2, 3, 4);
        JsonArray responses = checkForElements(transactions);
        responses.forEach(System.out::println);
    }

    static JsonArray checkForElements(List<Integer> transactions) {
        JsonArray responses = new JsonArray();
        for (Integer transaction : transactions) {
            JsonObject response;
            try {
                response = dividedByEvenNumber(transaction);
            }catch (ResponseException e) {
                response = new ErrorResponse(transaction, true).toJson();
            }
            responses.add(response);
        }
        return responses;
    }

    static JsonObject dividedByEvenNumber(int transaction) throws ResponseException {
        if(transaction % 2 != 0) {
            throw new ResponseException();
        }
        return new SuccessResponse(transaction, "a response data").toJson();
    }
}

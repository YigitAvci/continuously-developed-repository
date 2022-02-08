package com.hunter.continuouslydevelopedproject.tryCatchBlokInLoop;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.util.List;

public class TryCatchBlockInLoopProgram {

    public static void main(String[] args) {
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
            }catch (ResponseException e) { //if any problem (for example an exception from integrator's response) occurs and interrupt the code inside of try, we can add the responses that are failed anyway
                response = new ErrorResponse(transaction, true, e.getMessage()).toJson();
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

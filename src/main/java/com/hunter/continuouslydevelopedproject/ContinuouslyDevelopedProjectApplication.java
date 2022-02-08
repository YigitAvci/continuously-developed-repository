package com.hunter.continuouslydevelopedproject;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.hunter.continuouslydevelopedproject.tryCatchBlokInLoop.ErrorResponse;
import com.hunter.continuouslydevelopedproject.tryCatchBlokInLoop.ResponseException;
import com.hunter.continuouslydevelopedproject.tryCatchBlokInLoop.SuccessResponse;
import com.hunter.continuouslydevelopedproject.tryCatchBlokInLoop.TryCatchBlockInLoopProgram;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ContinuouslyDevelopedProjectApplication {

	/*
	public static void main(String[] args) {
		SpringApplication.run(ContinuouslyDevelopedProjectApplication.class, args);
	}
	 */

	public static void main(String[] args) {
		TryCatchBlockInLoopProgram.start();
	}
}

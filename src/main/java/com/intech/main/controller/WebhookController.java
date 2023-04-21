package com.intech.main.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class WebhookController {
	
	
	//*It Play an Important role here too 
	 private ObjectMapper objectMapper = new ObjectMapper(); 
	
	@PostMapping("/webhook")
    public ResponseEntity<?> webhook(@RequestBody String body) throws JsonProcessingException {
		
	// Parse the request body in Spring Boot --*Use The JsonParser the Extract the Information form Request Body 
		JsonNode json = objectMapper.readTree(body);
        String intentName = json.at("/queryResult/intent/displayName").asText();

      //  Handle the request in Spring Boot
        // Handle the request from Dialogflow here
        
        String responseText = "";
        if ("HelloIntent".equals(intentName)) {
            responseText = "Hello from Spring Boot!";
        } else {
            responseText = "I'm sorry, I didn't understand that.";
        }
        
        JsonNode responseJson = objectMapper.createObjectNode().put("fulfillmentText", responseText);
        return ResponseEntity.ok().body(responseJson);
    
        
      
    }
}


package com.intech.main.withautentication;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class WebhookRequest {

	    private String responseId;
	    private QueryResult queryResult;
	    private OriginalDetectIntentRequest originalDetectIntentRequest;
	    private String session;
	
}

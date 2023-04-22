package com.intech.main.withautentication;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class WebhookResponse {
	
	
	private String fulfillmentText;
    private List<WebhookMessage> fulfillmentMessages;
    private List<Context> outputContexts;
    private FollowupEventInput followupEventInput;

}

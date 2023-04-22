package com.intech.main.withautentication;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Fulfillment {

	private String speech;
    private String text;
    private List<WebhookMessage> messages;
	
	
}

package com.intech.main.withautentication;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class WebhookMessage {

	
	private SimpleResponse simpleResponse;
    private BasicCard basicCard;
    private List<Image> images;
}

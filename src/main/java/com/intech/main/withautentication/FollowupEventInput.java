package com.intech.main.withautentication;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class FollowupEventInput {

	
	    private String name;
	    private Map<String, Object> parameters;
	    private String languageCode;
}

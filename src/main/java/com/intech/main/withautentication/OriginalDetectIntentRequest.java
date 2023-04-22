package com.intech.main.withautentication;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class OriginalDetectIntentRequest {
	
	private String source;
    private String version;
    private Object payload;

}

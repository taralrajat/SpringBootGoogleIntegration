package com.intech.main.withautentication;

import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Intent {
	
	
	 private String name;
	    private String displayName;
	    private List<Context> inputContexts;
	    private List<Context> outputContexts;
	    private Map<String, String> parameters;


}

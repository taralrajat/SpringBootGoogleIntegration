package com.intech.main.withautentication;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Context {
	
	     private String name;
	    private Map<String, Object> parameters;
	    private int lifespan;

}

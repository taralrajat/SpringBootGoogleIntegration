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
public class QueryResult {
	
	
	private String queryText;
    private String action;
    private Map<String, Object> parameters;
    private Intent intent;
    private Fulfillment fulfillment;

}

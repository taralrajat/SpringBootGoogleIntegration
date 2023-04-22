package com.intech.main.withautentication;



import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyController {
	
	@GetMapping("/my-endpoint")
	public String myEndpoint() {
		return "Hello, world!";
	}
	
	
	@SuppressWarnings("deprecation")
	@Configuration
	@EnableWebSecurity
	public class SecurityConfig extends WebSecurityConfigurerAdapter {

	    @Override
	    protected void configure(HttpSecurity http) throws Exception {
	        http.authorizeRequests()
	            .anyRequest().authenticated()
	            .and()
	            .httpBasic();
	    }

}
	
	
	@PostMapping("/webhook")
	public WebhookResponse handleRequest(@RequestBody WebhookRequest request) throws Exception {
	    // Extract the intent name from the request
	    String intentName = request.getQueryResult().getIntent().getDisplayName();

	    // Build the request URL with the appropriate authentication credentials
	    String username = "my-username";
	    String password = "my-password";
	    String url = "http://localhost:8080/my-endpoint";
	    String auth = username + ":" + password;
	    byte[] encodedAuth = Base64.encodeBase64(auth.getBytes());
	    String authHeader = "Basic " + new String(encodedAuth);

	    // Create the HTTP request with the appropriate headers and payload
	    HttpHeaders headers = new HttpHeaders();
	    headers.set("Authorization", authHeader);
	    headers.set("Content-Type", "application/json");
	    String payload = "{ \"intentName\": \"" + intentName + "\" }";
	    HttpEntity<String> entity = new HttpEntity<String>(payload, headers);

	    // Send the HTTP request to the Spring Boot API endpoint
	    RestTemplate restTemplate = new RestTemplate();
	    ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);

	    // Extract the response from the HTTP response and return it as a Dialogflow webhook response
	    String responseBody = response.getBody();
	    WebhookResponse webhookResponse = new WebhookResponse();
	    webhookResponse.setFulfillmentText(responseBody);
	    return webhookResponse;
	}

	
	
}

package com.intech.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoogleController {
	
	@GetMapping("/check")
	public String googlegetresponse()
	{
		return "Yeaah Google How are you TESTING API ...!";
	}

}

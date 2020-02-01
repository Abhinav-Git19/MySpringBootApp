package com.SBApp.Welcome;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeMessage {
	
	@RequestMapping("/")
	public String welcome() {
		
		return "Hey Abhinav! You are getting the hang of SpringBoot";
	}
}

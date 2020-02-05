package com.SBApp.Welcome;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class WelcomeMessage {
	
	@RequestMapping("/")
	public String welcome(Model model) {
		//We use this model to return the HTML page
		model.addAttribute("welcome","Hi there, Welcome to model addattribute supplied page");
		return "welcome"; //Return the welcome template stored as welcome html
	}
}

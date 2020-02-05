package com.SBApp.profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProfileController {

	@Autowired
	private ProfileService profileservice;
	
	//This is your getAllMethod
	@RequestMapping("/profiles")
	public String getProfiles(Model model){
		model.addAttribute("profiles",profileservice.getAllProfiles());
		return "profiles";
	}

	//GetById
	@RequestMapping("/profile/{id}")
	public String getProfileById(@PathVariable int id, Model model){
		model.addAttribute("profile",profileservice.getProfileById(id));
		return "profile";
	}

	@RequestMapping(method = RequestMethod.POST ,value="/profile")
	public String addProfile(Profile p, Model model) {
		profileservice.addProfile(p);
		model.addAttribute("profile",profileservice.getAllProfiles());
		return "profile";
	}

	@RequestMapping(method = RequestMethod.PUT,value="/profile")
	public void updateProfile(@RequestBody Profile p){
		profileservice.updateProfile(p);
	}

	@RequestMapping(method = RequestMethod.DELETE,value = "/profile")
	public void deleteProfile(Profile p){
		profileservice.deleteProfile(p);
	}

	
	
}

package com.SBApp.profiles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProfileController {

	@Autowired
	private ProfileService profileservice;
	
	//This is your getAllMethod
	@RequestMapping("/profiles")
	public List<Profile> getProfiles(){
		return profileservice.getAllProfiles();	
	}

	//GetById
	@RequestMapping("/profile/{id}")
	public Profile getProfileById(@PathVariable int id){
		return profileservice.getProfileById(id);
	}

	@RequestMapping(method=RequestMethod.POST,value="/profile")
	public void addProfile(@RequestBody Profile p) {
		
		profileservice.addProfile(p);
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

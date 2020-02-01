package com.SBApp.profiles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {

	@Autowired
	private ProfileRepository profileRepository;

	private List<Profile> profiles=new ArrayList<>();
	public List<Profile> getAllProfiles(){
		/* Only for Demontration Purpose when Persistentt APIS are not present
		profiles.add(new Profile(1,"Abhinav","abhinav@gmail.com"));
		profiles.add(new Profile(2,"Ankit","ankit@gmaill.com"));

		 */

		return (List<Profile>) profileRepository.findAll();
	}
	public Profile getProfileById(int id){
		return (Profile) profileRepository.findAllById(Collections.singleton(id));
	}
	public void addProfile(Profile p) {
		profileRepository.save(p);
	}

	public void updateProfile(Profile p){
		profileRepository.save(p);
	}
	public void deleteProfile(Profile p){
		profileRepository.delete(p);
	}
}

package com.SBApp.profiles;

import org.springframework.data.repository.CrudRepository;

//CrudRepository<EntityName,PrimaryKey>
public interface ProfileRepository extends CrudRepository<Profile,Integer> {
    Object findAllById(int id);

    //For implementing Where clause you can use findByClause.. e.g
    //public Profie findByEmail(String Email);

    //Refer to SpringDcoumentation for further details
    //getProfile
    //getProfileId
    //deleteProfile
    //postProfile
    //updateProfile
}

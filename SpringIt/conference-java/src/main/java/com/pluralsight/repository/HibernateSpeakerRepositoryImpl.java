package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.pluralsight.model.Speaker;

@Repository("speakerRepository") //now we can remove the definition of this bean from appconfig 
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {
	public List<Speaker> findAll(){
		List<Speaker> speakers=new ArrayList<Speaker>();
		
		Speaker speaker=new Speaker();
		
		speaker.setFirstName("Avi");
		speaker.setLastName("Rai");
		speakers.add(speaker);
		
		return speakers;
	}

}

package com.pluralsight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;


@Service("speakerService") //now we've set this bean to autowire using setter and now the code of this bean from 
//Appconfig can be removed
public class SpeakerSerivceImpl implements SpeakerService {
	private SpeakerRepository repository;
	public List<Speaker> findAll(){
		return repository.findAll();
		
	}
//	FOR SEEING AUTOWIRED WORKING
	public SpeakerSerivceImpl() {
		System.out.println("No args in constructor");
	}
	
//	FOR CONSTRUCTOR INJECTION
//	@Autowired //if this was put as autowired the flow would be no arg constructor then through here
	public SpeakerSerivceImpl(SpeakerRepository speakerRepository) {
		System.out.println("Normal Constructor");
		repository=speakerRepository;
	}
	
//	FOR SETTER INJECTION
	@Autowired
//	because of autowired it is going to automatically inject the speakerRepository bean into this setter
//	follow the print statement with and without this to understand the flow of process
//	but here only this method is autowired..even the beans themselves can be autowired
	public void setRepository(SpeakerRepository repository) {
		System.out.println("Setter");
		this.repository = repository;
	}
	
	

}

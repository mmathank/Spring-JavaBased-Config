package spring.sample;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Cricket implements Sports{

	String teamName;
	MedicalService medicalService;
	
	public Cricket() {
		System.out.println("Cricket Object via Default Constructor");
	}
	
	public Cricket(MedicalService medicalService, String teamName){
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("Cricket Object via Parameterzied Constructor");
		this.medicalService = medicalService;
		this.teamName = teamName;
	}
	
	
	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	@Override
	public String provideInfo() {
		return "Played between two teams of 11 Players";
	}

	@Override
	public String getFirstAidInfo() {
		return medicalService.assist();
	}
	
	@PostConstruct
	public void afterCreation() {
		System.out.println("Inside init method :: After creating Cricket Object");
	}
	
	@PreDestroy
	public void beforeDeletion() {
		System.out.println("Inside destroy method :: Before Deleting Cricket Object");
		System.out.println("------------------------------------------------------------------------------");
	}

}

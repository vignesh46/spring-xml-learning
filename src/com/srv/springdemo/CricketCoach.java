package com.srv.springdemo;

public class CricketCoach implements Coach {
	
	public CricketCoach() {
		System.out.println("Cricket Coach Consturctor");
	}

	private FortuneService fortuneService;
	private String email;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Iorn man";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}

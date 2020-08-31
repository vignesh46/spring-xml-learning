package com.srv.springdemo;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Do 50 pushups";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public void doMystartupStuff() {
		System.out.println("BaseballCoach custom init method");
	}
	
	public void doMyCleanupStuff() {
		System.out.println("BaseballCoach custom destroy method");
	}

}

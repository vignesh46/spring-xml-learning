package com.srv.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach baseballCoach = context.getBean("baseballCoach", Coach.class);
		
		System.out.println(baseballCoach.getDailyWorkout());
		
		System.out.println(baseballCoach.getDailyFortune());
		
		CricketCoach cricketCoach = context.getBean("cricketCoach", CricketCoach.class);
		
		System.out.println(cricketCoach.getEmail());
		
		System.out.println(cricketCoach.getDailyWorkout());
		
		System.out.println(cricketCoach.getDailyFortune());
		
		context.close();
		
	}

}

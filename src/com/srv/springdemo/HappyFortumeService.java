package com.srv.springdemo;

public class HappyFortumeService implements FortuneService {
	
	@Override
	public String getFortune() {
		return "Good Luck!!";
	}

}

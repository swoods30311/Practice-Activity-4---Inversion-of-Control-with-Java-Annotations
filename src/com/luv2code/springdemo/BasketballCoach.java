package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach {

	
	@Override
	public String getDailyWorkout() {
		return "Dunk that bih down the middle";
	}



}









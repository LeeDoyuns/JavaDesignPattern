package com.design.behavioral.strategy.cls;

import com.design.behavioral.strategy.intface.Car;

public class Carnival implements Car {

	@Override
	public void startUp() {
		System.out.println("Set a Carnival");
	}

	
	@Override
	public void carWash() {
		System.out.println("Wash is a Carnival");
	}

}

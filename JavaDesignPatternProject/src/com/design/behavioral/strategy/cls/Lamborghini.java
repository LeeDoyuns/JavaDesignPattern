package com.design.behavioral.strategy.cls;

import com.design.behavioral.strategy.intface.Car;

public class Lamborghini implements Car {

	@Override
	public void startUp() {
		System.out.println("Set a Lamborghini!");
	}
	
	@Override
	public void carWash() {
		System.out.println("Wash is a Lamborghini");
	}
}

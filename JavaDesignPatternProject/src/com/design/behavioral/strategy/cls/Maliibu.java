package com.design.behavioral.strategy.cls;

import com.design.behavioral.strategy.intface.Car;

public class Maliibu implements Car {

	@Override
	public void startUp() {
		System.out.println("Set a Maliibu!");
	}
	
	@Override
	public void carWash() {
		System.out.println("Wash is a Maliibu");
	}
}

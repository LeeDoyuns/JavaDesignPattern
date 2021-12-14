package com.design.behavioral.strategy.cls;

import com.design.behavioral.strategy.intface.Car;

public class Ford implements Car {

	@Override
	public void startUp() {
		System.out.println("Set a Ford!");
	}
	
	@Override
	public void carWash() {
		System.out.println("Wash is a Ford");
	}

}

package com.design.behavioral.strategy.use;

import com.design.behavioral.strategy.intface.Car;

/**
 * Single Responsibility Principle - 클래스와 메소드는 하나의 역할만 하도록 한다.
 * Driver클래스는 차를 활용한 행동만을 한다.
 * 차에 대한 새로운 행동. 문을 열거나 세차를 한다 등은 Driver Class 에 작성하도록 한다.
 * @author Doyun
 *
 */
public class Driver {
	
	private Car car;
	
	public void setCar(Car car) {
		this.car = car;
	}
	
	public void startUp() {
		if(car == null) {
			System.out.println("..walking..");
		}else {
			car.startUp();
		}
	}
	
	/**
	 * 또다른 접근 시도
	 */
	public void goCar(Car car) {
		car.startUp();
	}
	
	public void washCar(Car car) {
		car.carWash();
	}

}

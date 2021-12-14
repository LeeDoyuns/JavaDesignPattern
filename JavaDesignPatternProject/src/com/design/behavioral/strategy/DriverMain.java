package com.design.behavioral.strategy;

import com.design.behavioral.strategy.cls.Carnival;
import com.design.behavioral.strategy.cls.Ferari;
import com.design.behavioral.strategy.cls.Ford;
import com.design.behavioral.strategy.cls.Lamborghini;
import com.design.behavioral.strategy.cls.Maliibu;
import com.design.behavioral.strategy.use.Driver;

/**
 * Driver가 행동을 하게 한다.
 * @author Doyun
 *
 */
public class DriverMain {
	
	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		//1. 아무 차량도 이용하지 않는다.
		driver.startUp();
		
		
		//2. 카니발 이용
		driver.setCar(new Carnival());
		driver.startUp();
		
		//3. 말리부 이용
		driver.setCar(new Maliibu());
		driver.startUp();
		
		//4. 페라리 이용
		driver.setCar(new Ferari());
		driver.startUp();
		
		System.out.println("===========================");
		
		/* 또다른 시도. */
		Driver driver2 = new Driver();
		
		//카니발 이용
		driver2.goCar(new Carnival());
		
		//람보르기니 이용
		driver2.goCar(new Lamborghini());
		
		
		System.out.println("---------------------------------------");
		driver.washCar(new Lamborghini());
		driver2.washCar(new Ford());
		
	}

}

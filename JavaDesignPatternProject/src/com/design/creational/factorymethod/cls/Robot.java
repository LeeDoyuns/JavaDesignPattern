package com.design.creational.factorymethod.cls;

import com.design.creational.factorymethod.intface.Product;

public class Robot extends Product{

	private String robotName;
	
	public Robot(String name) {
		System.out.println("로봇 발주 요청 확인...");
		this.robotName = name;
	}
	
	@Override
	public void make() {
		System.out.println(this.robotName+" 생산중..");
		System.out.println(this.robotName+" 생산완료. 포장중...");
	}
	
	public String getRobotName() {
		return robotName;
	}

}

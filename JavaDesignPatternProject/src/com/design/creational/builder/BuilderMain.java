package com.design.creational.builder;

import com.design.creational.builder.cls.Computer;

//매번 새로운 객체를 생성함.
public class BuilderMain {
	
	public static void main(String[] args) {
		
		Computer computer = Computer.Builder().ssd(200).build();
		System.out.println(computer);
		System.out.println(Computer.Builder().cpu("intel i5 9500").build());
		
		
	}

}

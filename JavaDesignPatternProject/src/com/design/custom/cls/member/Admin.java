package com.design.custom.cls.member;

import com.design.custom.intface.Person;
import com.design.custom.intface.PersonBuilder;

public class Admin extends Person{
	private String name;
	private int age;
	private char sex;
	private String address;
	private char position;
	
	@Override
	public String toString() {
		return "이름 : "+name +", 성별 : " +sex+", 나이 : "+age+", 주소 : "+address; 
	}
	
	public Admin(PersonBuilder builder) {
		this.name = builder.getName();
		this.age = builder.getAge();
		this.sex = builder.getSex();
		this.address = builder.getAddress();
		this.position = builder.getPosition();
	}

	@Override
	public void print() {
	}


}

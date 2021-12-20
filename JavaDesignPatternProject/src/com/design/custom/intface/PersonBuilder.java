package com.design.custom.intface;

import com.design.custom.cls.member.AdminBuilder;
import com.design.custom.cls.member.Member;

public abstract class PersonBuilder {
	
	protected String name;
	protected int age;
	protected char sex;
	protected String address;
	protected char position;
	
	
	public PersonBuilder(){
	}
	

	public PersonBuilder(String name, int age, char sex, String address, char position) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.address = address;
		this.position = position;
	}



	public PersonBuilder name(String name) {
		this.name = name;
		return this;
	}
	public  PersonBuilder age(int age) {
		this.age = age;
		return this;
	}
	public  PersonBuilder sex(char sex) {
		this.sex = sex;
		return this;
	}
	public  PersonBuilder address(String addr) {
		this.address = addr;
		return this;
	}
	
	

	public  int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}


	public char getSex() {
		return sex;
	}

	public String getAddress() {
		return address;
	}
	
	public char getPosition() {
		return position;
	}

	public abstract Member build();
}

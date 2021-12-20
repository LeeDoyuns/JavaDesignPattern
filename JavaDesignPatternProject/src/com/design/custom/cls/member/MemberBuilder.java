package com.design.custom.cls.member;

import com.design.custom.intface.PersonBuilder;

/**
 * builder클래스
 * Member에 직접적인 접근을 불허함. build()를 통해서만 Member클래스에 접근 가능.
 * @author Doyun
 *
 */
public class MemberBuilder extends PersonBuilder{
	
	public MemberBuilder() {
		// TODO Auto-generated constructor stub
	}
	
	private MemberBuilder(String name,int age,char sex,String addr) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.address = addr;
		this.position = 'M';
	}
	
	/*build*/
	@Override
	public Member build() {
		return new Member(new MemberBuilder(name,age,sex,address));
	}


	@Override
	public char getPosition() {
		// TODO Auto-generated method stub
		return super.getPosition();
	}
	
	
	
	

}

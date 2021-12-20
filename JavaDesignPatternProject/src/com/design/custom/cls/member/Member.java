package com.design.custom.cls.member;

import com.design.custom.cls.book.Book;
import com.design.custom.intface.Person;
import com.design.custom.intface.PersonBuilder;

/**
 * builder를 사용하기 위한 원본  class
 * @author Doyun
 *
 */
public class Member extends Person{
	
	private String name;
	private int age;
	private char sex;
	private String address;
	private char position;
	
	
	public Member(PersonBuilder builder) {
		this.name = builder.getName();
		this.age = builder.getAge();
		this.sex = builder.getSex();
		this.address = builder.getAddress();
		this.position = builder.getPosition();
	}

	
	@Override
	public String toString() {
		String pos = position == 'M'?"회원":"관리자";
		return "position : "+pos+", 이름 : "+name +", 성별 : " +sex+", 나이 : "+age+", 주소 : "+address; 
	}



	@Override
	public void print() {
		String pos = position == 'M'?"회원":"관리자";
		System.out.println("나는 "+name+", "+pos+" 입니다.");
	}
	
	public static PersonBuilder AdminBuild() {
		return new AdminBuilder();
	}
	
	public static PersonBuilder MemberBuild() {
		return new MemberBuilder();
	}
	
	public String getName() {
		return name;
	}
	


}

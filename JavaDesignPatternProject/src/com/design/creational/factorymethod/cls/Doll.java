package com.design.creational.factorymethod.cls;

import com.design.creational.factorymethod.intface.Product;

public class Doll extends Product{
	
	private String dollName;
	
	public Doll(String name) {
		System.out.println(name+" 제품 발주요청 확인");
		this.dollName = name;
	}

	@Override
	public void make() {
		System.out.println(dollName+" 제품 제작 시작. 공정 가동중..");
		System.out.println("=====제작 완료. 포장 완료.");
	}
	
	public String getDollName() {
		return dollName;
	}

}

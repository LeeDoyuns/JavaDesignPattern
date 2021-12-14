package com.design.creational.prototype.cls;

public class Frame {
	
	private String name;
	
	private String color;
	
	public Frame(String name,String color) {
		this.name=name;
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "frame = name : "+name+", color : "+color;
	}
	
	

}

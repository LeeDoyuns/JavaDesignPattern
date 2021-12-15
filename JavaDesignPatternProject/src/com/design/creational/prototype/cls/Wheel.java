package com.design.creational.prototype.cls;

public class Wheel implements Cloneable{

	private String name;
	
	private int size;
	
	
	public Wheel(String name,int size) {
		this.name = name;
		this.size = size;
	}
	
	@Override
	public String toString() {
		return "Wheel = name : "+name+", size : "+size;
	}
}

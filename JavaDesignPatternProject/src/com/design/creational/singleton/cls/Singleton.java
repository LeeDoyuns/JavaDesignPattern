package com.design.creational.singleton.cls;

public class Singleton {

	private static Singleton singleton = new Singleton();
	
	private Singleton() {
		System.out.println("create singleton");
	}
	
	public static Singleton getInstance() {
		return singleton;
	}
}

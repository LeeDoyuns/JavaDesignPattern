package com.design.creational.singleton;

import com.design.creational.singleton.cls.Singleton;

public class SingletonMain {

	public static void main(String[] args) {
		System.out.println("singleton test start");
		
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		
		//Singleton instance3 = new Singleton(); 
		
		System.out.println(instance == instance2);	//동일성 비교. 하나의 객체여야 하므로 같은 주소값이여야 함.
		System.out.println("test end");
	}
}

package com.design.behavioral.observer.cls;

import com.design.behavioral.observer.intface.Observer;

public class Client implements Observer{

	private String name;
	
	public Client(String name) {
		this.name = name;
	}
	@Override
	public void update(int temp, int humidity, String fineDust) {
		System.out.println(name+" is receive. 날씨정보 - 기온 : "+temp+"도, 습도 : "+humidity+"%, 미세먼지 : "+fineDust);
	}

}

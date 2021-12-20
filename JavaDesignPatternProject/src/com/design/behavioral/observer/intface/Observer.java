package com.design.behavioral.observer.intface;

public interface Observer {
	
	//주제의 상태가 바뀌었을때 호출.
	public void update(int temp, int humidity, String fineDust);
}

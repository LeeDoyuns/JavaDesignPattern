package com.design.behavioral.observer.intface;

public interface Subject {
	
	//옵저버 등록
	public void registerObserver(Observer o);
	
	//옵저버 삭제
	public void removeObserver(Observer o);
	
	//업데이트 알림
	public void notifyObserver();

}

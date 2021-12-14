package com.design.behavioral.template.intface;


/**
 * 정해진 반복되는 작업에 대한 메서드 : 템플릿 메서드
 * hook : 확장가능한 메서드
 * @author Doyun
 *
 */
public abstract class Ramen {

	
	//템플릿 메서드 - 업무 자동화
	public void makeRamen() {
		
		boilWater();
		putNoodles();
		putExtra();
		waitForMinutes();
	}
	
	public void boilWater() {
		System.out.println("물을 끓인다.");
	}
	public void putNoodles() {
		System.out.println("면을 넣는다.");
	}
	
	//hook 메소드
	public abstract void putExtra();
	
	//hook 메소드
	public abstract void waitForMinutes();
}

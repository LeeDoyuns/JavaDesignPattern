package com.design.creational.prototype.cls;

/**
 * cloneable을 상속한 원형 Car클래스
 * 나머지 차종은 Car클래스를 복제하여 사용한다.
 * @author Doyun
 *
 */
public class Car implements Cloneable {

	public Frame frame;
	public Wheel wheel;
	
	public Car(Frame frame,Wheel wheel) {
		this.frame = frame;
		this.wheel = wheel;
	}
	
	public void setStart() {
		System.out.println(frame+" 시동 start");
	}
	
	@Override
	public String toString() {
		return "frame="+frame+", wheel="+wheel;
	}
	
	@Override
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return obj;
	}
}

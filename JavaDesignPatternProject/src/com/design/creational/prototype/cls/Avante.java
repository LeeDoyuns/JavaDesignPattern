package com.design.creational.prototype.cls;

/**
 * 팩토리 패턴보다 조금 더 유연하게 구상 가능.
 * @author Doyun
 *
 */
public class Avante extends Car{

	public Avante(Frame frame, Wheel wheel) {
		super(frame, wheel);
	}
	
	public void changeFrame(Frame f) {
		this.frame = f;
	}
	
	@Override
	public String toString() {
		return "Avante = "+frame+" / "+wheel;
	}

}

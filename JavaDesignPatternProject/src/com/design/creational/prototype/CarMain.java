package com.design.creational.prototype;

import com.design.creational.prototype.cls.Avante;
import com.design.creational.prototype.cls.Frame;
import com.design.creational.prototype.cls.Wheel;

public class CarMain {
	public static void main(String[] args) {
		
		Frame frame = new Frame("avante V1","red");
		Wheel wheel = new Wheel("avante V1",18);
		
		//인스턴스 생성
		Avante redAvante = new Avante(frame,wheel);
		redAvante.setStart();
	
		Avante newAvante = (Avante)redAvante.clone();	//깊은 복사.
		
		Frame frame2 = new Frame("avante V2","blue");
		newAvante.changeFrame(frame2);
		newAvante.setStart();
		
		
		
		frame = new Frame("casper","black");
		redAvante.changeFrame(frame);
		/**
		 * 원본을 변경해도 복사본에는 영향이 없다.
		 */
		redAvante.setStart();
		newAvante.setStart();
		
		
	
	}
}

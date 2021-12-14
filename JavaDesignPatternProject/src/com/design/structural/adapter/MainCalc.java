package com.design.structural.adapter;

import com.design.structural.adapter.cls.AdapterImpl;
/**
 * AdapterImpl에서 변환한 메서드를 사용하는 클래스.
 * @author Doyun
 *
 */
public class MainCalc {
	
	public static void main(String[] args) {
		
		AdapterImpl cal = new AdapterImpl();
		
		System.out.println(cal.multiplication(10, 5));
		
		System.out.println(cal.half(7));
		
		System.out.println(cal.square(3));
		
		System.out.println(cal.square("3.6"));
		
	}

}

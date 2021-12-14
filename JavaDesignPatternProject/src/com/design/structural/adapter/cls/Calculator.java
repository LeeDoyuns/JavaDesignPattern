package com.design.structural.adapter.cls;

/**
 * 최초 생성 클래스. 계산한값을 반환해준다. 자료형은 float 한정.
 * @author Doyun
 *
 */
public class Calculator {
	
	//곱하기
	public float multiplication(float a, float b) {
		return a*b;
	}
	
	// /2
	public float half(float num) {
		return num/2;
	}
	
	//제곱
	public float square(float num) {
		return num*num;
	}

	
}

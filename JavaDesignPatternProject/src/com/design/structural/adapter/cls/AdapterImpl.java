package com.design.structural.adapter.cls;

import com.design.structural.adapter.intface.Adapter;

/**
 * 기존 Calculator클래스에서는 float형 변수만 파라미터로 받을 수 있었지만 해당 클래스에서 Adapter를 구현하여 파라미터의 자료형과 관계없이 float로 계산하여 리턴하도록 한다.
 * @author Doyun
 *
 */
public class AdapterImpl implements Adapter{
	
	private Calculator cal = new Calculator();

	@Override
	public double multiplication(int a, int b) {
		
		return (double) cal.multiplication((float)a, (float)b);
	}

	@Override
	public float half(int num) {
		return cal.half((float)num);
	}

	@Override
	public String square(int num) {
		return String.valueOf(cal.square((float)num));
	}

	@Override
	public int square(String num) {
		float number = Float.parseFloat(num);
		return (int) cal.square(number);
	}

}

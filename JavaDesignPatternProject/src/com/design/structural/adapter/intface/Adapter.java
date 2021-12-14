package com.design.structural.adapter.intface;

/**
 * 인자로 받는 파라미터의 자료형, 리턴하는 자료형등을 필요에 맞게 변경 가능하다.
 * 요구사항마다 알고리즘을 새로 구성할 필요없이 생산성 측면에서 효율적으로 운용이 가능하다.
 * @author Doyun
 *
 */
public interface Adapter {
	
	public double multiplication(int a, int b);
	
	public float half(int num);
	
	public String square(int num);
	
	public int square(String num);
	

}

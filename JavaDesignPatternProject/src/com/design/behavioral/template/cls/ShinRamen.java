package com.design.behavioral.template.cls;

import com.design.behavioral.template.intface.Ramen;

public class ShinRamen extends Ramen{
	
	public ShinRamen() {
		System.out.println("오늘은 내가 신라면을 끓이지");
	}

	@Override
	public void putExtra() {
		System.out.println("라면 스프룰 넣는다.");
		System.out.println("달걀을 넣는다.");
		System.out.println("콩나물을 넣는다.");
	}

	@Override
	public void waitForMinutes() {
		System.out.println("4분 기다린다.");
	}

}

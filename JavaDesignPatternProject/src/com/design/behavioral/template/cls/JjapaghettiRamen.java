package com.design.behavioral.template.cls;

import com.design.behavioral.template.intface.Ramen;

public class JjapaghettiRamen extends Ramen {
	
	public JjapaghettiRamen() {
		System.out.println("저녁에는 내가 짜파게티 요리사!");
	}

	@Override
	public void putExtra() {
		System.out.println("물을 버린다.");
		System.out.println("다진 마늘과 썬 대파를 넣는다.");
		System.out.println("간장 0.5스푼 넣는다.");
		System.out.println("라면 스프룰 넣는다.");
	}

	@Override
	public void waitForMinutes() {
		System.out.println("2분 볶는다.");
	}

}

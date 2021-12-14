package com.design.behavioral.template.cls;

import com.design.behavioral.template.intface.Ramen;

public class AnchovyKalguksu extends Ramen{
	
	public AnchovyKalguksu() {
		System.out.println("내일은 산뜻하게 멸치 칼국수");
	}

	@Override
	public void putExtra() {
		System.out.println("라면 스프룰 넣는다.");
		System.out.println("채썬 당근 넣는다.");
		System.out.println("채썬 애호박 넣는다.");
		System.out.println("푼 달걀을 넣는다.");
		
	}

	@Override
	public void waitForMinutes() {
		System.out.println("5분 기다린다.");
	}

}

package com.design.behavioral.template.cls;

import com.design.behavioral.template.intface.Ramen;

public class RaccoonRamen extends Ramen{
	
	public RaccoonRamen() {
		System.out.println("점심에는 너구리 라면을 끓일거야");
	}

	@Override
	public void putExtra() {
		System.out.println("라면 스프룰 넣는다.");
		System.out.println("다시다를 넣는다.");
		System.out.println("너구리를 넣는다.");
	}

	@Override
	public void waitForMinutes() {
		System.out.println("면이 두껍고 너구리 육수를 넣어야 하니 6분 기다린다.");
		
	}

}

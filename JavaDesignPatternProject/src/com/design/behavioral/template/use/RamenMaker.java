package com.design.behavioral.template.use;

import com.design.behavioral.template.cls.AnchovyKalguksu;
import com.design.behavioral.template.cls.JjapaghettiRamen;
import com.design.behavioral.template.cls.RaccoonRamen;
import com.design.behavioral.template.cls.ShinRamen;

public class RamenMaker {
	
	public static void main(String[] args) {
		
		
		ShinRamen sr = new ShinRamen();
		sr.makeRamen();
		System.out.println("==============================");
		
		RaccoonRamen rr = new RaccoonRamen();
		rr.makeRamen();
		System.out.println("==============================");
		
		JjapaghettiRamen jjapaghetti = new JjapaghettiRamen();
		jjapaghetti.makeRamen();
		System.out.println("==============================");
		
		AnchovyKalguksu ak = new AnchovyKalguksu();
		ak.makeRamen();
	}

}

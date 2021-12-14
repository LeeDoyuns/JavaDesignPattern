package com.design.creational.factorymethod;

import com.design.creational.factorymethod.cls.ProductFactory;
import com.design.creational.factorymethod.intface.Factory;
import com.design.creational.factorymethod.intface.Product;

/**
 * FactoryClass를 통해 인자값의 변화와 관계없이 생성 가능하다.
 * 매번main메서드에서 new생성자를 통해 객체를 새로 생성할 필요가 없다.
 * @author Doyun
 *
 */
public class FactoryMain {
	
	public static void main(String[] args) {
		Factory fac = new ProductFactory();
		
		try {
			//인형 공장 가동.
			
			Product teddy = fac.create("테디베어","doll");
			teddy.make();
			
			Product catDoll = fac.create("고양이 인형","doll");
			catDoll.make();
			
			Product dogDoll = fac.create("강아지 인형","doll");
			dogDoll.make();
			
			
			//로봇 공장으로 변경
			Product aiRobot = fac.create("인공지능 로봇","robot");
			aiRobot.make();
			
			//로봇 공장으로 변경
			Product nullProduct = fac.create("","");
			nullProduct.make();
			
		}catch(Exception e) {
			System.out.println("=======================");
			System.out.println("생산 정보가 존재하지 않습니다..");
		}
		
		
		
	}

}

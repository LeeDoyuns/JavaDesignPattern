package com.design.creational.factorymethod.cls;

import com.design.creational.factorymethod.intface.Factory;
import com.design.creational.factorymethod.intface.Product;

/**
 * 새로운 객체 생성시 factory클래스만 수정하면 된다.
 * @author Doyun
 *
 */
public class  ProductFactory extends Factory{

	@Override
	protected Product createProduct(String product,String type) {
		
		type = type.toUpperCase();
		switch (type){
		case "DOLL" : return new Doll(product);
		case "ROBOT": 	return new Robot(product);
		default: return null;
		}
	}

	@Override
	protected void prepare (Product p,String type) {
		
		type = type.toUpperCase();
		switch (type){
		case "DOLL" : System.out.println(((Doll)p).getDollName()+" 상품 재료 준비중...");break;
		case "ROBOT": System.out.println(((Robot)p).getRobotName()+" 부품 준비중...");break;
		}
		
	}

}

package com.design.creational.factorymethod.intface;

/**
 * factory 클래스.
 * new를 사용해서 실제 인스턴스를 생성하는 대신, 생성을 위한 메서드를 호출해서 클래스 이름에 의한 속박에서 벗어날 수 있다.(결합도 낮춤)
 * @author Doyun
 *
 */
public abstract class Factory {

	public final Product create(String product,String type) {
		Product p = createProduct(product,type);
		prepare(p,type);
		
		return p;
		
	}
	
	protected abstract Product createProduct(String product,String type);	//제품 생성
	protected abstract void prepare(Product p,String type);	//제품 포장
}

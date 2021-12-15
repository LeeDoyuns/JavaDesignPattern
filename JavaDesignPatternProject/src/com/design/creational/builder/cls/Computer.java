package com.design.creational.builder.cls;

/**
 * 불변 클래스
 *  해당클래스에 직접 접근 불가, 매접근마다 객체를 새로생성하게 된다.
 *  파라미터의 개수가 많아질수록 생성자를 통한 객체생성보다 빌더를 통한 생성이 가독성이 좋다.
 * @author Doyun
 *
 */
public class Computer {

	private final String cpu;
	
	private final int ram;
	
	private final String mainBoard;
	
	private final String power;
	
	private final int ssd;
	
	private final String mainCase;
	

	
	protected Computer(ComputerBuilder builder) {
		super();
		this.cpu = builder.getCpu();
		this.ram = builder.getRam();
		this.mainBoard = builder.getMainBoard();
		this.power = builder.getPower();
		this.ssd = builder.getSsd();
		this.mainCase = builder.getMainCase();
	}

	@Override
	public String toString() {
		return "this Computer part is cpu : "+cpu 
				+ ", ram : "+ram+"GB, mainBoard : "
				+mainBoard+", Power : "+power
				+", ssd : "+ssd +"GB, case : "+mainCase;
	}

	


	public static ComputerBuilder Builder() {
		return new ComputerBuilder();
	}
	
	
}

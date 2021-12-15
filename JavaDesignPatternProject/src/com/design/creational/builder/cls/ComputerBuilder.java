package com.design.creational.builder.cls;

/**
 * @param mainBoard
 * @return
 */
public class ComputerBuilder {

	private String cpu;
	
	private int ram;
	
	private String mainBoard;
	
	private String power;
	
	private int ssd;
	
	private String mainCase;
	
	
	/*
	 * 필수로 입력받아야하는 값이 있는경우, builder클래스에 필수값을 파라미터로 넘겨받는 생성자를 생성한다.
	 */
	
	public ComputerBuilder() {}
	
	public ComputerBuilder ssd(int ssd) {
		this.ssd = ssd;
		return this;
	}

	public ComputerBuilder cpu(String cpu) {
		this.cpu = cpu;
		return this;
	}
	
	public ComputerBuilder ram(int ram) {
		this.ram = ram;
		return this;
	}
	
	public ComputerBuilder mainBoard(String mainBoard) {
		this.mainBoard = mainBoard;
		return this;
	}

	public ComputerBuilder power(String power) {
		this.power = power;
		return this;
	}


	public ComputerBuilder mainCase(String mainCase) {
		this.mainCase = mainCase;
		return this;
	}
	
	
	
	public Computer build() {
		return new Computer(this);
	}
	

	public String getCpu() {
		return cpu;
	}

	public int getRam() {
		return ram;
	}

	public String getMainBoard() {
		return mainBoard;
	}

	public String getPower() {
		return power;
	}

	public int getSsd() {
		return ssd;
	}

	public String getMainCase() {
		return mainCase;
	}
	
	
	
}

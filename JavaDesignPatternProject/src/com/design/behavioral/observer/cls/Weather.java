package com.design.behavioral.observer.cls;

public class Weather {
	
	private int temperature;	//온도
	
	private int humidity;	//습도
	
	private String fineDust;//미세먼지 농도

	public Weather(int i, int j, String string) {
		this.temperature = i;
		this.humidity = j;
		this.fineDust = string;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

	public String getFineDust() {
		return fineDust;
	}

	public void setFineDust(String fineDust) {
		this.fineDust = fineDust;
	}
	

}

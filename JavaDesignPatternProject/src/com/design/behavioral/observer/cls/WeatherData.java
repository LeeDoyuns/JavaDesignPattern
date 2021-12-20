package com.design.behavioral.observer.cls;

import java.util.*;

import com.design.behavioral.observer.intface.Observer;
import com.design.behavioral.observer.intface.Subject;

/**
 * 날씨에 대한 주제를 공유함.
 * @author Doyun
 *
 */
public class WeatherData implements Subject{
	
	private Weather weather;
	List<Observer> observerList;
	
	public WeatherData() {
		observerList = new ArrayList<Observer>();
	}

	
	private void weatherChanged() {
		notifyObserver();
	}
	
	public void setWeather(Weather weather) {
		this.weather = weather;
		weatherChanged();
	}
	
	
	@Override
	public void notifyObserver() {
		for(Observer o : observerList) {
			o.update(weather.getTemperature(), weather.getHumidity(), weather.getFineDust());
		}
	}

	@Override
	public void registerObserver(Observer o) {
		observerList.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observerList.remove(o);
		
	}

}

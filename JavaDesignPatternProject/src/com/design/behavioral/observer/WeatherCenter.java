package com.design.behavioral.observer;

import com.design.behavioral.observer.cls.Client;
import com.design.behavioral.observer.cls.Weather;
import com.design.behavioral.observer.cls.WeatherData;
import com.design.behavioral.observer.intface.Observer;

public class WeatherCenter {

	public static void main(String[] args) {
		//게시자
		WeatherData weather = new WeatherData();
		
		
		//구독자
		Observer client1 = new Client("wendy");
		Observer client2 = new Client("jessy");
		Observer client3 = new Client("zeus");
		Observer client4 = new Client("pink");
		
		//구독
		weather.registerObserver(client1);
		weather.registerObserver(client2);
		weather.registerObserver(client3);
		weather.registerObserver(client4);
		
		weather.setWeather(new Weather(21,50,"나쁨"));
		
		weather.removeObserver(client4);
		
		weather.setWeather(new Weather(15,35,"좋음"));
		
		
	}
}

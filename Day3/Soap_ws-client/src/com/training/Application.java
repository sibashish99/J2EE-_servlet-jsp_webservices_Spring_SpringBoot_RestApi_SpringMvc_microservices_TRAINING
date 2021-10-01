package com.training;

public class Application {

	public static void main(String[] args) {
		
		WeatherServiceImpService service= new WeatherServiceImpService();
		WeatherServices proxy= service.getPort(WeatherServices.class);
		
		System.out.println(proxy.getWeather("CHN"));
	}

}

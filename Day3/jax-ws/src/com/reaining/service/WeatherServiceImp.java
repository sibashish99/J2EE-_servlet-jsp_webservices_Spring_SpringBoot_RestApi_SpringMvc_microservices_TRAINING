package com.reaining.service;

import javax.jws.WebService;

import com.reaining.ifaces.WeatherServices;

@WebService(endpointInterface = "com.reaining.ifaces.WeatherServices")
public class WeatherServiceImp implements WeatherServices {

	@Override
	public String getWeather(String city) {
		// TODO Auto-generated method stub
		String current= "29C - haze";
		if(city.equals("CHN")) {
			current= "32C - sunny";
		}
		return current;
	}

}

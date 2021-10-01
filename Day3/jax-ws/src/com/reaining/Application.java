package com.reaining;

import javax.xml.ws.Endpoint;

import com.reaining.service.WeatherServiceImp;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Endpoint ep =Endpoint.publish("http://localhost:5050/weather", new WeatherServiceImp());
      System.out.println("Service published..");
     }

}

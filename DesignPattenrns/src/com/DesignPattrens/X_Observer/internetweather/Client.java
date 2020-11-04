package com.DesignPattrens.X_Observer.internetweather;

public class Client {

	public static void main(String[] args) {
		
		//创建接入方 currentConditions
		CurrentConditions currentConditions = new CurrentConditions();
		
		//创建WeatherData并将接入方currentConditions传递到WeatherData中
		WeatherData weatherData = new WeatherData(currentConditions);
		
		//更新天气情况
		weatherData.setData(30, 150, 40);
		
		//天气变化情况
		System.out.println("++++++++++++");
		weatherData.setData(40, 160, 50);
	}
	
}

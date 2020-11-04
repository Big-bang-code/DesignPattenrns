package com.DesignPattrens.X_Observer.internetweather;

public class Client {

	public static void main(String[] args) {
		
		//�������뷽 currentConditions
		CurrentConditions currentConditions = new CurrentConditions();
		
		//����WeatherData�������뷽currentConditions���ݵ�WeatherData��
		WeatherData weatherData = new WeatherData(currentConditions);
		
		//�����������
		weatherData.setData(30, 150, 40);
		
		//�����仯���
		System.out.println("++++++++++++");
		weatherData.setData(40, 160, 50);
	}
	
}

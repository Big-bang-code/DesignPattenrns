package com.DesignPattrens.X_Observer.internetweather;

/**
 * 	显示当前的天气情况，可以理解为气象站自己的网站
 * @Title CurrentConditions.java
 * @Description
 * @author 孟BIG
 * @dateOct 10, 2020
 */
public class CurrentConditions {
	
	//温度、气压、湿度
	private float temperatrue;
	private float pressure;
	private float humidity;
	
	//更新天气情况，是由WeatherData来调用，使用推送模式
	public void update(float temperatrue,float pressure,float humidity) {
		this.temperatrue = temperatrue;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}
	public void display() {
		System.out.println("***"+temperatrue+"*****");
		System.out.println("****"+humidity+"****");
		System.out.println("*****"+pressure+"***");
	}
}

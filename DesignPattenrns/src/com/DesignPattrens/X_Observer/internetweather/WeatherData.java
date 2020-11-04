package com.DesignPattrens.X_Observer.internetweather;

/**
 * 	该类是核心
 * 	1.包含最新的天气情况信息		
 * 	2.含有CurrentConditions对象
 * 	3.当数据更新时，就主动调用CurrentConditions对象update方法(含display),这样接入方就看到最新的消息
 * @Title WeatherData.java
 * @Description
 * @author 孟BIG
 * @dateOct 10, 2020
 */
public class WeatherData {
	private float temperatrue;
	private float pressure;
	private float humidity;
	private CurrentConditions currentConditions;
	
	//加入新的第三方
	public WeatherData(CurrentConditions currentConditions) {
		this.currentConditions = currentConditions;
	}

	public float getTemperatrue() {
		return temperatrue;
	}

	public float getPressure() {
		return pressure;
	}

	public float getHumidity() {
		return humidity;
	}

	public CurrentConditions getCurrentConditions() {
		return currentConditions;
	}

	public void dataChange() {
		//调用接入方的update
		currentConditions.update(temperatrue, pressure, humidity);
	}
	
	//当数据更新时，调用setData
	public void setData(float temperatrue,float pressure,float humidity) {
		this.temperatrue = temperatrue;
		this.humidity = humidity;
		this.pressure = pressure;
		//调用dataChange方法，将最新信息推送给接入芳currentConditions
		dataChange();
	}
}

package com.DesignPattrens.X_Observer.internetweather;

/**
 * 	�����Ǻ���
 * 	1.�������µ����������Ϣ		
 * 	2.����CurrentConditions����
 * 	3.�����ݸ���ʱ������������CurrentConditions����update����(��display),�������뷽�Ϳ������µ���Ϣ
 * @Title WeatherData.java
 * @Description
 * @author ��BIG
 * @dateOct 10, 2020
 */
public class WeatherData {
	private float temperatrue;
	private float pressure;
	private float humidity;
	private CurrentConditions currentConditions;
	
	//�����µĵ�����
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
		//���ý��뷽��update
		currentConditions.update(temperatrue, pressure, humidity);
	}
	
	//�����ݸ���ʱ������setData
	public void setData(float temperatrue,float pressure,float humidity) {
		this.temperatrue = temperatrue;
		this.humidity = humidity;
		this.pressure = pressure;
		//����dataChange��������������Ϣ���͸����뷼currentConditions
		dataChange();
	}
}

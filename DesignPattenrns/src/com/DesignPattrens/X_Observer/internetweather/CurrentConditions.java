package com.DesignPattrens.X_Observer.internetweather;

/**
 * 	��ʾ��ǰ������������������Ϊ����վ�Լ�����վ
 * @Title CurrentConditions.java
 * @Description
 * @author ��BIG
 * @dateOct 10, 2020
 */
public class CurrentConditions {
	
	//�¶ȡ���ѹ��ʪ��
	private float temperatrue;
	private float pressure;
	private float humidity;
	
	//�����������������WeatherData�����ã�ʹ������ģʽ
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

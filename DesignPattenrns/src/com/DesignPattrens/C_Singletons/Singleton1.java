package com.DesignPattrens.C_Singletons;

/**
 * ����ʽ����
 * ��̬����
 * @Title Singletons1.java
 * @Description
 * @author ��BIG
 * @date2020��7��16��
 */
public class Singleton1 {
	private Singleton1() {
		
	}
	private static Singleton1 instance = new Singleton1();
	
	public static Singleton1 test() {
		return instance;
	}
}

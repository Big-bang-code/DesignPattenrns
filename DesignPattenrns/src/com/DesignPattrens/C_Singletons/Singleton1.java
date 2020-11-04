package com.DesignPattrens.C_Singletons;

/**
 * 饿汉式单例
 * 静态常量
 * @Title Singletons1.java
 * @Description
 * @author 孟BIG
 * @date2020年7月16日
 */
public class Singleton1 {
	private Singleton1() {
		
	}
	private static Singleton1 instance = new Singleton1();
	
	public static Singleton1 test() {
		return instance;
	}
}

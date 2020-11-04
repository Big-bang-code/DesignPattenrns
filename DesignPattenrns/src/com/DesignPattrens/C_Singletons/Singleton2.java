package com.DesignPattrens.C_Singletons;
/**
 * 饿汉式单例
 * 静态代码块
 * @Title Singletons2.java
 * @Description
 * @author 孟BIG
 * @date2020年7月16日
 */
public class Singleton2 {
	private Singleton2() {
		
	}
	private static Singleton2 instance;
	
	static {
		instance = new Singleton2();
	}
	
	public static Singleton2 test() {
		return instance;
	}
}

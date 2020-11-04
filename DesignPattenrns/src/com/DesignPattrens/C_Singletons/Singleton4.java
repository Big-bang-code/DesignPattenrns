package com.DesignPattrens.C_Singletons;
/**
 * 懒汉式单例
 * 线程安全,同步方法
 * @Title Singleton4.java
 * @Description
 * @author 孟BIG
 * @date2020年7月16日
 */
public class Singleton4 {
	private Singleton4() {
		
	}
	private static Singleton4 instance;
	
	public static synchronized Singleton4 test() {
		if (instance == null) {
			instance = new Singleton4();
		}
		return instance;
	}
}

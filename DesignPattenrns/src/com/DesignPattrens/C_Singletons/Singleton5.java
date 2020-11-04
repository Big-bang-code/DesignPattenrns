package com.DesignPattrens.C_Singletons;
/**
 * 懒汉式单例
 * 线程安全，同步代码块
 * @Title Singleton5.java
 * @Description
 * @author 孟BIG
 * @date2020年7月16日
 */
public class Singleton5 {
	private Singleton5() {
		
	}
	private static Singleton5 instance;
	
	public static Singleton5 test() {
		if(instance == null) {
			synchronized(Singleton5.class) {
				instance = new Singleton5();
			}
		}
		return instance;
	}
}

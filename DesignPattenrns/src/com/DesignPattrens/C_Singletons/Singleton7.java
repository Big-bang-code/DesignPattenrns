package com.DesignPattrens.C_Singletons;
/**
 * 静态内部类
 * @Title Singleton7.java
 * @Description
 * @author 孟BIG
 * @date2020年7月16日
 */
public class Singleton7 {

	private static volatile Singleton7 instance;
	private Singleton7() {
		
	}
	
	private static class SingletonInstance{
		private static final Singleton7 Instance = new Singleton7();
	}
	
	public static Singleton7 test() {
		if(instance == null) {
			synchronized (Singleton7.class) {
				instance = new Singleton7();
			}
		}
		return instance;
	}
	
}

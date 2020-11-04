package com.DesignPattrens.C_Singletons;
/**
 * 懒汉式单例
 * @Title Singletons3.java
 * @Description
 * @author 孟BIG
 * @date2020年7月16日
 */
public class Singleton3 {

	private static Singleton3 instance;
	
	private Singleton3() {
		
	}
	
	public static Singleton3 test() {
		if(instance == null) {
			instance = new Singleton3();
		}
		return instance;
	}
}

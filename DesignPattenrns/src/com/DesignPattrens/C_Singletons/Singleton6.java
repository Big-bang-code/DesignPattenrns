package com.DesignPattrens.C_Singletons;
/**
 * 双重检查
 * @Title Singleton6.java
 * @Description
 * @author 孟BIG
 * @date2020年7月16日
 */
public class Singleton6 {

	private Singleton6() {
		
	}
	
	private static volatile Singleton6 instance;
	
	public static Singleton6 test() {
		if(instance == null) {
			synchronized (Singleton6.class) {
				instance = new Singleton6();
			}
		}
		return instance;
	}
}

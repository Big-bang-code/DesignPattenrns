package com.DesignPattrens.C_Singletons;
/**
 * ˫�ؼ��
 * @Title Singleton6.java
 * @Description
 * @author ��BIG
 * @date2020��7��16��
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

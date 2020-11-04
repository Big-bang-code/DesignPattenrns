package com.DesignPattrens.C_Singletons;
/**
 * ����ʽ����
 * ��̬�����
 * @Title Singletons2.java
 * @Description
 * @author ��BIG
 * @date2020��7��16��
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

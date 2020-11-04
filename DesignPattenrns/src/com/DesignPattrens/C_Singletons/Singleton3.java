package com.DesignPattrens.C_Singletons;
/**
 * ����ʽ����
 * @Title Singletons3.java
 * @Description
 * @author ��BIG
 * @date2020��7��16��
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

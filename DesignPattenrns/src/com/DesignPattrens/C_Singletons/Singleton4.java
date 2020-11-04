package com.DesignPattrens.C_Singletons;
/**
 * ����ʽ����
 * �̰߳�ȫ,ͬ������
 * @Title Singleton4.java
 * @Description
 * @author ��BIG
 * @date2020��7��16��
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

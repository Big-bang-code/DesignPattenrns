package com.DesignPattrens.C_Singletons;
/**
 * ����ʽ����
 * �̰߳�ȫ��ͬ�������
 * @Title Singleton5.java
 * @Description
 * @author ��BIG
 * @date2020��7��16��
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

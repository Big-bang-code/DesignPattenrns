package com.DesignPattrens.C_Singletons;
/**
 * ��̬�ڲ���
 * @Title Singleton7.java
 * @Description
 * @author ��BIG
 * @date2020��7��16��
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

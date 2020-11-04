package com.DesignPattrens.C_Singletons;

public class Test {
	public static void main(String[] args) {
		Singleton1 singleton1  = Singleton1.test();
		Singleton1 singleton2  = Singleton1.test();
		System.out.println(singleton1.equals(singleton2));
		
		Singleton2 singleton3 = Singleton2.test();
		Singleton2 singleton4 = Singleton2.test();
		System.out.println(singleton3.equals(singleton4));
		
		
		Singleton8 singleton5 = Singleton8.Instance;
		Singleton8 singleton6 = Singleton8.Instance;
		System.out.println(singleton5.equals(singleton6));
	}
}

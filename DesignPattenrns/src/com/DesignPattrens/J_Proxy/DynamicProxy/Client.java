package com.DesignPattrens.J_Proxy.DynamicProxy;

/**
 * 1.创建TeacherDaoProxy对象
 * 2.创建TeacherDao对象
 * 3.将TeacherDao对象，让TeacherDaoProxy对象执行方法
 * 
 * 
 * @Title Client.java
 * @Description
 * @author 孟BIG
 * @date2020-10-9
 */
public class Client {
	
	public static void main(String[] args) {
		//创建目标对象（被代理对象）
		ITeacherDao target = new TeacherDao();
		
		//给目标对象，创建代理对象，可以转成ITeacherDao
		ITeacherDao proxyInstance = (ITeacherDao)new ProxyFactory(target).getProxyInstance();
		
		//proxyInstance = class com.sun.proxy.$Proxy() 内存中动态生成了代理对象
		System.out.println("proxyInstance"+proxyInstance.getClass());
		
		//通过代理对象，调用目标对象的方法 
		proxyInstance.teacher();
		
		proxyInstance.sayHello("tom");
	}
	
}

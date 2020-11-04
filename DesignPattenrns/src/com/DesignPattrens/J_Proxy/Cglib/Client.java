package com.DesignPattrens.J_Proxy.Cglib;

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
		//创建目标对象
		TeacherDao target = new TeacherDao();
		
		//获取到代理对象，并将目标对象传递给代理对象
		TeacherDao proxyInstance = (TeacherDao)new ProxyFactory(target).getProxyInstance();
		
		//执行代理对象的方法，触发intecept方法，从而实现对目标对象的调用
		String res = proxyInstance.teach();
		//System.out.println("res="+res);
						
	}
	
}

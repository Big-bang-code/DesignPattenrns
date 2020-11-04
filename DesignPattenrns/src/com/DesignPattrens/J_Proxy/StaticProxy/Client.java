package com.DesignPattrens.J_Proxy.StaticProxy;

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
		TeacherDao teacherDao = new TeacherDao();
		//创建代理对象，同时将被代理对象传递给代理对象
		TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);
		teacherDaoProxy.teacher();
	}
	
}

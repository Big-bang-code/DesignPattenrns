package com.DesignPattrens.J_Proxy.DynamicProxy;

/**
 * 1.����TeacherDaoProxy����
 * 2.����TeacherDao����
 * 3.��TeacherDao������TeacherDaoProxy����ִ�з���
 * 
 * 
 * @Title Client.java
 * @Description
 * @author ��BIG
 * @date2020-10-9
 */
public class Client {
	
	public static void main(String[] args) {
		//����Ŀ����󣨱��������
		ITeacherDao target = new TeacherDao();
		
		//��Ŀ����󣬴���������󣬿���ת��ITeacherDao
		ITeacherDao proxyInstance = (ITeacherDao)new ProxyFactory(target).getProxyInstance();
		
		//proxyInstance = class com.sun.proxy.$Proxy() �ڴ��ж�̬�����˴������
		System.out.println("proxyInstance"+proxyInstance.getClass());
		
		//ͨ��������󣬵���Ŀ�����ķ��� 
		proxyInstance.teacher();
		
		proxyInstance.sayHello("tom");
	}
	
}

package com.DesignPattrens.J_Proxy.Cglib;

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
		//����Ŀ�����
		TeacherDao target = new TeacherDao();
		
		//��ȡ��������󣬲���Ŀ����󴫵ݸ��������
		TeacherDao proxyInstance = (TeacherDao)new ProxyFactory(target).getProxyInstance();
		
		//ִ�д������ķ���������intecept�������Ӷ�ʵ�ֶ�Ŀ�����ĵ���
		String res = proxyInstance.teach();
		//System.out.println("res="+res);
						
	}
	
}

package com.DesignPattrens.J_Proxy.StaticProxy;

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
		TeacherDao teacherDao = new TeacherDao();
		//�����������ͬʱ����������󴫵ݸ��������
		TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);
		teacherDaoProxy.teacher();
	}
	
}

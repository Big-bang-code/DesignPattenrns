package com.DesignPattrens.J_Proxy.DynamicProxy;

public class TeacherDao implements ITeacherDao{

	@Override
	public void teacher() {
		// TODO �Զ����ɵķ������
		System.out.println("�ڿ�");
	}

	@Override
	public void sayHello(String name) {
		System.out.println("hello,"+name);
		
	}

}

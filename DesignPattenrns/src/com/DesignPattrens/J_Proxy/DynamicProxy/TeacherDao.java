package com.DesignPattrens.J_Proxy.DynamicProxy;

public class TeacherDao implements ITeacherDao{

	@Override
	public void teacher() {
		// TODO 自动生成的方法存根
		System.out.println("授课");
	}

	@Override
	public void sayHello(String name) {
		System.out.println("hello,"+name);
		
	}

}

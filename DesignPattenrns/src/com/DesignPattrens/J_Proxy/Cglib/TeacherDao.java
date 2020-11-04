package com.DesignPattrens.J_Proxy.Cglib;

public class TeacherDao{

	public String teach() {
		System.out.println("cglib代理，不需要实现接口");
		return "hello";
	}

}

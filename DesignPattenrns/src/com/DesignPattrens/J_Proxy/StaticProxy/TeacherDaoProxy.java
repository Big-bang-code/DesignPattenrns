package com.DesignPattrens.J_Proxy.StaticProxy;

import com.sun.prism.impl.Disposer.Target;

/**
 *	 代理对象，静态代理
 * @Title TeacherDaoProxy.java
 * @Description
 * @author 孟BIG
 * @date2020-10-9
 */
public class TeacherDaoProxy implements ITeacherDao{
	
	private ITeacherDao target;
	
	//构造器
	public TeacherDaoProxy(ITeacherDao target) {
		this.target = target;
	}
	

	@Override
	public void teacher() {
		// TODO 自动生成的方法存根
		System.out.println("开始代理，完成一些操作");
		target.teacher();
		System.out.println("完成代理");
	}

}

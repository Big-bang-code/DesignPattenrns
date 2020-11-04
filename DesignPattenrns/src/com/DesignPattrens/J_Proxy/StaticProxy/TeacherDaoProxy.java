package com.DesignPattrens.J_Proxy.StaticProxy;

import com.sun.prism.impl.Disposer.Target;

/**
 *	 ������󣬾�̬����
 * @Title TeacherDaoProxy.java
 * @Description
 * @author ��BIG
 * @date2020-10-9
 */
public class TeacherDaoProxy implements ITeacherDao{
	
	private ITeacherDao target;
	
	//������
	public TeacherDaoProxy(ITeacherDao target) {
		this.target = target;
	}
	

	@Override
	public void teacher() {
		// TODO �Զ����ɵķ������
		System.out.println("��ʼ�������һЩ����");
		target.teacher();
		System.out.println("��ɴ���");
	}

}

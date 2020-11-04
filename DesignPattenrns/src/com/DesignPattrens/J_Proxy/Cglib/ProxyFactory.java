package com.DesignPattrens.J_Proxy.Cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class ProxyFactory implements MethodInterceptor{

	//ά��һ��Ŀ�����object
	private Object target;
	
	//����������target���г�ʼ��,���뱻����Ķ���
	public ProxyFactory(Object target) {
		this.target = target;
	}
	
	//����һ�����������target����Ĵ������
	public Object getProxyInstance() {
		//1.����һ��������
		Enhancer enhancer = new Enhancer();
		//2.���ø���
		enhancer.setSuperclass(target.getClass());
		//3.���ûص�����
		enhancer.setCallback(this);
		//4.����������󣬼��������
		return enhancer.create();
	}

	//��дintercept�����������Ŀ�����ķ���
	@Override
	public Object intercept(Object arg0, Method method, Object[] arg2, MethodProxy arg3) throws Throwable {
		System.out.println("Cglib������~��ʼ");
		Object returnVal = method.invoke(target, arg2);
		System.out.println("Cglib������~����");
		return returnVal;
	}
	
}

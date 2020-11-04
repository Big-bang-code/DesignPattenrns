package com.DesignPattrens.C_Factorys;

public class CheesePizza extends Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		setName("CheesePizza");
		System.out.println(name + " preparing;");
	}
	
	
}

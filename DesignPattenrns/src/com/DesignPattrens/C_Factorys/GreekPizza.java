package com.DesignPattrens.C_Factorys;

public class GreekPizza extends Pizza {
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		setName("GreekPizza");
		System.out.println(name + " preparing;");
	}
}

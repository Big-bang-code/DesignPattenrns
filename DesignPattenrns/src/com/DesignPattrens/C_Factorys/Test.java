package com.DesignPattrens.C_Factorys;

public class Test {
	public static void main(String[] args) {
		Pizza cPizza = new CheesePizza();
		cPizza.prepare();
	}
}

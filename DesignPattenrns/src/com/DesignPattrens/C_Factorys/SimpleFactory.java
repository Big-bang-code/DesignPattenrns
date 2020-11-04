package com.DesignPattrens.C_Factorys;

public class SimpleFactory {

	public Pizza createPizza(String orderType) {
		
		Pizza pizza = null;
		
		if(orderType.equals("greek")) {
			pizza = new GreekPizza();
			
		}else{
			pizza = new CheesePizza();
		}
			
		return pizza;
	}
	
}

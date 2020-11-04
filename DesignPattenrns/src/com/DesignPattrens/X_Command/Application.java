package com.DesignPattrens.X_Command;

public class Application {

	public static void main(String[] args) {
		CompanyArmy companyArmy  = new CompanyArmy();
		Command command = new ConcreteCommand(companyArmy);
		
		ArmySuperior armySuperior = new ArmySuperior();
		
		armySuperior.setCommand(command);
		armySuperior.start();
	}
	
}

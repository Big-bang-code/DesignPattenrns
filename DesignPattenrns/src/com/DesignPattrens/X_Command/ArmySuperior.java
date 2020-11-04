package com.DesignPattrens.X_Command;

public class ArmySuperior {
	Command command;
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void start() {
		command.execute();
	}
	
}

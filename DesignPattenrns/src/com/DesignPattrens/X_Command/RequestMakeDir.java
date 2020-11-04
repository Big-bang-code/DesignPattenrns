package com.DesignPattrens.X_Command;

/**
 * 	����ӿڵĳ��ط�����������
 * @Title RequestMakeDir.java
 * @Description
 * @author ��BIG
 * @date2020-9-8
 */
public class RequestMakeDir {
	Command command;
	public void setCommand(Command command) {
		this.command = command;
	}
	public void startExecuteCommand(String name) {
		command.execute(name);
	}
	public void undoCommand() {
		command.undo();
	}
}

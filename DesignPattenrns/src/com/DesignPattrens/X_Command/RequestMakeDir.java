package com.DesignPattrens.X_Command;

/**
 * 	命令接口的撤回方法：请求者
 * @Title RequestMakeDir.java
 * @Description
 * @author 孟BIG
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

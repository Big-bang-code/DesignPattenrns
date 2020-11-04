package com.DesignPattrens.X_Command;

/**
 * 	命令接口
 * @Title Command.java
 * @Description
 * @author 孟BIG
 * @date2020-9-2
 */
public interface Command {
	public abstract void execute();
	
	//命令接口的撤回方法
	public abstract void execute(String name);
	public abstract void undo();
}

package com.DesignPattrens.X_Command;

/**
 * 	����ӿ�
 * @Title Command.java
 * @Description
 * @author ��BIG
 * @date2020-9-2
 */
public interface Command {
	public abstract void execute();
	
	//����ӿڵĳ��ط���
	public abstract void execute(String name);
	public abstract void undo();
}

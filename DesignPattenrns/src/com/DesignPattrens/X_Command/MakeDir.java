package com.DesignPattrens.X_Command;

import java.io.File;


/**
 * 	命令接口的撤回方法：接收者
 * @Title MakeDir.java
 * @Description
 * @author 孟BIG
 * @date2020-9-8
 */
public class MakeDir {
	public void createDir(String name) {
		File dir = new File(name);
		dir.mkdir();
	}
	public void deleteDir(String name) {
		File dirFile = new File(name);
		dirFile.delete();
	}
}

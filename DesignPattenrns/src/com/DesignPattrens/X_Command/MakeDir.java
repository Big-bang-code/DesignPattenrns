package com.DesignPattrens.X_Command;

import java.io.File;


/**
 * 	����ӿڵĳ��ط�����������
 * @Title MakeDir.java
 * @Description
 * @author ��BIG
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

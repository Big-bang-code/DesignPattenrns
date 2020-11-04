package com.DesignPattrens.X_Command;

import java.util.ArrayList;


/**
 * 	具体命令
 * @Title ConcreteCommand.java
 * @Description
 * @author 孟BIG
 * @date2020-9-2
 */
public class ConcreteCommand implements Command{

	CompanyArmy army;
	
	public ConcreteCommand(CompanyArmy army) {
		// TODO Auto-generated constructor stub
		this.army = army;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		army.sneakAttack();
	}

	
	//命令接口的撤回方法
	
	ArrayList<String> dirNameList;
	MakeDir makeDir;
	
	ConcreteCommand(MakeDir makeDir){
		dirNameList = new ArrayList<String>();
		this.makeDir = makeDir;
	}
	
	@Override
	public void undo() {
		if(dirNameList.size()>0) {
			int m = dirNameList.size();
			String string = dirNameList.get(m-1);
			makeDir.deleteDir(string);
			dirNameList.remove(m-1);
		}else {
			System.out.println("无操作");
		}		
	}
	
	public void execute(String name) {
		makeDir.createDir(name);
		dirNameList.add(name);
	}
}

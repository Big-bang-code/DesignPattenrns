package com.DesignPattrens.C_ProtoType;

public class test {
	
	public static void main(String[] args) {
		DeepProtoType p = new DeepProtoType();
		
		p.name = "AAA";
		p.deepCloneableTarget = new DeepCloneableTarget("AAA", "BBB");
		
		//方式1 完成深拷贝
		try {
			DeepProtoType p2 = (DeepProtoType)p.clone();
			System.out.println("p.name:"+p.name+";p.deepCloneableTarget:"+p.deepCloneableTarget.hashCode());
			System.out.println("p2.name:"+p2.name+";p2.deepCloneableTarget:"+p2.deepCloneableTarget.hashCode());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//方式2
		DeepProtoType p3 = (DeepProtoType)p.deepClone();
		System.out.println("p.name:"+p.name+";p.deepCloneableTarget:"+p.deepCloneableTarget.hashCode());
		System.out.println("p3.name:"+p3.name+";p3.deepCloneableTarget:"+p3.deepCloneableTarget.hashCode());
		
	}
}

package com.DesignPattrens.C_ProtoType;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DeepProtoType implements Serializable,Cloneable{

	public String name;
	public DeepCloneableTarget deepCloneableTarget;//��������
	public DeepProtoType() {
		super();
	}
	
	//���1��ʹ��clone��ʽ
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		Object deepObject = null;
		deepObject = super.clone();
		
		DeepProtoType deepProtoType = (DeepProtoType)deepObject;
		deepProtoType.deepCloneableTarget = (DeepCloneableTarget)deepCloneableTarget.clone();
		
		return deepProtoType;
	}
	
	//���2��ͨ����������л�ʵ��
	public Object deepClone() {
		//����������
		ByteArrayOutputStream bos = null;
		ObjectOutputStream oos = null;
		ByteArrayInputStream bis = null;
		ObjectInputStream ois = null;
		
		try {
			//���л�
			bos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(bos);
			oos.writeObject(this);//��ǰ��������Զ������ķ�ʽ���
			
			//�����л�
			bis = new ByteArrayInputStream(bos.toByteArray());
			ois = new ObjectInputStream(bis);
			
			DeepProtoType copyObj = (DeepProtoType)ois.readObject();
			
			return copyObj;
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}finally {
			//�ر���
			try {
				bos.close();
				oos.close();
				bis.close();
				ois.close();
			} catch (Exception e2) {
				// TODO: handle exception
				System.out.println(e2.getMessage());
			}
		}		
	}	
}

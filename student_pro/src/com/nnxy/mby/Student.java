package com.nnxy.mby;
/*
 * @author mobiyou 
 * create date : 2019/5/16
 * description :ѧ����ʵ����
 */
public class Student {

	private int id;

	@Override
	public String toString() {
		return "Student [id=" + id + "]";
	}

	public Student(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}

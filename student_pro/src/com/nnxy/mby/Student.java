package com.nnxy.mby;
/*
 * @author mobiyou 
 * create date : 2019/5/16
 * description :Ñ§ÉúµÄÊµÌåÀà
 */
public class Student {

	private int id;//唯一ID

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

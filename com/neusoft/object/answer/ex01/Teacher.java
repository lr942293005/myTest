package com.neusoft.object.answer.ex01;

public abstract class Teacher {
	String id;
	String name;
	String sex;
	int age;
	String education;
	String teacherTitle;
	
	public void startWork(int time) {
		System.out.println(this.name+time+"���ϰ�");
	}
	
	public void offWork(int time) {
		System.out.println(this.name+time+"���°�");
	}
	
	public void teach(String course) {
		System.out.println(this.name+"��"+course);
	}
	
	public abstract void teachProcedure();//public abstract��abstract public����
}

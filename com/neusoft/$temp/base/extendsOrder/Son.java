package com.neusoft.$temp.base.extendsOrder;

public class Son extends Parent{
	public static int age;
	public String name;
	static {
		System.out.println("����ľ�̬����� age:"+age);
		age = 100;
	}
	{
		System.out.println("�����ʵ�������name:"+name);
		name ="xiaoming";
	}
	public Son() {
		System.out.println("���๹����age:"+age);
		age =200;
	}
	public void test() {
		System.out.println("����name:"+name+" "+"age:"+age);
	}
	

	@Override
	public String toString() {
		return "Parent [name=" + name + "age=" + age + "]";
	}

}

package com.neusoft.object.answer;

public class TestStudent {

	public static void main(String[] args) {
		Student.age=20;
		Student stu = new Student("С��", "��");
		System.out.println(stu.toString());//ʵ������������toString�������ص����ַ�����ֱ�Ӵ�ӡ����
		stu.beginClass(stu.name);
		stu.endClass(stu.name);
		Student.age=21;
		Student stu1 = new Student("С��", "Ů");
		System.out.println(stu1.toString());
		stu1.beginClass(stu1.name);
		stu1.endClass(stu1.name);
	}

}

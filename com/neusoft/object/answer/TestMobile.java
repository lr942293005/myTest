package com.neusoft.object.answer;

public class TestMobile {

	public static void main(String[] args) {
		Mobile m = new Mobile("С��6",2500,2017);
		System.out.println("��ǰ�ֻ������");
		System.out.println(m.toString());
		m.gradeFail("С��6",2500,2017);
		System.out.println(m.toString());
		m.grade(m);
		System.out.println(m.toString());
	}

}

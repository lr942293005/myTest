package com.neusoft.object.answer;

public class Car {
	String brand;
	Car(){
		brand="����";
	}
	void init() {
		System.out.println("������ʼ������");
	}
	void breakCar() {
		System.out.println("������ʼɲ����");
	}
	void instrument(String a) {
		System.out.println("������Ʒ����"+a);
	}
}

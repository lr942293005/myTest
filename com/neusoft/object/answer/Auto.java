package com.neusoft.object.answer;

public class Auto {
	int tyreNum;
	String color;
	int weight;
	int speed;
	public Auto() {//����޲ι�������������̳�ʱ���÷ǵ����вι��췽��
		tyreNum = 4;
		color = "red";
		weight = 10;
		speed = 10;
	}
	public Auto(int tyreNum, String color, int weight, int speed) {
		this.tyreNum = tyreNum;
		this.color = color;
		this.weight = weight;
		this.speed = speed;
	}
	void speedUp() {
		System.out.println("���������ˣ�");
	}
	void speedDown() {
		System.out.println("���������ˣ�");
	}
	void stop() {
		System.out.println("����ͣ�ˣ�");
	}
}

package com.neusoft.object.answer;

public class Vehicle {
	int speed;
	int size;
	void move() {
		System.out.println("���������ƶ�");
	}
	int setSpeed(int speed) {
		this.speed=speed;
		return this.speed;
	}
	int setSize(int size) {
		this.size=size;
		return this.size;
	}
	void speedUp(){
		speed+=1;
		System.out.println("�������ٵ���"+speed);
	}
	void speedDown(){
		speed-=1;
		System.out.println("�������ٵ���"+speed);
	}
	public static void main(String[] args) {
		Vehicle ve = new Vehicle();
		int size=ve.setSize(8);
		System.out.println("���������Ϊ"+size);
		ve.move();
		int speed=ve.setSpeed(5);
		System.out.println("������ǰ�ٶ�Ϊ"+speed);
		ve.speedUp();
		ve.speedDown();
		ve.speedDown();
		ve.speedUp();
	}

}

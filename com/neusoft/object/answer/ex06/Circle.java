package com.neusoft.object.answer.ex06;

public class Circle implements Shape2D{
	double r;
	public void grith() {
		double grith=Shape2D.PI*2*r;
		System.out.println("Բ���ܳ�Ϊ��"+grith);
	}

	public void area() {
		double area=Shape2D.PI*r*r;
		System.out.println("Բ�����Ϊ��"+area);
	}

}

package com.neusoft.object.answer;

public class Circle {
	private double radius;
	Circle(){
		radius=0;
	}
	Circle(double r) {
		radius=r;
	}
	double getArea(double r) {
		double S=3.14*r*r;
		return S;
		}
	double getPerimeter(double r) {
		double C=2*3.14*r;
		return C;
	}
	void  show(double a,double b,double c) {
		System.out.println("Բ�İ뾶Ϊ��"+a);
		System.out.println("Բ���ܳ�Ϊ��"+b);
		System.out.println("Բ�����Ϊ��"+c);
	}
}

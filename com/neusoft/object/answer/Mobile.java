package com.neusoft.object.answer;

public class Mobile {
	String brand;
	int price;
	int year;
	public Mobile(String brand, int price, int year) {
		this.brand = brand;
		this.price = price;
		this.year = year;
	}
	@Override
	public String toString() {
		return "com.neusoft.java._200414object.Mobile [brand=" + brand + ", price=" + price + ", year=" + year + "]";
	}
	void gradeFail(String brand,int price,int year) {
		System.out.println("����ʧ���˵������");
		brand="С��8";
		price=3000;
		year=2018;
	}
	
	void grade(Mobile m) {
		System.out.println("�����ɹ��˵������");
		m.brand="С��8";
		m.price=3000;
		m.year=2018;
	}
}

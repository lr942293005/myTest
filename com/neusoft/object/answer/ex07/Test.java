package com.neusoft.object.answer.ex07;

import java.util.Scanner;

public class Test {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		ManageCar mc = new ManageCar();
		
		while(true) {
		init();
		String get=sc.nextLine();
		if(get.equals("1")) {
			mc.add(inputInfo());
		}else if(get.equals("2")) {
			System.out.println("������������ţ�");
			String a=sc.nextLine();
			mc.delete(a);
			System.out.println("ɾ�����ݳɹ���");
		}else if(get.equals("3")) {
			System.out.println("������������ţ�");
			String a=sc.nextLine();
			mc.update(a);
		}else if(get.equals("4")) {
			System.out.println("������������ţ�");
			String a=sc.nextLine();
			mc.query(a);
		}else if(get.equals("5")) {
			mc.queryAll();
		}else if(get.equals("0")) {
			break;
		}else {
			System.out.println("��������");
		}
		}
	}
	public static void init() {
		System.out.println("|---------------|");
		System.out.println("|-----1���� -----|");
		System.out.println("|-----2ɾ�� -----|");
		System.out.println("|-----3�޸� -----|");
		System.out.println("|-----4��ѯ -----|");
		System.out.println("|-----5��ȫ -----|");
		System.out.println("|-----0�˳� -----|");
		System.out.println("|---------------|");
		System.out.println("��ѡ��ҵ��");
	}
	public static Car inputInfo() {
		System.out.println("������������ţ�");
		String id=sc.nextLine();
		System.out.println("����������Ʒ�ƣ�");
		String brand=sc.nextLine();
		System.out.println("������������ɫ��");
		String color=sc.nextLine();
		System.out.println("�������㳵�۸�");
		int barePrice=sc.nextInt();
		sc.nextLine();
		System.out.println("��������������(A,B,C)��");
		String grade=sc.nextLine();
		System.out.println("����������������");
		Double disp=sc.nextDouble();
		sc.nextLine();
		if(grade.equals("A")||grade.equals("a")) {
			Car a = new Acar(id, brand, color, barePrice, grade, disp,0);
			a.drivePrice=a.calDrivePrice(barePrice);
			return a;
		}
		else if(grade.equals("B")||grade.equals("b")) {
			Car b = new Bcar(id, brand, color, barePrice, grade, disp,0);
			b.drivePrice=b.calDrivePrice(barePrice);
			return b;
		}
		else if(grade.equals("C")||grade.equals("c")) {
			Car c = new Ccar(id, brand, color, barePrice, grade, disp,0);
			c.drivePrice=c.calDrivePrice(barePrice);
			return c;
		}
		else {
			return null;
		}
	}
}

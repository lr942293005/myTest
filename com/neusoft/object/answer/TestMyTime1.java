package com.neusoft.object.answer;

import java.util.Scanner;

public class TestMyTime1 {

	public static void main(String[] args) {
		while(true) {
		System.out.println("---------ʱ����Ӽ���-----------");
		System.out.println("��ѡ�������1��  2��  0�˳�");
		Scanner sc=new Scanner(System.in);
		String get=sc.nextLine();
		if(get.equals("1")) {	
			System.out.println("�������һ��ʱ���루�Իس��ָ�����");
			MyTime1 mt = new MyTime1(sc.nextInt(),sc.nextInt(),sc.nextInt());
			System.out.println("��������Ҫ��ӵ�ʱ���루�Իس��ָ�����");
			mt.add(sc.nextInt(), sc.nextInt(), sc.nextInt());
			sc.nextLine();
			mt.display();
		}else if(get.equals("2")) {		
			System.out.println("�������һ��ʱ���루�Իس��ָ�����");
			MyTime1 mt = new MyTime1(sc.nextInt(),sc.nextInt(),sc.nextInt());
			System.out.println("��������Ҫ�����ʱ���루�Իس��ָ�����");
			mt.sub(sc.nextInt(), sc.nextInt(), sc.nextInt());
			sc.nextLine();
			mt.display();
		}else if(get.equals("0")) {		
			break;
		}else {
			System.out.println("�����ʽ����");
		}
		}
	}
}

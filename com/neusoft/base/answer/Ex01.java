package com.neusoft.base.answer;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		int i=0;
		while(i<1) {
		final double PI=3.14;
		System.out.print("1 ����  2������  3Բ\n��ѡ��ͼ�Σ�");
		Scanner sc = new Scanner(System.in);
		int get = sc.nextInt();
		 switch (get) {
		case 1:
			System.out.print("��������εĳ���");
			//Scanner sc1 = new Scanner(System.in);
			Float chang = sc.nextFloat();
			System.out.print("��������εĿ�");
			Float kuan = sc.nextFloat();
			System.out.println("�þ��ε����Ϊ��"+chang*kuan+"\n");
			break;
		case 2:
			System.out.print("�����������εĵ׳���");
			Float di = sc.nextFloat();
			System.out.print("��������εĸߣ�");
			Float gao = sc.nextFloat();
			System.out.println("�������ε����Ϊ��"+di*gao*0.5+"\n");
			break;
		case 3:
			System.out.print("������Բ�İ뾶��");
			Float radius = sc.nextFloat();
			System.out.println("��Բ�����Ϊ��"+PI*radius*radius+"\n");
			break;	
		default:
			System.out.println("���������������\n");
			break;
		}
		 System.out.print("�Ƿ�Ҫ������0����    1�˳�\n");
		 i = sc.nextInt();
	}
		}
}

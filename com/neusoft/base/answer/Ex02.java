package com.neusoft.base.answer;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		int i=0;
		while(i<1) {
		System.out.println("��������ʽ���������)");
		Scanner sc = new Scanner(System.in);
		Double fig1 = sc.nextDouble();
		String enter = sc.nextLine();
		String chara = sc.nextLine();
		Double fig2 = sc.nextDouble();
		switch (chara) {
		case "+":
			System.out.println("result="+(fig1+fig2)+"\n");
			break;
		case "-":
			System.out.println("result="+(fig1-fig2)+"\n");
			break;
		case "*":
			System.out.println("result="+(fig1*fig2)+"\n");
			break;
		case "/":
			if (fig2==0) {
				System.out.println("��������Ϊ0��\n");
				break;
			}
			System.out.println("result="+(fig1/fig2)+"\n");
			break;
		case "%":
			System.out.println("result="+(fig1%fig2)+"\n");
			break;
		default:
			System.out.println("������ķ�������\n");
			break;
		}
		System.out.print("�Ƿ�Ҫ������0����    1�˳�\n");
		 i = sc.nextInt();
	}
		
	}
}

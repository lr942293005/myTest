package com.neusoft.base.answer;

import java.util.Scanner;

public class Ex13 {
	/*2				24=22+2;
	22=2*10+2;		246=222+22+2;
	222=22*10+2;
	2222=222*10+2;*/
	public static void main(String[] args) {
		while (true) {
			System.out.print("������1~9����һ�����֣�");
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			/*���Ǵ��������
			int b = a * 10 + a;
			int c = a * 100 + b;
			int d = a * 1000 + c;
			int e = a * 10000 + d;
			System.out.println(a + "+" + b + "+" + c + "+" + d + "+" + e + "=" + (a + b + c + d + e)+"\n");*/
			int result=0;
			int b=a;//ʼ�ռӸ�2����1���������
			for(int i=1;i<=5;i++) {
				result+=a;//�ۼ�ȡ��
				a=a*10+b;//��a���иı䣬�����һ��
			}
			System.out.println(result+"\n");
		}
	}
}

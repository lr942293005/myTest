package com.neusoft.base.answer;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		while (true) {
			int m = 0;
			System.out.print("��������������");
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			int min;
			  if(a > b) {
			  min=b;
			  }else{
			  min=a;
			  }
			  for(int i=min;i>=1;i--){
			  if (a % i == 0 && b % i == 0) {
				  m=i;
				System.out.println(a + "��" + b + "�����Լ����" + m);
				break;	
					}
			  }
			  int beishu = (a / m) * (b / m) * m;
				System.out.println(a + "��" + b + "����С��������" + beishu+"\n");
/*			if (a < b) {
				for (int i = 1; i <= a; i++) {
					if (a % i == 0 && b % i == 0) {
						m = i;
					}
				}
				System.out.println(a + "��" + b + "�����Լ����" + m);
			} else if (a > b) {
				for (int i = 1; i <= b; i++) {
					if (a % i == 0 && b % i == 0) {
						m = i;
					}
				}
				System.out.println(a + "��" + b + "�����Լ����" + m);
			} else {
				m=a;
				System.out.println(a + "��" + b + "�����Լ����" + m);
			}
			int beishu = (a / m) * (b / m) * m;
			System.out.println(a + "��" + b + "����С��������" + beishu+"\n");*/
		}
	}
	}

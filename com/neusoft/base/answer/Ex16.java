package com.neusoft.base.answer;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		while(true) {
		System.out.println("����������������");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int temp=0;
		//��ab�н�С�ķ��ڵ�һλa��λ��
		if(a>b) {
			temp=a;
			a=b;
			b=temp;
		}
		//����С����c�Ƚϣ�����С�ķ��ڵ�һλa��λ��
		if(a>c) {
			temp=a;
			a=c;
			c=temp;
		}
		//��ʣ�µ����Ľ�С�ķ��ڵڶ�λb��λ��
		if(b>c) {
			temp=b;
			b=c;
			c=temp;
		}
		System.out.println("��С��������Ϊ��"+a+" "+b+" "+c);
/*		System.out.println("��С��������Ϊ��");
		if(a<=b&&a<=c) {
			System.out.println(a);
			if(b<=c) {
			System.out.println(b);
			System.out.println(c);
			}else if(c<=b) {
			System.out.println(c);
			System.out.println(b);
			}
		}else if(b<=a&&b<=c) {
			System.out.println(b);
			if(a<=c) {
			System.out.println(a);
			System.out.println(c);
			}else if(c<=a) {
			System.out.println(c);
			System.out.println(a);
			}
		}else if(c<=a&&c<=b) {
			System.out.println(c);
			if(b<=a) {
			System.out.println(b);
			System.out.println(a);
			}else if(a<=b) {
			System.out.println(a);
			System.out.println(b);
			}
		}*/
		}
	}

}

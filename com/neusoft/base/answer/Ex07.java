package com.neusoft.base.answer;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		int m = 0;
		while (m < 1) {
			int put = 1;
			System.out.print("������������n!");
			Scanner sc = new Scanner(System.in);
			int get = sc.nextInt();
			for (int i = 2; i <= get; i++) {
				put = put * i;
			}
			if (get <= 0) {
				System.out.println("�������ݲ��Ϸ���");
			} else {
				System.out.println("n!=" + put);
			}
			System.out.print("�Ƿ�Ҫ������0����    1�˳�\n");
			m = sc.nextInt();
		}
	}
}

package com.neusoft.base.answer;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		while(true) {
			double fee;
			System.out.print("������ʱ�䣨Ӣ��״̬������x:xx)��");
			Scanner sc = new Scanner(System.in);
			String get = sc.nextLine();
			System.out.print("��������루�����");
			Double dstc = sc.nextDouble();
			String[] a = get.split(":");
			int a0 = Integer.parseInt(a[0]);
			int a1 = Integer.parseInt(a[1]);
			if (a0 >= 24 || a0 < 0 || a1 >= 60 || a1 < 0) {
				System.out.println("�������ʱ���ʽ����ȷ��");
			}
			if (dstc <= 2) {
				if (a0 >= 6 && a0 <= 21) {
					fee = 7;
					System.out.println(fee);
				} else if((a0 >= 0 && a0 <= 5) || (a0 >= 22 && a0 <= 23)){
					fee = 8;
					System.out.println(fee);
				}
			} else if (dstc > 2) {
				if (a0 >= 6 && a0 <= 21) {
					fee = 7 + 1.5 * (dstc - 2);
					System.out.println(fee);
				} else if ((a0 >= 0 && a0 <= 5) || (a0 >= 22 && a0 <= 23)) {
					fee = 8 + 1.5 * (dstc - 2);
					System.out.println(fee);
				}
			}
	}
	}
}

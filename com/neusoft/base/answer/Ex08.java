package com.neusoft.base.answer;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		int m = 0;
		while (m < 1) {
			System.out.println("����һ����������");
			Scanner sc = new Scanner(System.in);
			int get = sc.nextInt();
			for (int i = 2; i <= get/2; i++) {
				if (get % i == 0) {
					System.out.println(get + "��������");
					get=0;
					break;
				}
			}
			if(get!=0) {
			System.out.println(get + "������");
			}
			/*�ڶ��ַ���
			int i;
			for (i = 2; i <= get/2; i++) {
				if (get % i == 0) {
					System.out.println(get + "��������");
					break;
				}
			}
			//����ѭ����i++һ�������get/2���������ҳ���������
			if(i>get/2) {
			System.out.println(get + "������");
			}*/
			System.out.print("�Ƿ�Ҫ������0����    1�˳�\n");
			m = sc.nextInt();
		}
	}
}

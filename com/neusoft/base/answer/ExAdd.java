package com.neusoft.base.answer;

import java.util.Scanner;

public class ExAdd {

	public static void main(String[] args) {
		int m = 0;
		while (m < 1) {
			System.out.println("====��ѡ��Ҫ�������Ʒ=====");
			System.out.println("====1.T��	=====");
			System.out.println("====2.�ֻ�	=====");
			System.out.println("====3.����	=====");
			Scanner sc = new Scanner(System.in);
			int get = sc.nextInt();
			if (get == 1) {
				System.out.println("====��ѡ��Ʒ��	  =====");
				System.out.println("====1.����	=====");
				System.out.println("====2.�Ϳ�	=====");
				System.out.println("====3.����	=====");
				int t_pinpai = sc.nextInt();
				if (t_pinpai == 1) {
					long adi_price = Math.round(300 * 0.95);
					System.out.println("====��ȷ�ϼ۸�	=====");
					System.out.println("====������İ�����T���۸�Ϊ��" + adi_price + "Ԫ=====");
				} else if (t_pinpai == 2) {
					long adi_price = Math.round(250 * 0.85);
					System.out.println("====��ȷ�ϼ۸�	=====");
					System.out.println("====��������Ϳ���T���۸�Ϊ��" + adi_price + "Ԫ=====");
				} else {
					long adi_price = Math.round(125 * 0.72);
					System.out.println("====��ȷ�ϼ۸�	=====");
					System.out.println("====�������������T���۸�Ϊ��" + adi_price + "Ԫ=====");
				}
			} else if (get == 2) {
				System.out.println("====��ѡ��Ʒ��	  =====");
				System.out.println("====1.ƻ��	=====");
				System.out.println("====2.С��	=====");
				System.out.println("====3.��Ϊ	=====");
				int p_pinpai = sc.nextInt();
				if (p_pinpai == 1) {
					long price1 = Math.round(6100 * 0.87);
					System.out.println("====��ȷ�ϼ۸�	=====");
					System.out.println("====�������ƻ�����ֻ��۸�Ϊ��" + price1 + "Ԫ=====");
				} else if (p_pinpai == 2) {
					long price1 = Math.round(899 * 0.92);
					System.out.println("====��ȷ�ϼ۸�	=====");
					System.out.println("====�������С�����ֻ��۸�Ϊ��" + price1 + "Ԫ=====");
				} else if (p_pinpai == 3) {
					long price1 = Math.round(1999 * 0.92);
					System.out.println("====��ȷ�ϼ۸�	=====");
					System.out.println("====������Ļ�Ϊ���ֻ��۸�Ϊ��" + price1 + "Ԫ=====");
				}
			} else {
				System.out.println("====��ѡ��Ʒ��	  =====");
				System.out.println("====1.����	=====");
				System.out.println("====2.����	=====");
				System.out.println("====3.��˶	=====");
				int c_pinpai = sc.nextInt();
				if (c_pinpai == 1) {
					long price1 = Math.round(8900 * 0.95);
					System.out.println("====��ȷ�ϼ۸�	=====");
					System.out.println("====������Ļ����Ƶ��Լ۸�Ϊ��" + price1 + "Ԫ=====");
				} else if (c_pinpai == 2) {
					long price1 = Math.round(4998 * 0.9);
					System.out.println("====��ȷ�ϼ۸�	=====");
					System.out.println("====������������Ƶ��Լ۸�Ϊ��" + price1 + "Ԫ=====");
				} else if (c_pinpai == 3) {
					long price1 = Math.round(4998 * 0.8);
					System.out.println("====��ȷ�ϼ۸�	=====");
					System.out.println("====������Ļ�˶�Ƶ��Լ۸�Ϊ��" + price1 + "Ԫ=====");
				}
			}
			System.out.println("====1.����	=====");
			System.out.println("====0.ȡ��	=====");
			int select = sc.nextInt();
			if (select == 1) {
				System.out.println("=====��ϲ������ɹ���====");
				System.out.println("�ݰݣ�");
				m = 1;
			} else {
				m = 0;
			}
		}
	}
}

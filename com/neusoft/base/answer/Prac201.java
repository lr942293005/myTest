/**
 * 1.�������������������Լ������С��������
 */
package com.neusoft.base.answer;

import java.util.Scanner;

public class Prac201 {

	public static void main(String[] args) {
		//��������Ĳ���
		Scanner sc = new Scanner(System.in);
		System.out.println("����������������");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int min = 0;
		//��Լ��  10  25
		if(a > b) {
			min = b;
		}else {
			min = a;
		}
		//ѭ������ÿһ�����ܳ�Ϊa��b��Լ��������ͨ��ȡ��ȷ���Ƿ�Լ��
		/*for(int i = min; i >= 1 ; i--) {
			if(a % i == 0 && b % i == 0) {
				System.out.println("a��b�����Լ�� Ϊ" + i);
				break;
			}
		}*/
		int temp = 0;//��ʱ���������ڼ�¼ȡ�õ������Լ��
		for (int i = 1; i <= min; i++) {
			if(a % i == 0 && b % i == 0) {
				temp = i;
				
				//System.out.println("a��b�����Լ�� Ϊ" + i);
				
			}
		}
		System.out.println("a��b�����Լ�� Ϊ" + temp);
		
		
		
		
		
		
	}

}

/**
 * 2.�� s=a+aa+aaa+aaaa+aaaaa��ֵ������a��һ�����֡����� 2+22+222+2222+22222 ����ʱ����5������ӣ�
 *  ��һ�� = ǰһ��*10 +a ��
 */
package com.neusoft.base.answer;

import java.util.Scanner;

public class Prac202 {

	public static void main(String[] args) {
		//��������Ĳ���
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��������");
		int a = sc.nextInt();
		int result = 0;//������¼����ı���
		int b = a;
		//ѭ�����
		// 2
		// 22 = 2*10 + 2     ȡ��һ��        24 =         22 + 2    ȡ��  
		//   222 = 22*10 + 2      246 =  222 + 22 + 2
		//  2222 = 222*10 +2 
		// ��Ϊ��һ����ӵ���  �� 0 + 2,����Ҫִ��5�����
		for(int i = 1 ; i <= 5 ;i++ ) {
			result += a;//result + a  ȡ��    �ȼ���a  
			a = a*10 + b; //����˵ڶ���
		}
		
		 // 1+2+3 +4 +5
		//  result = result + ��һ��
		
		
		
		
		
		
	}

}

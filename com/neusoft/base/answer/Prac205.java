/**
 * ������������xyz ������������С������������
 */
package com.neusoft.base.answer;

import java.util.Scanner;

public class Prac205 {

	public static void main(String[] args) {
		//�������������
		Scanner sc = new Scanner(System.in);
		System.out.println("����������������");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
	//	x= 3  y= 1  z=2
	//---> x=1 y=3 z=2
		
		int temp = 0;
		// ��һ���ж� x y��С  �Ƚ�С�ķ��ڵ�һλ
		if(x > y) {
			temp = x;
			x = y;
			y = temp;
		}
		// �ڶ��� �õ�һλ����Ƚ�С����ȥ����һ��û�в���Ƚϵ���ȥ�Ƚϵõ�3��������С����һ�����ڵ�һλ��
		// �����������жϵ�3�����е���Сֵ��
		if(x > z) {
			temp = z;
		    x = z;
		    z = temp;
		}
		//������  ��ʣ����������������бȽϣ��������ǵ�λ�á�
		if(y > z) {
			temp = z;
			y = z;
			z = temp;
		}
		
	}

}

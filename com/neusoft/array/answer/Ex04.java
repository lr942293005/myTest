package com.neusoft.array.answer;

import java.util.Scanner;

public class Ex04 {
	//ð�����򣺴ӵ�һ��Ԫ�ؿ�ʼ�����αȽ����ڵ�����Ԫ�أ������һ���ȵڶ�����
	//�ͽ���������������������ŵ���󣻵ڶ����ٴӵ�һ��Ԫ�����αȽϣ��ҳ��δ���
	//���ʣ�µ�һ��Ԫ�ز����ٱȽϣ���������Ϊ���鳤��arr.length-1��
	//�ȽϵĴ��� ��һ��ʱΪ���鳤��-1-0, �ڶ������ź������һ��Ԫ�رȽϴ����ֱȵ�һ����1
	//��������j<arr.length-1-i������������ÿ����һ�˾��ź�һ�������ٱȽ�һ��
	//�˳����޸�Ϊ�ɴ�С����
	public static void main(String[] args) {
		System.out.println("�������������Ԫ�ظ���Ϊ��");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int[] arr=new int[num];
		System.out.println("��������������Ԫ�أ�");
		for(int i=0;i<=num-1;i++) {
			arr[i]=sc.nextInt();
		}
		//���һ�������ñȣ����ü�=
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				//����������С��������͸�Ϊarr[j]>arr[j+1]
				if(arr[j]<arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		}
	}

}

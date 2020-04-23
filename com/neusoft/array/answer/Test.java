package com.neusoft.array.answer;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int[] arr = { 100, 200, 35, 80, 99, 200, 3, 17 };
		int m=0;
		System.out.print("��ǰ����Ϊ��");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		// Ѱ��������������Сֵ
		int max = arr[0];
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			// �Ƚ�֮��ȡ�ϴ��
			if (max < arr[i]) {
				max = arr[i];
			}			
			// �Ƚ�֮��ȡ��С��
			if (min > arr[i]) {
				min = arr[i];
			}			
		}
		System.out.println();
		System.out.println("max="+max);
		System.out.println("min="+min);
		
		/////////////////////////////////
		//�����������Ƿ����ĳԪ��
		while(m<1) {
		System.out.print("������һ�������в��ң�");
		Scanner sc = new Scanner(System.in);
		int get = sc.nextInt();
		boolean flag=false;//���ñ�־λ����û�����ĳ����
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]==get) {
				System.out.println("�����д����������");
				flag=true;
				break;
			}
		}
		if(flag==false) {
		System.out.println("�����в������������");
		}
		System.out.print("�Ƿ�Ҫ������0����    1�˳�");
		 m = sc.nextInt();
		}	

		///////////////////////////////////
		//���ֲ��ҷ�
		m=0;
		System.out.print("��������");
		//sort������ʹ���鱾�����ı�
		Arrays.sort(arr);
		for(int a:arr) {
			System.out.print(a+" ");
		}
		System.out.println();
		while(m<1) {
		System.out.print("������һ�������в��ң����ַ�����");
		Scanner sc = new Scanner(System.in);
		int get = sc.nextInt();
		int low = 0;
		int high = arr.length -1;
		boolean flag=false;
		
		while (low<=high) {      //ע���еȺ�
			int mid = (low+high)/2;
			if(arr[mid]==get) {
				System.out.println("�ҵ�����ͬ��Ԫ�أ�");
				flag=true;
				break;
			}
			if(arr[mid]<get) {
				low = mid+1;
			}
			if(arr[mid]>get) {
				high = mid-1;
			}			
		}
		if(flag==false) {
			System.out.println("û�ҵ���ͬ��Ԫ�أ�");
			}
		System.out.print("�Ƿ�Ҫ������0����    1�˳�");
		m = sc.nextInt();
		}
		
		
		///////////////////////////
		//binarySearch()����
		m=0;
		while(m<1) {
		System.out.print("������һ�������в��ң����ö��ַ�����");
		Scanner sc = new Scanner(System.in);
		int get = sc.nextInt();
		int a=Arrays.binarySearch(arr, get);
		if(a>=0) {
		System.out.println("����arr["+a+"]="+arr[a]);
		}else {
		System.out.println("û�ҵ���ͬ��Ԫ�أ�");
			}
		System.out.print("�Ƿ�Ҫ������0����    1�˳�");
		m = sc.nextInt();
		}
		
		
		////////////////////
		//copyOf()��copyOfRange()����
		System.out.print("�����ָ�����һ�������飡");
		int[] arrCopy1=Arrays.copyOf(arr, 4);
		//���鳤�ȴ���ԭ������Ĭ��ֵ���
		int[] arrCopy2=Arrays.copyOf(arr, 10);
		//����from������to
		int[] arrCopy3=Arrays.copyOfRange(arr, 2, 6);
		int[] arrCopy4=Arrays.copyOfRange(arr, 2, 10);
		System.out.println();
		System.out.println("ԭ����Ϊ��");
		for(int a:arr) {
			System.out.print(a+" ");
		}
		System.out.println();
		for(int a:arrCopy1) {
			System.out.print(a+" ");
		}
		System.out.println();
		for(int a:arrCopy2) {
			System.out.print(a+" ");
		}
		System.out.println();
		for(int a:arrCopy3) {
			System.out.print(a+" ");
		}
		System.out.println();
		for(int a:arrCopy4) {
			System.out.print(a+" ");
		}
		System.out.println();
		
		
		/////////////////////
		//equals()����
		boolean flag=false;
		flag=Arrays.equals(arr, arrCopy1);
		System.out.println("arr��arrCopy1����𣿣�"+flag);

		
		////////////////////////
		//fill()����
		Arrays.fill(arr, 2, 5, 20);
		System.out.println("���������Ϊ��");
		for(int a:arr) {
			System.out.print(a+" ");
		}
		
				
		/////////////////////////
		//toString()����
		String str=Arrays.toString(arr);
		System.out.println();
		System.out.println("������ת��Ϊ�ַ���Ϊ��"+str);
		//������Ϊ��[3, 17, 20, 20, 20, 100, 200, 200]
		//�޸�ʽ��������������·�ʽ��
		char[] ch= {'a','1','c'};
		String str1=new String(ch);
		System.out.println(str1);
		String str2=String.valueOf(ch);
		System.out.println(str2);
		//��ά���飺char[][] panelCopy=Arrays.copyOf(panel, panel.length);
		
		
		//////////////////////////
		//�������һ������
		System.out.println("��ǰ����Ϊ��");
		for(int a:arr) {
			System.out.print(a+" ");
		}
		int[] revArr=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			revArr[i]=arr[arr.length-i-1];
		}
		System.out.println();
		System.out.println("����ı�������Ϊ��");
		for(int a:revArr) {
			System.out.print(a+" ");
		}
	}
}


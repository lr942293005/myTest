package com.neusoft.freqclass.answer;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex08 {
	static int[] numSplit1;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("--------�����Ʊ---------");
		while(true) {
		System.out.println("���������֤�ţ�");
		String id=sc.nextLine();
		String idTest= "^[0-9]{17}[0-9|X]$";
		if(!id.matches(idTest)) {
				System.out.println("��������");
		}else {
			break;
			}
		}
		while(true) {
			System.out.println("������루����1-35��7�������Զ��ż������");
			String num=sc.nextLine();
			String numTest="^([1-9],|[1-9][0-9],){6}([1-9]|[1-9][0-9])$";
			if(!num.matches(numTest)) {				
					System.out.println("��������");
			}else {
				String[] numSplit=num.split(",", 7);
				numSplit1=new int[7];
				boolean flag=true;
				for(int i=0;i<numSplit.length;i++) {
					numSplit1[i]=Integer.parseInt(numSplit[i]);
					if(numSplit1[i]>35||numSplit1[i]<1) {
						flag=false;
						System.out.println("�������ֱ�������1-35");
						break;
					}
				}
				if(flag) {
				break;
				}
			}
		}
		System.out.println("--------��Ʊ����---------");
		int[] endNum=new int[7];
		System.out.println(Arrays.toString(endNum));
		Random rd=new Random();
		int time=0;
		for(int i=0;i<endNum.length;i++) {	
				endNum[i]=rd.nextInt(35)+1;
				for(int j=0;j<i;j++) {
					if(endNum[j]!=endNum[i]) {					
						continue;
					}else {
						endNum[i]=rd.nextInt(35)+1;
					}
				}
		}
		System.out.println(Arrays.toString(endNum));
		System.out.println("--------�ҽ���Ϣ---------");
		//�ж������������Ԫ�صĸ���
			for(int i=0;i<numSplit1.length;i++) {
				for(int j=0;j<endNum.length;j++) {
					if(numSplit1[i]==endNum[j]) {
						time++;
					}
				}
			}
		System.out.println("�н����ָ�����"+time);
		System.out.println("�н���"+2.5*time);
	}
}
